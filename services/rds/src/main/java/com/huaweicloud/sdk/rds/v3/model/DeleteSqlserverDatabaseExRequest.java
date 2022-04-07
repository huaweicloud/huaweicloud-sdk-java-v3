package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class DeleteSqlserverDatabaseExRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DropDatabaseV3Req body;

    public DeleteSqlserverDatabaseExRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /** 语言
     * 
     * @return xLanguage */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public DeleteSqlserverDatabaseExRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID。
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DeleteSqlserverDatabaseExRequest withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /** 需要删除的数据库名。
     * 
     * @return dbName */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public DeleteSqlserverDatabaseExRequest withBody(DropDatabaseV3Req body) {
        this.body = body;
        return this;
    }

    public DeleteSqlserverDatabaseExRequest withBody(Consumer<DropDatabaseV3Req> bodySetter) {
        if (this.body == null) {
            this.body = new DropDatabaseV3Req();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public DropDatabaseV3Req getBody() {
        return body;
    }

    public void setBody(DropDatabaseV3Req body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteSqlserverDatabaseExRequest deleteSqlserverDatabaseExRequest = (DeleteSqlserverDatabaseExRequest) o;
        return Objects.equals(this.xLanguage, deleteSqlserverDatabaseExRequest.xLanguage)
            && Objects.equals(this.instanceId, deleteSqlserverDatabaseExRequest.instanceId)
            && Objects.equals(this.dbName, deleteSqlserverDatabaseExRequest.dbName)
            && Objects.equals(this.body, deleteSqlserverDatabaseExRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, instanceId, dbName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSqlserverDatabaseExRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
