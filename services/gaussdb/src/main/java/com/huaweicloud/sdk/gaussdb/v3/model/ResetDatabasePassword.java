package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数据库用户名密码信息。
 */
public class ResetDatabasePassword  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host")
    
    
    private String host;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    
    private String password;

    public ResetDatabasePassword withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 数据库用户名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ResetDatabasePassword withHost(String host) {
        this.host = host;
        return this;
    }

    


    /**
     * 主机地址。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    

    public ResetDatabasePassword withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 数据库用户密码，非空，至少包含以下字符中的三种：大写字母、小写字母、数字和特殊符号~!@#$%^*-_=+?,()&组成，长度8~32个字符。建议您输入高强度密码，以提高安全性，防止出现密码被暴力破解等安全风险
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResetDatabasePassword resetDatabasePassword = (ResetDatabasePassword) o;
        return Objects.equals(this.name, resetDatabasePassword.name) &&
            Objects.equals(this.host, resetDatabasePassword.host) &&
            Objects.equals(this.password, resetDatabasePassword.password);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, host, password);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetDatabasePassword {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

