package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Http/Https协议可以指定多个K/V对，在发送Http/Https协议消息时会携带这些K/V对作为请求header。extension字段允许为空，header字段允许为空。
 */
public class HttpDetectRequestBodyExtension {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header")

    private Map<String, String> header = null;

    public HttpDetectRequestBodyExtension withHeader(Map<String, String> header) {
        this.header = header;
        return this;
    }

    public HttpDetectRequestBodyExtension putHeaderItem(String key, String headerItem) {
        if (this.header == null) {
            this.header = new HashMap<>();
        }
        this.header.put(key, headerItem);
        return this;
    }

    public HttpDetectRequestBodyExtension withHeader(Consumer<Map<String, String>> headerSetter) {
        if (this.header == null) {
            this.header = new HashMap<>();
        }
        headerSetter.accept(this.header);
        return this;
    }

    /**
     * header应满足如下要求： 1. key值限定为：包含英文字母([A-Za-z])、数字([0-9])、中划线(-)hyphens，中划线不得作为结尾，不得连续出现。 2. K/V不得超过10个 3. key需要以\"x-\"开头，不能以\"x-smn\"开头，正确示例：x-abc-cba,  x-abc 4. 所有K/V长度总和不得超过1024个字符 5. key不区分大小写 6. key值不可重复 7. value值限定为ASCII码，不支持中文或其他Unicode，支持空格
     * @return header
     */
    public Map<String, String> getHeader() {
        return header;
    }

    public void setHeader(Map<String, String> header) {
        this.header = header;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpDetectRequestBodyExtension that = (HttpDetectRequestBodyExtension) obj;
        return Objects.equals(this.header, that.header);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpDetectRequestBodyExtension {\n");
        sb.append("    header: ").append(toIndentedString(header)).append("\n");
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
