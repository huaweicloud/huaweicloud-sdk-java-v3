package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 重置密码的请求体。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class ResetPasswordRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_password")

    private String newPassword;

    public ResetPasswordRequestBody withNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    /**
     * **参数解释**： GaussDB(DWS) 集群管理员新密码。 **约束限制**： 新密码复杂度要求如下：  - 密码字符长度为12~32位。 - 不能与用户名或倒序的用户名相同。 - 至少包含以下4种类型的3种：    - 小写字母   - 大写字母   - 数字   - 特殊字符（~!?,.:;-_'\"(){}[]/<>@#%^&*+|\\=）。 - 不能与历史密码相同。 - 不能为弱密码。  **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return newPassword
     */
    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetPasswordRequestBody that = (ResetPasswordRequestBody) obj;
        return Objects.equals(this.newPassword, that.newPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetPasswordRequestBody {\n");
        sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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
