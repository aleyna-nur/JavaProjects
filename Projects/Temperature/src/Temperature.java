import javax.swing.*;
import java.util.Scanner;

public class Temperature {

    public double ftemp;

    public Temperature(double ftemp){
        this.ftemp = ftemp;
    }

    public void setFahrenheit(double ftemp)
    {
        this.ftemp = ftemp;
    }

    public void setCelsius(double ctemp)
    {
        this.ftemp = toFahrenheit(ctemp);
    }

    public double toFahrenheit(double ctemp)
    {
        return ((double)9/5*(ctemp+32));
    }

    public double toFahrenheit()
    {
        return ftemp;
    }

    public double toCelsius()
    {
        return ((double)5/9*(ftemp-32));
    }

    public static void main(String[] args) {
        /*double ftemp;	// Holds temp in Fahrenheit
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit temperature:");
        ftemp = input.nextDouble();*/
        String girdi = JOptionPane.showInputDialog("Enter the Fahrenheit Value to be Converted: ");
        double input = Double.parseDouble(girdi);

        Temperature temp = new Temperature(input);

        JOptionPane.showMessageDialog(null,"Celsius Value : " + temp.toCelsius());
        temp.setFahrenheit(input);
        /*System.out.println("The temperature in Fahrenheit is " + temp.toFahrenheit());
        System.out.println("The temperature in Celsius is " + temp.toCelsius());*/
    }
}