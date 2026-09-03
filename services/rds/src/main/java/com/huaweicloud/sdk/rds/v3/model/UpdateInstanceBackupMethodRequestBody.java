package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 切换实例备份方式请求体
 */
public class UpdateInstanceBackupMethodRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_method")

    private String backupMethod;

    public UpdateInstanceBackupMethodRequestBody withBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
        return this;
    }

    /**
     * **参数解释**：  修改的备份方式。Db为物理备份（OBS），EBackup为CBR快照备份。  **约束限制**：  不涉及。
     * @return backupMethod
     */
    public String getBackupMethod() {
        return backupMethod;
    }

    public void setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateInstanceBackupMethodRequestBody that = (UpdateInstanceBackupMethodRequestBody) obj;
        return Objects.equals(this.backupMethod, that.backupMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupMethod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceBackupMethodRequestBody {\n");
        sb.append("    backupMethod: ").append(toIndentedString(backupMethod)).append("\n");
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
