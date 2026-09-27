public class IdnPhoneNumber {
    public static void main(String args[]) {
      System.out.println(convertToIdnNumber("082283635552"));
    }
    
    public static String convertToIdnNumber(String phoneNumber){
        if (phoneNumber == null || phoneNumber == "") {
        return "Phone number is empty";
    }
    if (phoneNumber.length() < 10) {
        return "Phone number minimum 10 characters";
    }
    if (phoneNumber.substring(0,1) == "0" && phoneNumber.substring(1,2) == "8") {
        return phoneNumber.replace("0", "+62");
    }
    if (phoneNumber.substring(0, 2) == "62") {
        return "+"+phoneNumber;
    }
    return phoneNumber;
    }
}
