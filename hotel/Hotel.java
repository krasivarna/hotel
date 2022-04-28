package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private int capacity;
    private List<Person> roster;

    public Hotel(String name,int capacity){
        this.name=name;
        this.capacity=capacity;
        this.roster=new ArrayList<>();
    }

    public void add(Person person){
        if (capacity>roster.size()){
            roster.add(person);
        }
    }

    public int getCount(){
        return roster.size();
    }

    public boolean remove(String name){
        int index=-1;
        for(int i=0;i<roster.size();i++){
            if (roster.get(i).getName().equals(name)){
                index=i;
            }
        }
        if (index!=-1){
            roster.remove(index);
            return true;
        } else {
            return false;
        }
    }

    public Person getPerson(String name,String hometown){
        int index=-1;
        for(int i=0;i<roster.size();i++){
            if (roster.get(i).getName().equals(name) &&
                roster.get(i).getHometown().equals(hometown)){
                index=i;
            }
        }
        if (index!=-1){
            return roster.get(index);
        } else {
            return null;
        }
    }

    public String getStatistics(){
        StringBuilder sb=new StringBuilder();
        sb.append("The people in the hotel " + name + " are:");
        sb.append(System.lineSeparator());
        for(Person one:roster){
            sb.append(one);
            sb.append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
