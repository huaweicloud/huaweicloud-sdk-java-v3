package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * repository info
 */
public class PrivateImageRepositoryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_digest")

    private String imageDigest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_version")

    private Boolean latestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_status")

    private String scanStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_size")

    private Long imageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_update_time")

    private Long latestUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_scan_time")

    private Long latestScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_num")

    private Integer vulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unsafe_setting_num")

    private Integer unsafeSettingNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malicious_file_num")

    private Integer maliciousFileNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_status")

    private String sharedStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scannable")

    private Boolean scannable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "association_images")

    private List<AssociateImages> associationImages = null;

    public PrivateImageRepositoryInfo withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * minimum: 0
     * maximum: 2147483547
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PrivateImageRepositoryInfo withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public PrivateImageRepositoryInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 镜像名称
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public PrivateImageRepositoryInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像id
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public PrivateImageRepositoryInfo withImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }

    /**
     * 镜像digest
     * @return imageDigest
     */
    public String getImageDigest() {
        return imageDigest;
    }

    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    public PrivateImageRepositoryInfo withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * 镜像版本
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public PrivateImageRepositoryInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 镜像类型，包含如下2种。   - private_image ：私有镜像。   - shared_image ：共享镜像。
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public PrivateImageRepositoryInfo withLatestVersion(Boolean latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * 是否是最新版本
     * @return latestVersion
     */
    public Boolean getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(Boolean latestVersion) {
        this.latestVersion = latestVersion;
    }

    public PrivateImageRepositoryInfo withScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * 扫描状态，包含如下2种。   - unscan ：未扫描。   - success ：扫描完成。   - scanning ：正在扫描。   - failed ：扫描失败。   - download_failed ：下载失败。   - image_oversized ：镜像超大。   - waiting_for_scan ：等待扫描。
     * @return scanStatus
     */
    public String getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
    }

    public PrivateImageRepositoryInfo withImageSize(Long imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    /**
     * 镜像大小
     * minimum: 0
     * maximum: 2147483547
     * @return imageSize
     */
    public Long getImageSize() {
        return imageSize;
    }

    public void setImageSize(Long imageSize) {
        this.imageSize = imageSize;
    }

    public PrivateImageRepositoryInfo withLatestUpdateTime(Long latestUpdateTime) {
        this.latestUpdateTime = latestUpdateTime;
        return this;
    }

    /**
     * 镜像版本最后更新时间
     * minimum: 0
     * maximum: 2147483547
     * @return latestUpdateTime
     */
    public Long getLatestUpdateTime() {
        return latestUpdateTime;
    }

    public void setLatestUpdateTime(Long latestUpdateTime) {
        this.latestUpdateTime = latestUpdateTime;
    }

    public PrivateImageRepositoryInfo withLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
        return this;
    }

    /**
     * 最近扫描时间
     * minimum: 0
     * maximum: 2147483547
     * @return latestScanTime
     */
    public Long getLatestScanTime() {
        return latestScanTime;
    }

    public void setLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
    }

    public PrivateImageRepositoryInfo withVulNum(Integer vulNum) {
        this.vulNum = vulNum;
        return this;
    }

    /**
     * 漏洞个数
     * minimum: 0
     * maximum: 2147483647
     * @return vulNum
     */
    public Integer getVulNum() {
        return vulNum;
    }

    public void setVulNum(Integer vulNum) {
        this.vulNum = vulNum;
    }

    public PrivateImageRepositoryInfo withUnsafeSettingNum(Integer unsafeSettingNum) {
        this.unsafeSettingNum = unsafeSettingNum;
        return this;
    }

    /**
     * 基线扫描未通过数
     * minimum: 0
     * maximum: 2147483647
     * @return unsafeSettingNum
     */
    public Integer getUnsafeSettingNum() {
        return unsafeSettingNum;
    }

    public void setUnsafeSettingNum(Integer unsafeSettingNum) {
        this.unsafeSettingNum = unsafeSettingNum;
    }

    public PrivateImageRepositoryInfo withMaliciousFileNum(Integer maliciousFileNum) {
        this.maliciousFileNum = maliciousFileNum;
        return this;
    }

    /**
     * 恶意文件数
     * minimum: 0
     * maximum: 2147483647
     * @return maliciousFileNum
     */
    public Integer getMaliciousFileNum() {
        return maliciousFileNum;
    }

    public void setMaliciousFileNum(Integer maliciousFileNum) {
        this.maliciousFileNum = maliciousFileNum;
    }

    public PrivateImageRepositoryInfo withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 拥有者（共享镜像参数）
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public PrivateImageRepositoryInfo withSharedStatus(String sharedStatus) {
        this.sharedStatus = sharedStatus;
        return this;
    }

    /**
     * 共享镜像状态，包含如下2种。   - expired ：已过期。   - effective ：有效。
     * @return sharedStatus
     */
    public String getSharedStatus() {
        return sharedStatus;
    }

    public void setSharedStatus(String sharedStatus) {
        this.sharedStatus = sharedStatus;
    }

    public PrivateImageRepositoryInfo withScannable(Boolean scannable) {
        this.scannable = scannable;
        return this;
    }

    /**
     * 是否可扫描
     * @return scannable
     */
    public Boolean getScannable() {
        return scannable;
    }

    public void setScannable(Boolean scannable) {
        this.scannable = scannable;
    }

    public PrivateImageRepositoryInfo withAssociationImages(List<AssociateImages> associationImages) {
        this.associationImages = associationImages;
        return this;
    }

    public PrivateImageRepositoryInfo addAssociationImagesItem(AssociateImages associationImagesItem) {
        if (this.associationImages == null) {
            this.associationImages = new ArrayList<>();
        }
        this.associationImages.add(associationImagesItem);
        return this;
    }

    public PrivateImageRepositoryInfo withAssociationImages(Consumer<List<AssociateImages>> associationImagesSetter) {
        if (this.associationImages == null) {
            this.associationImages = new ArrayList<>();
        }
        associationImagesSetter.accept(this.associationImages);
        return this;
    }

    /**
     * 多架构关联镜像信息
     * @return associationImages
     */
    public List<AssociateImages> getAssociationImages() {
        return associationImages;
    }

    public void setAssociationImages(List<AssociateImages> associationImages) {
        this.associationImages = associationImages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateImageRepositoryInfo that = (PrivateImageRepositoryInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.imageDigest, that.imageDigest)
            && Objects.equals(this.imageVersion, that.imageVersion) && Objects.equals(this.imageType, that.imageType)
            && Objects.equals(this.latestVersion, that.latestVersion)
            && Objects.equals(this.scanStatus, that.scanStatus) && Objects.equals(this.imageSize, that.imageSize)
            && Objects.equals(this.latestUpdateTime, that.latestUpdateTime)
            && Objects.equals(this.latestScanTime, that.latestScanTime) && Objects.equals(this.vulNum, that.vulNum)
            && Objects.equals(this.unsafeSettingNum, that.unsafeSettingNum)
            && Objects.equals(this.maliciousFileNum, that.maliciousFileNum)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.sharedStatus, that.sharedStatus)
            && Objects.equals(this.scannable, that.scannable)
            && Objects.equals(this.associationImages, that.associationImages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            namespace,
            imageName,
            imageId,
            imageDigest,
            imageVersion,
            imageType,
            latestVersion,
            scanStatus,
            imageSize,
            latestUpdateTime,
            latestScanTime,
            vulNum,
            unsafeSettingNum,
            maliciousFileNum,
            domainName,
            sharedStatus,
            scannable,
            associationImages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateImageRepositoryInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageDigest: ").append(toIndentedString(imageDigest)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
        sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
        sb.append("    latestUpdateTime: ").append(toIndentedString(latestUpdateTime)).append("\n");
        sb.append("    latestScanTime: ").append(toIndentedString(latestScanTime)).append("\n");
        sb.append("    vulNum: ").append(toIndentedString(vulNum)).append("\n");
        sb.append("    unsafeSettingNum: ").append(toIndentedString(unsafeSettingNum)).append("\n");
        sb.append("    maliciousFileNum: ").append(toIndentedString(maliciousFileNum)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    sharedStatus: ").append(toIndentedString(sharedStatus)).append("\n");
        sb.append("    scannable: ").append(toIndentedString(scannable)).append("\n");
        sb.append("    associationImages: ").append(toIndentedString(associationImages)).append("\n");
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
