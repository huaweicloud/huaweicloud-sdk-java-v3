package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 先上传应用文件，再提交向应用仓库中添加应用的请求。
 */
public class CreateWarehouseAppReq {

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
    @JsonProperty(value = "app_description")

    private String appDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_name")

    private String versionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "appfile_store_path")

    private String appfileStorePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_icon")

    private String appIcon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_file_size")

    private Integer appFileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_extended_info")

    private AppExtendedInfo appExtendedInfo;

    public CreateWarehouseAppReq withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称,名称需满足如下规则: 1. 由中文，英文大小写，数字，_-组成。 2. 长度范围1~64个字符。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public CreateWarehouseAppReq withAppCategory(AppCategoryEnum appCategory) {
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

    public CreateWarehouseAppReq withOsType(OsTypeEnum osType) {
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

    public CreateWarehouseAppReq withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * 版本号,名称需满足如下规则: 1. 由可见字符组成。 2. 长度范围1~64个字符。
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public CreateWarehouseAppReq withAppDescription(String appDescription) {
        this.appDescription = appDescription;
        return this;
    }

    /**
     * 应用仓库中的应用描述。
     * @return appDescription
     */
    public String getAppDescription() {
        return appDescription;
    }

    public void setAppDescription(String appDescription) {
        this.appDescription = appDescription;
    }

    public CreateWarehouseAppReq withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * 版本描述,名称需满足如下规则: 1. 由可见字符组成。 2. 长度范围1~255个字符。
     * @return versionName
     */
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public CreateWarehouseAppReq withAppfileStorePath(String appfileStorePath) {
        this.appfileStorePath = appfileStorePath;
        return this;
    }

    /**
     * 应用在obs桶的存储路径。
     * @return appfileStorePath
     */
    public String getAppfileStorePath() {
        return appfileStorePath;
    }

    public void setAppfileStorePath(String appfileStorePath) {
        this.appfileStorePath = appfileStorePath;
    }

    public CreateWarehouseAppReq withAppIcon(String appIcon) {
        this.appIcon = appIcon;
        return this;
    }

    /**
     * > - 图片的默认大小当前限制为8KB，即1024 * 8字节。 > - 如果数据格式为data;image/png;base64,iVBORw0KGgoAAAANS时实际大小约为字段约为：size * 4/3 + 4bytes。
     * @return appIcon
     */
    public String getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(String appIcon) {
        this.appIcon = appIcon;
    }

    public CreateWarehouseAppReq withAppFileSize(Integer appFileSize) {
        this.appFileSize = appFileSize;
        return this;
    }

    /**
     * 应用文件大小，单位为KB。
     * minimum: 1
     * maximum: 5242880
     * @return appFileSize
     */
    public Integer getAppFileSize() {
        return appFileSize;
    }

    public void setAppFileSize(Integer appFileSize) {
        this.appFileSize = appFileSize;
    }

    public CreateWarehouseAppReq withAppExtendedInfo(AppExtendedInfo appExtendedInfo) {
        this.appExtendedInfo = appExtendedInfo;
        return this;
    }

    public CreateWarehouseAppReq withAppExtendedInfo(Consumer<AppExtendedInfo> appExtendedInfoSetter) {
        if (this.appExtendedInfo == null) {
            this.appExtendedInfo = new AppExtendedInfo();
            appExtendedInfoSetter.accept(this.appExtendedInfo);
        }

        return this;
    }

    /**
     * Get appExtendedInfo
     * @return appExtendedInfo
     */
    public AppExtendedInfo getAppExtendedInfo() {
        return appExtendedInfo;
    }

    public void setAppExtendedInfo(AppExtendedInfo appExtendedInfo) {
        this.appExtendedInfo = appExtendedInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWarehouseAppReq that = (CreateWarehouseAppReq) obj;
        return Objects.equals(this.appName, that.appName) && Objects.equals(this.appCategory, that.appCategory)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.versionId, that.versionId)
            && Objects.equals(this.appDescription, that.appDescription)
            && Objects.equals(this.versionName, that.versionName)
            && Objects.equals(this.appfileStorePath, that.appfileStorePath)
            && Objects.equals(this.appIcon, that.appIcon) && Objects.equals(this.appFileSize, that.appFileSize)
            && Objects.equals(this.appExtendedInfo, that.appExtendedInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appName,
            appCategory,
            osType,
            versionId,
            appDescription,
            versionName,
            appfileStorePath,
            appIcon,
            appFileSize,
            appExtendedInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWarehouseAppReq {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appCategory: ").append(toIndentedString(appCategory)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    appDescription: ").append(toIndentedString(appDescription)).append("\n");
        sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
        sb.append("    appfileStorePath: ").append(toIndentedString(appfileStorePath)).append("\n");
        sb.append("    appIcon: ").append(toIndentedString(appIcon)).append("\n");
        sb.append("    appFileSize: ").append(toIndentedString(appFileSize)).append("\n");
        sb.append("    appExtendedInfo: ").append(toIndentedString(appExtendedInfo)).append("\n");
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
