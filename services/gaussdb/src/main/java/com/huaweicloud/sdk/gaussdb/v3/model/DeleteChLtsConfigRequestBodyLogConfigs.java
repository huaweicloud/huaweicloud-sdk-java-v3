package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeleteChLtsConfigRequestBodyLogConfigs
 */
public class DeleteChLtsConfigRequestBodyLogConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_type")

    private String logType;

    public DeleteChLtsConfigRequestBodyLogConfigs withInstanceId(String instanceId) {
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

    public DeleteChLtsConfigRequestBodyLogConfigs withLogType(String logType) {
        this.logType = logType;
        return this;
    }

    /**
     * 日志类型。当前仅支持slow_log。
     * @return logType
     */
    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteChLtsConfigRequestBodyLogConfigs that = (DeleteChLtsConfigRequestBodyLogConfigs) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.logType, that.logType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, logType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteChLtsConfigRequestBodyLogConfigs {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
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
