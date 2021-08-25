package com.huaweicloud.sdk.frs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowFaceSetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_set_info")

    private FaceSetInfo faceSetInfo;

    public ShowFaceSetResponse withFaceSetInfo(FaceSetInfo faceSetInfo) {
        this.faceSetInfo = faceSetInfo;
        return this;
    }

    public ShowFaceSetResponse withFaceSetInfo(Consumer<FaceSetInfo> faceSetInfoSetter) {
        if (this.faceSetInfo == null) {
            this.faceSetInfo = new FaceSetInfo();
            faceSetInfoSetter.accept(this.faceSetInfo);
        }

        return this;
    }

    /** Get faceSetInfo
     * 
     * @return faceSetInfo */
    public FaceSetInfo getFaceSetInfo() {
        return faceSetInfo;
    }

    public void setFaceSetInfo(FaceSetInfo faceSetInfo) {
        this.faceSetInfo = faceSetInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowFaceSetResponse showFaceSetResponse = (ShowFaceSetResponse) o;
        return Objects.equals(this.faceSetInfo, showFaceSetResponse.faceSetInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faceSetInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFaceSetResponse {\n");
        sb.append("    faceSetInfo: ").append(toIndentedString(faceSetInfo)).append("\n");
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
