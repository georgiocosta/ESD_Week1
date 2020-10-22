public class Triangle {
    private int[] sides = new int [3];
    
    Triangle(int side1, int side2, int side3) {
        sides[0] = side1;
        sides[1] = side2;
        sides[2] = side3;
    }
    
    public String calculateType() {
        int equalSides = 0;
        
        for(int i = 0; i < 3; i++) {
            int side_A = sides[i];
            for(int j = i; j < 3; j++) {
                if(i == j)
                    continue;
                
                if(side_A == sides[j]) {
                    equalSides += 1;
                }
            }
        }
        
        if(equalSides == 0) {
            return "Scalene";
        }
        else if(equalSides == 1) {
            return "Isoceles";
        }
        else if(equalSides == 3) {
            return "Equilateral";
        }
        else {
            return "Invalid triangle";
        }
    }
}
