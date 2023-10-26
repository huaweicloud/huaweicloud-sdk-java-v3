package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSwrImageRepositoryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

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
    @JsonProperty(value = "latest_version")

    private Boolean latestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_status")

    private String scanStatus;

    public ListSwrImageRepositoryRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * region id
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ListSwrImageRepositoryRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 租户企业项目ID，查询所有企业项目时填写：all_granted_eps
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListSwrImageRepositoryRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 组织名称
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListSwrImageRepositoryRequest withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 镜像名称 id
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ListSwrImageRepositoryRequest withImageVersion(String imageVersion) {
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

    public ListSwrImageRepositoryRequest withLatestVersion(Boolean latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * 仅关注最新版本镜像
     * @return latestVersion
     */
    public Boolean getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(Boolean latestVersion) {
        this.latestVersion = latestVersion;
    }

    public ListSwrImageRepositoryRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量：指定返回记录的开始位置，必须为数字，取值范围为大于或等于0，默认0
     * minimum: 0
     * maximum: 2000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSwrImageRepositoryRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示个数
     * minimum: 10
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSwrImageRepositoryRequest withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 镜像类型，包含如下:   - private_image : 私有镜像仓库   - shared_image : 共享镜像仓库
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public ListSwrImageRepositoryRequest withScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * 扫描状态，包含如下:   - unscan : 未扫描   - success : 扫描完成   - scanning : 扫描中   - failed : 扫描失败   - download_failed : 下载失败   - image_oversized : 镜像超大
     * @return scanStatus
     */
    public String getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSwrImageRepositoryRequest that = (ListSwrImageRepositoryRequest) obj;
        return Objects.equals(this.region, that.region)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.imageVersion, that.imageVersion)
            && Objects.equals(this.latestVersion, that.latestVersion) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.imageType, that.imageType)
            && Objects.equals(this.scanStatus, that.scanStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region,
            enterpriseProjectId,
            namespace,
            imageName,
            imageVersion,
            latestVersion,
            offset,
            limit,
            imageType,
            scanStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSwrImageRepositoryRequest {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
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
