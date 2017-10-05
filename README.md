# java-metrics-wrapper  [![GitHub release](https://img.shields.io/github/release/DimaGolomozy/java-metrics-wrapper.svg)]()
Wrapper for easy metric client implementing.

## Usage

Extend interface ``MetricReporter`` with the diseired metrics client (like [java-statsd-client](https://github.com/tim-group/java-statsd-client))
and use it as is.

Another option, is to initialize ``MatricsMaker`` with the implemented ``MetricReporter`` and use the metrics object:
``CountMetric``, ``DurationMetric``, ``EventMetric``, ``GaugeMetric``, ``TimeMetric`` to create and report metrics.

Extend the ``EmptyMetricReporter`` class if in some cases there is no implementation for some of the ``MetricReporter`` methods.

#### Example
```
public class StatsDMetricReporter extends EmptyMetricReporter {
    private final StatsDClient client = new NonBlockingStatsDClient("prefix", "hostname", 0);

    @Override
    public void count(String aspect, long delta) {
        client.count(aspect, delta);
    }

    @Override
    public void recordTime(String aspect, long timeInMs) {
        client.recordExecutionTime(aspect, timeInMs);
    }
    
    public void main(String[] args) {
        MetricsMaker metricsMaker = new MetricsMaker(new StatsDMetricReporter());

        CountMetric counter = metricsMaker.getCountMetric("counter");

        for (int i = 0; i < 100; i++) {
            counter.count(i);
        }
    }
}
```
Will result of sending the metric _counter_ with the value of ``i`` each time.

