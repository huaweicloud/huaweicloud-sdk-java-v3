package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDeleteAiAppsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_policy")

    private Boolean keepPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchDeleteRequest body;

    public BatchDeleteAiAppsRequest withKeepPolicy(Boolean keepPolicy) {
        this.keepPolicy = keepPolicy;
        return this;
    }

    /**
     * **参数解释：** 是否保留关联的策略 **约束限制：** 不涉及 **取值范围：** true, false **默认取值：** 不涉及
     * @return keepPolicy
     */
    public Boolean getKeepPolicy() {
        return keepPolicy;
    }

    public void setKeepPolicy(Boolean keepPolicy) {
        this.keepPolicy = keepPolicy;
    }

    public BatchDeleteAiAppsRequest withBody(BatchDeleteRequest body) {
        this.body = body;
        return this;
    }

    public BatchDeleteAiAppsRequest withBody(Consumer<BatchDeleteRequest> bodySetter) {
        if (this.body == null) {
            this.body = new BatchDeleteRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchDeleteRequest getBody() {
        return body;
    }

    public void setBody(BatchDeleteRequest body) {
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
        BatchDeleteAiAppsRequest that = (BatchDeleteAiAppsRequest) obj;
        return Objects.equals(this.keepPolicy, that.keepPolicy) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepPolicy, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteAiAppsRequest {\n");
        sb.append("    keepPolicy: ").append(toIndentedString(keepPolicy)).append("\n");
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
