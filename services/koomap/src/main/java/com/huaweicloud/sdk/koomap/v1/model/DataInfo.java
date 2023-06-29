package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 卫星影像数据信息。
 */
public class DataInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_product")

    private String isProduct;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_level")

    private String imageLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_producer")

    private String imageProducer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_status")

    private String imageStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_date")

    private String imageDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_date")

    private String uploadDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_resolution")

    private String imageResolution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_description")

    private String imageDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_alias")

    private String imageAlias;

    public DataInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 卫星影像名称。 支持模糊查询，格式为中英文、数字、下划线、中划线、“.”，长度100个字符以内。
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public DataInfo withIsProduct(String isProduct) {
        this.isProduct = isProduct;
        return this;
    }

    /**
     * 卫星影像是否为成果影像。 目前只支持原始影像（0）、成果影像（1）。
     * @return isProduct
     */
    public String getIsProduct() {
        return isProduct;
    }

    public void setIsProduct(String isProduct) {
        this.isProduct = isProduct;
    }

    public DataInfo withImageLevel(String imageLevel) {
        this.imageLevel = imageLevel;
        return this;
    }

    /**
     * 卫星影像等级。 目前只支持L1、L1A、L1B、L2、L3、L4、L5、clip（矢量切割）、tile（金字塔切割）。
     * @return imageLevel
     */
    public String getImageLevel() {
        return imageLevel;
    }

    public void setImageLevel(String imageLevel) {
        this.imageLevel = imageLevel;
    }

    public DataInfo withImageProducer(String imageProducer) {
        this.imageProducer = imageProducer;
        return this;
    }

    /**
     * 卫星影像厂商 。 目前只支持21世纪、资源卫星中心、长光卫星、四维绘测、其他。
     * @return imageProducer
     */
    public String getImageProducer() {
        return imageProducer;
    }

    public void setImageProducer(String imageProducer) {
        this.imageProducer = imageProducer;
    }

    public DataInfo withImageStatus(String imageStatus) {
        this.imageStatus = imageStatus;
        return this;
    }

    /**
     * 卫星影像迁移状态。 当前仅支持完成（0）、迁入中（1）、迁入失败（2）、迁出中（3）、迁出失败（4）。
     * @return imageStatus
     */
    public String getImageStatus() {
        return imageStatus;
    }

    public void setImageStatus(String imageStatus) {
        this.imageStatus = imageStatus;
    }

    public DataInfo withImageDate(String imageDate) {
        this.imageDate = imageDate;
        return this;
    }

    /**
     * 卫星影像成像时间。 格式为UTC标准时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return imageDate
     */
    public String getImageDate() {
        return imageDate;
    }

    public void setImageDate(String imageDate) {
        this.imageDate = imageDate;
    }

    public DataInfo withUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
        return this;
    }

    /**
     * 卫星影像上传时间。 格式为UTC标准时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return uploadDate
     */
    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public DataInfo withImageResolution(String imageResolution) {
        this.imageResolution = imageResolution;
        return this;
    }

    /**
     * 卫星影像分辨率，精确到小数点后一位。
     * @return imageResolution
     */
    public String getImageResolution() {
        return imageResolution;
    }

    public void setImageResolution(String imageResolution) {
        this.imageResolution = imageResolution;
    }

    public DataInfo withImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
        return this;
    }

    /**
     * 卫星影像描述。 格式为中英文、数字、下划线、中划线，长度255个字符以内。
     * @return imageDescription
     */
    public String getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

    public DataInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 卫星影像ID。 格式为英文、数字，长度为32。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public DataInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 卫星影像类型。当前仅支持全色（0）、多光谱（1）。
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public DataInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * IAM用户名称。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public DataInfo withImageAlias(String imageAlias) {
        this.imageAlias = imageAlias;
        return this;
    }

    /**
     * 卫星影像别名。 格式为中英文、数字、下划线、中划线、“.”，长度255个字符以内。
     * @return imageAlias
     */
    public String getImageAlias() {
        return imageAlias;
    }

    public void setImageAlias(String imageAlias) {
        this.imageAlias = imageAlias;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataInfo that = (DataInfo) obj;
        return Objects.equals(this.imageName, that.imageName) && Objects.equals(this.isProduct, that.isProduct)
            && Objects.equals(this.imageLevel, that.imageLevel)
            && Objects.equals(this.imageProducer, that.imageProducer)
            && Objects.equals(this.imageStatus, that.imageStatus) && Objects.equals(this.imageDate, that.imageDate)
            && Objects.equals(this.uploadDate, that.uploadDate)
            && Objects.equals(this.imageResolution, that.imageResolution)
            && Objects.equals(this.imageDescription, that.imageDescription)
            && Objects.equals(this.imageId, that.imageId) && Objects.equals(this.imageType, that.imageType)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.imageAlias, that.imageAlias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageName,
            isProduct,
            imageLevel,
            imageProducer,
            imageStatus,
            imageDate,
            uploadDate,
            imageResolution,
            imageDescription,
            imageId,
            imageType,
            userName,
            imageAlias);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataInfo {\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    isProduct: ").append(toIndentedString(isProduct)).append("\n");
        sb.append("    imageLevel: ").append(toIndentedString(imageLevel)).append("\n");
        sb.append("    imageProducer: ").append(toIndentedString(imageProducer)).append("\n");
        sb.append("    imageStatus: ").append(toIndentedString(imageStatus)).append("\n");
        sb.append("    imageDate: ").append(toIndentedString(imageDate)).append("\n");
        sb.append("    uploadDate: ").append(toIndentedString(uploadDate)).append("\n");
        sb.append("    imageResolution: ").append(toIndentedString(imageResolution)).append("\n");
        sb.append("    imageDescription: ").append(toIndentedString(imageDescription)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    imageAlias: ").append(toIndentedString(imageAlias)).append("\n");
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
