package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ServerHpsClusterCapacity
 */
public class ServerHpsClusterCapacity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hyperinstance_cluster_id")

    private String hyperinstanceClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hyperinstance_cluster_name")

    private String hyperinstanceClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_flavor")

    private String resourceFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_sold_out")

    private Boolean isSoldOut;

    public ServerHpsClusterCapacity withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释**：规格名称。 **约束限制**：长度1-65536个字符。 **默认取值**：不涉及。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public ServerHpsClusterCapacity withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * **参数解释**：可用区ID。 **约束限制**：长度1-65536个字符。 **默认取值**：不涉及。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ServerHpsClusterCapacity withHyperinstanceClusterId(String hyperinstanceClusterId) {
        this.hyperinstanceClusterId = hyperinstanceClusterId;
        return this;
    }

    /**
     * **参数解释**：超节点集群ID。 **约束限制**：长度1-65536个字符。 **默认取值**：不涉及。
     * @return hyperinstanceClusterId
     */
    public String getHyperinstanceClusterId() {
        return hyperinstanceClusterId;
    }

    public void setHyperinstanceClusterId(String hyperinstanceClusterId) {
        this.hyperinstanceClusterId = hyperinstanceClusterId;
    }

    public ServerHpsClusterCapacity withHyperinstanceClusterName(String hyperinstanceClusterName) {
        this.hyperinstanceClusterName = hyperinstanceClusterName;
        return this;
    }

    /**
     * **参数解释**：超节点集群名称。 **约束限制**：长度1-65536个字符。 **默认取值**：不涉及。
     * @return hyperinstanceClusterName
     */
    public String getHyperinstanceClusterName() {
        return hyperinstanceClusterName;
    }

    public void setHyperinstanceClusterName(String hyperinstanceClusterName) {
        this.hyperinstanceClusterName = hyperinstanceClusterName;
    }

    public ServerHpsClusterCapacity withResourceFlavor(String resourceFlavor) {
        this.resourceFlavor = resourceFlavor;
        return this;
    }

    /**
     * **参数解释**：资源规格。 **约束限制**：长度1-65536个字符。 **默认取值**：不涉及。
     * @return resourceFlavor
     */
    public String getResourceFlavor() {
        return resourceFlavor;
    }

    public void setResourceFlavor(String resourceFlavor) {
        this.resourceFlavor = resourceFlavor;
    }

    public ServerHpsClusterCapacity withIsSoldOut(Boolean isSoldOut) {
        this.isSoldOut = isSoldOut;
        return this;
    }

    /**
     * **参数解释**：售罄状态。 **约束限制**：布尔值（true/false）。 **默认取值**：不涉及。
     * @return isSoldOut
     */
    public Boolean getIsSoldOut() {
        return isSoldOut;
    }

    public void setIsSoldOut(Boolean isSoldOut) {
        this.isSoldOut = isSoldOut;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerHpsClusterCapacity that = (ServerHpsClusterCapacity) obj;
        return Objects.equals(this.flavor, that.flavor) && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.hyperinstanceClusterId, that.hyperinstanceClusterId)
            && Objects.equals(this.hyperinstanceClusterName, that.hyperinstanceClusterName)
            && Objects.equals(this.resourceFlavor, that.resourceFlavor)
            && Objects.equals(this.isSoldOut, that.isSoldOut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor,
            availabilityZone,
            hyperinstanceClusterId,
            hyperinstanceClusterName,
            resourceFlavor,
            isSoldOut);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerHpsClusterCapacity {\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    hyperinstanceClusterId: ").append(toIndentedString(hyperinstanceClusterId)).append("\n");
        sb.append("    hyperinstanceClusterName: ").append(toIndentedString(hyperinstanceClusterName)).append("\n");
        sb.append("    resourceFlavor: ").append(toIndentedString(resourceFlavor)).append("\n");
        sb.append("    isSoldOut: ").append(toIndentedString(isSoldOut)).append("\n");
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
