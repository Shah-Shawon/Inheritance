package exercise_10_3;

public class Person  implements Measurable{
    private double height;
    private String name;

    public Person(double height, String name)
    {
        this.height = height;
        this.name = name;
    }

    @Override
    public double getMeasure()
    {
        return height;
    }

    public double getHeight()
    {
        return height;
    }

    public String getName()
    {
        return name;
    }
}
