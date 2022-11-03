public class CodeupCrypt {

    public static int version;

    public static String hashPassword(String password) {
        String hash = "";
        String[] substrings = password.split("");
        for (String ch : substrings){
            if(ch.contains("A") || ch.contains("a")){
                    hash += 4;
            } else if (ch.contains("E") || ch.contains("e")){

                hash += 3;
            } else if (ch.contains("I") || ch.contains("i")) {
                hash += 1;
            } else if (ch.contains("O") || ch.contains("o")) {
                hash += 0;
            } else if (ch.contains("U") || ch.contains("u")) {
                hash += 9;
            } else{
                hash += ch;
            }
        }
        return hash;
    }

    public static boolean checkPassword(String pass, String hash) {
        return hash.equals(hashPassword(pass));
    }
    
}
