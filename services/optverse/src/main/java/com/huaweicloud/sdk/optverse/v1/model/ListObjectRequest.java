package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListObjectRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    public ListObjectRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * **参数解释**： 桶名。 **约束限制**： 不涉及 **取值范围**： 仅支持小写字母、数字、中划线和下划线英文句号，长度为[1-63]个字符。 **默认取值**： 不涉及 
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public ListObjectRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释**： 目录名或键名。 **约束限制**： 不涉及 **取值范围**： 仅支持小写字母、数字、中划线和下划线英文句号，长度为[1-32768]个字符。 **默认取值**： 不涉及 
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
        ListObjectRequest that = (ListObjectRequest) obj;
        return Objects.equals(this.bucket, that.bucket) && Objects.equals(this.key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListObjectRequest {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
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
