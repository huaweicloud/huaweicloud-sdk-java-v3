package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CBH实例详情
 */
public class InstanceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alter_permit")

    private Boolean alterPermit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private String periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_time")

    private Long upgradeTime;

    /**
     * 云堡垒机实例是否可以升级。 - OLD：当前已是最新版本 - NEW：可以升级小版本 - CROSS_OS：可以跨版本升级 - ROLLBACK：可以回滚
     */
    public static final class UpdateEnum {

        /**
         * Enum OLD for value: "OLD"
         */
        public static final UpdateEnum OLD = new UpdateEnum("OLD");

        /**
         * Enum NEW for value: "NEW"
         */
        public static final UpdateEnum NEW = new UpdateEnum("NEW");

        /**
         * Enum CROSS_OS for value: "CROSS_OS"
         */
        public static final UpdateEnum CROSS_OS = new UpdateEnum("CROSS_OS");

        /**
         * Enum ROLLBACK for value: "ROLLBACK"
         */
        public static final UpdateEnum ROLLBACK = new UpdateEnum("ROLLBACK");

        private static final Map<String, UpdateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UpdateEnum> createStaticFields() {
            Map<String, UpdateEnum> map = new HashMap<>();
            map.put("OLD", OLD);
            map.put("NEW", NEW);
            map.put("CROSS_OS", CROSS_OS);
            map.put("ROLLBACK", ROLLBACK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UpdateEnum(String value) {
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
        public static UpdateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UpdateEnum(value));
        }

        public static UpdateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UpdateEnum) {
                return this.value.equals(((UpdateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update")

    private UpdateEnum update;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bastion_version")

    private String bastionVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_info")

    private InstanceDetailAzInfo azInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_info")

    private InstanceDetailStatusInfo statusInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_info")

    private InstanceDetailResourceInfo resourceInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network")

    private InstanceDetailNetwork network;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_info")

    private InstanceDetailHaInfo haInfo;

    public InstanceDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 云堡垒机实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstanceDetail withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 云堡垒机服务器id。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public InstanceDetail withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 云堡垒机实例id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceDetail withAlterPermit(Boolean alterPermit) {
        this.alterPermit = alterPermit;
        return this;
    }

    /**
     * 云堡垒机实例是否可以扩容。 - true：是 - false：否
     * @return alterPermit
     */
    public Boolean getAlterPermit() {
        return alterPermit;
    }

    public void setAlterPermit(Boolean alterPermit) {
        this.alterPermit = alterPermit;
    }

    public InstanceDetail withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public InstanceDetail withPeriodNum(String periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 云堡垒机实例订购周期数。
     * @return periodNum
     */
    public String getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(String periodNum) {
        this.periodNum = periodNum;
    }

    public InstanceDetail withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 云堡垒机实例开始时间，使用时间戳格式表示。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public InstanceDetail withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 云堡垒机实例结束时间，使用时间戳格式表示。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public InstanceDetail withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 云堡垒机实例创建时间，使用UTC时间表示。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public InstanceDetail withUpgradeTime(Long upgradeTime) {
        this.upgradeTime = upgradeTime;
        return this;
    }

    /**
     * 云堡垒机实例升级定时时间，使用时间戳格式表示。
     * minimum: 0
     * maximum: 9999999999999
     * @return upgradeTime
     */
    public Long getUpgradeTime() {
        return upgradeTime;
    }

    public void setUpgradeTime(Long upgradeTime) {
        this.upgradeTime = upgradeTime;
    }

    public InstanceDetail withUpdate(UpdateEnum update) {
        this.update = update;
        return this;
    }

    /**
     * 云堡垒机实例是否可以升级。 - OLD：当前已是最新版本 - NEW：可以升级小版本 - CROSS_OS：可以跨版本升级 - ROLLBACK：可以回滚
     * @return update
     */
    public UpdateEnum getUpdate() {
        return update;
    }

    public void setUpdate(UpdateEnum update) {
        this.update = update;
    }

    public InstanceDetail withBastionVersion(String bastionVersion) {
        this.bastionVersion = bastionVersion;
        return this;
    }

    /**
     * 云堡垒机实例当前版本。
     * @return bastionVersion
     */
    public String getBastionVersion() {
        return bastionVersion;
    }

    public void setBastionVersion(String bastionVersion) {
        this.bastionVersion = bastionVersion;
    }

    public InstanceDetail withAzInfo(InstanceDetailAzInfo azInfo) {
        this.azInfo = azInfo;
        return this;
    }

    public InstanceDetail withAzInfo(Consumer<InstanceDetailAzInfo> azInfoSetter) {
        if (this.azInfo == null) {
            this.azInfo = new InstanceDetailAzInfo();
            azInfoSetter.accept(this.azInfo);
        }

        return this;
    }

    /**
     * Get azInfo
     * @return azInfo
     */
    public InstanceDetailAzInfo getAzInfo() {
        return azInfo;
    }

    public void setAzInfo(InstanceDetailAzInfo azInfo) {
        this.azInfo = azInfo;
    }

    public InstanceDetail withStatusInfo(InstanceDetailStatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }

    public InstanceDetail withStatusInfo(Consumer<InstanceDetailStatusInfo> statusInfoSetter) {
        if (this.statusInfo == null) {
            this.statusInfo = new InstanceDetailStatusInfo();
            statusInfoSetter.accept(this.statusInfo);
        }

        return this;
    }

    /**
     * Get statusInfo
     * @return statusInfo
     */
    public InstanceDetailStatusInfo getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(InstanceDetailStatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }

    public InstanceDetail withResourceInfo(InstanceDetailResourceInfo resourceInfo) {
        this.resourceInfo = resourceInfo;
        return this;
    }

    public InstanceDetail withResourceInfo(Consumer<InstanceDetailResourceInfo> resourceInfoSetter) {
        if (this.resourceInfo == null) {
            this.resourceInfo = new InstanceDetailResourceInfo();
            resourceInfoSetter.accept(this.resourceInfo);
        }

        return this;
    }

    /**
     * Get resourceInfo
     * @return resourceInfo
     */
    public InstanceDetailResourceInfo getResourceInfo() {
        return resourceInfo;
    }

    public void setResourceInfo(InstanceDetailResourceInfo resourceInfo) {
        this.resourceInfo = resourceInfo;
    }

    public InstanceDetail withNetwork(InstanceDetailNetwork network) {
        this.network = network;
        return this;
    }

    public InstanceDetail withNetwork(Consumer<InstanceDetailNetwork> networkSetter) {
        if (this.network == null) {
            this.network = new InstanceDetailNetwork();
            networkSetter.accept(this.network);
        }

        return this;
    }

    /**
     * Get network
     * @return network
     */
    public InstanceDetailNetwork getNetwork() {
        return network;
    }

    public void setNetwork(InstanceDetailNetwork network) {
        this.network = network;
    }

    public InstanceDetail withHaInfo(InstanceDetailHaInfo haInfo) {
        this.haInfo = haInfo;
        return this;
    }

    public InstanceDetail withHaInfo(Consumer<InstanceDetailHaInfo> haInfoSetter) {
        if (this.haInfo == null) {
            this.haInfo = new InstanceDetailHaInfo();
            haInfoSetter.accept(this.haInfo);
        }

        return this;
    }

    /**
     * Get haInfo
     * @return haInfo
     */
    public InstanceDetailHaInfo getHaInfo() {
        return haInfo;
    }

    public void setHaInfo(InstanceDetailHaInfo haInfo) {
        this.haInfo = haInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceDetail that = (InstanceDetail) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.serverId, that.serverId)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.alterPermit, that.alterPermit)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.periodNum, that.periodNum) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.upgradeTime, that.upgradeTime) && Objects.equals(this.update, that.update)
            && Objects.equals(this.bastionVersion, that.bastionVersion) && Objects.equals(this.azInfo, that.azInfo)
            && Objects.equals(this.statusInfo, that.statusInfo) && Objects.equals(this.resourceInfo, that.resourceInfo)
            && Objects.equals(this.network, that.network) && Objects.equals(this.haInfo, that.haInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            serverId,
            instanceId,
            alterPermit,
            enterpriseProjectId,
            periodNum,
            startTime,
            endTime,
            createdTime,
            upgradeTime,
            update,
            bastionVersion,
            azInfo,
            statusInfo,
            resourceInfo,
            network,
            haInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceDetail {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    alterPermit: ").append(toIndentedString(alterPermit)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    upgradeTime: ").append(toIndentedString(upgradeTime)).append("\n");
        sb.append("    update: ").append(toIndentedString(update)).append("\n");
        sb.append("    bastionVersion: ").append(toIndentedString(bastionVersion)).append("\n");
        sb.append("    azInfo: ").append(toIndentedString(azInfo)).append("\n");
        sb.append("    statusInfo: ").append(toIndentedString(statusInfo)).append("\n");
        sb.append("    resourceInfo: ").append(toIndentedString(resourceInfo)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    haInfo: ").append(toIndentedString(haInfo)).append("\n");
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
