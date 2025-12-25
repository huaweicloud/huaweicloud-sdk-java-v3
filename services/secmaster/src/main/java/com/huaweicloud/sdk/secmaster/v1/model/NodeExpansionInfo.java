package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NodeExpansionInfo
 */
public class NodeExpansionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_label")

    private String customLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_center")

    private String dataCenter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintainer")

    private String maintainer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_plane")

    private String networkPlane;

    public NodeExpansionInfo withCustomLabel(String customLabel) {
        this.customLabel = customLabel;
        return this;
    }

    /**
     * 自定义标签
     * @return customLabel
     */
    public String getCustomLabel() {
        return customLabel;
    }

    public void setCustomLabel(String customLabel) {
        this.customLabel = customLabel;
    }

    public NodeExpansionInfo withDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    /**
     * 数据中心
     * @return dataCenter
     */
    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    public NodeExpansionInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NodeExpansionInfo withMaintainer(String maintainer) {
        this.maintainer = maintainer;
        return this;
    }

    /**
     * 维护人
     * @return maintainer
     */
    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public NodeExpansionInfo withNetworkPlane(String networkPlane) {
        this.networkPlane = networkPlane;
        return this;
    }

    /**
     * 网络平面
     * @return networkPlane
     */
    public String getNetworkPlane() {
        return networkPlane;
    }

    public void setNetworkPlane(String networkPlane) {
        this.networkPlane = networkPlane;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeExpansionInfo that = (NodeExpansionInfo) obj;
        return Objects.equals(this.customLabel, that.customLabel) && Objects.equals(this.dataCenter, that.dataCenter)
            && Objects.equals(this.description, that.description) && Objects.equals(this.maintainer, that.maintainer)
            && Objects.equals(this.networkPlane, that.networkPlane);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customLabel, dataCenter, description, maintainer, networkPlane);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeExpansionInfo {\n");
        sb.append("    customLabel: ").append(toIndentedString(customLabel)).append("\n");
        sb.append("    dataCenter: ").append(toIndentedString(dataCenter)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    maintainer: ").append(toIndentedString(maintainer)).append("\n");
        sb.append("    networkPlane: ").append(toIndentedString(networkPlane)).append("\n");
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
