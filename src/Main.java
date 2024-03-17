import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double a, p, sonuc, yaricapd, acid;
        p = 3.14;
        Scanner yaricap = new Scanner(System.in);
        System.out.print("Yarıçap uzunluğunu giriniz(cm) : " );
        yaricapd = yaricap.nextDouble();
        Scanner aci = new Scanner(System.in);
        System.out.print("Açı derecesini giriniz : " );
        acid = aci.nextDouble();
        sonuc = (p*(yaricapd*yaricapd)*acid)/360;
        System.out.print("Sonuç : " +sonuc);
    }
}