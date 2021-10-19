package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 包含标签，最多包含10个key，每 个key下面的value最多10个，每 个key对应的value可以为空数组但 结构体不能缺失。Key不能重复， 同一个key中values不能重复。结 果返回包含所有标签的资源列表，
 * key之间是与的关系，key-value结 构中value是或的关系。无tag过滤 条件时返回全量数据。 */
public class TagValuesList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<String> values = null;

    public TagValuesList withKey(String key) {
        this.key = key;
        return this;
    }

    /** 键。最大长度127个unicode字 符。key不能为空。(搜索时不对此 参数做字符集校验)，key不能为空 或者空字符串，不能为空格，校验 和使用之前先trim前后半角空格。
     * 
     * @return key */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public TagValuesList withValues(List<String> values) {
        this.values = values;
        return this;
    }

    public TagValuesList addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public TagValuesList withValues(Consumer<List<String>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /** 值列表。每个值最大长度255个 unicode字符，校验和使用之前先 trim前后半角空格。 value可为空数组但不可缺省。 如果values为空列表，则表示 any_value（查询任意value）。
     * value之间为或的关系。 (搜索时不对此参数做字符集校 验，只做长度校验)
     * 
     * @return values */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TagValuesList tagValuesList = (TagValuesList) o;
        return Objects.equals(this.key, tagValuesList.key) && Objects.equals(this.values, tagValuesList.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagValuesList {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
