package com.huaweicloud.sdk.swr.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.swr.v2.model.TagSelector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Rule
 */
public class Rule  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="params")
    
    private Object params;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag_selectors")
    
    private List<TagSelector> tagSelectors = null;
        /**
     * 回收类型，date_rule、tag_rule
     */
    public static final class TemplateEnum {

        
        /**
         * Enum DATE_RULE for value: "date_rule"
         */
        public static final TemplateEnum DATE_RULE = new TemplateEnum("date_rule");
        
        /**
         * Enum TAG_RULE for value: "tag_rule"
         */
        public static final TemplateEnum TAG_RULE = new TemplateEnum("tag_rule");
        

        private static final Map<String, TemplateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TemplateEnum> createStaticFields() {
            Map<String, TemplateEnum> map = new HashMap<>();
            map.put("date_rule", DATE_RULE);
            map.put("tag_rule", TAG_RULE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TemplateEnum(String value) {
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
        public static TemplateEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TemplateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TemplateEnum(value);
            }
            return result;
        }

        public static TemplateEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TemplateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TemplateEnum) {
                return this.value.equals(((TemplateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template")
    
    private TemplateEnum template;

    public Rule withParams(Object params) {
        this.params = params;
        return this;
    }

    


    /**
     * template是date_rule时，设置params[\"days\"] template是tag_rule时，设置params[\"num\"] 
     * @return params
     */
    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }

    

    public Rule withTagSelectors(List<TagSelector> tagSelectors) {
        this.tagSelectors = tagSelectors;
        return this;
    }

    
    public Rule addTagSelectorsItem(TagSelector tagSelectorsItem) {
        this.tagSelectors.add(tagSelectorsItem);
        return this;
    }

    public Rule withTagSelectors(Consumer<List<TagSelector>> tagSelectorsSetter) {
        if(this.tagSelectors == null ){
            this.tagSelectors = new ArrayList<>();
        }
        tagSelectorsSetter.accept(this.tagSelectors);
        return this;
    }

    /**
     * 例外镜像
     * @return tagSelectors
     */
    public List<TagSelector> getTagSelectors() {
        return tagSelectors;
    }

    public void setTagSelectors(List<TagSelector> tagSelectors) {
        this.tagSelectors = tagSelectors;
    }

    

    public Rule withTemplate(TemplateEnum template) {
        this.template = template;
        return this;
    }

    


    /**
     * 回收类型，date_rule、tag_rule
     * @return template
     */
    public TemplateEnum getTemplate() {
        return template;
    }

    public void setTemplate(TemplateEnum template) {
        this.template = template;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rule rule = (Rule) o;
        return Objects.equals(this.params, rule.params) &&
            Objects.equals(this.tagSelectors, rule.tagSelectors) &&
            Objects.equals(this.template, rule.template);
    }
    @Override
    public int hashCode() {
        return Objects.hash(params, tagSelectors, template);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Rule {\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    tagSelectors: ").append(toIndentedString(tagSelectors)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

