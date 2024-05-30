package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据源信息。
 */
public class BizDatasourceRelationVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_id")

    private String bizId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_type")

    private BizTypeEnum bizType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_type")

    private String dwType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_id")

    private String dwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_name")

    private String dwName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    public BizDatasourceRelationVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编码，填写String类型替代Long类型。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BizDatasourceRelationVO withBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }

    /**
     * 业务对象信息，填写String类型替代Long类型。
     * @return bizId
     */
    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public BizDatasourceRelationVO withBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * Get bizType
     * @return bizType
     */
    public BizTypeEnum getBizType() {
        return bizType;
    }

    public void setBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
    }

    public BizDatasourceRelationVO withDwType(String dwType) {
        this.dwType = dwType;
        return this;
    }

    /**
     * 数据连接类型，对应表所在的数仓类型，取值可以为DLI、DWS、MRS_HIVE、POSTGRESQL、MRS_SPARK、CLICKHOUSE、MYSQL、ORACLE和DORIS等。
     * @return dwType
     */
    public String getDwType() {
        return dwType;
    }

    public void setDwType(String dwType) {
        this.dwType = dwType;
    }

    public BizDatasourceRelationVO withDwId(String dwId) {
        this.dwId = dwId;
        return this;
    }

    /**
     * 数据连接ID。
     * @return dwId
     */
    public String getDwId() {
        return dwId;
    }

    public void setDwId(String dwId) {
        this.dwId = dwId;
    }

    public BizDatasourceRelationVO withDwName(String dwName) {
        this.dwName = dwName;
        return this;
    }

    /**
     * 数据连接名，只读。
     * @return dwName
     */
    public String getDwName() {
        return dwName;
    }

    public void setDwName(String dwName) {
        this.dwName = dwName;
    }

    public BizDatasourceRelationVO withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public BizDatasourceRelationVO withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * dli数据连接执行sql所需的队列，数据连接类型为DLI时必须。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public BizDatasourceRelationVO withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * DWS类型需要。
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BizDatasourceRelationVO that = (BizDatasourceRelationVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.bizId, that.bizId)
            && Objects.equals(this.bizType, that.bizType) && Objects.equals(this.dwType, that.dwType)
            && Objects.equals(this.dwId, that.dwId) && Objects.equals(this.dwName, that.dwName)
            && Objects.equals(this.dbName, that.dbName) && Objects.equals(this.queueName, that.queueName)
            && Objects.equals(this.schema, that.schema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bizId, bizType, dwType, dwId, dwName, dbName, queueName, schema);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BizDatasourceRelationVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    bizId: ").append(toIndentedString(bizId)).append("\n");
        sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
        sb.append("    dwType: ").append(toIndentedString(dwType)).append("\n");
        sb.append("    dwId: ").append(toIndentedString(dwId)).append("\n");
        sb.append("    dwName: ").append(toIndentedString(dwName)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
