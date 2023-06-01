public enum DayOfWeek {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    private int number;

    private DayOfWeek(int number) {
        this.number = number;
    }

    public static DayOfWeek getDayOfWeek(int number) {
        switch (number) {
            case 1:
                return DayOfWeek.SUNDAY;
            case 2:
                return DayOfWeek.MONDAY;
            case 3:
                return DayOfWeek.TUESDAY;
            case 4:
                return DayOfWeek.WEDNESDAY;
            case 5:
                return DayOfWeek.THURSDAY;
            case 6:
                return DayOfWeek.FRIDAY;
            case 7:
                return DayOfWeek.SATURDAY;
            default:
                return null;
        }
    }

    public static void printDayOfWeek(int number) {
        DayOfWeek dayOfWeek = getDayOfWeek(number);

        if (dayOfWeek != null) {
            System.out.println("The corresponding day of the week is: " + dayOfWeek);
        } else {
            System.out.println("Invalid input! Please enter a number between 1 and 7");
        }
    }
}
