package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDatabasesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    @JacksonXmlProperty(localName = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_count")

    @JacksonXmlProperty(localName = "database_count")

    private Integer databaseCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    @JacksonXmlProperty(localName = "databases")

    private List<ListDatabasesRespDatabase> databases = null;

    public ListDatabasesResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 执行请求是否成功。“true”表示请求执行成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ListDatabasesResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 系统提示信息，执行成功时，信息可能为空。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListDatabasesResponse withDatabaseCount(Integer databaseCount) {
        this.databaseCount = databaseCount;
        return this;
    }

    /**
     * 数据库的总数。
     * @return databaseCount
     */
    public Integer getDatabaseCount() {
        return databaseCount;
    }

    public void setDatabaseCount(Integer databaseCount) {
        this.databaseCount = databaseCount;
    }

    public ListDatabasesResponse withDatabases(List<ListDatabasesRespDatabase> databases) {
        this.databases = databases;
        return this;
    }

    public ListDatabasesResponse addDatabasesItem(ListDatabasesRespDatabase databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public ListDatabasesResponse withDatabases(Consumer<List<ListDatabasesRespDatabase>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 查询所有数据库的响应参数。
     * @return databases
     */
    public List<ListDatabasesRespDatabase> getDatabases() {
        return databases;
    }

    public void setDatabases(List<ListDatabasesRespDatabase> databases) {
        this.databases = databases;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDatabasesResponse listDatabasesResponse = (ListDatabasesResponse) o;
        return Objects.equals(this.isSuccess, listDatabasesResponse.isSuccess)
            && Objects.equals(this.message, listDatabasesResponse.message)
            && Objects.equals(this.databaseCount, listDatabasesResponse.databaseCount)
            && Objects.equals(this.databases, listDatabasesResponse.databases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, databaseCount, databases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatabasesResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    databaseCount: ").append(toIndentedString(databaseCount)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
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
