package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteNodeRequestBody
 */
public class DeleteNodeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_ids")

    private List<String> deleteIds = null;

    public DeleteNodeRequestBody withDeleteIds(List<String> deleteIds) {
        this.deleteIds = deleteIds;
        return this;
    }

    public DeleteNodeRequestBody addDeleteIdsItem(String deleteIdsItem) {
        if (this.deleteIds == null) {
            this.deleteIds = new ArrayList<>();
        }
        this.deleteIds.add(deleteIdsItem);
        return this;
    }

    public DeleteNodeRequestBody withDeleteIds(Consumer<List<String>> deleteIdsSetter) {
        if (this.deleteIds == null) {
            this.deleteIds = new ArrayList<>();
        }
        deleteIdsSetter.accept(this.deleteIds);
        return this;
    }

    /**
     * 节点ID列表
     * @return deleteIds
     */
    public List<String> getDeleteIds() {
        return deleteIds;
    }

    public void setDeleteIds(List<String> deleteIds) {
        this.deleteIds = deleteIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteNodeRequestBody that = (DeleteNodeRequestBody) obj;
        return Objects.equals(this.deleteIds, that.deleteIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteNodeRequestBody {\n");
        sb.append("    deleteIds: ").append(toIndentedString(deleteIds)).append("\n");
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
