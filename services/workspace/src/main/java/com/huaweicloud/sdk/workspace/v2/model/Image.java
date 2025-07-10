package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 镜像信息。
 */
public class Image {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_disk")

    private Integer minDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_size")

    private String imageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_code")

    private String productCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_ram")

    private String maxRam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "market_resource_type_code")

    private String marketResourceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_ram")

    private Integer minRam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_bit")

    private String osBit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "market_service_type_code")

    private String marketServiceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public Image withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像id。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public Image withMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
        return this;
    }

    /**
     * 镜像运行需要的最小磁盘容量，单位为GB。取值为40～1024GB。
     * @return minDisk
     */
    public Integer getMinDisk() {
        return minDisk;
    }

    public void setMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
    }

    public Image withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间，格式为UTC时间，yyyy-MM-ddTHH:mm:ssZ。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Image withImageSize(String imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    /**
     * 镜像文件的大小，单位为字节。
     * @return imageSize
     */
    public String getImageSize() {
        return imageSize;
    }

    public void setImageSize(String imageSize) {
        this.imageSize = imageSize;
    }

    public Image withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间，格式为UTC时间，yyyy-MM-ddTHH:mm:ssZ。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Image withProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    /**
     * 市场镜像的产品ID。
     * @return productCode
     */
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Image withMaxRam(String maxRam) {
        this.maxRam = maxRam;
        return this;
    }

    /**
     * 镜像支持的最大内存，单位为MB。取值可以参考云服务器规格限制，一般不设置。
     * @return maxRam
     */
    public String getMaxRam() {
        return maxRam;
    }

    public void setMaxRam(String maxRam) {
        this.maxRam = maxRam;
    }

    public Image withMarketResourceTypeCode(String marketResourceTypeCode) {
        this.marketResourceTypeCode = marketResourceTypeCode;
        return this;
    }

    /**
     * 云市场资源类型编码。
     * @return marketResourceTypeCode
     */
    public String getMarketResourceTypeCode() {
        return marketResourceTypeCode;
    }

    public void setMarketResourceTypeCode(String marketResourceTypeCode) {
        this.marketResourceTypeCode = marketResourceTypeCode;
    }

    public Image withMinRam(Integer minRam) {
        this.minRam = minRam;
        return this;
    }

    /**
     * 镜像运行需要的最小内存，单位为MB。参数取值依据弹性云服务器的规格限制，默认设置为0。
     * @return minRam
     */
    public Integer getMinRam() {
        return minRam;
    }

    public void setMinRam(Integer minRam) {
        this.minRam = minRam;
    }

    public Image withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型，目前取值Linux， Windows，Other。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public Image withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 镜像类型，目前支持以下类型： 公共镜像：gold 私有镜像：private 共享镜像：shared。
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public Image withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public Image addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public Image withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 镜像标签列表。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Image withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * 镜像平台分类。
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Image withOsBit(String osBit) {
        this.osBit = osBit;
        return this;
    }

    /**
     * 操作系统位数，一般取值为“32”或者“64”。
     * @return osBit
     */
    public String getOsBit() {
        return osBit;
    }

    public void setOsBit(String osBit) {
        this.osBit = osBit;
    }

    public Image withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * 操作系统具体版本。
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public Image withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 镜像名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image withMarketServiceTypeCode(String marketServiceTypeCode) {
        this.marketServiceTypeCode = marketServiceTypeCode;
        return this;
    }

    /**
     * 云市场服务类型编码。
     * @return marketServiceTypeCode
     */
    public String getMarketServiceTypeCode() {
        return marketServiceTypeCode;
    }

    public void setMarketServiceTypeCode(String marketServiceTypeCode) {
        this.marketServiceTypeCode = marketServiceTypeCode;
    }

    public Image withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 镜像状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Image that = (Image) obj;
        return Objects.equals(this.imageId, that.imageId) && Objects.equals(this.minDisk, that.minDisk)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.imageSize, that.imageSize)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.productCode, that.productCode)
            && Objects.equals(this.maxRam, that.maxRam)
            && Objects.equals(this.marketResourceTypeCode, that.marketResourceTypeCode)
            && Objects.equals(this.minRam, that.minRam) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.imageType, that.imageType) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.platform, that.platform) && Objects.equals(this.osBit, that.osBit)
            && Objects.equals(this.osVersion, that.osVersion) && Objects.equals(this.name, that.name)
            && Objects.equals(this.marketServiceTypeCode, that.marketServiceTypeCode)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId,
            minDisk,
            createdAt,
            imageSize,
            updatedAt,
            productCode,
            maxRam,
            marketResourceTypeCode,
            minRam,
            osType,
            imageType,
            tags,
            platform,
            osBit,
            osVersion,
            name,
            marketServiceTypeCode,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Image {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    minDisk: ").append(toIndentedString(minDisk)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
        sb.append("    maxRam: ").append(toIndentedString(maxRam)).append("\n");
        sb.append("    marketResourceTypeCode: ").append(toIndentedString(marketResourceTypeCode)).append("\n");
        sb.append("    minRam: ").append(toIndentedString(minRam)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    osBit: ").append(toIndentedString(osBit)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    marketServiceTypeCode: ").append(toIndentedString(marketServiceTypeCode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
