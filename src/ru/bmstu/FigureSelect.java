package ru.bmstu;

import ru.bmstu.interfaces.Figure;

/**
 * Created by DP on 05.02.2018.
 * Фабричный метод, который создает нужную геометрическую фигуру
 */
public class FigureSelect {
    private static FigureSelect instance;

    public static FigureSelect getInstance(){
        if(instance==null){
            instance = new FigureSelect();
        }
        return instance;
    }

    public FigureSelect() {
    }

    public Figure getFigure(FigureType figureType){
        Figure figure = null;
        switch (figureType){
            case ROUND:
                figure = new Circle();
                break;
            case BOX:
                figure = new Square();
                break;
            case TRIANGULAR:
                figure = new Triangle();
                break;

        }
        return figure;

    }

    public void print(){
        System.out.println("instance = " + this);
    }
}
