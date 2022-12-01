package com.huaweicloud.sdk.dws.v2.model;

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
public class ListClusterCnResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_num")

    private Integer minNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_num")

    private Integer maxNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<CoordinatorNode> instances = null;

    public ListClusterCnResponse withMinNum(Integer minNum) {
        this.minNum = minNum;
        return this;
    }

    /**
     * 集群支持的最小CN节点数量。
     * @return minNum
     */
    public Integer getMinNum() {
        return minNum;
    }

    public void setMinNum(Integer minNum) {
        this.minNum = minNum;
    }

    public ListClusterCnResponse withMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
        return this;
    }

    /**
     * 集群支持的最大CN节点数量。
     * @return maxNum
     */
    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public ListClusterCnResponse withInstances(List<CoordinatorNode> instances) {
        this.instances = instances;
        return this;
    }

    public ListClusterCnResponse addInstancesItem(CoordinatorNode instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListClusterCnResponse withInstances(Consumer<List<CoordinatorNode>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * CN节点详情列表。
     * @return instances
     */
    public List<CoordinatorNode> getInstances() {
        return instances;
    }

    public void setInstances(List<CoordinatorNode> instances) {
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
        ListClusterCnResponse listClusterCnResponse = (ListClusterCnResponse) o;
        return Objects.equals(this.minNum, listClusterCnResponse.minNum)
            && Objects.equals(this.maxNum, listClusterCnResponse.maxNum)
            && Objects.equals(this.instances, listClusterCnResponse.instances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minNum, maxNum, instances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterCnResponse {\n");
        sb.append("    minNum: ").append(toIndentedString(minNum)).append("\n");
        sb.append("    maxNum: ").append(toIndentedString(maxNum)).append("\n");
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
