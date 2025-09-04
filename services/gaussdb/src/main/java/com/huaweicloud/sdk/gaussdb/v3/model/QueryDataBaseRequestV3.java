package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询HTAP主实例数据库请求体。
 */
public class QueryDataBaseRequestV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<String> databases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance_id")

    private String sourceInstanceId;

    public QueryDataBaseRequestV3 withDatabases(List<String> databases) {
        this.databases = databases;
        return this;
    }

    public QueryDataBaseRequestV3 addDatabasesItem(String databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public QueryDataBaseRequestV3 withDatabases(Consumer<List<String>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * **参数解释**：  查询的数据库名称。  **约束限制**：  仅支持英文大小写字母、数字以及下划线，模糊搜索时列表元素数目必须为1。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return databases
     */
    public List<String> getDatabases() {
        return databases;
    }

    public void setDatabases(List<String> databases) {
        this.databases = databases;
    }

    public QueryDataBaseRequestV3 withSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    /**
     * **参数解释**：  需要查询数据库的源实例ID，严格匹配UUID规则。  **约束限制**：  只能由英文字母、数字组成，且长度为36个字符。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    public void setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryDataBaseRequestV3 that = (QueryDataBaseRequestV3) obj;
        return Objects.equals(this.databases, that.databases)
            && Objects.equals(this.sourceInstanceId, that.sourceInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databases, sourceInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDataBaseRequestV3 {\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    sourceInstanceId: ").append(toIndentedString(sourceInstanceId)).append("\n");
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
