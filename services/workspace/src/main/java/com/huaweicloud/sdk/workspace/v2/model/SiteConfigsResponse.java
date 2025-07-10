package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 站点配置。
 */
public class SiteConfigsResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_id")

    private String siteId;

    /**
     * 配置状态。 - CENTER： 中心初始化 - IES： 边缘初始化
     */
    public static final class SiteTypeEnum {

        /**
         * Enum CENTER for value: "CENTER"
         */
        public static final SiteTypeEnum CENTER = new SiteTypeEnum("CENTER");

        /**
         * Enum IES for value: "IES"
         */
        public static final SiteTypeEnum IES = new SiteTypeEnum("IES");

        private static final Map<String, SiteTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SiteTypeEnum> createStaticFields() {
            Map<String, SiteTypeEnum> map = new HashMap<>();
            map.put("CENTER", CENTER);
            map.put("IES", IES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SiteTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SiteTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SiteTypeEnum(value));
        }

        public static SiteTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SiteTypeEnum) {
                return this.value.equals(((SiteTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_type")

    private SiteTypeEnum siteType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_name")

    private String siteName;

    /**
     * 云办公服务的状态。 - PREPARING：准备初始化服务 - SUBSCRIBING：初始化服务中 - SUBSCRIBED：已初始化服务 - SUBSCRIPTION_FAILED：初始化服务失败 - DEREGISTERING：清理资源中 - DEREGISTRATION_FAILED：清理资源失败 - RECYCLING：清理资源中。 - RECYCLED：清理资源成功。 - RECYCLE_FAILED：清理资源失败。 - CLOSED：已销户未初始化服务
     */
    public static final class StatusEnum {

        /**
         * Enum PREPARING for value: "PREPARING"
         */
        public static final StatusEnum PREPARING = new StatusEnum("PREPARING");

        /**
         * Enum SUBSCRIBING for value: "SUBSCRIBING"
         */
        public static final StatusEnum SUBSCRIBING = new StatusEnum("SUBSCRIBING");

        /**
         * Enum SUBSCRIBED for value: "SUBSCRIBED"
         */
        public static final StatusEnum SUBSCRIBED = new StatusEnum("SUBSCRIBED");

        /**
         * Enum SUBSCRIPTION_FAILED for value: "SUBSCRIPTION_FAILED"
         */
        public static final StatusEnum SUBSCRIPTION_FAILED = new StatusEnum("SUBSCRIPTION_FAILED");

        /**
         * Enum DEREGISTERING for value: "DEREGISTERING"
         */
        public static final StatusEnum DEREGISTERING = new StatusEnum("DEREGISTERING");

        /**
         * Enum DEREGISTRATION_FAILED for value: "DEREGISTRATION_FAILED"
         */
        public static final StatusEnum DEREGISTRATION_FAILED = new StatusEnum("DEREGISTRATION_FAILED");

        /**
         * Enum RECYCLING for value: "RECYCLING"
         */
        public static final StatusEnum RECYCLING = new StatusEnum("RECYCLING");

        /**
         * Enum RECYCLED for value: "RECYCLED"
         */
        public static final StatusEnum RECYCLED = new StatusEnum("RECYCLED");

        /**
         * Enum RECYCLE_FAILED for value: "RECYCLE_FAILED"
         */
        public static final StatusEnum RECYCLE_FAILED = new StatusEnum("RECYCLE_FAILED");

        /**
         * Enum CLOSED for value: "CLOSED"
         */
        public static final StatusEnum CLOSED = new StatusEnum("CLOSED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("PREPARING", PREPARING);
            map.put("SUBSCRIBING", SUBSCRIBING);
            map.put("SUBSCRIBED", SUBSCRIBED);
            map.put("SUBSCRIPTION_FAILED", SUBSCRIPTION_FAILED);
            map.put("DEREGISTERING", DEREGISTERING);
            map.put("DEREGISTRATION_FAILED", DEREGISTRATION_FAILED);
            map.put("RECYCLING", RECYCLING);
            map.put("RECYCLED", RECYCLED);
            map.put("RECYCLE_FAILED", RECYCLE_FAILED);
            map.put("CLOSED", CLOSED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_status")

    private String accessStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_status")

    private String configStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "infrastructure_security_group")

    private SecurityGroup infrastructureSecurityGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_security_group")

    private SecurityGroup desktopSecurityGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zones")

    private List<String> availabilityZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_code")

    private Integer failCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_config")

    private NetworkConfig networkConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config")

    private AccessConfig accessConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closable")

    private Boolean closable;

    public SiteConfigsResponse withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * 站点id。
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public SiteConfigsResponse withSiteType(SiteTypeEnum siteType) {
        this.siteType = siteType;
        return this;
    }

    /**
     * 配置状态。 - CENTER： 中心初始化 - IES： 边缘初始化
     * @return siteType
     */
    public SiteTypeEnum getSiteType() {
        return siteType;
    }

    public void setSiteType(SiteTypeEnum siteType) {
        this.siteType = siteType;
    }

    public SiteConfigsResponse withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    /**
     * 站点名称。
     * @return siteName
     */
    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public SiteConfigsResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 云办公服务的状态。 - PREPARING：准备初始化服务 - SUBSCRIBING：初始化服务中 - SUBSCRIBED：已初始化服务 - SUBSCRIPTION_FAILED：初始化服务失败 - DEREGISTERING：清理资源中 - DEREGISTRATION_FAILED：清理资源失败 - RECYCLING：清理资源中。 - RECYCLED：清理资源成功。 - RECYCLE_FAILED：清理资源失败。 - CLOSED：已销户未初始化服务
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public SiteConfigsResponse withAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }

    /**
     * 互联网和专线切换任务的状态。 - init： 初始化 - 开通服务后的初始状态 - available： 可用 - 执行过任务且成功后恢复的正常状态 - internetOpening： 开启中 - 开通互联网接入开启中 - dedicatedOpening： 开启中 - 开通专线接入开启中 - internetOpenFailed： 开启失败 - 开通互联网接入开启失败 - dedicatedOpenFailed： 开启失败 - 开通专线接入开启失败 - openSuccess： 开启成功 - 开通互联网接入成功 - internetClosing： 关闭中 - 关闭互联网接入关闭中 - dedicatedClosing： 关闭中 - 关闭专线接入关闭中 - internetCloseFailed： 关闭失败 - 关闭互联网接入方式失败 - dedicatedCloseFailed： 关闭失败 - 关闭专线接入方式失败 - closeSuccess： 关闭成功 - 关闭接入方式成功 - internetAccessPortModifying： 互联网接入端口修改中 - internetAccessPortModifyFailed: 端口修改失败
     * @return accessStatus
     */
    public String getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
    }

    public SiteConfigsResponse withConfigStatus(String configStatus) {
        this.configStatus = configStatus;
        return this;
    }

    /**
     * 配置状态。 - \"0\"： 开通服务成功，且对接AD成功 - \"1\"： 开通服务成功，但AD配置失败 - \"2\"： 开通服务成功，但AD配置失败后存在其他错误 - \"3\"： 开通服务成功，AD未开启对接
     * @return configStatus
     */
    public String getConfigStatus() {
        return configStatus;
    }

    public void setConfigStatus(String configStatus) {
        this.configStatus = configStatus;
    }

    public SiteConfigsResponse withInfrastructureSecurityGroup(SecurityGroup infrastructureSecurityGroup) {
        this.infrastructureSecurityGroup = infrastructureSecurityGroup;
        return this;
    }

    public SiteConfigsResponse withInfrastructureSecurityGroup(
        Consumer<SecurityGroup> infrastructureSecurityGroupSetter) {
        if (this.infrastructureSecurityGroup == null) {
            this.infrastructureSecurityGroup = new SecurityGroup();
            infrastructureSecurityGroupSetter.accept(this.infrastructureSecurityGroup);
        }

        return this;
    }

    /**
     * Get infrastructureSecurityGroup
     * @return infrastructureSecurityGroup
     */
    public SecurityGroup getInfrastructureSecurityGroup() {
        return infrastructureSecurityGroup;
    }

    public void setInfrastructureSecurityGroup(SecurityGroup infrastructureSecurityGroup) {
        this.infrastructureSecurityGroup = infrastructureSecurityGroup;
    }

    public SiteConfigsResponse withDesktopSecurityGroup(SecurityGroup desktopSecurityGroup) {
        this.desktopSecurityGroup = desktopSecurityGroup;
        return this;
    }

    public SiteConfigsResponse withDesktopSecurityGroup(Consumer<SecurityGroup> desktopSecurityGroupSetter) {
        if (this.desktopSecurityGroup == null) {
            this.desktopSecurityGroup = new SecurityGroup();
            desktopSecurityGroupSetter.accept(this.desktopSecurityGroup);
        }

        return this;
    }

    /**
     * Get desktopSecurityGroup
     * @return desktopSecurityGroup
     */
    public SecurityGroup getDesktopSecurityGroup() {
        return desktopSecurityGroup;
    }

    public void setDesktopSecurityGroup(SecurityGroup desktopSecurityGroup) {
        this.desktopSecurityGroup = desktopSecurityGroup;
    }

    public SiteConfigsResponse withAvailabilityZones(List<String> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    public SiteConfigsResponse addAvailabilityZonesItem(String availabilityZonesItem) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        this.availabilityZones.add(availabilityZonesItem);
        return this;
    }

    public SiteConfigsResponse withAvailabilityZones(Consumer<List<String>> availabilityZonesSetter) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        availabilityZonesSetter.accept(this.availabilityZones);
        return this;
    }

    /**
     * 开通服务资源使用的可用分区。
     * @return availabilityZones
     */
    public List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    public void setAvailabilityZones(List<String> availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    public SiteConfigsResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 开通服务或取消服务的任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public SiteConfigsResponse withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 初始化服务或清理资源的进度，格式为100%。
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public SiteConfigsResponse withFailCode(Integer failCode) {
        this.failCode = failCode;
        return this;
    }

    /**
     * 失败错误码。
     * @return failCode
     */
    public Integer getFailCode() {
        return failCode;
    }

    public void setFailCode(Integer failCode) {
        this.failCode = failCode;
    }

    public SiteConfigsResponse withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 失败原因。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public SiteConfigsResponse withNetworkConfig(NetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }

    public SiteConfigsResponse withNetworkConfig(Consumer<NetworkConfig> networkConfigSetter) {
        if (this.networkConfig == null) {
            this.networkConfig = new NetworkConfig();
            networkConfigSetter.accept(this.networkConfig);
        }

        return this;
    }

    /**
     * Get networkConfig
     * @return networkConfig
     */
    public NetworkConfig getNetworkConfig() {
        return networkConfig;
    }

    public void setNetworkConfig(NetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
    }

    public SiteConfigsResponse withAccessConfig(AccessConfig accessConfig) {
        this.accessConfig = accessConfig;
        return this;
    }

    public SiteConfigsResponse withAccessConfig(Consumer<AccessConfig> accessConfigSetter) {
        if (this.accessConfig == null) {
            this.accessConfig = new AccessConfig();
            accessConfigSetter.accept(this.accessConfig);
        }

        return this;
    }

    /**
     * Get accessConfig
     * @return accessConfig
     */
    public AccessConfig getAccessConfig() {
        return accessConfig;
    }

    public void setAccessConfig(AccessConfig accessConfig) {
        this.accessConfig = accessConfig;
    }

    public SiteConfigsResponse withClosable(Boolean closable) {
        this.closable = closable;
        return this;
    }

    /**
     * 是否可以取消服务。
     * @return closable
     */
    public Boolean getClosable() {
        return closable;
    }

    public void setClosable(Boolean closable) {
        this.closable = closable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SiteConfigsResponse that = (SiteConfigsResponse) obj;
        return Objects.equals(this.siteId, that.siteId) && Objects.equals(this.siteType, that.siteType)
            && Objects.equals(this.siteName, that.siteName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.accessStatus, that.accessStatus)
            && Objects.equals(this.configStatus, that.configStatus)
            && Objects.equals(this.infrastructureSecurityGroup, that.infrastructureSecurityGroup)
            && Objects.equals(this.desktopSecurityGroup, that.desktopSecurityGroup)
            && Objects.equals(this.availabilityZones, that.availabilityZones) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.progress, that.progress) && Objects.equals(this.failCode, that.failCode)
            && Objects.equals(this.failReason, that.failReason)
            && Objects.equals(this.networkConfig, that.networkConfig)
            && Objects.equals(this.accessConfig, that.accessConfig) && Objects.equals(this.closable, that.closable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId,
            siteType,
            siteName,
            status,
            accessStatus,
            configStatus,
            infrastructureSecurityGroup,
            desktopSecurityGroup,
            availabilityZones,
            jobId,
            progress,
            failCode,
            failReason,
            networkConfig,
            accessConfig,
            closable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SiteConfigsResponse {\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    siteType: ").append(toIndentedString(siteType)).append("\n");
        sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    configStatus: ").append(toIndentedString(configStatus)).append("\n");
        sb.append("    infrastructureSecurityGroup: ")
            .append(toIndentedString(infrastructureSecurityGroup))
            .append("\n");
        sb.append("    desktopSecurityGroup: ").append(toIndentedString(desktopSecurityGroup)).append("\n");
        sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    failCode: ").append(toIndentedString(failCode)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    networkConfig: ").append(toIndentedString(networkConfig)).append("\n");
        sb.append("    accessConfig: ").append(toIndentedString(accessConfig)).append("\n");
        sb.append("    closable: ").append(toIndentedString(closable)).append("\n");
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
