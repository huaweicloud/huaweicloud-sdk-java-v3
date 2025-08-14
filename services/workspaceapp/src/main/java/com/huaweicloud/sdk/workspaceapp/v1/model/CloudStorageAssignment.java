package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 存储声明关联作用对象。
 */
public class CloudStorageAssignment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_storage_assignment_id")

    private String cloudStorageAssignmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_name")

    private String attachName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_quota")

    private Long usedQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Long quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

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

    public CloudStorageAssignment withCloudStorageAssignmentId(String cloudStorageAssignmentId) {
        this.cloudStorageAssignmentId = cloudStorageAssignmentId;
        return this;
    }

    /**
     * id。
     * @return cloudStorageAssignmentId
     */
    public String getCloudStorageAssignmentId() {
        return cloudStorageAssignmentId;
    }

    public void setCloudStorageAssignmentId(String cloudStorageAssignmentId) {
        this.cloudStorageAssignmentId = cloudStorageAssignmentId;
    }

    public CloudStorageAssignment withAttachName(String attachName) {
        this.attachName = attachName;
        return this;
    }

    /**
     * 用户名称(单位/B)。
     * @return attachName
     */
    public String getAttachName() {
        return attachName;
    }

    public void setAttachName(String attachName) {
        this.attachName = attachName;
    }

    public CloudStorageAssignment withUsedQuota(Long usedQuota) {
        this.usedQuota = usedQuota;
        return this;
    }

    /**
     * 已用容量(单位/B)。
     * @return usedQuota
     */
    public Long getUsedQuota() {
        return usedQuota;
    }

    public void setUsedQuota(Long usedQuota) {
        this.usedQuota = usedQuota;
    }

    public CloudStorageAssignment withQuota(Long quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 总容量(单位/B)。
     * @return quota
     */
    public Long getQuota() {
        return quota;
    }

    public void setQuota(Long quota) {
        this.quota = quota;
    }

    public CloudStorageAssignment withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 添加时间。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public CloudStorageAssignment withActionPut(Boolean actionPut) {
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

    public CloudStorageAssignment withActionGet(Boolean actionGet) {
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

    public CloudStorageAssignment withRoamActionPut(Boolean roamActionPut) {
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

    public CloudStorageAssignment withRoamActionGet(Boolean roamActionGet) {
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
        CloudStorageAssignment that = (CloudStorageAssignment) obj;
        return Objects.equals(this.cloudStorageAssignmentId, that.cloudStorageAssignmentId)
            && Objects.equals(this.attachName, that.attachName) && Objects.equals(this.usedQuota, that.usedQuota)
            && Objects.equals(this.quota, that.quota) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.actionPut, that.actionPut) && Objects.equals(this.actionGet, that.actionGet)
            && Objects.equals(this.roamActionPut, that.roamActionPut)
            && Objects.equals(this.roamActionGet, that.roamActionGet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudStorageAssignmentId,
            attachName,
            usedQuota,
            quota,
            createTime,
            actionPut,
            actionGet,
            roamActionPut,
            roamActionGet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudStorageAssignment {\n");
        sb.append("    cloudStorageAssignmentId: ").append(toIndentedString(cloudStorageAssignmentId)).append("\n");
        sb.append("    attachName: ").append(toIndentedString(attachName)).append("\n");
        sb.append("    usedQuota: ").append(toIndentedString(usedQuota)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
