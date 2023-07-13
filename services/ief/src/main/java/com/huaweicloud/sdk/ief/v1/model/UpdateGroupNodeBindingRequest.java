package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 绑定或解绑节点请求体
 */
public class UpdateGroupNodeBindingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_node_ids")

    private List<String> addNodeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_node_ids")

    private List<String> removeNodeIds = null;

    public UpdateGroupNodeBindingRequest withAddNodeIds(List<String> addNodeIds) {
        this.addNodeIds = addNodeIds;
        return this;
    }

    public UpdateGroupNodeBindingRequest addAddNodeIdsItem(String addNodeIdsItem) {
        if (this.addNodeIds == null) {
            this.addNodeIds = new ArrayList<>();
        }
        this.addNodeIds.add(addNodeIdsItem);
        return this;
    }

    public UpdateGroupNodeBindingRequest withAddNodeIds(Consumer<List<String>> addNodeIdsSetter) {
        if (this.addNodeIds == null) {
            this.addNodeIds = new ArrayList<>();
        }
        addNodeIdsSetter.accept(this.addNodeIds);
        return this;
    }

    /**
     * 新增绑定的节点ID列表
     * @return addNodeIds
     */
    public List<String> getAddNodeIds() {
        return addNodeIds;
    }

    public void setAddNodeIds(List<String> addNodeIds) {
        this.addNodeIds = addNodeIds;
    }

    public UpdateGroupNodeBindingRequest withRemoveNodeIds(List<String> removeNodeIds) {
        this.removeNodeIds = removeNodeIds;
        return this;
    }

    public UpdateGroupNodeBindingRequest addRemoveNodeIdsItem(String removeNodeIdsItem) {
        if (this.removeNodeIds == null) {
            this.removeNodeIds = new ArrayList<>();
        }
        this.removeNodeIds.add(removeNodeIdsItem);
        return this;
    }

    public UpdateGroupNodeBindingRequest withRemoveNodeIds(Consumer<List<String>> removeNodeIdsSetter) {
        if (this.removeNodeIds == null) {
            this.removeNodeIds = new ArrayList<>();
        }
        removeNodeIdsSetter.accept(this.removeNodeIds);
        return this;
    }

    /**
     * 新增解绑的节点ID列表
     * @return removeNodeIds
     */
    public List<String> getRemoveNodeIds() {
        return removeNodeIds;
    }

    public void setRemoveNodeIds(List<String> removeNodeIds) {
        this.removeNodeIds = removeNodeIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateGroupNodeBindingRequest that = (UpdateGroupNodeBindingRequest) obj;
        return Objects.equals(this.addNodeIds, that.addNodeIds)
            && Objects.equals(this.removeNodeIds, that.removeNodeIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addNodeIds, removeNodeIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGroupNodeBindingRequest {\n");
        sb.append("    addNodeIds: ").append(toIndentedString(addNodeIds)).append("\n");
        sb.append("    removeNodeIds: ").append(toIndentedString(removeNodeIds)).append("\n");
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
