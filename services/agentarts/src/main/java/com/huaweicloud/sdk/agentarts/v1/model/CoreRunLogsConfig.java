package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: 日志采集配置。 **约束限制**: 日志组ID与日志流ID必须配套使用，要么同时缺省，要么同时填写。 **取值范围**: 不涉及。 **默认取值**: 不涉及。 
 */
public class CoreRunLogsConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_id")

    private String streamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public CoreRunLogsConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**: 是否开启日志采集，默认为false。 - 未开启，托管运行时过程产生的日志无法上报至云日志服务(LTS)。 - 开启后，托管运行时过程产生的日志会上报云日志服务(LTS)。 **约束限制**: 不涉及。 **取值范围**: - true - false **默认值**: false 
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CoreRunLogsConfig withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**: 日志组ID，可以通过LTS的控制台页面或者LTS日志组查询接口获取。 **约束限制**: 与日志流ID配套使用，需同时填写或同时缺省。 **取值范围**: 长度为 1 - 64 个字符。 **默认值**: 无。 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public CoreRunLogsConfig withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * **参数解释**: 日志流ID，可以通过LTS的控制台页面或者LTS日志流查询接口获取。 **约束限制**: 与日志组ID配套使用，需同时填写或同时缺省。 **取值范围**: 长度为 1 - 64 个字符。 **默认值**: 无。 
     * @return streamId
     */
    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public CoreRunLogsConfig withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**: 日志流所在项目ID，可以访问我的凭据控制台页面获取对应的项目ID或者通过IAM的项目查询接口获取。 **约束限制**: 与日志组ID配套使用，需同时填写或同时缺省。 **取值范围**: 长度为 1 - 64 个字符。 **默认值**: 不涉及。 
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreRunLogsConfig that = (CoreRunLogsConfig) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.streamId, that.streamId) && Objects.equals(this.projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, groupId, streamId, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreRunLogsConfig {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
