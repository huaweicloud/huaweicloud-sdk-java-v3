package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TollInvoiceResult
 */
public class TollInvoiceResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entry")

    private String entry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exit")

    private String exit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private String amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cashier")

    private String cashier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vehicle_type")

    private String vehicleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Object confidence;

    public TollInvoiceResult withCode(String code) {
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

    public TollInvoiceResult withNumber(String number) {
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

    public TollInvoiceResult withEntry(String entry) {
        this.entry = entry;
        return this;
    }

    /**
     * 入口。 
     * @return entry
     */
    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public TollInvoiceResult withExit(String exit) {
        this.exit = exit;
        return this;
    }

    /**
     * 出口。 
     * @return exit
     */
    public String getExit() {
        return exit;
    }

    public void setExit(String exit) {
        this.exit = exit;
    }

    public TollInvoiceResult withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 收费金额。 
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public TollInvoiceResult withCashier(String cashier) {
        this.cashier = cashier;
        return this;
    }

    /**
     * 收费员。 
     * @return cashier
     */
    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    public TollInvoiceResult withVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    /**
     * 车辆类型。 
     * @return vehicleType
     */
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public TollInvoiceResult withDate(String date) {
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

    public TollInvoiceResult withTime(String time) {
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

    public TollInvoiceResult withConfidence(Object confidence) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TollInvoiceResult tollInvoiceResult = (TollInvoiceResult) o;
        return Objects.equals(this.code, tollInvoiceResult.code)
            && Objects.equals(this.number, tollInvoiceResult.number)
            && Objects.equals(this.entry, tollInvoiceResult.entry) && Objects.equals(this.exit, tollInvoiceResult.exit)
            && Objects.equals(this.amount, tollInvoiceResult.amount)
            && Objects.equals(this.cashier, tollInvoiceResult.cashier)
            && Objects.equals(this.vehicleType, tollInvoiceResult.vehicleType)
            && Objects.equals(this.date, tollInvoiceResult.date) && Objects.equals(this.time, tollInvoiceResult.time)
            && Objects.equals(this.confidence, tollInvoiceResult.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, number, entry, exit, amount, cashier, vehicleType, date, time, confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TollInvoiceResult {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    entry: ").append(toIndentedString(entry)).append("\n");
        sb.append("    exit: ").append(toIndentedString(exit)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    cashier: ").append(toIndentedString(cashier)).append("\n");
        sb.append("    vehicleType: ").append(toIndentedString(vehicleType)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
