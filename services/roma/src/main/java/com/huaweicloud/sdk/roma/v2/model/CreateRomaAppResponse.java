package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateRomaAppResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    @JacksonXmlProperty(localName = "remark")

    private String remark;

    /**
     * Gets or Sets roles
     */
    public static final class RolesEnum {

        /**
         * Enum READ for value: "read"
         */
        public static final RolesEnum READ = new RolesEnum("read");

        /**
         * Enum ACCESS for value: "access"
         */
        public static final RolesEnum ACCESS = new RolesEnum("access");

        /**
         * Enum DELETE for value: "delete"
         */
        public static final RolesEnum DELETE = new RolesEnum("delete");

        /**
         * Enum MODIFY for value: "modify"
         */
        public static final RolesEnum MODIFY = new RolesEnum("modify");

        /**
         * Enum ADMIN for value: "admin"
         */
        public static final RolesEnum ADMIN = new RolesEnum("admin");

        private static final Map<String, RolesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RolesEnum> createStaticFields() {
            Map<String, RolesEnum> map = new HashMap<>();
            map.put("read", READ);
            map.put("access", ACCESS);
            map.put("delete", DELETE);
            map.put("modify", MODIFY);
            map.put("admin", ADMIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RolesEnum(String value) {
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
        public static RolesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            RolesEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RolesEnum(value);
            }
            return result;
        }

        public static RolesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            RolesEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RolesEnum) {
                return this.value.equals(((RolesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    @JacksonXmlProperty(localName = "roles")

    private List<RolesEnum> roles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    @JacksonXmlProperty(localName = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_user")

    @JacksonXmlProperty(localName = "created_user")

    private ServerAppInfoCreatedUser createdUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_updated_user")

    @JacksonXmlProperty(localName = "last_updated_user")

    private ServerAppInfoLastUpdatedUser lastUpdatedUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    @JacksonXmlProperty(localName = "owner")

    private Boolean owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    @JacksonXmlProperty(localName = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favorite")

    @JacksonXmlProperty(localName = "favorite")

    private Boolean favorite;

    public CreateRomaAppResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 应用ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateRomaAppResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用名称 - 字符集：支持中文、英文字母、数字、中划线、下划线、点、空格和中英文圆括号 - 约束：实例下唯一
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateRomaAppResponse withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 应用描述
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public CreateRomaAppResponse withRoles(List<RolesEnum> roles) {
        this.roles = roles;
        return this;
    }

    public CreateRomaAppResponse addRolesItem(RolesEnum rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public CreateRomaAppResponse withRoles(Consumer<List<RolesEnum>> rolesSetter) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * 应用权限角色 - read：应用下资源只读权限，至少要存在此权限，包括API调试 - access：应用下资源的访问管理权限 - delete：应用下资源的删除权限 - modify：应用下资源的修改权限，包括API发布、下线 - admin：应用和应用下资源的权限 - 仅提供admin时，会自动应用其它所有权限 - 未提供read时会自动应用read权限
     * @return roles
     */
    public List<RolesEnum> getRoles() {
        return roles;
    }

    public void setRoles(List<RolesEnum> roles) {
        this.roles = roles;
    }

    public CreateRomaAppResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建UTC时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CreateRomaAppResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 创建UTC时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public CreateRomaAppResponse withCreatedUser(ServerAppInfoCreatedUser createdUser) {
        this.createdUser = createdUser;
        return this;
    }

    public CreateRomaAppResponse withCreatedUser(Consumer<ServerAppInfoCreatedUser> createdUserSetter) {
        if (this.createdUser == null) {
            this.createdUser = new ServerAppInfoCreatedUser();
            createdUserSetter.accept(this.createdUser);
        }

        return this;
    }

    /**
     * Get createdUser
     * @return createdUser
     */
    public ServerAppInfoCreatedUser getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(ServerAppInfoCreatedUser createdUser) {
        this.createdUser = createdUser;
    }

    public CreateRomaAppResponse withLastUpdatedUser(ServerAppInfoLastUpdatedUser lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
        return this;
    }

    public CreateRomaAppResponse withLastUpdatedUser(Consumer<ServerAppInfoLastUpdatedUser> lastUpdatedUserSetter) {
        if (this.lastUpdatedUser == null) {
            this.lastUpdatedUser = new ServerAppInfoLastUpdatedUser();
            lastUpdatedUserSetter.accept(this.lastUpdatedUser);
        }

        return this;
    }

    /**
     * Get lastUpdatedUser
     * @return lastUpdatedUser
     */
    public ServerAppInfoLastUpdatedUser getLastUpdatedUser() {
        return lastUpdatedUser;
    }

    public void setLastUpdatedUser(ServerAppInfoLastUpdatedUser lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
    }

    public CreateRomaAppResponse withOwner(Boolean owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 是否是应用拥有者
     * @return owner
     */
    public Boolean getOwner() {
        return owner;
    }

    public void setOwner(Boolean owner) {
        this.owner = owner;
    }

    public CreateRomaAppResponse withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 应用认证访问KEY,未提供时随机生成 - 字符集：支持中文、英文字母、数字、中划线、下划线、@号和点，以字母或中文或数字开头 - 约束：实例下唯一
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CreateRomaAppResponse withFavorite(Boolean favorite) {
        this.favorite = favorite;
        return this;
    }

    /**
     * 是否收藏应用，收藏的应用会在列表里优先显示
     * @return favorite
     */
    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRomaAppResponse createRomaAppResponse = (CreateRomaAppResponse) o;
        return Objects.equals(this.id, createRomaAppResponse.id)
            && Objects.equals(this.name, createRomaAppResponse.name)
            && Objects.equals(this.remark, createRomaAppResponse.remark)
            && Objects.equals(this.roles, createRomaAppResponse.roles)
            && Objects.equals(this.createTime, createRomaAppResponse.createTime)
            && Objects.equals(this.updateTime, createRomaAppResponse.updateTime)
            && Objects.equals(this.createdUser, createRomaAppResponse.createdUser)
            && Objects.equals(this.lastUpdatedUser, createRomaAppResponse.lastUpdatedUser)
            && Objects.equals(this.owner, createRomaAppResponse.owner)
            && Objects.equals(this.key, createRomaAppResponse.key)
            && Objects.equals(this.favorite, createRomaAppResponse.favorite);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, remark, roles, createTime, updateTime, createdUser, lastUpdatedUser, owner, key, favorite);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRomaAppResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    createdUser: ").append(toIndentedString(createdUser)).append("\n");
        sb.append("    lastUpdatedUser: ").append(toIndentedString(lastUpdatedUser)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
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
