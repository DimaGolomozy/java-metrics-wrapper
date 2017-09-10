package com.dg.wrappers.metrics.reporter;

/**
 * @author dima.golomozy
 */
public interface MetricsReporter {

    /**
     * Shut down client.
     */
    void stop();

    /**
     * Adjusts the specified counter by a given delta.
     *
     * @param aspect
     *     the name of the counter to adjust
     * @param delta
     *     the amount to adjust the counter by
     */
    void count(String aspect, long delta);

    /**
     * Increments the specified counter by one.
     *
     * @param aspect
     *     the name of the counter to increment
     */
    void increment(String aspect);

    /**
     * Decrements the specified counter by one.
     *
     * @param aspect
     *     the name of the counter to decrement
     */
    void decrement(String aspect);

    /**
     * Records the latest fixed value for the specified named gauge.
     *
     * @param aspect
     *     the name of the gauge
     * @param value
     *     the new reading of the gauge
     */
    void gaugeValue(String aspect, double value);

    /**
     * Records a change in the value of the specified named gauge.
     *
     * @param aspect
     *     the name of the gauge
     * @param delta
     *     the +/- delta to apply to the gauge
     */
    void gaugeDelta(String aspect, double delta);

    /**
     * Set unique occurrences of events. Call this method to records an occurrence
     * of the specified named event.
     *
     * @param aspect
     *     the name of the set
     * @param eventName
     *     the value to be added to the set
     */
    void setEvent(String aspect, String eventName);

    /**
     * Records an execution time in milliseconds for the specified named operation.
     *
     * @param aspect
     *     the name of the timed operation
     * @param timeInMs
     *     the time in milliseconds
     */
    void recordTime(String aspect, long timeInMs);
}
