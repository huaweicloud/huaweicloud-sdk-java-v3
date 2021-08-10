package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 云服务器元数据 */
public class VmMetaData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_pass")

    private String adminPass;

    public VmMetaData withAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    /** Windows弹性云服务器Administrator用户的密码。
     * 
     * @return adminPass */
    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmMetaData vmMetaData = (VmMetaData) o;
        return Objects.equals(this.adminPass, vmMetaData.adminPass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminPass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmMetaData {\n");
        sb.append("    adminPass: ").append(toIndentedString(adminPass)).append("\n");
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
