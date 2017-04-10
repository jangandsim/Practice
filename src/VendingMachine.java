import java.util.Random;

public class VendingMachine {
    private static double totalSales = 0;
    private VendingItem[][][] grid = new VendingItem[6][3][5];
    private int freeChance = 0;
    private Random rand = new Random();
   
    
    public VendingMachine() {
        
        restock();
    }
    
    public VendingItem vend(String code) {
        if (code.length() != 2) {
            System.out.println("This code is not a valid code");
            return null;
        }
        int rows = code.charAt(0) - 'A';
        int col = code.charAt(1) - '1';
        
        if ( rows < 0 || rows > 5 || col < 0 || col > 2) {
            System.out.println("This code is not a valid code");
            return null;
        } else if (grid[rows][col][0] == null) {
            System.out.println("This is empty one");
            return null;
        } else {
            VendingItem out = grid[rows][col][0];
            if (free()) {
                System.out.println("Congrats, You got it for free !");
            } else {
                totalSales += out.getPrice();
            }
            for (int i = 0; i < 4; i++) {
                grid[rows][col][i] = grid[rows][col][i+1]; 
            }
            grid[rows][col][4] = null;
            return out;
        }
    }
    
    private boolean free() {
        if (rand.nextInt(2) + 1 <= freeChance) {
            freeChance = 0;
            return true;
        } else {
            freeChance ++;
            return false;
        }
    }
    
    public void restock() {
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 3; j++) {
                for (int k = 0; k < 5; k++) {
                    int ranpick = new Random().nextInt(VendingItem.values().length);
                    if (grid[i][j][k] == null) {
                        grid[i][j][k] = VendingItem.values()[ranpick];
                    }
                }
            }
        }
    }
    
    public static double getTotalSales() {
        return totalSales;
    }
    
    public int getNumberOfItems() {
        int count = 0;
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 3; j++) {
                for (int k = 0; k < 5; k++) {
                    if (grid[i][j][k] != null) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    
    public double getTotalValue() {
        double totalsum = 0;
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 3; j++) {
                for (int k = 0; k < 5; k++) {
                    if(grid[i][j][k] != null) {
                        totalsum += grid[i][j][k].getPrice();
                    }
                }
            }
        }
        return totalsum;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("----------------------------------------------------------"
            + "------------\n");
        s.append("                            VendaTron 9000                "
            + "            \n");
        for (int i = 0; i < grid.length; i++) {
            s.append("------------------------------------------------------"
                + "----------------\n");
            for (int j = 0; j < grid[0].length; j++) {
                VendingItem item = grid[i][j][0];
                String str = String.format("| %-20s ",
                    (item == null ? "(empty)" : item.name()));
                s.append(str);
            }
            s.append("|\n");
        }
        s.append("----------------------------------------------------------"
            + "------------\n");
        s.append(String.format("There are %d items with a total "
            + "value of $%.2f.%n", getNumberOfItems(), getTotalValue()));
        s.append(String.format("Total sales across vending machines "
            + "is now: $%.2f.%n", getTotalSales()));
        return s.toString();
    }
}
