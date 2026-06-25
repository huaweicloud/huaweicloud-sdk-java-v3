package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreatePoolRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-ModelArts-User-ID")

    private String xModelArtsUserID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreatePoolRequestBody body;

    public CreatePoolRequest withXModelArtsUserID(String xModelArtsUserID) {
        this.xModelArtsUserID = xModelArtsUserID;
        return this;
    }

    /**
     * **参数解释**：实际的外部租户ID，如果有的话，工作空间鉴权以该ID为准。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return xModelArtsUserID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-ModelArts-User-ID")
    public String getXModelArtsUserID() {
        return xModelArtsUserID;
    }

    public void setXModelArtsUserID(String xModelArtsUserID) {
        this.xModelArtsUserID = xModelArtsUserID;
    }

    public CreatePoolRequest withBody(CreatePoolRequestBody body) {
        this.body = body;
        return this;
    }

    public CreatePoolRequest withBody(Consumer<CreatePoolRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreatePoolRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreatePoolRequestBody getBody() {
        return body;
    }

    public void setBody(CreatePoolRequestBody body) {
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
        CreatePoolRequest that = (CreatePoolRequest) obj;
        return Objects.equals(this.xModelArtsUserID, that.xModelArtsUserID) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xModelArtsUserID, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePoolRequest {\n");
        sb.append("    xModelArtsUserID: ").append(toIndentedString(xModelArtsUserID)).append("\n");
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
