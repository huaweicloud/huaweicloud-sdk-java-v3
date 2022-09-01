package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * WaybillElectronicResult
 */
public class WaybillElectronicResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    @JacksonXmlProperty(localName = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receiver_name")

    @JacksonXmlProperty(localName = "receiver_name")

    private String receiverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receiver_phone")

    @JacksonXmlProperty(localName = "receiver_phone")

    private String receiverPhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receiver_address")

    @JacksonXmlProperty(localName = "receiver_address")

    private String receiverAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sender_name")

    @JacksonXmlProperty(localName = "sender_name")

    private String senderName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sender_phone")

    @JacksonXmlProperty(localName = "sender_phone")

    private String senderPhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sender_address")

    @JacksonXmlProperty(localName = "sender_address")

    private String senderAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waybill_number")

    @JacksonXmlProperty(localName = "waybill_number")

    private String waybillNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    @JacksonXmlProperty(localName = "confidence")

    private Object confidence;

    public WaybillElectronicResult withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 三段码。 
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public WaybillElectronicResult withReceiverName(String receiverName) {
        this.receiverName = receiverName;
        return this;
    }

    /**
     * 收件人姓名。 
     * @return receiverName
     */
    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public WaybillElectronicResult withReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
        return this;
    }

    /**
     * 收件人电话。 
     * @return receiverPhone
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public WaybillElectronicResult withReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
        return this;
    }

    /**
     * 收件人地址。 
     * @return receiverAddress
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public WaybillElectronicResult withSenderName(String senderName) {
        this.senderName = senderName;
        return this;
    }

    /**
     * 寄件人姓名。 
     * @return senderName
     */
    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public WaybillElectronicResult withSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
        return this;
    }

    /**
     * 寄件人电话。 
     * @return senderPhone
     */
    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public WaybillElectronicResult withSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
        return this;
    }

    /**
     * 寄件人地址。 
     * @return senderAddress
     */
    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public WaybillElectronicResult withWaybillNumber(String waybillNumber) {
        this.waybillNumber = waybillNumber;
        return this;
    }

    /**
     * 条形码运单号。 
     * @return waybillNumber
     */
    public String getWaybillNumber() {
        return waybillNumber;
    }

    public void setWaybillNumber(String waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

    public WaybillElectronicResult withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 相关字段的置信度信息，取值范围0~1。 置信度越大，表示本次识别的对应字段的可靠性越高，在统计意义上，置信度越大，准确率越高。 置信度由算法给出，不直接等价于对应字段的准确率。 
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
        WaybillElectronicResult waybillElectronicResult = (WaybillElectronicResult) o;
        return Objects.equals(this.code, waybillElectronicResult.code)
            && Objects.equals(this.receiverName, waybillElectronicResult.receiverName)
            && Objects.equals(this.receiverPhone, waybillElectronicResult.receiverPhone)
            && Objects.equals(this.receiverAddress, waybillElectronicResult.receiverAddress)
            && Objects.equals(this.senderName, waybillElectronicResult.senderName)
            && Objects.equals(this.senderPhone, waybillElectronicResult.senderPhone)
            && Objects.equals(this.senderAddress, waybillElectronicResult.senderAddress)
            && Objects.equals(this.waybillNumber, waybillElectronicResult.waybillNumber)
            && Objects.equals(this.confidence, waybillElectronicResult.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code,
            receiverName,
            receiverPhone,
            receiverAddress,
            senderName,
            senderPhone,
            senderAddress,
            waybillNumber,
            confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WaybillElectronicResult {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    receiverName: ").append(toIndentedString(receiverName)).append("\n");
        sb.append("    receiverPhone: ").append(toIndentedString(receiverPhone)).append("\n");
        sb.append("    receiverAddress: ").append(toIndentedString(receiverAddress)).append("\n");
        sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
        sb.append("    senderPhone: ").append(toIndentedString(senderPhone)).append("\n");
        sb.append("    senderAddress: ").append(toIndentedString(senderAddress)).append("\n");
        sb.append("    waybillNumber: ").append(toIndentedString(waybillNumber)).append("\n");
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
