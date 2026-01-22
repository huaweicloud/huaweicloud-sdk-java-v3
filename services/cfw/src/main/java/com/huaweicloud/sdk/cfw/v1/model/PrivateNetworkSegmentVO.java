package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 私网网段的详细信息，会将参数中conf_id的私网网段信息覆盖更新
 */
public class PrivateNetworkSegmentVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conf_id")

    private String confId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_network")

    private String protectNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_info")

    private String azInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_name")

    private String subnetName;

    public PrivateNetworkSegmentVO withConfId(String confId) {
        this.confId = confId;
        return this;
    }

    /**
     * **参数解释**： 私网网段ID，更新私网网段时需要 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return confId
     */
    public String getConfId() {
        return confId;
    }

    public void setConfId(String confId) {
        this.confId = confId;
    }

    public PrivateNetworkSegmentVO withProtectNetwork(String protectNetwork) {
        this.protectNetwork = protectNetwork;
        return this;
    }

    /**
     * **参数解释**： 私网网段，格式为：IP/Mask **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return protectNetwork
     */
    public String getProtectNetwork() {
        return protectNetwork;
    }

    public void setProtectNetwork(String protectNetwork) {
        this.protectNetwork = protectNetwork;
    }

    public PrivateNetworkSegmentVO withAzInfo(String azInfo) {
        this.azInfo = azInfo;
        return this;
    }

    /**
     * **参数解释**： 私网网段的可用区信息，如AZ1 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return azInfo
     */
    public String getAzInfo() {
        return azInfo;
    }

    public void setAzInfo(String azInfo) {
        this.azInfo = azInfo;
    }

    public PrivateNetworkSegmentVO withSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    /**
     * **参数解释**： 子网名称 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return subnetName
     */
    public String getSubnetName() {
        return subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateNetworkSegmentVO that = (PrivateNetworkSegmentVO) obj;
        return Objects.equals(this.confId, that.confId) && Objects.equals(this.protectNetwork, that.protectNetwork)
            && Objects.equals(this.azInfo, that.azInfo) && Objects.equals(this.subnetName, that.subnetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confId, protectNetwork, azInfo, subnetName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateNetworkSegmentVO {\n");
        sb.append("    confId: ").append(toIndentedString(confId)).append("\n");
        sb.append("    protectNetwork: ").append(toIndentedString(protectNetwork)).append("\n");
        sb.append("    azInfo: ").append(toIndentedString(azInfo)).append("\n");
        sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
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
