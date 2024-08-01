import java.util.ArrayList;
import java.util.Collections;

public class PersonOrderedSet extends PersonSet{

    public void add(Person person){


        super.add(person);

        Collections.sort(getListOfPeople());
    }

}
