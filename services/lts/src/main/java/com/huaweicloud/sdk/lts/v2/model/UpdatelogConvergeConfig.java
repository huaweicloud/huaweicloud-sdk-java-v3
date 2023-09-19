package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 组织成员日志汇聚配置
 */
public class UpdatelogConvergeConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_account_id")

    private String memberAccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_project_id")

    private String memberProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_id")

    private String organizationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "management_account_id")

    private String managementAccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "management_project_id")

    private String managementProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_mapping_config")

    private List<LogMappingConfig> logMappingConfig = null;

    public UpdatelogConvergeConfig withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdatelogConvergeConfig withMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
        return this;
    }

    /**
     * 组织成员账号id
     * @return memberAccountId
     */
    public String getMemberAccountId() {
        return memberAccountId;
    }

    public void setMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    public UpdatelogConvergeConfig withMemberProjectId(String memberProjectId) {
        this.memberProjectId = memberProjectId;
        return this;
    }

    /**
     * 组织成员项目id
     * @return memberProjectId
     */
    public String getMemberProjectId() {
        return memberProjectId;
    }

    public void setMemberProjectId(String memberProjectId) {
        this.memberProjectId = memberProjectId;
    }

    public UpdatelogConvergeConfig withCreateTime(Long createTime) {
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

    public UpdatelogConvergeConfig withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public UpdatelogConvergeConfig withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdatelogConvergeConfig withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * 组织id
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public UpdatelogConvergeConfig withManagementAccountId(String managementAccountId) {
        this.managementAccountId = managementAccountId;
        return this;
    }

    /**
     * 管理员或者委托管理员账号id
     * @return managementAccountId
     */
    public String getManagementAccountId() {
        return managementAccountId;
    }

    public void setManagementAccountId(String managementAccountId) {
        this.managementAccountId = managementAccountId;
    }

    public UpdatelogConvergeConfig withManagementProjectId(String managementProjectId) {
        this.managementProjectId = managementProjectId;
        return this;
    }

    /**
     * 管理员或者委托管理员项目id
     * @return managementProjectId
     */
    public String getManagementProjectId() {
        return managementProjectId;
    }

    public void setManagementProjectId(String managementProjectId) {
        this.managementProjectId = managementProjectId;
    }

    public UpdatelogConvergeConfig withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public UpdatelogConvergeConfig withLogMappingConfig(List<LogMappingConfig> logMappingConfig) {
        this.logMappingConfig = logMappingConfig;
        return this;
    }

    public UpdatelogConvergeConfig addLogMappingConfigItem(LogMappingConfig logMappingConfigItem) {
        if (this.logMappingConfig == null) {
            this.logMappingConfig = new ArrayList<>();
        }
        this.logMappingConfig.add(logMappingConfigItem);
        return this;
    }

    public UpdatelogConvergeConfig withLogMappingConfig(Consumer<List<LogMappingConfig>> logMappingConfigSetter) {
        if (this.logMappingConfig == null) {
            this.logMappingConfig = new ArrayList<>();
        }
        logMappingConfigSetter.accept(this.logMappingConfig);
        return this;
    }

    /**
     * 日志汇聚配置
     * @return logMappingConfig
     */
    public List<LogMappingConfig> getLogMappingConfig() {
        return logMappingConfig;
    }

    public void setLogMappingConfig(List<LogMappingConfig> logMappingConfig) {
        this.logMappingConfig = logMappingConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatelogConvergeConfig that = (UpdatelogConvergeConfig) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.memberAccountId, that.memberAccountId)
            && Objects.equals(this.memberProjectId, that.memberProjectId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.organizationId, that.organizationId)
            && Objects.equals(this.managementAccountId, that.managementAccountId)
            && Objects.equals(this.managementProjectId, that.managementProjectId)
            && Objects.equals(this.version, that.version)
            && Objects.equals(this.logMappingConfig, that.logMappingConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            memberAccountId,
            memberProjectId,
            createTime,
            updateTime,
            status,
            organizationId,
            managementAccountId,
            managementProjectId,
            version,
            logMappingConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatelogConvergeConfig {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    memberAccountId: ").append(toIndentedString(memberAccountId)).append("\n");
        sb.append("    memberProjectId: ").append(toIndentedString(memberProjectId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    managementAccountId: ").append(toIndentedString(managementAccountId)).append("\n");
        sb.append("    managementProjectId: ").append(toIndentedString(managementProjectId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    logMappingConfig: ").append(toIndentedString(logMappingConfig)).append("\n");
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
