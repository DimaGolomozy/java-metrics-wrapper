package com.dg.wrappers.metrics.objects;

import com.dg.wrappers.metrics.reporter.MetricsReporter;

/**
 * @author dima.golomozy
 */
public class TimeMetric extends BaseMetric {
    public TimeMetric(String metricName, MetricsReporter metricsReporter) {
        super(metricName, metricsReporter);
    }

    public void recordTime(String aspect, long timeInMs) {
        metricsReporter.recordTime(aspect, timeInMs);
    }
}
