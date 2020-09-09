package com.huaweicloud.sdk.vpc.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class NeutronPageLink  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="href")
    
    private String href;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rel")
    
    private String rel;

    public NeutronPageLink withHref(String href) {
        this.href = href;
        return this;
    }

    


    /**
     * API链接
     * @return href
     */
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public NeutronPageLink withRel(String rel) {
        this.rel = rel;
        return this;
    }

    


    /**
     * API链接与该API版本的关系
     * @return rel
     */
    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronPageLink neutronPageLink = (NeutronPageLink) o;
        return Objects.equals(this.href, neutronPageLink.href) &&
            Objects.equals(this.rel, neutronPageLink.rel);
    }
    @Override
    public int hashCode() {
        return Objects.hash(href, rel);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronPageLink {\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
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

