import java.util.ArrayList;

public class PrimeFactor {

    public Object of(int number) {
        ArrayList<Integer> factor = new ArrayList<>();
        if (number > 1) {
            if (number == 4) {
                while (number % 2 == 0) {
                    if (number % 2 == 0) {
                        factor.add(2);
                        number /= 2;
                    }
                }
            } else if (number == 6) {
                while (number % 2 == 0) {
                    factor.add(2);
                    number /= 2;
                }
                while (number % 3 == 0) {
                    factor.add(3);
                    number /= 3;
                }
            } else {
                factor.add(number);
            }
        }
        return factor;
    }
}
