package com.dg.wrappers.metrics.objects;

import com.dg.wrappers.metrics.reporter.MetricsReporter;

/**
 * @author dima.golomozy
 */
public class DurationMetric extends BaseMetric {
    private long start = 0;
    private long end = 0;

    public DurationMetric(String aspect, MetricsReporter metricsReporter) {
        super(aspect, metricsReporter);
    }

    private static void assertNotZero(long var, boolean isStartVar) {
        if (var == 0)
            throw new IllegalStateException("Duration metric already " + (isStartVar ? "started" : "stopped"));
    }

    public DurationMetric start() {
        assertNotZero(start, true);
        this.start = System.currentTimeMillis();
        return this;
    }

    public void stop() {
        assertNotZero(end, false);
        this.end = System.currentTimeMillis();
    }

    public void reportDuration() {
        metricsReporter.recordTime(aspect, getDuration());
    }

    public void stopAndReport() {
        stop();
        reportDuration();
    }

    public long getDuration() {
        return end - start;
    }
}
