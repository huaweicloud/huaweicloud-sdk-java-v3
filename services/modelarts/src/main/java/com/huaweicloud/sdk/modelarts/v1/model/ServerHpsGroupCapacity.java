package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ServerHpsGroupCapacity
 */
public class ServerHpsGroupCapacity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hyperinstance_group_id")

    private String hyperinstanceGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hyperinstance_group_name")

    private String hyperinstanceGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hyperinstance_cluster_id")

    private String hyperinstanceClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_flavor")

    private String resourceFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_sold_out")

    private Boolean isSoldOut;

    public ServerHpsGroupCapacity withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * **参数解释**：可用区。 **默认取值**：不涉及。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ServerHpsGroupCapacity withHyperinstanceGroupId(String hyperinstanceGroupId) {
        this.hyperinstanceGroupId = hyperinstanceGroupId;
        return this;
    }

    /**
     * **参数解释**：hyperinstance-group ID。 **默认取值**：不涉及。
     * @return hyperinstanceGroupId
     */
    public String getHyperinstanceGroupId() {
        return hyperinstanceGroupId;
    }

    public void setHyperinstanceGroupId(String hyperinstanceGroupId) {
        this.hyperinstanceGroupId = hyperinstanceGroupId;
    }

    public ServerHpsGroupCapacity withHyperinstanceGroupName(String hyperinstanceGroupName) {
        this.hyperinstanceGroupName = hyperinstanceGroupName;
        return this;
    }

    /**
     * **参数解释**：hyperinstance-group名称。 **默认取值**：不涉及。
     * @return hyperinstanceGroupName
     */
    public String getHyperinstanceGroupName() {
        return hyperinstanceGroupName;
    }

    public void setHyperinstanceGroupName(String hyperinstanceGroupName) {
        this.hyperinstanceGroupName = hyperinstanceGroupName;
    }

    public ServerHpsGroupCapacity withHyperinstanceClusterId(String hyperinstanceClusterId) {
        this.hyperinstanceClusterId = hyperinstanceClusterId;
        return this;
    }

    /**
     * **参数解释**：超节点集群ID。 **默认取值**：不涉及。
     * @return hyperinstanceClusterId
     */
    public String getHyperinstanceClusterId() {
        return hyperinstanceClusterId;
    }

    public void setHyperinstanceClusterId(String hyperinstanceClusterId) {
        this.hyperinstanceClusterId = hyperinstanceClusterId;
    }

    public ServerHpsGroupCapacity withResourceFlavor(String resourceFlavor) {
        this.resourceFlavor = resourceFlavor;
        return this;
    }

    /**
     * **参数解释**：规格名称。 **默认取值**：不涉及。
     * @return resourceFlavor
     */
    public String getResourceFlavor() {
        return resourceFlavor;
    }

    public void setResourceFlavor(String resourceFlavor) {
        this.resourceFlavor = resourceFlavor;
    }

    public ServerHpsGroupCapacity withIsSoldOut(Boolean isSoldOut) {
        this.isSoldOut = isSoldOut;
        return this;
    }

    /**
     * **参数解释**：是否售罄。 **默认取值**：不涉及。
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
        ServerHpsGroupCapacity that = (ServerHpsGroupCapacity) obj;
        return Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.hyperinstanceGroupId, that.hyperinstanceGroupId)
            && Objects.equals(this.hyperinstanceGroupName, that.hyperinstanceGroupName)
            && Objects.equals(this.hyperinstanceClusterId, that.hyperinstanceClusterId)
            && Objects.equals(this.resourceFlavor, that.resourceFlavor)
            && Objects.equals(this.isSoldOut, that.isSoldOut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZone,
            hyperinstanceGroupId,
            hyperinstanceGroupName,
            hyperinstanceClusterId,
            resourceFlavor,
            isSoldOut);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerHpsGroupCapacity {\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    hyperinstanceGroupId: ").append(toIndentedString(hyperinstanceGroupId)).append("\n");
        sb.append("    hyperinstanceGroupName: ").append(toIndentedString(hyperinstanceGroupName)).append("\n");
        sb.append("    hyperinstanceClusterId: ").append(toIndentedString(hyperinstanceClusterId)).append("\n");
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
