package com.huaweicloud.sdk.nlp.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class AspectSentimentRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    
    private String content;
    /**
     * 取值如下： 1 手机领域
     */
    public static final class TypeEnum {

        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final TypeEnum NUMBER_1 = new TypeEnum(1);
        

        private static final Map<Integer, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TypeEnum> createStaticFields() {
            Map<Integer, TypeEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        TypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value="type")
    
    
    private TypeEnum type;

    public AspectSentimentRequest withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 待分析文本。仅支持中文，文本编码要求为utf-8。 建议文本长度1000个字符以内。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    

    public AspectSentimentRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 取值如下： 1 手机领域
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AspectSentimentRequest aspectSentimentRequest = (AspectSentimentRequest) o;
        return Objects.equals(this.content, aspectSentimentRequest.content) &&
            Objects.equals(this.type, aspectSentimentRequest.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(content, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AspectSentimentRequest {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

