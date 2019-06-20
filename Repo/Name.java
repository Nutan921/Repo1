class Name {
    String name;
    void print_name()
    {
        System.out.println("Hello World " + name);
    }

    public static void main(String args[])
    {
        Name n = new Name();
        n.name="Nutan";
        n.print_name();
    }
}
