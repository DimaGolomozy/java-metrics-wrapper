package com.dg.wrappers.metrics.objects;

import com.dg.wrappers.metrics.reporters.MetricsReporter;

/**
 * @author dima.golomozy
 */
public class CountMetric extends BaseMetric {
    public CountMetric(String aspect, MetricsReporter metricsReporter) {
        super(aspect, metricsReporter);
    }

    public void count(long delta) {
        metricsReporter.count(aspect, delta);
    }

    public void increment() {
        count(1);
    }

    public void decrement() {
        count(-1);
    }
}
