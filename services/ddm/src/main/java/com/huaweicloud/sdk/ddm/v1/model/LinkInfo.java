package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LinkInfo
 */
public class LinkInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "href")

    private String href;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rel")

    private String rel;

    public LinkInfo withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * 对应该API的URL
     * @return href
     */
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public LinkInfo withRel(String rel) {
        this.rel = rel;
        return this;
    }

    /**
     * 取值为“self”，表示href为本地链接。
     * @return rel
     */
    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LinkInfo that = (LinkInfo) obj;
        return Objects.equals(this.href, that.href) && Objects.equals(this.rel, that.rel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, rel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkInfo {\n");
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
