package exercises.technology;

public abstract class AbstractEntity {
    private int Id = 0;

    protected int generateId(){
        return Id ++;
    }
}
