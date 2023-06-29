package com.huaweicloud.sdk.workspace.v2.model;

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
 * UserGroupInfo
 */
public class UserGroupInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_quantity")

    private Integer userQuantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent")

    private UserGroupInfo parent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "realm_id")

    private String realmId;

    /**
     * 用户组类型。 * AD： AD域用户组 * LOCAL： 本地liteAs用户组
     */
    public static final class PlatformTypeEnum {

        /**
         * Enum AD for value: "AD"
         */
        public static final PlatformTypeEnum AD = new PlatformTypeEnum("AD");

        /**
         * Enum LOCAL for value: "LOCAL"
         */
        public static final PlatformTypeEnum LOCAL = new PlatformTypeEnum("LOCAL");

        private static final Map<String, PlatformTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PlatformTypeEnum> createStaticFields() {
            Map<String, PlatformTypeEnum> map = new HashMap<>();
            map.put("AD", AD);
            map.put("LOCAL", LOCAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PlatformTypeEnum(String value) {
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
        public static PlatformTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PlatformTypeEnum(value));
        }

        public static PlatformTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PlatformTypeEnum) {
                return this.value.equals(((PlatformTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_type")

    private PlatformTypeEnum platformType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_dn")

    private String groupDn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sid")

    private String sid;

    public UserGroupInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用户组名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserGroupInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用户组ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserGroupInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 用户组对应的创建时间，UTC时间：yyyy-MM-ddTHH:mm:ss.SSSZ。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public UserGroupInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 用户组描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserGroupInfo withUserQuantity(Integer userQuantity) {
        this.userQuantity = userQuantity;
        return this;
    }

    /**
     * 用户列表中用户数。
     * @return userQuantity
     */
    public Integer getUserQuantity() {
        return userQuantity;
    }

    public void setUserQuantity(Integer userQuantity) {
        this.userQuantity = userQuantity;
    }

    public UserGroupInfo withParent(UserGroupInfo parent) {
        this.parent = parent;
        return this;
    }

    public UserGroupInfo withParent(Consumer<UserGroupInfo> parentSetter) {
        if (this.parent == null) {
            this.parent = new UserGroupInfo();
            parentSetter.accept(this.parent);
        }

        return this;
    }

    /**
     * Get parent
     * @return parent
     */
    public UserGroupInfo getParent() {
        return parent;
    }

    public void setParent(UserGroupInfo parent) {
        this.parent = parent;
    }

    public UserGroupInfo withRealmId(String realmId) {
        this.realmId = realmId;
        return this;
    }

    /**
     * 用户组域Id。
     * @return realmId
     */
    public String getRealmId() {
        return realmId;
    }

    public void setRealmId(String realmId) {
        this.realmId = realmId;
    }

    public UserGroupInfo withPlatformType(PlatformTypeEnum platformType) {
        this.platformType = platformType;
        return this;
    }

    /**
     * 用户组类型。 * AD： AD域用户组 * LOCAL： 本地liteAs用户组
     * @return platformType
     */
    public PlatformTypeEnum getPlatformType() {
        return platformType;
    }

    public void setPlatformType(PlatformTypeEnum platformType) {
        this.platformType = platformType;
    }

    public UserGroupInfo withGroupDn(String groupDn) {
        this.groupDn = groupDn;
        return this;
    }

    /**
     * 用户组专有名。
     * @return groupDn
     */
    public String getGroupDn() {
        return groupDn;
    }

    public void setGroupDn(String groupDn) {
        this.groupDn = groupDn;
    }

    public UserGroupInfo withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 用户组域名。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public UserGroupInfo withSid(String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * 用户组sid。
     * @return sid
     */
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserGroupInfo that = (UserGroupInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.id, that.id)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.description, that.description)
            && Objects.equals(this.userQuantity, that.userQuantity) && Objects.equals(this.parent, that.parent)
            && Objects.equals(this.realmId, that.realmId) && Objects.equals(this.platformType, that.platformType)
            && Objects.equals(this.groupDn, that.groupDn) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.sid, that.sid);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, id, createTime, description, userQuantity, parent, realmId, platformType, groupDn, domain, sid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserGroupInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    userQuantity: ").append(toIndentedString(userQuantity)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
        sb.append("    realmId: ").append(toIndentedString(realmId)).append("\n");
        sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
        sb.append("    groupDn: ").append(toIndentedString(groupDn)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
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
