package uap.models;
import uap.bases.CetakanDonat;

public class Sphere extends CetakanDonat {
private double r;
    public Sphere(double r) {
this.r = r;
}
@Override
    public double getVolume() {
      return (4.0 / 3) * (22.0 / 7) * Math.pow(r, 3);
    }
@Override
    public double getLuasPermukaan() {
      return 4 * (22.0 / 7) * Math.pow(r, 2);
    }
}

