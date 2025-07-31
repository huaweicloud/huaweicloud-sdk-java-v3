package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 指向当前页或者其他页的链接。当查询需要分页时，需要包含一个next链接指向下一页。 **取值范围：** 不涉及。
 */
public class LinksItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "href")

    private String href;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rel")

    private String rel;

    public LinksItem withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * **参数解释：** 对应快捷链接。 **取值范围：** 不涉及。
     * @return href
     */
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public LinksItem withRel(String rel) {
        this.rel = rel;
        return this;
    }

    /**
     * **参数解释：** 快捷链接标记名称。 **取值范围：** 不涉及。
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
        LinksItem that = (LinksItem) obj;
        return Objects.equals(this.href, that.href) && Objects.equals(this.rel, that.rel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, rel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinksItem {\n");
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
