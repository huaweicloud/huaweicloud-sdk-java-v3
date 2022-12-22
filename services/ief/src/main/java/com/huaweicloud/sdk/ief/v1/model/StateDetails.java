package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IEC/IES节点状态详情
 */
public class StateDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_stat")

    private String registerStat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "purchase_stat")

    private String purchaseStat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "purchase_error")

    private String purchaseError;

    public StateDetails withRegisterStat(String registerStat) {
        this.registerStat = registerStat;
        return this;
    }

    /**
     * IEC/IES节点注册状态
     * @return registerStat
     */
    public String getRegisterStat() {
        return registerStat;
    }

    public void setRegisterStat(String registerStat) {
        this.registerStat = registerStat;
    }

    public StateDetails withPurchaseStat(String purchaseStat) {
        this.purchaseStat = purchaseStat;
        return this;
    }

    /**
     * IEC/IES节点状态
     * @return purchaseStat
     */
    public String getPurchaseStat() {
        return purchaseStat;
    }

    public void setPurchaseStat(String purchaseStat) {
        this.purchaseStat = purchaseStat;
    }

    public StateDetails withPurchaseError(String purchaseError) {
        this.purchaseError = purchaseError;
        return this;
    }

    /**
     * IEC/IES节点错误信息
     * @return purchaseError
     */
    public String getPurchaseError() {
        return purchaseError;
    }

    public void setPurchaseError(String purchaseError) {
        this.purchaseError = purchaseError;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StateDetails stateDetails = (StateDetails) o;
        return Objects.equals(this.registerStat, stateDetails.registerStat)
            && Objects.equals(this.purchaseStat, stateDetails.purchaseStat)
            && Objects.equals(this.purchaseError, stateDetails.purchaseError);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registerStat, purchaseStat, purchaseError);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StateDetails {\n");
        sb.append("    registerStat: ").append(toIndentedString(registerStat)).append("\n");
        sb.append("    purchaseStat: ").append(toIndentedString(purchaseStat)).append("\n");
        sb.append("    purchaseError: ").append(toIndentedString(purchaseError)).append("\n");
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
