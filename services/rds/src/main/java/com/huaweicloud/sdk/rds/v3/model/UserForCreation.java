package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UserForCreation
 */
public class UserForCreation  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;

    public UserForCreation withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 数据库用户名称。 数据库帐号名称在1到32个字符之间，由小写字母、数字、中划线、或下划线组成，不能包含其他特殊字符。 - 若数据库版本为MySQL5.6和8.0，帐号长度为1～16个字符。 - 若数据库版本为MySQL5.7，帐号长度为1～32个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserForCreation withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 数据库帐号密码。  取值范围：  非空，由大小写字母、数字和特殊符号~!@#%^*-_=+?组成，长度8~32个字符，不能和数据库帐号“name”或“name”的逆序相同。  建议您输入高强度密码，以提高安全性，防止出现密码被暴力破解等安全风险。
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
        UserForCreation userForCreation = (UserForCreation) o;
        return Objects.equals(this.name, userForCreation.name) &&
            Objects.equals(this.password, userForCreation.password);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserForCreation {\n");
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

