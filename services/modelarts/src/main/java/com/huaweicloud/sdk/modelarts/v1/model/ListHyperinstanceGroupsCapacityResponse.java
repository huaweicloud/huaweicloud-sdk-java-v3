package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListHyperinstanceGroupsCapacityResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacities")

    private List<ServerHpsGroupCapacity> capacities = null;

    public ListHyperinstanceGroupsCapacityResponse withCapacities(List<ServerHpsGroupCapacity> capacities) {
        this.capacities = capacities;
        return this;
    }

    public ListHyperinstanceGroupsCapacityResponse addCapacitiesItem(ServerHpsGroupCapacity capacitiesItem) {
        if (this.capacities == null) {
            this.capacities = new ArrayList<>();
        }
        this.capacities.add(capacitiesItem);
        return this;
    }

    public ListHyperinstanceGroupsCapacityResponse withCapacities(
        Consumer<List<ServerHpsGroupCapacity>> capacitiesSetter) {
        if (this.capacities == null) {
            this.capacities = new ArrayList<>();
        }
        capacitiesSetter.accept(this.capacities);
        return this;
    }

    /**
     * **参数解释**：hyperinstance-group容量预测结果列表。 **默认取值**：不涉及。
     * @return capacities
     */
    public List<ServerHpsGroupCapacity> getCapacities() {
        return capacities;
    }

    public void setCapacities(List<ServerHpsGroupCapacity> capacities) {
        this.capacities = capacities;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHyperinstanceGroupsCapacityResponse that = (ListHyperinstanceGroupsCapacityResponse) obj;
        return Objects.equals(this.capacities, that.capacities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHyperinstanceGroupsCapacityResponse {\n");
        sb.append("    capacities: ").append(toIndentedString(capacities)).append("\n");
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
