package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 转发规则匹配策略
 */
public class CreateL7PolicyRuleOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="compare_type")
    
    private String compareType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invert")
    
    private Boolean invert;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    
    private String key;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private String value;

    public CreateL7PolicyRuleOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 转发规则的管理状态；取值范围： true/false。该字段为预留字段，暂未启用。默认为true。
     * @return adminStateUp
     */
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

    


    /**
     * 转发规则的匹配类型。取值范围：HOST_NAME：匹配请求中的域名；PATH：匹配请求中的路径；同一个转发策略下转发规则的type不能重复。
     * @return type
     */
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

    


    /**
     * 转发匹配方式：type为HOST_NAME时，取值范围：EQUAL_TO：精确匹配；type为PATH时，取值范围：REGEX：正则匹配；STARTS_WITH：前缀匹配；EQUAL_TO：精确匹配。
     * @return compareType
     */
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

    


    /**
     * 是否反向匹配；取值范围：true/false。默认值：false；该字段为预留字段，暂未启用。
     * @return invert
     */
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

    


    /**
     * 匹配内容的键值。默认为null。该字段为预留字段，暂未启用。
     * @return key
     */
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

    


    /**
     * 匹配内容的值。不能包含空格。当type为HOST_NAME时，取值范围：String (100)，字符串只能包含英文字母、数字、“-”或“.”，且必须以字母或数字开头。当type为PATH时，取值范围：String (128)。当转发规则的compare_type为STARTS_WITH、EQUAL_TO时，字符串只能包含英文字母、数字、_~';@^-%#&$.*+?,=!:| /()[]{}，且必须以\"/\"开头。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
        return Objects.equals(this.adminStateUp, createL7PolicyRuleOption.adminStateUp) &&
            Objects.equals(this.type, createL7PolicyRuleOption.type) &&
            Objects.equals(this.compareType, createL7PolicyRuleOption.compareType) &&
            Objects.equals(this.invert, createL7PolicyRuleOption.invert) &&
            Objects.equals(this.key, createL7PolicyRuleOption.key) &&
            Objects.equals(this.value, createL7PolicyRuleOption.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp, type, compareType, invert, key, value);
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

