package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * InsurantItem
 */
public class InsurantItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insurant_name")

    private InsurancePolicyDetail insurantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insurant_sex")

    private InsurancePolicyDetail insurantSex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insurant_birthday")

    private InsurancePolicyDetail insurantBirthday;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insurant_id_type")

    private InsurancePolicyDetail insurantIdType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insurant_id_number")

    private InsurancePolicyDetail insurantIdNumber;

    public InsurantItem withInsurantName(InsurancePolicyDetail insurantName) {
        this.insurantName = insurantName;
        return this;
    }

    public InsurantItem withInsurantName(Consumer<InsurancePolicyDetail> insurantNameSetter) {
        if (this.insurantName == null) {
            this.insurantName = new InsurancePolicyDetail();
            insurantNameSetter.accept(this.insurantName);
        }

        return this;
    }

    /**
     * Get insurantName
     * @return insurantName
     */
    public InsurancePolicyDetail getInsurantName() {
        return insurantName;
    }

    public void setInsurantName(InsurancePolicyDetail insurantName) {
        this.insurantName = insurantName;
    }

    public InsurantItem withInsurantSex(InsurancePolicyDetail insurantSex) {
        this.insurantSex = insurantSex;
        return this;
    }

    public InsurantItem withInsurantSex(Consumer<InsurancePolicyDetail> insurantSexSetter) {
        if (this.insurantSex == null) {
            this.insurantSex = new InsurancePolicyDetail();
            insurantSexSetter.accept(this.insurantSex);
        }

        return this;
    }

    /**
     * Get insurantSex
     * @return insurantSex
     */
    public InsurancePolicyDetail getInsurantSex() {
        return insurantSex;
    }

    public void setInsurantSex(InsurancePolicyDetail insurantSex) {
        this.insurantSex = insurantSex;
    }

    public InsurantItem withInsurantBirthday(InsurancePolicyDetail insurantBirthday) {
        this.insurantBirthday = insurantBirthday;
        return this;
    }

    public InsurantItem withInsurantBirthday(Consumer<InsurancePolicyDetail> insurantBirthdaySetter) {
        if (this.insurantBirthday == null) {
            this.insurantBirthday = new InsurancePolicyDetail();
            insurantBirthdaySetter.accept(this.insurantBirthday);
        }

        return this;
    }

    /**
     * Get insurantBirthday
     * @return insurantBirthday
     */
    public InsurancePolicyDetail getInsurantBirthday() {
        return insurantBirthday;
    }

    public void setInsurantBirthday(InsurancePolicyDetail insurantBirthday) {
        this.insurantBirthday = insurantBirthday;
    }

    public InsurantItem withInsurantIdType(InsurancePolicyDetail insurantIdType) {
        this.insurantIdType = insurantIdType;
        return this;
    }

    public InsurantItem withInsurantIdType(Consumer<InsurancePolicyDetail> insurantIdTypeSetter) {
        if (this.insurantIdType == null) {
            this.insurantIdType = new InsurancePolicyDetail();
            insurantIdTypeSetter.accept(this.insurantIdType);
        }

        return this;
    }

    /**
     * Get insurantIdType
     * @return insurantIdType
     */
    public InsurancePolicyDetail getInsurantIdType() {
        return insurantIdType;
    }

    public void setInsurantIdType(InsurancePolicyDetail insurantIdType) {
        this.insurantIdType = insurantIdType;
    }

    public InsurantItem withInsurantIdNumber(InsurancePolicyDetail insurantIdNumber) {
        this.insurantIdNumber = insurantIdNumber;
        return this;
    }

    public InsurantItem withInsurantIdNumber(Consumer<InsurancePolicyDetail> insurantIdNumberSetter) {
        if (this.insurantIdNumber == null) {
            this.insurantIdNumber = new InsurancePolicyDetail();
            insurantIdNumberSetter.accept(this.insurantIdNumber);
        }

        return this;
    }

    /**
     * Get insurantIdNumber
     * @return insurantIdNumber
     */
    public InsurancePolicyDetail getInsurantIdNumber() {
        return insurantIdNumber;
    }

    public void setInsurantIdNumber(InsurancePolicyDetail insurantIdNumber) {
        this.insurantIdNumber = insurantIdNumber;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InsurantItem that = (InsurantItem) obj;
        return Objects.equals(this.insurantName, that.insurantName)
            && Objects.equals(this.insurantSex, that.insurantSex)
            && Objects.equals(this.insurantBirthday, that.insurantBirthday)
            && Objects.equals(this.insurantIdType, that.insurantIdType)
            && Objects.equals(this.insurantIdNumber, that.insurantIdNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(insurantName, insurantSex, insurantBirthday, insurantIdType, insurantIdNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InsurantItem {\n");
        sb.append("    insurantName: ").append(toIndentedString(insurantName)).append("\n");
        sb.append("    insurantSex: ").append(toIndentedString(insurantSex)).append("\n");
        sb.append("    insurantBirthday: ").append(toIndentedString(insurantBirthday)).append("\n");
        sb.append("    insurantIdType: ").append(toIndentedString(insurantIdType)).append("\n");
        sb.append("    insurantIdNumber: ").append(toIndentedString(insurantIdNumber)).append("\n");
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
