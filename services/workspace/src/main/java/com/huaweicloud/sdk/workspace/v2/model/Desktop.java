package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Desktop
 */
public class Desktop {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_email")

    private String userEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_phone")

    private String userPhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_group")

    private String userGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computer_name")

    private String computerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_host_name")

    private String osHostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_name_prefix")

    private String desktopNamePrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "copy_volume_desktop_id")

    private String copyVolumeDesktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "copy_volume_ids")

    private List<String> copyVolumeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "if_delete_old_desktop")

    private Boolean ifDeleteOldDesktop;

    public Desktop withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 桌面所属的用户，当桌面创建成功后此用户可以登录该桌面。只允许输入大写字母、小写字母、数字、中划线（-）和下划线（_）。域类型为LITE_AD时，使用小写字母或者大写字母开头，长度范围为[1-20]。当域类型为LOCAL_AD时，用户名可以使用小写字母或者大写字母或者数字开头，长度范围为[1-32]。Windows桌面用户最长支持20个字符，Linux桌面用户最长支持32个字符。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Desktop withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 用户所属域。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Desktop withUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    /**
     * 合法用户邮箱，桌面创建成功后系统会通过发送邮件的方式通知用户。
     * @return userEmail
     */
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Desktop withUserPhone(String userPhone) {
        this.userPhone = userPhone;
        return this;
    }

    /**
     * 合法用户手机号。
     * @return userPhone
     */
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Desktop withUserGroup(String userGroup) {
        this.userGroup = userGroup;
        return this;
    }

    /**
     * 桌面用户所属的用户组。  - sudo：Linux管理员组。 - default：Linux默认用户组。 - administrators：Windows管理员组。管理员拥有对该桌面的完全访问权，可以做任何需要的更改（禁用操作除外）。 - users：Windows标准用户组。标准用户可以使用大多数软件，并可以更改不影响其他用户的系统设置。
     * @return userGroup
     */
    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    public Desktop withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * 桌面名，桌面名必须保证唯一。桌面名称只允许输入大写字母、小写字母、中文、数字、中划线，以字母或数字开头、不能以中划线结尾，长度范围为1~15(中文字符长度为2，数字及英文字符长度为1)。
     * @return computerName
     */
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public Desktop withOsHostName(String osHostName) {
        this.osHostName = osHostName;
        return this;
    }

    /**
     * 系统计算机名。
     * @return osHostName
     */
    public String getOsHostName() {
        return osHostName;
    }

    public void setOsHostName(String osHostName) {
        this.osHostName = osHostName;
    }

    public Desktop withDesktopNamePrefix(String desktopNamePrefix) {
        this.desktopNamePrefix = desktopNamePrefix;
        return this;
    }

    /**
     * 桌面名称前缀，不指定\"computer_name\"时生效。
     * @return desktopNamePrefix
     */
    public String getDesktopNamePrefix() {
        return desktopNamePrefix;
    }

    public void setDesktopNamePrefix(String desktopNamePrefix) {
        this.desktopNamePrefix = desktopNamePrefix;
    }

    public Desktop withCopyVolumeDesktopId(String copyVolumeDesktopId) {
        this.copyVolumeDesktopId = copyVolumeDesktopId;
        return this;
    }

    /**
     * 需要拷贝数据盘的桌面ID，如果指定了该参数，那么copy_volume_ids不能为空。
     * @return copyVolumeDesktopId
     */
    public String getCopyVolumeDesktopId() {
        return copyVolumeDesktopId;
    }

    public void setCopyVolumeDesktopId(String copyVolumeDesktopId) {
        this.copyVolumeDesktopId = copyVolumeDesktopId;
    }

    public Desktop withCopyVolumeIds(List<String> copyVolumeIds) {
        this.copyVolumeIds = copyVolumeIds;
        return this;
    }

    public Desktop addCopyVolumeIdsItem(String copyVolumeIdsItem) {
        if (this.copyVolumeIds == null) {
            this.copyVolumeIds = new ArrayList<>();
        }
        this.copyVolumeIds.add(copyVolumeIdsItem);
        return this;
    }

    public Desktop withCopyVolumeIds(Consumer<List<String>> copyVolumeIdsSetter) {
        if (this.copyVolumeIds == null) {
            this.copyVolumeIds = new ArrayList<>();
        }
        copyVolumeIdsSetter.accept(this.copyVolumeIds);
        return this;
    }

    /**
     * 需要拷贝数据盘桌面的磁盘ID列表，如果指定了该参数，copy_volume_desktop_id不能为空，且磁盘必须属于该桌面。
     * @return copyVolumeIds
     */
    public List<String> getCopyVolumeIds() {
        return copyVolumeIds;
    }

    public void setCopyVolumeIds(List<String> copyVolumeIds) {
        this.copyVolumeIds = copyVolumeIds;
    }

    public Desktop withIfDeleteOldDesktop(Boolean ifDeleteOldDesktop) {
        this.ifDeleteOldDesktop = ifDeleteOldDesktop;
        return this;
    }

    /**
     * 是否删除按需旧桌面，值为true时，新发放桌面配置并拷贝磁盘后删除旧桌面
     * @return ifDeleteOldDesktop
     */
    public Boolean getIfDeleteOldDesktop() {
        return ifDeleteOldDesktop;
    }

    public void setIfDeleteOldDesktop(Boolean ifDeleteOldDesktop) {
        this.ifDeleteOldDesktop = ifDeleteOldDesktop;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Desktop that = (Desktop) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.userEmail, that.userEmail) && Objects.equals(this.userPhone, that.userPhone)
            && Objects.equals(this.userGroup, that.userGroup) && Objects.equals(this.computerName, that.computerName)
            && Objects.equals(this.osHostName, that.osHostName)
            && Objects.equals(this.desktopNamePrefix, that.desktopNamePrefix)
            && Objects.equals(this.copyVolumeDesktopId, that.copyVolumeDesktopId)
            && Objects.equals(this.copyVolumeIds, that.copyVolumeIds)
            && Objects.equals(this.ifDeleteOldDesktop, that.ifDeleteOldDesktop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName,
            domain,
            userEmail,
            userPhone,
            userGroup,
            computerName,
            osHostName,
            desktopNamePrefix,
            copyVolumeDesktopId,
            copyVolumeIds,
            ifDeleteOldDesktop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Desktop {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
        sb.append("    userPhone: ").append(toIndentedString(userPhone)).append("\n");
        sb.append("    userGroup: ").append(toIndentedString(userGroup)).append("\n");
        sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
        sb.append("    osHostName: ").append(toIndentedString(osHostName)).append("\n");
        sb.append("    desktopNamePrefix: ").append(toIndentedString(desktopNamePrefix)).append("\n");
        sb.append("    copyVolumeDesktopId: ").append(toIndentedString(copyVolumeDesktopId)).append("\n");
        sb.append("    copyVolumeIds: ").append(toIndentedString(copyVolumeIds)).append("\n");
        sb.append("    ifDeleteOldDesktop: ").append(toIndentedString(ifDeleteOldDesktop)).append("\n");
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
