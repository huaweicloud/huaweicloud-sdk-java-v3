package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群标签。   关于标签特性的详细信息，请参见[《标签管理产品介绍》](https://support.huaweicloud.com/productdesc-tms/zh-cn_topic_0071335169.html)。
 */
public class CreateClusterTagsBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public CreateClusterTagsBody withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 集群标签的key值。可输入的字符串长度为1~36个字符。只能包含数字、字母、中划线\"-\"和下划线\"_\"。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CreateClusterTagsBody withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 集群标签的value值。可输入的字符串长度为0~43个字符。只能包含数字、字母、中划线\"-\"和下划线\"_\"。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterTagsBody createClusterTagsBody = (CreateClusterTagsBody) o;
        return Objects.equals(this.key, createClusterTagsBody.key)
            && Objects.equals(this.value, createClusterTagsBody.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterTagsBody {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
