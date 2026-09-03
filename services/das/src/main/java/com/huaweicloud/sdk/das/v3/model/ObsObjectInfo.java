package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OBS对象信息
 */
public class ObsObjectInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_key")

    private String objectKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_length")

    private Long contentLength;

    public ObsObjectInfo withObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }

    /**
     * 对象的名称
     * @return objectKey
     */
    public String getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    public ObsObjectInfo withContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * 对象文件的大小
     * @return contentLength
     */
    public Long getContentLength() {
        return contentLength;
    }

    public void setContentLength(Long contentLength) {
        this.contentLength = contentLength;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObsObjectInfo that = (ObsObjectInfo) obj;
        return Objects.equals(this.objectKey, that.objectKey) && Objects.equals(this.contentLength, that.contentLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectKey, contentLength);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsObjectInfo {\n");
        sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
        sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
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
