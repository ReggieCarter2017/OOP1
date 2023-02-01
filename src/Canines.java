public class Canines extends Animals {
    protected String coat;
    protected String isIll;


    public String getCoat()
    {
        return coat;
    }
    public String getIsIll()
    {
        return isIll;
    }


    public void animalSays()
    {
        System.out.println(getName() + " barks!");
    }

    public void animalWalks()
    {
        System.out.println(coat + "dog" + " runs towards you!");
    }

    public void showInfo()
    {
        System.out.printf("The dog's name is %s, he is %s years old %s. He has %s coat. He is %s.", getName(), getAge(), getGender(), getCoat(), getIsIll());
    }


    public Canines(String name, String age, String gender, String coat, String isIll) {
        setName(name);
        setAge(age);
        setGender(gender);
        this.coat = coat;
        this.isIll = isIll;
    }
}