package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowBackupConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_backup_method")

    private String defaultBackupMethod;

    public ShowBackupConfigResponse withDefaultBackupMethod(String defaultBackupMethod) {
        this.defaultBackupMethod = defaultBackupMethod;
        return this;
    }

    /**
     * 备份方式 - EBACKUP - PHYSICALBACKUP
     * @return defaultBackupMethod
     */
    public String getDefaultBackupMethod() {
        return defaultBackupMethod;
    }

    public void setDefaultBackupMethod(String defaultBackupMethod) {
        this.defaultBackupMethod = defaultBackupMethod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBackupConfigResponse that = (ShowBackupConfigResponse) obj;
        return Objects.equals(this.defaultBackupMethod, that.defaultBackupMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultBackupMethod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackupConfigResponse {\n");
        sb.append("    defaultBackupMethod: ").append(toIndentedString(defaultBackupMethod)).append("\n");
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
