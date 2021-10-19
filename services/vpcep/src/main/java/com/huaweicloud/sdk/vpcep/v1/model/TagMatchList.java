package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 搜索字段，key为要匹配的字段， 如resource_name等。value为匹 配的值。key为固定字典值，不能 包含重复的key或不支持的key。 根据key的值确认是否需要模糊匹 配，如resource_name默认为模糊
 * 搜索（不区分大小写），如果 value为空字符串精确匹配（多数 服务不存在资源名称为空的情况， 因此此类情况返回空列表）。 resource_id为精确匹配。第一期 只做resource_name，后续再扩 展。 */
public class TagMatchList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public TagMatchList withKey(String key) {
        this.key = key;
        return this;
    }

    /** 键。第一期限定为 resource_name，后续扩展。 Key 字符集规范 键，unicode字符，不能为空。不能包含下列字符： 非打印字符ASCII(0-31)、“=”、“*”、“<”、“>”、“\\”、“,”、“|”和
     * “/”。
     * 
     * @return key */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public TagMatchList withValue(String value) {
        this.value = value;
        return this;
    }

    /** 值。每个值最大长度255个 unicode字符。不校验字符集范。 Value 字符集规范 值，unicode字符。不能包含下列字符：
     * 非打印字符ASCII(0-31)、“=”、“*”、“<”、“>”、“\\”、“,”、“|”和 “/”。
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
        TagMatchList tagMatchList = (TagMatchList) o;
        return Objects.equals(this.key, tagMatchList.key) && Objects.equals(this.value, tagMatchList.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagMatchList {\n");
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
