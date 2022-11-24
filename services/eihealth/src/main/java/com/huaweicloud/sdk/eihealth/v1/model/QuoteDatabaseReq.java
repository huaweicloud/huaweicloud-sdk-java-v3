package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导入实例请求体
 */
public class QuoteDatabaseReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_id")

    private String sourceProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_databases")

    private List<DatabaseSrcReq> sourceDatabases = null;

    public QuoteDatabaseReq withSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }

    /**
     * 源项目id
     * @return sourceProjectId
     */
    public String getSourceProjectId() {
        return sourceProjectId;
    }

    public void setSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
    }

    public QuoteDatabaseReq withSourceDatabases(List<DatabaseSrcReq> sourceDatabases) {
        this.sourceDatabases = sourceDatabases;
        return this;
    }

    public QuoteDatabaseReq addSourceDatabasesItem(DatabaseSrcReq sourceDatabasesItem) {
        if (this.sourceDatabases == null) {
            this.sourceDatabases = new ArrayList<>();
        }
        this.sourceDatabases.add(sourceDatabasesItem);
        return this;
    }

    public QuoteDatabaseReq withSourceDatabases(Consumer<List<DatabaseSrcReq>> sourceDatabasesSetter) {
        if (this.sourceDatabases == null) {
            this.sourceDatabases = new ArrayList<>();
        }
        sourceDatabasesSetter.accept(this.sourceDatabases);
        return this;
    }

    /**
     * 源数据库列表
     * @return sourceDatabases
     */
    public List<DatabaseSrcReq> getSourceDatabases() {
        return sourceDatabases;
    }

    public void setSourceDatabases(List<DatabaseSrcReq> sourceDatabases) {
        this.sourceDatabases = sourceDatabases;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuoteDatabaseReq quoteDatabaseReq = (QuoteDatabaseReq) o;
        return Objects.equals(this.sourceProjectId, quoteDatabaseReq.sourceProjectId)
            && Objects.equals(this.sourceDatabases, quoteDatabaseReq.sourceDatabases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceProjectId, sourceDatabases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuoteDatabaseReq {\n");
        sb.append("    sourceProjectId: ").append(toIndentedString(sourceProjectId)).append("\n");
        sb.append("    sourceDatabases: ").append(toIndentedString(sourceDatabases)).append("\n");
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
