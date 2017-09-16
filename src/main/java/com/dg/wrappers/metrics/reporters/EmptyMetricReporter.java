package com.dg.wrappers.metrics.reporters;

/**
 * An empty {@link MetricsReporter} implementation.
 * Override this class and methods to your chosen metrics client needs.
 *
 * @author dima.golomozy
 */
public class EmptyMetricReporter implements MetricsReporter {

    @Override
    public void stop() {
    }

    @Override
    public void count(String aspect, long delta) {
    }

    @Override
    public void gaugeValue(String aspect, double value) {
    }

    @Override
    public void gaugeDelta(String aspect, double delta) {
    }

    @Override
    public void setEvent(String aspect, String eventName) {
    }

    @Override
    public void recordTime(String aspect, long timeInMs) {
    }
}
