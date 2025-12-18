package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SqlserverUserForCreation
 */
public class SqlserverUserForCreation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_readonly")

    private Boolean instanceReadonly;

    public SqlserverUserForCreation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据库用户名称。  数据库帐号名称在1到128个字符之间，不能和系统用户名称相同。  系统用户包括：rdsadmin, rdsuser, rdsbackup, rdsmirror。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SqlserverUserForCreation withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 数据库帐号密码。  取值范围：非空，密码长度在8到128个字符之间，至少包含大写字母、小写字母、数字、特殊字符三种字符的组合。  建议您输入高强度密码，以提高安全性，防止出现密码被暴力破解等安全风险。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SqlserverUserForCreation withInstanceReadonly(Boolean instanceReadonly) {
        this.instanceReadonly = instanceReadonly;
        return this;
    }

    /**
     * 是否创建实例级只读账号。
     * @return instanceReadonly
     */
    public Boolean getInstanceReadonly() {
        return instanceReadonly;
    }

    public void setInstanceReadonly(Boolean instanceReadonly) {
        this.instanceReadonly = instanceReadonly;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlserverUserForCreation that = (SqlserverUserForCreation) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.password, that.password)
            && Objects.equals(this.instanceReadonly, that.instanceReadonly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, instanceReadonly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlserverUserForCreation {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    instanceReadonly: ").append(toIndentedString(instanceReadonly)).append("\n");
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
