package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业、算法的规格信息。
 */
public class FlavorResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_name")

    private String flavorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_num")

    private Integer maxNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_type")

    private String flavorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing")

    private BillingInfo billing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_info")

    private FlavorInfoResponse flavorInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private Map<String, String> attributes = null;

    public FlavorResponse withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * **参数解释**：训练作业选择的资源池ID。 **取值范围**：不涉及。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public FlavorResponse withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 资源规格的ID。
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public FlavorResponse withFlavorName(String flavorName) {
        this.flavorName = flavorName;
        return this;
    }

    /**
     * 资源规格的名称。
     * @return flavorName
     */
    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    public FlavorResponse withMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
        return this;
    }

    /**
     * 资源规格的最大节点数。
     * @return maxNum
     */
    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public FlavorResponse withFlavorType(String flavorType) {
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

    public FlavorResponse withBilling(BillingInfo billing) {
        this.billing = billing;
        return this;
    }

    public FlavorResponse withBilling(Consumer<BillingInfo> billingSetter) {
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

    public FlavorResponse withFlavorInfo(FlavorInfoResponse flavorInfo) {
        this.flavorInfo = flavorInfo;
        return this;
    }

    public FlavorResponse withFlavorInfo(Consumer<FlavorInfoResponse> flavorInfoSetter) {
        if (this.flavorInfo == null) {
            this.flavorInfo = new FlavorInfoResponse();
            flavorInfoSetter.accept(this.flavorInfo);
        }

        return this;
    }

    /**
     * Get flavorInfo
     * @return flavorInfo
     */
    public FlavorInfoResponse getFlavorInfo() {
        return flavorInfo;
    }

    public void setFlavorInfo(FlavorInfoResponse flavorInfo) {
        this.flavorInfo = flavorInfo;
    }

    public FlavorResponse withAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    public FlavorResponse putAttributesItem(String key, String attributesItem) {
        if (this.attributes == null) {
            this.attributes = new HashMap<>();
        }
        this.attributes.put(key, attributesItem);
        return this;
    }

    public FlavorResponse withAttributes(Consumer<Map<String, String>> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new HashMap<>();
        }
        attributesSetter.accept(this.attributes);
        return this;
    }

    /**
     * 其他规格属性。
     * @return attributes
     */
    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlavorResponse that = (FlavorResponse) obj;
        return Objects.equals(this.poolId, that.poolId) && Objects.equals(this.flavorId, that.flavorId)
            && Objects.equals(this.flavorName, that.flavorName) && Objects.equals(this.maxNum, that.maxNum)
            && Objects.equals(this.flavorType, that.flavorType) && Objects.equals(this.billing, that.billing)
            && Objects.equals(this.flavorInfo, that.flavorInfo) && Objects.equals(this.attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolId, flavorId, flavorName, maxNum, flavorType, billing, flavorInfo, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorResponse {\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    flavorName: ").append(toIndentedString(flavorName)).append("\n");
        sb.append("    maxNum: ").append(toIndentedString(maxNum)).append("\n");
        sb.append("    flavorType: ").append(toIndentedString(flavorType)).append("\n");
        sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
        sb.append("    flavorInfo: ").append(toIndentedString(flavorInfo)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
