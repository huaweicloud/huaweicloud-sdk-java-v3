package com.huaweicloud.sdk.roma.v2.model;

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
 * RomaInstanceCheckListRespInstances
 */
public class RomaInstanceCheckListRespInstances {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_type")

    private String flavorType;

    /**
     * CPU架构类型，取值如下： - x86_64: x86架构 - aarch64: arm架构 
     */
    public static final class CpuArchEnum {

        /**
         * Enum X86_64 for value: "x86_64"
         */
        public static final CpuArchEnum X86_64 = new CpuArchEnum("x86_64");

        /**
         * Enum AARCH64 for value: "aarch64"
         */
        public static final CpuArchEnum AARCH64 = new CpuArchEnum("aarch64");

        private static final Map<String, CpuArchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CpuArchEnum> createStaticFields() {
            Map<String, CpuArchEnum> map = new HashMap<>();
            map.put("x86_64", X86_64);
            map.put("aarch64", AARCH64);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CpuArchEnum(String value) {
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
        public static CpuArchEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CpuArchEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CpuArchEnum(value);
            }
            return result;
        }

        public static CpuArchEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CpuArchEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CpuArchEnum) {
                return this.value.equals(((CpuArchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_arch")

    private CpuArchEnum cpuArch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_enable")

    private Boolean publicipEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_id")

    private String publicipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_address")

    private String publicipAddress;

    /**
     * 实例运行状态
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final StatusEnum CREATING = new StatusEnum("CREATING");

        /**
         * Enum CREATE_FAILED for value: "CREATE_FAILED"
         */
        public static final StatusEnum CREATE_FAILED = new StatusEnum("CREATE_FAILED");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        /**
         * Enum FREEZING for value: "FREEZING"
         */
        public static final StatusEnum FREEZING = new StatusEnum("FREEZING");

        /**
         * Enum FROZEN for value: "FROZEN"
         */
        public static final StatusEnum FROZEN = new StatusEnum("FROZEN");

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final StatusEnum DELETING = new StatusEnum("DELETING");

        /**
         * Enum DELETE_FALIED for value: "DELETE_FALIED"
         */
        public static final StatusEnum DELETE_FALIED = new StatusEnum("DELETE_FALIED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("CREATE_FAILED", CREATE_FAILED);
            map.put("ERROR", ERROR);
            map.put("RUNNING", RUNNING);
            map.put("FREEZING", FREEZING);
            map.put("FROZEN", FROZEN);
            map.put("DELETING", DELETING);
            map.put("DELETE_FALIED", DELETE_FALIED);
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
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    /**
     * 实例计费模式
     */
    public static final class ChargeTypeEnum {

        /**
         * Enum PREPAID for value: "prePaid"
         */
        public static final ChargeTypeEnum PREPAID = new ChargeTypeEnum("prePaid");

        /**
         * Enum POSTPAID for value: "postPaid"
         */
        public static final ChargeTypeEnum POSTPAID = new ChargeTypeEnum("postPaid");

        private static final Map<String, ChargeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeTypeEnum> createStaticFields() {
            Map<String, ChargeTypeEnum> map = new HashMap<>();
            map.put("prePaid", PREPAID);
            map.put("postPaid", POSTPAID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargeTypeEnum(String value) {
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
        public static ChargeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ChargeTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ChargeTypeEnum(value);
            }
            return result;
        }

        public static ChargeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ChargeTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargeTypeEnum) {
                return this.value.equals(((ChargeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_type")

    private ChargeTypeEnum chargeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_begin")

    private String maintainBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_end")

    private String maintainEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zone_ids")

    private List<String> availableZoneIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public RomaInstanceCheckListRespInstances withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RomaInstanceCheckListRespInstances withName(String name) {
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

    public RomaInstanceCheckListRespInstances withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 实例描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RomaInstanceCheckListRespInstances withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 实例规格ID
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public RomaInstanceCheckListRespInstances withFlavorType(String flavorType) {
        this.flavorType = flavorType;
        return this;
    }

    /**
     * 实例规格类型
     * @return flavorType
     */
    public String getFlavorType() {
        return flavorType;
    }

    public void setFlavorType(String flavorType) {
        this.flavorType = flavorType;
    }

    public RomaInstanceCheckListRespInstances withCpuArch(CpuArchEnum cpuArch) {
        this.cpuArch = cpuArch;
        return this;
    }

    /**
     * CPU架构类型，取值如下： - x86_64: x86架构 - aarch64: arm架构 
     * @return cpuArch
     */
    public CpuArchEnum getCpuArch() {
        return cpuArch;
    }

    public void setCpuArch(CpuArchEnum cpuArch) {
        this.cpuArch = cpuArch;
    }

    public RomaInstanceCheckListRespInstances withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 实例指定虚拟私有云ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public RomaInstanceCheckListRespInstances withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 实例指定虚拟私有云子网ID
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public RomaInstanceCheckListRespInstances withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 实例指定安全组ID
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public RomaInstanceCheckListRespInstances withPublicipEnable(Boolean publicipEnable) {
        this.publicipEnable = publicipEnable;
        return this;
    }

    /**
     * 是否开启公网访问，开启时publicip_id字段必填。 
     * @return publicipEnable
     */
    public Boolean getPublicipEnable() {
        return publicipEnable;
    }

    public void setPublicipEnable(Boolean publicipEnable) {
        this.publicipEnable = publicipEnable;
    }

    public RomaInstanceCheckListRespInstances withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /**
     * 实例绑定的弹性公网地址ID
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public RomaInstanceCheckListRespInstances withPublicipAddress(String publicipAddress) {
        this.publicipAddress = publicipAddress;
        return this;
    }

    /**
     * 实例绑定的弹性公网地址
     * @return publicipAddress
     */
    public String getPublicipAddress() {
        return publicipAddress;
    }

    public void setPublicipAddress(String publicipAddress) {
        this.publicipAddress = publicipAddress;
    }

    public RomaInstanceCheckListRespInstances withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 实例运行状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public RomaInstanceCheckListRespInstances withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public RomaInstanceCheckListRespInstances withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误消息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public RomaInstanceCheckListRespInstances withChargeType(ChargeTypeEnum chargeType) {
        this.chargeType = chargeType;
        return this;
    }

    /**
     * 实例计费模式
     * @return chargeType
     */
    public ChargeTypeEnum getChargeType() {
        return chargeType;
    }

    public void setChargeType(ChargeTypeEnum chargeType) {
        this.chargeType = chargeType;
    }

    public RomaInstanceCheckListRespInstances withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public RomaInstanceCheckListRespInstances withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public RomaInstanceCheckListRespInstances withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public RomaInstanceCheckListRespInstances withMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
        return this;
    }

    /**
     * 运维开始时间
     * @return maintainBegin
     */
    public String getMaintainBegin() {
        return maintainBegin;
    }

    public void setMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
    }

    public RomaInstanceCheckListRespInstances withMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
        return this;
    }

    /**
     * 运维结束时间
     * @return maintainEnd
     */
    public String getMaintainEnd() {
        return maintainEnd;
    }

    public void setMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
    }

    public RomaInstanceCheckListRespInstances withAvailableZoneIds(List<String> availableZoneIds) {
        this.availableZoneIds = availableZoneIds;
        return this;
    }

    public RomaInstanceCheckListRespInstances addAvailableZoneIdsItem(String availableZoneIdsItem) {
        if (this.availableZoneIds == null) {
            this.availableZoneIds = new ArrayList<>();
        }
        this.availableZoneIds.add(availableZoneIdsItem);
        return this;
    }

    public RomaInstanceCheckListRespInstances withAvailableZoneIds(Consumer<List<String>> availableZoneIdsSetter) {
        if (this.availableZoneIds == null) {
            this.availableZoneIds = new ArrayList<>();
        }
        availableZoneIdsSetter.accept(this.availableZoneIds);
        return this;
    }

    /**
     * 创实例使用的可用区列表
     * @return availableZoneIds
     */
    public List<String> getAvailableZoneIds() {
        return availableZoneIds;
    }

    public void setAvailableZoneIds(List<String> availableZoneIds) {
        this.availableZoneIds = availableZoneIds;
    }

    public RomaInstanceCheckListRespInstances withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 实例所属企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RomaInstanceCheckListRespInstances romaInstanceCheckListRespInstances = (RomaInstanceCheckListRespInstances) o;
        return Objects.equals(this.id, romaInstanceCheckListRespInstances.id)
            && Objects.equals(this.name, romaInstanceCheckListRespInstances.name)
            && Objects.equals(this.description, romaInstanceCheckListRespInstances.description)
            && Objects.equals(this.flavorId, romaInstanceCheckListRespInstances.flavorId)
            && Objects.equals(this.flavorType, romaInstanceCheckListRespInstances.flavorType)
            && Objects.equals(this.cpuArch, romaInstanceCheckListRespInstances.cpuArch)
            && Objects.equals(this.vpcId, romaInstanceCheckListRespInstances.vpcId)
            && Objects.equals(this.subnetId, romaInstanceCheckListRespInstances.subnetId)
            && Objects.equals(this.securityGroupId, romaInstanceCheckListRespInstances.securityGroupId)
            && Objects.equals(this.publicipEnable, romaInstanceCheckListRespInstances.publicipEnable)
            && Objects.equals(this.publicipId, romaInstanceCheckListRespInstances.publicipId)
            && Objects.equals(this.publicipAddress, romaInstanceCheckListRespInstances.publicipAddress)
            && Objects.equals(this.status, romaInstanceCheckListRespInstances.status)
            && Objects.equals(this.errorCode, romaInstanceCheckListRespInstances.errorCode)
            && Objects.equals(this.errorMsg, romaInstanceCheckListRespInstances.errorMsg)
            && Objects.equals(this.chargeType, romaInstanceCheckListRespInstances.chargeType)
            && Objects.equals(this.projectId, romaInstanceCheckListRespInstances.projectId)
            && Objects.equals(this.createTime, romaInstanceCheckListRespInstances.createTime)
            && Objects.equals(this.updateTime, romaInstanceCheckListRespInstances.updateTime)
            && Objects.equals(this.maintainBegin, romaInstanceCheckListRespInstances.maintainBegin)
            && Objects.equals(this.maintainEnd, romaInstanceCheckListRespInstances.maintainEnd)
            && Objects.equals(this.availableZoneIds, romaInstanceCheckListRespInstances.availableZoneIds)
            && Objects.equals(this.enterpriseProjectId, romaInstanceCheckListRespInstances.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            flavorId,
            flavorType,
            cpuArch,
            vpcId,
            subnetId,
            securityGroupId,
            publicipEnable,
            publicipId,
            publicipAddress,
            status,
            errorCode,
            errorMsg,
            chargeType,
            projectId,
            createTime,
            updateTime,
            maintainBegin,
            maintainEnd,
            availableZoneIds,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RomaInstanceCheckListRespInstances {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    flavorType: ").append(toIndentedString(flavorType)).append("\n");
        sb.append("    cpuArch: ").append(toIndentedString(cpuArch)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    publicipEnable: ").append(toIndentedString(publicipEnable)).append("\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
        sb.append("    publicipAddress: ").append(toIndentedString(publicipAddress)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    maintainBegin: ").append(toIndentedString(maintainBegin)).append("\n");
        sb.append("    maintainEnd: ").append(toIndentedString(maintainEnd)).append("\n");
        sb.append("    availableZoneIds: ").append(toIndentedString(availableZoneIds)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
