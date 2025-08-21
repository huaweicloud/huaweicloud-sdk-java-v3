package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UserRefPermissionBasicDto
 */
public class UserRefPermissionBasicDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_permission")

    private Boolean hasPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_protect")

    private Boolean isProtect;

    public UserRefPermissionBasicDto withHasPermission(Boolean hasPermission) {
        this.hasPermission = hasPermission;
        return this;
    }

    /**
     * **参数解释：** 是否有权限。 **取值范围：** true：有权限，false：没权限
     * @return hasPermission
     */
    public Boolean getHasPermission() {
        return hasPermission;
    }

    public void setHasPermission(Boolean hasPermission) {
        this.hasPermission = hasPermission;
    }

    public UserRefPermissionBasicDto withIsProtect(Boolean isProtect) {
        this.isProtect = isProtect;
        return this;
    }

    /**
     * **参数解释：** 是否保护分支。 **取值范围：** true：是保护分支，false：非保护分支
     * @return isProtect
     */
    public Boolean getIsProtect() {
        return isProtect;
    }

    public void setIsProtect(Boolean isProtect) {
        this.isProtect = isProtect;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserRefPermissionBasicDto that = (UserRefPermissionBasicDto) obj;
        return Objects.equals(this.hasPermission, that.hasPermission) && Objects.equals(this.isProtect, that.isProtect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasPermission, isProtect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserRefPermissionBasicDto {\n");
        sb.append("    hasPermission: ").append(toIndentedString(hasPermission)).append("\n");
        sb.append("    isProtect: ").append(toIndentedString(isProtect)).append("\n");
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
