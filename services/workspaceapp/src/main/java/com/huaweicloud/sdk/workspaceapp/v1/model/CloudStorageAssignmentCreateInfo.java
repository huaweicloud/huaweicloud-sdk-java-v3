package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建文件夹返回信息。
 */
public class CloudStorageAssignmentCreateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_name")

    private String folderName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach")

    private String attach;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_id")

    private String attachId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_type")

    private AttachType attachType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errorMessage")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isSuccess")

    private Boolean isSuccess;

    public CloudStorageAssignmentCreateInfo withId(String id) {
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

    public CloudStorageAssignmentCreateInfo withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public CloudStorageAssignmentCreateInfo withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public CloudStorageAssignmentCreateInfo withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 域ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CloudStorageAssignmentCreateInfo withFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }

    /**
     * 文件夹名称。
     * @return folderName
     */
    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public CloudStorageAssignmentCreateInfo withAttach(String attach) {
        this.attach = attach;
        return this;
    }

    /**
     * 用户名称。
     * @return attach
     */
    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public CloudStorageAssignmentCreateInfo withAttachId(String attachId) {
        this.attachId = attachId;
        return this;
    }

    /**
     * 用户ID。
     * @return attachId
     */
    public String getAttachId() {
        return attachId;
    }

    public void setAttachId(String attachId) {
        this.attachId = attachId;
    }

    public CloudStorageAssignmentCreateInfo withAttachType(AttachType attachType) {
        this.attachType = attachType;
        return this;
    }

    /**
     * Get attachType
     * @return attachType
     */
    public AttachType getAttachType() {
        return attachType;
    }

    public void setAttachType(AttachType attachType) {
        this.attachType = attachType;
    }

    public CloudStorageAssignmentCreateInfo withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public CloudStorageAssignmentCreateInfo withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 是否创建成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudStorageAssignmentCreateInfo that = (CloudStorageAssignmentCreateInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.folderName, that.folderName) && Objects.equals(this.attach, that.attach)
            && Objects.equals(this.attachId, that.attachId) && Objects.equals(this.attachType, that.attachType)
            && Objects.equals(this.errorMessage, that.errorMessage) && Objects.equals(this.isSuccess, that.isSuccess);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, regionId, tenantId, domainId, folderName, attach, attachId, attachType, errorMessage, isSuccess);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudStorageAssignmentCreateInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    folderName: ").append(toIndentedString(folderName)).append("\n");
        sb.append("    attach: ").append(toIndentedString(attach)).append("\n");
        sb.append("    attachId: ").append(toIndentedString(attachId)).append("\n");
        sb.append("    attachType: ").append(toIndentedString(attachType)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
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
