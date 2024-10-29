package io.sdal.utility;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class TimeUtil {

    private static final ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();

    public static void timeMethod(Runnable method) {
        if (!threadMXBean.isCurrentThreadCpuTimeSupported()) {
            throw new UnsupportedOperationException("CPU timing is not supported by this JVM.");
        }

        long startTime = threadMXBean.getCurrentThreadCpuTime();
        method.run();
        long endTime = threadMXBean.getCurrentThreadCpuTime();

        double runningTime = (endTime - startTime) / 1e6;

        System.out.println("메소드 실행 시간: " + runningTime + " ms");
    }
}
