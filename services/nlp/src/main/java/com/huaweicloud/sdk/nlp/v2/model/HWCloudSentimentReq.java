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
public class HWCloudSentimentReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    
    private String content;
    /**
     * 支持的文本语言类型，目前支持中文（zh）和英文（en），默认为中文。
     */
    public static final class LangEnum {

        
        /**
         * Enum EN for value: "en"
         */
        public static final LangEnum EN = new LangEnum("en");
        
        /**
         * Enum ZH for value: "zh"
         */
        public static final LangEnum ZH = new LangEnum("zh");
        

        private static final Map<String, LangEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LangEnum> createStaticFields() {
            Map<String, LangEnum> map = new HashMap<>();
            map.put("en", EN);
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

    public HWCloudSentimentReq withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 待分析文本。文本编码要求为utf-8。仅支持中文和英文情感分析。 限定180个字符以内，超过180个字符，只截取前180个字符。 
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    

    public HWCloudSentimentReq withLang(LangEnum lang) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HWCloudSentimentReq hwCloudSentimentReq = (HWCloudSentimentReq) o;
        return Objects.equals(this.content, hwCloudSentimentReq.content) &&
            Objects.equals(this.lang, hwCloudSentimentReq.lang);
    }
    @Override
    public int hashCode() {
        return Objects.hash(content, lang);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HWCloudSentimentReq {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
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

