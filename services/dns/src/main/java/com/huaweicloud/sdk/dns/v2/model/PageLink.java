package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 指向当前页或者其他页的链接。当查询需要分页时，需要包含一个next链接指向下一页。 **取值范围：** 不涉及。
 */
public class PageLink {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self")

    private String self;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next")

    private String next;

    public PageLink withSelf(String self) {
        this.self = self;
        return this;
    }

    /**
     * **参数解释：** 当前页面的链接。 **取值范围：** 不涉及。
     * @return self
     */
    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public PageLink withNext(String next) {
        this.next = next;
        return this;
    }

    /**
     * **参数解释：** 下一页的链接。 **取值范围：** 不涉及。
     * @return next
     */
    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PageLink that = (PageLink) obj;
        return Objects.equals(this.self, that.self) && Objects.equals(this.next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(self, next);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PageLink {\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
        sb.append("    next: ").append(toIndentedString(next)).append("\n");
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
