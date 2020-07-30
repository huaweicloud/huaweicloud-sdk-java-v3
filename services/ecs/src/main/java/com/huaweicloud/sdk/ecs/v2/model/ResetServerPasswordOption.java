package com.huaweicloud.sdk.ecs.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResetServerPasswordOption
 */
public class ResetServerPasswordOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="new_password")
    
    private String newPassword;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_check_password")
    
    private Boolean isCheckPassword;

    public ResetServerPasswordOption withNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    


    /**
     * 弹性云服务器新密码。  该接口默认不做密码安全性校验；如需校验，请指定字段“is_check_password”为true。  新密码的校验规则： - 密码长度范围为8到26位。 - 允许输入的字符包括：!@%-_=+[]:./? - 禁止输入的字符包括：汉字及【】：；“”‘’、，。《》？￥…（）—— ·！~`#&^,{}*();\"'<>|\\ $ - 复杂度上必须包含大写字母（A-Z）、小写字母（a-z）、数字（0-9）、以及允许的特殊字符中的3种以上搭配 - 不能包含用户名 \"Administrator\" 和“root”及逆序字符 - 不能包含用户名 \"Administrator\" 中连续3个字符
     * @return newPassword
     */
    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public ResetServerPasswordOption withIsCheckPassword(Boolean isCheckPassword) {
        this.isCheckPassword = isCheckPassword;
        return this;
    }

    


    /**
     * 是否检查密码的复杂度。
     * @return isCheckPassword
     */
    public Boolean getIsCheckPassword() {
        return isCheckPassword;
    }

    public void setIsCheckPassword(Boolean isCheckPassword) {
        this.isCheckPassword = isCheckPassword;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResetServerPasswordOption resetServerPasswordOption = (ResetServerPasswordOption) o;
        return Objects.equals(this.newPassword, resetServerPasswordOption.newPassword) &&
            Objects.equals(this.isCheckPassword, resetServerPasswordOption.isCheckPassword);
    }
    @Override
    public int hashCode() {
        return Objects.hash(newPassword, isCheckPassword);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetServerPasswordOption {\n");
        sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
        sb.append("    isCheckPassword: ").append(toIndentedString(isCheckPassword)).append("\n");
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

