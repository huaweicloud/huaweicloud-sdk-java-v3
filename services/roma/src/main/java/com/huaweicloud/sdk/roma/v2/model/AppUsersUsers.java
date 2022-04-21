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
 * AppUsersUsers
 */
public class AppUsersUsers {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

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

    private List<RolesEnum> roles = null;

    public AppUsersUsers withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用户ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AppUsersUsers withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用户名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppUsersUsers withRoles(List<RolesEnum> roles) {
        this.roles = roles;
        return this;
    }

    public AppUsersUsers addRolesItem(RolesEnum rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public AppUsersUsers withRoles(Consumer<List<RolesEnum>> rolesSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppUsersUsers appUsersUsers = (AppUsersUsers) o;
        return Objects.equals(this.id, appUsersUsers.id) && Objects.equals(this.name, appUsersUsers.name)
            && Objects.equals(this.roles, appUsersUsers.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, roles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppUsersUsers {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
