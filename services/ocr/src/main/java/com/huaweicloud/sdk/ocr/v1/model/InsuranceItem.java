package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * InsuranceItem
 */
public class InsuranceItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insurance_name")

    @JacksonXmlProperty(localName = "insurance_name")

    private InsurancePolicyDetail insuranceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insurance_period")

    @JacksonXmlProperty(localName = "insurance_period")

    private InsurancePolicyDetail insurancePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insurance_amount")

    @JacksonXmlProperty(localName = "insurance_amount")

    private InsurancePolicyDetail insuranceAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payment_frequency")

    @JacksonXmlProperty(localName = "payment_frequency")

    private InsurancePolicyDetail paymentFrequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payment_period")

    @JacksonXmlProperty(localName = "payment_period")

    private InsurancePolicyDetail paymentPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payment_amount")

    @JacksonXmlProperty(localName = "payment_amount")

    private InsurancePolicyDetail paymentAmount;

    public InsuranceItem withInsuranceName(InsurancePolicyDetail insuranceName) {
        this.insuranceName = insuranceName;
        return this;
    }

    public InsuranceItem withInsuranceName(Consumer<InsurancePolicyDetail> insuranceNameSetter) {
        if (this.insuranceName == null) {
            this.insuranceName = new InsurancePolicyDetail();
            insuranceNameSetter.accept(this.insuranceName);
        }

        return this;
    }

    /**
     * Get insuranceName
     * @return insuranceName
     */
    public InsurancePolicyDetail getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(InsurancePolicyDetail insuranceName) {
        this.insuranceName = insuranceName;
    }

    public InsuranceItem withInsurancePeriod(InsurancePolicyDetail insurancePeriod) {
        this.insurancePeriod = insurancePeriod;
        return this;
    }

    public InsuranceItem withInsurancePeriod(Consumer<InsurancePolicyDetail> insurancePeriodSetter) {
        if (this.insurancePeriod == null) {
            this.insurancePeriod = new InsurancePolicyDetail();
            insurancePeriodSetter.accept(this.insurancePeriod);
        }

        return this;
    }

    /**
     * Get insurancePeriod
     * @return insurancePeriod
     */
    public InsurancePolicyDetail getInsurancePeriod() {
        return insurancePeriod;
    }

    public void setInsurancePeriod(InsurancePolicyDetail insurancePeriod) {
        this.insurancePeriod = insurancePeriod;
    }

    public InsuranceItem withInsuranceAmount(InsurancePolicyDetail insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
        return this;
    }

    public InsuranceItem withInsuranceAmount(Consumer<InsurancePolicyDetail> insuranceAmountSetter) {
        if (this.insuranceAmount == null) {
            this.insuranceAmount = new InsurancePolicyDetail();
            insuranceAmountSetter.accept(this.insuranceAmount);
        }

        return this;
    }

    /**
     * Get insuranceAmount
     * @return insuranceAmount
     */
    public InsurancePolicyDetail getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(InsurancePolicyDetail insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public InsuranceItem withPaymentFrequency(InsurancePolicyDetail paymentFrequency) {
        this.paymentFrequency = paymentFrequency;
        return this;
    }

    public InsuranceItem withPaymentFrequency(Consumer<InsurancePolicyDetail> paymentFrequencySetter) {
        if (this.paymentFrequency == null) {
            this.paymentFrequency = new InsurancePolicyDetail();
            paymentFrequencySetter.accept(this.paymentFrequency);
        }

        return this;
    }

    /**
     * Get paymentFrequency
     * @return paymentFrequency
     */
    public InsurancePolicyDetail getPaymentFrequency() {
        return paymentFrequency;
    }

    public void setPaymentFrequency(InsurancePolicyDetail paymentFrequency) {
        this.paymentFrequency = paymentFrequency;
    }

    public InsuranceItem withPaymentPeriod(InsurancePolicyDetail paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
        return this;
    }

    public InsuranceItem withPaymentPeriod(Consumer<InsurancePolicyDetail> paymentPeriodSetter) {
        if (this.paymentPeriod == null) {
            this.paymentPeriod = new InsurancePolicyDetail();
            paymentPeriodSetter.accept(this.paymentPeriod);
        }

        return this;
    }

    /**
     * Get paymentPeriod
     * @return paymentPeriod
     */
    public InsurancePolicyDetail getPaymentPeriod() {
        return paymentPeriod;
    }

    public void setPaymentPeriod(InsurancePolicyDetail paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }

    public InsuranceItem withPaymentAmount(InsurancePolicyDetail paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }

    public InsuranceItem withPaymentAmount(Consumer<InsurancePolicyDetail> paymentAmountSetter) {
        if (this.paymentAmount == null) {
            this.paymentAmount = new InsurancePolicyDetail();
            paymentAmountSetter.accept(this.paymentAmount);
        }

        return this;
    }

    /**
     * Get paymentAmount
     * @return paymentAmount
     */
    public InsurancePolicyDetail getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(InsurancePolicyDetail paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InsuranceItem insuranceItem = (InsuranceItem) o;
        return Objects.equals(this.insuranceName, insuranceItem.insuranceName)
            && Objects.equals(this.insurancePeriod, insuranceItem.insurancePeriod)
            && Objects.equals(this.insuranceAmount, insuranceItem.insuranceAmount)
            && Objects.equals(this.paymentFrequency, insuranceItem.paymentFrequency)
            && Objects.equals(this.paymentPeriod, insuranceItem.paymentPeriod)
            && Objects.equals(this.paymentAmount, insuranceItem.paymentAmount);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(insuranceName, insurancePeriod, insuranceAmount, paymentFrequency, paymentPeriod, paymentAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InsuranceItem {\n");
        sb.append("    insuranceName: ").append(toIndentedString(insuranceName)).append("\n");
        sb.append("    insurancePeriod: ").append(toIndentedString(insurancePeriod)).append("\n");
        sb.append("    insuranceAmount: ").append(toIndentedString(insuranceAmount)).append("\n");
        sb.append("    paymentFrequency: ").append(toIndentedString(paymentFrequency)).append("\n");
        sb.append("    paymentPeriod: ").append(toIndentedString(paymentPeriod)).append("\n");
        sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
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
