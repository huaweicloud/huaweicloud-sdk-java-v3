package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class SlotValue  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="word")
    

    private String word;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="norm_word")
    

    private String normWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="begin_position")
    

    private Integer beginPosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_position")
    

    private Integer endPosition;

    public SlotValue withWord(String word) {
        this.word = word;
        return this;
    }

    


    /**
     * 词。
     * @return word
     */
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    

    public SlotValue withNormWord(String normWord) {
        this.normWord = normWord;
        return this;
    }

    


    /**
     * 归一化后的标准词。
     * @return normWord
     */
    public String getNormWord() {
        return normWord;
    }

    public void setNormWord(String normWord) {
        this.normWord = normWord;
    }

    

    public SlotValue withBeginPosition(Integer beginPosition) {
        this.beginPosition = beginPosition;
        return this;
    }

    


    /**
     * 词的起始位置。
     * @return beginPosition
     */
    public Integer getBeginPosition() {
        return beginPosition;
    }

    public void setBeginPosition(Integer beginPosition) {
        this.beginPosition = beginPosition;
    }

    

    public SlotValue withEndPosition(Integer endPosition) {
        this.endPosition = endPosition;
        return this;
    }

    


    /**
     * 词的结束位置。
     * @return endPosition
     */
    public Integer getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(Integer endPosition) {
        this.endPosition = endPosition;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlotValue slotValue = (SlotValue) o;
        return Objects.equals(this.word, slotValue.word) &&
            Objects.equals(this.normWord, slotValue.normWord) &&
            Objects.equals(this.beginPosition, slotValue.beginPosition) &&
            Objects.equals(this.endPosition, slotValue.endPosition);
    }
    @Override
    public int hashCode() {
        return Objects.hash(word, normWord, beginPosition, endPosition);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlotValue {\n");
        sb.append("    word: ").append(toIndentedString(word)).append("\n");
        sb.append("    normWord: ").append(toIndentedString(normWord)).append("\n");
        sb.append("    beginPosition: ").append(toIndentedString(beginPosition)).append("\n");
        sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
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

