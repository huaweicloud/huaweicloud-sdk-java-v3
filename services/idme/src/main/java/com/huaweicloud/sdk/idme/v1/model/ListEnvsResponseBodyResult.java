package com.huaweicloud.sdk.idme.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListEnvsResponseBodyResult
 */
public class ListEnvsResponseBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_name")

    private String envName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_status")

    private String envStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_app_link_status")

    private String envAppLinkStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_app_link_status_msg")

    private String envAppLinkStatusMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_conf_info")

    private String envConfInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_version")

    private String appVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name_en")

    private String appNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name_cn")

    private String appNameCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private Long expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_deploy_time")

    private Long lastDeployTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_user_id")

    private String deployUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployable")

    private Boolean deployable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uninstallable")

    private Boolean uninstallable;

    public ListEnvsResponseBodyResult withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListEnvsResponseBodyResult withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ListEnvsResponseBodyResult withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 运行服务的ID。
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public ListEnvsResponseBodyResult withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    /**
     * 运行服务的名称。
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public ListEnvsResponseBodyResult withEnvStatus(String envStatus) {
        this.envStatus = envStatus;
        return this;
    }

    /**
     * 运行服务的状态。
     * @return envStatus
     */
    public String getEnvStatus() {
        return envStatus;
    }

    public void setEnvStatus(String envStatus) {
        this.envStatus = envStatus;
    }

    public ListEnvsResponseBodyResult withEnvAppLinkStatus(String envAppLinkStatus) {
        this.envAppLinkStatus = envAppLinkStatus;
        return this;
    }

    /**
     * 运行服务与应用间的状态。
     * @return envAppLinkStatus
     */
    public String getEnvAppLinkStatus() {
        return envAppLinkStatus;
    }

    public void setEnvAppLinkStatus(String envAppLinkStatus) {
        this.envAppLinkStatus = envAppLinkStatus;
    }

    public ListEnvsResponseBodyResult withEnvAppLinkStatusMsg(String envAppLinkStatusMsg) {
        this.envAppLinkStatusMsg = envAppLinkStatusMsg;
        return this;
    }

    /**
     * 运行服务与应用间的状态信息。
     * @return envAppLinkStatusMsg
     */
    public String getEnvAppLinkStatusMsg() {
        return envAppLinkStatusMsg;
    }

    public void setEnvAppLinkStatusMsg(String envAppLinkStatusMsg) {
        this.envAppLinkStatusMsg = envAppLinkStatusMsg;
    }

    public ListEnvsResponseBodyResult withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * 访问方式。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public ListEnvsResponseBodyResult withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 创建运行服务的jobId。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ListEnvsResponseBodyResult withEnvConfInfo(String envConfInfo) {
        this.envConfInfo = envConfInfo;
        return this;
    }

    /**
     * 运行服务的配置信息。
     * @return envConfInfo
     */
    public String getEnvConfInfo() {
        return envConfInfo;
    }

    public void setEnvConfInfo(String envConfInfo) {
        this.envConfInfo = envConfInfo;
    }

    public ListEnvsResponseBodyResult withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 部署的应用ID。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ListEnvsResponseBodyResult withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * 部署的应用版本。
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public ListEnvsResponseBodyResult withAppNameEn(String appNameEn) {
        this.appNameEn = appNameEn;
        return this;
    }

    /**
     * 部署应用的英文名称。
     * @return appNameEn
     */
    public String getAppNameEn() {
        return appNameEn;
    }

    public void setAppNameEn(String appNameEn) {
        this.appNameEn = appNameEn;
    }

    public ListEnvsResponseBodyResult withAppNameCn(String appNameCn) {
        this.appNameCn = appNameCn;
        return this;
    }

    /**
     * 部署应用的中文名称。
     * @return appNameCn
     */
    public String getAppNameCn() {
        return appNameCn;
    }

    public void setAppNameCn(String appNameCn) {
        this.appNameCn = appNameCn;
    }

    public ListEnvsResponseBodyResult withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 应用是否可用。 - 0：被认为是false。 - 非0：被认为是true。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ListEnvsResponseBodyResult withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 运行服务的过期时间。
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public ListEnvsResponseBodyResult withLastDeployTime(Long lastDeployTime) {
        this.lastDeployTime = lastDeployTime;
        return this;
    }

    /**
     * 最后部署时间。
     * @return lastDeployTime
     */
    public Long getLastDeployTime() {
        return lastDeployTime;
    }

    public void setLastDeployTime(Long lastDeployTime) {
        this.lastDeployTime = lastDeployTime;
    }

    public ListEnvsResponseBodyResult withDeployUserId(String deployUserId) {
        this.deployUserId = deployUserId;
        return this;
    }

    /**
     * 上次部署应用的IAM用户ID。
     * @return deployUserId
     */
    public String getDeployUserId() {
        return deployUserId;
    }

    public void setDeployUserId(String deployUserId) {
        this.deployUserId = deployUserId;
    }

    public ListEnvsResponseBodyResult withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式。
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ListEnvsResponseBodyResult withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 运行服务的创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ListEnvsResponseBodyResult withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 绑定主资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListEnvsResponseBodyResult withDeployable(Boolean deployable) {
        this.deployable = deployable;
        return this;
    }

    /**
     * 是否支持部署。
     * @return deployable
     */
    public Boolean getDeployable() {
        return deployable;
    }

    public void setDeployable(Boolean deployable) {
        this.deployable = deployable;
    }

    public ListEnvsResponseBodyResult withUninstallable(Boolean uninstallable) {
        this.uninstallable = uninstallable;
        return this;
    }

    /**
     * 是否支持卸载。
     * @return uninstallable
     */
    public Boolean getUninstallable() {
        return uninstallable;
    }

    public void setUninstallable(Boolean uninstallable) {
        this.uninstallable = uninstallable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEnvsResponseBodyResult that = (ListEnvsResponseBodyResult) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.envId, that.envId) && Objects.equals(this.envName, that.envName)
            && Objects.equals(this.envStatus, that.envStatus)
            && Objects.equals(this.envAppLinkStatus, that.envAppLinkStatus)
            && Objects.equals(this.envAppLinkStatusMsg, that.envAppLinkStatusMsg)
            && Objects.equals(this.endpoint, that.endpoint) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.envConfInfo, that.envConfInfo) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.appVersion, that.appVersion) && Objects.equals(this.appNameEn, that.appNameEn)
            && Objects.equals(this.appNameCn, that.appNameCn) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.lastDeployTime, that.lastDeployTime)
            && Objects.equals(this.deployUserId, that.deployUserId)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.deployable, that.deployable)
            && Objects.equals(this.uninstallable, that.uninstallable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            regionId,
            envId,
            envName,
            envStatus,
            envAppLinkStatus,
            envAppLinkStatusMsg,
            endpoint,
            jobId,
            envConfInfo,
            appId,
            appVersion,
            appNameEn,
            appNameCn,
            enabled,
            expireTime,
            lastDeployTime,
            deployUserId,
            chargingMode,
            createTime,
            resourceId,
            deployable,
            uninstallable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnvsResponseBodyResult {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    envStatus: ").append(toIndentedString(envStatus)).append("\n");
        sb.append("    envAppLinkStatus: ").append(toIndentedString(envAppLinkStatus)).append("\n");
        sb.append("    envAppLinkStatusMsg: ").append(toIndentedString(envAppLinkStatusMsg)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    envConfInfo: ").append(toIndentedString(envConfInfo)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    appNameEn: ").append(toIndentedString(appNameEn)).append("\n");
        sb.append("    appNameCn: ").append(toIndentedString(appNameCn)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    lastDeployTime: ").append(toIndentedString(lastDeployTime)).append("\n");
        sb.append("    deployUserId: ").append(toIndentedString(deployUserId)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    deployable: ").append(toIndentedString(deployable)).append("\n");
        sb.append("    uninstallable: ").append(toIndentedString(uninstallable)).append("\n");
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
