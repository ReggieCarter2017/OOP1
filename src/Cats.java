class Cats extends Animals {
    private String eyesColor = "";
    private String hasPaws = "";

    public String getEyes()
    {
        return eyesColor;
    }
    public String getPaws()
    {
        return hasPaws;
    }

    public void animalSays()
    {
        System.out.println(getName() + " meows!");
    }

    public void animalWalks()
    {
        System.out.println("Cat quickly runs up to you!");
    }

    public void showInfo()
    {
        System.out.printf("The cat's name is %s, he is %s years old %s. He has %s eyes, and %s", getName(), getAge(), getGender(), getEyes(), getPaws());
    }

    public Cats(String name, String age, String gender, String eyes, String paws) {
        setName(name);
        setAge(age);
        setGender(gender);
        this.eyesColor = eyes;
        this.hasPaws = paws;
    }
}
