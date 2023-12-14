package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * LTSAccessConfigInfoRespon200
 */
public class LTSAccessConfigInfoRespon200 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_id")

    private String accessConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_name")

    private String accessConfigName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_type")

    private Object accessConfigType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_name")

    private String logGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name")

    private String logStreamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_log_access")

    private PreviewAgencyLogAccessReqBody agencyLogAccess;

    public LTSAccessConfigInfoRespon200 withAccessConfigId(String accessConfigId) {
        this.accessConfigId = accessConfigId;
        return this;
    }

    /**
     * 跨账号日志接入id
     * @return accessConfigId
     */
    public String getAccessConfigId() {
        return accessConfigId;
    }

    public void setAccessConfigId(String accessConfigId) {
        this.accessConfigId = accessConfigId;
    }

    public LTSAccessConfigInfoRespon200 withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public LTSAccessConfigInfoRespon200 withAccessConfigName(String accessConfigName) {
        this.accessConfigName = accessConfigName;
        return this;
    }

    /**
     * 跨账号日志接入名称
     * @return accessConfigName
     */
    public String getAccessConfigName() {
        return accessConfigName;
    }

    public void setAccessConfigName(String accessConfigName) {
        this.accessConfigName = accessConfigName;
    }

    public LTSAccessConfigInfoRespon200 withAccessConfigType(Object accessConfigType) {
        this.accessConfigType = accessConfigType;
        return this;
    }

    /**
     * 跨账号日志接入类型
     * @return accessConfigType
     */
    public Object getAccessConfigType() {
        return accessConfigType;
    }

    public void setAccessConfigType(Object accessConfigType) {
        this.accessConfigType = accessConfigType;
    }

    public LTSAccessConfigInfoRespon200 withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 日志组ID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public LTSAccessConfigInfoRespon200 withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * 日志组名称
     * @return logGroupName
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public LTSAccessConfigInfoRespon200 withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * 日志流ID
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public LTSAccessConfigInfoRespon200 withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * 日志流名称
     * @return logStreamName
     */
    public String getLogStreamName() {
        return logStreamName;
    }

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    public LTSAccessConfigInfoRespon200 withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public LTSAccessConfigInfoRespon200 withAgencyLogAccess(PreviewAgencyLogAccessReqBody agencyLogAccess) {
        this.agencyLogAccess = agencyLogAccess;
        return this;
    }

    public LTSAccessConfigInfoRespon200 withAgencyLogAccess(
        Consumer<PreviewAgencyLogAccessReqBody> agencyLogAccessSetter) {
        if (this.agencyLogAccess == null) {
            this.agencyLogAccess = new PreviewAgencyLogAccessReqBody();
            agencyLogAccessSetter.accept(this.agencyLogAccess);
        }

        return this;
    }

    /**
     * Get agencyLogAccess
     * @return agencyLogAccess
     */
    public PreviewAgencyLogAccessReqBody getAgencyLogAccess() {
        return agencyLogAccess;
    }

    public void setAgencyLogAccess(PreviewAgencyLogAccessReqBody agencyLogAccess) {
        this.agencyLogAccess = agencyLogAccess;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LTSAccessConfigInfoRespon200 that = (LTSAccessConfigInfoRespon200) obj;
        return Objects.equals(this.accessConfigId, that.accessConfigId)
            && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.accessConfigName, that.accessConfigName)
            && Objects.equals(this.accessConfigType, that.accessConfigType)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.logGroupName, that.logGroupName)
            && Objects.equals(this.logStreamId, that.logStreamId)
            && Objects.equals(this.logStreamName, that.logStreamName)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.agencyLogAccess, that.agencyLogAccess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessConfigId,
            projectId,
            accessConfigName,
            accessConfigType,
            groupId,
            logGroupName,
            logStreamId,
            logStreamName,
            createTime,
            agencyLogAccess);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LTSAccessConfigInfoRespon200 {\n");
        sb.append("    accessConfigId: ").append(toIndentedString(accessConfigId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    accessConfigName: ").append(toIndentedString(accessConfigName)).append("\n");
        sb.append("    accessConfigType: ").append(toIndentedString(accessConfigType)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    agencyLogAccess: ").append(toIndentedString(agencyLogAccess)).append("\n");
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
