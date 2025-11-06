package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdatePermissionDetail
 */
public class UpdatePermissionDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_id")

    private Integer permissionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    public UpdatePermissionDetail withPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
        return this;
    }

    /**
     * **参数解释：** 权限点id **取值范围：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return permissionId
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public UpdatePermissionDetail withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释：** 权限点状态 **取值范围：** - true, 开启。 - false, 关闭。  
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePermissionDetail that = (UpdatePermissionDetail) obj;
        return Objects.equals(this.permissionId, that.permissionId) && Objects.equals(this.enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionId, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePermissionDetail {\n");
        sb.append("    permissionId: ").append(toIndentedString(permissionId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
