package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateSparkJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "USER-ID")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateSparkJobRequestBody body;

    public CreateSparkJobRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 参数解释:   用户ID 示例: 48cc2c48765f481480c7db940d6409d1 约束限制:  无 取值范围: 无 默认取值: 无
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CreateSparkJobRequest withBody(CreateSparkJobRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateSparkJobRequest withBody(Consumer<CreateSparkJobRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateSparkJobRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateSparkJobRequestBody getBody() {
        return body;
    }

    public void setBody(CreateSparkJobRequestBody body) {
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
        CreateSparkJobRequest that = (CreateSparkJobRequest) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSparkJobRequest {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
