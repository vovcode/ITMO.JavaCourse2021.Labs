package Lessons.Lesson6;

import java.util.Arrays;

public class Lesson6 {
    public static void main(String[] args) {
        UserStatus active = UserStatus.ACTIVE;
        System.out.println(active.name());
        UserStatus blocked = UserStatus.valueOf("BLOCKED");
        System.out.println(blocked);
        UserStatus[] statuses = UserStatus.values();
        System.out.println(Arrays.toString(statuses));

        System.out.println(active.ordinal());
        System.out.println(UserStatus.BLOCKED.ordinal());

        System.out.println(active.equals(UserStatus.ACTIVE));
        System.out.println(active == UserStatus.ACTIVE);

        switch  (active){
            case ACTIVE -> System.out.println("active user");
            case BLOCKED-> System.out.println("blocked user");
            case UNKNOWN ->System.out.println("unknown user");
            default-> System.out.println("no such status");
        }
        for (UserStatus status : UserStatus.values()){
            System.out.println(status);
        }

    }
}

enum UserStatus{
    ACTIVE, BLOCKED, UNKNOWN
}
enum Season{
    SPRING, SUMMER, AUTUMN, WINTER, MIDWINTER;
}