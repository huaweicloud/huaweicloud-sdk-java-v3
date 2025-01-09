package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowServerGroupRestrictResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_session")

    private Integer maxSession;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_group_count")

    private Integer maxGroupCount;

    public ShowServerGroupRestrictResponse withMaxSession(Integer maxSession) {
        this.maxSession = maxSession;
        return this;
    }

    /**
     * 单台服务器最大的链接会话数。
     * @return maxSession
     */
    public Integer getMaxSession() {
        return maxSession;
    }

    public void setMaxSession(Integer maxSession) {
        this.maxSession = maxSession;
    }

    public ShowServerGroupRestrictResponse withMaxGroupCount(Integer maxGroupCount) {
        this.maxGroupCount = maxGroupCount;
        return this;
    }

    /**
     * 该租户可创建的最多服务器组数量。
     * @return maxGroupCount
     */
    public Integer getMaxGroupCount() {
        return maxGroupCount;
    }

    public void setMaxGroupCount(Integer maxGroupCount) {
        this.maxGroupCount = maxGroupCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowServerGroupRestrictResponse that = (ShowServerGroupRestrictResponse) obj;
        return Objects.equals(this.maxSession, that.maxSession)
            && Objects.equals(this.maxGroupCount, that.maxGroupCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSession, maxGroupCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerGroupRestrictResponse {\n");
        sb.append("    maxSession: ").append(toIndentedString(maxSession)).append("\n");
        sb.append("    maxGroupCount: ").append(toIndentedString(maxGroupCount)).append("\n");
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
