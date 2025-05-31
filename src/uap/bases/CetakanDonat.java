package uap.bases;

public abstract class CetakanDonat {
    protected static final double PI = 22.0/7.0;
    protected double massaJenis = 8;
public abstract double getVolume();
public abstract double getLuasPermukaan();
public double getMassa() {
  return getLuasPermukaan() * 0.5 * massaJenis;
} 
public int getMassaKg() {
  return (int) Math.ceil(getMassa() / 1000);
  }
public int getBiayaKirim() {
  return getMassaKg() * 5000;
}
public void printInfo() {
System.out.printf("Volume: %.2f\n", getVolume());
System.out.printf("Luas permukaan: %.2f\n", getLuasPermukaan());
System.out.printf("Massa: %.2f\n", getMassa());
System.out.printf("Massa dalam kg: %d\n", getMassaKg());
System.out.printf("Biaya kirim: Rp%d\n", getBiayaKirim());
    }
} 
