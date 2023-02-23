package com.huaweicloud.sdk.lakeformation.v1.model;

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
 * access policy input body
 */
public class AccessPolicyInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_list")

    private List<Principal> principalList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private ResourceInfo resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect")

    private Boolean effect;

    /**
     * Gets or Sets permissions
     */
    public static final class PermissionsEnum {

        /**
         * Enum ALL for value: "ALL"
         */
        public static final PermissionsEnum ALL = new PermissionsEnum("ALL");

        /**
         * Enum CREATE for value: "CREATE"
         */
        public static final PermissionsEnum CREATE = new PermissionsEnum("CREATE");

        /**
         * Enum ALTER for value: "ALTER"
         */
        public static final PermissionsEnum ALTER = new PermissionsEnum("ALTER");

        /**
         * Enum DROP for value: "DROP"
         */
        public static final PermissionsEnum DROP = new PermissionsEnum("DROP");

        /**
         * Enum DESCRIBE for value: "DESCRIBE"
         */
        public static final PermissionsEnum DESCRIBE = new PermissionsEnum("DESCRIBE");

        /**
         * Enum EXEC for value: "EXEC"
         */
        public static final PermissionsEnum EXEC = new PermissionsEnum("EXEC");

        /**
         * Enum CREATE_DATABASE for value: "CREATE_DATABASE"
         */
        public static final PermissionsEnum CREATE_DATABASE = new PermissionsEnum("CREATE_DATABASE");

        /**
         * Enum LIST_DATABASE for value: "LIST_DATABASE"
         */
        public static final PermissionsEnum LIST_DATABASE = new PermissionsEnum("LIST_DATABASE");

        /**
         * Enum CREATE_TABLE for value: "CREATE_TABLE"
         */
        public static final PermissionsEnum CREATE_TABLE = new PermissionsEnum("CREATE_TABLE");

        /**
         * Enum LIST_TABLE for value: "LIST_TABLE"
         */
        public static final PermissionsEnum LIST_TABLE = new PermissionsEnum("LIST_TABLE");

        /**
         * Enum CREATE_FUNC for value: "CREATE_FUNC"
         */
        public static final PermissionsEnum CREATE_FUNC = new PermissionsEnum("CREATE_FUNC");

        /**
         * Enum LIST_FUNC for value: "LIST_FUNC"
         */
        public static final PermissionsEnum LIST_FUNC = new PermissionsEnum("LIST_FUNC");

        /**
         * Enum REGISTER_MODEL for value: "REGISTER_MODEL"
         */
        public static final PermissionsEnum REGISTER_MODEL = new PermissionsEnum("REGISTER_MODEL");

        /**
         * Enum LIST_MODEL for value: "LIST_MODEL"
         */
        public static final PermissionsEnum LIST_MODEL = new PermissionsEnum("LIST_MODEL");

        /**
         * Enum INSERT for value: "INSERT"
         */
        public static final PermissionsEnum INSERT = new PermissionsEnum("INSERT");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final PermissionsEnum UPDATE = new PermissionsEnum("UPDATE");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final PermissionsEnum DELETE = new PermissionsEnum("DELETE");

        /**
         * Enum SELECT for value: "SELECT"
         */
        public static final PermissionsEnum SELECT = new PermissionsEnum("SELECT");

        /**
         * Enum READ for value: "READ"
         */
        public static final PermissionsEnum READ = new PermissionsEnum("READ");

        /**
         * Enum WRITE for value: "WRITE"
         */
        public static final PermissionsEnum WRITE = new PermissionsEnum("WRITE");

        /**
         * Enum OPERATE for value: "OPERATE"
         */
        public static final PermissionsEnum OPERATE = new PermissionsEnum("OPERATE");

        private static final Map<String, PermissionsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionsEnum> createStaticFields() {
            Map<String, PermissionsEnum> map = new HashMap<>();
            map.put("ALL", ALL);
            map.put("CREATE", CREATE);
            map.put("ALTER", ALTER);
            map.put("DROP", DROP);
            map.put("DESCRIBE", DESCRIBE);
            map.put("EXEC", EXEC);
            map.put("CREATE_DATABASE", CREATE_DATABASE);
            map.put("LIST_DATABASE", LIST_DATABASE);
            map.put("CREATE_TABLE", CREATE_TABLE);
            map.put("LIST_TABLE", LIST_TABLE);
            map.put("CREATE_FUNC", CREATE_FUNC);
            map.put("LIST_FUNC", LIST_FUNC);
            map.put("REGISTER_MODEL", REGISTER_MODEL);
            map.put("LIST_MODEL", LIST_MODEL);
            map.put("INSERT", INSERT);
            map.put("UPDATE", UPDATE);
            map.put("DELETE", DELETE);
            map.put("SELECT", SELECT);
            map.put("READ", READ);
            map.put("WRITE", WRITE);
            map.put("OPERATE", OPERATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PermissionsEnum(String value) {
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
        public static PermissionsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PermissionsEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PermissionsEnum(value);
            }
            return result;
        }

        public static PermissionsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PermissionsEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermissionsEnum) {
                return this.value.equals(((PermissionsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permissions")

    private List<PermissionsEnum> permissions = null;

    /**
    * Gets or Sets grantAblePermissions
    */
    public static final class GrantAblePermissionsEnum {

        /**
         * Enum ALL for value: "ALL"
         */
        public static final GrantAblePermissionsEnum ALL = new GrantAblePermissionsEnum("ALL");

        /**
         * Enum CREATE for value: "CREATE"
         */
        public static final GrantAblePermissionsEnum CREATE = new GrantAblePermissionsEnum("CREATE");

        /**
         * Enum ALTER for value: "ALTER"
         */
        public static final GrantAblePermissionsEnum ALTER = new GrantAblePermissionsEnum("ALTER");

        /**
         * Enum DROP for value: "DROP"
         */
        public static final GrantAblePermissionsEnum DROP = new GrantAblePermissionsEnum("DROP");

        /**
         * Enum DESCRIBE for value: "DESCRIBE"
         */
        public static final GrantAblePermissionsEnum DESCRIBE = new GrantAblePermissionsEnum("DESCRIBE");

        /**
         * Enum EXEC for value: "EXEC"
         */
        public static final GrantAblePermissionsEnum EXEC = new GrantAblePermissionsEnum("EXEC");

        /**
         * Enum CREATE_DATABASE for value: "CREATE_DATABASE"
         */
        public static final GrantAblePermissionsEnum CREATE_DATABASE = new GrantAblePermissionsEnum("CREATE_DATABASE");

        /**
         * Enum LIST_DATABASE for value: "LIST_DATABASE"
         */
        public static final GrantAblePermissionsEnum LIST_DATABASE = new GrantAblePermissionsEnum("LIST_DATABASE");

        /**
         * Enum CREATE_TABLE for value: "CREATE_TABLE"
         */
        public static final GrantAblePermissionsEnum CREATE_TABLE = new GrantAblePermissionsEnum("CREATE_TABLE");

        /**
         * Enum LIST_TABLE for value: "LIST_TABLE"
         */
        public static final GrantAblePermissionsEnum LIST_TABLE = new GrantAblePermissionsEnum("LIST_TABLE");

        /**
         * Enum CREATE_FUNC for value: "CREATE_FUNC"
         */
        public static final GrantAblePermissionsEnum CREATE_FUNC = new GrantAblePermissionsEnum("CREATE_FUNC");

        /**
         * Enum LIST_FUNC for value: "LIST_FUNC"
         */
        public static final GrantAblePermissionsEnum LIST_FUNC = new GrantAblePermissionsEnum("LIST_FUNC");

        /**
         * Enum REGISTER_MODEL for value: "REGISTER_MODEL"
         */
        public static final GrantAblePermissionsEnum REGISTER_MODEL = new GrantAblePermissionsEnum("REGISTER_MODEL");

        /**
         * Enum LIST_MODEL for value: "LIST_MODEL"
         */
        public static final GrantAblePermissionsEnum LIST_MODEL = new GrantAblePermissionsEnum("LIST_MODEL");

        /**
         * Enum INSERT for value: "INSERT"
         */
        public static final GrantAblePermissionsEnum INSERT = new GrantAblePermissionsEnum("INSERT");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final GrantAblePermissionsEnum UPDATE = new GrantAblePermissionsEnum("UPDATE");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final GrantAblePermissionsEnum DELETE = new GrantAblePermissionsEnum("DELETE");

        /**
         * Enum SELECT for value: "SELECT"
         */
        public static final GrantAblePermissionsEnum SELECT = new GrantAblePermissionsEnum("SELECT");

        /**
         * Enum READ for value: "READ"
         */
        public static final GrantAblePermissionsEnum READ = new GrantAblePermissionsEnum("READ");

        /**
         * Enum WRITE for value: "WRITE"
         */
        public static final GrantAblePermissionsEnum WRITE = new GrantAblePermissionsEnum("WRITE");

        /**
         * Enum OPERATE for value: "OPERATE"
         */
        public static final GrantAblePermissionsEnum OPERATE = new GrantAblePermissionsEnum("OPERATE");

        private static final Map<String, GrantAblePermissionsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GrantAblePermissionsEnum> createStaticFields() {
            Map<String, GrantAblePermissionsEnum> map = new HashMap<>();
            map.put("ALL", ALL);
            map.put("CREATE", CREATE);
            map.put("ALTER", ALTER);
            map.put("DROP", DROP);
            map.put("DESCRIBE", DESCRIBE);
            map.put("EXEC", EXEC);
            map.put("CREATE_DATABASE", CREATE_DATABASE);
            map.put("LIST_DATABASE", LIST_DATABASE);
            map.put("CREATE_TABLE", CREATE_TABLE);
            map.put("LIST_TABLE", LIST_TABLE);
            map.put("CREATE_FUNC", CREATE_FUNC);
            map.put("LIST_FUNC", LIST_FUNC);
            map.put("REGISTER_MODEL", REGISTER_MODEL);
            map.put("LIST_MODEL", LIST_MODEL);
            map.put("INSERT", INSERT);
            map.put("UPDATE", UPDATE);
            map.put("DELETE", DELETE);
            map.put("SELECT", SELECT);
            map.put("READ", READ);
            map.put("WRITE", WRITE);
            map.put("OPERATE", OPERATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GrantAblePermissionsEnum(String value) {
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
        public static GrantAblePermissionsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            GrantAblePermissionsEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new GrantAblePermissionsEnum(value);
            }
            return result;
        }

        public static GrantAblePermissionsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            GrantAblePermissionsEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GrantAblePermissionsEnum) {
                return this.value.equals(((GrantAblePermissionsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grant_able_permissions")

    private List<GrantAblePermissionsEnum> grantAblePermissions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private String conditions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_filter")

    private String dataFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_mask")

    private String dataMask;

    public AccessPolicyInput withPrincipalList(List<Principal> principalList) {
        this.principalList = principalList;
        return this;
    }

    public AccessPolicyInput addPrincipalListItem(Principal principalListItem) {
        if (this.principalList == null) {
            this.principalList = new ArrayList<>();
        }
        this.principalList.add(principalListItem);
        return this;
    }

    public AccessPolicyInput withPrincipalList(Consumer<List<Principal>> principalListSetter) {
        if (this.principalList == null) {
            this.principalList = new ArrayList<>();
        }
        principalListSetter.accept(this.principalList);
        return this;
    }

    /**
     * 主体信息
     * @return principalList
     */
    public List<Principal> getPrincipalList() {
        return principalList;
    }

    public void setPrincipalList(List<Principal> principalList) {
        this.principalList = principalList;
    }

    public AccessPolicyInput withResource(ResourceInfo resource) {
        this.resource = resource;
        return this;
    }

    public AccessPolicyInput withResource(Consumer<ResourceInfo> resourceSetter) {
        if (this.resource == null) {
            this.resource = new ResourceInfo();
            resourceSetter.accept(this.resource);
        }

        return this;
    }

    /**
     * Get resource
     * @return resource
     */
    public ResourceInfo getResource() {
        return resource;
    }

    public void setResource(ResourceInfo resource) {
        this.resource = resource;
    }

    public AccessPolicyInput withEffect(Boolean effect) {
        this.effect = effect;
        return this;
    }

    /**
     * 拒绝/允许
     * @return effect
     */
    public Boolean getEffect() {
        return effect;
    }

    public void setEffect(Boolean effect) {
        this.effect = effect;
    }

    public AccessPolicyInput withPermissions(List<PermissionsEnum> permissions) {
        this.permissions = permissions;
        return this;
    }

    public AccessPolicyInput addPermissionsItem(PermissionsEnum permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    public AccessPolicyInput withPermissions(Consumer<List<PermissionsEnum>> permissionsSetter) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        permissionsSetter.accept(this.permissions);
        return this;
    }

    /**
     * 权限列表
     * @return permissions
     */
    public List<PermissionsEnum> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionsEnum> permissions) {
        this.permissions = permissions;
    }

    public AccessPolicyInput withGrantAblePermissions(List<GrantAblePermissionsEnum> grantAblePermissions) {
        this.grantAblePermissions = grantAblePermissions;
        return this;
    }

    public AccessPolicyInput addGrantAblePermissionsItem(GrantAblePermissionsEnum grantAblePermissionsItem) {
        if (this.grantAblePermissions == null) {
            this.grantAblePermissions = new ArrayList<>();
        }
        this.grantAblePermissions.add(grantAblePermissionsItem);
        return this;
    }

    public AccessPolicyInput withGrantAblePermissions(
        Consumer<List<GrantAblePermissionsEnum>> grantAblePermissionsSetter) {
        if (this.grantAblePermissions == null) {
            this.grantAblePermissions = new ArrayList<>();
        }
        grantAblePermissionsSetter.accept(this.grantAblePermissions);
        return this;
    }

    /**
     * 可传递的权限列表
     * @return grantAblePermissions
     */
    public List<GrantAblePermissionsEnum> getGrantAblePermissions() {
        return grantAblePermissions;
    }

    public void setGrantAblePermissions(List<GrantAblePermissionsEnum> grantAblePermissions) {
        this.grantAblePermissions = grantAblePermissions;
    }

    public AccessPolicyInput withConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * 条件
     * @return conditions
     */
    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public AccessPolicyInput withDataFilter(String dataFilter) {
        this.dataFilter = dataFilter;
        return this;
    }

    /**
     * 行过滤
     * @return dataFilter
     */
    public String getDataFilter() {
        return dataFilter;
    }

    public void setDataFilter(String dataFilter) {
        this.dataFilter = dataFilter;
    }

    public AccessPolicyInput withDataMask(String dataMask) {
        this.dataMask = dataMask;
        return this;
    }

    /**
     * 列掩码
     * @return dataMask
     */
    public String getDataMask() {
        return dataMask;
    }

    public void setDataMask(String dataMask) {
        this.dataMask = dataMask;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessPolicyInput accessPolicyInput = (AccessPolicyInput) o;
        return Objects.equals(this.principalList, accessPolicyInput.principalList)
            && Objects.equals(this.resource, accessPolicyInput.resource)
            && Objects.equals(this.effect, accessPolicyInput.effect)
            && Objects.equals(this.permissions, accessPolicyInput.permissions)
            && Objects.equals(this.grantAblePermissions, accessPolicyInput.grantAblePermissions)
            && Objects.equals(this.conditions, accessPolicyInput.conditions)
            && Objects.equals(this.dataFilter, accessPolicyInput.dataFilter)
            && Objects.equals(this.dataMask, accessPolicyInput.dataMask);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(principalList, resource, effect, permissions, grantAblePermissions, conditions, dataFilter, dataMask);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessPolicyInput {\n");
        sb.append("    principalList: ").append(toIndentedString(principalList)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    grantAblePermissions: ").append(toIndentedString(grantAblePermissions)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    dataFilter: ").append(toIndentedString(dataFilter)).append("\n");
        sb.append("    dataMask: ").append(toIndentedString(dataMask)).append("\n");
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
