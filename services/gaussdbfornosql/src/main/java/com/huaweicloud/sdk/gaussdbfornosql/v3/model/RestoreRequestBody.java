package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 恢复到已有实例的请求body
 */
public class RestoreRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    public RestoreRequestBody withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * 备份文件名称。根据备份文件恢复到已有的实例。
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public RestoreRequestBody withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 实例密码。 取值范围：长度为8~32位，必须是大写字母（A~Z）、小写字母（a~z）、数字（0~9）、特殊字符~!@#%^*-_=+?的组合。   - 不传入密码时，恢复后，备份文件中保留的密码将覆盖原有实例的密码。   - 传入密码时，恢复后，将使用该密码覆盖原有实例的密码。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestoreRequestBody restoreRequestBody = (RestoreRequestBody) o;
        return Objects.equals(this.backupId, restoreRequestBody.backupId)
            && Objects.equals(this.password, restoreRequestBody.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupId, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreRequestBody {\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
