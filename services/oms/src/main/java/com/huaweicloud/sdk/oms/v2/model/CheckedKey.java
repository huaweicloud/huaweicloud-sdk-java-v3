package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 检查键
 */
public class CheckedKey {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_etag_matching")

    private Boolean isEtagMatching;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_object_existing")

    private Boolean isObjectExisting;

    public CheckedKey withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 键
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CheckedKey withIsEtagMatching(Boolean isEtagMatching) {
        this.isEtagMatching = isEtagMatching;
        return this;
    }

    /**
     * 是否电子标签匹配
     * @return isEtagMatching
     */
    public Boolean getIsEtagMatching() {
        return isEtagMatching;
    }

    public void setIsEtagMatching(Boolean isEtagMatching) {
        this.isEtagMatching = isEtagMatching;
    }

    public CheckedKey withIsObjectExisting(Boolean isObjectExisting) {
        this.isObjectExisting = isObjectExisting;
        return this;
    }

    /**
     * 是否存在对象
     * @return isObjectExisting
     */
    public Boolean getIsObjectExisting() {
        return isObjectExisting;
    }

    public void setIsObjectExisting(Boolean isObjectExisting) {
        this.isObjectExisting = isObjectExisting;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckedKey that = (CheckedKey) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.isEtagMatching, that.isEtagMatching)
            && Objects.equals(this.isObjectExisting, that.isObjectExisting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, isEtagMatching, isObjectExisting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckedKey {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    isEtagMatching: ").append(toIndentedString(isEtagMatching)).append("\n");
        sb.append("    isObjectExisting: ").append(toIndentedString(isObjectExisting)).append("\n");
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
