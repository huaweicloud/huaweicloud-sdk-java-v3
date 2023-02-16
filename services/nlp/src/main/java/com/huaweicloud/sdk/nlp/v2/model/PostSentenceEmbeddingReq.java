package com.huaweicloud.sdk.nlp.v2.model;




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
 * 命名实体识别post请求体
 */
public class PostSentenceEmbeddingReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sentences")
    
    
    private List<String> sentences = null;
        /**
     * 支持的领域类型，目前只支持通用领域，默认为general。
     */
    public static final class DomainEnum {

        
        /**
         * Enum GENERAL for value: "general"
         */
        public static final DomainEnum GENERAL = new DomainEnum("general");
        

        private static final Map<String, DomainEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DomainEnum> createStaticFields() {
            Map<String, DomainEnum> map = new HashMap<>();
            map.put("general", GENERAL);
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

    public PostSentenceEmbeddingReq withSentences(List<String> sentences) {
        this.sentences = sentences;
        return this;
    }

    
    public PostSentenceEmbeddingReq addSentencesItem(String sentencesItem) {
        if(this.sentences == null) {
            this.sentences = new ArrayList<>();
        }
        this.sentences.add(sentencesItem);
        return this;
    }

    public PostSentenceEmbeddingReq withSentences(Consumer<List<String>> sentencesSetter) {
        if(this.sentences == null) {
            this.sentences = new ArrayList<>();
        }
        sentencesSetter.accept(this.sentences);
        return this;
    }

    /**
     * 文本列表，文本长度为1~512，列表大小为1~1000，文本编码为UTF-8。
     * @return sentences
     */
    public List<String> getSentences() {
        return sentences;
    }

    public void setSentences(List<String> sentences) {
        this.sentences = sentences;
    }

    

    public PostSentenceEmbeddingReq withDomain(DomainEnum domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * 支持的领域类型，目前只支持通用领域，默认为general。
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
        PostSentenceEmbeddingReq postSentenceEmbeddingReq = (PostSentenceEmbeddingReq) o;
        return Objects.equals(this.sentences, postSentenceEmbeddingReq.sentences) &&
            Objects.equals(this.domain, postSentenceEmbeddingReq.domain);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sentences, domain);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostSentenceEmbeddingReq {\n");
        sb.append("    sentences: ").append(toIndentedString(sentences)).append("\n");
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

