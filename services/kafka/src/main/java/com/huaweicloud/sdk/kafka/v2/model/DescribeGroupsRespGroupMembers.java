package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DescribeGroupsRespGroupMembers
 */
public class DescribeGroupsRespGroupMembers {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_id")

    private String memberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    public DescribeGroupsRespGroupMembers withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 消费组consumer地址。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public DescribeGroupsRespGroupMembers withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * 消费组consumer的ID。
     * @return memberId
     */
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public DescribeGroupsRespGroupMembers withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * 客户端ID。
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DescribeGroupsRespGroupMembers that = (DescribeGroupsRespGroupMembers) obj;
        return Objects.equals(this.host, that.host) && Objects.equals(this.memberId, that.memberId)
            && Objects.equals(this.clientId, that.clientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, memberId, clientId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DescribeGroupsRespGroupMembers {\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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
