package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PollingPolicySubscriptionDetails
 */
public class PollingPolicySubscriptionDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_urn")

    private String subscriptionUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public PollingPolicySubscriptionDetails withSubscriptionUrn(String subscriptionUrn) {
        this.subscriptionUrn = subscriptionUrn;
        return this;
    }

    /**
     * 当前轮询的序号。
     * @return subscriptionUrn
     */
    public String getSubscriptionUrn() {
        return subscriptionUrn;
    }

    public void setSubscriptionUrn(String subscriptionUrn) {
        this.subscriptionUrn = subscriptionUrn;
    }

    public PollingPolicySubscriptionDetails withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * 订阅终端urn列表。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public PollingPolicySubscriptionDetails withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 备注。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public PollingPolicySubscriptionDetails withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 订阅者状态：0表示订阅还未确认，1表示已经确认，3表示已经取消确认。
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PollingPolicySubscriptionDetails that = (PollingPolicySubscriptionDetails) obj;
        return Objects.equals(this.subscriptionUrn, that.subscriptionUrn)
            && Objects.equals(this.endpoint, that.endpoint) && Objects.equals(this.remark, that.remark)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionUrn, endpoint, remark, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PollingPolicySubscriptionDetails {\n");
        sb.append("    subscriptionUrn: ").append(toIndentedString(subscriptionUrn)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
