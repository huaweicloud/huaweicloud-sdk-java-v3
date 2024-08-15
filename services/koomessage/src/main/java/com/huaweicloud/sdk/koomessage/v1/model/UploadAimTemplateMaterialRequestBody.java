package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UploadAimTemplateMaterialRequestBody
 */
public class UploadAimTemplateMaterialRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "material_id")

    private String materialId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_url")

    private String fileUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_stream")

    private String fileStream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_rate")

    private String imageRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UploadAimTemplateMaterialRequestBody withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型。  - image：图片 - video：视频 - thumbnail：缩略图  > 图片支持png、jpeg、jpg格式，最大2M; > 视频支持格式mp4，大小不超过7M，建议时长不超过33S; > 缩略图支持png、jpeg、jpg格式，大小不超过100K。 
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public UploadAimTemplateMaterialRequestBody withMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }

    /**
     * 素材ID。 > resource_type=thumbnail时，material_id必填，填写内容为上传视频资源返回的material_id字段的值。 
     * @return materialId
     */
    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public UploadAimTemplateMaterialRequestBody withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * 文件类型。 - url：资源为URL链接地址 - stream：资源为多媒体资源文件流的BASE64编码，需要带资源类型前缀，样例：\"data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/4gIoSUNDX1BST0ZJTEUAAQEAAAIYAAAAAAQwAABtbnRyUkdCIFhZWiAAAAAAAAAAAAAAAABhY3NwAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAQAA9tYAAQAAAADTLQ...\"，样例过长，未显示全部 
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public UploadAimTemplateMaterialRequestBody withFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }

    /**
     * 文件URL。  > file_type=url时，file_url为必填。URL地址必须包含文件格式的后缀，例如：jpg、jpeg，大小写后缀都支持。 
     * @return fileUrl
     */
    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public UploadAimTemplateMaterialRequestBody withFileStream(String fileStream) {
        this.fileStream = fileStream;
        return this;
    }

    /**
     * 文件资源码流。  > file_type=stream时，file_stream为必填。 
     * @return fileStream
     */
    public String getFileStream() {
        return fileStream;
    }

    public void setFileStream(String fileStream) {
        this.fileStream = fileStream;
    }

    public UploadAimTemplateMaterialRequestBody withImageRate(String imageRate) {
        this.imageRate = imageRate;
        return this;
    }

    /**
     * 图像比例。 - oneToOne：指1:1比例 - sixteenToNine：指16:9比例 - threeToOne：指3:1比例 - fortyEightToSixtyFive：指48:65比例 - twentyOneToNine：指21:9比例 - threeToFour：指3:4比例  > resource type=image时，image_rate必填。 
     * @return imageRate
     */
    public String getImageRate() {
        return imageRate;
    }

    public void setImageRate(String imageRate) {
        this.imageRate = imageRate;
    }

    public UploadAimTemplateMaterialRequestBody withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名称。  > file_type=stream时，file_name必填。 
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public UploadAimTemplateMaterialRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
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
        UploadAimTemplateMaterialRequestBody that = (UploadAimTemplateMaterialRequestBody) obj;
        return Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.materialId, that.materialId)
            && Objects.equals(this.fileType, that.fileType) && Objects.equals(this.fileUrl, that.fileUrl)
            && Objects.equals(this.fileStream, that.fileStream) && Objects.equals(this.imageRate, that.imageRate)
            && Objects.equals(this.fileName, that.fileName) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, materialId, fileType, fileUrl, fileStream, imageRate, fileName, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadAimTemplateMaterialRequestBody {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
        sb.append("    fileStream: ").append(toIndentedString(fileStream)).append("\n");
        sb.append("    imageRate: ").append(toIndentedString(imageRate)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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
