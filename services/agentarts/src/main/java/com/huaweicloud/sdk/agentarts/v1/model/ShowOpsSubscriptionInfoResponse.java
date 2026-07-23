package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOpsSubscriptionInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscribe_apm_response")

    private SubscribeApmRes subscribeApmResponse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscribe_aom_response")

    private SubscribeAomRes subscribeAomResponse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscribe_lts_response")

    private SubscribeLtsRes subscribeLtsResponse;

    public ShowOpsSubscriptionInfoResponse withSubscribeApmResponse(SubscribeApmRes subscribeApmResponse) {
        this.subscribeApmResponse = subscribeApmResponse;
        return this;
    }

    public ShowOpsSubscriptionInfoResponse withSubscribeApmResponse(
        Consumer<SubscribeApmRes> subscribeApmResponseSetter) {
        if (this.subscribeApmResponse == null) {
            this.subscribeApmResponse = new SubscribeApmRes();
            subscribeApmResponseSetter.accept(this.subscribeApmResponse);
        }

        return this;
    }

    /**
     * Get subscribeApmResponse
     * @return subscribeApmResponse
     */
    public SubscribeApmRes getSubscribeApmResponse() {
        return subscribeApmResponse;
    }

    public void setSubscribeApmResponse(SubscribeApmRes subscribeApmResponse) {
        this.subscribeApmResponse = subscribeApmResponse;
    }

    public ShowOpsSubscriptionInfoResponse withSubscribeAomResponse(SubscribeAomRes subscribeAomResponse) {
        this.subscribeAomResponse = subscribeAomResponse;
        return this;
    }

    public ShowOpsSubscriptionInfoResponse withSubscribeAomResponse(
        Consumer<SubscribeAomRes> subscribeAomResponseSetter) {
        if (this.subscribeAomResponse == null) {
            this.subscribeAomResponse = new SubscribeAomRes();
            subscribeAomResponseSetter.accept(this.subscribeAomResponse);
        }

        return this;
    }

    /**
     * Get subscribeAomResponse
     * @return subscribeAomResponse
     */
    public SubscribeAomRes getSubscribeAomResponse() {
        return subscribeAomResponse;
    }

    public void setSubscribeAomResponse(SubscribeAomRes subscribeAomResponse) {
        this.subscribeAomResponse = subscribeAomResponse;
    }

    public ShowOpsSubscriptionInfoResponse withSubscribeLtsResponse(SubscribeLtsRes subscribeLtsResponse) {
        this.subscribeLtsResponse = subscribeLtsResponse;
        return this;
    }

    public ShowOpsSubscriptionInfoResponse withSubscribeLtsResponse(
        Consumer<SubscribeLtsRes> subscribeLtsResponseSetter) {
        if (this.subscribeLtsResponse == null) {
            this.subscribeLtsResponse = new SubscribeLtsRes();
            subscribeLtsResponseSetter.accept(this.subscribeLtsResponse);
        }

        return this;
    }

    /**
     * Get subscribeLtsResponse
     * @return subscribeLtsResponse
     */
    public SubscribeLtsRes getSubscribeLtsResponse() {
        return subscribeLtsResponse;
    }

    public void setSubscribeLtsResponse(SubscribeLtsRes subscribeLtsResponse) {
        this.subscribeLtsResponse = subscribeLtsResponse;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsSubscriptionInfoResponse that = (ShowOpsSubscriptionInfoResponse) obj;
        return Objects.equals(this.subscribeApmResponse, that.subscribeApmResponse)
            && Objects.equals(this.subscribeAomResponse, that.subscribeAomResponse)
            && Objects.equals(this.subscribeLtsResponse, that.subscribeLtsResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscribeApmResponse, subscribeAomResponse, subscribeLtsResponse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsSubscriptionInfoResponse {\n");
        sb.append("    subscribeApmResponse: ").append(toIndentedString(subscribeApmResponse)).append("\n");
        sb.append("    subscribeAomResponse: ").append(toIndentedString(subscribeAomResponse)).append("\n");
        sb.append("    subscribeLtsResponse: ").append(toIndentedString(subscribeLtsResponse)).append("\n");
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
