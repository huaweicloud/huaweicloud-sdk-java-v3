package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class KeystoneUpdatePasswordOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="original_password")
    
    private String originalPassword;

    public KeystoneUpdatePasswordOption withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * IAM用户的新密码。   - 系统默认密码最小长度为6位字符，在6-32位之间支持用户自定义密码长度。   - 至少包含以下四种字符中的两种： 大写字母、小写字母、数字和特殊字符。   - 不能包含手机号和邮箱。   - 必须满足用户所属账号的[密码策略](https://support.huaweicloud.com/usermanual-iam/iam_01_0607.html)要求。   - 新密码不能与当前密码相同。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public KeystoneUpdatePasswordOption withOriginalPassword(String originalPassword) {
        this.originalPassword = originalPassword;
        return this;
    }

    


    /**
     * IAM用户的原密码。
     * @return originalPassword
     */
    public String getOriginalPassword() {
        return originalPassword;
    }

    public void setOriginalPassword(String originalPassword) {
        this.originalPassword = originalPassword;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneUpdatePasswordOption keystoneUpdatePasswordOption = (KeystoneUpdatePasswordOption) o;
        return Objects.equals(this.password, keystoneUpdatePasswordOption.password) &&
            Objects.equals(this.originalPassword, keystoneUpdatePasswordOption.originalPassword);
    }
    @Override
    public int hashCode() {
        return Objects.hash(password, originalPassword);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneUpdatePasswordOption {\n");
            sb.append("    password: ").append(toIndentedString(password)).append("\n");
            sb.append("    originalPassword: ").append(toIndentedString(originalPassword)).append("\n");
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

