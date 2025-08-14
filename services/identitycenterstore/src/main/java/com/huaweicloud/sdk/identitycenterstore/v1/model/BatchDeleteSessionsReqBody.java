package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteSessionsReqBody
 */
public class BatchDeleteSessionsReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_ids")

    private List<String> sessionIds = null;

    public BatchDeleteSessionsReqBody withSessionIds(List<String> sessionIds) {
        this.sessionIds = sessionIds;
        return this;
    }

    public BatchDeleteSessionsReqBody addSessionIdsItem(String sessionIdsItem) {
        if (this.sessionIds == null) {
            this.sessionIds = new ArrayList<>();
        }
        this.sessionIds.add(sessionIdsItem);
        return this;
    }

    public BatchDeleteSessionsReqBody withSessionIds(Consumer<List<String>> sessionIdsSetter) {
        if (this.sessionIds == null) {
            this.sessionIds = new ArrayList<>();
        }
        sessionIdsSetter.accept(this.sessionIds);
        return this;
    }

    /**
     * 用户登录会话标识符（ID）
     * @return sessionIds
     */
    public List<String> getSessionIds() {
        return sessionIds;
    }

    public void setSessionIds(List<String> sessionIds) {
        this.sessionIds = sessionIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteSessionsReqBody that = (BatchDeleteSessionsReqBody) obj;
        return Objects.equals(this.sessionIds, that.sessionIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteSessionsReqBody {\n");
        sb.append("    sessionIds: ").append(toIndentedString(sessionIds)).append("\n");
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
