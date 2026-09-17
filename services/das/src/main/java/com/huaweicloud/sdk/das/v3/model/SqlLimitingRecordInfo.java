package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SqlLimitingRecordInfo对象
 */
public class SqlLimitingRecordInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_id")

    private String itemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_str")

    private String keyStr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_connection")

    private String maxConnection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_waiting")

    private String maxWaiting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cur_connection")

    private Integer curConnection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cur_reject")

    private Integer curReject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_reject")

    private Integer totalReject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private String createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_id")

    private String queryId;

    public SqlLimitingRecordInfo withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * SQL限流规则ID
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public SqlLimitingRecordInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * SQL类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SqlLimitingRecordInfo withKeyStr(String keyStr) {
        this.keyStr = keyStr;
        return this;
    }

    /**
     * 限流规则
     * @return keyStr
     */
    public String getKeyStr() {
        return keyStr;
    }

    public void setKeyStr(String keyStr) {
        this.keyStr = keyStr;
    }

    public SqlLimitingRecordInfo withMaxConnection(String maxConnection) {
        this.maxConnection = maxConnection;
        return this;
    }

    /**
     * 最大并发数
     * @return maxConnection
     */
    public String getMaxConnection() {
        return maxConnection;
    }

    public void setMaxConnection(String maxConnection) {
        this.maxConnection = maxConnection;
    }

    public SqlLimitingRecordInfo withMaxWaiting(String maxWaiting) {
        this.maxWaiting = maxWaiting;
        return this;
    }

    /**
     * 最大等待时间
     * @return maxWaiting
     */
    public String getMaxWaiting() {
        return maxWaiting;
    }

    public void setMaxWaiting(String maxWaiting) {
        this.maxWaiting = maxWaiting;
    }

    public SqlLimitingRecordInfo withCurConnection(Integer curConnection) {
        this.curConnection = curConnection;
        return this;
    }

    /**
     * 当前并发数
     * @return curConnection
     */
    public Integer getCurConnection() {
        return curConnection;
    }

    public void setCurConnection(Integer curConnection) {
        this.curConnection = curConnection;
    }

    public SqlLimitingRecordInfo withCurReject(Integer curReject) {
        this.curReject = curReject;
        return this;
    }

    /**
     * 当前拦截数
     * @return curReject
     */
    public Integer getCurReject() {
        return curReject;
    }

    public void setCurReject(Integer curReject) {
        this.curReject = curReject;
    }

    public SqlLimitingRecordInfo withTotalReject(Integer totalReject) {
        this.totalReject = totalReject;
        return this;
    }

    /**
     * 总拦截数
     * @return totalReject
     */
    public Integer getTotalReject() {
        return totalReject;
    }

    public void setTotalReject(Integer totalReject) {
        this.totalReject = totalReject;
    }

    public SqlLimitingRecordInfo withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public SqlLimitingRecordInfo withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * PostgreSQL限流语句标准化后唯一标识
     * @return queryId
     */
    public String getQueryId() {
        return queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlLimitingRecordInfo that = (SqlLimitingRecordInfo) obj;
        return Objects.equals(this.itemId, that.itemId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.keyStr, that.keyStr) && Objects.equals(this.maxConnection, that.maxConnection)
            && Objects.equals(this.maxWaiting, that.maxWaiting)
            && Objects.equals(this.curConnection, that.curConnection) && Objects.equals(this.curReject, that.curReject)
            && Objects.equals(this.totalReject, that.totalReject) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.queryId, that.queryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId,
            type,
            keyStr,
            maxConnection,
            maxWaiting,
            curConnection,
            curReject,
            totalReject,
            createAt,
            queryId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlLimitingRecordInfo {\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    keyStr: ").append(toIndentedString(keyStr)).append("\n");
        sb.append("    maxConnection: ").append(toIndentedString(maxConnection)).append("\n");
        sb.append("    maxWaiting: ").append(toIndentedString(maxWaiting)).append("\n");
        sb.append("    curConnection: ").append(toIndentedString(curConnection)).append("\n");
        sb.append("    curReject: ").append(toIndentedString(curReject)).append("\n");
        sb.append("    totalReject: ").append(toIndentedString(totalReject)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
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
