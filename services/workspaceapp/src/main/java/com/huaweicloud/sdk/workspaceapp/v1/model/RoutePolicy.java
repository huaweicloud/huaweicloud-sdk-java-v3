package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 路由策略
 */
public class RoutePolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_session")

    private Integer maxSession;

    public RoutePolicy withMaxSession(Integer maxSession) {
        this.maxSession = maxSession;
        return this;
    }

    /**
     * 单台服务器最大的链接会话数
     * minimum: 1
     * maximum: 100
     * @return maxSession
     */
    public Integer getMaxSession() {
        return maxSession;
    }

    public void setMaxSession(Integer maxSession) {
        this.maxSession = maxSession;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoutePolicy that = (RoutePolicy) obj;
        return Objects.equals(this.maxSession, that.maxSession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSession);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoutePolicy {\n");
        sb.append("    maxSession: ").append(toIndentedString(maxSession)).append("\n");
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
