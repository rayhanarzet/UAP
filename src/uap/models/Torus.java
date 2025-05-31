package uap.models;
import uap.bases.CetakanDonat;

public class Torus extends CetakanDonat {
private double R; // radius besar
private double r; // radius kecil
    public Torus(double R, double r) {
    this.R = R;
    this.r = r;
}
@Override
public double getVolume() {
    return 2 * Math.pow(22.0 / 7, 2) * R * Math.pow(r, 2);
}
@Override
public double getLuasPermukaan() {
    return 4 * Math.pow(22.0 / 7, 2) * R * r;
    }
}
