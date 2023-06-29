package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UploadIssueImgResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "img_id")

    private String imgId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "img_url")

    private String imgUrl;

    public UploadIssueImgResponse withImgId(String imgId) {
        this.imgId = imgId;
        return this;
    }

    /**
     * 图片id
     * @return imgId
     */
    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId;
    }

    public UploadIssueImgResponse withImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    /**
     * 图片url v1改成v3作为下载图片请求
     * @return imgUrl
     */
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadIssueImgResponse that = (UploadIssueImgResponse) obj;
        return Objects.equals(this.imgId, that.imgId) && Objects.equals(this.imgUrl, that.imgUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imgId, imgUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadIssueImgResponse {\n");
        sb.append("    imgId: ").append(toIndentedString(imgId)).append("\n");
        sb.append("    imgUrl: ").append(toIndentedString(imgUrl)).append("\n");
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
