package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HyperinstanceGroupsCapacityRequest
 */
public class HyperinstanceGroupsCapacityRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hyperinstance_group_ids")

    private List<String> hyperinstanceGroupIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_flavor")

    private String resourceFlavor;

    public HyperinstanceGroupsCapacityRequest withHyperinstanceGroupIds(List<String> hyperinstanceGroupIds) {
        this.hyperinstanceGroupIds = hyperinstanceGroupIds;
        return this;
    }

    public HyperinstanceGroupsCapacityRequest addHyperinstanceGroupIdsItem(String hyperinstanceGroupIdsItem) {
        if (this.hyperinstanceGroupIds == null) {
            this.hyperinstanceGroupIds = new ArrayList<>();
        }
        this.hyperinstanceGroupIds.add(hyperinstanceGroupIdsItem);
        return this;
    }

    public HyperinstanceGroupsCapacityRequest withHyperinstanceGroupIds(
        Consumer<List<String>> hyperinstanceGroupIdsSetter) {
        if (this.hyperinstanceGroupIds == null) {
            this.hyperinstanceGroupIds = new ArrayList<>();
        }
        hyperinstanceGroupIdsSetter.accept(this.hyperinstanceGroupIds);
        return this;
    }

    /**
     * **参数解释**：hyperinstance-group ID列表。 **默认取值**：不涉及。 **取值范围**：1-5
     * @return hyperinstanceGroupIds
     */
    public List<String> getHyperinstanceGroupIds() {
        return hyperinstanceGroupIds;
    }

    public void setHyperinstanceGroupIds(List<String> hyperinstanceGroupIds) {
        this.hyperinstanceGroupIds = hyperinstanceGroupIds;
    }

    public HyperinstanceGroupsCapacityRequest withAvailabilityZone(String availabilityZone) {
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

    public HyperinstanceGroupsCapacityRequest withResourceFlavor(String resourceFlavor) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HyperinstanceGroupsCapacityRequest that = (HyperinstanceGroupsCapacityRequest) obj;
        return Objects.equals(this.hyperinstanceGroupIds, that.hyperinstanceGroupIds)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.resourceFlavor, that.resourceFlavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hyperinstanceGroupIds, availabilityZone, resourceFlavor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HyperinstanceGroupsCapacityRequest {\n");
        sb.append("    hyperinstanceGroupIds: ").append(toIndentedString(hyperinstanceGroupIds)).append("\n");
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
