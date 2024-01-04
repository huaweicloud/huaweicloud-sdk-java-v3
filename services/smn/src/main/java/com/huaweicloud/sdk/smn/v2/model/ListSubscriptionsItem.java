package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListSubscriptionsItem
 */
public class ListSubscriptionsItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_urn")

    private String subscriptionUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_polices")

    private List<SubscriptionsFilterPolicy> filterPolices = null;

    public ListSubscriptionsItem withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * Topic的唯一的资源标识。
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public ListSubscriptionsItem withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 不同协议对应不同的endpoint（接受消息的接入点）。目前支持的协议包括：  \"default\": 默认协议。  “email”：邮件传输协议，endpoint为邮箱地址。  “sms”：短信传输协议，endpoint为手机号码。  “functionstage”：FunctionGraph（函数）传输协议，endpoint为一个函数。  “http”、“https”：HTTP/HTTPS传输协议，endpoint为URL。
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public ListSubscriptionsItem withSubscriptionUrn(String subscriptionUrn) {
        this.subscriptionUrn = subscriptionUrn;
        return this;
    }

    /**
     * 订阅者的唯一资源标识。
     * @return subscriptionUrn
     */
    public String getSubscriptionUrn() {
        return subscriptionUrn;
    }

    public void setSubscriptionUrn(String subscriptionUrn) {
        this.subscriptionUrn = subscriptionUrn;
    }

    public ListSubscriptionsItem withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Topic创建者的项目ID。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ListSubscriptionsItem withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * 接受消息的接入点。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public ListSubscriptionsItem withRemark(String remark) {
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

    public ListSubscriptionsItem withStatus(Integer status) {
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

    public ListSubscriptionsItem withFilterPolices(List<SubscriptionsFilterPolicy> filterPolices) {
        this.filterPolices = filterPolices;
        return this;
    }

    public ListSubscriptionsItem addFilterPolicesItem(SubscriptionsFilterPolicy filterPolicesItem) {
        if (this.filterPolices == null) {
            this.filterPolices = new ArrayList<>();
        }
        this.filterPolices.add(filterPolicesItem);
        return this;
    }

    public ListSubscriptionsItem withFilterPolices(Consumer<List<SubscriptionsFilterPolicy>> filterPolicesSetter) {
        if (this.filterPolices == null) {
            this.filterPolices = new ArrayList<>();
        }
        filterPolicesSetter.accept(this.filterPolices);
        return this;
    }

    /**
     * Get filterPolices
     * @return filterPolices
     */
    public List<SubscriptionsFilterPolicy> getFilterPolices() {
        return filterPolices;
    }

    public void setFilterPolices(List<SubscriptionsFilterPolicy> filterPolices) {
        this.filterPolices = filterPolices;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubscriptionsItem that = (ListSubscriptionsItem) obj;
        return Objects.equals(this.topicUrn, that.topicUrn) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.subscriptionUrn, that.subscriptionUrn) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.endpoint, that.endpoint) && Objects.equals(this.remark, that.remark)
            && Objects.equals(this.status, that.status) && Objects.equals(this.filterPolices, that.filterPolices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicUrn, protocol, subscriptionUrn, owner, endpoint, remark, status, filterPolices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubscriptionsItem {\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    subscriptionUrn: ").append(toIndentedString(subscriptionUrn)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    filterPolices: ").append(toIndentedString(filterPolices)).append("\n");
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
