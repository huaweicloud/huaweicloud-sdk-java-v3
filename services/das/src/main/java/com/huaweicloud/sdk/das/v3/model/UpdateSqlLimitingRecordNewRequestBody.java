package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新SQL限流记录请求体
 */
public class UpdateSqlLimitingRecordNewRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_ids")

    private String itemIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_connection")

    private Integer maxConnection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_waiting")

    private Integer maxWaiting;

    public UpdateSqlLimitingRecordNewRequestBody withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 数据库引擎类型
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public UpdateSqlLimitingRecordNewRequestBody withItemIds(String itemIds) {
        this.itemIds = itemIds;
        return this;
    }

    /**
     * SQL限流规则ID，可组合，用逗号分隔
     * @return itemIds
     */
    public String getItemIds() {
        return itemIds;
    }

    public void setItemIds(String itemIds) {
        this.itemIds = itemIds;
    }

    public UpdateSqlLimitingRecordNewRequestBody withMaxConnection(Integer maxConnection) {
        this.maxConnection = maxConnection;
        return this;
    }

    /**
     * 最大并发数
     * @return maxConnection
     */
    public Integer getMaxConnection() {
        return maxConnection;
    }

    public void setMaxConnection(Integer maxConnection) {
        this.maxConnection = maxConnection;
    }

    public UpdateSqlLimitingRecordNewRequestBody withMaxWaiting(Integer maxWaiting) {
        this.maxWaiting = maxWaiting;
        return this;
    }

    /**
     * 最大等待时间
     * @return maxWaiting
     */
    public Integer getMaxWaiting() {
        return maxWaiting;
    }

    public void setMaxWaiting(Integer maxWaiting) {
        this.maxWaiting = maxWaiting;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSqlLimitingRecordNewRequestBody that = (UpdateSqlLimitingRecordNewRequestBody) obj;
        return Objects.equals(this.engineType, that.engineType) && Objects.equals(this.itemIds, that.itemIds)
            && Objects.equals(this.maxConnection, that.maxConnection)
            && Objects.equals(this.maxWaiting, that.maxWaiting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType, itemIds, maxConnection, maxWaiting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSqlLimitingRecordNewRequestBody {\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
        sb.append("    maxConnection: ").append(toIndentedString(maxConnection)).append("\n");
        sb.append("    maxWaiting: ").append(toIndentedString(maxWaiting)).append("\n");
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
