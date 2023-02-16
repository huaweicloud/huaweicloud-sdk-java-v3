package com.huaweicloud.sdk.nlp.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 命名实体。
 */
public class NamedEntity  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="word")
    
    
    private String word;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag")
    
    
    private String tag;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="len")
    
    
    private Integer len;

    public NamedEntity withWord(String word) {
        this.word = word;
        return this;
    }

    


    /**
     * 实体文本。
     * @return word
     */
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    

    public NamedEntity withTag(String tag) {
        this.tag = tag;
        return this;
    }

    


    /**
     * 实体类型，枚举类型。 中文支持人名“nr”，地名“ns”，机构名“nt”，时间“t”。 英文支持人名“per”，地名“loc”，机构名“org”，时间“t”。 西班牙文支持人名“per”，地名“loc”，机构名“org”，时间“t”。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    

    public NamedEntity withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 实体文本在待分析文本中的起始位置。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public NamedEntity withLen(Integer len) {
        this.len = len;
        return this;
    }

    


    /**
     * 实体文本长度。
     * @return len
     */
    public Integer getLen() {
        return len;
    }

    public void setLen(Integer len) {
        this.len = len;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NamedEntity namedEntity = (NamedEntity) o;
        return Objects.equals(this.word, namedEntity.word) &&
            Objects.equals(this.tag, namedEntity.tag) &&
            Objects.equals(this.offset, namedEntity.offset) &&
            Objects.equals(this.len, namedEntity.len);
    }
    @Override
    public int hashCode() {
        return Objects.hash(word, tag, offset, len);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NamedEntity {\n");
        sb.append("    word: ").append(toIndentedString(word)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    len: ").append(toIndentedString(len)).append("\n");
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

