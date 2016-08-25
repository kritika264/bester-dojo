package bester;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CookieTest {

    @Test
    public void shouldReturnTrueIfCookieOneIsBetterThanCookieTwo() throws Exception {
        Cookie cookie1 = new Cookie(5);
        Cookie cookie2 = new Cookie(2);

        assertTrue(cookie1.isBetter(cookie2));

    }

    @Test
    public void shouldReturnFalseIfCookieTwoIsBetterThanCookieOne() throws Exception {
        Cookie cookie1 = new Cookie(5);
        Cookie cookie2 = new Cookie(10);

        assertFalse(cookie1.isBetter(cookie2));

    }

    @Test
    public void shouldReturnBestCookieForOneCookie() throws InvalidComparisonException {
        Cookie cookie = new Cookie(5);
        ArrayList<Cookie> cookies = new ArrayList<>();
        cookies.add(cookie);

        assertEquals(cookie,Bester.findBestCookie(cookies));

    }
    @Test
    public void shouldReturnBestCookieForTwoCookie() throws InvalidComparisonException {
        Cookie cookie1 = new Cookie(5);
        Cookie cookie2 = new Cookie(10);
        ArrayList<Cookie> cookies = new ArrayList<>();
        cookies.add(cookie1);
        cookies.add(cookie2);

        assertEquals(cookie2,Bester.findBestCookie(cookies));
    }

    @Test
    public void shouldReturnTheBestCookieForThreeCookies() throws InvalidComparisonException {
        Cookie cookie1 = new Cookie(2);
        Cookie cookie2 = new Cookie(5);
        Cookie cookie3 = new Cookie(1);
        ArrayList<Cookie> cookies = new ArrayList<>();
        cookies.add(cookie1);
        cookies.add(cookie2);
        cookies.add(cookie3);

        assertEquals(cookie2,Bester.findBestCookie(cookies));
    }
    @Test(expected = InvalidComparisonException.class)
    public void shouldReturnTheBestCookieForNoCookieAsInput() throws InvalidComparisonException {
        ArrayList<Cookie> cookies = new ArrayList<>();
        Bester.findBestCookie(cookies);
    }
}
