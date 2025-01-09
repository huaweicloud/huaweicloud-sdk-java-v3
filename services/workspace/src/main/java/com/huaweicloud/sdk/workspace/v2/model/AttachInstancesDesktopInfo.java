package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分配用户请求桌面信息，单人专属桌面只能分配给一个用户；多人共享桌面可以分配给多个用户或用户组，具体分配信息见字段attach_user_infos说明。
 */
public class AttachInstancesDesktopInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_email")

    private String userEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_group")

    private String userGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computer_name")

    private String computerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_clear_data")

    private Boolean isClearData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_user_infos")

    private List<AttachInstancesUserInfo> attachUserInfos = null;

    public AttachInstancesDesktopInfo withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 待分配的桌面ID。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public AttachInstancesDesktopInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 桌面所属的用户，当桌面分配成功后此用户可以登录该桌面。只允许输入大写字母、小写字母、数字、中划线（-）和下划线（_）。域类型为LITE_AD时，使用小写字母或者大写字母开头，长度范围为[1-20]。当域类型为LOCAL_AD时，用户名可以使用小写字母或者大写字母或者数字开头，长度范围为[1-32]。Windows桌面用户最长支持20个字符，Linux桌面用户最长支持32个字符。用户名不能与分配的机器名重名。 attach_user_infos为空时,必填,attach_user_infos优先级更高
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public AttachInstancesDesktopInfo withUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    /**
     * 合法用户邮箱，桌面分配成功后系统会通过发送邮件的方式通知用户
     * @return userEmail
     */
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public AttachInstancesDesktopInfo withUserGroup(String userGroup) {
        this.userGroup = userGroup;
        return this;
    }

    /**
     * 桌面用户所属的用户组,attach_user_infos为空时,必填,attach_user_infos优先级更高。  - sudo：Linux管理员组。 - default：Linux默认用户组。 - administrators：Windows管理员组。管理员拥有对该桌面的完全访问权，可以做任何需要的更改（禁用操作除外）。 - users：Windows标准用户组。标准用户可以使用大多数软件，并可以更改不影响其他用户的系统设置。
     * @return userGroup
     */
    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    public AttachInstancesDesktopInfo withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * 桌面名，桌面名必须保证唯一。只允许输入大写字母、小写字母、数字、中划线（-）和下划线（_）；以字母开头且不允许以中划线（-）结尾；长度范围为[1-15]。
     * @return computerName
     */
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public AttachInstancesDesktopInfo withIsClearData(Boolean isClearData) {
        this.isClearData = isClearData;
        return this;
    }

    /**
     * 该字段只有当解绑和绑定为同一个用户时生效。表示绑定时是否清理桌面数据，true：清理，false：不清理，默认值为true。
     * @return isClearData
     */
    public Boolean getIsClearData() {
        return isClearData;
    }

    public void setIsClearData(Boolean isClearData) {
        this.isClearData = isClearData;
    }

    public AttachInstancesDesktopInfo withAttachUserInfos(List<AttachInstancesUserInfo> attachUserInfos) {
        this.attachUserInfos = attachUserInfos;
        return this;
    }

    public AttachInstancesDesktopInfo addAttachUserInfosItem(AttachInstancesUserInfo attachUserInfosItem) {
        if (this.attachUserInfos == null) {
            this.attachUserInfos = new ArrayList<>();
        }
        this.attachUserInfos.add(attachUserInfosItem);
        return this;
    }

    public AttachInstancesDesktopInfo withAttachUserInfos(
        Consumer<List<AttachInstancesUserInfo>> attachUserInfosSetter) {
        if (this.attachUserInfos == null) {
            this.attachUserInfos = new ArrayList<>();
        }
        attachUserInfosSetter.accept(this.attachUserInfos);
        return this;
    }

    /**
     * 待分配的用户信息列表,只有多用户桌面分配多人时有效。
     * @return attachUserInfos
     */
    public List<AttachInstancesUserInfo> getAttachUserInfos() {
        return attachUserInfos;
    }

    public void setAttachUserInfos(List<AttachInstancesUserInfo> attachUserInfos) {
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
        AttachInstancesDesktopInfo that = (AttachInstancesDesktopInfo) obj;
        return Objects.equals(this.desktopId, that.desktopId) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.userEmail, that.userEmail) && Objects.equals(this.userGroup, that.userGroup)
            && Objects.equals(this.computerName, that.computerName)
            && Objects.equals(this.isClearData, that.isClearData)
            && Objects.equals(this.attachUserInfos, that.attachUserInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopId, userName, userEmail, userGroup, computerName, isClearData, attachUserInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachInstancesDesktopInfo {\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
        sb.append("    userGroup: ").append(toIndentedString(userGroup)).append("\n");
        sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
        sb.append("    isClearData: ").append(toIndentedString(isClearData)).append("\n");
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
