package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改桌面用户权限请求桌面信息。
 */
public class ChangeUserPrivilegeGroupDesktopInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_user_infos")

    private List<ChangeUserPrivilegeGroupUserInfo> attachUserInfos = null;

    public ChangeUserPrivilegeGroupDesktopInfo withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 待修改的桌面ID。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public ChangeUserPrivilegeGroupDesktopInfo withAttachUserInfos(
        List<ChangeUserPrivilegeGroupUserInfo> attachUserInfos) {
        this.attachUserInfos = attachUserInfos;
        return this;
    }

    public ChangeUserPrivilegeGroupDesktopInfo addAttachUserInfosItem(
        ChangeUserPrivilegeGroupUserInfo attachUserInfosItem) {
        if (this.attachUserInfos == null) {
            this.attachUserInfos = new ArrayList<>();
        }
        this.attachUserInfos.add(attachUserInfosItem);
        return this;
    }

    public ChangeUserPrivilegeGroupDesktopInfo withAttachUserInfos(
        Consumer<List<ChangeUserPrivilegeGroupUserInfo>> attachUserInfosSetter) {
        if (this.attachUserInfos == null) {
            this.attachUserInfos = new ArrayList<>();
        }
        attachUserInfosSetter.accept(this.attachUserInfos);
        return this;
    }

    /**
     * 待修改用户权限组的用户信息。未传该参数的桌面的用于将应用上层结构的参数user_privilege_group作为其用户的用户权限组。
     * @return attachUserInfos
     */
    public List<ChangeUserPrivilegeGroupUserInfo> getAttachUserInfos() {
        return attachUserInfos;
    }

    public void setAttachUserInfos(List<ChangeUserPrivilegeGroupUserInfo> attachUserInfos) {
        this.attachUserInfos = attachUserInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeUserPrivilegeGroupDesktopInfo that = (ChangeUserPrivilegeGroupDesktopInfo) obj;
        return Objects.equals(this.desktopId, that.desktopId)
            && Objects.equals(this.attachUserInfos, that.attachUserInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopId, attachUserInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeUserPrivilegeGroupDesktopInfo {\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    attachUserInfos: ").append(toIndentedString(attachUserInfos)).append("\n");
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
