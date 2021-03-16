package com.huaweicloud.sdk.sa.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Recommendation
 */
public class Recommendation  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="text")
    
    private String text;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;

    public Recommendation withText(String text) {
        this.text = text;
        return this;
    }

    


    /**
     * 处理建议，最长512个字符。
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    

    public Recommendation withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 链接，指向该事件的一般修复信息。该URL必须可以从公网访问，不需要提供凭证。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Recommendation recommendation = (Recommendation) o;
        return Objects.equals(this.text, recommendation.text) &&
            Objects.equals(this.url, recommendation.url);
    }
    @Override
    public int hashCode() {
        return Objects.hash(text, url);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Recommendation {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

