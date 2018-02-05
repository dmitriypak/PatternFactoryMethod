package ru.bmstu;

import ru.bmstu.interfaces.Figure;

public class Main {

    public static void main(String[] args) {
        Figure f1 = FigureSelect.getInstance().getFigure(FigureType.BOX);
        f1.draw2D();
        Figure f2 = FigureSelect.getInstance().getFigure(FigureType.ROUND);
        f2.draw3D();
        Figure f3 = FigureSelect.getInstance().getFigure(FigureType.TRIANGULAR);
        f3.draw3D();


    }
}
