package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class AddFacesByBase64Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_set_name")

    private String faceSetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AddFacesBase64Req body;

    public AddFacesByBase64Request withFaceSetName(String faceSetName) {
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

    public AddFacesByBase64Request withBody(AddFacesBase64Req body) {
        this.body = body;
        return this;
    }

    public AddFacesByBase64Request withBody(Consumer<AddFacesBase64Req> bodySetter) {
        if (this.body == null) {
            this.body = new AddFacesBase64Req();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public AddFacesBase64Req getBody() {
        return body;
    }

    public void setBody(AddFacesBase64Req body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddFacesByBase64Request addFacesByBase64Request = (AddFacesByBase64Request) o;
        return Objects.equals(this.faceSetName, addFacesByBase64Request.faceSetName)
            && Objects.equals(this.body, addFacesByBase64Request.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faceSetName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddFacesByBase64Request {\n");
        sb.append("    faceSetName: ").append(toIndentedString(faceSetName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
