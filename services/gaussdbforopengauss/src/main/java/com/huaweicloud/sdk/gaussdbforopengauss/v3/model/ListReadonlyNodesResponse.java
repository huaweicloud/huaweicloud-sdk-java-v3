package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListReadonlyNodesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<ListReadonlyNodesResult> instances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_readonly_node_num")

    private Integer maxReadonlyNodeNum;

    public ListReadonlyNodesResponse withInstances(List<ListReadonlyNodesResult> instances) {
        this.instances = instances;
        return this;
    }

    public ListReadonlyNodesResponse addInstancesItem(ListReadonlyNodesResult instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListReadonlyNodesResponse withInstances(Consumer<List<ListReadonlyNodesResult>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * **参数解释**: 只读节点列表。 **约束限制**: 不涉及。
     * @return instances
     */
    public List<ListReadonlyNodesResult> getInstances() {
        return instances;
    }

    public void setInstances(List<ListReadonlyNodesResult> instances) {
        this.instances = instances;
    }

    public ListReadonlyNodesResponse withMaxReadonlyNodeNum(Integer maxReadonlyNodeNum) {
        this.maxReadonlyNodeNum = maxReadonlyNodeNum;
        return this;
    }

    /**
     * **参数解释**: 数据库名称。 **取值范围**: 不涉及。
     * @return maxReadonlyNodeNum
     */
    public Integer getMaxReadonlyNodeNum() {
        return maxReadonlyNodeNum;
    }

    public void setMaxReadonlyNodeNum(Integer maxReadonlyNodeNum) {
        this.maxReadonlyNodeNum = maxReadonlyNodeNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListReadonlyNodesResponse that = (ListReadonlyNodesResponse) obj;
        return Objects.equals(this.instances, that.instances)
            && Objects.equals(this.maxReadonlyNodeNum, that.maxReadonlyNodeNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instances, maxReadonlyNodeNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReadonlyNodesResponse {\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    maxReadonlyNodeNum: ").append(toIndentedString(maxReadonlyNodeNum)).append("\n");
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
