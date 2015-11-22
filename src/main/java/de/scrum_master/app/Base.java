package de.scrum_master.app;

import com.codahale.metrics.annotation.Timed;

import io.astefanutti.metrics.aspectj.Metrics;

@Metrics
public class Base {
    public void something_not_timed() {}

    @Timed(name="method1-ProcessTime")
    public void method1() {}
}