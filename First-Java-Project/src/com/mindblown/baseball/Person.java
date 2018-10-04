package com.mindblown.baseball;

public class Person
{
    private String m_firstName;
    private String m_lastName;
    private int m_age;
    private boolean m_isRightHanded;

    /**GETTARS*/
    public String getFirstName() { return m_firstName; }
    public String getLastName() { return m_lastName; }
    public int getAge() { return m_age; }
    public boolean IsRightHanded() { return m_isRightHanded; }
    /**GETTARS*/

    /**SETTARS*/
    public void setFirstName(String firstName) { this.m_firstName = firstName; }
    public void setLastName(String lastName) { this.m_lastName = lastName; }
    public void setAge(int age) { this.m_age = age; }
    public void setHand(boolean isRightHanded) { this.m_isRightHanded = isRightHanded; }
    /**SETTARS*/
}
