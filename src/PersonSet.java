import java.util.ArrayList;
import java.util.Collections;


public class PersonSet implements IPersonList{
    private ArrayList<Person> listOfPeople;
    private ArrayList<Person> listOfPeopleFromSource;
    //fill up the above in the constructor.


    public PersonSet(){
        this.listOfPeople = new ArrayList<>();
    }

    public void add(Person person){
            if (!(listOfPeople.contains(person))) {
                listOfPeople.add(person);
            }


   // /    Collections.sort(listOfPeople);


//the bellow code was me trying to remove duplicates, the problem turned out to be that the override wasn't written correctly (line 49 in Person class)
//I figured this out through trial and error so no source
   /*     System.out.println("here");
        if(listOfPeople.size() == 0)
        {
            listOfPeople.add(person);
            return;
        }
        for(int i=0; i < listOfPeopleFromSource.size(); i++){
            System.out.println("test " + i);
            boolean add = true;
            for(int j=0; j < listOfPeople.size(); j++ ){
                if(listOfPeopleFromSource.get(i) == listOfPeople.get(j)){
                    add = false;
                }
            }
            if(add){
                System.out.println(listOfPeopleFromSource.get(i).name);
                listOfPeople.add(person);
            }
        }
        boolean add = true;
        for (int i = 0; i <= listOfPeople.size()-1; i++) {
            System.out.println("test1");
        if(listOfPeople.get(i) == person){
            remove.listOfPeople.get(i);
            add = false;
        }
        if(add){

            System.out.println("test2");
        }
        }*/
    }

    public Person get(int input){
        //for(Person)
    return listOfPeople.get(input); // get method from here https://stackoverflow.com/questions/36997408/return-object-array-method
    }

    @Override
    public String toString() { //https://stackoverflow.com/questions/22158613/how-do-i-create-a-tostring-method-for-an-arraylist-of-objects
        String results = "";
        for (Person person: listOfPeople){
            results += person.toString() + "\n";
        }
        return results;
    //]    return this.listOfPeople;
    }

    public ArrayList<Person> getListOfPeople() {
        return listOfPeople;
    }
}
