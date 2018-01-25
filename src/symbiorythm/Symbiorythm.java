/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package symbiorythm;

/**
 *
 * @author april nf
 */
public class Symbiorythm extends Tanggal{

    double fisik, emosional, intelektual;

    /**
     * @param args the command line arguments
     */
    public double Fisik(int hari) {
        fisik = Math.sin((2 * Math.PI * hari) / 23);
        return fisik;
    }

    public double Emosional(int hari) {
        emosional = Math.sin((2 * Math.PI * hari) / 28);
        return emosional;
    }

    public double Intelektual(int hari) {
        intelektual = Math.sin((2 * Math.PI * hari) / 33);
        return intelektual;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
}
