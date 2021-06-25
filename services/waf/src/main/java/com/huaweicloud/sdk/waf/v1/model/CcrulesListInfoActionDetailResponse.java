package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 返回页面
 */
public class CcrulesListInfoActionDetailResponse  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content_type")
    
    private String contentType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    private String content;

    public CcrulesListInfoActionDetailResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    


    /**
     * Get contentType
     * @return contentType
     */
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    

    public CcrulesListInfoActionDetailResponse withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * Get content
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CcrulesListInfoActionDetailResponse ccrulesListInfoActionDetailResponse = (CcrulesListInfoActionDetailResponse) o;
        return Objects.equals(this.contentType, ccrulesListInfoActionDetailResponse.contentType) &&
            Objects.equals(this.content, ccrulesListInfoActionDetailResponse.content);
    }
    @Override
    public int hashCode() {
        return Objects.hash(contentType, content);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CcrulesListInfoActionDetailResponse {\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

