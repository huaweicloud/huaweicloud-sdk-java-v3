package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量删除桌面请求。
 */
public class DeleteDesktopsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_ids")

    private List<String> desktopIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_users")

    private Boolean deleteUsers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email_notification")

    private Boolean emailNotification;

    public DeleteDesktopsReq withDesktopIds(List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }

    public DeleteDesktopsReq addDesktopIdsItem(String desktopIdsItem) {
        if (this.desktopIds == null) {
            this.desktopIds = new ArrayList<>();
        }
        this.desktopIds.add(desktopIdsItem);
        return this;
    }

    public DeleteDesktopsReq withDesktopIds(Consumer<List<String>> desktopIdsSetter) {
        if (this.desktopIds == null) {
            this.desktopIds = new ArrayList<>();
        }
        desktopIdsSetter.accept(this.desktopIds);
        return this;
    }

    /**
     * 待删除的桌面ID列表。
     * @return desktopIds
     */
    public List<String> getDesktopIds() {
        return desktopIds;
    }

    public void setDesktopIds(List<String> desktopIds) {
        this.desktopIds = desktopIds;
    }

    public DeleteDesktopsReq withDeleteUsers(Boolean deleteUsers) {
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

    public DeleteDesktopsReq withEmailNotification(Boolean emailNotification) {
        this.emailNotification = emailNotification;
        return this;
    }

    /**
     * 是否邮件通知，true：邮件通知，false：不通知，默认值true。
     * @return emailNotification
     */
    public Boolean getEmailNotification() {
        return emailNotification;
    }

    public void setEmailNotification(Boolean emailNotification) {
        this.emailNotification = emailNotification;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDesktopsReq that = (DeleteDesktopsReq) obj;
        return Objects.equals(this.desktopIds, that.desktopIds) && Objects.equals(this.deleteUsers, that.deleteUsers)
            && Objects.equals(this.emailNotification, that.emailNotification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopIds, deleteUsers, emailNotification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDesktopsReq {\n");
        sb.append("    desktopIds: ").append(toIndentedString(desktopIds)).append("\n");
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
