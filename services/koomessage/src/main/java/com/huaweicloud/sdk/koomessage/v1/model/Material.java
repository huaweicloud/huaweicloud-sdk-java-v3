package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 模板中使用的素材。
 */
public class Material {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

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
    @JsonProperty(value = "obs_file_url")

    private String obsFileUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_rate")

    private String imageRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnail")

    private Thumbnail thumbnail;

    public Material withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 素材ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Material withCreatedAt(String createdAt) {
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

    public Material withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型。 - image：表示图片 - video：表示视频 - thumbnail：表示缩略图 
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public Material withFileName(String fileName) {
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

    public Material withAimResourceId(String aimResourceId) {
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

    public Material withObsObjectKey(String obsObjectKey) {
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

    public Material withObsFileUrl(String obsFileUrl) {
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

    public Material withImageRate(String imageRate) {
        this.imageRate = imageRate;
        return this;
    }

    /**
     * 图像比例。 - oneToOne：指1:1比例 - sixteenToNine：指16:9比例 - threeToOne：指3:1比例 - fortyEightToSixtyFive：指48:65比例 - twentyOneToNine：指21:9比例 
     * @return imageRate
     */
    public String getImageRate() {
        return imageRate;
    }

    public void setImageRate(String imageRate) {
        this.imageRate = imageRate;
    }

    public Material withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 素材详细描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Material withThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public Material withThumbnail(Consumer<Thumbnail> thumbnailSetter) {
        if (this.thumbnail == null) {
            this.thumbnail = new Thumbnail();
            thumbnailSetter.accept(this.thumbnail);
        }

        return this;
    }

    /**
     * Get thumbnail
     * @return thumbnail
     */
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Material that = (Material) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.aimResourceId, that.aimResourceId)
            && Objects.equals(this.obsObjectKey, that.obsObjectKey) && Objects.equals(this.obsFileUrl, that.obsFileUrl)
            && Objects.equals(this.imageRate, that.imageRate) && Objects.equals(this.description, that.description)
            && Objects.equals(this.thumbnail, that.thumbnail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            createdAt,
            resourceType,
            fileName,
            aimResourceId,
            obsObjectKey,
            obsFileUrl,
            imageRate,
            description,
            thumbnail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Material {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    aimResourceId: ").append(toIndentedString(aimResourceId)).append("\n");
        sb.append("    obsObjectKey: ").append(toIndentedString(obsObjectKey)).append("\n");
        sb.append("    obsFileUrl: ").append(toIndentedString(obsFileUrl)).append("\n");
        sb.append("    imageRate: ").append(toIndentedString(imageRate)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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
