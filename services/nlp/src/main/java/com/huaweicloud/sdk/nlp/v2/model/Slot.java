package com.huaweicloud.sdk.nlp.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class Slot  {


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
    @JsonProperty(value="length")
    

    private Integer length;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="normalized_word")
    

    private String normalizedWord;

    public Slot withWord(String word) {
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

    

    public Slot withTag(String tag) {
        this.tag = tag;
        return this;
    }

    


    /**
     * 实体类型。对于每个意图类别所支持的实体类型分别为： weather：date(日期)，time(时间)，location(位置) time：location(位置)，timezone(时区) news：genre(风格) joke：genre(风格) translation：content(内容) notification：content(内容)，date(日期)，time(时间)，singer(歌手) alarm：date(日期)，time:(时间) music：singer(歌手)，song(歌曲)，content(内容)
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    

    public Slot withOffset(Integer offset) {
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

    

    public Slot withLength(Integer length) {
        this.length = length;
        return this;
    }

    


    /**
     * 实体文本长度。
     * @return length
     */
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    

    public Slot withNormalizedWord(String normalizedWord) {
        this.normalizedWord = normalizedWord;
        return this;
    }

    


    /**
     * 同义词或者其他标准表达的词，默认为原始的word。
     * @return normalizedWord
     */
    public String getNormalizedWord() {
        return normalizedWord;
    }

    public void setNormalizedWord(String normalizedWord) {
        this.normalizedWord = normalizedWord;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Slot slot = (Slot) o;
        return Objects.equals(this.word, slot.word) &&
            Objects.equals(this.tag, slot.tag) &&
            Objects.equals(this.offset, slot.offset) &&
            Objects.equals(this.length, slot.length) &&
            Objects.equals(this.normalizedWord, slot.normalizedWord);
    }
    @Override
    public int hashCode() {
        return Objects.hash(word, tag, offset, length, normalizedWord);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Slot {\n");
        sb.append("    word: ").append(toIndentedString(word)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
        sb.append("    normalizedWord: ").append(toIndentedString(normalizedWord)).append("\n");
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

