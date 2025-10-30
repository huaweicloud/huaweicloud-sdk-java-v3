package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 镜像构建指令影响的镜像信息
 */
public class BuildCommandRisksImageResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_digest")

    private String imageDigest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_size")

    private Long imageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_scan_time")

    private Long latestScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_detail_info")

    private BuildCommandRiskDetailListResponseInfo riskDetailInfo;

    public BuildCommandRisksImageResponseInfo withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**: 组织名称 **取值范围**: 字符长度0-64 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public BuildCommandRisksImageResponseInfo withImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }

    /**
     * **参数解释**: 镜像digest **取值范围**: 字符长度0-128 
     * @return imageDigest
     */
    public String getImageDigest() {
        return imageDigest;
    }

    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    public BuildCommandRisksImageResponseInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**: 镜像id **取值范围**: 字符长度0-128 
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public BuildCommandRisksImageResponseInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**: 镜像名称 **取值范围**: 字符长度0-128 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public BuildCommandRisksImageResponseInfo withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * **参数解释**: 镜像版本 **取值范围**: 字符长度0-128 
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public BuildCommandRisksImageResponseInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * **参数解释**: 镜像类型  **取值范围**:   - private_image：私有镜像   - shared_image：共享镜像   - instance_image：企业镜像   - harbor：Harbor镜像   - jfrog：Jfrog镜像   - cicd：cicd镜像
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public BuildCommandRisksImageResponseInfo withImageSize(Long imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    /**
     * **参数解释**: 版本大小 **取值范围**: 大小0-9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return imageSize
     */
    public Long getImageSize() {
        return imageSize;
    }

    public void setImageSize(Long imageSize) {
        this.imageSize = imageSize;
    }

    public BuildCommandRisksImageResponseInfo withLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
        return this;
    }

    /**
     * **参数解释**: 最后一次检测时间，时间单位 毫秒（ms） **取值范围**: 大小0-9223372036854775807 
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

    public BuildCommandRisksImageResponseInfo withRiskDetailInfo(
        BuildCommandRiskDetailListResponseInfo riskDetailInfo) {
        this.riskDetailInfo = riskDetailInfo;
        return this;
    }

    public BuildCommandRisksImageResponseInfo withRiskDetailInfo(
        Consumer<BuildCommandRiskDetailListResponseInfo> riskDetailInfoSetter) {
        if (this.riskDetailInfo == null) {
            this.riskDetailInfo = new BuildCommandRiskDetailListResponseInfo();
            riskDetailInfoSetter.accept(this.riskDetailInfo);
        }

        return this;
    }

    /**
     * Get riskDetailInfo
     * @return riskDetailInfo
     */
    public BuildCommandRiskDetailListResponseInfo getRiskDetailInfo() {
        return riskDetailInfo;
    }

    public void setRiskDetailInfo(BuildCommandRiskDetailListResponseInfo riskDetailInfo) {
        this.riskDetailInfo = riskDetailInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BuildCommandRisksImageResponseInfo that = (BuildCommandRisksImageResponseInfo) obj;
        return Objects.equals(this.namespace, that.namespace) && Objects.equals(this.imageDigest, that.imageDigest)
            && Objects.equals(this.imageId, that.imageId) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.imageVersion, that.imageVersion) && Objects.equals(this.imageType, that.imageType)
            && Objects.equals(this.imageSize, that.imageSize)
            && Objects.equals(this.latestScanTime, that.latestScanTime)
            && Objects.equals(this.riskDetailInfo, that.riskDetailInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace,
            imageDigest,
            imageId,
            imageName,
            imageVersion,
            imageType,
            imageSize,
            latestScanTime,
            riskDetailInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuildCommandRisksImageResponseInfo {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    imageDigest: ").append(toIndentedString(imageDigest)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
        sb.append("    latestScanTime: ").append(toIndentedString(latestScanTime)).append("\n");
        sb.append("    riskDetailInfo: ").append(toIndentedString(riskDetailInfo)).append("\n");
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
