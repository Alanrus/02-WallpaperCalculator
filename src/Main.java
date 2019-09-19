public class Main {
    public static void main(String[] args) {
        double roomLengthInMeters = 5;
        double roomWidthInMeters = 6;
        double roomPerimeter = (2 * roomLengthInMeters) + (2 * roomWidthInMeters);
        double rollWidthInMeters = 1.06;
        double rollQuantity = Math.round(roomPerimeter / rollWidthInMeters);
        double rollLengthInMeters = 10;
        double increaseRoomHeightInMeters = 0.1;
        double roomHeightInMeters = 2.75;
        roomHeightInMeters = roomHeightInMeters + increaseRoomHeightInMeters;
        rollQuantity = rollQuantity / Math.floor((rollLengthInMeters / roomHeightInMeters));
        System.out.println("Вам потребуется " + Math.round(rollQuantity) + " рулонов шириной " + rollWidthInMeters + " м и длиной " + rollLengthInMeters + " м");
        System.out.println("Рекомендуем приобрести дополнительно 1-2 дополнительных рулона в запасе");
    }
}
