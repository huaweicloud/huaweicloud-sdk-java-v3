package com.huaweicloud.sdk.vpcep.v1.model;

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
 * 终端节点服务白名单响应体。
 */
public class EpsPermission {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private String permission;

    /**
     * 终端节点服务白名单类型。  - domainId：基于账户ID配置终端节点服务白名单。  - orgPath：基于账户所在组织路径配置终端节点服务白名单。
     */
    public static final class PermissionTypeEnum {

        /**
         * Enum DOMAINID for value: "domainId"
         */
        public static final PermissionTypeEnum DOMAINID = new PermissionTypeEnum("domainId");

        /**
         * Enum ORGPATH for value: "orgPath"
         */
        public static final PermissionTypeEnum ORGPATH = new PermissionTypeEnum("orgPath");

        private static final Map<String, PermissionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionTypeEnum> createStaticFields() {
            Map<String, PermissionTypeEnum> map = new HashMap<>();
            map.put("domainId", DOMAINID);
            map.put("orgPath", ORGPATH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PermissionTypeEnum(String value) {
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
        public static PermissionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PermissionTypeEnum(value));
        }

        public static PermissionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermissionTypeEnum) {
                return this.value.equals(((PermissionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_type")

    private PermissionTypeEnum permissionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    public EpsPermission withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 白名单表主键ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EpsPermission withPermission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * 权限格式为：iam:domain::domain_id或者organizations:orgPath::org_path其中，  - “iam:domain::”和“organizations:orgPath::”为固定格式。  - “domain_id”为可连接用户的账号ID，org_path可连接用户的组织路径 domain_id类型支持输入包括“a~z”、“A~Z”、“0~9”或者“*”，org_path类型支持“a~z”、“A~Z”、“0~9”、“/-*?”或者“*”。 “*”表示所有终端节点可连接。 例如：iam:domain::6e9dfd51d1124e8d8498dce894923a0dd或者organizations:orgPath::o-3j59d1231uprgk9yuvlidra7zbzfi578/r-rldbu1vmxdw5ahdkknxnvd5rgag77m2z/ou-7tuddd8nh99rebxltawsm6qct5z7rklv/_*
     * @return permission
     */
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public EpsPermission withPermissionType(PermissionTypeEnum permissionType) {
        this.permissionType = permissionType;
        return this;
    }

    /**
     * 终端节点服务白名单类型。  - domainId：基于账户ID配置终端节点服务白名单。  - orgPath：基于账户所在组织路径配置终端节点服务白名单。
     * @return permissionType
     */
    public PermissionTypeEnum getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(PermissionTypeEnum permissionType) {
        this.permissionType = permissionType;
    }

    public EpsPermission withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 终端节点服务白名单描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EpsPermission withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 白名单创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EpsPermission that = (EpsPermission) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.permission, that.permission)
            && Objects.equals(this.permissionType, that.permissionType)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, permission, permissionType, description, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EpsPermission {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    permissionType: ").append(toIndentedString(permissionType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
