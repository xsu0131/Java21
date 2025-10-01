package Switch;

public class Main 
{
    public static void main(String[] args) 
    {
        // Java <= 7 
        // works with primitive types 
        // uses case and break
        int day = 3;
        switch (day)
        {
            case 1: System.out.println("Monday"); 
                    break;
            case 2: System.out.println("Tuesday"); 
                    break;
            case 3: System.out.println("Wednesday"); 
                    break;
            default: System.out.println("Invalid");
        }

        // Java 7+
        // witch with Strings
        String lang = "Java";
        switch (lang)
        {
            case "Java": System.out.println("OOP"); 
                break;
            case "Python": System.out.println("Dynamic"); 
                break;
            default: System.out.println("Unknown");
        }

        // switch with enums
        enum level{
            LOW, MEDIUM, HIGH
        }

        level lvl = level.HIGH;

        switch (lvl)
        {
            case LOW: System.out.println("Low"); 
                break;
            case MEDIUM: System.out.println("Medium"); 
                break;
            case HIGH: System.out.println("High"); 
                break;
        }

        // Better syntax switch expression (Java 12 - Java 14 (finished))
        int day2 = 2;
        String result = switch (day2) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid";
        };
        System.out.println(result); // Tuesday

        // multi-line with yield
        int n = 5;
        String msg = switch (n) 
        {
            case 1, 2 -> "Small";
            case 3, 4, 5 -> {
                System.out.println("Handling case 3-5");
                yield "Medium";
            }
            default -> "Large";
        };
        System.out.println(msg);

        // Pattern Matching for Switch (Java 17 - Java 21 (finished))
        



    }
}
