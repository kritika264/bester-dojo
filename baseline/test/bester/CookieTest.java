package bester;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CookieTest {
    private Cookie cookie1;
    private Cookie cookie2;
    private Cookie cookie3;

    @Before
    public void setup(){
        cookie1 = new Cookie(5);
        cookie2 = new Cookie(2);
        cookie3 = new Cookie(1);
    }

    @Test
    public void shouldReturnTrueIfCookieOneIsBetterThanCookieTwo() throws Exception {
        assertTrue(cookie1.isBetter(cookie2));
    }

    @Test
    public void shouldReturnFalseIfCookieTwoIsBetterThanCookieOne() throws Exception {
        assertFalse(cookie2.isBetter(cookie1));
    }

    @Test
    public void shouldReturnBestCookieForOneCookie() throws InvalidComparisonException {
        ArrayList<Cookie> cookies = new ArrayList<>();
        cookies.add(cookie1);

        assertEquals(cookie1, Bester.findBestCookie(cookies));
    }

    @Test
    public void shouldReturnBestCookieForTwoCookie() throws InvalidComparisonException {
        Cookie cookie1 = new Cookie(5);
        Cookie cookie2 = new Cookie(10);
        ArrayList<Cookie> cookies = new ArrayList<>();
        cookies.add(cookie1);
        cookies.add(cookie2);

        assertEquals(cookie2, Bester.findBestCookie(cookies));
    }

    @Test
    public void shouldReturnTheBestCookieForThreeCookies() throws InvalidComparisonException {
        ArrayList<Cookie> cookies = new ArrayList<>();
        cookies.add(cookie2);
        cookies.add(cookie1);
        cookies.add(cookie3);

        assertEquals(cookie1, Bester.findBestCookie(cookies));
    }

    @Test(expected = InvalidComparisonException.class)
    public void shouldReturnTheBestCookieForNoCookieAsInput() throws InvalidComparisonException {
        ArrayList<Cookie> cookies = new ArrayList<>();
        Bester.findBestCookie(cookies);
    }
}
