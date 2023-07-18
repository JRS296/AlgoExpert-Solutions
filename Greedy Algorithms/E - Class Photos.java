import java.util.*;

class Program {

    public boolean classPhotos(ArrayList<Integer> red, ArrayList<Integer> blue) {
        Collections.sort(red);
        Collections.sort(blue);
        int diff = red.get(0) - blue.get(0);
        for (int i = 0; i < red.size(); i++) {
            if ((red.get(i) - blue.get(i)) * diff <= 0)
                return false;
        }
        return true;
    }
}
