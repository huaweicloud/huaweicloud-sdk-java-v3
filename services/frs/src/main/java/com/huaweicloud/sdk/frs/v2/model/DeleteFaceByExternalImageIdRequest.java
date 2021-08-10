package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class DeleteFaceByExternalImageIdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_set_name")

    private String faceSetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_image_id")

    private String externalImageId;

    public DeleteFaceByExternalImageIdRequest withFaceSetName(String faceSetName) {
        this.faceSetName = faceSetName;
        return this;
    }

    /** 人脸库名称。
     * 
     * @return faceSetName */
    public String getFaceSetName() {
        return faceSetName;
    }

    public void setFaceSetName(String faceSetName) {
        this.faceSetName = faceSetName;
    }

    public DeleteFaceByExternalImageIdRequest withExternalImageId(String externalImageId) {
        this.externalImageId = externalImageId;
        return this;
    }

    /** external_image_id。
     * 
     * @return externalImageId */
    public String getExternalImageId() {
        return externalImageId;
    }

    public void setExternalImageId(String externalImageId) {
        this.externalImageId = externalImageId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteFaceByExternalImageIdRequest deleteFaceByExternalImageIdRequest = (DeleteFaceByExternalImageIdRequest) o;
        return Objects.equals(this.faceSetName, deleteFaceByExternalImageIdRequest.faceSetName)
            && Objects.equals(this.externalImageId, deleteFaceByExternalImageIdRequest.externalImageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faceSetName, externalImageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteFaceByExternalImageIdRequest {\n");
        sb.append("    faceSetName: ").append(toIndentedString(faceSetName)).append("\n");
        sb.append("    externalImageId: ").append(toIndentedString(externalImageId)).append("\n");
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
