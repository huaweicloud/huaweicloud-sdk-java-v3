package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DetectFaceByFileIntlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "faces")

    private List<DetectFace> faces = null;

    public DetectFaceByFileIntlResponse withFaces(List<DetectFace> faces) {
        this.faces = faces;
        return this;
    }

    public DetectFaceByFileIntlResponse addFacesItem(DetectFace facesItem) {
        if (this.faces == null) {
            this.faces = new ArrayList<>();
        }
        this.faces.add(facesItem);
        return this;
    }

    public DetectFaceByFileIntlResponse withFaces(Consumer<List<DetectFace>> facesSetter) {
        if (this.faces == null) {
            this.faces = new ArrayList<>();
        }
        facesSetter.accept(this.faces);
        return this;
    }

    /**
     * 检测到的人脸。 调用失败时无此字段。
     * @return faces
     */
    public List<DetectFace> getFaces() {
        return faces;
    }

    public void setFaces(List<DetectFace> faces) {
        this.faces = faces;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetectFaceByFileIntlResponse that = (DetectFaceByFileIntlResponse) obj;
        return Objects.equals(this.faces, that.faces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetectFaceByFileIntlResponse {\n");
        sb.append("    faces: ").append(toIndentedString(faces)).append("\n");
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
