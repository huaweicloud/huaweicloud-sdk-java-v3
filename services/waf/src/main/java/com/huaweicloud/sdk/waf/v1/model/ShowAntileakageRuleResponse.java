package com.huaweicloud.sdk.waf.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowAntileakageRuleResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;
    /**
     * 类别（响应码：code，敏感信息：sensitive）
     */
    public static final class CategoryEnum {

        
        /**
         * Enum CODE for value: "code"
         */
        public static final CategoryEnum CODE = new CategoryEnum("code");
        
        /**
         * Enum SENSITIVE for value: "sensitive"
         */
        public static final CategoryEnum SENSITIVE = new CategoryEnum("sensitive");
        

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("code", CODE);
            map.put("sensitive", SENSITIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
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
        public static CategoryEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            CategoryEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CategoryEnum(value);
            }
            return result;
        }

        public static CategoryEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            CategoryEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category")
    
    private CategoryEnum category;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="contents")
    
    private List<String> contents = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public ShowAntileakageRuleResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 规则应用的url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    public ShowAntileakageRuleResponse withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    


    /**
     * 类别（响应码：code，敏感信息：sensitive）
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    

    public ShowAntileakageRuleResponse withContents(List<String> contents) {
        this.contents = contents;
        return this;
    }

    
    public ShowAntileakageRuleResponse addContentsItem(String contentsItem) {
        if(this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public ShowAntileakageRuleResponse withContents(Consumer<List<String>> contentsSetter) {
        if(this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /**
     * 规则内容（http状态码、手机：phone、身份证号：id_card、邮箱：email）
     * @return contents
     */
    public List<String> getContents() {
        return contents;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }

    

    public ShowAntileakageRuleResponse withDescription(String description) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAntileakageRuleResponse showAntileakageRuleResponse = (ShowAntileakageRuleResponse) o;
        return Objects.equals(this.url, showAntileakageRuleResponse.url) &&
            Objects.equals(this.category, showAntileakageRuleResponse.category) &&
            Objects.equals(this.contents, showAntileakageRuleResponse.contents) &&
            Objects.equals(this.description, showAntileakageRuleResponse.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(url, category, contents, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAntileakageRuleResponse {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

