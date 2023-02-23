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
 * 请求消息
 */
public class DomainSentimentReq  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    

    private String content;
    /**
     * 取值如下： 0：自适应领域，根据输入内容自动识别适应领域。 1：电商领域，适用于电商领域评论。 2：汽车领域，适用于汽车领域评论。
     */
    public static final class TypeEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final TypeEnum NUMBER_0 = new TypeEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final TypeEnum NUMBER_1 = new TypeEnum(1);
        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final TypeEnum NUMBER_2 = new TypeEnum(2);
        

        private static final Map<Integer, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TypeEnum> createStaticFields() {
            Map<Integer, TypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
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

    public DomainSentimentReq withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 待分析文本。文本编码要求为utf-8。仅支持中文情感分析。 type为1（电商领域评论）时，限定200个字符以内，文本长度超过200个字符时，只检测前200个字符。 type为2（汽车领域评论）时，限定400个字符以内，文本长度超过400个字符时，只检测前400个字符。 
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    

    public DomainSentimentReq withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 取值如下： 0：自适应领域，根据输入内容自动识别适应领域。 1：电商领域，适用于电商领域评论。 2：汽车领域，适用于汽车领域评论。
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
        DomainSentimentReq domainSentimentReq = (DomainSentimentReq) o;
        return Objects.equals(this.content, domainSentimentReq.content) &&
            Objects.equals(this.type, domainSentimentReq.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(content, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainSentimentReq {\n");
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

