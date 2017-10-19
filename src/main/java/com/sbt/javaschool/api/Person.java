package com.sbt.javaschool.api;

public interface Person {

    /**
     * This method checks gender of persons. If genders are not equal - tries to marry.
     * If one of them has another spouse - execute divorce(sets spouse = null for husband and wife. Example: if both persons have spouses - then divorce will set 4 spouse to null) and then executes marry().
     * @param person - new husband/wife for this person.
     * @return - returns true if this person has another gender than passed person and they are not husband and wife, false otherwise
     */
    boolean marry(Person person);

    /**
     * Returns true - if person is man, false - if person is woman
     * @return true - if person is man
     */
    boolean isMan();

    /**
     * Return name of person
     * @return name
     */
    String getName();

    /**
     * Return spouse of person
     * @return spouse
     */
    Person getSpouse();

    /**
     * Sets spouse = null if spouse is not null
     * @return true - if person status has been changed
     */

    boolean divorce();

    /**
     * Set spouse of person
     * @param spouse
     */
    void setSpouse(Person spouse);
}
