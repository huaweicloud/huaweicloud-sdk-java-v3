package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListCloudPhoneServersModelOfferingsResponseBodyModels
 */
public class ListCloudPhoneServersModelOfferingsResponseBodyModels {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zone")

    private String availableZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_name")

    private String modelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sell_status")

    private String sellStatus;

    public ListCloudPhoneServersModelOfferingsResponseBodyModels withAvailableZone(String availableZone) {
        this.availableZone = availableZone;
        return this;
    }

    /**
     * 可用区
     * @return availableZone
     */
    public String getAvailableZone() {
        return availableZone;
    }

    public void setAvailableZone(String availableZone) {
        this.availableZone = availableZone;
    }

    public ListCloudPhoneServersModelOfferingsResponseBodyModels withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * 云手机服务器规格名
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public ListCloudPhoneServersModelOfferingsResponseBodyModels withSellStatus(String sellStatus) {
        this.sellStatus = sellStatus;
        return this;
    }

    /**
     * 云手机服务器规格的售卖状态。  - sellout：售罄  - available：可用
     * @return sellStatus
     */
    public String getSellStatus() {
        return sellStatus;
    }

    public void setSellStatus(String sellStatus) {
        this.sellStatus = sellStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCloudPhoneServersModelOfferingsResponseBodyModels that =
            (ListCloudPhoneServersModelOfferingsResponseBodyModels) obj;
        return Objects.equals(this.availableZone, that.availableZone) && Objects.equals(this.modelName, that.modelName)
            && Objects.equals(this.sellStatus, that.sellStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availableZone, modelName, sellStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloudPhoneServersModelOfferingsResponseBodyModels {\n");
        sb.append("    availableZone: ").append(toIndentedString(availableZone)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
        sb.append("    sellStatus: ").append(toIndentedString(sellStatus)).append("\n");
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
