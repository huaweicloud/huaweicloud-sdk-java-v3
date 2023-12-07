package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListControlsForAccountRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_account_id")

    private String managedAccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Security-Token")

    private String xSecurityToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListControlsForAccountRequest withManagedAccountId(String managedAccountId) {
        this.managedAccountId = managedAccountId;
        return this;
    }

    /**
     * 账号ID。
     * @return managedAccountId
     */
    public String getManagedAccountId() {
        return managedAccountId;
    }

    public void setManagedAccountId(String managedAccountId) {
        this.managedAccountId = managedAccountId;
    }

    public ListControlsForAccountRequest withXSecurityToken(String xSecurityToken) {
        this.xSecurityToken = xSecurityToken;
        return this;
    }

    /**
     * 如果正在使用临时安全凭据，则此header是必需的，该值是临时安全凭据的安全令牌（会话令牌）。
     * @return xSecurityToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Security-Token")
    public String getXSecurityToken() {
        return xSecurityToken;
    }

    public void setXSecurityToken(String xSecurityToken) {
        this.xSecurityToken = xSecurityToken;
    }

    public ListControlsForAccountRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页页面的最大值。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListControlsForAccountRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 页面标记。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListControlsForAccountRequest that = (ListControlsForAccountRequest) obj;
        return Objects.equals(this.managedAccountId, that.managedAccountId)
            && Objects.equals(this.xSecurityToken, that.xSecurityToken) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managedAccountId, xSecurityToken, limit, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListControlsForAccountRequest {\n");
        sb.append("    managedAccountId: ").append(toIndentedString(managedAccountId)).append("\n");
        sb.append("    xSecurityToken: ").append(toIndentedString(xSecurityToken)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
