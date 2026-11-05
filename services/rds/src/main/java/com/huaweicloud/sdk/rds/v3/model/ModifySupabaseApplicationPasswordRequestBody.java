package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改密码请求。application_password和instance_password可单独传，但不能同时为空。
 */
public class ModifySupabaseApplicationPasswordRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_password")

    private String applicationPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_password")

    private String instancePassword;

    public ModifySupabaseApplicationPasswordRequestBody withApplicationPassword(String applicationPassword) {
        this.applicationPassword = applicationPassword;
        return this;
    }

    /**
     * Supabase应用登录密码。
     * @return applicationPassword
     */
    public String getApplicationPassword() {
        return applicationPassword;
    }

    public void setApplicationPassword(String applicationPassword) {
        this.applicationPassword = applicationPassword;
    }

    public ModifySupabaseApplicationPasswordRequestBody withInstancePassword(String instancePassword) {
        this.instancePassword = instancePassword;
        return this;
    }

    /**
     * 纳管实例数据库密码。
     * @return instancePassword
     */
    public String getInstancePassword() {
        return instancePassword;
    }

    public void setInstancePassword(String instancePassword) {
        this.instancePassword = instancePassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifySupabaseApplicationPasswordRequestBody that = (ModifySupabaseApplicationPasswordRequestBody) obj;
        return Objects.equals(this.applicationPassword, that.applicationPassword)
            && Objects.equals(this.instancePassword, that.instancePassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationPassword, instancePassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifySupabaseApplicationPasswordRequestBody {\n");
        sb.append("    applicationPassword: ").append(toIndentedString(applicationPassword)).append("\n");
        sb.append("    instancePassword: ").append(toIndentedString(instancePassword)).append("\n");
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
