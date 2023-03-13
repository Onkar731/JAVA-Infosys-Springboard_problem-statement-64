public class DoubleExists {
    public static boolean isDoubleExists(int []numbers) {
        boolean status = false;
    
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if((numbers[i] == numbers[j]/2) || (numbers[i]*2 == numbers[j])) {
                    status = true;
                    break;
                }
            }
        }
    
        return status;
    }
}