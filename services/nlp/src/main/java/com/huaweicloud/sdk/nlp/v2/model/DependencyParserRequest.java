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
 * 依存句法分析请求体
 */
public class DependencyParserRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="text")
    
    
    private String text;
    /**
     * 支持的文本语言类型，目前只支持中文，默认为zh。 
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

    public DependencyParserRequest withText(String text) {
        this.text = text;
        return this;
    }

    


    /**
     * 待分析文本，长度为1~32，文本编码为utf-8。
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    

    public DependencyParserRequest withLang(LangEnum lang) {
        this.lang = lang;
        return this;
    }

    


    /**
     * 支持的文本语言类型，目前只支持中文，默认为zh。 
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
        DependencyParserRequest dependencyParserRequest = (DependencyParserRequest) o;
        return Objects.equals(this.text, dependencyParserRequest.text) &&
            Objects.equals(this.lang, dependencyParserRequest.lang);
    }
    @Override
    public int hashCode() {
        return Objects.hash(text, lang);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependencyParserRequest {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

