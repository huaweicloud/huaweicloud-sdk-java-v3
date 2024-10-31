package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量修改用户权限组请求。
 */
public class ChangeUserPrivilegeGroupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktops")

    private List<ChangeUserPrivilegeGroupDesktopInfo> desktops = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_privilege_group")

    private String userPrivilegeGroup;

    public ChangeUserPrivilegeGroupReq withDesktops(List<ChangeUserPrivilegeGroupDesktopInfo> desktops) {
        this.desktops = desktops;
        return this;
    }

    public ChangeUserPrivilegeGroupReq addDesktopsItem(ChangeUserPrivilegeGroupDesktopInfo desktopsItem) {
        if (this.desktops == null) {
            this.desktops = new ArrayList<>();
        }
        this.desktops.add(desktopsItem);
        return this;
    }

    public ChangeUserPrivilegeGroupReq withDesktops(
        Consumer<List<ChangeUserPrivilegeGroupDesktopInfo>> desktopsSetter) {
        if (this.desktops == null) {
            this.desktops = new ArrayList<>();
        }
        desktopsSetter.accept(this.desktops);
        return this;
    }

    /**
     * 桌面信息列表。
     * @return desktops
     */
    public List<ChangeUserPrivilegeGroupDesktopInfo> getDesktops() {
        return desktops;
    }

    public void setDesktops(List<ChangeUserPrivilegeGroupDesktopInfo> desktops) {
        this.desktops = desktops;
    }

    public ChangeUserPrivilegeGroupReq withUserPrivilegeGroup(String userPrivilegeGroup) {
        this.userPrivilegeGroup = userPrivilegeGroup;
        return this;
    }

    /**
     * 桌面用户所属的用户权限组。desktops参数中，各个桌面所属的未传的桌面用户将应用该权限组。 - sudo：Linux管理员组。 - default：Linux默认用户组。 - administrators：Windows管理员组。管理员拥有对该桌面的完全访问权，可以做任何需要的更改（禁用操作除外）。 - users：Windows标准用户组。标准用户可以使用大多数软件，并可以更改不影响其他用户的系统设置。
     * @return userPrivilegeGroup
     */
    public String getUserPrivilegeGroup() {
        return userPrivilegeGroup;
    }

    public void setUserPrivilegeGroup(String userPrivilegeGroup) {
        this.userPrivilegeGroup = userPrivilegeGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeUserPrivilegeGroupReq that = (ChangeUserPrivilegeGroupReq) obj;
        return Objects.equals(this.desktops, that.desktops)
            && Objects.equals(this.userPrivilegeGroup, that.userPrivilegeGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktops, userPrivilegeGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeUserPrivilegeGroupReq {\n");
        sb.append("    desktops: ").append(toIndentedString(desktops)).append("\n");
        sb.append("    userPrivilegeGroup: ").append(toIndentedString(userPrivilegeGroup)).append("\n");
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
