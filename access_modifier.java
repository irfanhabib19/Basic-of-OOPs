public class access_modifier{
    
    private int privateVariable;
    int defaultVariable;
    protected int protectedVariable;

    
    public int publicVariable;

    public access_modifier(int privateVar, int defaultVar, int protectedVar, int publicVar) {
        this.privateVariable = privateVar;
        this.defaultVariable = defaultVar;
        this.protectedVariable = protectedVar;
        this.publicVariable = publicVar;
    }

    private void privateMethod() {
        System.out.println("Private method: " + privateVariable);
    }

    
    void defaultMethod() {
        System.out.println("Default method: " + defaultVariable);
    }

    protected void protectedMethod() {
        System.out.println("Protected method: " + protectedVariable);
    }

    
    public void publicMethod() {
        System.out.println("Public method: " + publicVariable);
        // Demonstrating calling private method within the class
        privateMethod();
    }

    
    public static void main(String[] args) {
        access_modifire example = new access_modifire(1, 2, 3, 4);

        
        System.out.println("Accessing all variables:");
        System.out.println("Private variable: " + example.privateVariable); // This will work because we're inside the same class
        System.out.println("Default variable: " + example.defaultVariable);
        System.out.println("Protected variable: " + example.protectedVariable);
        System.out.println("Public variable: " + example.publicVariable);

        
        System.out.println("\nCalling all methods:");
        example.privateMethod();   // This will work because we're inside the same class
        example.defaultMethod();
        example.protectedMethod();
        example.publicMethod();
    }
}
