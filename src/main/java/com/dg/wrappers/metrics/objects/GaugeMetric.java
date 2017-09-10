package com.dg.wrappers.metrics.objects;

import com.dg.wrappers.metrics.reporter.MetricsReporter;

/**
 * @author dima.golomozy
 */
public class GaugeMetric extends BaseMetric {
    public GaugeMetric(String aspect, MetricsReporter metricsReporter) {
        super(aspect, metricsReporter);
    }

    public void gaugeValue(double value) {
        metricsReporter.gaugeValue(aspect, value);
    }

    public void gaugeDelta(double delta) {
        metricsReporter.gaugeDelta(aspect, delta);
    }
}
