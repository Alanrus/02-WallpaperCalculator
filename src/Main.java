public class Main {
    public static void main(String[] args) {
        double roomLengthInMeters = 5;
        double roomWidthInMeters = 6;
        double roomPerimeter = (2 * roomLengthInMeters) + (2 * roomWidthInMeters);
        double rollWidthInMeters = 1.06;
        double rollQuantity = roomPerimeter / rollWidthInMeters;
        rollQuantity = Math.round(rollQuantity);
        double rollLengthInMeters = 10;
        double roomHeightInMeters = 2.75; // in meters
        roomHeightInMeters = roomHeightInMeters + 0.1;
        rollQuantity = rollQuantity / Math.floor((rollLengthInMeters / roomHeightInMeters));
        System.out.println("Вам потребуется " + Math.round(rollQuantity) + " рулонов шириной " + rollWidthInMeters + " м и длиной " + rollLengthInMeters + " м");
        System.out.println("Рекомендуем приобрести дополнительно 1-2 дополнительных рулона в запасе");
    }
}
