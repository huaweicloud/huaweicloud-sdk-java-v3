package com.huaweicloud.sdk.nlp.v2.model;




import java.util.Collections;

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
 * This is a auto create Body Object
 */
public class SummaryDomainReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="length_limit")
    
    
    private Float lengthLimit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="title")
    
    
    private String title;
    /**
     * 支持的文本语言类型，目前支持中文（zh）。
     */
    public static final class LangEnum {

        
        /**
         * Enum ZH for value: "zh"
         */
        public static final LangEnum ZH = new LangEnum("zh");
        

        private static final Map<String, LangEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LangEnum> createStaticFields() {
            Map<String, LangEnum> map = new HashMap<>();
            map.put("zh", ZH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LangEnum(String value) {
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
        public static LangEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            LangEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LangEnum(value);
            }
            return result;
        }

        public static LangEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            LangEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LangEnum) {
                return this.value.equals(((LangEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lang")
    
    
    private LangEnum lang;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    
    private String content;
    /**
     * 支持的领域类型，取值如下（目前只支持通用领域），默认为通用领域： 0：通用领域
     */
    public static final class TypeEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final TypeEnum NUMBER_0 = new TypeEnum(0);
        

        private static final Map<Integer, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TypeEnum> createStaticFields() {
            Map<Integer, TypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
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

    public SummaryDomainReq withLengthLimit(Float lengthLimit) {
        this.lengthLimit = lengthLimit;
        return this;
    }

    


    /**
     * 生成摘要的长度限制。length_limit > 1，则返回结果为字数不小于该值且最接近该值的摘要。 0 <= length_limit <= 1，则返回结果为长度百分比不小于该值且最接近该值的摘要。
     * minimum: 0
     * @return lengthLimit
     */
    public Float getLengthLimit() {
        return lengthLimit;
    }

    public void setLengthLimit(Float lengthLimit) {
        this.lengthLimit = lengthLimit;
    }

    

    public SummaryDomainReq withTitle(String title) {
        this.title = title;
        return this;
    }

    


    /**
     * 文本标题（目前仅支持UTF-8编码），长度不超过1000字。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    

    public SummaryDomainReq withLang(LangEnum lang) {
        this.lang = lang;
        return this;
    }

    


    /**
     * 支持的文本语言类型，目前支持中文（zh）。
     * @return lang
     */
    public LangEnum getLang() {
        return lang;
    }

    public void setLang(LangEnum lang) {
        this.lang = lang;
    }

    

    public SummaryDomainReq withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 文本正文（目前仅支持UTF-8编码），长度不超过1000字。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    

    public SummaryDomainReq withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 支持的领域类型，取值如下（目前只支持通用领域），默认为通用领域： 0：通用领域
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
        SummaryDomainReq summaryDomainReq = (SummaryDomainReq) o;
        return Objects.equals(this.lengthLimit, summaryDomainReq.lengthLimit) &&
            Objects.equals(this.title, summaryDomainReq.title) &&
            Objects.equals(this.lang, summaryDomainReq.lang) &&
            Objects.equals(this.content, summaryDomainReq.content) &&
            Objects.equals(this.type, summaryDomainReq.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(lengthLimit, title, lang, content, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SummaryDomainReq {\n");
        sb.append("    lengthLimit: ").append(toIndentedString(lengthLimit)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
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

