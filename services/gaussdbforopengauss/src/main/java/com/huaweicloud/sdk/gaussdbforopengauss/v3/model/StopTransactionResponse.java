package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class StopTransactionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_ids")

    private List<String> sessionIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    public StopTransactionResponse withSessionIds(List<String> sessionIds) {
        this.sessionIds = sessionIds;
        return this;
    }

    public StopTransactionResponse addSessionIdsItem(String sessionIdsItem) {
        if (this.sessionIds == null) {
            this.sessionIds = new ArrayList<>();
        }
        this.sessionIds.add(sessionIdsItem);
        return this;
    }

    public StopTransactionResponse withSessionIds(Consumer<List<String>> sessionIdsSetter) {
        if (this.sessionIds == null) {
            this.sessionIds = new ArrayList<>();
        }
        sessionIdsSetter.accept(this.sessionIds);
        return this;
    }

    /**
     * **参数解释**: 查杀事务ID列表。
     * @return sessionIds
     */
    public List<String> getSessionIds() {
        return sessionIds;
    }

    public void setSessionIds(List<String> sessionIds) {
        this.sessionIds = sessionIds;
    }

    public StopTransactionResponse withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * **参数解释**: 结束事务操作执行是否成功。 **取值范围**: -true：成功。 -false：未成功。
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StopTransactionResponse that = (StopTransactionResponse) obj;
        return Objects.equals(this.sessionIds, that.sessionIds) && Objects.equals(this.success, that.success);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionIds, success);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopTransactionResponse {\n");
        sb.append("    sessionIds: ").append(toIndentedString(sessionIds)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
