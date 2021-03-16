package com.huaweicloud.sdk.smn.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListMessageTemplatesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message_template_name")
    
    private String messageTemplateName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private String protocol;

    public ListMessageTemplatesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListMessageTemplatesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListMessageTemplatesRequest withMessageTemplateName(String messageTemplateName) {
        this.messageTemplateName = messageTemplateName;
        return this;
    }

    


    /**
     * Get messageTemplateName
     * @return messageTemplateName
     */
    public String getMessageTemplateName() {
        return messageTemplateName;
    }

    public void setMessageTemplateName(String messageTemplateName) {
        this.messageTemplateName = messageTemplateName;
    }

    

    public ListMessageTemplatesRequest withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * Get protocol
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMessageTemplatesRequest listMessageTemplatesRequest = (ListMessageTemplatesRequest) o;
        return Objects.equals(this.offset, listMessageTemplatesRequest.offset) &&
            Objects.equals(this.limit, listMessageTemplatesRequest.limit) &&
            Objects.equals(this.messageTemplateName, listMessageTemplatesRequest.messageTemplateName) &&
            Objects.equals(this.protocol, listMessageTemplatesRequest.protocol);
    }
    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, messageTemplateName, protocol);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMessageTemplatesRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    messageTemplateName: ").append(toIndentedString(messageTemplateName)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

