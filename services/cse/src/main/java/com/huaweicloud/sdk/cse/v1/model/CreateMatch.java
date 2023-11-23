package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 请求匹配规则。0..N个，不配置表示匹配。
 */
public class CreateMatch {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headers")

    private CreateMatchHeaders headers;

    public CreateMatch withHeaders(CreateMatchHeaders headers) {
        this.headers = headers;
        return this;
    }

    public CreateMatch withHeaders(Consumer<CreateMatchHeaders> headersSetter) {
        if (this.headers == null) {
            this.headers = new CreateMatchHeaders();
            headersSetter.accept(this.headers);
        }

        return this;
    }

    /**
     * Get headers
     * @return headers
     */
    public CreateMatchHeaders getHeaders() {
        return headers;
    }

    public void setHeaders(CreateMatchHeaders headers) {
        this.headers = headers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMatch that = (CreateMatch) obj;
        return Objects.equals(this.headers, that.headers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMatch {\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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
