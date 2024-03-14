package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowPermissionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_id")

    private String permissionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_version")

    private Integer permissionVersion;

    public ShowPermissionRequest withPermissionId(String permissionId) {
        this.permissionId = permissionId;
        return this;
    }

    /**
     * 共享资源权限的ID。
     * @return permissionId
     */
    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public ShowPermissionRequest withPermissionVersion(Integer permissionVersion) {
        this.permissionVersion = permissionVersion;
        return this;
    }

    /**
     * 资源权限版本。
     * minimum: 0
     * maximum: 1000000
     * @return permissionVersion
     */
    public Integer getPermissionVersion() {
        return permissionVersion;
    }

    public void setPermissionVersion(Integer permissionVersion) {
        this.permissionVersion = permissionVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPermissionRequest that = (ShowPermissionRequest) obj;
        return Objects.equals(this.permissionId, that.permissionId)
            && Objects.equals(this.permissionVersion, that.permissionVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionId, permissionVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPermissionRequest {\n");
        sb.append("    permissionId: ").append(toIndentedString(permissionId)).append("\n");
        sb.append("    permissionVersion: ").append(toIndentedString(permissionVersion)).append("\n");
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
