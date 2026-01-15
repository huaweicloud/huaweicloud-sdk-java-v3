package com.huaweicloud.sdk.dbss.v1.model;

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
 * Cluster
 */
public class Cluster {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "activate_info")

    private InstanceActivateInfo activateInfo;

    /**
     * 计费模式  - Period：包周期  - Demand：按需
     */
    public static final class ChargeModelEnum {

        /**
         * Enum PERIOD for value: "Period"
         */
        public static final ChargeModelEnum PERIOD = new ChargeModelEnum("Period");

        /**
         * Enum DEMAND for value: "Demand"
         */
        public static final ChargeModelEnum DEMAND = new ChargeModelEnum("Demand");

        /**
         * Enum TEST for value: "Test"
         */
        public static final ChargeModelEnum TEST = new ChargeModelEnum("Test");

        private static final Map<String, ChargeModelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeModelEnum> createStaticFields() {
            Map<String, ChargeModelEnum> map = new HashMap<>();
            map.put("Period", PERIOD);
            map.put("Demand", DEMAND);
            map.put("Test", TEST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargeModelEnum(String value) {
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
        public static ChargeModelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargeModelEnum(value));
        }

        public static ChargeModelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargeModelEnum) {
                return this.value.equals(((ChargeModelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_model")

    private ChargeModelEnum chargeModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private Long created;

    /**
     * 部署方式  - CLOUD：云上  - OUTSIDE：云外
     */
    public static final class DeployModeEnum {

        /**
         * Enum CLOUD for value: "CLOUD"
         */
        public static final DeployModeEnum CLOUD = new DeployModeEnum("CLOUD");

        /**
         * Enum OUTSIDE for value: "OUTSIDE"
         */
        public static final DeployModeEnum OUTSIDE = new DeployModeEnum("OUTSIDE");

        private static final Map<String, DeployModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeployModeEnum> createStaticFields() {
            Map<String, DeployModeEnum> map = new HashMap<>();
            map.put("CLOUD", CLOUD);
            map.put("OUTSIDE", OUTSIDE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeployModeEnum(String value) {
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
        public static DeployModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeployModeEnum(value));
        }

        public static DeployModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeployModeEnum) {
                return this.value.equals(((DeployModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_mode")

    private DeployModeEnum deployMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private ServerList detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired")

    private Long expired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "float_ip")

    private String floatIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_active_standby")

    private Boolean isActiveStandby;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private String keepDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_version")

    private String newVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remain_days")

    private String remainDays;

    public Cluster withActivateInfo(InstanceActivateInfo activateInfo) {
        this.activateInfo = activateInfo;
        return this;
    }

    public Cluster withActivateInfo(Consumer<InstanceActivateInfo> activateInfoSetter) {
        if (this.activateInfo == null) {
            this.activateInfo = new InstanceActivateInfo();
            activateInfoSetter.accept(this.activateInfo);
        }

        return this;
    }

    /**
     * Get activateInfo
     * @return activateInfo
     */
    public InstanceActivateInfo getActivateInfo() {
        return activateInfo;
    }

    public void setActivateInfo(InstanceActivateInfo activateInfo) {
        this.activateInfo = activateInfo;
    }

    public Cluster withChargeModel(ChargeModelEnum chargeModel) {
        this.chargeModel = chargeModel;
        return this;
    }

    /**
     * 计费模式  - Period：包周期  - Demand：按需
     * @return chargeModel
     */
    public ChargeModelEnum getChargeModel() {
        return chargeModel;
    }

    public void setChargeModel(ChargeModelEnum chargeModel) {
        this.chargeModel = chargeModel;
    }

    public Cluster withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 备注信息
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Cluster withCreated(Long created) {
        this.created = created;
        return this;
    }

    /**
     * 创建时间
     * @return created
     */
    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Cluster withDeployMode(DeployModeEnum deployMode) {
        this.deployMode = deployMode;
        return this;
    }

    /**
     * 部署方式  - CLOUD：云上  - OUTSIDE：云外
     * @return deployMode
     */
    public DeployModeEnum getDeployMode() {
        return deployMode;
    }

    public void setDeployMode(DeployModeEnum deployMode) {
        this.deployMode = deployMode;
    }

    public Cluster withDetail(ServerList detail) {
        this.detail = detail;
        return this;
    }

    public Cluster withDetail(Consumer<ServerList> detailSetter) {
        if (this.detail == null) {
            this.detail = new ServerList();
            detailSetter.accept(this.detail);
        }

        return this;
    }

    /**
     * Get detail
     * @return detail
     */
    public ServerList getDetail() {
        return detail;
    }

    public void setDetail(ServerList detail) {
        this.detail = detail;
    }

    public Cluster withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public Cluster withExpired(Long expired) {
        this.expired = expired;
        return this;
    }

    /**
     * 过期时间
     * @return expired
     */
    public Long getExpired() {
        return expired;
    }

    public void setExpired(Long expired) {
        this.expired = expired;
    }

    public Cluster withFloatIp(String floatIp) {
        this.floatIp = floatIp;
        return this;
    }

    /**
     * 浮动IP
     * @return floatIp
     */
    public String getFloatIp() {
        return floatIp;
    }

    public void setFloatIp(String floatIp) {
        this.floatIp = floatIp;
    }

    public Cluster withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public Cluster withIsActiveStandby(Boolean isActiveStandby) {
        this.isActiveStandby = isActiveStandby;
        return this;
    }

    /**
     * 是否激活备用
     * @return isActiveStandby
     */
    public Boolean getIsActiveStandby() {
        return isActiveStandby;
    }

    public void setIsActiveStandby(Boolean isActiveStandby) {
        this.isActiveStandby = isActiveStandby;
    }

    public Cluster withKeepDays(String keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /**
     * 使用天数
     * @return keepDays
     */
    public String getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(String keepDays) {
        this.keepDays = keepDays;
    }

    public Cluster withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cluster withNewVersion(String newVersion) {
        this.newVersion = newVersion;
        return this;
    }

    /**
     * 最新版本
     * @return newVersion
     */
    public String getNewVersion() {
        return newVersion;
    }

    public void setNewVersion(String newVersion) {
        this.newVersion = newVersion;
    }

    public Cluster withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 公网IP
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public Cluster withRemainDays(String remainDays) {
        this.remainDays = remainDays;
        return this;
    }

    /**
     * 剩余天数
     * @return remainDays
     */
    public String getRemainDays() {
        return remainDays;
    }

    public void setRemainDays(String remainDays) {
        this.remainDays = remainDays;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cluster that = (Cluster) obj;
        return Objects.equals(this.activateInfo, that.activateInfo)
            && Objects.equals(this.chargeModel, that.chargeModel) && Objects.equals(this.comment, that.comment)
            && Objects.equals(this.created, that.created) && Objects.equals(this.deployMode, that.deployMode)
            && Objects.equals(this.detail, that.detail)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.expired, that.expired) && Objects.equals(this.floatIp, that.floatIp)
            && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.isActiveStandby, that.isActiveStandby)
            && Objects.equals(this.keepDays, that.keepDays) && Objects.equals(this.name, that.name)
            && Objects.equals(this.newVersion, that.newVersion) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.remainDays, that.remainDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activateInfo,
            chargeModel,
            comment,
            created,
            deployMode,
            detail,
            enterpriseProjectId,
            expired,
            floatIp,
            instanceId,
            isActiveStandby,
            keepDays,
            name,
            newVersion,
            publicIp,
            remainDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Cluster {\n");
        sb.append("    activateInfo: ").append(toIndentedString(activateInfo)).append("\n");
        sb.append("    chargeModel: ").append(toIndentedString(chargeModel)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    deployMode: ").append(toIndentedString(deployMode)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
        sb.append("    floatIp: ").append(toIndentedString(floatIp)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    isActiveStandby: ").append(toIndentedString(isActiveStandby)).append("\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    newVersion: ").append(toIndentedString(newVersion)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    remainDays: ").append(toIndentedString(remainDays)).append("\n");
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
