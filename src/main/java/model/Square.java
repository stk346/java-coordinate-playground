package model;

import java.util.ArrayList;

public class Square {
    private static final String ONLY_RECTANGLE_MASSAGE = "직사각형만 연산이 가능합니다.";

    ArrayList<Point> squareList;
    Point pointA;
    Point pointB;
    Point pointC;
    Point pointD;

    public Square(String input) throws IllegalArgumentException{
        squareList.add(new Point(input.split("-")[0]));
        squareList.add(new Point(input.split("-")[1]));
        squareList.add(new Point(input.split("-")[2]));
        squareList.add(new Point(input.split("-")[3]));
        }
    }
}
