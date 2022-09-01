package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class FlightItineraryResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    @JacksonXmlProperty(localName = "serial_number")

    private String serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "passenger_name")

    @JacksonXmlProperty(localName = "passenger_name")

    private String passengerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_number")

    @JacksonXmlProperty(localName = "id_number")

    private String idNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endorsements_restrictions")

    @JacksonXmlProperty(localName = "endorsements_restrictions")

    private String endorsementsRestrictions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_number")

    @JacksonXmlProperty(localName = "order_number")

    private String orderNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fare")

    @JacksonXmlProperty(localName = "fare")

    private String fare;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "caac_development_fund")

    @JacksonXmlProperty(localName = "caac_development_fund")

    private String caacDevelopmentFund;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fuel_surcharge")

    @JacksonXmlProperty(localName = "fuel_surcharge")

    private String fuelSurcharge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_taxes")

    @JacksonXmlProperty(localName = "other_taxes")

    private String otherTaxes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private String total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "e_ticket_number")

    @JacksonXmlProperty(localName = "e_ticket_number")

    private String eTicketNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_code")

    @JacksonXmlProperty(localName = "check_code")

    private String checkCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference_information")

    @JacksonXmlProperty(localName = "reference_information")

    private String referenceInformation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insurance")

    @JacksonXmlProperty(localName = "insurance")

    private String insurance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_code")

    @JacksonXmlProperty(localName = "agent_code")

    private String agentCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_organization")

    @JacksonXmlProperty(localName = "issue_organization")

    private String issueOrganization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    @JacksonXmlProperty(localName = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "itinerary_list")

    @JacksonXmlProperty(localName = "itinerary_list")

    private List<ItineraryList> itineraryList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    @JacksonXmlProperty(localName = "confidence")

    private Object confidence;

    public FlightItineraryResult withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * 印刷序号。 
     * @return serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public FlightItineraryResult withPassengerName(String passengerName) {
        this.passengerName = passengerName;
        return this;
    }

    /**
     * 旅客姓名。 
     * @return passengerName
     */
    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public FlightItineraryResult withIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }

    /**
     * 有效身份证件号码。 
     * @return idNumber
     */
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public FlightItineraryResult withEndorsementsRestrictions(String endorsementsRestrictions) {
        this.endorsementsRestrictions = endorsementsRestrictions;
        return this;
    }

    /**
     * 备注。 
     * @return endorsementsRestrictions
     */
    public String getEndorsementsRestrictions() {
        return endorsementsRestrictions;
    }

    public void setEndorsementsRestrictions(String endorsementsRestrictions) {
        this.endorsementsRestrictions = endorsementsRestrictions;
    }

    public FlightItineraryResult withOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     * 订单号。 
     * @return orderNumber
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public FlightItineraryResult withFare(String fare) {
        this.fare = fare;
        return this;
    }

    /**
     * 票价。 
     * @return fare
     */
    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public FlightItineraryResult withCaacDevelopmentFund(String caacDevelopmentFund) {
        this.caacDevelopmentFund = caacDevelopmentFund;
        return this;
    }

    /**
     * 民航（CAAC)发展基金。 
     * @return caacDevelopmentFund
     */
    public String getCaacDevelopmentFund() {
        return caacDevelopmentFund;
    }

    public void setCaacDevelopmentFund(String caacDevelopmentFund) {
        this.caacDevelopmentFund = caacDevelopmentFund;
    }

    public FlightItineraryResult withFuelSurcharge(String fuelSurcharge) {
        this.fuelSurcharge = fuelSurcharge;
        return this;
    }

    /**
     * 燃油附加费。 
     * @return fuelSurcharge
     */
    public String getFuelSurcharge() {
        return fuelSurcharge;
    }

    public void setFuelSurcharge(String fuelSurcharge) {
        this.fuelSurcharge = fuelSurcharge;
    }

    public FlightItineraryResult withOtherTaxes(String otherTaxes) {
        this.otherTaxes = otherTaxes;
        return this;
    }

    /**
     * 其他税费。 
     * @return otherTaxes
     */
    public String getOtherTaxes() {
        return otherTaxes;
    }

    public void setOtherTaxes(String otherTaxes) {
        this.otherTaxes = otherTaxes;
    }

    public FlightItineraryResult withTotal(String total) {
        this.total = total;
        return this;
    }

    /**
     * 合计。 
     * @return total
     */
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public FlightItineraryResult withETicketNumber(String eTicketNumber) {
        this.eTicketNumber = eTicketNumber;
        return this;
    }

    /**
     * 电子客票号码。 
     * @return eTicketNumber
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "e_ticket_number")
    public String getETicketNumber() {
        return eTicketNumber;
    }

    public void setETicketNumber(String eTicketNumber) {
        this.eTicketNumber = eTicketNumber;
    }

    public FlightItineraryResult withCheckCode(String checkCode) {
        this.checkCode = checkCode;
        return this;
    }

    /**
     * 验证码。 
     * @return checkCode
     */
    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public FlightItineraryResult withReferenceInformation(String referenceInformation) {
        this.referenceInformation = referenceInformation;
        return this;
    }

    /**
     * 提示信息。 
     * @return referenceInformation
     */
    public String getReferenceInformation() {
        return referenceInformation;
    }

    public void setReferenceInformation(String referenceInformation) {
        this.referenceInformation = referenceInformation;
    }

    public FlightItineraryResult withInsurance(String insurance) {
        this.insurance = insurance;
        return this;
    }

    /**
     * 保险费。 
     * @return insurance
     */
    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public FlightItineraryResult withAgentCode(String agentCode) {
        this.agentCode = agentCode;
        return this;
    }

    /**
     * 销售单位代号。 
     * @return agentCode
     */
    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public FlightItineraryResult withIssueOrganization(String issueOrganization) {
        this.issueOrganization = issueOrganization;
        return this;
    }

    /**
     * 填开单位。 
     * @return issueOrganization
     */
    public String getIssueOrganization() {
        return issueOrganization;
    }

    public void setIssueOrganization(String issueOrganization) {
        this.issueOrganization = issueOrganization;
    }

    public FlightItineraryResult withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * 填开日期。 
     * @return issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public FlightItineraryResult withItineraryList(List<ItineraryList> itineraryList) {
        this.itineraryList = itineraryList;
        return this;
    }

    public FlightItineraryResult addItineraryListItem(ItineraryList itineraryListItem) {
        if (this.itineraryList == null) {
            this.itineraryList = new ArrayList<>();
        }
        this.itineraryList.add(itineraryListItem);
        return this;
    }

    public FlightItineraryResult withItineraryList(Consumer<List<ItineraryList>> itineraryListSetter) {
        if (this.itineraryList == null) {
            this.itineraryList = new ArrayList<>();
        }
        itineraryListSetter.accept(this.itineraryList);
        return this;
    }

    /**
     * 机票行程列表。 
     * @return itineraryList
     */
    public List<ItineraryList> getItineraryList() {
        return itineraryList;
    }

    public void setItineraryList(List<ItineraryList> itineraryList) {
        this.itineraryList = itineraryList;
    }

    public FlightItineraryResult withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 相关字段的置信度信息，取值范围0~1。  置信度越大，表示本次识别的对应字段的可靠性越高，在统计意义上，置信度越大，准确率越高。  置信度由算法给出，不直接等价于对应字段的准确率。  > 说明：  - （1）置信度中的相关字段均与返回值中的相关字段一一对应；  - （2）置信度中的itinerary_list的顺序与返回值中的itinerary_list的顺序是一致的。 
     * @return confidence
     */
    public Object getConfidence() {
        return confidence;
    }

    public void setConfidence(Object confidence) {
        this.confidence = confidence;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlightItineraryResult flightItineraryResult = (FlightItineraryResult) o;
        return Objects.equals(this.serialNumber, flightItineraryResult.serialNumber)
            && Objects.equals(this.passengerName, flightItineraryResult.passengerName)
            && Objects.equals(this.idNumber, flightItineraryResult.idNumber)
            && Objects.equals(this.endorsementsRestrictions, flightItineraryResult.endorsementsRestrictions)
            && Objects.equals(this.orderNumber, flightItineraryResult.orderNumber)
            && Objects.equals(this.fare, flightItineraryResult.fare)
            && Objects.equals(this.caacDevelopmentFund, flightItineraryResult.caacDevelopmentFund)
            && Objects.equals(this.fuelSurcharge, flightItineraryResult.fuelSurcharge)
            && Objects.equals(this.otherTaxes, flightItineraryResult.otherTaxes)
            && Objects.equals(this.total, flightItineraryResult.total)
            && Objects.equals(this.eTicketNumber, flightItineraryResult.eTicketNumber)
            && Objects.equals(this.checkCode, flightItineraryResult.checkCode)
            && Objects.equals(this.referenceInformation, flightItineraryResult.referenceInformation)
            && Objects.equals(this.insurance, flightItineraryResult.insurance)
            && Objects.equals(this.agentCode, flightItineraryResult.agentCode)
            && Objects.equals(this.issueOrganization, flightItineraryResult.issueOrganization)
            && Objects.equals(this.issueDate, flightItineraryResult.issueDate)
            && Objects.equals(this.itineraryList, flightItineraryResult.itineraryList)
            && Objects.equals(this.confidence, flightItineraryResult.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber,
            passengerName,
            idNumber,
            endorsementsRestrictions,
            orderNumber,
            fare,
            caacDevelopmentFund,
            fuelSurcharge,
            otherTaxes,
            total,
            eTicketNumber,
            checkCode,
            referenceInformation,
            insurance,
            agentCode,
            issueOrganization,
            issueDate,
            itineraryList,
            confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlightItineraryResult {\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    passengerName: ").append(toIndentedString(passengerName)).append("\n");
        sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
        sb.append("    endorsementsRestrictions: ").append(toIndentedString(endorsementsRestrictions)).append("\n");
        sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
        sb.append("    fare: ").append(toIndentedString(fare)).append("\n");
        sb.append("    caacDevelopmentFund: ").append(toIndentedString(caacDevelopmentFund)).append("\n");
        sb.append("    fuelSurcharge: ").append(toIndentedString(fuelSurcharge)).append("\n");
        sb.append("    otherTaxes: ").append(toIndentedString(otherTaxes)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    eTicketNumber: ").append(toIndentedString(eTicketNumber)).append("\n");
        sb.append("    checkCode: ").append(toIndentedString(checkCode)).append("\n");
        sb.append("    referenceInformation: ").append(toIndentedString(referenceInformation)).append("\n");
        sb.append("    insurance: ").append(toIndentedString(insurance)).append("\n");
        sb.append("    agentCode: ").append(toIndentedString(agentCode)).append("\n");
        sb.append("    issueOrganization: ").append(toIndentedString(issueOrganization)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    itineraryList: ").append(toIndentedString(itineraryList)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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
