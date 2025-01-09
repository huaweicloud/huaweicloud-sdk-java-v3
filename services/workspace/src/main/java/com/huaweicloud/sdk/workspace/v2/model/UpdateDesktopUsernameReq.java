package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更换桌面关联用户名请求。
 */
public class UpdateDesktopUsernameReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_username")

    private String oldUsername;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_username")

    private String newUsername;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_reboot")

    private Boolean isReboot;

    public UpdateDesktopUsernameReq withOldUsername(String oldUsername) {
        this.oldUsername = oldUsername;
        return this;
    }

    /**
     * 桌面关联原用户名，只传用户名，不带域信息。
     * @return oldUsername
     */
    public String getOldUsername() {
        return oldUsername;
    }

    public void setOldUsername(String oldUsername) {
        this.oldUsername = oldUsername;
    }

    public UpdateDesktopUsernameReq withNewUsername(String newUsername) {
        this.newUsername = newUsername;
        return this;
    }

    /**
     * 桌面关联新用户名，只传用户名，不带域信息。
     * @return newUsername
     */
    public String getNewUsername() {
        return newUsername;
    }

    public void setNewUsername(String newUsername) {
        this.newUsername = newUsername;
    }

    public UpdateDesktopUsernameReq withIsReboot(Boolean isReboot) {
        this.isReboot = isReboot;
        return this;
    }

    /**
     * 桌面关联新用户名后是否重启虚拟机，默认不重启。
     * @return isReboot
     */
    public Boolean getIsReboot() {
        return isReboot;
    }

    public void setIsReboot(Boolean isReboot) {
        this.isReboot = isReboot;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDesktopUsernameReq that = (UpdateDesktopUsernameReq) obj;
        return Objects.equals(this.oldUsername, that.oldUsername) && Objects.equals(this.newUsername, that.newUsername)
            && Objects.equals(this.isReboot, that.isReboot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldUsername, newUsername, isReboot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDesktopUsernameReq {\n");
        sb.append("    oldUsername: ").append(toIndentedString(oldUsername)).append("\n");
        sb.append("    newUsername: ").append(toIndentedString(newUsername)).append("\n");
        sb.append("    isReboot: ").append(toIndentedString(isReboot)).append("\n");
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
