package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class PassengerTravelItemList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traveler_name")

    private String travelerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_number")

    private String idNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "travel_date")

    private String travelDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "departure_location")

    private String departureLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arrival_location")

    private String arrivalLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "class")

    private String propertyClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transportation_type")

    private String transportationType;

    public PassengerTravelItemList withTravelerName(String travelerName) {
        this.travelerName = travelerName;
        return this;
    }

    /**
     * 出行人。 
     * @return travelerName
     */
    public String getTravelerName() {
        return travelerName;
    }

    public void setTravelerName(String travelerName) {
        this.travelerName = travelerName;
    }

    public PassengerTravelItemList withIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }

    /**
     * 有效身份证件号。 
     * @return idNumber
     */
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public PassengerTravelItemList withTravelDate(String travelDate) {
        this.travelDate = travelDate;
        return this;
    }

    /**
     * 出行日期。 
     * @return travelDate
     */
    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public PassengerTravelItemList withDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
        return this;
    }

    /**
     * 出发地。 
     * @return departureLocation
     */
    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public PassengerTravelItemList withArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
        return this;
    }

    /**
     * 到达地。 
     * @return arrivalLocation
     */
    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public PassengerTravelItemList withPropertyClass(String propertyClass) {
        this.propertyClass = propertyClass;
        return this;
    }

    /**
     * 等级。 
     * @return propertyClass
     */
    public String getPropertyClass() {
        return propertyClass;
    }

    public void setPropertyClass(String propertyClass) {
        this.propertyClass = propertyClass;
    }

    public PassengerTravelItemList withTransportationType(String transportationType) {
        this.transportationType = transportationType;
        return this;
    }

    /**
     * 交通工具类型。 
     * @return transportationType
     */
    public String getTransportationType() {
        return transportationType;
    }

    public void setTransportationType(String transportationType) {
        this.transportationType = transportationType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PassengerTravelItemList that = (PassengerTravelItemList) obj;
        return Objects.equals(this.travelerName, that.travelerName) && Objects.equals(this.idNumber, that.idNumber)
            && Objects.equals(this.travelDate, that.travelDate)
            && Objects.equals(this.departureLocation, that.departureLocation)
            && Objects.equals(this.arrivalLocation, that.arrivalLocation)
            && Objects.equals(this.propertyClass, that.propertyClass)
            && Objects.equals(this.transportationType, that.transportationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(travelerName,
            idNumber,
            travelDate,
            departureLocation,
            arrivalLocation,
            propertyClass,
            transportationType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PassengerTravelItemList {\n");
        sb.append("    travelerName: ").append(toIndentedString(travelerName)).append("\n");
        sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
        sb.append("    travelDate: ").append(toIndentedString(travelDate)).append("\n");
        sb.append("    departureLocation: ").append(toIndentedString(departureLocation)).append("\n");
        sb.append("    arrivalLocation: ").append(toIndentedString(arrivalLocation)).append("\n");
        sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
        sb.append("    transportationType: ").append(toIndentedString(transportationType)).append("\n");
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
