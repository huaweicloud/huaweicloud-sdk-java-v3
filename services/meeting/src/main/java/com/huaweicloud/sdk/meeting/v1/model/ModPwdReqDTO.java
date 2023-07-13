package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ModPwdReqDTO
 */
public class ModPwdReqDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oldPwd")

    private String oldPwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "newPwd")

    private String newPwd;

    public ModPwdReqDTO withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * 帐号，必须是携带域名的帐号。 
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public ModPwdReqDTO withOldPwd(String oldPwd) {
        this.oldPwd = oldPwd;
        return this;
    }

    /**
     * 用户旧的登录密码。 
     * @return oldPwd
     */
    public String getOldPwd() {
        return oldPwd;
    }

    public void setOldPwd(String oldPwd) {
        this.oldPwd = oldPwd;
    }

    public ModPwdReqDTO withNewPwd(String newPwd) {
        this.newPwd = newPwd;
        return this;
    }

    /**
     * 用户新的登录密码。 密码要求： * 长度范围要求8~32 * 至少包含两种字符类型：小写字母、大写字母、数字、特殊字符（` ~ ! @ # $ % ^ & * ( ) - _ = + \\ | [ { } ] ; : \" ,' < . > / ?） * 旧密码和新密码不能相同 * 上次修改密码后5分钟内不能更新密码 * 不能与最近使用的旧密码相同 * 不能包含3个以上重复字符 * 密码不能包含与其对应的用户名（不区分大小写）以及逆序的用户名（不区分大小写） * 新密码与旧密码之间允许的最少不相同字符数为2个 
     * @return newPwd
     */
    public String getNewPwd() {
        return newPwd;
    }

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModPwdReqDTO that = (ModPwdReqDTO) obj;
        return Objects.equals(this.account, that.account) && Objects.equals(this.oldPwd, that.oldPwd)
            && Objects.equals(this.newPwd, that.newPwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account, oldPwd, newPwd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModPwdReqDTO {\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    oldPwd: ").append(toIndentedString(oldPwd)).append("\n");
        sb.append("    newPwd: ").append(toIndentedString(newPwd)).append("\n");
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
