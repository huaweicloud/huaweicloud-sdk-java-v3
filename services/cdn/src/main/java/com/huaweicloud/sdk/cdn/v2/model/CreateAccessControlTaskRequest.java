package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateAccessControlTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UrlAccessControlTaskRequestBody body;

    public CreateAccessControlTaskRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 操作类型， **约束限制：** 不涉及 **取值范围：** - ban：禁用 - unban：解禁  **默认取值：** 不涉及
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public CreateAccessControlTaskRequest withBody(UrlAccessControlTaskRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateAccessControlTaskRequest withBody(Consumer<UrlAccessControlTaskRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UrlAccessControlTaskRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UrlAccessControlTaskRequestBody getBody() {
        return body;
    }

    public void setBody(UrlAccessControlTaskRequestBody body) {
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
        CreateAccessControlTaskRequest that = (CreateAccessControlTaskRequest) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAccessControlTaskRequest {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
