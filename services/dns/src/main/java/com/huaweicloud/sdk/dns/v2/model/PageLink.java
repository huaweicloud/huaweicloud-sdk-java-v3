package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 分页信息 */
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

    /** 当前资源的链接。
     * 
     * @return self */
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

    /** 下一页资源的链接。
     * 
     * @return next */
    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PageLink pageLink = (PageLink) o;
        return Objects.equals(this.self, pageLink.self) && Objects.equals(this.next, pageLink.next);
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
