import javax.swing.*;

public class Main {
    public static void main(String[] args){
        int x=1;
        int y=0;
        while (x<=100){
            y+=x;
            x++;}
        JOptionPane.showMessageDialog(null, "Сумма чисел от одного до ста: " + y);
        }
    }
