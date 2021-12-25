package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** LinksInfoResponse */
public class LinksInfoResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "href")

    private String href;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rel")

    private String rel;

    public LinksInfoResponse withHref(String href) {
        this.href = href;
        return this;
    }

    /** 对应该API的URL
     * 
     * @return href */
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public LinksInfoResponse withRel(String rel) {
        this.rel = rel;
        return this;
    }

    /** 取值为“self”，表示href为本地链接。
     * 
     * @return rel */
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
        LinksInfoResponse linksInfoResponse = (LinksInfoResponse) o;
        return Objects.equals(this.href, linksInfoResponse.href) && Objects.equals(this.rel, linksInfoResponse.rel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, rel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinksInfoResponse {\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
