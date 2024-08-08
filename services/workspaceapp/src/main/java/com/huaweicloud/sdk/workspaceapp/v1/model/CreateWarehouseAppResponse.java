package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateWarehouseAppResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_category")

    private AppCategoryEnum appCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private OsTypeEnum osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_name")

    private String versionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "appfile_store_path")

    private String appfileStorePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_file_size")

    private String appFileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_description")

    private String appDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "appicon_store_path")

    private String appiconStorePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify_time")

    private OffsetDateTime modifyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_time")

    private OffsetDateTime verifyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_status")

    private VerifyStatusEnum verifyStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_comment")

    private String verifyComment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_icon")

    private String appIcon;

    public CreateWarehouseAppResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 应用的记录id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateWarehouseAppResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用id。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public CreateWarehouseAppResponse withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户id。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public CreateWarehouseAppResponse withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public CreateWarehouseAppResponse withAppCategory(AppCategoryEnum appCategory) {
        this.appCategory = appCategory;
        return this;
    }

    /**
     * Get appCategory
     * @return appCategory
     */
    public AppCategoryEnum getAppCategory() {
        return appCategory;
    }

    public void setAppCategory(AppCategoryEnum appCategory) {
        this.appCategory = appCategory;
    }

    public CreateWarehouseAppResponse withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get osType
     * @return osType
     */
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public CreateWarehouseAppResponse withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * 版本号。
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public CreateWarehouseAppResponse withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * 版本名称。
     * @return versionName
     */
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public CreateWarehouseAppResponse withAppfileStorePath(String appfileStorePath) {
        this.appfileStorePath = appfileStorePath;
        return this;
    }

    /**
     * 应用文件的存放路径。
     * @return appfileStorePath
     */
    public String getAppfileStorePath() {
        return appfileStorePath;
    }

    public void setAppfileStorePath(String appfileStorePath) {
        this.appfileStorePath = appfileStorePath;
    }

    public CreateWarehouseAppResponse withAppFileSize(String appFileSize) {
        this.appFileSize = appFileSize;
        return this;
    }

    /**
     * 应用文件的大小，以KB为单位。
     * @return appFileSize
     */
    public String getAppFileSize() {
        return appFileSize;
    }

    public void setAppFileSize(String appFileSize) {
        this.appFileSize = appFileSize;
    }

    public CreateWarehouseAppResponse withAppDescription(String appDescription) {
        this.appDescription = appDescription;
        return this;
    }

    /**
     * 应用描述。
     * @return appDescription
     */
    public String getAppDescription() {
        return appDescription;
    }

    public void setAppDescription(String appDescription) {
        this.appDescription = appDescription;
    }

    public CreateWarehouseAppResponse withAppiconStorePath(String appiconStorePath) {
        this.appiconStorePath = appiconStorePath;
        return this;
    }

    /**
     * 应用文件的存放路径。
     * @return appiconStorePath
     */
    public String getAppiconStorePath() {
        return appiconStorePath;
    }

    public void setAppiconStorePath(String appiconStorePath) {
        this.appiconStorePath = appiconStorePath;
    }

    public CreateWarehouseAppResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 应用创建时间。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public CreateWarehouseAppResponse withModifyTime(OffsetDateTime modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 应用修改时间。
     * @return modifyTime
     */
    public OffsetDateTime getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(OffsetDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    public CreateWarehouseAppResponse withVerifyTime(OffsetDateTime verifyTime) {
        this.verifyTime = verifyTime;
        return this;
    }

    /**
     * 应用审核时间。
     * @return verifyTime
     */
    public OffsetDateTime getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(OffsetDateTime verifyTime) {
        this.verifyTime = verifyTime;
    }

    public CreateWarehouseAppResponse withVerifyStatus(VerifyStatusEnum verifyStatus) {
        this.verifyStatus = verifyStatus;
        return this;
    }

    /**
     * Get verifyStatus
     * @return verifyStatus
     */
    public VerifyStatusEnum getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(VerifyStatusEnum verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public CreateWarehouseAppResponse withVerifyComment(String verifyComment) {
        this.verifyComment = verifyComment;
        return this;
    }

    /**
     * 审核的评论意见。
     * @return verifyComment
     */
    public String getVerifyComment() {
        return verifyComment;
    }

    public void setVerifyComment(String verifyComment) {
        this.verifyComment = verifyComment;
    }

    public CreateWarehouseAppResponse withAppIcon(String appIcon) {
        this.appIcon = appIcon;
        return this;
    }

    /**
     * app的图标文件。
     * @return appIcon
     */
    public String getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(String appIcon) {
        this.appIcon = appIcon;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWarehouseAppResponse that = (CreateWarehouseAppResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.appCategory, that.appCategory) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.versionId, that.versionId) && Objects.equals(this.versionName, that.versionName)
            && Objects.equals(this.appfileStorePath, that.appfileStorePath)
            && Objects.equals(this.appFileSize, that.appFileSize)
            && Objects.equals(this.appDescription, that.appDescription)
            && Objects.equals(this.appiconStorePath, that.appiconStorePath)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.modifyTime, that.modifyTime)
            && Objects.equals(this.verifyTime, that.verifyTime) && Objects.equals(this.verifyStatus, that.verifyStatus)
            && Objects.equals(this.verifyComment, that.verifyComment) && Objects.equals(this.appIcon, that.appIcon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            appId,
            tenantId,
            appName,
            appCategory,
            osType,
            versionId,
            versionName,
            appfileStorePath,
            appFileSize,
            appDescription,
            appiconStorePath,
            createTime,
            modifyTime,
            verifyTime,
            verifyStatus,
            verifyComment,
            appIcon);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWarehouseAppResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appCategory: ").append(toIndentedString(appCategory)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
        sb.append("    appfileStorePath: ").append(toIndentedString(appfileStorePath)).append("\n");
        sb.append("    appFileSize: ").append(toIndentedString(appFileSize)).append("\n");
        sb.append("    appDescription: ").append(toIndentedString(appDescription)).append("\n");
        sb.append("    appiconStorePath: ").append(toIndentedString(appiconStorePath)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
        sb.append("    verifyTime: ").append(toIndentedString(verifyTime)).append("\n");
        sb.append("    verifyStatus: ").append(toIndentedString(verifyStatus)).append("\n");
        sb.append("    verifyComment: ").append(toIndentedString(verifyComment)).append("\n");
        sb.append("    appIcon: ").append(toIndentedString(appIcon)).append("\n");
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
