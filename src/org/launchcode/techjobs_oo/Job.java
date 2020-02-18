package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public String toString() {
        if (name.equals("") || name == null) {
            name = "Data not available";
        }

        if (employer.getValue().equals("") || employer.getValue() == null) {
            employer.setValue("Data not available");
        }

        if (location.getValue().equals("") || location.getValue() == null) {
            location.setValue("Data not available");
        }

        if (positionType.getValue().equals("") || positionType.getValue() == null) {
            positionType.setValue("Data not available");
        }

        if (coreCompetency.getValue().equals("") || coreCompetency.getValue() == null) {
            coreCompetency.setValue("Data not available");
        }


        String jobData = "\nID: " + id + "\nName: " + name + "\nEmployer: " + this.employer + "\nLocation: " + this.location + "\nPosition Type: " + this.positionType + "\nCore Competency: " + this.coreCompetency + "\n";
        System.out.println(jobData);
        return jobData;
    }

/*    public String toString() {
        String nameAvailable = this.name;
        if (nameAvailable)
        Employer employerAvailable = this.employer;
        Location locationAvailable = this.location;
        PositionType positionTypeAvailable = this.positionType;
        CoreCompetency coreCompetencyAvailable = this.coreCompetency;

        String jobData = "\nID: " + this.id + "\nName: " + this.name + "\nEmployer: " + this.employer + "\nLocation: " + this.location + "\nPosition Type: " + this.positionType + "\nCore Competency: " + this.coreCompetency + "\n";
        if (nameAvailable || employerAvailable, locationAvailable, positionTypeAvailable, coreCompetencyAvailable == null) {
            System.out.println("Data not available");
        }
        return jobData;
    }*/
}