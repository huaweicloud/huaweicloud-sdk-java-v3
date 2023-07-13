package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * BeneficiaryItem
 */
public class BeneficiaryItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "beneficiary_name")

    private InsurancePolicyDetail beneficiaryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "beneficiary_type")

    private InsurancePolicyDetail beneficiaryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "beneficiary_order")

    private InsurancePolicyDetail beneficiaryOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "beneficiary_share")

    private InsurancePolicyDetail beneficiaryShare;

    public BeneficiaryItem withBeneficiaryName(InsurancePolicyDetail beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
        return this;
    }

    public BeneficiaryItem withBeneficiaryName(Consumer<InsurancePolicyDetail> beneficiaryNameSetter) {
        if (this.beneficiaryName == null) {
            this.beneficiaryName = new InsurancePolicyDetail();
            beneficiaryNameSetter.accept(this.beneficiaryName);
        }

        return this;
    }

    /**
     * Get beneficiaryName
     * @return beneficiaryName
     */
    public InsurancePolicyDetail getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(InsurancePolicyDetail beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public BeneficiaryItem withBeneficiaryType(InsurancePolicyDetail beneficiaryType) {
        this.beneficiaryType = beneficiaryType;
        return this;
    }

    public BeneficiaryItem withBeneficiaryType(Consumer<InsurancePolicyDetail> beneficiaryTypeSetter) {
        if (this.beneficiaryType == null) {
            this.beneficiaryType = new InsurancePolicyDetail();
            beneficiaryTypeSetter.accept(this.beneficiaryType);
        }

        return this;
    }

    /**
     * Get beneficiaryType
     * @return beneficiaryType
     */
    public InsurancePolicyDetail getBeneficiaryType() {
        return beneficiaryType;
    }

    public void setBeneficiaryType(InsurancePolicyDetail beneficiaryType) {
        this.beneficiaryType = beneficiaryType;
    }

    public BeneficiaryItem withBeneficiaryOrder(InsurancePolicyDetail beneficiaryOrder) {
        this.beneficiaryOrder = beneficiaryOrder;
        return this;
    }

    public BeneficiaryItem withBeneficiaryOrder(Consumer<InsurancePolicyDetail> beneficiaryOrderSetter) {
        if (this.beneficiaryOrder == null) {
            this.beneficiaryOrder = new InsurancePolicyDetail();
            beneficiaryOrderSetter.accept(this.beneficiaryOrder);
        }

        return this;
    }

    /**
     * Get beneficiaryOrder
     * @return beneficiaryOrder
     */
    public InsurancePolicyDetail getBeneficiaryOrder() {
        return beneficiaryOrder;
    }

    public void setBeneficiaryOrder(InsurancePolicyDetail beneficiaryOrder) {
        this.beneficiaryOrder = beneficiaryOrder;
    }

    public BeneficiaryItem withBeneficiaryShare(InsurancePolicyDetail beneficiaryShare) {
        this.beneficiaryShare = beneficiaryShare;
        return this;
    }

    public BeneficiaryItem withBeneficiaryShare(Consumer<InsurancePolicyDetail> beneficiaryShareSetter) {
        if (this.beneficiaryShare == null) {
            this.beneficiaryShare = new InsurancePolicyDetail();
            beneficiaryShareSetter.accept(this.beneficiaryShare);
        }

        return this;
    }

    /**
     * Get beneficiaryShare
     * @return beneficiaryShare
     */
    public InsurancePolicyDetail getBeneficiaryShare() {
        return beneficiaryShare;
    }

    public void setBeneficiaryShare(InsurancePolicyDetail beneficiaryShare) {
        this.beneficiaryShare = beneficiaryShare;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BeneficiaryItem that = (BeneficiaryItem) obj;
        return Objects.equals(this.beneficiaryName, that.beneficiaryName)
            && Objects.equals(this.beneficiaryType, that.beneficiaryType)
            && Objects.equals(this.beneficiaryOrder, that.beneficiaryOrder)
            && Objects.equals(this.beneficiaryShare, that.beneficiaryShare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beneficiaryName, beneficiaryType, beneficiaryOrder, beneficiaryShare);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BeneficiaryItem {\n");
        sb.append("    beneficiaryName: ").append(toIndentedString(beneficiaryName)).append("\n");
        sb.append("    beneficiaryType: ").append(toIndentedString(beneficiaryType)).append("\n");
        sb.append("    beneficiaryOrder: ").append(toIndentedString(beneficiaryOrder)).append("\n");
        sb.append("    beneficiaryShare: ").append(toIndentedString(beneficiaryShare)).append("\n");
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
