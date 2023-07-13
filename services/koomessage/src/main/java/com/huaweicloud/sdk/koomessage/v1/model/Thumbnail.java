package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 缩略图。
 */
public class Thumbnail {

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
    @JsonProperty(value = "image_rate")

    private String imageRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_gen")

    private Integer isAutoGen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public Thumbnail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 缩略图ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Thumbnail withCreatedAt(String createdAt) {
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

    public Thumbnail withIsPrimary(Integer isPrimary) {
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

    public Thumbnail withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型，image：表示图片。 
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public Thumbnail withFileName(String fileName) {
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

    public Thumbnail withAimResourceId(String aimResourceId) {
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

    public Thumbnail withObsObjectKey(String obsObjectKey) {
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

    public Thumbnail withImageRate(String imageRate) {
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

    public Thumbnail withIsAutoGen(Integer isAutoGen) {
        this.isAutoGen = isAutoGen;
        return this;
    }

    /**
     * 缩略图是否自动从系统生成。
     * @return isAutoGen
     */
    public Integer getIsAutoGen() {
        return isAutoGen;
    }

    public void setIsAutoGen(Integer isAutoGen) {
        this.isAutoGen = isAutoGen;
    }

    public Thumbnail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 缩略图的详细描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Thumbnail that = (Thumbnail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.isPrimary, that.isPrimary) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.fileName, that.fileName) && Objects.equals(this.aimResourceId, that.aimResourceId)
            && Objects.equals(this.obsObjectKey, that.obsObjectKey) && Objects.equals(this.imageRate, that.imageRate)
            && Objects.equals(this.isAutoGen, that.isAutoGen) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            createdAt,
            isPrimary,
            resourceType,
            fileName,
            aimResourceId,
            obsObjectKey,
            imageRate,
            isAutoGen,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Thumbnail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    aimResourceId: ").append(toIndentedString(aimResourceId)).append("\n");
        sb.append("    obsObjectKey: ").append(toIndentedString(obsObjectKey)).append("\n");
        sb.append("    imageRate: ").append(toIndentedString(imageRate)).append("\n");
        sb.append("    isAutoGen: ").append(toIndentedString(isAutoGen)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
