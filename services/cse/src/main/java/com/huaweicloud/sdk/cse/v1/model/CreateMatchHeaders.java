package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * headers
 */
public class CreateMatchHeaders {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aaaa")

    private CreateMatchHeadersAaaa aaaa;

    public CreateMatchHeaders withAaaa(CreateMatchHeadersAaaa aaaa) {
        this.aaaa = aaaa;
        return this;
    }

    public CreateMatchHeaders withAaaa(Consumer<CreateMatchHeadersAaaa> aaaaSetter) {
        if (this.aaaa == null) {
            this.aaaa = new CreateMatchHeadersAaaa();
            aaaaSetter.accept(this.aaaa);
        }

        return this;
    }

    /**
     * Get aaaa
     * @return aaaa
     */
    public CreateMatchHeadersAaaa getAaaa() {
        return aaaa;
    }

    public void setAaaa(CreateMatchHeadersAaaa aaaa) {
        this.aaaa = aaaa;
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
        return Objects.equals(this.aaaa, that.aaaa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aaaa);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMatchHeaders {\n");
        sb.append("    aaaa: ").append(toIndentedString(aaaa)).append("\n");
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
