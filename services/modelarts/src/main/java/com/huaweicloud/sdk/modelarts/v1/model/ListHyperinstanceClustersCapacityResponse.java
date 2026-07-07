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
public class ListHyperinstanceClustersCapacityResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacities")

    private List<ServerHpsClusterCapacity> capacities = null;

    public ListHyperinstanceClustersCapacityResponse withCapacities(List<ServerHpsClusterCapacity> capacities) {
        this.capacities = capacities;
        return this;
    }

    public ListHyperinstanceClustersCapacityResponse addCapacitiesItem(ServerHpsClusterCapacity capacitiesItem) {
        if (this.capacities == null) {
            this.capacities = new ArrayList<>();
        }
        this.capacities.add(capacitiesItem);
        return this;
    }

    public ListHyperinstanceClustersCapacityResponse withCapacities(
        Consumer<List<ServerHpsClusterCapacity>> capacitiesSetter) {
        if (this.capacities == null) {
            this.capacities = new ArrayList<>();
        }
        capacitiesSetter.accept(this.capacities);
        return this;
    }

    /**
     * 容量信息列表
     * @return capacities
     */
    public List<ServerHpsClusterCapacity> getCapacities() {
        return capacities;
    }

    public void setCapacities(List<ServerHpsClusterCapacity> capacities) {
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
        ListHyperinstanceClustersCapacityResponse that = (ListHyperinstanceClustersCapacityResponse) obj;
        return Objects.equals(this.capacities, that.capacities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHyperinstanceClustersCapacityResponse {\n");
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
