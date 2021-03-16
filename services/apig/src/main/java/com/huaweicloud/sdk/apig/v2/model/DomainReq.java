package com.huaweicloud.sdk.apig.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DomainReq
 */
public class DomainReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url_domain")
    
    private String urlDomain;

    public DomainReq withUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
        return this;
    }

    


    /**
     * 自定义域名。长度为0-255位的字符串，需要符合域名规范。
     * @return urlDomain
     */
    public String getUrlDomain() {
        return urlDomain;
    }

    public void setUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DomainReq domainReq = (DomainReq) o;
        return Objects.equals(this.urlDomain, domainReq.urlDomain);
    }
    @Override
    public int hashCode() {
        return Objects.hash(urlDomain);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainReq {\n");
        sb.append("    urlDomain: ").append(toIndentedString(urlDomain)).append("\n");
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

