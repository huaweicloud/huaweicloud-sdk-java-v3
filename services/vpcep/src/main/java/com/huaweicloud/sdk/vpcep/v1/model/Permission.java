package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * permission列表。
 */
public class Permission {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    @JacksonXmlProperty(localName = "permission")

    private String permission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    @JacksonXmlProperty(localName = "created_at")

    private String createdAt;

    public Permission withId(String id) {
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

    public Permission withPermission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * permission列表。 权限格式为“iam:domain:: 6e9dfd51d1124e8d8498dce894923a0d”或 “*”，“*”表示所有用户的终端节点可连接。 其中6e9dfd51d1124e8d8498dce894923a0d为 可连接的用户domian_id。
     * @return permission
     */
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Permission withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 白名单的添加时间。 采用UTC时间格式，格式为：YYYY-MMDDTHH: MM:SSZ
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Permission permission = (Permission) o;
        return Objects.equals(this.id, permission.id) && Objects.equals(this.permission, permission.permission)
            && Objects.equals(this.createdAt, permission.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, permission, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Permission {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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
