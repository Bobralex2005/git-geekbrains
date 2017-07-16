/**
 * Created by HP on 13.07.2017.
 */
public class Person {
    private String lastname;
    private int telNumber;

    public Person(String lastname, int telNumber) {
        this.lastname = lastname;
        this.telNumber = telNumber;
    }
    @Override
    public int hashCode(){
        return lastname.hashCode();
    }

//    @Override
//    public boolean equals(){
//
//    }

//    public int get(String lastname){
//        return telNumber;
//    }

}
