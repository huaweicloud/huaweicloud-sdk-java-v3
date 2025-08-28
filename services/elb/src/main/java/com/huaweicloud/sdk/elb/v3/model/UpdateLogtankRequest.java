package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateLogtankRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logtank_id")

    private String logtankId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateLogtankRequestBody body;

    public UpdateLogtankRequest withLogtankId(String logtankId) {
        this.logtankId = logtankId;
        return this;
    }

    /**
     * **参数解释**：云日志ID。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return logtankId
     */
    public String getLogtankId() {
        return logtankId;
    }

    public void setLogtankId(String logtankId) {
        this.logtankId = logtankId;
    }

    public UpdateLogtankRequest withBody(UpdateLogtankRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateLogtankRequest withBody(Consumer<UpdateLogtankRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateLogtankRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateLogtankRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateLogtankRequestBody body) {
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
        UpdateLogtankRequest that = (UpdateLogtankRequest) obj;
        return Objects.equals(this.logtankId, that.logtankId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logtankId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLogtankRequest {\n");
        sb.append("    logtankId: ").append(toIndentedString(logtankId)).append("\n");
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
