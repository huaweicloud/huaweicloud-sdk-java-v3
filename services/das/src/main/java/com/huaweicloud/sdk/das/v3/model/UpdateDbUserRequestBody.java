package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 修改注册的数据库用户请求
 */
public class UpdateDbUserRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_username")

    @JacksonXmlProperty(localName = "db_username")

    private String dbUsername;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_user_password")

    @JacksonXmlProperty(localName = "db_user_password")

    private String dbUserPassword;

    public UpdateDbUserRequestBody withDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
        return this;
    }

    /**
     * 数据库用户名称
     * @return dbUsername
     */
    public String getDbUsername() {
        return dbUsername;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    public UpdateDbUserRequestBody withDbUserPassword(String dbUserPassword) {
        this.dbUserPassword = dbUserPassword;
        return this;
    }

    /**
     * 数据库用户密码
     * @return dbUserPassword
     */
    public String getDbUserPassword() {
        return dbUserPassword;
    }

    public void setDbUserPassword(String dbUserPassword) {
        this.dbUserPassword = dbUserPassword;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDbUserRequestBody updateDbUserRequestBody = (UpdateDbUserRequestBody) o;
        return Objects.equals(this.dbUsername, updateDbUserRequestBody.dbUsername)
            && Objects.equals(this.dbUserPassword, updateDbUserRequestBody.dbUserPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbUsername, dbUserPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDbUserRequestBody {\n");
        sb.append("    dbUsername: ").append(toIndentedString(dbUsername)).append("\n");
        sb.append("    dbUserPassword: ").append(toIndentedString(dbUserPassword)).append("\n");
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
