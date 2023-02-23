package com.huaweicloud.sdk.nlp.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 事件元素
 */
public class EventExtractionResponseItemArgument  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role")
    

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="span")
    
    private List<Integer> span = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="word")
    

    private String word;

    public EventExtractionResponseItemArgument withRole(String role) {
        this.role = role;
        return this;
    }

    


    /**
     * 元素角色。元素角色指的是事件元素在事件中扮演的角色，是事件元素与事件的语义关系。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    

    public EventExtractionResponseItemArgument withSpan(List<Integer> span) {
        this.span = span;
        return this;
    }

    
    public EventExtractionResponseItemArgument addSpanItem(Integer spanItem) {
        if(this.span == null) {
            this.span = new ArrayList<>();
        }
        this.span.add(spanItem);
        return this;
    }

    public EventExtractionResponseItemArgument withSpan(Consumer<List<Integer>> spanSetter) {
        if(this.span == null) {
            this.span = new ArrayList<>();
        }
        spanSetter.accept(this.span);
        return this;
    }

    /**
     * 实体文本在待分析文本中的起始和终止位置。
     * @return span
     */
    public List<Integer> getSpan() {
        return span;
    }

    public void setSpan(List<Integer> span) {
        this.span = span;
    }

    

    public EventExtractionResponseItemArgument withWord(String word) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventExtractionResponseItemArgument eventExtractionResponseItemArgument = (EventExtractionResponseItemArgument) o;
        return Objects.equals(this.role, eventExtractionResponseItemArgument.role) &&
            Objects.equals(this.span, eventExtractionResponseItemArgument.span) &&
            Objects.equals(this.word, eventExtractionResponseItemArgument.word);
    }
    @Override
    public int hashCode() {
        return Objects.hash(role, span, word);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventExtractionResponseItemArgument {\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    span: ").append(toIndentedString(span)).append("\n");
        sb.append("    word: ").append(toIndentedString(word)).append("\n");
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

