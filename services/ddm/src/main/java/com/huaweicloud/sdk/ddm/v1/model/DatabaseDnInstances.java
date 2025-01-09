package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DatabaseDnInstances
 */
public class DatabaseDnInstances {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_password")

    private String userPassword;

    public DatabaseDnInstances withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 逻辑库关联的DN实例的id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DatabaseDnInstances withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 关联DN实例的用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public DatabaseDnInstances withUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }

    /**
     * 关联DN实例的用户密码。
     * @return userPassword
     */
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatabaseDnInstances that = (DatabaseDnInstances) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.userPassword, that.userPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, userPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseDnInstances {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userPassword: ").append(toIndentedString(userPassword)).append("\n");
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
