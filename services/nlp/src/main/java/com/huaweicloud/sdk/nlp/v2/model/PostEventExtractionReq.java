package com.huaweicloud.sdk.nlp.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class PostEventExtractionReq  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="text")
    

    private String text;

    public PostEventExtractionReq withText(String text) {
        this.text = text;
        return this;
    }

    


    /**
     * 待分析文本，长度为1~256，文本编码为UTF-8。
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostEventExtractionReq postEventExtractionReq = (PostEventExtractionReq) o;
        return Objects.equals(this.text, postEventExtractionReq.text);
    }
    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostEventExtractionReq {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

