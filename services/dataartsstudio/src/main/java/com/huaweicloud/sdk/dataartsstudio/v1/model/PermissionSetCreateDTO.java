package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * PermissionSetCreateDTO
 */
public class PermissionSetCreateDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 权限集类型, COMMON, MRS_MANAGED
     */
    public static final class TypeEnum {

        /**
         * Enum COMMON for value: "COMMON"
         */
        public static final TypeEnum COMMON = new TypeEnum("COMMON");

        /**
         * Enum MRS_MANAGED for value: "MRS_MANAGED"
         */
        public static final TypeEnum MRS_MANAGED = new TypeEnum("MRS_MANAGED");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("COMMON", COMMON);
            map.put("MRS_MANAGED", MRS_MANAGED);
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
    @JsonProperty(value = "managed_cluster_id")

    private String managedClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_cluster_name")

    private String managedClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_role_name")

    private String managedRoleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager_id")

    private String managerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager_name")

    private String managerName;

    /**
     * 管理员类型, 用户/用户组, USER, USER_GROUP
     */
    public static final class ManagerTypeEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final ManagerTypeEnum USER = new ManagerTypeEnum("USER");

        /**
         * Enum USER_GROUP for value: "USER_GROUP"
         */
        public static final ManagerTypeEnum USER_GROUP = new ManagerTypeEnum("USER_GROUP");

        private static final Map<String, ManagerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ManagerTypeEnum> createStaticFields() {
            Map<String, ManagerTypeEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("USER_GROUP", USER_GROUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ManagerTypeEnum(String value) {
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
        public static ManagerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ManagerTypeEnum(value));
        }

        public static ManagerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ManagerTypeEnum) {
                return this.value.equals(((ManagerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager_type")

    private ManagerTypeEnum managerType;

    public PermissionSetCreateDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PermissionSetCreateDTO withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父权限集id
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public PermissionSetCreateDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PermissionSetCreateDTO withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 权限集类型, COMMON, MRS_MANAGED
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public PermissionSetCreateDTO withManagedClusterId(String managedClusterId) {
        this.managedClusterId = managedClusterId;
        return this;
    }

    /**
     * 纳管角色所在集群id（仅纳管类权限集需要）
     * @return managedClusterId
     */
    public String getManagedClusterId() {
        return managedClusterId;
    }

    public void setManagedClusterId(String managedClusterId) {
        this.managedClusterId = managedClusterId;
    }

    public PermissionSetCreateDTO withManagedClusterName(String managedClusterName) {
        this.managedClusterName = managedClusterName;
        return this;
    }

    /**
     * 纳管角色所在集群名称（仅纳管类权限集需要）
     * @return managedClusterName
     */
    public String getManagedClusterName() {
        return managedClusterName;
    }

    public void setManagedClusterName(String managedClusterName) {
        this.managedClusterName = managedClusterName;
    }

    public PermissionSetCreateDTO withManagedRoleName(String managedRoleName) {
        this.managedRoleName = managedRoleName;
        return this;
    }

    /**
     * 纳管角色名称（仅纳管类权限集需要）
     * @return managedRoleName
     */
    public String getManagedRoleName() {
        return managedRoleName;
    }

    public void setManagedRoleName(String managedRoleName) {
        this.managedRoleName = managedRoleName;
    }

    public PermissionSetCreateDTO withManagerId(String managerId) {
        this.managerId = managerId;
        return this;
    }

    /**
     * 管理员id
     * @return managerId
     */
    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public PermissionSetCreateDTO withManagerName(String managerName) {
        this.managerName = managerName;
        return this;
    }

    /**
     * 管理员名称
     * @return managerName
     */
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public PermissionSetCreateDTO withManagerType(ManagerTypeEnum managerType) {
        this.managerType = managerType;
        return this;
    }

    /**
     * 管理员类型, 用户/用户组, USER, USER_GROUP
     * @return managerType
     */
    public ManagerTypeEnum getManagerType() {
        return managerType;
    }

    public void setManagerType(ManagerTypeEnum managerType) {
        this.managerType = managerType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PermissionSetCreateDTO that = (PermissionSetCreateDTO) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.type, that.type)
            && Objects.equals(this.managedClusterId, that.managedClusterId)
            && Objects.equals(this.managedClusterName, that.managedClusterName)
            && Objects.equals(this.managedRoleName, that.managedRoleName)
            && Objects.equals(this.managerId, that.managerId) && Objects.equals(this.managerName, that.managerName)
            && Objects.equals(this.managerType, that.managerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            parentId,
            description,
            type,
            managedClusterId,
            managedClusterName,
            managedRoleName,
            managerId,
            managerName,
            managerType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionSetCreateDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    managedClusterId: ").append(toIndentedString(managedClusterId)).append("\n");
        sb.append("    managedClusterName: ").append(toIndentedString(managedClusterName)).append("\n");
        sb.append("    managedRoleName: ").append(toIndentedString(managedRoleName)).append("\n");
        sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
        sb.append("    managerName: ").append(toIndentedString(managerName)).append("\n");
        sb.append("    managerType: ").append(toIndentedString(managerType)).append("\n");
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
