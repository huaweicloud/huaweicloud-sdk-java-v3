package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class UpdateFaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_number")

    private Integer faceNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_set_id")

    private String faceSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_set_name")

    private String faceSetName;

    public UpdateFaceResponse withFaceNumber(Integer faceNumber) {
        this.faceNumber = faceNumber;
        return this;
    }

    /** 更新的人脸数量。 调用失败时无此字段。
     * 
     * @return faceNumber */
    public Integer getFaceNumber() {
        return faceNumber;
    }

    public void setFaceNumber(Integer faceNumber) {
        this.faceNumber = faceNumber;
    }

    public UpdateFaceResponse withFaceSetId(String faceSetId) {
        this.faceSetId = faceSetId;
        return this;
    }

    /** 人脸库ID。 调用失败时无此字段。
     * 
     * @return faceSetId */
    public String getFaceSetId() {
        return faceSetId;
    }

    public void setFaceSetId(String faceSetId) {
        this.faceSetId = faceSetId;
    }

    public UpdateFaceResponse withFaceSetName(String faceSetName) {
        this.faceSetName = faceSetName;
        return this;
    }

    /** 人脸库名称。 调用失败时无此字段。
     * 
     * @return faceSetName */
    public String getFaceSetName() {
        return faceSetName;
    }

    public void setFaceSetName(String faceSetName) {
        this.faceSetName = faceSetName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateFaceResponse updateFaceResponse = (UpdateFaceResponse) o;
        return Objects.equals(this.faceNumber, updateFaceResponse.faceNumber)
            && Objects.equals(this.faceSetId, updateFaceResponse.faceSetId)
            && Objects.equals(this.faceSetName, updateFaceResponse.faceSetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faceNumber, faceSetId, faceSetName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFaceResponse {\n");
        sb.append("    faceNumber: ").append(toIndentedString(faceNumber)).append("\n");
        sb.append("    faceSetId: ").append(toIndentedString(faceSetId)).append("\n");
        sb.append("    faceSetName: ").append(toIndentedString(faceSetName)).append("\n");
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
