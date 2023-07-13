package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowLeagueResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bcs_channel_name")

    private String bcsChannelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bcs_ip")

    private String bcsIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bcs_org_name")

    private String bcsOrgName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_chain_id")

    private String blockChainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_chain_name")

    private String blockChainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_date")

    private OffsetDateTime createDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dp_enabled")

    private Boolean dpEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private Long expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_access_control")

    private Boolean isAccessControl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_need_approval")

    private Boolean isNeedApproval;

    /**
     * 联盟状态,CREATING.创建中,CREATE_FAILED.创建失败,NORMAL.正常,UPDATING.升级中,UPDATE_FAILED.升级失败,ROLLING.回滚中,ROLL_FAILED.回滚失败,DELETING.删除中,DELETE_FAILED.删除失败,DELETED.已删除
     */
    public static final class LeagueStatusEnum {

        /**
         * Enum CREATE_FAILED for value: "CREATE_FAILED"
         */
        public static final LeagueStatusEnum CREATE_FAILED = new LeagueStatusEnum("CREATE_FAILED");

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final LeagueStatusEnum CREATING = new LeagueStatusEnum("CREATING");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final LeagueStatusEnum DELETED = new LeagueStatusEnum("DELETED");

        /**
         * Enum DELETE_FAILED for value: "DELETE_FAILED"
         */
        public static final LeagueStatusEnum DELETE_FAILED = new LeagueStatusEnum("DELETE_FAILED");

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final LeagueStatusEnum DELETING = new LeagueStatusEnum("DELETING");

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final LeagueStatusEnum NORMAL = new LeagueStatusEnum("NORMAL");

        /**
         * Enum ROLLING for value: "ROLLING"
         */
        public static final LeagueStatusEnum ROLLING = new LeagueStatusEnum("ROLLING");

        /**
         * Enum ROLL_FAILED for value: "ROLL_FAILED"
         */
        public static final LeagueStatusEnum ROLL_FAILED = new LeagueStatusEnum("ROLL_FAILED");

        /**
         * Enum UPDATE_FAILED for value: "UPDATE_FAILED"
         */
        public static final LeagueStatusEnum UPDATE_FAILED = new LeagueStatusEnum("UPDATE_FAILED");

        /**
         * Enum UPDATING for value: "UPDATING"
         */
        public static final LeagueStatusEnum UPDATING = new LeagueStatusEnum("UPDATING");

        private static final Map<String, LeagueStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LeagueStatusEnum> createStaticFields() {
            Map<String, LeagueStatusEnum> map = new HashMap<>();
            map.put("CREATE_FAILED", CREATE_FAILED);
            map.put("CREATING", CREATING);
            map.put("DELETED", DELETED);
            map.put("DELETE_FAILED", DELETE_FAILED);
            map.put("DELETING", DELETING);
            map.put("NORMAL", NORMAL);
            map.put("ROLLING", ROLLING);
            map.put("ROLL_FAILED", ROLL_FAILED);
            map.put("UPDATE_FAILED", UPDATE_FAILED);
            map.put("UPDATING", UPDATING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LeagueStatusEnum(String value) {
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
        public static LeagueStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LeagueStatusEnum(value));
        }

        public static LeagueStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LeagueStatusEnum) {
                return this.value.equals(((LeagueStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "league_status")

    private LeagueStatusEnum leagueStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partners")

    private Long partners;

    /**
     * 隐私保护级别,STANDARD.标准,HIGH.高
     */
    public static final class PrivacyProtectionTypeEnum {

        /**
         * Enum HIGH for value: "HIGH"
         */
        public static final PrivacyProtectionTypeEnum HIGH = new PrivacyProtectionTypeEnum("HIGH");

        /**
         * Enum STANDARD for value: "STANDARD"
         */
        public static final PrivacyProtectionTypeEnum STANDARD = new PrivacyProtectionTypeEnum("STANDARD");

        private static final Map<String, PrivacyProtectionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PrivacyProtectionTypeEnum> createStaticFields() {
            Map<String, PrivacyProtectionTypeEnum> map = new HashMap<>();
            map.put("HIGH", HIGH);
            map.put("STANDARD", STANDARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PrivacyProtectionTypeEnum(String value) {
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
        public static PrivacyProtectionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PrivacyProtectionTypeEnum(value));
        }

        public static PrivacyProtectionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PrivacyProtectionTypeEnum) {
                return this.value.equals(((PrivacyProtectionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privacy_protection_type")

    private PrivacyProtectionTypeEnum privacyProtectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    /**
     * 参与类型,OWNER.所有者,PARTNER.参与者
     */
    public static final class TypeEnum {

        /**
         * Enum OWNER for value: "OWNER"
         */
        public static final TypeEnum OWNER = new TypeEnum("OWNER");

        /**
         * Enum PARTNER for value: "PARTNER"
         */
        public static final TypeEnum PARTNER = new TypeEnum("PARTNER");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("OWNER", OWNER);
            map.put("PARTNER", PARTNER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public ShowLeagueResponse withBcsChannelName(String bcsChannelName) {
        this.bcsChannelName = bcsChannelName;
        return this;
    }

    /**
     * BCS通道名称
     * @return bcsChannelName
     */
    public String getBcsChannelName() {
        return bcsChannelName;
    }

    public void setBcsChannelName(String bcsChannelName) {
        this.bcsChannelName = bcsChannelName;
    }

    public ShowLeagueResponse withBcsIp(String bcsIp) {
        this.bcsIp = bcsIp;
        return this;
    }

    /**
     * BCS浏览器ip
     * @return bcsIp
     */
    public String getBcsIp() {
        return bcsIp;
    }

    public void setBcsIp(String bcsIp) {
        this.bcsIp = bcsIp;
    }

    public ShowLeagueResponse withBcsOrgName(String bcsOrgName) {
        this.bcsOrgName = bcsOrgName;
        return this;
    }

    /**
     * BCS组织名称
     * @return bcsOrgName
     */
    public String getBcsOrgName() {
        return bcsOrgName;
    }

    public void setBcsOrgName(String bcsOrgName) {
        this.bcsOrgName = bcsOrgName;
    }

    public ShowLeagueResponse withBlockChainId(String blockChainId) {
        this.blockChainId = blockChainId;
        return this;
    }

    /**
     * BCS服务实例ID
     * @return blockChainId
     */
    public String getBlockChainId() {
        return blockChainId;
    }

    public void setBlockChainId(String blockChainId) {
        this.blockChainId = blockChainId;
    }

    public ShowLeagueResponse withBlockChainName(String blockChainName) {
        this.blockChainName = blockChainName;
        return this;
    }

    /**
     * BCS服务实例名称
     * @return blockChainName
     */
    public String getBlockChainName() {
        return blockChainName;
    }

    public void setBlockChainName(String blockChainName) {
        this.blockChainName = blockChainName;
    }

    public ShowLeagueResponse withCreateDate(OffsetDateTime createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * 创建日期
     * @return createDate
     */
    public OffsetDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(OffsetDateTime createDate) {
        this.createDate = createDate;
    }

    public ShowLeagueResponse withCreateTime(Long createTime) {
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

    public ShowLeagueResponse withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 创建人id
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public ShowLeagueResponse withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建人名称
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public ShowLeagueResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowLeagueResponse withDpEnabled(Boolean dpEnabled) {
        this.dpEnabled = dpEnabled;
        return this;
    }

    /**
     * 是否开启差分隐私
     * @return dpEnabled
     */
    public Boolean getDpEnabled() {
        return dpEnabled;
    }

    public void setDpEnabled(Boolean dpEnabled) {
        this.dpEnabled = dpEnabled;
    }

    public ShowLeagueResponse withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 过期时间
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public ShowLeagueResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 联盟id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowLeagueResponse withIsAccessControl(Boolean isAccessControl) {
        this.isAccessControl = isAccessControl;
        return this;
    }

    /**
     * 是否开启访问控制
     * @return isAccessControl
     */
    public Boolean getIsAccessControl() {
        return isAccessControl;
    }

    public void setIsAccessControl(Boolean isAccessControl) {
        this.isAccessControl = isAccessControl;
    }

    public ShowLeagueResponse withIsNeedApproval(Boolean isNeedApproval) {
        this.isNeedApproval = isNeedApproval;
        return this;
    }

    /**
     * 是否开启审批
     * @return isNeedApproval
     */
    public Boolean getIsNeedApproval() {
        return isNeedApproval;
    }

    public void setIsNeedApproval(Boolean isNeedApproval) {
        this.isNeedApproval = isNeedApproval;
    }

    public ShowLeagueResponse withLeagueStatus(LeagueStatusEnum leagueStatus) {
        this.leagueStatus = leagueStatus;
        return this;
    }

    /**
     * 联盟状态,CREATING.创建中,CREATE_FAILED.创建失败,NORMAL.正常,UPDATING.升级中,UPDATE_FAILED.升级失败,ROLLING.回滚中,ROLL_FAILED.回滚失败,DELETING.删除中,DELETE_FAILED.删除失败,DELETED.已删除
     * @return leagueStatus
     */
    public LeagueStatusEnum getLeagueStatus() {
        return leagueStatus;
    }

    public void setLeagueStatus(LeagueStatusEnum leagueStatus) {
        this.leagueStatus = leagueStatus;
    }

    public ShowLeagueResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 联盟名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowLeagueResponse withPartners(Long partners) {
        this.partners = partners;
        return this;
    }

    /**
     * 联盟成员数
     * @return partners
     */
    public Long getPartners() {
        return partners;
    }

    public void setPartners(Long partners) {
        this.partners = partners;
    }

    public ShowLeagueResponse withPrivacyProtectionType(PrivacyProtectionTypeEnum privacyProtectionType) {
        this.privacyProtectionType = privacyProtectionType;
        return this;
    }

    /**
     * 隐私保护级别,STANDARD.标准,HIGH.高
     * @return privacyProtectionType
     */
    public PrivacyProtectionTypeEnum getPrivacyProtectionType() {
        return privacyProtectionType;
    }

    public void setPrivacyProtectionType(PrivacyProtectionTypeEnum privacyProtectionType) {
        this.privacyProtectionType = privacyProtectionType;
    }

    public ShowLeagueResponse withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 资源规格
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public ShowLeagueResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 参与类型,OWNER.所有者,PARTNER.参与者
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowLeagueResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 联盟版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLeagueResponse that = (ShowLeagueResponse) obj;
        return Objects.equals(this.bcsChannelName, that.bcsChannelName) && Objects.equals(this.bcsIp, that.bcsIp)
            && Objects.equals(this.bcsOrgName, that.bcsOrgName) && Objects.equals(this.blockChainId, that.blockChainId)
            && Objects.equals(this.blockChainName, that.blockChainName)
            && Objects.equals(this.createDate, that.createDate) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.creatorId, that.creatorId) && Objects.equals(this.creatorName, that.creatorName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.dpEnabled, that.dpEnabled)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.id, that.id)
            && Objects.equals(this.isAccessControl, that.isAccessControl)
            && Objects.equals(this.isNeedApproval, that.isNeedApproval)
            && Objects.equals(this.leagueStatus, that.leagueStatus) && Objects.equals(this.name, that.name)
            && Objects.equals(this.partners, that.partners)
            && Objects.equals(this.privacyProtectionType, that.privacyProtectionType)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode) && Objects.equals(this.type, that.type)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bcsChannelName,
            bcsIp,
            bcsOrgName,
            blockChainId,
            blockChainName,
            createDate,
            createTime,
            creatorId,
            creatorName,
            description,
            dpEnabled,
            expireTime,
            id,
            isAccessControl,
            isNeedApproval,
            leagueStatus,
            name,
            partners,
            privacyProtectionType,
            resourceSpecCode,
            type,
            version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLeagueResponse {\n");
        sb.append("    bcsChannelName: ").append(toIndentedString(bcsChannelName)).append("\n");
        sb.append("    bcsIp: ").append(toIndentedString(bcsIp)).append("\n");
        sb.append("    bcsOrgName: ").append(toIndentedString(bcsOrgName)).append("\n");
        sb.append("    blockChainId: ").append(toIndentedString(blockChainId)).append("\n");
        sb.append("    blockChainName: ").append(toIndentedString(blockChainName)).append("\n");
        sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dpEnabled: ").append(toIndentedString(dpEnabled)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isAccessControl: ").append(toIndentedString(isAccessControl)).append("\n");
        sb.append("    isNeedApproval: ").append(toIndentedString(isNeedApproval)).append("\n");
        sb.append("    leagueStatus: ").append(toIndentedString(leagueStatus)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    partners: ").append(toIndentedString(partners)).append("\n");
        sb.append("    privacyProtectionType: ").append(toIndentedString(privacyProtectionType)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
