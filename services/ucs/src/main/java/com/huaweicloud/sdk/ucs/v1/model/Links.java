package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Links
 */
public class Links {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self")

    private String self;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next")

    private String next;

    public Links withSelf(String self) {
        this.self = self;
        return this;
    }

    /**
     * object信息
     * @return self
     */
    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public Links withNext(String next) {
        this.next = next;
        return this;
    }

    /**
     * Next信息
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
        Links that = (Links) obj;
        return Objects.equals(this.self, that.self) && Objects.equals(this.next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(self, next);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Links {\n");
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
