package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * API的url地址
 */
public class VersionLinks {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "href")

    @JacksonXmlProperty(localName = "href")

    private String href;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rel")

    @JacksonXmlProperty(localName = "rel")

    private String rel;

    public VersionLinks withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * API的url地址
     * @return href
     */
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public VersionLinks withRel(String rel) {
        this.rel = rel;
        return this;
    }

    /**
     * API的url地址依赖
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
        VersionLinks versionLinks = (VersionLinks) o;
        return Objects.equals(this.href, versionLinks.href) && Objects.equals(this.rel, versionLinks.rel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, rel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionLinks {\n");
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
