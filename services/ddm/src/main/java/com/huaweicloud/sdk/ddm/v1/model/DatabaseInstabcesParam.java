package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * used_rds参数说明
 */
public class DatabaseInstabcesParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminUser")

    private String adminUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminPassword")

    private String adminPassword;

    public DatabaseInstabcesParam withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 逻辑库关联的RDS的id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DatabaseInstabcesParam withAdminUser(String adminUser) {
        this.adminUser = adminUser;
        return this;
    }

    /**
     * 关联RDS实例的用户。
     * @return adminUser
     */
    public String getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser;
    }

    public DatabaseInstabcesParam withAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
        return this;
    }

    /**
     * 关联RDS实例的密码。
     * @return adminPassword
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DatabaseInstabcesParam databaseInstabcesParam = (DatabaseInstabcesParam) o;
        return Objects.equals(this.id, databaseInstabcesParam.id)
            && Objects.equals(this.adminUser, databaseInstabcesParam.adminUser)
            && Objects.equals(this.adminPassword, databaseInstabcesParam.adminPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adminUser, adminPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseInstabcesParam {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    adminUser: ").append(toIndentedString(adminUser)).append("\n");
        sb.append("    adminPassword: ").append(toIndentedString(adminPassword)).append("\n");
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
