package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GaussDBforOpenGaussUserForCreation
 */
public class GaussDBforOpenGaussUserForCreation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_login_only")

    private Boolean isLoginOnly;

    public GaussDBforOpenGaussUserForCreation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据库用户名称。  数据库用户名称在1到63个字符之间，由字母、数字、或下划线组成，不能包含其他特殊字符，不能以“pg”和数字开头，不能和系统用户名称相同。  系统用户包括“rdsAdmin”,“ rdsMetric”, “rdsBackup”, “rdsRepl”。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GaussDBforOpenGaussUserForCreation withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 数据库用户密码。  取值范围：非空，密码长度在8到32个字符之间，至少包含大写字母、小写字母、数字、特殊字符~!@#%^*-_=+?,三种字符的组合，不能和数据库帐号“name”或“name”的逆序相同。  建议您输入高强度密码，以提高安全性，防止出现密码被暴力破解等安全风险。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public GaussDBforOpenGaussUserForCreation withIsLoginOnly(Boolean isLoginOnly) {
        this.isLoginOnly = isLoginOnly;
        return this;
    }

    /**
     * 数据库账户是否只支持登入。 取值范围：不传值或设置为false，创建数据库账号包含登入数据库、创建数据库与用户权限，设置为true，只包含登入数据库权限。
     * @return isLoginOnly
     */
    public Boolean getIsLoginOnly() {
        return isLoginOnly;
    }

    public void setIsLoginOnly(Boolean isLoginOnly) {
        this.isLoginOnly = isLoginOnly;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GaussDBforOpenGaussUserForCreation that = (GaussDBforOpenGaussUserForCreation) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.password, that.password)
            && Objects.equals(this.isLoginOnly, that.isLoginOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, isLoginOnly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GaussDBforOpenGaussUserForCreation {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    isLoginOnly: ").append(toIndentedString(isLoginOnly)).append("\n");
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
