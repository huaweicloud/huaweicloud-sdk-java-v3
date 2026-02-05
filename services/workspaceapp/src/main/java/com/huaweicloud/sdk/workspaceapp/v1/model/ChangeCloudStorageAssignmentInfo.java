package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 切换集群后文件夹返回信息。
 */
public class ChangeCloudStorageAssignmentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_id")

    private String attachId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach")

    private String attach;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Long quota;

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

    public ChangeCloudStorageAssignmentInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 存储分配的唯一标识符。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ChangeCloudStorageAssignmentInfo withAttachId(String attachId) {
        this.attachId = attachId;
        return this;
    }

    /**
     * 目标用户id。
     * @return attachId
     */
    public String getAttachId() {
        return attachId;
    }

    public void setAttachId(String attachId) {
        this.attachId = attachId;
    }

    public ChangeCloudStorageAssignmentInfo withAttach(String attach) {
        this.attach = attach;
        return this;
    }

    /**
     * 目标用户。
     * @return attach
     */
    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public ChangeCloudStorageAssignmentInfo withQuota(Long quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 配额。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return quota
     */
    public Long getQuota() {
        return quota;
    }

    public void setQuota(Long quota) {
        this.quota = quota;
    }

    public ChangeCloudStorageAssignmentInfo withActionPut(Boolean actionPut) {
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

    public ChangeCloudStorageAssignmentInfo withActionGet(Boolean actionGet) {
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

    public ChangeCloudStorageAssignmentInfo withRoamActionPut(Boolean roamActionPut) {
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

    public ChangeCloudStorageAssignmentInfo withRoamActionGet(Boolean roamActionGet) {
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
        ChangeCloudStorageAssignmentInfo that = (ChangeCloudStorageAssignmentInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.attachId, that.attachId)
            && Objects.equals(this.attach, that.attach) && Objects.equals(this.quota, that.quota)
            && Objects.equals(this.actionPut, that.actionPut) && Objects.equals(this.actionGet, that.actionGet)
            && Objects.equals(this.roamActionPut, that.roamActionPut)
            && Objects.equals(this.roamActionGet, that.roamActionGet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, attachId, attach, quota, actionPut, actionGet, roamActionPut, roamActionGet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeCloudStorageAssignmentInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    attachId: ").append(toIndentedString(attachId)).append("\n");
        sb.append("    attach: ").append(toIndentedString(attach)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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
