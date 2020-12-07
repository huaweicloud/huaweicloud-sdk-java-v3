package com.huaweicloud.sdk.smn.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class AddSubscriptionResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subscription_urn")
    
    private String subscriptionUrn;

    public AddSubscriptionResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * 请求的唯一标识ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public AddSubscriptionResponse withSubscriptionUrn(String subscriptionUrn) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddSubscriptionResponse addSubscriptionResponse = (AddSubscriptionResponse) o;
        return Objects.equals(this.requestId, addSubscriptionResponse.requestId) &&
            Objects.equals(this.subscriptionUrn, addSubscriptionResponse.subscriptionUrn);
    }
    @Override
    public int hashCode() {
        return Objects.hash(requestId, subscriptionUrn);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddSubscriptionResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    subscriptionUrn: ").append(toIndentedString(subscriptionUrn)).append("\n");
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

