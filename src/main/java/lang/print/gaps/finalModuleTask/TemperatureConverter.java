package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float fahrenheit =temperatureCelsius*9/5+32;
        System.out.println(fahrenheit);
    }
    public static void main(String[] args){
        TemperatureConverter converter= new TemperatureConverter();
        int temperatureCelsius=32;
        converter.toFahrenheit(temperatureCelsius);
} 
}
