

public class StringObjects{

    public static void main(String[] args) {
        
     System.out.println(binaryStringToInt("1111"));
     System.out.println(lowercaseWords("Some Text With Upper Case Words"));
    }


    public static int binaryStringToInt(String s) {
    int result = 0;

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);

        if (c != '0' && c != '1') {
            throw new IllegalArgumentException("String is not a valid binary number");
        }

        result = result * 2 + (c - '0'); 
    }

    return result;
    }


     public static String lowercaseWords(String input) {
        StringBuilder result = new StringBuilder();
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetter(c)) {
                // якщо літера — додаємо до поточного слова
                current.append(c);
            } else {
                // якщо символ не літера — слово закінчилося
                if (current.length() > 0) {
                    // зберігаємо слово в нижньому регістрі
                    result.append(current.toString().toLowerCase());
                    current.setLength(0);
                }

                // додаємо розділовий символ (цифру, пробіл, тощо)
                result.append(c);
            }
        }

        // додаємо останнє слово, якщо було
        if (current.length() > 0) {
            result.append(current.toString().toLowerCase());
        }

        return result.toString();
    }


}