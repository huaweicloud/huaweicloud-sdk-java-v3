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
public class LanguageDetectionReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="text")
    
    
    private String text;

    public LanguageDetectionReq withText(String text) {
        this.text = text;
        return this;
    }

    


    /**
     * 需要识别语种的文本。仅支持utf-8编码，长度不超过2000字符。
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
        LanguageDetectionReq languageDetectionReq = (LanguageDetectionReq) o;
        return Objects.equals(this.text, languageDetectionReq.text);
    }
    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LanguageDetectionReq {\n");
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

