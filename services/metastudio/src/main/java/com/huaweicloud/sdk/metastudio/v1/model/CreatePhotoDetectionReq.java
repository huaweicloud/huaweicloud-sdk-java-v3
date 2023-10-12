package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreatePhotoDetectionReq
 */
public class CreatePhotoDetectionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "human_image")

    private String humanImage;

    public CreatePhotoDetectionReq withHumanImage(String humanImage) {
        this.humanImage = humanImage;
        return this;
    }

    /**
     * 人物照片，需要Base64编码。照片分辨率不超过1080P。
     * @return humanImage
     */
    public String getHumanImage() {
        return humanImage;
    }

    public void setHumanImage(String humanImage) {
        this.humanImage = humanImage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePhotoDetectionReq that = (CreatePhotoDetectionReq) obj;
        return Objects.equals(this.humanImage, that.humanImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(humanImage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePhotoDetectionReq {\n");
        sb.append("    humanImage: ").append(toIndentedString(humanImage)).append("\n");
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
