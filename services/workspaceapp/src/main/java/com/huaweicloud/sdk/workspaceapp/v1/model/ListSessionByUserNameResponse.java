package com.huaweicloud.sdk.workspaceapp.v1.model;

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
public class ListSessionByUserNameResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_info_list")

    private List<AppSession> sessionInfoList = null;

    public ListSessionByUserNameResponse withSessionInfoList(List<AppSession> sessionInfoList) {
        this.sessionInfoList = sessionInfoList;
        return this;
    }

    public ListSessionByUserNameResponse addSessionInfoListItem(AppSession sessionInfoListItem) {
        if (this.sessionInfoList == null) {
            this.sessionInfoList = new ArrayList<>();
        }
        this.sessionInfoList.add(sessionInfoListItem);
        return this;
    }

    public ListSessionByUserNameResponse withSessionInfoList(Consumer<List<AppSession>> sessionInfoListSetter) {
        if (this.sessionInfoList == null) {
            this.sessionInfoList = new ArrayList<>();
        }
        sessionInfoListSetter.accept(this.sessionInfoList);
        return this;
    }

    /**
     * 会话信息列表。
     * @return sessionInfoList
     */
    public List<AppSession> getSessionInfoList() {
        return sessionInfoList;
    }

    public void setSessionInfoList(List<AppSession> sessionInfoList) {
        this.sessionInfoList = sessionInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSessionByUserNameResponse that = (ListSessionByUserNameResponse) obj;
        return Objects.equals(this.sessionInfoList, that.sessionInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSessionByUserNameResponse {\n");
        sb.append("    sessionInfoList: ").append(toIndentedString(sessionInfoList)).append("\n");
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
