package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Login
 */
public class Login {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sshKey")

    private String sshKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userPassword")

    private UserPassword userPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "removeUserPassword")

    private Boolean removeUserPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "removeSSHKey")

    private Boolean removeSSHKey;

    public Login withSshKey(String sshKey) {
        this.sshKey = sshKey;
        return this;
    }

    /**
     * 选择密钥对方式登录时的密钥对名称。
     * @return sshKey
     */
    public String getSshKey() {
        return sshKey;
    }

    public void setSshKey(String sshKey) {
        this.sshKey = sshKey;
    }

    public Login withUserPassword(UserPassword userPassword) {
        this.userPassword = userPassword;
        return this;
    }

    public Login withUserPassword(Consumer<UserPassword> userPasswordSetter) {
        if (this.userPassword == null) {
            this.userPassword = new UserPassword();
            userPasswordSetter.accept(this.userPassword);
        }

        return this;
    }

    /**
     * Get userPassword
     * @return userPassword
     */
    public UserPassword getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(UserPassword userPassword) {
        this.userPassword = userPassword;
    }

    public Login withRemoveUserPassword(Boolean removeUserPassword) {
        this.removeUserPassword = removeUserPassword;
        return this;
    }

    /**
     * **参数解释**： 更新节点池时，移除当前节点池密码方式登录的配置 **约束限制**： 仅更新节点池场景支持该参数，设置为true时不允许设置userPassword **取值范围**： 不涉及 **默认取值**： false
     * @return removeUserPassword
     */
    public Boolean getRemoveUserPassword() {
        return removeUserPassword;
    }

    public void setRemoveUserPassword(Boolean removeUserPassword) {
        this.removeUserPassword = removeUserPassword;
    }

    public Login withRemoveSSHKey(Boolean removeSSHKey) {
        this.removeSSHKey = removeSSHKey;
        return this;
    }

    /**
     * **参数解释**： 更新节点池时，移除当前节点池密钥对方式登录的配置 **约束限制**： 仅更新节点池场景支持该参数，设置为true时不允许设置sshKey **取值范围**： 不涉及 **默认取值**： false
     * @return removeSSHKey
     */
    public Boolean getRemoveSSHKey() {
        return removeSSHKey;
    }

    public void setRemoveSSHKey(Boolean removeSSHKey) {
        this.removeSSHKey = removeSSHKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Login that = (Login) obj;
        return Objects.equals(this.sshKey, that.sshKey) && Objects.equals(this.userPassword, that.userPassword)
            && Objects.equals(this.removeUserPassword, that.removeUserPassword)
            && Objects.equals(this.removeSSHKey, that.removeSSHKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sshKey, userPassword, removeUserPassword, removeSSHKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Login {\n");
        sb.append("    sshKey: ").append(toIndentedString(sshKey)).append("\n");
        sb.append("    userPassword: ").append(toIndentedString(userPassword)).append("\n");
        sb.append("    removeUserPassword: ").append(toIndentedString(removeUserPassword)).append("\n");
        sb.append("    removeSSHKey: ").append(toIndentedString(removeSSHKey)).append("\n");
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
