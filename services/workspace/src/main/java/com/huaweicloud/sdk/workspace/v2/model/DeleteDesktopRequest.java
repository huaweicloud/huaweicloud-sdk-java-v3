package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteDesktopRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_users")

    private Boolean deleteUsers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email_notification")

    private Boolean emailNotification;

    public DeleteDesktopRequest withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 桌面ID。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public DeleteDesktopRequest withDeleteUsers(Boolean deleteUsers) {
        this.deleteUsers = deleteUsers;
        return this;
    }

    /**
     * 删除桌面后，如果当前用户没有其它桌面，可以删除桌面用户。true：删除用户，false：不删除用户，默认为false。
     * @return deleteUsers
     */
    public Boolean getDeleteUsers() {
        return deleteUsers;
    }

    public void setDeleteUsers(Boolean deleteUsers) {
        this.deleteUsers = deleteUsers;
    }

    public DeleteDesktopRequest withEmailNotification(Boolean emailNotification) {
        this.emailNotification = emailNotification;
        return this;
    }

    /**
     * 删除桌面后，是否给桌面用户发送系统通知邮件。true：发送，false：不发送。默认为true。
     * @return emailNotification
     */
    public Boolean getEmailNotification() {
        return emailNotification;
    }

    public void setEmailNotification(Boolean emailNotification) {
        this.emailNotification = emailNotification;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteDesktopRequest deleteDesktopRequest = (DeleteDesktopRequest) o;
        return Objects.equals(this.desktopId, deleteDesktopRequest.desktopId)
            && Objects.equals(this.deleteUsers, deleteDesktopRequest.deleteUsers)
            && Objects.equals(this.emailNotification, deleteDesktopRequest.emailNotification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopId, deleteUsers, emailNotification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDesktopRequest {\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    deleteUsers: ").append(toIndentedString(deleteUsers)).append("\n");
        sb.append("    emailNotification: ").append(toIndentedString(emailNotification)).append("\n");
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
