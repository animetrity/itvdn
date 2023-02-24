package java_3_Essential.lesson_4.task_5;

public class ConverterTemperatureFahrenheit extends ConverterTemperature{
    @Override
    void convert(double value) {

        super.convert(value * 9 / 5 + 32);
    }
}
