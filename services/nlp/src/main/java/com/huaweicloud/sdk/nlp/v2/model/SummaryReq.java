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
 * SummaryReq
 */
public class SummaryReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    
    private String content;
    /**
     * 支持的文本语言类型，目前支持中文（zh）和英文（en），默认为中文。
     */
    public static final class LangEnum {

        
        /**
         * Enum ZH for value: "zh"
         */
        public static final LangEnum ZH = new LangEnum("zh");
        
        /**
         * Enum EN for value: "en"
         */
        public static final LangEnum EN = new LangEnum("en");
        

        private static final Map<String, LangEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LangEnum> createStaticFields() {
            Map<String, LangEnum> map = new HashMap<>();
            map.put("zh", ZH);
            map.put("en", EN);
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
    @JsonProperty(value="length_limit")
    
    
    private Float lengthLimit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="title")
    
    
    private String title;

    public SummaryReq withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 文本正文（目前仅支持UTF-8编码），长度不超过10000字。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    

    public SummaryReq withLang(LangEnum lang) {
        this.lang = lang;
        return this;
    }

    


    /**
     * 支持的文本语言类型，目前支持中文（zh）和英文（en），默认为中文。
     * @return lang
     */
    public LangEnum getLang() {
        return lang;
    }

    public void setLang(LangEnum lang) {
        this.lang = lang;
    }

    

    public SummaryReq withLengthLimit(Float lengthLimit) {
        this.lengthLimit = lengthLimit;
        return this;
    }

    


    /**
     * 生成摘要的长度限制。length_limit > 1，则返回结果为字数不小于该值且最接近该值的摘要。 0 <= length_limit <= 1，则返回结果为长度百分比不小于该值且最接近该值的摘要。 默认数值为0.3。
     * @return lengthLimit
     */
    public Float getLengthLimit() {
        return lengthLimit;
    }

    public void setLengthLimit(Float lengthLimit) {
        this.lengthLimit = lengthLimit;
    }

    

    public SummaryReq withTitle(String title) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SummaryReq summaryReq = (SummaryReq) o;
        return Objects.equals(this.content, summaryReq.content) &&
            Objects.equals(this.lang, summaryReq.lang) &&
            Objects.equals(this.lengthLimit, summaryReq.lengthLimit) &&
            Objects.equals(this.title, summaryReq.title);
    }
    @Override
    public int hashCode() {
        return Objects.hash(content, lang, lengthLimit, title);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SummaryReq {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
        sb.append("    lengthLimit: ").append(toIndentedString(lengthLimit)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

