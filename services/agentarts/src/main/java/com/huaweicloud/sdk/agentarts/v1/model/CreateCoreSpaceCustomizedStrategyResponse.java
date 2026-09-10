package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateCoreSpaceCustomizedStrategyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CoreSpaceMemoryStrategy body;

    public CreateCoreSpaceCustomizedStrategyResponse withBody(CoreSpaceMemoryStrategy body) {
        this.body = body;
        return this;
    }

    public CreateCoreSpaceCustomizedStrategyResponse withBody(Consumer<CoreSpaceMemoryStrategy> bodySetter) {
        if (this.body == null) {
            this.body = new CoreSpaceMemoryStrategy();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CoreSpaceMemoryStrategy getBody() {
        return body;
    }

    public void setBody(CoreSpaceMemoryStrategy body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCoreSpaceCustomizedStrategyResponse that = (CreateCoreSpaceCustomizedStrategyResponse) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCoreSpaceCustomizedStrategyResponse {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
