package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowMgmtSiteStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirectJoinUrl")

    private String redirectJoinUrl;

    public ShowMgmtSiteStatusResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 管理站点状态 NORMAL:正常  FAULT:故障
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowMgmtSiteStatusResponse withRedirectJoinUrl(String redirectJoinUrl) {
        this.redirectJoinUrl = redirectJoinUrl;
        return this;
    }

    /**
     * 链接入会跳转url
     * @return redirectJoinUrl
     */
    public String getRedirectJoinUrl() {
        return redirectJoinUrl;
    }

    public void setRedirectJoinUrl(String redirectJoinUrl) {
        this.redirectJoinUrl = redirectJoinUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMgmtSiteStatusResponse that = (ShowMgmtSiteStatusResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.redirectJoinUrl, that.redirectJoinUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, redirectJoinUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMgmtSiteStatusResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    redirectJoinUrl: ").append(toIndentedString(redirectJoinUrl)).append("\n");
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
