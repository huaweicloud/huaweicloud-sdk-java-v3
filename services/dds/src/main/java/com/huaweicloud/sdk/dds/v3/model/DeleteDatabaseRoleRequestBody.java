package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** DeleteDatabaseRoleRequestBody */
public class DeleteDatabaseRoleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_name")

    private String roleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    public DeleteDatabaseRoleRequestBody withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /** 角色名称。 - 长度为1~64位，可以包含大写字母（A~Z）、小写字母（a~z）、数字（0~9）、中划线、下划线和点。
     * 
     * @return roleName */
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public DeleteDatabaseRoleRequestBody withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /** 角色所在的数据库名称。 - 长度为1~64位，可以包含大写字母（A~Z）、小写字母（a~z）、数字（0~9）、下划线。
     * 
     * @return dbName */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteDatabaseRoleRequestBody deleteDatabaseRoleRequestBody = (DeleteDatabaseRoleRequestBody) o;
        return Objects.equals(this.roleName, deleteDatabaseRoleRequestBody.roleName)
            && Objects.equals(this.dbName, deleteDatabaseRoleRequestBody.dbName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleName, dbName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDatabaseRoleRequestBody {\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
