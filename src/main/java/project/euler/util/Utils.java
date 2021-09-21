package project.euler.util;

import java.time.Duration;

public final class Utils {

    private Utils() {
        // Utility class
    }

    public static void ellapsedTime(long n, Runnable r) {
        long s = System.nanoTime();

        r.run();

        Duration d = Duration.ofNanos(System.nanoTime() - s);

        System.out.println(
                String.format(
                        "(n = %10d, t = %10dn / %5dms / %3dsec / %2dmin)",
                        n,
                        d.toNanos(),
                        d.toMillis(),
                        d.toSeconds(),
                        d.toMinutes()));
    }

}
