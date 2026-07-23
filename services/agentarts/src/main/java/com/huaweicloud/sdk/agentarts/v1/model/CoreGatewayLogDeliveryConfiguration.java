package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;

/**
 * 日志上报配置。
 */
public class CoreGatewayLogDeliveryConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private UUID logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private UUID logStreamId;

    public CoreGatewayLogDeliveryConfiguration withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用日志。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CoreGatewayLogDeliveryConfiguration withLogGroupId(UUID logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * LTS日志组ID。
     * @return logGroupId
     */
    public UUID getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(UUID logGroupId) {
        this.logGroupId = logGroupId;
    }

    public CoreGatewayLogDeliveryConfiguration withLogStreamId(UUID logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * LTS日志流ID。
     * @return logStreamId
     */
    public UUID getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(UUID logStreamId) {
        this.logStreamId = logStreamId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayLogDeliveryConfiguration that = (CoreGatewayLogDeliveryConfiguration) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.logGroupId, that.logGroupId)
            && Objects.equals(this.logStreamId, that.logStreamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, logGroupId, logStreamId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayLogDeliveryConfiguration {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
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
