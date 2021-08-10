package com.huaweicloud.sdk.frs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** FaceSetFace */
public class FaceSetFace {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bounding_box")

    private BoundingBox boundingBox;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_fields")

    private Object externalFields;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_image_id")

    private String externalImageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_id")

    private String faceId;

    public FaceSetFace withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public FaceSetFace withBoundingBox(Consumer<BoundingBox> boundingBoxSetter) {
        if (this.boundingBox == null) {
            this.boundingBox = new BoundingBox();
            boundingBoxSetter.accept(this.boundingBox);
        }

        return this;
    }

    /** Get boundingBox
     * 
     * @return boundingBox */
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    public FaceSetFace withExternalFields(Object externalFields) {
        this.externalFields = externalFields;
        return this;
    }

    /** 用户添加的额外字段。
     * 
     * @return externalFields */
    public Object getExternalFields() {
        return externalFields;
    }

    public void setExternalFields(Object externalFields) {
        this.externalFields = externalFields;
    }

    public FaceSetFace withExternalImageId(String externalImageId) {
        this.externalImageId = externalImageId;
        return this;
    }

    /** 人脸所在的外部图片ID。
     * 
     * @return externalImageId */
    public String getExternalImageId() {
        return externalImageId;
    }

    public void setExternalImageId(String externalImageId) {
        this.externalImageId = externalImageId;
    }

    public FaceSetFace withFaceId(String faceId) {
        this.faceId = faceId;
        return this;
    }

    /** 人脸ID，由系统内部生成的唯一ID。
     * 
     * @return faceId */
    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FaceSetFace faceSetFace = (FaceSetFace) o;
        return Objects.equals(this.boundingBox, faceSetFace.boundingBox)
            && Objects.equals(this.externalFields, faceSetFace.externalFields)
            && Objects.equals(this.externalImageId, faceSetFace.externalImageId)
            && Objects.equals(this.faceId, faceSetFace.faceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boundingBox, externalFields, externalImageId, faceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FaceSetFace {\n");
        sb.append("    boundingBox: ").append(toIndentedString(boundingBox)).append("\n");
        sb.append("    externalFields: ").append(toIndentedString(externalFields)).append("\n");
        sb.append("    externalImageId: ").append(toIndentedString(externalImageId)).append("\n");
        sb.append("    faceId: ").append(toIndentedString(faceId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
