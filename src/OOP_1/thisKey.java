package OOP_1;
// this key word
public class thisKey {
    String name;

    thisKey()
    {
        this.name=name;
    }

    public String changeName()
    {
        this.name="Harry";
        return name;
    }

    public static void main(String[] args)
    {
        thisKey tk = new thisKey();
        tk.changeName();
        System.out.println(tk.name);
    }
}
