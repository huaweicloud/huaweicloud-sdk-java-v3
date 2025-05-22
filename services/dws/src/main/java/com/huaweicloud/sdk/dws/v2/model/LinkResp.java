package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 链接信息。 **取值范围**： 不涉及。
 */
public class LinkResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rel")

    private String rel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "href")

    private String href;

    public LinkResp withRel(String rel) {
        this.rel = rel;
        return this;
    }

    /**
     * **参数解释**： 关联信息。 **取值范围**： 不涉及。
     * @return rel
     */
    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public LinkResp withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * **参数解释**： 链接信息。 **取值范围**： 不涉及。
     * @return href
     */
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LinkResp that = (LinkResp) obj;
        return Objects.equals(this.rel, that.rel) && Objects.equals(this.href, that.href);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rel, href);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkResp {\n");
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
