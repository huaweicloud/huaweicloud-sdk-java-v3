package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DbUserPwdRequest
 */
public class DbUserPwdRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    @JacksonXmlProperty(localName = "name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    @JacksonXmlProperty(localName = "password")
    
    private String password;

    public DbUserPwdRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 数据库帐号名称，不能为系统账号用户。系统用户包括“rdsAdmin”,“ rdsMetric”, “rdsBackup”, “rdsRepl”。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public DbUserPwdRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 数据库帐号密码。  取值范围：  非空，至少包含以下字符中的三种：大写字母、小写字母、数字和特殊符号~!@#%^*-_=+?,组成，长度8~32个字符，不能和数据库帐号“name”或“name”的逆序相同，或不能和当前密码相同。  建议您输入高强度密码，以提高安全性，防止出现密码被暴力破解等安全风险。
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
        DbUserPwdRequest dbUserPwdRequest = (DbUserPwdRequest) o;
        return Objects.equals(this.name, dbUserPwdRequest.name) &&
            Objects.equals(this.password, dbUserPwdRequest.password);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbUserPwdRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

