package ss0_On_luyen_code.bai_1;

import ss0_On_luyen_code.bai_1.MayTinhCasioFx500;
import ss0_On_luyen_code.bai_1.MayTinhVinacal500;
import ss0_On_luyen_code.bai_1.SapXepChen;
import ss0_On_luyen_code.bai_1.SapXepChon;

public class Test {
    public static void main(String[] args) {
        System.out.println("Test cau a : ");
       MayTinhCasioFx500 mfx500 = new MayTinhCasioFx500();
       MayTinhVinacal500 mvn500 = new MayTinhVinacal500();

        System.out.println(" 5 + 3 = " + mfx500.cong(5,3) );

        System.out.println(" 4 * 5 = " + mvn500.nhan(4,5));

        System.out.println(" 4 / 0 = " + mvn500.chia(4,0));

        System.out.println(" Test cau b :" );
        double[] arr = new double[] {5,1,3,4,5,8,0};
        double[] arr2 = new double[] {6,2,7,9,2,4,5};
        SapXepChen sxchen = new SapXepChen();
        SapXepChon sxchon = new SapXepChon();

        sxchen.SApXepTang(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        sxchon.SapXepGiam(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
    }
        System.out.println();
    }
}