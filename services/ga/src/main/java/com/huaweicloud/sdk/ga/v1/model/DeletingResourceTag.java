package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 标签。
 */
public class DeletingResourceTag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    public DeletingResourceTag withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 标签键，规则： - 1.key不能为空，长度1~128个字符（中文也可以输入128个字符）。 - 2.可用 UTF-8 格式表示的字母（包含中文）、数字和空格，以及以下字符_ . : = + - @。 - 3._sys_开头属于系统标签，租户不能输入。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeletingResourceTag deletingResourceTag = (DeletingResourceTag) o;
        return Objects.equals(this.key, deletingResourceTag.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletingResourceTag {\n");
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
