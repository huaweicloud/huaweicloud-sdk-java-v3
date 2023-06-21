package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 联盟信息
 */
public class TicsLeagueListVo {

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
    @JsonProperty(value = "expire_time")

    private Long expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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
            LeagueStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LeagueStatusEnum(value);
            }
            return result;
        }

        public static LeagueStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LeagueStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public TicsLeagueListVo withBcsChannelName(String bcsChannelName) {
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

    public TicsLeagueListVo withBcsIp(String bcsIp) {
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

    public TicsLeagueListVo withBcsOrgName(String bcsOrgName) {
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

    public TicsLeagueListVo withBlockChainId(String blockChainId) {
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

    public TicsLeagueListVo withBlockChainName(String blockChainName) {
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

    public TicsLeagueListVo withCreateDate(OffsetDateTime createDate) {
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

    public TicsLeagueListVo withCreateTime(Long createTime) {
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

    public TicsLeagueListVo withCreatorId(String creatorId) {
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

    public TicsLeagueListVo withCreatorName(String creatorName) {
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

    public TicsLeagueListVo withExpireTime(Long expireTime) {
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

    public TicsLeagueListVo withId(String id) {
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

    public TicsLeagueListVo withLeagueStatus(LeagueStatusEnum leagueStatus) {
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

    public TicsLeagueListVo withName(String name) {
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

    public TicsLeagueListVo withPartners(Long partners) {
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

    public TicsLeagueListVo withType(TypeEnum type) {
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

    public TicsLeagueListVo withVersion(String version) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TicsLeagueListVo ticsLeagueListVo = (TicsLeagueListVo) o;
        return Objects.equals(this.bcsChannelName, ticsLeagueListVo.bcsChannelName)
            && Objects.equals(this.bcsIp, ticsLeagueListVo.bcsIp)
            && Objects.equals(this.bcsOrgName, ticsLeagueListVo.bcsOrgName)
            && Objects.equals(this.blockChainId, ticsLeagueListVo.blockChainId)
            && Objects.equals(this.blockChainName, ticsLeagueListVo.blockChainName)
            && Objects.equals(this.createDate, ticsLeagueListVo.createDate)
            && Objects.equals(this.createTime, ticsLeagueListVo.createTime)
            && Objects.equals(this.creatorId, ticsLeagueListVo.creatorId)
            && Objects.equals(this.creatorName, ticsLeagueListVo.creatorName)
            && Objects.equals(this.expireTime, ticsLeagueListVo.expireTime)
            && Objects.equals(this.id, ticsLeagueListVo.id)
            && Objects.equals(this.leagueStatus, ticsLeagueListVo.leagueStatus)
            && Objects.equals(this.name, ticsLeagueListVo.name)
            && Objects.equals(this.partners, ticsLeagueListVo.partners)
            && Objects.equals(this.type, ticsLeagueListVo.type)
            && Objects.equals(this.version, ticsLeagueListVo.version);
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
            expireTime,
            id,
            leagueStatus,
            name,
            partners,
            type,
            version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TicsLeagueListVo {\n");
        sb.append("    bcsChannelName: ").append(toIndentedString(bcsChannelName)).append("\n");
        sb.append("    bcsIp: ").append(toIndentedString(bcsIp)).append("\n");
        sb.append("    bcsOrgName: ").append(toIndentedString(bcsOrgName)).append("\n");
        sb.append("    blockChainId: ").append(toIndentedString(blockChainId)).append("\n");
        sb.append("    blockChainName: ").append(toIndentedString(blockChainName)).append("\n");
        sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    leagueStatus: ").append(toIndentedString(leagueStatus)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    partners: ").append(toIndentedString(partners)).append("\n");
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
