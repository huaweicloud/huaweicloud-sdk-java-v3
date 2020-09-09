package com.huaweicloud.sdk.servicestage.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowRedirectUrlResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;

    public ShowRedirectUrlResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 授权重定向URL。
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
        ShowRedirectUrlResponse showRedirectUrlResponse = (ShowRedirectUrlResponse) o;
        return Objects.equals(this.url, showRedirectUrlResponse.url);
    }
    @Override
    public int hashCode() {
        return Objects.hash(url);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRedirectUrlResponse {\n");
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

