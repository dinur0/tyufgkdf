

public class InvalidERROR extends Exception{

    public static void checkValues(String surname, String name, String middle_name, String date_of_birth, String phone, String gender) throws Exception {
        if (checkToDigit(surname)) {
            throw new Exception("Некорректная фамилия");
        }
        if (checkToDigit(name)) {
            throw new Exception("Некорректное имя");
        }
        if (checkToDigit(middle_name)) {
            throw new Exception("Некорректное отчество");
        }
        /* Не смог продумать проверку даты*/

        // String[] temp = date_of_birth.split(".");
        // if ((parseInt(temp[0])==false) || (Integer.parseInt(temp[1])==false) || (Integer.parseInt(temp[2])==false)) {
        // }  
        
        if (!checkToAllDigit(phone)) {
            throw new Exception("Некорректный номер");
        }
        if (gender != "f" && gender != "m") {
            throw new Exception("Укажите корректный пол: f или m");
        }
        } 


    public static boolean checkToDigit(String value){
        boolean hasDigits = false;
        for(int i = 0; i < value.length() && !hasDigits; i++) {
            if(Character.isDigit(value.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkToAllDigit(String value){
        boolean isOnlyDigits = true;
        for(int i = 0; i < value.length() && isOnlyDigits; i++) {
            if(!Character.isDigit(value.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
