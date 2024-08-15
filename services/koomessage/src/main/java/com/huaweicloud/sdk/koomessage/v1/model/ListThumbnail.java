package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 视频封面图列表。
 */
public class ListThumbnail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_primary")

    private Integer isPrimary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aim_resource_id")

    private String aimResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_object_key")

    private String obsObjectKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_rate")

    private String imageRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_gen")

    private Integer isAutoGen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_name")

    private String obsBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_file_url")

    private String obsFileUrl;

    public ListThumbnail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 视频封面图ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListThumbnail withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ListThumbnail withIsPrimary(Integer isPrimary) {
        this.isPrimary = isPrimary;
        return this;
    }

    /**
     * 是否作为视频素材封面。 - 0：否 - 1：是 
     * @return isPrimary
     */
    public Integer getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(Integer isPrimary) {
        this.isPrimary = isPrimary;
    }

    public ListThumbnail withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名称。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ListThumbnail withAimResourceId(String aimResourceId) {
        this.aimResourceId = aimResourceId;
        return this;
    }

    /**
     * 资源ID。
     * @return aimResourceId
     */
    public String getAimResourceId() {
        return aimResourceId;
    }

    public void setAimResourceId(String aimResourceId) {
        this.aimResourceId = aimResourceId;
    }

    public ListThumbnail withObsObjectKey(String obsObjectKey) {
        this.obsObjectKey = obsObjectKey;
        return this;
    }

    /**
     * 从OBS返回的文件Key。
     * @return obsObjectKey
     */
    public String getObsObjectKey() {
        return obsObjectKey;
    }

    public void setObsObjectKey(String obsObjectKey) {
        this.obsObjectKey = obsObjectKey;
    }

    public ListThumbnail withImageRate(String imageRate) {
        this.imageRate = imageRate;
        return this;
    }

    /**
     * 图像比例。 - oneToOne：指1:1比例 - sixteenToNine：指16:9比例 - threeToOne：指3:1比例 - fortyEightToSixtyFive：指48:65比例 - twentyOneToNine：指21:9比例 - threeToFour：指3:4比例 
     * @return imageRate
     */
    public String getImageRate() {
        return imageRate;
    }

    public void setImageRate(String imageRate) {
        this.imageRate = imageRate;
    }

    public ListThumbnail withIsAutoGen(Integer isAutoGen) {
        this.isAutoGen = isAutoGen;
        return this;
    }

    /**
     * 视频封面图是否自动从系统生成。 - 0：系统自动生成 - 1：上传自定义 
     * @return isAutoGen
     */
    public Integer getIsAutoGen() {
        return isAutoGen;
    }

    public void setIsAutoGen(Integer isAutoGen) {
        this.isAutoGen = isAutoGen;
    }

    public ListThumbnail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 视频封面图的详细描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListThumbnail withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * OBS桶名称。
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public ListThumbnail withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListThumbnail withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 素材所占空间大小。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListThumbnail withObsFileUrl(String obsFileUrl) {
        this.obsFileUrl = obsFileUrl;
        return this;
    }

    /**
     * 文件访问路径。
     * @return obsFileUrl
     */
    public String getObsFileUrl() {
        return obsFileUrl;
    }

    public void setObsFileUrl(String obsFileUrl) {
        this.obsFileUrl = obsFileUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListThumbnail that = (ListThumbnail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.isPrimary, that.isPrimary) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.aimResourceId, that.aimResourceId)
            && Objects.equals(this.obsObjectKey, that.obsObjectKey) && Objects.equals(this.imageRate, that.imageRate)
            && Objects.equals(this.isAutoGen, that.isAutoGen) && Objects.equals(this.description, that.description)
            && Objects.equals(this.obsBucketName, that.obsBucketName) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.size, that.size) && Objects.equals(this.obsFileUrl, that.obsFileUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            createdAt,
            isPrimary,
            fileName,
            aimResourceId,
            obsObjectKey,
            imageRate,
            isAutoGen,
            description,
            obsBucketName,
            domainId,
            size,
            obsFileUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListThumbnail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    aimResourceId: ").append(toIndentedString(aimResourceId)).append("\n");
        sb.append("    obsObjectKey: ").append(toIndentedString(obsObjectKey)).append("\n");
        sb.append("    imageRate: ").append(toIndentedString(imageRate)).append("\n");
        sb.append("    isAutoGen: ").append(toIndentedString(isAutoGen)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    obsFileUrl: ").append(toIndentedString(obsFileUrl)).append("\n");
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
