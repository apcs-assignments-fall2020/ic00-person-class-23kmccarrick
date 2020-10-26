public class Person {
    public String firstName;
    public String lastName;
    public Person(String a, String b){
        this.firstName = a;
        this.lastName = b;
    }
    public void printPerson(){
        Person bruh = new Person("Rishi", "Reddy");
        System.out.println(bruh);
    }
    public void doSomething(){
        System.out.println("I am taking a nap");
    }
    public void setFirstName(String firstName){
        if(firstName.length()!=0)
            this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }

}













