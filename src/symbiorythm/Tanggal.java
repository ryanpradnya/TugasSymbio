/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package symbiorythm;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author april nf
 */
public class Tanggal {

    int jmlShift;
    int jumlahTgl[] = new int[jmlShift];

    public void validate(int tgl, int bln, int thn) {
        int jumlahHari;
        switch (bln) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                jumlahHari = 31;
                check(tgl, jumlahHari, bln, thn);
                break;
            case 2:
                jumlahHari = thn % 4 == 0 ? 29 : 28;
                check(tgl, jumlahHari, bln, thn);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                jumlahHari = 30;
                check(tgl, jumlahHari, bln, thn);
                break;
            default:
                System.out.println("Data tanggal yang Anda masukan salah");
        }
    }

    public int Hitungtanggal(int tgl, int bln, int thn) {

        return 0;
    }

    void check(int tgl, int jumlahHari, int bln, int thn) {
        try {
            assert (tgl <= jumlahHari || tgl > 0);
            if (tgl > jumlahHari || tgl < 0) {
                throw new CustomException("Input data tanggal salah");
            }
            Hitungtanggal(tgl, bln, thn);
        } catch (CustomException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tanggal tanggal = new Tanggal();
        int tgl, bln, thn, tglShift, blnShift, thnShift;
        tgl = in.nextInt();
        bln = in.nextInt();
        thn = in.nextInt();
        tanggal.validate(tgl, bln, thn);
    }
}
