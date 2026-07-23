package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 日志采集配置。
 */
public class CoreToolsLogsConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_id")

    private String streamId;

    public CoreToolsLogsConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释：** 是否开启日志采集。 - 未开启，工具运行过程产生的日志无法上报至云日志服务(LTS)。 - 开启后，工具运行过程产生的日志会上报至云日志服务(LTS)。  **约束限制：** 不涉及。 **取值范围：** - true打开。 - false关闭。  **默认取值：** false。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CoreToolsLogsConfig withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** 工具的日志组ID。 **约束限制：** 当前不支持更新、指定。 **取值范围：** 长度不能超过64个字符。 **默认取值：** 不涉及。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public CoreToolsLogsConfig withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * **参数解释：** 工具的日志流ID。 **约束限制：** 当前不支持更新、指定。 **取值范围：** 长度不能超过64个字符。 **默认取值：** 不涉及。
     * @return streamId
     */
    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreToolsLogsConfig that = (CoreToolsLogsConfig) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.streamId, that.streamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, groupId, streamId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreToolsLogsConfig {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
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
