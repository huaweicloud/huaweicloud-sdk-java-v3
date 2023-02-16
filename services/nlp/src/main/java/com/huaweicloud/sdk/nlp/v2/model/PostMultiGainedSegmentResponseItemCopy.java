package com.huaweicloud.sdk.nlp.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.nlp.v2.model.PostMultiGainedSegmentResponseItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 多粒度分词结果中的词汇节点
 */
public class PostMultiGainedSegmentResponseItemCopy  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    
    private String content;
    /**
     * 文本类型，取值如下： WORD-词汇类型 CHAR-字符类型
     */
    public static final class TypeEnum {

        
        /**
         * Enum WORD for value: "WORD"
         */
        public static final TypeEnum WORD = new TypeEnum("WORD");
        
        /**
         * Enum CHAR for value: "CHAR"
         */
        public static final TypeEnum CHAR = new TypeEnum("CHAR");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("WORD", WORD);
            map.put("CHAR", CHAR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_contents")
    
    
    private List<PostMultiGainedSegmentResponseItem> subContents = null;
    
    public PostMultiGainedSegmentResponseItemCopy withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 当前节点对应的文本内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    

    public PostMultiGainedSegmentResponseItemCopy withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 文本类型，取值如下： WORD-词汇类型 CHAR-字符类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public PostMultiGainedSegmentResponseItemCopy withSubContents(List<PostMultiGainedSegmentResponseItem> subContents) {
        this.subContents = subContents;
        return this;
    }

    
    public PostMultiGainedSegmentResponseItemCopy addSubContentsItem(PostMultiGainedSegmentResponseItem subContentsItem) {
        if(this.subContents == null) {
            this.subContents = new ArrayList<>();
        }
        this.subContents.add(subContentsItem);
        return this;
    }

    public PostMultiGainedSegmentResponseItemCopy withSubContents(Consumer<List<PostMultiGainedSegmentResponseItem>> subContentsSetter) {
        if(this.subContents == null) {
            this.subContents = new ArrayList<>();
        }
        subContentsSetter.accept(this.subContents);
        return this;
    }

    /**
     * 当前节点的子节点列表
     * @return subContents
     */
    public List<PostMultiGainedSegmentResponseItem> getSubContents() {
        return subContents;
    }

    public void setSubContents(List<PostMultiGainedSegmentResponseItem> subContents) {
        this.subContents = subContents;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostMultiGainedSegmentResponseItemCopy postMultiGainedSegmentResponseItemCopy = (PostMultiGainedSegmentResponseItemCopy) o;
        return Objects.equals(this.content, postMultiGainedSegmentResponseItemCopy.content) &&
            Objects.equals(this.type, postMultiGainedSegmentResponseItemCopy.type) &&
            Objects.equals(this.subContents, postMultiGainedSegmentResponseItemCopy.subContents);
    }
    @Override
    public int hashCode() {
        return Objects.hash(content, type, subContents);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostMultiGainedSegmentResponseItemCopy {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    subContents: ").append(toIndentedString(subContents)).append("\n");
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

