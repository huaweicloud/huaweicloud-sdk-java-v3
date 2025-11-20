package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DNInstance
 */
public class DNInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dn_instance_id")

    private String dnInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_user")

    private String adminUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_password")

    private String adminPassword;

    public DNInstance withDnInstanceId(String dnInstanceId) {
        this.dnInstanceId = dnInstanceId;
        return this;
    }

    /**
     * 实例id。
     * @return dnInstanceId
     */
    public String getDnInstanceId() {
        return dnInstanceId;
    }

    public void setDnInstanceId(String dnInstanceId) {
        this.dnInstanceId = dnInstanceId;
    }

    public DNInstance withAdminUser(String adminUser) {
        this.adminUser = adminUser;
        return this;
    }

    /**
     * 实例账号。
     * @return adminUser
     */
    public String getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser;
    }

    public DNInstance withAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
        return this;
    }

    /**
     * 实例密码。
     * @return adminPassword
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DNInstance that = (DNInstance) obj;
        return Objects.equals(this.dnInstanceId, that.dnInstanceId) && Objects.equals(this.adminUser, that.adminUser)
            && Objects.equals(this.adminPassword, that.adminPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnInstanceId, adminUser, adminPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DNInstance {\n");
        sb.append("    dnInstanceId: ").append(toIndentedString(dnInstanceId)).append("\n");
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
