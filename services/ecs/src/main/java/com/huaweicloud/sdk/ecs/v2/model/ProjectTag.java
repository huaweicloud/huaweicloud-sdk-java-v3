package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 项目标签列表。
 */
public class ProjectTag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    @JacksonXmlProperty(localName = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    @JacksonXmlProperty(localName = "values")

    private List<String> values = null;

    public ProjectTag withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 键。  - 最大长度36个unicode字符。  - 只能包含数字、字母、中划线“-”、下划线“_”。  - 字符集：A-Z，a-z ， 0-9，‘-’，‘_’，UNICODE字符（\\u4E00-\\u9FFF）。  - 不能包含以下ASCII非打印字符：“=”,“*”,“<”,“>”,“\\”,“|”,“/”,“,”。  - 标签的键必须唯一且输入不能为空。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ProjectTag withValues(List<String> values) {
        this.values = values;
        return this;
    }

    public ProjectTag addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public ProjectTag withValues(Consumer<List<String>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 值。  - 每个值最大长度43个unicode字符。  - 可以为空字符串。  - 只能包含数字、字母、中划线“-”、下划线“_”。  - 字符集：A-Z，a-z ， 0-9，‘.’，‘-’，‘_’，UNICODE字符（\\u4E00-\\u9FFF）。  - 不能包含以下ASCII非打印字符：“=”,“*”,“<”,“>”,“\\”,“|”,“/”,“,”。
     * @return values
     */
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
        ProjectTag projectTag = (ProjectTag) o;
        return Objects.equals(this.key, projectTag.key) && Objects.equals(this.values, projectTag.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectTag {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
