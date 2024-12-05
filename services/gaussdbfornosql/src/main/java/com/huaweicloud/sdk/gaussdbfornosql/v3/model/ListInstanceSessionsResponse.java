package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

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
public class ListInstanceSessionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_sessions")

    private List<ListNodeSessionsResult> nodeSessions = null;

    public ListInstanceSessionsResponse withNodeSessions(List<ListNodeSessionsResult> nodeSessions) {
        this.nodeSessions = nodeSessions;
        return this;
    }

    public ListInstanceSessionsResponse addNodeSessionsItem(ListNodeSessionsResult nodeSessionsItem) {
        if (this.nodeSessions == null) {
            this.nodeSessions = new ArrayList<>();
        }
        this.nodeSessions.add(nodeSessionsItem);
        return this;
    }

    public ListInstanceSessionsResponse withNodeSessions(Consumer<List<ListNodeSessionsResult>> nodeSessionsSetter) {
        if (this.nodeSessions == null) {
            this.nodeSessions = new ArrayList<>();
        }
        nodeSessionsSetter.accept(this.nodeSessions);
        return this;
    }

    /**
     * 节点的会话信息列表。
     * @return nodeSessions
     */
    public List<ListNodeSessionsResult> getNodeSessions() {
        return nodeSessions;
    }

    public void setNodeSessions(List<ListNodeSessionsResult> nodeSessions) {
        this.nodeSessions = nodeSessions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceSessionsResponse that = (ListInstanceSessionsResponse) obj;
        return Objects.equals(this.nodeSessions, that.nodeSessions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeSessions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceSessionsResponse {\n");
        sb.append("    nodeSessions: ").append(toIndentedString(nodeSessions)).append("\n");
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
