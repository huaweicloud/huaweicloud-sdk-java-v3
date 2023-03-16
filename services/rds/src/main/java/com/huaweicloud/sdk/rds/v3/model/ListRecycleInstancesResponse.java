package com.huaweicloud.sdk.rds.v3.model;

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
public class ListRecycleInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<RecycleInstsanceV3> instances = null;

    public ListRecycleInstancesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 回收站数据条数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListRecycleInstancesResponse withInstances(List<RecycleInstsanceV3> instances) {
        this.instances = instances;
        return this;
    }

    public ListRecycleInstancesResponse addInstancesItem(RecycleInstsanceV3 instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListRecycleInstancesResponse withInstances(Consumer<List<RecycleInstsanceV3>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 回收站信息
     * @return instances
     */
    public List<RecycleInstsanceV3> getInstances() {
        return instances;
    }

    public void setInstances(List<RecycleInstsanceV3> instances) {
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
        ListRecycleInstancesResponse listRecycleInstancesResponse = (ListRecycleInstancesResponse) o;
        return Objects.equals(this.totalCount, listRecycleInstancesResponse.totalCount)
            && Objects.equals(this.instances, listRecycleInstancesResponse.instances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, instances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRecycleInstancesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
