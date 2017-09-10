package com.dg.wrappers.metrics;

import com.dg.wrappers.metrics.metrics.CountMetric;
import com.dg.wrappers.metrics.metrics.DurationMetric;
import com.dg.wrappers.metrics.metrics.GaugeMetric;
import com.dg.wrappers.metrics.metrics.TimeMetric;
import com.dg.wrappers.metrics.reporter.MetricsReporter;

/**
 * @author dima.golomozy
 */
public class MetricsMaker {
    private final MetricsReporter metricsReporter;

    public MetricsMaker(MetricsReporter metricsReporter) {
        this.metricsReporter = metricsReporter;
    }

    public TimeMetric getTimeMetric(String aspect) {
        return new TimeMetric(aspect, metricsReporter);
    }

    public GaugeMetric getGaugeMetric(String aspect) {
        return new GaugeMetric(aspect, metricsReporter);
    }

    public CountMetric getCountMetric(String aspect) {
        return new CountMetric(aspect, metricsReporter);
    }

    public DurationMetric getDurationMetric(String aspect) {
        return new DurationMetric(aspect, metricsReporter);
    }
}
