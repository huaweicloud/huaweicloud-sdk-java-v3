package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 标签信息。  &gt; 说明： - 不允许重复key - 每实例最多允许20个标签（系统可配置），不包含_sys开头系统标签  - 优先按照创建时间的倒序排序。如果没有创建时间则按照资源名称ASCII码进行排序
 */
public class Tags {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<String> values = null;

    public Tags withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 键。  > 说明： - key不能为空，长度1~128个字符（中文也可以输入128个字符） - 可用 UTF-8 格式表示的字母(包含中文)、数字和空格，以及以下字符： _ . : = + - @ - _sys_开头属于系统标签，租户不能输入 - 建议正则：^((?!_sys_)[\\\\p{L}\\\\p{Z}\\\\p{N}_.:=+\\\\-@]*)$
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Tags withValues(List<String> values) {
        this.values = values;
        return this;
    }

    public Tags addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public Tags withValues(Consumer<List<String>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 值列表。  > 说明： - 长度0~255个字符（中文也可以输入255个字符） - 可用 UTF-8 格式表示的字母(包含中文)、数字和空格，以及以下字符： _ . : / = + - @ 建议正则：^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-@]*)$ - 资源标签值可以为空（empty or null） - 预定义标签值不可以为空
     * @return values
     */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tags that = (Tags) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tags {\n");
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
