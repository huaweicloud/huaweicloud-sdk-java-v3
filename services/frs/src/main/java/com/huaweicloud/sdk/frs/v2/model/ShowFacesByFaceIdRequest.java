package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowFacesByFaceIdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_set_name")

    @JacksonXmlProperty(localName = "face_set_name")

    private String faceSetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_id")

    @JacksonXmlProperty(localName = "face_id")

    private String faceId;

    public ShowFacesByFaceIdRequest withFaceSetName(String faceSetName) {
        this.faceSetName = faceSetName;
        return this;
    }

    /**
     * 人脸库名称。
     * @return faceSetName
     */
    public String getFaceSetName() {
        return faceSetName;
    }

    public void setFaceSetName(String faceSetName) {
        this.faceSetName = faceSetName;
    }

    public ShowFacesByFaceIdRequest withFaceId(String faceId) {
        this.faceId = faceId;
        return this;
    }

    /**
     * 人脸ID。
     * @return faceId
     */
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
        ShowFacesByFaceIdRequest showFacesByFaceIdRequest = (ShowFacesByFaceIdRequest) o;
        return Objects.equals(this.faceSetName, showFacesByFaceIdRequest.faceSetName)
            && Objects.equals(this.faceId, showFacesByFaceIdRequest.faceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faceSetName, faceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFacesByFaceIdRequest {\n");
        sb.append("    faceSetName: ").append(toIndentedString(faceSetName)).append("\n");
        sb.append("    faceId: ").append(toIndentedString(faceId)).append("\n");
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
