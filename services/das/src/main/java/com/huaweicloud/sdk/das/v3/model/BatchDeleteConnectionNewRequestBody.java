package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteConnectionNewRequestBody
 */
public class BatchDeleteConnectionNewRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_all")

    private Boolean deleteAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_ids")

    private List<ConnectionIdsItem> connectionIds = null;

    public BatchDeleteConnectionNewRequestBody withDeleteAll(Boolean deleteAll) {
        this.deleteAll = deleteAll;
        return this;
    }

    /**
     * 是否删除所有连接
     * @return deleteAll
     */
    public Boolean getDeleteAll() {
        return deleteAll;
    }

    public void setDeleteAll(Boolean deleteAll) {
        this.deleteAll = deleteAll;
    }

    public BatchDeleteConnectionNewRequestBody withConnectionIds(List<ConnectionIdsItem> connectionIds) {
        this.connectionIds = connectionIds;
        return this;
    }

    public BatchDeleteConnectionNewRequestBody addConnectionIdsItem(ConnectionIdsItem connectionIdsItem) {
        if (this.connectionIds == null) {
            this.connectionIds = new ArrayList<>();
        }
        this.connectionIds.add(connectionIdsItem);
        return this;
    }

    public BatchDeleteConnectionNewRequestBody withConnectionIds(
        Consumer<List<ConnectionIdsItem>> connectionIdsSetter) {
        if (this.connectionIds == null) {
            this.connectionIds = new ArrayList<>();
        }
        connectionIdsSetter.accept(this.connectionIds);
        return this;
    }

    /**
     * 连接ID列表
     * @return connectionIds
     */
    public List<ConnectionIdsItem> getConnectionIds() {
        return connectionIds;
    }

    public void setConnectionIds(List<ConnectionIdsItem> connectionIds) {
        this.connectionIds = connectionIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteConnectionNewRequestBody that = (BatchDeleteConnectionNewRequestBody) obj;
        return Objects.equals(this.deleteAll, that.deleteAll) && Objects.equals(this.connectionIds, that.connectionIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteAll, connectionIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteConnectionNewRequestBody {\n");
        sb.append("    deleteAll: ").append(toIndentedString(deleteAll)).append("\n");
        sb.append("    connectionIds: ").append(toIndentedString(connectionIds)).append("\n");
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
