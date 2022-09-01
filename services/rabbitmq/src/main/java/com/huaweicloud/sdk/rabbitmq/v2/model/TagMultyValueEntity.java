package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TagMultyValueEntity
 */
public class TagMultyValueEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    @JacksonXmlProperty(localName = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    @JacksonXmlProperty(localName = "values")

    private List<String> values = null;

    public TagMultyValueEntity withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 键。最大长度36个unicode字符。  key不能为空，不能为空字符串。  不能包含下列字符：非打印字符ASCII(0-31)，“=”,“*”,“<”,“>”,“\\”,“,”,“|”,“/”。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public TagMultyValueEntity withValues(List<String> values) {
        this.values = values;
        return this;
    }

    public TagMultyValueEntity addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public TagMultyValueEntity withValues(Consumer<List<String>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 值。每个值最大长度43个unicode字符。  value不能为空，可以空字符串。  不能包含下列字符：非打印字符ASCII(0-31), “=”,“*”,“<”,“>”,“\\”,“,”,“|”,“/”。
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
        TagMultyValueEntity tagMultyValueEntity = (TagMultyValueEntity) o;
        return Objects.equals(this.key, tagMultyValueEntity.key)
            && Objects.equals(this.values, tagMultyValueEntity.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagMultyValueEntity {\n");
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
