package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PwdResetRequest
 */
public class PwdResetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_user_pwd")

    private String dbUserPwd;

    public PwdResetRequest withDbUserPwd(String dbUserPwd) {
        this.dbUserPwd = dbUserPwd;
        return this;
    }

    /**
     * 数据库密码
     * @return dbUserPwd
     */
    public String getDbUserPwd() {
        return dbUserPwd;
    }

    public void setDbUserPwd(String dbUserPwd) {
        this.dbUserPwd = dbUserPwd;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PwdResetRequest pwdResetRequest = (PwdResetRequest) o;
        return Objects.equals(this.dbUserPwd, pwdResetRequest.dbUserPwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbUserPwd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PwdResetRequest {\n");
        sb.append("    dbUserPwd: ").append(toIndentedString(dbUserPwd)).append("\n");
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
