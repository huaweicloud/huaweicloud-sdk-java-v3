package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 资源标签 */
public class ResourceTag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public ResourceTag withKey(String key) {
        this.key = key;
        return this;
    }

    /** 键。最大长度36个unicode字符。 key不能为空。 搜索时不对此参数做校验 不能包含非打印字符\"=\"，“*”，“<”，“>”，“\\”，“,”，\"|\"，“/”。
     * 
     * @return key */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ResourceTag withValue(String value) {
        this.value = value;
        return this;
    }

    /** 值列表。每个值最大长度255个unicode字符，如果values为空列表，则表示any_value。value之间为或的关系。不能包含非打印字符\"=\"，“*”，“<”，“>”，“\\”，“,”，\"|\"，“/”。
     * 
     * @return value */
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
        ResourceTag resourceTag = (ResourceTag) o;
        return Objects.equals(this.key, resourceTag.key) && Objects.equals(this.value, resourceTag.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceTag {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
