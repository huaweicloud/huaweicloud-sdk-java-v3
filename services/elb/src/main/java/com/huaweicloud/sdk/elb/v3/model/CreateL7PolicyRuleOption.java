package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 转发规则匹配策略 */
public class CreateL7PolicyRuleOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_type")

    private String compareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invert")

    private Boolean invert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<CreateRuleCondition> conditions = null;

    public CreateL7PolicyRuleOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /** 转发规则的管理状态；取值范围： true/false，默认为true。 不支持该字段，请勿使用。
     * 
     * @return adminStateUp */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public CreateL7PolicyRuleOption withType(String type) {
        this.type = type;
        return this;
    }

    /** 转发规则类别： - HOST_NAME：匹配域名 - PATH：匹配请求路径 - METHOD：匹配请求方法 - HEADER：匹配请求头 - QUERY_STRING：匹配请求查询参数 -
     * SOURCE_IP：匹配请求源IP地址 一个l7policy下创建的l7rule的HOST_NAME，PATH，METHOD，SOURCE_IP不能重复。HEADER、QUERY_STRING支持重复的rule配置。
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateL7PolicyRuleOption withCompareType(String compareType) {
        this.compareType = compareType;
        return this;
    }

    /** 转发匹配方式：type为HOST_NAME时，取值范围：EQUAL_TO：精确匹配；type为PATH时，取值范围：REGEX：Perl类型的正则匹配；STARTS_WITH：前缀匹配；EQUAL_TO：精确匹配。
     * 
     * @return compareType */
    public String getCompareType() {
        return compareType;
    }

    public void setCompareType(String compareType) {
        this.compareType = compareType;
    }

    public CreateL7PolicyRuleOption withInvert(Boolean invert) {
        this.invert = invert;
        return this;
    }

    /** 是否反向匹配；取值范围：true/false。默认值：false。 不支持该字段，请勿使用。
     * 
     * @return invert */
    public Boolean getInvert() {
        return invert;
    }

    public void setInvert(Boolean invert) {
        this.invert = invert;
    }

    public CreateL7PolicyRuleOption withKey(String key) {
        this.key = key;
        return this;
    }

    /** 匹配项的名称，比如转发规则匹配类型是请求头匹配，则key表示请求头参数的名称。 不支持该字段，请勿使用。
     * 
     * @return key */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CreateL7PolicyRuleOption withValue(String value) {
        this.value = value;
        return this;
    }

    /** 匹配项的值，比如转发规则匹配类型是域名匹配，则value表示域名的值。仅当conditions空时该字段生效。
     * 当type为HOST_NAME时，字符串只能包含英文字母、数字、“-”、“.”或“*”，必须以字母、数字或“*”开头。若域名中包含“*”，则“*”只能出现在开头且必须以*.开始。当*开头时表示通配0~任一个字符。
     * 当type为PATH时，当转发规则的compare_type为STARTS_WITH、EQUAL_TO时，字符串只能包含英文字母、数字、_~';@^-%#&$.*+?,=!&#58;|/()[]{}，且必须以\"/\"开头。
     * 当type为METHOD、SOURCE_IP、HEADER,QUERY_STRING时，该字段无意义，使用conditions来指定key/value。
     * 
     * @return value */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CreateL7PolicyRuleOption withConditions(List<CreateRuleCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public CreateL7PolicyRuleOption addConditionsItem(CreateRuleCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public CreateL7PolicyRuleOption withConditions(Consumer<List<CreateRuleCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /** 转发规则的匹配条件。当监听器的高级转发策略功能（enhance_l7policy_enable）开启后才会生效。 配置了conditions后，字段key、字段value的值无意义。
     * 若指定了conditons，该rule的条件数为conditons列表长度。 列表中key必须相同，value不允许重复。 [不支持该字段，请勿使用。](tag:dt,dt_test)
     * 
     * @return conditions */
    public List<CreateRuleCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<CreateRuleCondition> conditions) {
        this.conditions = conditions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateL7PolicyRuleOption createL7PolicyRuleOption = (CreateL7PolicyRuleOption) o;
        return Objects.equals(this.adminStateUp, createL7PolicyRuleOption.adminStateUp)
            && Objects.equals(this.type, createL7PolicyRuleOption.type)
            && Objects.equals(this.compareType, createL7PolicyRuleOption.compareType)
            && Objects.equals(this.invert, createL7PolicyRuleOption.invert)
            && Objects.equals(this.key, createL7PolicyRuleOption.key)
            && Objects.equals(this.value, createL7PolicyRuleOption.value)
            && Objects.equals(this.conditions, createL7PolicyRuleOption.conditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp, type, compareType, invert, key, value, conditions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateL7PolicyRuleOption {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    compareType: ").append(toIndentedString(compareType)).append("\n");
        sb.append("    invert: ").append(toIndentedString(invert)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
