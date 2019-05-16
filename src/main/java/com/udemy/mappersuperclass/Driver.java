package com.udemy.mappersuperclass;

import javax.persistence.MappedSuperclass;

/**
 *
 * @author Jan
 */

@MappedSuperclass
public class Driver {
    protected String drivingLicense;

    public Driver() {
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
}