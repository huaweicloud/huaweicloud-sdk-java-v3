package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业、算法的规格信息（该字段只有公共资源池存在）。
 */
public class FlavorDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_type")

    private String flavorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing")

    private BillingInfo billing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_info")

    private FlavorInfo flavorInfo;

    public FlavorDetail withFlavorType(String flavorType) {
        this.flavorType = flavorType;
        return this;
    }

    /**
     * 资源规格的类型。可选值如下： - CPU - GPU - [Ascend](tag:hc,hk,fcs_super)
     * @return flavorType
     */
    public String getFlavorType() {
        return flavorType;
    }

    public void setFlavorType(String flavorType) {
        this.flavorType = flavorType;
    }

    public FlavorDetail withBilling(BillingInfo billing) {
        this.billing = billing;
        return this;
    }

    public FlavorDetail withBilling(Consumer<BillingInfo> billingSetter) {
        if (this.billing == null) {
            this.billing = new BillingInfo();
            billingSetter.accept(this.billing);
        }

        return this;
    }

    /**
     * Get billing
     * @return billing
     */
    public BillingInfo getBilling() {
        return billing;
    }

    public void setBilling(BillingInfo billing) {
        this.billing = billing;
    }

    public FlavorDetail withFlavorInfo(FlavorInfo flavorInfo) {
        this.flavorInfo = flavorInfo;
        return this;
    }

    public FlavorDetail withFlavorInfo(Consumer<FlavorInfo> flavorInfoSetter) {
        if (this.flavorInfo == null) {
            this.flavorInfo = new FlavorInfo();
            flavorInfoSetter.accept(this.flavorInfo);
        }

        return this;
    }

    /**
     * Get flavorInfo
     * @return flavorInfo
     */
    public FlavorInfo getFlavorInfo() {
        return flavorInfo;
    }

    public void setFlavorInfo(FlavorInfo flavorInfo) {
        this.flavorInfo = flavorInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlavorDetail that = (FlavorDetail) obj;
        return Objects.equals(this.flavorType, that.flavorType) && Objects.equals(this.billing, that.billing)
            && Objects.equals(this.flavorInfo, that.flavorInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorType, billing, flavorInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorDetail {\n");
        sb.append("    flavorType: ").append(toIndentedString(flavorType)).append("\n");
        sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
        sb.append("    flavorInfo: ").append(toIndentedString(flavorInfo)).append("\n");
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
