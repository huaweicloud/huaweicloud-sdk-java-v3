package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 结构化模板规则对象
 */
public class TemplateRule {

    /**
     * 结构化类型，只支持custom_regex,json,split,nginx
     */
    public static final class TypeEnum {

        /**
         * Enum CUSTOM_REGEX for value: "custom_regex"
         */
        public static final TypeEnum CUSTOM_REGEX = new TypeEnum("custom_regex");

        /**
         * Enum JSON for value: "json"
         */
        public static final TypeEnum JSON = new TypeEnum("json");

        /**
         * Enum SPLIT for value: "split"
         */
        public static final TypeEnum SPLIT = new TypeEnum("split");

        /**
         * Enum NGINX for value: "nginx"
         */
        public static final TypeEnum NGINX = new TypeEnum("nginx");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("custom_regex", CUSTOM_REGEX);
            map.put("json", JSON);
            map.put("split", SPLIT);
            map.put("nginx", NGINX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param")

    private String param;

    public TemplateRule withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 结构化类型，只支持custom_regex,json,split,nginx
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public TemplateRule withParam(String param) {
        this.param = param;
        return this;
    }

    /**
     * 具体结构化规则，每种结构化类型都有自己独有的结构，具体结构如下： 手动正则为json字符串，包含keyObject对象和regex_rules对象，keyObject内为键值对，键为demo_fields数组中元素的index，值为field_name，regex_rules对象为正则表达式字符串，整体例子为{\\\"keyObject\\\":{\\\"1\\\":\\\"date\\\",\\\"2\\\":\\\"num\\\"},\\\"regex_rules\\\":\\\"^(?<date>[^/]+)(?:[^ ]* ){8}(?<num>\\\\\\\\d+)\\\"}； json方式时param为一个json字符串，包含keyObject对象和layers对象，keyObject内为键值对，键为demo_fields数组中元素的field_name，值为user_defined_name，layers为最大解析层数，当前最大值为4，整体例子为{\\\"keyObject\\\":{\\\"metadata.dimention\\\":\\\"dimention\\\",\\\"metadata.value\\\":\\\"\\\",\\\"metadata.unit\\\":\\\"\\\",\\\"collectionTime\\\":\\\"\\\"},\\\"layers\\\":3}； 分隔符方式时为json字符串，包含keyObject对象和tokenizer对象，keyObject内为键值对，键为demo_fields数组中元素的index，值为field_name，tokenizer对象为所用分隔符，整体例子为{\\\"keyObject\\\":{\\\"0\\\":\\\"field1\\\",\\\"1\\\":\\\"field2\\\",\\\"2\\\":\\\"field3\\\",\\\"3\\\":\\\"field4\\\",\\\"4\\\":\\\"field5\\\",\\\"5\\\":\\\"field6\\\",\\\"6\\\":\\\"field7\\\",\\\"7\\\":\\\"field8\\\",\\\"8\\\":\\\"field9\\\"},\\\"tokenizer\\\":\\\" \\\"}； nginx方式时为json字符串，包含keyObject对象，regex对象，field_names对象及log_format对象，keyObject内为键值对，键为demo_fields数组中元素的field_name，值为user_defined_name，regex为正则表达式字符串，field_names对象为demo_fields数组中各元素的field_name的拼接字符串，每个field_name以','分隔，log_format对象为nginx日志格式化方式，具体方式参考https://support.huaweicloud.com/usermanual-lts/lts_0820.html#lts_0820__section1151119552549进行配置，整体例子为\"{\\\"keyObject\\\":{\\\"http_host\\\":\\\"host\\\",\\\"remote_addr\\\":\\\"\\\",\\\"request_method\\\":\\\"\\\",\\\"request_uri\\\":\\\"\\\",\\\"time_local\\\":\\\"\\\"},\\\"regex\\\":\\\"(\\\\\\\\d+/\\\\\\\\S+/\\\\\\\\d+:\\\\\\\\d+:\\\\\\\\d+:\\\\\\\\d+)\\\\\\\\s+\\\\\\\\S+\\\\\\\\s+(\\\\\\\\S*)\\\\\\\\s+(\\\\\\\\S*)\\\\\\\\s+(\\\\\\\\S*)\\\\\\\\s+\\\\\\\"([^\\\\\\\"]*)\\\\\\\".*\\\",\\\"fieldNames\\\":\\\"time_local,remote_addr,request_method,http_host,request_uri\\\",\\\"log_format\\\":\\\"log_format upstreaminfo '$time_local $remote_addr  $request_method $http_host \\\\\\\"$request_uri\\\\\\\"';\\\"}\"
     * @return param
     */
    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateRule that = (TemplateRule) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.param, that.param);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, param);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateRule {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    param: ").append(toIndentedString(param)).append("\n");
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
