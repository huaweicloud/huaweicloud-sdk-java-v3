package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaxiInvoiceResult
 */
public class TaxiInvoiceResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_number")

    private String phoneNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company")

    private String company;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taxi_number")

    private String taxiNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_number")

    private String certificateNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identification_number")

    private String identificationNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "boarding_time")

    private String boardingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alighting_time")

    private String alightingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit_price")

    private String unitPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distance")

    private String distance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting_time")

    private String waitingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fare")

    private String fare;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fuel_oil_surcharge")

    private String fuelOilSurcharge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "call_service_surcharge")

    private String callServiceSurcharge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private String total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Object confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_location")

    private Object textLocation;

    public TaxiInvoiceResult withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 归属地区。 
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public TaxiInvoiceResult withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 发票代码。 
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public TaxiInvoiceResult withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 发票号码。 
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public TaxiInvoiceResult withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * 电话（包括电话、监督电话）。 
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public TaxiInvoiceResult withCompany(String company) {
        this.company = company;
        return this;
    }

    /**
     * 单位。 
     * @return company
     */
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public TaxiInvoiceResult withTaxiNumber(String taxiNumber) {
        this.taxiNumber = taxiNumber;
        return this;
    }

    /**
     * 车号。 
     * @return taxiNumber
     */
    public String getTaxiNumber() {
        return taxiNumber;
    }

    public void setTaxiNumber(String taxiNumber) {
        this.taxiNumber = taxiNumber;
    }

    public TaxiInvoiceResult withCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
        return this;
    }

    /**
     * 证号。 
     * @return certificateNumber
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public TaxiInvoiceResult withIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
        return this;
    }

    /**
     * 识别编号。 
     * @return identificationNumber
     */
    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public TaxiInvoiceResult withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 开票日期。 
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TaxiInvoiceResult withBoardingTime(String boardingTime) {
        this.boardingTime = boardingTime;
        return this;
    }

    /**
     * 上车时间。 
     * @return boardingTime
     */
    public String getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(String boardingTime) {
        this.boardingTime = boardingTime;
    }

    public TaxiInvoiceResult withAlightingTime(String alightingTime) {
        this.alightingTime = alightingTime;
        return this;
    }

    /**
     * 下车时间。 
     * @return alightingTime
     */
    public String getAlightingTime() {
        return alightingTime;
    }

    public void setAlightingTime(String alightingTime) {
        this.alightingTime = alightingTime;
    }

    public TaxiInvoiceResult withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 时间(起止时间、上下车时间)。 
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public TaxiInvoiceResult withUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    /**
     * 单价。 
     * @return unitPrice
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public TaxiInvoiceResult withDistance(String distance) {
        this.distance = distance;
        return this;
    }

    /**
     * 总里程。 
     * @return distance
     */
    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public TaxiInvoiceResult withWaitingTime(String waitingTime) {
        this.waitingTime = waitingTime;
        return this;
    }

    /**
     * 等候时间。 
     * @return waitingTime
     */
    public String getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(String waitingTime) {
        this.waitingTime = waitingTime;
    }

    public TaxiInvoiceResult withFare(String fare) {
        this.fare = fare;
        return this;
    }

    /**
     * 金额。 
     * @return fare
     */
    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public TaxiInvoiceResult withFuelOilSurcharge(String fuelOilSurcharge) {
        this.fuelOilSurcharge = fuelOilSurcharge;
        return this;
    }

    /**
     * 燃油附加费。 
     * @return fuelOilSurcharge
     */
    public String getFuelOilSurcharge() {
        return fuelOilSurcharge;
    }

    public void setFuelOilSurcharge(String fuelOilSurcharge) {
        this.fuelOilSurcharge = fuelOilSurcharge;
    }

    public TaxiInvoiceResult withCallServiceSurcharge(String callServiceSurcharge) {
        this.callServiceSurcharge = callServiceSurcharge;
        return this;
    }

    /**
     * 电调费（预约费）。 
     * @return callServiceSurcharge
     */
    public String getCallServiceSurcharge() {
        return callServiceSurcharge;
    }

    public void setCallServiceSurcharge(String callServiceSurcharge) {
        this.callServiceSurcharge = callServiceSurcharge;
    }

    public TaxiInvoiceResult withTotal(String total) {
        this.total = total;
        return this;
    }

    /**
     * 实收金额。 
     * @return total
     */
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public TaxiInvoiceResult withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 相关字段的置信度信息，置信度越大，表示本次识别的对应字段的可靠性越高，在统计意义上，置信度越大，准确率越高。 置信度由算法给出，不直接等价于对应字段的准确率。 
     * @return confidence
     */
    public Object getConfidence() {
        return confidence;
    }

    public void setConfidence(Object confidence) {
        this.confidence = confidence;
    }

    public TaxiInvoiceResult withTextLocation(Object textLocation) {
        this.textLocation = textLocation;
        return this;
    }

    /**
     * 对应所有在原图上识别到的字段位置信息，包含所有文字区域四个顶点的二维坐标（x,y）。采用图像坐标系，坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return textLocation
     */
    public Object getTextLocation() {
        return textLocation;
    }

    public void setTextLocation(Object textLocation) {
        this.textLocation = textLocation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaxiInvoiceResult that = (TaxiInvoiceResult) obj;
        return Objects.equals(this.location, that.location) && Objects.equals(this.code, that.code)
            && Objects.equals(this.number, that.number) && Objects.equals(this.phoneNumber, that.phoneNumber)
            && Objects.equals(this.company, that.company) && Objects.equals(this.taxiNumber, that.taxiNumber)
            && Objects.equals(this.certificateNumber, that.certificateNumber)
            && Objects.equals(this.identificationNumber, that.identificationNumber)
            && Objects.equals(this.date, that.date) && Objects.equals(this.boardingTime, that.boardingTime)
            && Objects.equals(this.alightingTime, that.alightingTime) && Objects.equals(this.time, that.time)
            && Objects.equals(this.unitPrice, that.unitPrice) && Objects.equals(this.distance, that.distance)
            && Objects.equals(this.waitingTime, that.waitingTime) && Objects.equals(this.fare, that.fare)
            && Objects.equals(this.fuelOilSurcharge, that.fuelOilSurcharge)
            && Objects.equals(this.callServiceSurcharge, that.callServiceSurcharge)
            && Objects.equals(this.total, that.total) && Objects.equals(this.confidence, that.confidence)
            && Objects.equals(this.textLocation, that.textLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location,
            code,
            number,
            phoneNumber,
            company,
            taxiNumber,
            certificateNumber,
            identificationNumber,
            date,
            boardingTime,
            alightingTime,
            time,
            unitPrice,
            distance,
            waitingTime,
            fare,
            fuelOilSurcharge,
            callServiceSurcharge,
            total,
            confidence,
            textLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaxiInvoiceResult {\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    taxiNumber: ").append(toIndentedString(taxiNumber)).append("\n");
        sb.append("    certificateNumber: ").append(toIndentedString(certificateNumber)).append("\n");
        sb.append("    identificationNumber: ").append(toIndentedString(identificationNumber)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    boardingTime: ").append(toIndentedString(boardingTime)).append("\n");
        sb.append("    alightingTime: ").append(toIndentedString(alightingTime)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
        sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
        sb.append("    waitingTime: ").append(toIndentedString(waitingTime)).append("\n");
        sb.append("    fare: ").append(toIndentedString(fare)).append("\n");
        sb.append("    fuelOilSurcharge: ").append(toIndentedString(fuelOilSurcharge)).append("\n");
        sb.append("    callServiceSurcharge: ").append(toIndentedString(callServiceSurcharge)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    textLocation: ").append(toIndentedString(textLocation)).append("\n");
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
