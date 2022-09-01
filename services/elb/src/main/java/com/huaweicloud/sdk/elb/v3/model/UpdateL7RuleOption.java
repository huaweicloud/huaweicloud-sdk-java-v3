package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新七层转发规则的请求参数。
 */
public class UpdateL7RuleOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    @JacksonXmlProperty(localName = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_type")

    @JacksonXmlProperty(localName = "compare_type")

    private String compareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invert")

    @JacksonXmlProperty(localName = "invert")

    private Boolean invert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    @JacksonXmlProperty(localName = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    @JacksonXmlProperty(localName = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    @JacksonXmlProperty(localName = "conditions")

    private List<UpdateRuleCondition> conditions = null;

    public UpdateL7RuleOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 转发规则的管理状态，默认为true。  不支持该字段，请勿使用。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public UpdateL7RuleOption withCompareType(String compareType) {
        this.compareType = compareType;
        return this;
    }

    /**
     * 转发匹配方式。取值： - EQUAL_TO 表示精确匹配。 - REGEX 表示正则匹配。 - STARTS_WITH 表示前缀匹配。  使用说明： - type为HOST_NAME时仅支持EQUAL_TO，支持通配符*。  - type为PATH时可以为REGEX，STARTS_WITH，EQUAL_TO。  [- type为METHOD、SOURCE_IP时，仅支持EQUAL_TO。  - type为HEADER、QUERY_STRING，仅支持EQUAL_TO，支持通配符*、？。](tag:hws,hws_hk,ocb,tlf,ctc,hcs,sbc,g42,tm,cmcc,hk_g42,mix,hk_sbc,hws_ocb,fcs)
     * @return compareType
     */
    public String getCompareType() {
        return compareType;
    }

    public void setCompareType(String compareType) {
        this.compareType = compareType;
    }

    public UpdateL7RuleOption withInvert(Boolean invert) {
        this.invert = invert;
        return this;
    }

    /**
     * 是否反向匹配。取值：true、false。  不支持该字段，请勿使用。
     * @return invert
     */
    public Boolean getInvert() {
        return invert;
    }

    public void setInvert(Boolean invert) {
        this.invert = invert;
    }

    public UpdateL7RuleOption withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 匹配项的名称，比如转发规则匹配类型是请求头匹配，则key表示请求头参数的名称。  不支持该字段，请勿使用。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public UpdateL7RuleOption withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 匹配项的值，比如转发规则匹配类型是域名匹配，则value表示域名的值。[仅当conditions空时该字段生效。](tag:hws,hws_hk,ocb,tlf,ctc,hcs,sbc,g42,tm,cmcc,hk_g42,mix,hk_sbc,hws_ocb,fcs)   当type为HOST_NAME时，字符串只能包含英文字母、数字、“-”、“.”或“*”，必须以字母、数字或“*”开头。  若域名中包含“*”，则“*”只能出现在开头且必须以*.开始。当*开头时表示通配0~任一个字符。   当type为PATH时，当转发规则的compare_type为STARTS_WITH、EQUAL_TO时，字符串只能包含英文字母、数字、_~';@^-%#&$.*+?,=!:|\\/()\\[\\]{}，且必须以\"/\"开头。   [当type为METHOD、SOURCE_IP、HEADER,QUERY_STRING时，该字段无意义，使用conditions来指定key/value。](tag:hws,hws_hk,ocb,tlf,ctc,hcs,sbc,g42,tm,cmcc,hk_g42,mix,hk_sbc,hws_ocb,fcs)
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public UpdateL7RuleOption withConditions(List<UpdateRuleCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public UpdateL7RuleOption addConditionsItem(UpdateRuleCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public UpdateL7RuleOption withConditions(Consumer<List<UpdateRuleCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 转发规则的匹配条件。当监听器的高级转发策略功能（enhance_l7policy_enable）开启后才会生效。 配置了conditions后，字段key、字段value的值无意义。 若指定了conditons，该rule的条件数为conditons列表长度。 列表中key必须相同，value不允许重复。  [不支持该字段，请勿使用。](tag:dt,dt_test,hcso_dt)
     * @return conditions
     */
    public List<UpdateRuleCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<UpdateRuleCondition> conditions) {
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
        UpdateL7RuleOption updateL7RuleOption = (UpdateL7RuleOption) o;
        return Objects.equals(this.adminStateUp, updateL7RuleOption.adminStateUp)
            && Objects.equals(this.compareType, updateL7RuleOption.compareType)
            && Objects.equals(this.invert, updateL7RuleOption.invert)
            && Objects.equals(this.key, updateL7RuleOption.key) && Objects.equals(this.value, updateL7RuleOption.value)
            && Objects.equals(this.conditions, updateL7RuleOption.conditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp, compareType, invert, key, value, conditions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateL7RuleOption {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    compareType: ").append(toIndentedString(compareType)).append("\n");
        sb.append("    invert: ").append(toIndentedString(invert)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
