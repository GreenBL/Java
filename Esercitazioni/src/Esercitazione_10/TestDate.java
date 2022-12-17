package bin.es10;

public class TestDate {
    public static void main(String[] args) {
        // Gives IllegalArgumentException
        try {
            Date data = new Date(29, 2, 1972);
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
            try {
                Date data2 = new Date(31, 13, 1992);
            }
            catch (IllegalArgumentException ex) {
                ex.printStackTrace();
                try {
                Date data3 = new Date(1, 1, 1521);
                }
                catch (IllegalArgumentException exc) {
                    exc.printStackTrace();
                }
            }
        }
    }
}