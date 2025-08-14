package com.huaweicloud.sdk.identitycenterstore.v1.model;

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
public class ListSessionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_list")

    private List<UserSessionDto> sessionList = null;

    public ListSessionsResponse withSessionList(List<UserSessionDto> sessionList) {
        this.sessionList = sessionList;
        return this;
    }

    public ListSessionsResponse addSessionListItem(UserSessionDto sessionListItem) {
        if (this.sessionList == null) {
            this.sessionList = new ArrayList<>();
        }
        this.sessionList.add(sessionListItem);
        return this;
    }

    public ListSessionsResponse withSessionList(Consumer<List<UserSessionDto>> sessionListSetter) {
        if (this.sessionList == null) {
            this.sessionList = new ArrayList<>();
        }
        sessionListSetter.accept(this.sessionList);
        return this;
    }

    /**
     * 用户登录会话列表
     * @return sessionList
     */
    public List<UserSessionDto> getSessionList() {
        return sessionList;
    }

    public void setSessionList(List<UserSessionDto> sessionList) {
        this.sessionList = sessionList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSessionsResponse that = (ListSessionsResponse) obj;
        return Objects.equals(this.sessionList, that.sessionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSessionsResponse {\n");
        sb.append("    sessionList: ").append(toIndentedString(sessionList)).append("\n");
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
