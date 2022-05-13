package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FaceCompareUrlReq
 */
public class FaceCompareUrlReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image1_url")

    private String image1Url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image2_url")

    private String image2Url;

    public FaceCompareUrlReq withImage1Url(String image1Url) {
        this.image1Url = image1Url;
        return this;
    }

    /**
     * [图片的URL路径，目前仅支持华为云上OBS的URL，且人脸识别服务有权限读取该OBS桶的数据。 开通读取权限的操作请参见[服务授权](https://support.huaweicloud.com/api-face/face_02_0006.html)。  与image1_file、image1_base64三选一 ](tag:hc) [图片的URL路径，目前仅支持华为云上OBS的URL，且人脸识别服务有权限读取该OBS桶的数据。 开通读取权限的操作请参见[服务授权](https://support.huaweicloud.com/intl/zh-cn/api-face/face_02_0006.html)。  与image1_file、image1_base64三选一 ](tag:hk)
     * @return image1Url
     */
    public String getImage1Url() {
        return image1Url;
    }

    public void setImage1Url(String image1Url) {
        this.image1Url = image1Url;
    }

    public FaceCompareUrlReq withImage2Url(String image2Url) {
        this.image2Url = image2Url;
        return this;
    }

    /**
     * [图片的URL路径，目前仅支持华为云上OBS的URL，且人脸识别服务有权限读取该OBS桶的数据。 开通读取权限的操作请参见[服务授权](https://support.huaweicloud.com/api-face/face_02_0006.html)。  与image2_file、image2_base64三选一](tag:hc) [图片的URL路径，目前仅支持华为云上OBS的URL，且人脸识别服务有权限读取该OBS桶的数据。 开通读取权限的操作请参见[服务授权](https://support.huaweicloud.com/intl/zh-cn/api-face/face_02_0006.html)。  与image2_file、image2_base64三选一](tag:hk)
     * @return image2Url
     */
    public String getImage2Url() {
        return image2Url;
    }

    public void setImage2Url(String image2Url) {
        this.image2Url = image2Url;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FaceCompareUrlReq faceCompareUrlReq = (FaceCompareUrlReq) o;
        return Objects.equals(this.image1Url, faceCompareUrlReq.image1Url)
            && Objects.equals(this.image2Url, faceCompareUrlReq.image2Url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image1Url, image2Url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FaceCompareUrlReq {\n");
        sb.append("    image1Url: ").append(toIndentedString(image1Url)).append("\n");
        sb.append("    image2Url: ").append(toIndentedString(image2Url)).append("\n");
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
