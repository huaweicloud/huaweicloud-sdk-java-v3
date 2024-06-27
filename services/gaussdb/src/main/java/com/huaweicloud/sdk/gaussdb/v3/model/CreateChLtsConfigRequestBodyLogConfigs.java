package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateChLtsConfigRequestBodyLogConfigs
 */
public class CreateChLtsConfigRequestBodyLogConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_type")

    private String logType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_group_id")

    private String ltsGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_stream_id")

    private String ltsStreamId;

    public CreateChLtsConfigRequestBodyLogConfigs withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * ClickHouse实例ID，严格匹配UUID规则。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateChLtsConfigRequestBodyLogConfigs withLogType(String logType) {
        this.logType = logType;
        return this;
    }

    /**
     * 查询日志类型。当前仅支持slow_log。
     * @return logType
     */
    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public CreateChLtsConfigRequestBodyLogConfigs withLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
        return this;
    }

    /**
     * LTS日志组id。
     * @return ltsGroupId
     */
    public String getLtsGroupId() {
        return ltsGroupId;
    }

    public void setLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
    }

    public CreateChLtsConfigRequestBodyLogConfigs withLtsStreamId(String ltsStreamId) {
        this.ltsStreamId = ltsStreamId;
        return this;
    }

    /**
     * LTS日志流id。
     * @return ltsStreamId
     */
    public String getLtsStreamId() {
        return ltsStreamId;
    }

    public void setLtsStreamId(String ltsStreamId) {
        this.ltsStreamId = ltsStreamId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateChLtsConfigRequestBodyLogConfigs that = (CreateChLtsConfigRequestBodyLogConfigs) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.logType, that.logType)
            && Objects.equals(this.ltsGroupId, that.ltsGroupId) && Objects.equals(this.ltsStreamId, that.ltsStreamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, logType, ltsGroupId, ltsStreamId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateChLtsConfigRequestBodyLogConfigs {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
        sb.append("    ltsGroupId: ").append(toIndentedString(ltsGroupId)).append("\n");
        sb.append("    ltsStreamId: ").append(toIndentedString(ltsStreamId)).append("\n");
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
