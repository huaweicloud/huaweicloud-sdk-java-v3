package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowGroupPermissionInheritEnabledResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_inherit_enabled")

    private Boolean permissionInheritEnabled;

    public ShowGroupPermissionInheritEnabledResponse withPermissionInheritEnabled(Boolean permissionInheritEnabled) {
        this.permissionInheritEnabled = permissionInheritEnabled;
        return this;
    }

    /**
     * **参数解释：** 使用项目权限配置开关是否开启。
     * @return permissionInheritEnabled
     */
    public Boolean getPermissionInheritEnabled() {
        return permissionInheritEnabled;
    }

    public void setPermissionInheritEnabled(Boolean permissionInheritEnabled) {
        this.permissionInheritEnabled = permissionInheritEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowGroupPermissionInheritEnabledResponse that = (ShowGroupPermissionInheritEnabledResponse) obj;
        return Objects.equals(this.permissionInheritEnabled, that.permissionInheritEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionInheritEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGroupPermissionInheritEnabledResponse {\n");
        sb.append("    permissionInheritEnabled: ").append(toIndentedString(permissionInheritEnabled)).append("\n");
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
