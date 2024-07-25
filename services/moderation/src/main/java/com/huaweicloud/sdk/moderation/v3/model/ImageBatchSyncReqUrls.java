package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImageBatchSyncReqUrls
 */
public class ImageBatchSyncReqUrls {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_id")

    private String dataId;

    public ImageBatchSyncReqUrls withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 图片url，目前支持：公网HTTP/HTTPS URL。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ImageBatchSyncReqUrls withDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }

    /**
     * 图片唯一标识。同一次请求中不可重复，由大小写英文字母、数字、下划线（_）、中划线（-）组成，不超过30个字符。
     * @return dataId
     */
    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageBatchSyncReqUrls that = (ImageBatchSyncReqUrls) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.dataId, that.dataId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, dataId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageBatchSyncReqUrls {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    dataId: ").append(toIndentedString(dataId)).append("\n");
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
