package com.westchestertabletennis.paymentgenerator.dto;

import java.sql.ResultSet;
import java.util.Arrays;

public class EventDTO implements DTO {
    private int id;
    private int tournamentid;
    private String eventName;
    private String eventDate;
    private int maxParticipants;
    private boolean usatt;
    private String firstPl;
    private String secondPl;
    private String thirdPl;
    private String fourthPl;
    private String fifthPl;
    private String sixthPl;
    private String seventhPl;
    private String eighthPl;
    private String fee;
    private String text;
    private int eventOrder;
    private String eventTime;


    public EventDTO() {
    }

    public EventDTO(int id, int tournamentid, String eventName, String eventDate, int maxParticipants, boolean usatt, String firstPl, String secondPl, String thirdPl, String fourthPl, String fifthPl, String sixthPl, String seventhPl, String eighthPl, String fee, String text, int eventOrder, String eventTime) {
        this.id = id;
        this.tournamentid = tournamentid;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.maxParticipants = maxParticipants;
        this.usatt = usatt;
        this.firstPl = firstPl;
        this.secondPl = secondPl;
        this.thirdPl = thirdPl;
        this.fourthPl = fourthPl;
        this.fifthPl = fifthPl;
        this.sixthPl = sixthPl;
        this.seventhPl = seventhPl;
        this.eighthPl = eighthPl;
        this.fee = fee;
        this.text = text;
        this.eventOrder = eventOrder;
        this.eventTime = eventTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTournamentid() {
        return tournamentid;
    }

    public void setTournamentid(int tournamentid) {
        this.tournamentid = tournamentid;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public boolean isUsatt() {
        return usatt;
    }

    public void setUsatt(boolean usatt) {
        this.usatt = usatt;
    }

    public String getFirstPl() {
        return firstPl;
    }

    public void setFirstPl(String firstPl) {
        this.firstPl = firstPl;
    }

    public String getSecondPl() {
        return secondPl;
    }

    public void setSecondPl(String secondPl) {
        this.secondPl = secondPl;
    }

    public String getThirdPl() {
        return thirdPl;
    }

    public void setThirdPl(String thirdPl) {
        this.thirdPl = thirdPl;
    }

    public String getFourthPl() {
        return fourthPl;
    }

    public void setFourthPl(String fourthPl) {
        this.fourthPl = fourthPl;
    }

    public String getFifthPl() {
        return fifthPl;
    }

    public void setFifthPl(String fifthPl) {
        this.fifthPl = fifthPl;
    }

    public String getSixthPl() {
        return sixthPl;
    }

    public void setSixthPl(String sixthPl) {
        this.sixthPl = sixthPl;
    }

    public String getSeventhPl() {
        return seventhPl;
    }

    public void setSeventhPl(String seventhPl) {
        this.seventhPl = seventhPl;
    }

    public String getEighthPl() {
        return eighthPl;
    }

    public void setEighthPl(String eighthPl) {
        this.eighthPl = eighthPl;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getEventOrder() {
        return eventOrder;
    }

    public void setEventOrder(int eventOrder) {
        this.eventOrder = eventOrder;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    @Override
    public String toString() {
        return "EventDTO{" +
                "id=" + id +
                ", tournamentid=" + tournamentid +
                ", eventName='" + eventName + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", maxParticipants=" + maxParticipants +
                ", usatt=" + usatt +
                ", firstPl='" + firstPl + '\'' +
                ", secondPl='" + secondPl + '\'' +
                ", thirdPl='" + thirdPl + '\'' +
                ", fourthPl='" + fourthPl + '\'' +
                ", fifthPl='" + fifthPl + '\'' +
                ", sixthPl='" + sixthPl + '\'' +
                ", seventhPl='" + seventhPl + '\'' +
                ", eighthPl='" + eighthPl + '\'' +
                ", fee='" + fee + '\'' +
                '}';
    }

    @Override
    public DTO fromResultSet(ResultSet result) throws Exception {
        int id = result.getInt(1);
        int tournamentId = result.getInt(2);
        String eventName = result.getString(3);
        String eventDate = result.getString(4);
        int maxParticipants = result.getInt(5);
        boolean usatt = result.getBoolean(6);
        String firstPl = result.getString(7);
        String secondPl = result.getString(8);
        String thirdPl = result.getString(9);
        String fourthPl = result.getString(10);
        String fifthPl = result.getString(11);
        String sixthPl = result.getString(12);
        String seventhPl = result.getString(13);
        String eighthPl = result.getString(14);
        String fee = result.getString(15);
        String text = result.getString(16);
        int eventOrder = result.getInt(17);
        String eventTime = result.getString(18);
        EventDTO eventDTO = new EventDTO(id, tournamentId, eventName, eventDate, maxParticipants, usatt, firstPl, secondPl, thirdPl, fourthPl, fifthPl, sixthPl, seventhPl, eighthPl, fee, text, eventOrder, eventTime);
        return eventDTO;
    }
}
