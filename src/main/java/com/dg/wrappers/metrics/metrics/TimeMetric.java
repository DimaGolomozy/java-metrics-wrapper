package com.dg.wrappers.metrics.metrics;

import com.dg.wrappers.metrics.reporter.MetricsReporter;

/**
 * @author dima.golomozy
 */
public class TimeMetric extends BaseMetric {
    public TimeMetric(String metricName, MetricsReporter metricsReporter) {
        super(metricName, metricsReporter);
    }

    public void recordExecutionTime(String aspect, long timeInMs) {
        metricsReporter.recordExecutionTime(aspect, timeInMs);
    }
}
