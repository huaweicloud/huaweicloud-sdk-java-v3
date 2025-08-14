package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改个人文件夹。
 */
public class UpdateUserAssignmentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_system_quota")

    private Long fileSystemQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_put")

    private Boolean actionPut;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_get")

    private Boolean actionGet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roam_action_put")

    private Boolean roamActionPut;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roam_action_get")

    private Boolean roamActionGet;

    public UpdateUserAssignmentInfo withFileSystemQuota(Long fileSystemQuota) {
        this.fileSystemQuota = fileSystemQuota;
        return this;
    }

    /**
     * 配额。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return fileSystemQuota
     */
    public Long getFileSystemQuota() {
        return fileSystemQuota;
    }

    public void setFileSystemQuota(Long fileSystemQuota) {
        this.fileSystemQuota = fileSystemQuota;
    }

    public UpdateUserAssignmentInfo withActionPut(Boolean actionPut) {
        this.actionPut = actionPut;
        return this;
    }

    /**
     * 云存储于本地设备的权限，上传： true : 允许上传。 false: 不允许上传。
     * @return actionPut
     */
    public Boolean getActionPut() {
        return actionPut;
    }

    public void setActionPut(Boolean actionPut) {
        this.actionPut = actionPut;
    }

    public UpdateUserAssignmentInfo withActionGet(Boolean actionGet) {
        this.actionGet = actionGet;
        return this;
    }

    /**
     * 云存储于本地设备的权限，下载： true : 允许下载。 false: 不允许下载。
     * @return actionGet
     */
    public Boolean getActionGet() {
        return actionGet;
    }

    public void setActionGet(Boolean actionGet) {
        this.actionGet = actionGet;
    }

    public UpdateUserAssignmentInfo withRoamActionPut(Boolean roamActionPut) {
        this.roamActionPut = roamActionPut;
        return this;
    }

    /**
     * 云存储于云桌面/云应用权限，上传： true : 允许上传。 false: 不允许上传。
     * @return roamActionPut
     */
    public Boolean getRoamActionPut() {
        return roamActionPut;
    }

    public void setRoamActionPut(Boolean roamActionPut) {
        this.roamActionPut = roamActionPut;
    }

    public UpdateUserAssignmentInfo withRoamActionGet(Boolean roamActionGet) {
        this.roamActionGet = roamActionGet;
        return this;
    }

    /**
     * 云存储于云桌面/云应用权限，下载： true : 允许下载。 false: 不允许下载。
     * @return roamActionGet
     */
    public Boolean getRoamActionGet() {
        return roamActionGet;
    }

    public void setRoamActionGet(Boolean roamActionGet) {
        this.roamActionGet = roamActionGet;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateUserAssignmentInfo that = (UpdateUserAssignmentInfo) obj;
        return Objects.equals(this.fileSystemQuota, that.fileSystemQuota)
            && Objects.equals(this.actionPut, that.actionPut) && Objects.equals(this.actionGet, that.actionGet)
            && Objects.equals(this.roamActionPut, that.roamActionPut)
            && Objects.equals(this.roamActionGet, that.roamActionGet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileSystemQuota, actionPut, actionGet, roamActionPut, roamActionGet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateUserAssignmentInfo {\n");
        sb.append("    fileSystemQuota: ").append(toIndentedString(fileSystemQuota)).append("\n");
        sb.append("    actionPut: ").append(toIndentedString(actionPut)).append("\n");
        sb.append("    actionGet: ").append(toIndentedString(actionGet)).append("\n");
        sb.append("    roamActionPut: ").append(toIndentedString(roamActionPut)).append("\n");
        sb.append("    roamActionGet: ").append(toIndentedString(roamActionGet)).append("\n");
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
