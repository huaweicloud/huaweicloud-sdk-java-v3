package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分配用户请求桌面信息。
 */
public class DetachInstancesDesktopInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_detach_all_users")

    private Boolean isDetachAllUsers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detach_user_infos")

    private List<AttachInstancesUserInfo> detachUserInfos = null;

    public DetachInstancesDesktopInfo withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 分配的桌面ID。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public DetachInstancesDesktopInfo withIsDetachAllUsers(Boolean isDetachAllUsers) {
        this.isDetachAllUsers = isDetachAllUsers;
        return this;
    }

    /**
     * 表示解关联所有用户：true，如果指定那么detach_user_infos会失效；指定解关联用户：false，通过detach_user_infos指定解关联的用户。
     * @return isDetachAllUsers
     */
    public Boolean getIsDetachAllUsers() {
        return isDetachAllUsers;
    }

    public void setIsDetachAllUsers(Boolean isDetachAllUsers) {
        this.isDetachAllUsers = isDetachAllUsers;
    }

    public DetachInstancesDesktopInfo withDetachUserInfos(List<AttachInstancesUserInfo> detachUserInfos) {
        this.detachUserInfos = detachUserInfos;
        return this;
    }

    public DetachInstancesDesktopInfo addDetachUserInfosItem(AttachInstancesUserInfo detachUserInfosItem) {
        if (this.detachUserInfos == null) {
            this.detachUserInfos = new ArrayList<>();
        }
        this.detachUserInfos.add(detachUserInfosItem);
        return this;
    }

    public DetachInstancesDesktopInfo withDetachUserInfos(
        Consumer<List<AttachInstancesUserInfo>> detachUserInfosSetter) {
        if (this.detachUserInfos == null) {
            this.detachUserInfos = new ArrayList<>();
        }
        detachUserInfosSetter.accept(this.detachUserInfos);
        return this;
    }

    /**
     * 解分配的用户信息列表。
     * @return detachUserInfos
     */
    public List<AttachInstancesUserInfo> getDetachUserInfos() {
        return detachUserInfos;
    }

    public void setDetachUserInfos(List<AttachInstancesUserInfo> detachUserInfos) {
        this.detachUserInfos = detachUserInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetachInstancesDesktopInfo that = (DetachInstancesDesktopInfo) obj;
        return Objects.equals(this.desktopId, that.desktopId)
            && Objects.equals(this.isDetachAllUsers, that.isDetachAllUsers)
            && Objects.equals(this.detachUserInfos, that.detachUserInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopId, isDetachAllUsers, detachUserInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetachInstancesDesktopInfo {\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    isDetachAllUsers: ").append(toIndentedString(isDetachAllUsers)).append("\n");
        sb.append("    detachUserInfos: ").append(toIndentedString(detachUserInfos)).append("\n");
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
