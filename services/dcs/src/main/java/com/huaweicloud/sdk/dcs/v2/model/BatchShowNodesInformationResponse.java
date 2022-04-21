package com.huaweicloud.sdk.dcs.v2.model;

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
public class BatchShowNodesInformationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<InstanceNodesInfoResp> instances = null;

    public BatchShowNodesInformationResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 查询结果的实例总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BatchShowNodesInformationResponse withInstances(List<InstanceNodesInfoResp> instances) {
        this.instances = instances;
        return this;
    }

    public BatchShowNodesInformationResponse addInstancesItem(InstanceNodesInfoResp instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public BatchShowNodesInformationResponse withInstances(Consumer<List<InstanceNodesInfoResp>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 实例列表。
     * @return instances
     */
    public List<InstanceNodesInfoResp> getInstances() {
        return instances;
    }

    public void setInstances(List<InstanceNodesInfoResp> instances) {
        this.instances = instances;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchShowNodesInformationResponse batchShowNodesInformationResponse = (BatchShowNodesInformationResponse) o;
        return Objects.equals(this.count, batchShowNodesInformationResponse.count)
            && Objects.equals(this.instances, batchShowNodesInformationResponse.instances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, instances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchShowNodesInformationResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
