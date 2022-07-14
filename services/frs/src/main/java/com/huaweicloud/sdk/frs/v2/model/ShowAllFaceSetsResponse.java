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
public class ShowAllFaceSetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_sets_info")

    private List<FaceSetInfo> faceSetsInfo = null;

    public ShowAllFaceSetsResponse withFaceSetsInfo(List<FaceSetInfo> faceSetsInfo) {
        this.faceSetsInfo = faceSetsInfo;
        return this;
    }

    public ShowAllFaceSetsResponse addFaceSetsInfoItem(FaceSetInfo faceSetsInfoItem) {
        if (this.faceSetsInfo == null) {
            this.faceSetsInfo = new ArrayList<>();
        }
        this.faceSetsInfo.add(faceSetsInfoItem);
        return this;
    }

    public ShowAllFaceSetsResponse withFaceSetsInfo(Consumer<List<FaceSetInfo>> faceSetsInfoSetter) {
        if (this.faceSetsInfo == null) {
            this.faceSetsInfo = new ArrayList<>();
        }
        faceSetsInfoSetter.accept(this.faceSetsInfo);
        return this;
    }

    /**
     * [人脸库信息，详见[FaceSetInfo](https://support.huaweicloud.com/api-face/face_02_0020.html)。调用失败时无此字段。](tag:hc) [人脸库信息，详见[FaceSetInfo](https://support.huaweicloud.com/intl/zh-cn/api-face/face_02_0020.html)。调用失败时无此字段。](tag:hk)
     * @return faceSetsInfo
     */
    public List<FaceSetInfo> getFaceSetsInfo() {
        return faceSetsInfo;
    }

    public void setFaceSetsInfo(List<FaceSetInfo> faceSetsInfo) {
        this.faceSetsInfo = faceSetsInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAllFaceSetsResponse showAllFaceSetsResponse = (ShowAllFaceSetsResponse) o;
        return Objects.equals(this.faceSetsInfo, showAllFaceSetsResponse.faceSetsInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faceSetsInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAllFaceSetsResponse {\n");
        sb.append("    faceSetsInfo: ").append(toIndentedString(faceSetsInfo)).append("\n");
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
