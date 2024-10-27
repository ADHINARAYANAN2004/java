package Operators.Logicalopertor;

public c {
    public static void main(String[] args) {
        boolean isSunny = true;
        boolean hasUmbrella = false;
        
        // XOR: Exactly one of these should be true
        if (isSunny ^ hasUmbrella) {
            System.out.println("Good to go outside");
        } else {
            System.out.println("Either both are true or both are false");
        }
    }
}
