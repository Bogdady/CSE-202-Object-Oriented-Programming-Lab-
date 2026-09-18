class Demo {
    static void checkAge(int age) {
        
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {
        
        checkAge(15);
    }
}