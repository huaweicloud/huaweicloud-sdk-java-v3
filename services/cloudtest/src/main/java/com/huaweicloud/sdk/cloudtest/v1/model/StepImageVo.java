package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class StepImageVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "img_id")

    private String imgId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "img_url")

    private String imgUrl;

    public StepImageVo withImgId(String imgId) {
        this.imgId = imgId;
        return this;
    }

    /**
     * 测试步骤图片id
     * @return imgId
     */
    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId;
    }

    public StepImageVo withImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    /**
     * 测试步骤图片路径
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
        StepImageVo that = (StepImageVo) obj;
        return Objects.equals(this.imgId, that.imgId) && Objects.equals(this.imgUrl, that.imgUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imgId, imgUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StepImageVo {\n");
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
