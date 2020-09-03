/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Color;
import java.awt.Paint;
import org.jfree.chart.renderer.category.BarRenderer;


/**
 *
 * @author Zehra Mahmood - w1681624
 *
 */
//Zehra Mahmood
public class CustomRenderer extends BarRenderer {

    //initialize colors variable
    private final Paint[] colors;
    //constructor
    public CustomRenderer(final Paint[] colors) {
        this.colors = colors;
    }

    //getItemPaint Method
    @Override
    public Paint getItemPaint(final int row, final int column) {
        //set bar colors using if else
        switch (column) {
            case 0:
                return Color.blue;
            case 1:
                return Color.CYAN;
            case 2:
                return Color.DARK_GRAY;
            case 3:
                return Color.GRAY;
            case 4:
                return Color.MAGENTA;
            case 5:
                return Color.PINK;
            case 6:
                return Color.ORANGE;
            case 7:
                return Color.YELLOW;
            case 8:
                return Color.white;
            case 9:
                return Color.CYAN;
            case 10:
                return Color.DARK_GRAY;
            case 11:
                return Color.GRAY;
            case 12:
                return Color.MAGENTA;
            case 13:
                return Color.PINK;
            case 14:
                return Color.ORANGE;
            case 15:
                return Color.YELLOW;
            case 16:
                return Color.white;
            case 17:
                return Color.MAGENTA;
            case 18:
                return Color.PINK;
            default:
                return Color.RED;
        }
   }
}
