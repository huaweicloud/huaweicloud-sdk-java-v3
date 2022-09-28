package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据恢复请求体
 */
public class RestoreBackupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overwrite")

    private Boolean overwrite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_folder")

    private String targetFolder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_project_id")

    private String targetProjectId;

    public RestoreBackupReq withOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }

    /**
     * 执行策略（true：全部覆盖，false：全部跳过，默认为true）
     * @return overwrite
     */
    public Boolean getOverwrite() {
        return overwrite;
    }

    public void setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
    }

    public RestoreBackupReq withTargetFolder(String targetFolder) {
        this.targetFolder = targetFolder;
        return this;
    }

    /**
     * 目标文件夹
     * @return targetFolder
     */
    public String getTargetFolder() {
        return targetFolder;
    }

    public void setTargetFolder(String targetFolder) {
        this.targetFolder = targetFolder;
    }

    public RestoreBackupReq withTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }

    /**
     * 目标项目ID
     * @return targetProjectId
     */
    public String getTargetProjectId() {
        return targetProjectId;
    }

    public void setTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestoreBackupReq restoreBackupReq = (RestoreBackupReq) o;
        return Objects.equals(this.overwrite, restoreBackupReq.overwrite)
            && Objects.equals(this.targetFolder, restoreBackupReq.targetFolder)
            && Objects.equals(this.targetProjectId, restoreBackupReq.targetProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(overwrite, targetFolder, targetProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreBackupReq {\n");
        sb.append("    overwrite: ").append(toIndentedString(overwrite)).append("\n");
        sb.append("    targetFolder: ").append(toIndentedString(targetFolder)).append("\n");
        sb.append("    targetProjectId: ").append(toIndentedString(targetProjectId)).append("\n");
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
