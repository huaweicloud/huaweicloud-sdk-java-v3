package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 机票行程列表。
 */
public class ItineraryList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "departure_station")

    @JacksonXmlProperty(localName = "departure_station")

    private String departureStation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_station")

    @JacksonXmlProperty(localName = "destination_station")

    private String destinationStation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "carrier")

    @JacksonXmlProperty(localName = "carrier")

    private String carrier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flight")

    @JacksonXmlProperty(localName = "flight")

    private String flight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cabin_class")

    @JacksonXmlProperty(localName = "cabin_class")

    private String cabinClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date")

    @JacksonXmlProperty(localName = "date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    @JacksonXmlProperty(localName = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fare_basis")

    @JacksonXmlProperty(localName = "fare_basis")

    private String fareBasis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_date")

    @JacksonXmlProperty(localName = "effective_date")

    private String effectiveDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiry_date")

    @JacksonXmlProperty(localName = "expiry_date")

    private String expiryDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baggage_allowance")

    @JacksonXmlProperty(localName = "baggage_allowance")

    private String baggageAllowance;

    public ItineraryList withDepartureStation(String departureStation) {
        this.departureStation = departureStation;
        return this;
    }

    /**
     * 始发站。 
     * @return departureStation
     */
    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public ItineraryList withDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
        return this;
    }

    /**
     * 目的站。 
     * @return destinationStation
     */
    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public ItineraryList withCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    /**
     * 承运人。 
     * @return carrier
     */
    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public ItineraryList withFlight(String flight) {
        this.flight = flight;
        return this;
    }

    /**
     * 航班号。 
     * @return flight
     */
    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public ItineraryList withCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
        return this;
    }

    /**
     * 座位等级。 
     * @return cabinClass
     */
    public String getCabinClass() {
        return cabinClass;
    }

    public void setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
    }

    public ItineraryList withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 日期。 
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ItineraryList withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 时间。 
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ItineraryList withFareBasis(String fareBasis) {
        this.fareBasis = fareBasis;
        return this;
    }

    /**
     * 客票类别。 
     * @return fareBasis
     */
    public String getFareBasis() {
        return fareBasis;
    }

    public void setFareBasis(String fareBasis) {
        this.fareBasis = fareBasis;
    }

    public ItineraryList withEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * 客票生效日期。 
     * @return effectiveDate
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public ItineraryList withExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * 有效截止日期。 
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public ItineraryList withBaggageAllowance(String baggageAllowance) {
        this.baggageAllowance = baggageAllowance;
        return this;
    }

    /**
     * 免费行李。 
     * @return baggageAllowance
     */
    public String getBaggageAllowance() {
        return baggageAllowance;
    }

    public void setBaggageAllowance(String baggageAllowance) {
        this.baggageAllowance = baggageAllowance;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItineraryList itineraryList = (ItineraryList) o;
        return Objects.equals(this.departureStation, itineraryList.departureStation)
            && Objects.equals(this.destinationStation, itineraryList.destinationStation)
            && Objects.equals(this.carrier, itineraryList.carrier) && Objects.equals(this.flight, itineraryList.flight)
            && Objects.equals(this.cabinClass, itineraryList.cabinClass)
            && Objects.equals(this.date, itineraryList.date) && Objects.equals(this.time, itineraryList.time)
            && Objects.equals(this.fareBasis, itineraryList.fareBasis)
            && Objects.equals(this.effectiveDate, itineraryList.effectiveDate)
            && Objects.equals(this.expiryDate, itineraryList.expiryDate)
            && Objects.equals(this.baggageAllowance, itineraryList.baggageAllowance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureStation,
            destinationStation,
            carrier,
            flight,
            cabinClass,
            date,
            time,
            fareBasis,
            effectiveDate,
            expiryDate,
            baggageAllowance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItineraryList {\n");
        sb.append("    departureStation: ").append(toIndentedString(departureStation)).append("\n");
        sb.append("    destinationStation: ").append(toIndentedString(destinationStation)).append("\n");
        sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
        sb.append("    flight: ").append(toIndentedString(flight)).append("\n");
        sb.append("    cabinClass: ").append(toIndentedString(cabinClass)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    fareBasis: ").append(toIndentedString(fareBasis)).append("\n");
        sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("    baggageAllowance: ").append(toIndentedString(baggageAllowance)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
