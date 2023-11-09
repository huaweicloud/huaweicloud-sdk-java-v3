package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SimpleDesktopInfo
 */
public class SimpleDesktopInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computer_name")

    private String computerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_user_infos")

    private List<AttachInstancesUserInfo> attachUserInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_group")

    private String userGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sid")

    private String sid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ou_name")

    private String ouName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_maintenance_mode")

    private Boolean inMaintenanceMode;

    public SimpleDesktopInfo withDesktopId(String desktopId) {
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

    public SimpleDesktopInfo withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * 桌面名。
     * @return computerName
     */
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public SimpleDesktopInfo withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 创建时间。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public SimpleDesktopInfo withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * 桌面ip地址。
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public SimpleDesktopInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public SimpleDesktopInfo withAttachUserInfos(List<AttachInstancesUserInfo> attachUserInfos) {
        this.attachUserInfos = attachUserInfos;
        return this;
    }

    public SimpleDesktopInfo addAttachUserInfosItem(AttachInstancesUserInfo attachUserInfosItem) {
        if (this.attachUserInfos == null) {
            this.attachUserInfos = new ArrayList<>();
        }
        this.attachUserInfos.add(attachUserInfosItem);
        return this;
    }

    public SimpleDesktopInfo withAttachUserInfos(Consumer<List<AttachInstancesUserInfo>> attachUserInfosSetter) {
        if (this.attachUserInfos == null) {
            this.attachUserInfos = new ArrayList<>();
        }
        attachUserInfosSetter.accept(this.attachUserInfos);
        return this;
    }

    /**
     * 桌面已分配的用户信息列表。
     * @return attachUserInfos
     */
    public List<AttachInstancesUserInfo> getAttachUserInfos() {
        return attachUserInfos;
    }

    public void setAttachUserInfos(List<AttachInstancesUserInfo> attachUserInfos) {
        this.attachUserInfos = attachUserInfos;
    }

    public SimpleDesktopInfo withUserGroup(String userGroup) {
        this.userGroup = userGroup;
        return this;
    }

    /**
     * 权限组。
     * @return userGroup
     */
    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    public SimpleDesktopInfo withSid(String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * 桌面的SID信息。
     * @return sid
     */
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public SimpleDesktopInfo withOuName(String ouName) {
        this.ouName = ouName;
        return this;
    }

    /**
     * ou名称。
     * @return ouName
     */
    public String getOuName() {
        return ouName;
    }

    public void setOuName(String ouName) {
        this.ouName = ouName;
    }

    public SimpleDesktopInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public SimpleDesktopInfo withInMaintenanceMode(Boolean inMaintenanceMode) {
        this.inMaintenanceMode = inMaintenanceMode;
        return this;
    }

    /**
     * 是否处于管理员维护模式
     * @return inMaintenanceMode
     */
    public Boolean getInMaintenanceMode() {
        return inMaintenanceMode;
    }

    public void setInMaintenanceMode(Boolean inMaintenanceMode) {
        this.inMaintenanceMode = inMaintenanceMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimpleDesktopInfo that = (SimpleDesktopInfo) obj;
        return Objects.equals(this.desktopId, that.desktopId) && Objects.equals(this.computerName, that.computerName)
            && Objects.equals(this.created, that.created) && Objects.equals(this.ipAddress, that.ipAddress)
            && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.attachUserInfos, that.attachUserInfos)
            && Objects.equals(this.userGroup, that.userGroup) && Objects.equals(this.sid, that.sid)
            && Objects.equals(this.ouName, that.ouName)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.inMaintenanceMode, that.inMaintenanceMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopId,
            computerName,
            created,
            ipAddress,
            userName,
            attachUserInfos,
            userGroup,
            sid,
            ouName,
            enterpriseProjectId,
            inMaintenanceMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleDesktopInfo {\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    attachUserInfos: ").append(toIndentedString(attachUserInfos)).append("\n");
        sb.append("    userGroup: ").append(toIndentedString(userGroup)).append("\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    ouName: ").append(toIndentedString(ouName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    inMaintenanceMode: ").append(toIndentedString(inMaintenanceMode)).append("\n");
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
