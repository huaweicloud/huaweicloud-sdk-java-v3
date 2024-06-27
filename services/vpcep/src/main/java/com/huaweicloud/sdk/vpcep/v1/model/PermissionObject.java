package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * permission列表。
 */
public class PermissionObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private String permission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_type")

    private String permissionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    public PermissionObject withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * permission的ID，唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PermissionObject withPermission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * permission列表。 权限格式为： - iam:domain::domain_id。其中： “iam:domain::”为固定格式，“domain_id”为可连接用户的账号ID。 domain_id类型支持输入包括“a~z”、“A~Z”、“0~9”或者“*”，最大长度可以传64。  - organizations:orgPath::org_path。其中： “organizations:orgPath::”为固定格式，org_path为可连接用户的组织路径。 org_path类型支持“a~z”、“A~Z”、“0~9”、“/-*?”或者“*”，最大长度可以传1024。  “*”表示所有终端节点可连接。 示例： - iam:domain::6e9dfd51d1124e8d8498dce894923a0dd - organizations:orgPath::o-3j59d1231uprgk9yuvlidra7zbzfi578/r-rldbu1vmxdw5ahdkknxnvd5rgag77m2z/ou-7tuddd8nh99rebxltawsm6qct5z7rklv/_* - *
     * @return permission
     */
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public PermissionObject withPermissionType(String permissionType) {
        this.permissionType = permissionType;
        return this;
    }

    /**
     * 终端节点服务白名单类型。  - domainId：基于账户ID配置终端节点服务白名单。  - orgPath：基于账户所在组织路径配置终端节点服务白名单。
     * @return permissionType
     */
    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    public PermissionObject withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 白名单的添加时间。 采用UTC时间格式，格式为：YYYY-MMDDTHH:MM:SSZ
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
        PermissionObject that = (PermissionObject) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.permission, that.permission)
            && Objects.equals(this.permissionType, that.permissionType)
            && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, permission, permissionType, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionObject {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    permissionType: ").append(toIndentedString(permissionType)).append("\n");
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
