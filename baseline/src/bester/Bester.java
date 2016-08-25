package bester;

import java.util.ArrayList;

public class Bester {

    public static Rectangle findBest(ArrayList<Rectangle> rectangles) {

        Rectangle bestRectangle = new Rectangle(0, 0);
        for(Rectangle rectangle : rectangles){
            if(rectangle.isBetter(bestRectangle)){
                bestRectangle = rectangle;
            }
        }
        return  bestRectangle;
    }

    public static Cookie findBestCookie(ArrayList<Cookie> cookies) throws InvalidComparisonException {
        if(cookies.size() == 0){
            throw new InvalidComparisonException();
        }
        Cookie bestCookie = new Cookie(0);
        for(Cookie cookie : cookies){
            if(cookie.isBetter(bestCookie)){
                bestCookie = cookie;
            }
        }
        return bestCookie;
    }
}
