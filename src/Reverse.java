import java.util.ArrayList;
public class Reverse<T> extends ArrayList<T> {

    public ArrayList<T> reverse(ArrayList<T> arrayOriginal) {
        ArrayList<T> revArrayList = new ArrayList<>();
        for (int i = arrayOriginal.size() - 1; i >= 0; i--) {
            revArrayList.add(arrayOriginal.get(i));
        }
        return revArrayList;
    }
}
