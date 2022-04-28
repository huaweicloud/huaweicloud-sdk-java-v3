package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteDatabaseRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cascade")

    private Boolean cascade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "async")

    private Boolean async;

    public DeleteDatabaseRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 删除的数据库名称。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public DeleteDatabaseRequest withCascade(Boolean cascade) {
        this.cascade = cascade;
        return this;
    }

    /**
     * Get cascade
     * @return cascade
     */
    public Boolean getCascade() {
        return cascade;
    }

    public void setCascade(Boolean cascade) {
        this.cascade = cascade;
    }

    public DeleteDatabaseRequest withAsync(Boolean async) {
        this.async = async;
        return this;
    }

    /**
     * Get async
     * @return async
     */
    public Boolean getAsync() {
        return async;
    }

    public void setAsync(Boolean async) {
        this.async = async;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteDatabaseRequest deleteDatabaseRequest = (DeleteDatabaseRequest) o;
        return Objects.equals(this.databaseName, deleteDatabaseRequest.databaseName)
            && Objects.equals(this.cascade, deleteDatabaseRequest.cascade)
            && Objects.equals(this.async, deleteDatabaseRequest.async);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName, cascade, async);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDatabaseRequest {\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    cascade: ").append(toIndentedString(cascade)).append("\n");
        sb.append("    async: ").append(toIndentedString(async)).append("\n");
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
