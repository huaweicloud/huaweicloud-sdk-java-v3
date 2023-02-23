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
 * 命名实体识别post请求体
 */
public class PostDomainNerRequest  {


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
    /**
     * 支持的领域类型，目前支持通用（general）领域、商务（business）领域、娱乐（entertainment）领域，默认为general。
     */
    public static final class DomainEnum {

        
        /**
         * Enum GENERAL for value: "general"
         */
        public static final DomainEnum GENERAL = new DomainEnum("general");
        
        /**
         * Enum BUSINESS for value: "business"
         */
        public static final DomainEnum BUSINESS = new DomainEnum("business");
        
        /**
         * Enum ENTERTAINMENT for value: "entertainment"
         */
        public static final DomainEnum ENTERTAINMENT = new DomainEnum("entertainment");
        

        private static final Map<String, DomainEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DomainEnum> createStaticFields() {
            Map<String, DomainEnum> map = new HashMap<>();
            map.put("general", GENERAL);
            map.put("business", BUSINESS);
            map.put("entertainment", ENTERTAINMENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DomainEnum(String value) {
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
        public static DomainEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DomainEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DomainEnum(value);
            }
            return result;
        }

        public static DomainEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DomainEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DomainEnum) {
                return this.value.equals(((DomainEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    

    private DomainEnum domain;

    public PostDomainNerRequest withText(String text) {
        this.text = text;
        return this;
    }

    


    /**
     * 待分析文本，长度为1~512，文本编码为UTF-8。
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    

    public PostDomainNerRequest withLang(LangEnum lang) {
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

    

    public PostDomainNerRequest withDomain(DomainEnum domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * 支持的领域类型，目前支持通用（general）领域、商务（business）领域、娱乐（entertainment）领域，默认为general。
     * @return domain
     */
    public DomainEnum getDomain() {
        return domain;
    }

    public void setDomain(DomainEnum domain) {
        this.domain = domain;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostDomainNerRequest postDomainNerRequest = (PostDomainNerRequest) o;
        return Objects.equals(this.text, postDomainNerRequest.text) &&
            Objects.equals(this.lang, postDomainNerRequest.lang) &&
            Objects.equals(this.domain, postDomainNerRequest.domain);
    }
    @Override
    public int hashCode() {
        return Objects.hash(text, lang, domain);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostDomainNerRequest {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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

