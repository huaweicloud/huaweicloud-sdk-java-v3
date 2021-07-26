package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 请求头
 */
public class ListEventResponseBodyHeaders  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content-length")
    
    private String contentLength;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host")
    
    private String host;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content-type")
    
    private String contentType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user-agent")
    
    private String userAgent;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accept")
    
    private String accept;

    public ListEventResponseBodyHeaders withContentLength(String contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    


    /**
     * 请求长度
     * @return contentLength
     */
    public String getContentLength() {
        return contentLength;
    }

    public void setContentLength(String contentLength) {
        this.contentLength = contentLength;
    }

    

    public ListEventResponseBodyHeaders withHost(String host) {
        this.host = host;
        return this;
    }

    


    /**
     * 域名
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    

    public ListEventResponseBodyHeaders withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    


    /**
     * 内容类型
     * @return contentType
     */
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    

    public ListEventResponseBodyHeaders withUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    


    /**
     * 代理
     * @return userAgent
     */
    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    

    public ListEventResponseBodyHeaders withAccept(String accept) {
        this.accept = accept;
        return this;
    }

    


    /**
     * 接收内容类型
     * @return accept
     */
    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEventResponseBodyHeaders listEventResponseBodyHeaders = (ListEventResponseBodyHeaders) o;
        return Objects.equals(this.contentLength, listEventResponseBodyHeaders.contentLength) &&
            Objects.equals(this.host, listEventResponseBodyHeaders.host) &&
            Objects.equals(this.contentType, listEventResponseBodyHeaders.contentType) &&
            Objects.equals(this.userAgent, listEventResponseBodyHeaders.userAgent) &&
            Objects.equals(this.accept, listEventResponseBodyHeaders.accept);
    }
    @Override
    public int hashCode() {
        return Objects.hash(contentLength, host, contentType, userAgent, accept);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventResponseBodyHeaders {\n");
        sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
        sb.append("    accept: ").append(toIndentedString(accept)).append("\n");
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

