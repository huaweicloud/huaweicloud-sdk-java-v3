package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateSqlLimitTaskNodeOption
 */
public class CreateSqlLimitTaskNodeOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_ids")

    private List<String> sqlIds = null;

    public CreateSqlLimitTaskNodeOption withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释**: 节点ID。 **约束限制**: 必须是当前实例的某一个节点ID。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public CreateSqlLimitTaskNodeOption withSqlIds(List<String> sqlIds) {
        this.sqlIds = sqlIds;
        return this;
    }

    public CreateSqlLimitTaskNodeOption addSqlIdsItem(String sqlIdsItem) {
        if (this.sqlIds == null) {
            this.sqlIds = new ArrayList<>();
        }
        this.sqlIds.add(sqlIdsItem);
        return this;
    }

    public CreateSqlLimitTaskNodeOption withSqlIds(Consumer<List<String>> sqlIdsSetter) {
        if (this.sqlIds == null) {
            this.sqlIds = new ArrayList<>();
        }
        sqlIdsSetter.accept(this.sqlIds);
        return this;
    }

    /**
     * **参数解释**: 该节点执行的SQL语句ID。 **约束限制**: 每个节点最多可以下发的SQL ID数量不可以超过10。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return sqlIds
     */
    public List<String> getSqlIds() {
        return sqlIds;
    }

    public void setSqlIds(List<String> sqlIds) {
        this.sqlIds = sqlIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSqlLimitTaskNodeOption that = (CreateSqlLimitTaskNodeOption) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.sqlIds, that.sqlIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, sqlIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSqlLimitTaskNodeOption {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    sqlIds: ").append(toIndentedString(sqlIds)).append("\n");
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
