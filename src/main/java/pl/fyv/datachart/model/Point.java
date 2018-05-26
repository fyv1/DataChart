package pl.fyv.datachart.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.scene.chart.XYChart;

import java.util.Date;

public class Point {

    private DoubleProperty value;
    private ObjectProperty<Date> year;

    Point(Double value, String year) {
         new XYChart.Data<>(year, value);

    }


}
