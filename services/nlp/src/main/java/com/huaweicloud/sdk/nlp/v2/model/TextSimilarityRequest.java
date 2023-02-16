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
 * 文本相似度请求体
 */
public class TextSimilarityRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="text1")
    
    
    private String text1;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="text2")
    
    
    private String text2;
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

    public TextSimilarityRequest withText1(String text1) {
        this.text1 = text1;
        return this;
    }

    


    /**
     * 待计算文本1，中文长度1~512，英文长度1~2000，文本编码为UTF-8。
     * @return text1
     */
    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    

    public TextSimilarityRequest withText2(String text2) {
        this.text2 = text2;
        return this;
    }

    


    /**
     * 待计算文本2，中文长度1~512，英文长度1~2000，文本编码为UTF-8。
     * @return text2
     */
    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    

    public TextSimilarityRequest withLang(LangEnum lang) {
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
        TextSimilarityRequest textSimilarityRequest = (TextSimilarityRequest) o;
        return Objects.equals(this.text1, textSimilarityRequest.text1) &&
            Objects.equals(this.text2, textSimilarityRequest.text2) &&
            Objects.equals(this.lang, textSimilarityRequest.lang);
    }
    @Override
    public int hashCode() {
        return Objects.hash(text1, text2, lang);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextSimilarityRequest {\n");
        sb.append("    text1: ").append(toIndentedString(text1)).append("\n");
        sb.append("    text2: ").append(toIndentedString(text2)).append("\n");
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

