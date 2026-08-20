package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowChargeModesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_type")

    private String productType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_area")

    private String serviceArea;

    public ShowChargeModesRequest withProductType(String productType) {
        this.productType = productType;
        return this;
    }

    /**
     * **参数解释：** 加速类型 **约束限制：** 不涉及 **取值范围：** - base：基础加速 **默认取值：** 不涉及
     * @return productType
     */
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public ShowChargeModesRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 查询计费模式状态 **约束限制：** 不涉及 **取值范围：** - active：已生效 - upcoming：待生效 **默认取值：** active：已生效
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowChargeModesRequest withServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }

    /**
     * **参数解释：** 服务范围 **约束限制：** 不涉及 **取值范围：** - mainland_china：中国大陆 - outside_mainland_china：中国大陆境外 **默认取值：** mainland_china：中国大陆
     * @return serviceArea
     */
    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowChargeModesRequest that = (ShowChargeModesRequest) obj;
        return Objects.equals(this.productType, that.productType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.serviceArea, that.serviceArea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productType, status, serviceArea);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowChargeModesRequest {\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    serviceArea: ").append(toIndentedString(serviceArea)).append("\n");
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
