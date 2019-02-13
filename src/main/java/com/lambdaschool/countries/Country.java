package com.lambdaschool.countries;

import java.util.concurrent.atomic.AtomicLong;

public class Country {
    private static final AtomicLong counter = new AtomicLong();
    private long id;
    private String name;
    private long population;
    private long landMassSize;
    private long medianAge;

    public Country(String name, long population, long landMassSize, long medianAge) {
        this.id = counter.incrementAndGet();
        this.name = name;
        this.population = population;
        this.landMassSize = landMassSize;
        this.medianAge = medianAge;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getLandMassSize() {
        return landMassSize;
    }

    public void setLandMassSize(long landMassSize) {
        this.landMassSize = landMassSize;
    }

    public long getMedianAge() {
        return medianAge;
    }

    public void setMedianAge(long medianAge) {
        this.medianAge = medianAge;
    }
}
