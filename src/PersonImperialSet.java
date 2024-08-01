public class PersonImperialSet extends PersonSet {

    public void add(Person person){
        //    person.height = person.getHeight() / 2.54;
     //   9 = listOfPeople.getHeight();
    //    9 = person.getHeight();


        person.impHeight = person.impHeight / 2.54;
        person.impWeight = person.impWeight * 2.205;


        super.add(person);
    }

}
