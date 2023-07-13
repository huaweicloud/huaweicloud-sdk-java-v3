package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImageHighresolutionMattingInputData
 */
public class ImageHighresolutionMattingInputData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    public ImageHighresolutionMattingInputData withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * url输入源的地址，当输入为url类型时必填。 长度不超过1000。输入的图片大小不能大于20M，长边不能大于10000px。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ImageHighresolutionMattingInputData withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 数据标识。多输入场景下必选，值由算法定义；单输入场景非必选。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageHighresolutionMattingInputData that = (ImageHighresolutionMattingInputData) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageHighresolutionMattingInputData {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
