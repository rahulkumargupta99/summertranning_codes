public class Student {
    String name;
    // int ID;
    int age;
    // char section;
    // String branch;
    void introduceYourself(){
    //     System.out.println("Hi my name is: " + name + " my ID is: " + ID +" my major is: "+ branch + " of section " + section + " my age is : "+ age);
    }
    //Default Constructor
    public Student(){
    }
    public Student(String name, int age){
        this.name=name;
        if(age>17)
            this.age=age;
            else{
                System.out.println("Wrong Input");
            }
        // this.age=age;
        // this.ID=ID;
        // this.section=section;
        // this.branch=branch;
        // try{
        //     if(age>17)
        //     this.age=age;
        //     else
        //     throw new Exception("wrong input");
        // }catch (Exception e){
        //     e.printStackTrace();
        //     // System.exit(0);
        // }finally{
        //     System.out.println("we can end our code ");
        // }
    }
}
