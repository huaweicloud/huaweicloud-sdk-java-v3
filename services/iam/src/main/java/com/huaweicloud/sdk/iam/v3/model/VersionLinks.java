package com.huaweicloud.sdk.iam.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class VersionLinks  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rel")
    
    private String rel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="href")
    
    private String href;

    public VersionLinks withRel(String rel) {
        this.rel = rel;
        return this;
    }

    


    /**
     * 链接类型。self：自助链接包含了版本链接的资源。bookmark：书签链接提供了一个永久资源的永久链接。alternate：备用链接包含了资源的替换表示形式。
     * @return rel
     */
    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public VersionLinks withHref(String href) {
        this.href = href;
        return this;
    }

    


    /**
     * 资源链接地址。
     * @return href
     */
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VersionLinks versionLinks = (VersionLinks) o;
        return Objects.equals(this.rel, versionLinks.rel) &&
            Objects.equals(this.href, versionLinks.href);
    }
    @Override
    public int hashCode() {
        return Objects.hash(rel, href);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionLinks {\n");
        sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

