package com.skylerwebdev.countries;

import java.util.concurrent.atomic.AtomicLong;
import java.util.*;
public class Country
{
    private static final AtomicLong counter = new AtomicLong();
    private long id;
    private String countryName;
    private long population;
    private int landMassSize;
    private int medianAge;

    public Country(String countryName, long population, int landMassSize, int medianAge)
    {
        this.id = counter.incrementAndGet();
        this.countryName = countryName;
        this.population = population;
        this.landMassSize = landMassSize;
        this.medianAge = medianAge;
    }

    public Country(Country toClone)
    {
        this.id = toClone.getId();
        this.countryName = toClone.getCountryName();
        this.population = toClone.getPopulation();
        this.landMassSize = toClone.getLandMassSize();
        this.medianAge = toClone.getMedianAge();
    }

    public Country()
    {
    }

    public long getId()
    {
        return id;
    }

    public String getCountryName()
    {
        return countryName;
    }

    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }

    public long getPopulation()
    {
        return population;
    }

    public void setPopulation(long population)
    {
        this.population = population;
    }

    public int getLandMassSize()
    {
        return landMassSize;
    }

    public void setLandMassSize(int landMassSize)
    {
        this.landMassSize = landMassSize;
    }

    public int getMedianAge()
    {
        return medianAge;
    }

    public void setMedianAge(int medianAge)
    {
        this.medianAge = medianAge;
    }

    @Override
    public String toString()
    {
        return "Country{" +
                "id=" + id +
                ", countryName='" + countryName + '\'' +
                ", population=" + population +
                ", landMassSize=" + landMassSize +
                ", medianAge=" + medianAge +
                '}';
    }
}
