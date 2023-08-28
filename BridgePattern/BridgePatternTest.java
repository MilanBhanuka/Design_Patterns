package BridgePattern;

import BridgePattern.GreenColor;
import BridgePattern.Pentagon;
import BridgePattern.RedColor;
import BridgePattern.Shape;
import BridgePattern.Triangle;

public class BridgePatternTest {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
