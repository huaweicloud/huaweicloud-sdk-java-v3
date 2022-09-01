package com.huaweicloud.sdk.nlp.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ClassificationReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    @JacksonXmlProperty(localName = "content")
    
    private String content;
    /**
     * 1 广告检测
     */
    public static final class DomainEnum {

        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final DomainEnum NUMBER_1 = new DomainEnum(1);
        

        private static final Map<Integer, DomainEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, DomainEnum> createStaticFields() {
            Map<Integer, DomainEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        DomainEnum(Integer value) {
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
        public static DomainEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            DomainEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DomainEnum(value);
            }
            return result;
        }

        public static DomainEnum valueOf(Integer value) {
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
    
    @JacksonXmlProperty(localName = "domain")
    
    private DomainEnum domain;

    public ClassificationReq withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 待分析文本。文本编码要求为utf-8。 限定400个字符以内，文本长度超过400个字符时，只检测前400个字符。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    

    public ClassificationReq withDomain(DomainEnum domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * 1 广告检测
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
        ClassificationReq classificationReq = (ClassificationReq) o;
        return Objects.equals(this.content, classificationReq.content) &&
            Objects.equals(this.domain, classificationReq.domain);
    }
    @Override
    public int hashCode() {
        return Objects.hash(content, domain);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClassificationReq {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

