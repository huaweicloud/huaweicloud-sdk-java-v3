package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteInstancesSessionRequestBody
 */
public class DeleteInstancesSessionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_all")

    private Boolean isAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_ids")

    private List<String> sessionIds = null;

    public DeleteInstancesSessionRequestBody withIsAll(Boolean isAll) {
        this.isAll = isAll;
        return this;
    }

    /**
     * 是否删除全部会话。
     * @return isAll
     */
    public Boolean getIsAll() {
        return isAll;
    }

    public void setIsAll(Boolean isAll) {
        this.isAll = isAll;
    }

    public DeleteInstancesSessionRequestBody withSessionIds(List<String> sessionIds) {
        this.sessionIds = sessionIds;
        return this;
    }

    public DeleteInstancesSessionRequestBody addSessionIdsItem(String sessionIdsItem) {
        if (this.sessionIds == null) {
            this.sessionIds = new ArrayList<>();
        }
        this.sessionIds.add(sessionIdsItem);
        return this;
    }

    public DeleteInstancesSessionRequestBody withSessionIds(Consumer<List<String>> sessionIdsSetter) {
        if (this.sessionIds == null) {
            this.sessionIds = new ArrayList<>();
        }
        sessionIdsSetter.accept(this.sessionIds);
        return this;
    }

    /**
     * 需要删除的会话id。is_all为false的时候，session_ids为必填，不能为空。
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
        DeleteInstancesSessionRequestBody that = (DeleteInstancesSessionRequestBody) obj;
        return Objects.equals(this.isAll, that.isAll) && Objects.equals(this.sessionIds, that.sessionIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAll, sessionIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteInstancesSessionRequestBody {\n");
        sb.append("    isAll: ").append(toIndentedString(isAll)).append("\n");
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
