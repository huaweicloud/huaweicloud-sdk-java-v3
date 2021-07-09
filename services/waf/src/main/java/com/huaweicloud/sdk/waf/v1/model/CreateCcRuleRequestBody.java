package com.huaweicloud.sdk.waf.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.CreateCcRuleRequestBodyAction;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateCcRuleRequestBody
 */
public class CreateCcRuleRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit_num")
    
    private Integer limitNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit_period")
    
    private Integer limitPeriod;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mode")
    
    private Integer mode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private CreateCcRuleRequestBodyAction action;
    /**
     * 限制频率次数
     */
    public static final class TagTypeEnum {

        
        /**
         * Enum IP for value: "ip"
         */
        public static final TagTypeEnum IP = new TagTypeEnum("ip");
        
        /**
         * Enum OTHER for value: "other"
         */
        public static final TagTypeEnum OTHER = new TagTypeEnum("other");
        
        /**
         * Enum COOKIE for value: "cookie"
         */
        public static final TagTypeEnum COOKIE = new TagTypeEnum("cookie");
        

        private static final Map<String, TagTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TagTypeEnum> createStaticFields() {
            Map<String, TagTypeEnum> map = new HashMap<>();
            map.put("ip", IP);
            map.put("other", OTHER);
            map.put("cookie", COOKIE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TagTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TagTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TagTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TagTypeEnum(value);
            }
            return result;
        }

        public static TagTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TagTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TagTypeEnum) {
                return this.value.equals(((TagTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag_type")
    
    private TagTypeEnum tagType;

    public CreateCcRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreateCcRuleRequestBody withLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
        return this;
    }

    


    /**
     * 限制频率次数
     * minimum: 0
     * maximum: 10000
     * @return limitNum
     */
    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    

    public CreateCcRuleRequestBody withLimitPeriod(Integer limitPeriod) {
        this.limitPeriod = limitPeriod;
        return this;
    }

    


    /**
     * 限制频率单位时间
     * minimum: 0
     * maximum: 10000
     * @return limitPeriod
     */
    public Integer getLimitPeriod() {
        return limitPeriod;
    }

    public void setLimitPeriod(Integer limitPeriod) {
        this.limitPeriod = limitPeriod;
    }

    

    public CreateCcRuleRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    public CreateCcRuleRequestBody withMode(Integer mode) {
        this.mode = mode;
        return this;
    }

    


    /**
     * 工作模式：（0标准，1高级），高级模式参数无法在同一个接口同一份文档中用描述，参考console页面构建参数
     * @return mode
     */
    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    

    public CreateCcRuleRequestBody withAction(CreateCcRuleRequestBodyAction action) {
        this.action = action;
        return this;
    }

    public CreateCcRuleRequestBody withAction(Consumer<CreateCcRuleRequestBodyAction> actionSetter) {
        if(this.action == null ){
            this.action = new CreateCcRuleRequestBodyAction();
            actionSetter.accept(this.action);
        }
        
        return this;
    }


    /**
     * Get action
     * @return action
     */
    public CreateCcRuleRequestBodyAction getAction() {
        return action;
    }

    public void setAction(CreateCcRuleRequestBodyAction action) {
        this.action = action;
    }

    

    public CreateCcRuleRequestBody withTagType(TagTypeEnum tagType) {
        this.tagType = tagType;
        return this;
    }

    


    /**
     * 限制频率次数
     * @return tagType
     */
    public TagTypeEnum getTagType() {
        return tagType;
    }

    public void setTagType(TagTypeEnum tagType) {
        this.tagType = tagType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCcRuleRequestBody createCcRuleRequestBody = (CreateCcRuleRequestBody) o;
        return Objects.equals(this.description, createCcRuleRequestBody.description) &&
            Objects.equals(this.limitNum, createCcRuleRequestBody.limitNum) &&
            Objects.equals(this.limitPeriod, createCcRuleRequestBody.limitPeriod) &&
            Objects.equals(this.url, createCcRuleRequestBody.url) &&
            Objects.equals(this.mode, createCcRuleRequestBody.mode) &&
            Objects.equals(this.action, createCcRuleRequestBody.action) &&
            Objects.equals(this.tagType, createCcRuleRequestBody.tagType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(description, limitNum, limitPeriod, url, mode, action, tagType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCcRuleRequestBody {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    limitNum: ").append(toIndentedString(limitNum)).append("\n");
        sb.append("    limitPeriod: ").append(toIndentedString(limitPeriod)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    tagType: ").append(toIndentedString(tagType)).append("\n");
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

