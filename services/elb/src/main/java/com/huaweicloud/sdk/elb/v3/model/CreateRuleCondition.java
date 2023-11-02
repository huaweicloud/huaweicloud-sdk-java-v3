package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class CreateRuleCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public CreateRuleCondition withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 匹配项的名称。  当转发规则类别type为HOST_NAME、PATH、METHOD、SOURCE_IP时，该字段固定为空字符串。  当转发规则类别type为HEADER时，key表示请求头参数的名称，value表示请求头参数的值。 key的长度限制1-40字符，只允许包含字母、数字和-_。  当转发规则类别type为QUERY_STRING时，key表示查询参数的名称，value表示查询参数的值。 key的长度限制为1-128字符，不支持空格，中括号，大括号，尖括号， 反斜杠，双引号，'#'，'&'，'|'，‘%’，‘~’，字母区分大小写。   同一个rule内的conditions列表中所有key必须相同。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CreateRuleCondition withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 匹配项的值。  当转发规则类别type为HOST_NAME时，key固定为空字符串，value表示域名的值。 value长度1-128字符，字符串只能包含英文字母、数字、-、.或\\*， 必须以字母、数字或\\*开头，\\*只能出现在开头且必须以\\*.开始。  当转发规则类别type为PATH时，key固定为空字符串，value表示请求路径的值。 value长度1-128字符。当转发规则的compare_type为STARTS_WITH、EQUAL_TO时， 字符串只能包含英文字母、数字、_~';@^-%#&$.*+?,=!:|\\/()\\[\\]{}，且必须以\"/\"开头。  当转发规则类别type为HEADER时，key表示请求头参数的名称，value表示请求头参数的值。 value长度限制1-128字符，不支持空格， 双引号，支持以下通配符：*（匹配0个或更多字符）和？（正好匹配1个字符）。  当转发规则类别type为QUERY_STRING时，key表示查询参数的名称，value表示查询参数的值。 value长度限制为1-128字符，不支持空格，中括号，大括号，尖括号，反斜杠，双引号， '#'，'&'，'|'，‘%’，‘~’，字母区分大小写，支持通配符：*（匹配0个或更多字符）和？（正好匹配1个字符）  当转发规则类别type为METHOD时，key固定为空字符串，value表示请求方式。value取值范围为：GET, PUT, POST,DELETE, PATCH, HEAD, OPTIONS。  当转发规则类别type为SOURCE_IP时，key固定为空字符串，value表示请求源地址。 value为CIDR格式，支持ipv4，ipv6。例如192.168.0.2/32，2049::49/64。   同一个rule内的conditions列表中所有value不允许重复。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRuleCondition that = (CreateRuleCondition) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRuleCondition {\n");
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
