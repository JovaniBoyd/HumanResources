public class Person implements Comparable<Person> {
    public String name;
    public double impHeight;
    public double impWeight;

// I have an earlier version where I had two int for weight and height, I had int for the normal values
//  and then used constructor overload to change to floating points without getting an error for the arraylists
// but to simplify everything, I decided to make all previous values into doubles. I can still go with the earlier method
// for a cleaner look and the metric values won't have decimals, it will require some meddling in the toString value

    public Person(String name, double impHeight, double impWeight) {
        this.name = name;
        this.impHeight = impHeight;
        this.impWeight = impWeight;
    }





  /*  class Person implements Comparable<Person> {
        String name;
        int height;
        int weight;
    }
*/


    public String getName() {
        return this.name;
    }

    public double getImpHeight() {
        return this.impHeight;
    }

    public double getImpWeight() {
        return this.impWeight;
    }

    //Equals method outline
    @Override
    public boolean equals(Object o) {
//if Object o is null then return false
        if (o == null) {
            return false;
        }
//if Object o == this then return true
        if (this == o) {
            return true;
        }
//if Object o is not an instance of Person then return false
        if (!(o instanceof Person)) {
            return false;
        }
//Declare a new variable of type Person (perhaps named p)
// and assign it to Object o cast as type Person
        Person p = (Person) o;
//if Person p has the same name, height, and weight as
        if (this.name.equals(p.name) && this.impWeight == p.impWeight && this.impWeight == p.impWeight) {//for string values .equals must be used instead of "==" took me forever to figure this out
            return true;
// this then return true
//else return false
        } else {
            return false;
        }
    }

    //   @Override
    public String toString() {

        return String.format("%-7s %-12s %-9s",this.name,this.impHeight,this.impWeight);
    }


    @Override
    public int compareTo(Person o) {//https://www.geeksforgeeks.org/comparable-interface-in-java-with-examples/
        // if the string are not equal
        if (this.name.compareTo(o.name) != 0) {
            return this.name.compareTo(o.name);//I still don't fully understand how this makes it alphabetical order, but it works
        }
        //      else if{ // removed this because we aren't comparing int
        // we compare int values
        // if the strings are equal
        //           return this.y - a.y;

        else {
            return 0;
        }
    }
}
