package com.huaweicloud.sdk.smn.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ListSubscriptionsItem
 */
public class ListSubscriptionsItem  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topic_urn")
    
    private String topicUrn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private String protocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subscription_urn")
    
    private String subscriptionUrn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="owner")
    
    private String owner;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endpoint")
    
    private String endpoint;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;

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
     * 不同协议对应不同的endpoint（接受消息的接入点）。目前支持的协议包括：  “email”：邮件传输协议，endpoint为邮箱地址。  “sms”：短信传输协议，endpoint为手机号码。  “functionstage”：FunctionGraph（函数）传输协议，endpoint为一个函数。  “functiongraph”：FunctionGraph（工作流）传输协议，endpoint为由一组函数编排成的工作流。  “http”、“https”：HTTP/HTTPS传输协议，endpoint为URL。
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSubscriptionsItem listSubscriptionsItem = (ListSubscriptionsItem) o;
        return Objects.equals(this.topicUrn, listSubscriptionsItem.topicUrn) &&
            Objects.equals(this.protocol, listSubscriptionsItem.protocol) &&
            Objects.equals(this.subscriptionUrn, listSubscriptionsItem.subscriptionUrn) &&
            Objects.equals(this.owner, listSubscriptionsItem.owner) &&
            Objects.equals(this.endpoint, listSubscriptionsItem.endpoint) &&
            Objects.equals(this.remark, listSubscriptionsItem.remark) &&
            Objects.equals(this.status, listSubscriptionsItem.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(topicUrn, protocol, subscriptionUrn, owner, endpoint, remark, status);
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

