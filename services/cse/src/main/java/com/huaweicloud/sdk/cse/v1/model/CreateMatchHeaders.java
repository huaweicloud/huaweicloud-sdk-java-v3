package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 匹配的Headers。
 */
public class CreateMatchHeaders {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "&lt;header&gt;")

    private CreateMatchHeadersHeader lessThanHeaderGreaterThan;

    public CreateMatchHeaders withLessThanHeaderGreaterThan(CreateMatchHeadersHeader lessThanHeaderGreaterThan) {
        this.lessThanHeaderGreaterThan = lessThanHeaderGreaterThan;
        return this;
    }

    public CreateMatchHeaders withLessThanHeaderGreaterThan(
        Consumer<CreateMatchHeadersHeader> lessThanHeaderGreaterThanSetter) {
        if (this.lessThanHeaderGreaterThan == null) {
            this.lessThanHeaderGreaterThan = new CreateMatchHeadersHeader();
            lessThanHeaderGreaterThanSetter.accept(this.lessThanHeaderGreaterThan);
        }

        return this;
    }

    /**
     * Get lessThanHeaderGreaterThan
     * @return lessThanHeaderGreaterThan
     */
    public CreateMatchHeadersHeader getLessThanHeaderGreaterThan() {
        return lessThanHeaderGreaterThan;
    }

    public void setLessThanHeaderGreaterThan(CreateMatchHeadersHeader lessThanHeaderGreaterThan) {
        this.lessThanHeaderGreaterThan = lessThanHeaderGreaterThan;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMatchHeaders that = (CreateMatchHeaders) obj;
        return Objects.equals(this.lessThanHeaderGreaterThan, that.lessThanHeaderGreaterThan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lessThanHeaderGreaterThan);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMatchHeaders {\n");
        sb.append("    lessThanHeaderGreaterThan: ").append(toIndentedString(lessThanHeaderGreaterThan)).append("\n");
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
