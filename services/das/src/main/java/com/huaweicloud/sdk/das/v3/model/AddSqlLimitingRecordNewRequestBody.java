package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 新增SQL限流规则请求体
 */
public class AddSqlLimitingRecordNewRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_str")

    private String keyStr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_waiting")

    private Integer maxWaiting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_connection")

    private Integer maxConnection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "his_sql_limiting_switch")

    private Boolean hisSqlLimitingSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ids")

    private List<String> nodeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "automaticity")

    private Boolean automaticity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    public AddSqlLimitingRecordNewRequestBody withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 引擎类型
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public AddSqlLimitingRecordNewRequestBody withType(String type) {
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

    public AddSqlLimitingRecordNewRequestBody withKeyStr(String keyStr) {
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

    public AddSqlLimitingRecordNewRequestBody withMaxWaiting(Integer maxWaiting) {
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

    public AddSqlLimitingRecordNewRequestBody withMaxConnection(Integer maxConnection) {
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

    public AddSqlLimitingRecordNewRequestBody withHisSqlLimitingSwitch(Boolean hisSqlLimitingSwitch) {
        this.hisSqlLimitingSwitch = hisSqlLimitingSwitch;
        return this;
    }

    /**
     * 历史会话限流开关
     * @return hisSqlLimitingSwitch
     */
    public Boolean getHisSqlLimitingSwitch() {
        return hisSqlLimitingSwitch;
    }

    public void setHisSqlLimitingSwitch(Boolean hisSqlLimitingSwitch) {
        this.hisSqlLimitingSwitch = hisSqlLimitingSwitch;
    }

    public AddSqlLimitingRecordNewRequestBody withNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }

    public AddSqlLimitingRecordNewRequestBody addNodeIdsItem(String nodeIdsItem) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        this.nodeIds.add(nodeIdsItem);
        return this;
    }

    public AddSqlLimitingRecordNewRequestBody withNodeIds(Consumer<List<String>> nodeIdsSetter) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        nodeIdsSetter.accept(this.nodeIds);
        return this;
    }

    /**
     * 节点ID列表
     * @return nodeIds
     */
    public List<String> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
    }

    public AddSqlLimitingRecordNewRequestBody withAutomaticity(Boolean automaticity) {
        this.automaticity = automaticity;
        return this;
    }

    /**
     * 是否自动化
     * @return automaticity
     */
    public Boolean getAutomaticity() {
        return automaticity;
    }

    public void setAutomaticity(Boolean automaticity) {
        this.automaticity = automaticity;
    }

    public AddSqlLimitingRecordNewRequestBody withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 过期时间
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddSqlLimitingRecordNewRequestBody that = (AddSqlLimitingRecordNewRequestBody) obj;
        return Objects.equals(this.engineType, that.engineType) && Objects.equals(this.type, that.type)
            && Objects.equals(this.keyStr, that.keyStr) && Objects.equals(this.maxWaiting, that.maxWaiting)
            && Objects.equals(this.maxConnection, that.maxConnection)
            && Objects.equals(this.hisSqlLimitingSwitch, that.hisSqlLimitingSwitch)
            && Objects.equals(this.nodeIds, that.nodeIds) && Objects.equals(this.automaticity, that.automaticity)
            && Objects.equals(this.duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType,
            type,
            keyStr,
            maxWaiting,
            maxConnection,
            hisSqlLimitingSwitch,
            nodeIds,
            automaticity,
            duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddSqlLimitingRecordNewRequestBody {\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    keyStr: ").append(toIndentedString(keyStr)).append("\n");
        sb.append("    maxWaiting: ").append(toIndentedString(maxWaiting)).append("\n");
        sb.append("    maxConnection: ").append(toIndentedString(maxConnection)).append("\n");
        sb.append("    hisSqlLimitingSwitch: ").append(toIndentedString(hisSqlLimitingSwitch)).append("\n");
        sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
        sb.append("    automaticity: ").append(toIndentedString(automaticity)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
