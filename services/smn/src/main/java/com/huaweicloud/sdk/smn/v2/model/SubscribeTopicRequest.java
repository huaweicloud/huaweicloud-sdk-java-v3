package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class SubscribeTopicRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    public SubscribeTopicRequest withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * Topic的唯一的资源标识，可通过[查询主题列表](smn_api_51004.xml)获取该标识。
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public SubscribeTopicRequest withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * 订阅终端地址。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public SubscribeTopicRequest withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * 订阅主题Token信息。
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscribeTopicRequest that = (SubscribeTopicRequest) obj;
        return Objects.equals(this.topicUrn, that.topicUrn) && Objects.equals(this.endpoint, that.endpoint)
            && Objects.equals(this.token, that.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicUrn, endpoint, token);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscribeTopicRequest {\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
