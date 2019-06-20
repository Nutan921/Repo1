class Dog {
    int age;
    String name;

    void eat(){
        System.out.println(name +" is eating");
    }
    public static void main(String args[])
    {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.age = 13;
        dog1.name = "Bulldog";
        dog1.eat();
        dog1.age = 23;
        dog1.name = "Boxer";
        dog1.eat();
        dog1.age = 5;
        dog1.name = "Poddle";
        dog1.eat();
    }
}
