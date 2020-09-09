package com.huaweicloud.sdk.servicestage.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AccessPassword
 */
public class AccessPassword  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user")
    
    private String user;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;

    public AccessPassword withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 授权名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccessPassword withUser(String user) {
        this.user = user;
        return this;
    }

    


    /**
     * 仓库用户名。
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public AccessPassword withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 仓库密码。
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
        AccessPassword accessPassword = (AccessPassword) o;
        return Objects.equals(this.name, accessPassword.name) &&
            Objects.equals(this.user, accessPassword.user) &&
            Objects.equals(this.password, accessPassword.password);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, user, password);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessPassword {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

