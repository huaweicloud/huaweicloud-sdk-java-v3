package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 软件信息
 */
public class ImageAppResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private String appType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_version")

    private String appVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_num")

    private Integer vulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_path")

    private String appPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layer_digest")

    private String layerDigest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_compliant")

    private Boolean isCompliant;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_scan_time")

    private Long latestScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    public ImageAppResponseInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * **参数解释**: 软件名称 **取值范围**: 字符长度0-128位 
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ImageAppResponseInfo withAppType(String appType) {
        this.appType = appType;
        return this;
    }

    /**
     * **参数解释**: 软件类型 **取值范围**: 字符长度0-128位 
     * @return appType
     */
    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public ImageAppResponseInfo withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * **参数解释**: 软件版本 **取值范围**: 字符长度0-128位 
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public ImageAppResponseInfo withVulNum(Integer vulNum) {
        this.vulNum = vulNum;
        return this;
    }

    /**
     * **参数解释**: 漏洞总数 **取值范围**: 最小值0，最大值20000 
     * minimum: 0
     * maximum: 20000
     * @return vulNum
     */
    public Integer getVulNum() {
        return vulNum;
    }

    public void setVulNum(Integer vulNum) {
        this.vulNum = vulNum;
    }

    public ImageAppResponseInfo withAppPath(String appPath) {
        this.appPath = appPath;
        return this;
    }

    /**
     * **参数解释**: 软件路径 **取值范围**: 字符长度0-128位 
     * @return appPath
     */
    public String getAppPath() {
        return appPath;
    }

    public void setAppPath(String appPath) {
        this.appPath = appPath;
    }

    public ImageAppResponseInfo withLayerDigest(String layerDigest) {
        this.layerDigest = layerDigest;
        return this;
    }

    /**
     * **参数解释**: 层digest **取值范围**: 字符长度0-128位 
     * @return layerDigest
     */
    public String getLayerDigest() {
        return layerDigest;
    }

    public void setLayerDigest(String layerDigest) {
        this.layerDigest = layerDigest;
    }

    public ImageAppResponseInfo withIsCompliant(Boolean isCompliant) {
        this.isCompliant = isCompliant;
        return this;
    }

    /**
     * **参数解释**: 是否合规，false为不合规 **取值范围**: - true：是。 - false：否。 
     * @return isCompliant
     */
    public Boolean getIsCompliant() {
        return isCompliant;
    }

    public void setIsCompliant(Boolean isCompliant) {
        this.isCompliant = isCompliant;
    }

    public ImageAppResponseInfo withLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
        return this;
    }

    /**
     * **参数解释**: 最后一次检测时间，时间单位 毫秒（ms） **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return latestScanTime
     */
    public Long getLatestScanTime() {
        return latestScanTime;
    }

    public void setLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
    }

    public ImageAppResponseInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * **参数解释**: 仓库镜像类型，包含如下: **取值范围**: - SwrPrivate : swr私有镜像。 - SwrShared : swr共享。 - SwrEnterprise : swr企业。 - Harbor : harbor仓库。 - Jfrog : jfrog仓库。 - Other : 其他仓库。 
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public ImageAppResponseInfo withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**: 组织名称 **取值范围**: 字符长度0-65535位 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ImageAppResponseInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**: 镜像名称 **取值范围**: 字符长度0-65535位 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ImageAppResponseInfo withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * **参数解释**: 镜像版本名称 **取值范围**: 字符长度0-65535位 
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public ImageAppResponseInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**: 镜像id **取值范围**: 字符长度0-65535位 
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageAppResponseInfo that = (ImageAppResponseInfo) obj;
        return Objects.equals(this.appName, that.appName) && Objects.equals(this.appType, that.appType)
            && Objects.equals(this.appVersion, that.appVersion) && Objects.equals(this.vulNum, that.vulNum)
            && Objects.equals(this.appPath, that.appPath) && Objects.equals(this.layerDigest, that.layerDigest)
            && Objects.equals(this.isCompliant, that.isCompliant)
            && Objects.equals(this.latestScanTime, that.latestScanTime)
            && Objects.equals(this.imageType, that.imageType) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.imageVersion, that.imageVersion)
            && Objects.equals(this.imageId, that.imageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appName,
            appType,
            appVersion,
            vulNum,
            appPath,
            layerDigest,
            isCompliant,
            latestScanTime,
            imageType,
            namespace,
            imageName,
            imageVersion,
            imageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageAppResponseInfo {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    vulNum: ").append(toIndentedString(vulNum)).append("\n");
        sb.append("    appPath: ").append(toIndentedString(appPath)).append("\n");
        sb.append("    layerDigest: ").append(toIndentedString(layerDigest)).append("\n");
        sb.append("    isCompliant: ").append(toIndentedString(isCompliant)).append("\n");
        sb.append("    latestScanTime: ").append(toIndentedString(latestScanTime)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
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
