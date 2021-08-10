package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** UpdateCoverByThumbnailReq */
public class UpdateCoverByThumbnailReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnailUrl")

    private String thumbnailUrl;

    public UpdateCoverByThumbnailReq withThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    /** 截图文件的URL。 需要根据媒资ID调用[查询媒资详细信息](https://support.huaweicloud.com/api-vod/vod_04_0202.html)接口获取媒资的截图文件URL。
     * 
     * @return thumbnailUrl */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCoverByThumbnailReq updateCoverByThumbnailReq = (UpdateCoverByThumbnailReq) o;
        return Objects.equals(this.thumbnailUrl, updateCoverByThumbnailReq.thumbnailUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(thumbnailUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCoverByThumbnailReq {\n");
        sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
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
