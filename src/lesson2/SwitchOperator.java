package lesson2;

public class SwitchOperator {

    public static void main(String[] args) {
        String month = "May";
        int daysNumber = getNumberOfDaysInMonth(month);
        System.out.println(month + " has " + daysNumber + " days");
    }

    private static int getNumberOfDaysInMonth(String month) {
        switch (month) {
            case "January":
                return 30;
            case "February":
                return 28;
            case "Marh":
                return 28;
            case "April":
                return 30;
            case "May":
                return 31;
            case "June":
                return 30;
            case "July":
                return 31;
            case "August":
                return 31;
            case "September":
                return 30;
            case "October":
                return 30;
            case "November":
                return 30;
            case "Desember":
                return 31;
            default:
                return -1;
        }
    }
}
