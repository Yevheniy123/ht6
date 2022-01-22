package com.company;

public class Phone {
    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private int birthday;
    private String address;
    private String phoneNumber;
    private String creditCard;
    private String debit;
    private String credit;
    private int timeUrban;
    private int timeIntercity;
    private int internetTraffic;

    public Phone(int id, String lastName, String firstName,
                 String patronymic, int birthday, String address,
                 String phoneNumber, String creditCard, String debit, String credit,
                 int timeUrban, int timeIntercity, int internetTraffic) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.creditCard = creditCard;
        this.debit = debit;
        this.credit = credit;
        this.timeUrban = timeUrban;
        this.timeIntercity = timeIntercity;
        this.internetTraffic = internetTraffic;
    }

    public Phone() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }



    public String getDebit() {
        return debit;
    }
    public int getTimeUrban() {
        return timeUrban;
    }

    public void setTimeUrban(int timeUrban) {
        this.timeUrban = timeUrban;
    }

    public int getTimeIntercity() {
        return timeIntercity;
    }

    public void setTimeIntercity(int timeIntercity) {
        this.timeIntercity = timeIntercity;
    }

    public int getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(int internetTraffic) {
        this.internetTraffic = internetTraffic;
    }
    public void setDebit(String debit) {
        this.debit = debit;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }
    
    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", creditCard='" + creditCard + '\'' +
                ", debit='" + debit + '\'' +
                ", credit='" + credit + '\'' +
                ", timeUrban=" + timeUrban +
                ", timeIntercity=" + timeIntercity +
                ", internetTraffic=" + internetTraffic +
                '}';
    }
}