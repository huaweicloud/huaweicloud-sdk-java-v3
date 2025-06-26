package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 用户基本信息。 **取值范围**： 不涉及。
 */
public class DatabaseUser {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login")

    private Boolean login;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_type")

    private String userType;

    public DatabaseUser withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 用户名。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DatabaseUser withLogin(Boolean login) {
        this.login = login;
        return this;
    }

    /**
     * **参数解释**： 是否可以登录。 **取值范围**： 不涉及。
     * @return login
     */
    public Boolean getLogin() {
        return login;
    }

    public void setLogin(Boolean login) {
        this.login = login;
    }

    public DatabaseUser withUserType(String userType) {
        this.userType = userType;
        return this;
    }

    /**
     * **参数解释**： 用户类型。 **取值范围**： COMMON：表示普通数据库用户。 IAM：表示IAM同步的数据库用户。 OneAccess: 表示OneAccess用户。
     * @return userType
     */
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatabaseUser that = (DatabaseUser) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.login, that.login)
            && Objects.equals(this.userType, that.userType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, login, userType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseUser {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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
