public class FrontTimes {

    public String printFrontTimes(String str, int n) {
        String result = "";
        int length = str.length();
        for(int i = 0; i < n; i++) {
            if(length < 3) {
                result += str.substring(0, length);
            } else {
                result += str.substring(0, 3);
            }
        }
        return result;
    }

}
