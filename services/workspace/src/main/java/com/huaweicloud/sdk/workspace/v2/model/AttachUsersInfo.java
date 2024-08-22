package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 桌面分配用户信息。
 */
public class AttachUsersInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_group")

    private String userGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public AttachUsersInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 当type字段为USER时，填写用户id；当type字段为GROUP时，填写用户组id，后端服务会校验组id是否存在；
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AttachUsersInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 桌面分配对象的名称，当type类型USER时填写用户名字；当type类型GROUP时填写用户组名称。 - 当type类型USER时：桌面所属的用户，当桌面分配成功后此用户可以登录该桌面。只允许输入大写字母、小写字母、数字、中划线（-）和下划线（_）。域类型为LITE_AD时，使用小写字母或者大写字母开头，长度范围为[1-20]。当域类型为LOCAL_AD时，用户名可以使用小写字母或者大写字母或者数字开头，长度范围为[1-64]。Windows桌面用户最长支持20个字符，Linux桌面用户最长支持64个字符。后端服务会校验用户名是否存在，并且用户名不能与机器名重复。 - 当type类型GROUP时：只能为中文、字母、数字及特殊符号-_。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AttachUsersInfo withUserGroup(String userGroup) {
        this.userGroup = userGroup;
        return this;
    }

    /**
     * 桌面用户所属的用户组。 - sudo：Linux管理员组。 - default：Linux默认用户组。 - administrators：Windows管理员组。管理员拥有对该桌面的完全访问权，可以做任何需要的更改（禁用操作除外）。 - users：Windows标准用户组。标准用户可以使用大多数软件，并可以更改不影响其他用户的系统设置。
     * @return userGroup
     */
    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    public AttachUsersInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 对象类型，可选值为： - USER：用户。 - GROUP：用户组。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachUsersInfo that = (AttachUsersInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.userGroup, that.userGroup) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, userGroup, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachUsersInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    userGroup: ").append(toIndentedString(userGroup)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
