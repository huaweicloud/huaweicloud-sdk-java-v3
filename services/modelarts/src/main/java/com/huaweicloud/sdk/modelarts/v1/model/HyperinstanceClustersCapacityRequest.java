package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HyperinstanceClustersCapacityRequest
 */
public class HyperinstanceClustersCapacityRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hyperinstance_cluster_ids")

    private List<String> hyperinstanceClusterIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_flavor")

    private String resourceFlavor;

    public HyperinstanceClustersCapacityRequest withHyperinstanceClusterIds(List<String> hyperinstanceClusterIds) {
        this.hyperinstanceClusterIds = hyperinstanceClusterIds;
        return this;
    }

    public HyperinstanceClustersCapacityRequest addHyperinstanceClusterIdsItem(String hyperinstanceClusterIdsItem) {
        if (this.hyperinstanceClusterIds == null) {
            this.hyperinstanceClusterIds = new ArrayList<>();
        }
        this.hyperinstanceClusterIds.add(hyperinstanceClusterIdsItem);
        return this;
    }

    public HyperinstanceClustersCapacityRequest withHyperinstanceClusterIds(
        Consumer<List<String>> hyperinstanceClusterIdsSetter) {
        if (this.hyperinstanceClusterIds == null) {
            this.hyperinstanceClusterIds = new ArrayList<>();
        }
        hyperinstanceClusterIdsSetter.accept(this.hyperinstanceClusterIds);
        return this;
    }

    /**
     * **参数解释**：超节点集群ID列表。 **约束限制**：数组长度0-5，每个元素长度1-128字符。 **默认取值**：不涉及。
     * @return hyperinstanceClusterIds
     */
    public List<String> getHyperinstanceClusterIds() {
        return hyperinstanceClusterIds;
    }

    public void setHyperinstanceClusterIds(List<String> hyperinstanceClusterIds) {
        this.hyperinstanceClusterIds = hyperinstanceClusterIds;
    }

    public HyperinstanceClustersCapacityRequest withFlavor(String flavor) {
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

    public HyperinstanceClustersCapacityRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * **参数解释**：可用区。 **约束限制**：长度1-65536个字符。 **默认取值**：不涉及。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public HyperinstanceClustersCapacityRequest withResourceFlavor(String resourceFlavor) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HyperinstanceClustersCapacityRequest that = (HyperinstanceClustersCapacityRequest) obj;
        return Objects.equals(this.hyperinstanceClusterIds, that.hyperinstanceClusterIds)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.resourceFlavor, that.resourceFlavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hyperinstanceClusterIds, flavor, availabilityZone, resourceFlavor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HyperinstanceClustersCapacityRequest {\n");
        sb.append("    hyperinstanceClusterIds: ").append(toIndentedString(hyperinstanceClusterIds)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    resourceFlavor: ").append(toIndentedString(resourceFlavor)).append("\n");
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
