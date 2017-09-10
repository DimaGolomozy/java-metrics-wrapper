package com.dg.wrappers.metrics.objects;

import com.dg.wrappers.metrics.reporter.MetricsReporter;

/**
 * @author dima.golomozy
 */
public abstract class BaseMetric {
    protected final MetricsReporter metricsReporter;
    protected final String aspect;

    protected BaseMetric(String aspect, MetricsReporter metricsReporter) {
        this.metricsReporter = metricsReporter;
        this.aspect = aspect;
    }
}
