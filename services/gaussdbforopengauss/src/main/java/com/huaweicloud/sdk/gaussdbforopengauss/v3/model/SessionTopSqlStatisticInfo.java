package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SessionTopSqlStatisticInfo
 */
public class SessionTopSqlStatisticInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique_sql_id")

    private String uniqueSqlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    public SessionTopSqlStatisticInfo withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * **参数解释**: 节点名称。 **取值范围**: 不涉及。 
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public SessionTopSqlStatisticInfo withUniqueSqlId(String uniqueSqlId) {
        this.uniqueSqlId = uniqueSqlId;
        return this;
    }

    /**
     * **参数解释**: 归一化SQL ID。 **取值范围**: 不涉及。 
     * @return uniqueSqlId
     */
    public String getUniqueSqlId() {
        return uniqueSqlId;
    }

    public void setUniqueSqlId(String uniqueSqlId) {
        this.uniqueSqlId = uniqueSqlId;
    }

    public SessionTopSqlStatisticInfo withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * **参数解释**: 查询语句。 **取值范围**: 不涉及。 
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SessionTopSqlStatisticInfo that = (SessionTopSqlStatisticInfo) obj;
        return Objects.equals(this.nodeName, that.nodeName) && Objects.equals(this.uniqueSqlId, that.uniqueSqlId)
            && Objects.equals(this.query, that.query);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeName, uniqueSqlId, query);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SessionTopSqlStatisticInfo {\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    uniqueSqlId: ").append(toIndentedString(uniqueSqlId)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
