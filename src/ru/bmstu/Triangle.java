package ru.bmstu;

import ru.bmstu.interfaces.Figure;

/**
 * Created by DP on 05.02.2018.
 */
public class Triangle implements Figure{
    @Override
    public void draw2D() {
        System.out.println("2d triangle");
    }

    @Override
    public void draw3D() {
        System.out.println("3d triangle");
    }
}
