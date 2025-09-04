package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateSubscriptionTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private SubscriptionTaskVo body;

    public UpdateSubscriptionTaskRequest withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 订阅任务id
     * minimum: 0
     * maximum: 999999999
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UpdateSubscriptionTaskRequest withBody(SubscriptionTaskVo body) {
        this.body = body;
        return this;
    }

    public UpdateSubscriptionTaskRequest withBody(Consumer<SubscriptionTaskVo> bodySetter) {
        if (this.body == null) {
            this.body = new SubscriptionTaskVo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SubscriptionTaskVo getBody() {
        return body;
    }

    public void setBody(SubscriptionTaskVo body) {
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
        UpdateSubscriptionTaskRequest that = (UpdateSubscriptionTaskRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSubscriptionTaskRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
