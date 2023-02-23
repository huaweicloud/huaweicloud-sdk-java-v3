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
 * LakeFormationPolicy
 */
public class LakeFormationPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * 主体类型，USER-用户,GROUP-组,ROLE-角色,SHARE-共享,OTHER-其它
     */
    public static final class PrincipalTypeEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final PrincipalTypeEnum USER = new PrincipalTypeEnum("USER");

        /**
         * Enum GROUP for value: "GROUP"
         */
        public static final PrincipalTypeEnum GROUP = new PrincipalTypeEnum("GROUP");

        /**
         * Enum ROLE for value: "ROLE"
         */
        public static final PrincipalTypeEnum ROLE = new PrincipalTypeEnum("ROLE");

        /**
         * Enum SHARE for value: "SHARE"
         */
        public static final PrincipalTypeEnum SHARE = new PrincipalTypeEnum("SHARE");

        /**
         * Enum OTHER for value: "OTHER"
         */
        public static final PrincipalTypeEnum OTHER = new PrincipalTypeEnum("OTHER");

        private static final Map<String, PrincipalTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PrincipalTypeEnum> createStaticFields() {
            Map<String, PrincipalTypeEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("GROUP", GROUP);
            map.put("ROLE", ROLE);
            map.put("SHARE", SHARE);
            map.put("OTHER", OTHER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PrincipalTypeEnum(String value) {
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
        public static PrincipalTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PrincipalTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PrincipalTypeEnum(value);
            }
            return result;
        }

        public static PrincipalTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PrincipalTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PrincipalTypeEnum) {
                return this.value.equals(((PrincipalTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_type")

    private PrincipalTypeEnum principalType;

    /**
     * 主体来源，IAM-云,SAML-联邦,LDAP-权限策略,LOCAL-本地,OTHER-其它
     */
    public static final class PrincipalSourceEnum {

        /**
         * Enum IAM for value: "IAM"
         */
        public static final PrincipalSourceEnum IAM = new PrincipalSourceEnum("IAM");

        /**
         * Enum SAML for value: "SAML"
         */
        public static final PrincipalSourceEnum SAML = new PrincipalSourceEnum("SAML");

        /**
         * Enum LDAP for value: "LDAP"
         */
        public static final PrincipalSourceEnum LDAP = new PrincipalSourceEnum("LDAP");

        /**
         * Enum LOCAL for value: "LOCAL"
         */
        public static final PrincipalSourceEnum LOCAL = new PrincipalSourceEnum("LOCAL");

        /**
         * Enum OTHER for value: "OTHER"
         */
        public static final PrincipalSourceEnum OTHER = new PrincipalSourceEnum("OTHER");

        private static final Map<String, PrincipalSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PrincipalSourceEnum> createStaticFields() {
            Map<String, PrincipalSourceEnum> map = new HashMap<>();
            map.put("IAM", IAM);
            map.put("SAML", SAML);
            map.put("LDAP", LDAP);
            map.put("LOCAL", LOCAL);
            map.put("OTHER", OTHER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PrincipalSourceEnum(String value) {
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
        public static PrincipalSourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PrincipalSourceEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PrincipalSourceEnum(value);
            }
            return result;
        }

        public static PrincipalSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PrincipalSourceEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PrincipalSourceEnum) {
                return this.value.equals(((PrincipalSourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_source")

    private PrincipalSourceEnum principalSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_name")

    private String principalName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private ResourceInfo resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

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
    @JsonProperty(value = "created_time")

    private Long createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private String condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obligation")

    private String obligation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_paths")

    private List<String> authorizationPaths = null;

    public LakeFormationPolicy withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public LakeFormationPolicy withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public LakeFormationPolicy withPrincipalType(PrincipalTypeEnum principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * 主体类型，USER-用户,GROUP-组,ROLE-角色,SHARE-共享,OTHER-其它
     * @return principalType
     */
    public PrincipalTypeEnum getPrincipalType() {
        return principalType;
    }

    public void setPrincipalType(PrincipalTypeEnum principalType) {
        this.principalType = principalType;
    }

    public LakeFormationPolicy withPrincipalSource(PrincipalSourceEnum principalSource) {
        this.principalSource = principalSource;
        return this;
    }

    /**
     * 主体来源，IAM-云,SAML-联邦,LDAP-权限策略,LOCAL-本地,OTHER-其它
     * @return principalSource
     */
    public PrincipalSourceEnum getPrincipalSource() {
        return principalSource;
    }

    public void setPrincipalSource(PrincipalSourceEnum principalSource) {
        this.principalSource = principalSource;
    }

    public LakeFormationPolicy withPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }

    /**
     * 主体名
     * @return principalName
     */
    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public LakeFormationPolicy withResource(ResourceInfo resource) {
        this.resource = resource;
        return this;
    }

    public LakeFormationPolicy withResource(Consumer<ResourceInfo> resourceSetter) {
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

    public LakeFormationPolicy withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 要求用点分格式进行分割
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public LakeFormationPolicy withPermissions(List<PermissionsEnum> permissions) {
        this.permissions = permissions;
        return this;
    }

    public LakeFormationPolicy addPermissionsItem(PermissionsEnum permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    public LakeFormationPolicy withPermissions(Consumer<List<PermissionsEnum>> permissionsSetter) {
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

    public LakeFormationPolicy withGrantAblePermissions(List<GrantAblePermissionsEnum> grantAblePermissions) {
        this.grantAblePermissions = grantAblePermissions;
        return this;
    }

    public LakeFormationPolicy addGrantAblePermissionsItem(GrantAblePermissionsEnum grantAblePermissionsItem) {
        if (this.grantAblePermissions == null) {
            this.grantAblePermissions = new ArrayList<>();
        }
        this.grantAblePermissions.add(grantAblePermissionsItem);
        return this;
    }

    public LakeFormationPolicy withGrantAblePermissions(
        Consumer<List<GrantAblePermissionsEnum>> grantAblePermissionsSetter) {
        if (this.grantAblePermissions == null) {
            this.grantAblePermissions = new ArrayList<>();
        }
        grantAblePermissionsSetter.accept(this.grantAblePermissions);
        return this;
    }

    /**
     * 可以传递的权限列表
     * @return grantAblePermissions
     */
    public List<GrantAblePermissionsEnum> getGrantAblePermissions() {
        return grantAblePermissions;
    }

    public void setGrantAblePermissions(List<GrantAblePermissionsEnum> grantAblePermissions) {
        this.grantAblePermissions = grantAblePermissions;
    }

    public LakeFormationPolicy withCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public LakeFormationPolicy withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * 条件信息
     * @return condition
     */
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public LakeFormationPolicy withObligation(String obligation) {
        this.obligation = obligation;
        return this;
    }

    /**
     * obligation，义务，当前包含data filter和data mask
     * @return obligation
     */
    public String getObligation() {
        return obligation;
    }

    public void setObligation(String obligation) {
        this.obligation = obligation;
    }

    public LakeFormationPolicy withAuthorizationPaths(List<String> authorizationPaths) {
        this.authorizationPaths = authorizationPaths;
        return this;
    }

    public LakeFormationPolicy addAuthorizationPathsItem(String authorizationPathsItem) {
        if (this.authorizationPaths == null) {
            this.authorizationPaths = new ArrayList<>();
        }
        this.authorizationPaths.add(authorizationPathsItem);
        return this;
    }

    public LakeFormationPolicy withAuthorizationPaths(Consumer<List<String>> authorizationPathsSetter) {
        if (this.authorizationPaths == null) {
            this.authorizationPaths = new ArrayList<>();
        }
        authorizationPathsSetter.accept(this.authorizationPaths);
        return this;
    }

    /**
     * 授权路径列表
     * @return authorizationPaths
     */
    public List<String> getAuthorizationPaths() {
        return authorizationPaths;
    }

    public void setAuthorizationPaths(List<String> authorizationPaths) {
        this.authorizationPaths = authorizationPaths;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LakeFormationPolicy lakeFormationPolicy = (LakeFormationPolicy) o;
        return Objects.equals(this.projectId, lakeFormationPolicy.projectId)
            && Objects.equals(this.instanceId, lakeFormationPolicy.instanceId)
            && Objects.equals(this.principalType, lakeFormationPolicy.principalType)
            && Objects.equals(this.principalSource, lakeFormationPolicy.principalSource)
            && Objects.equals(this.principalName, lakeFormationPolicy.principalName)
            && Objects.equals(this.resource, lakeFormationPolicy.resource)
            && Objects.equals(this.resourceName, lakeFormationPolicy.resourceName)
            && Objects.equals(this.permissions, lakeFormationPolicy.permissions)
            && Objects.equals(this.grantAblePermissions, lakeFormationPolicy.grantAblePermissions)
            && Objects.equals(this.createdTime, lakeFormationPolicy.createdTime)
            && Objects.equals(this.condition, lakeFormationPolicy.condition)
            && Objects.equals(this.obligation, lakeFormationPolicy.obligation)
            && Objects.equals(this.authorizationPaths, lakeFormationPolicy.authorizationPaths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            instanceId,
            principalType,
            principalSource,
            principalName,
            resource,
            resourceName,
            permissions,
            grantAblePermissions,
            createdTime,
            condition,
            obligation,
            authorizationPaths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LakeFormationPolicy {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    principalType: ").append(toIndentedString(principalType)).append("\n");
        sb.append("    principalSource: ").append(toIndentedString(principalSource)).append("\n");
        sb.append("    principalName: ").append(toIndentedString(principalName)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    grantAblePermissions: ").append(toIndentedString(grantAblePermissions)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    obligation: ").append(toIndentedString(obligation)).append("\n");
        sb.append("    authorizationPaths: ").append(toIndentedString(authorizationPaths)).append("\n");
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
