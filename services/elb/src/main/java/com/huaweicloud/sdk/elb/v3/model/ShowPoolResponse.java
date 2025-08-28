package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPoolResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool")

    private Pool pool;

    public ShowPoolResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**：请求ID。  **取值范围**：由数字、小写字母和中划线（-）组成的字符串，自动生成。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ShowPoolResponse withPool(Pool pool) {
        this.pool = pool;
        return this;
    }

    public ShowPoolResponse withPool(Consumer<Pool> poolSetter) {
        if (this.pool == null) {
            this.pool = new Pool();
            poolSetter.accept(this.pool);
        }

        return this;
    }

    /**
     * Get pool
     * @return pool
     */
    public Pool getPool() {
        return pool;
    }

    public void setPool(Pool pool) {
        this.pool = pool;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPoolResponse that = (ShowPoolResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pool, that.pool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pool);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPoolResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
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
