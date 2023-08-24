package com.huaweicloud.sdk.mssi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateFlowTemplateFromFlowResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apig_url")

    private String apigUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_id")

    private String flowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private List<Object> steps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webhook")

    private String webhook;

    public CreateFlowTemplateFromFlowResponse withApigUrl(String apigUrl) {
        this.apigUrl = apigUrl;
        return this;
    }

    /**
     * api流注册到apig的url
     * @return apigUrl
     */
    public String getApigUrl() {
        return apigUrl;
    }

    public void setApigUrl(String apigUrl) {
        this.apigUrl = apigUrl;
    }

    public CreateFlowTemplateFromFlowResponse withFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }

    /**
     * ID
     * @return flowId
     */
    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public CreateFlowTemplateFromFlowResponse withSteps(List<Object> steps) {
        this.steps = steps;
        return this;
    }

    public CreateFlowTemplateFromFlowResponse addStepsItem(Object stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public CreateFlowTemplateFromFlowResponse withSteps(Consumer<List<Object>> stepsSetter) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * 函数连接器对应functionId
     * @return steps
     */
    public List<Object> getSteps() {
        return steps;
    }

    public void setSteps(List<Object> steps) {
        this.steps = steps;
    }

    public CreateFlowTemplateFromFlowResponse withWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }

    /**
     * webhook触发url的ID
     * @return webhook
     */
    public String getWebhook() {
        return webhook;
    }

    public void setWebhook(String webhook) {
        this.webhook = webhook;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFlowTemplateFromFlowResponse that = (CreateFlowTemplateFromFlowResponse) obj;
        return Objects.equals(this.apigUrl, that.apigUrl) && Objects.equals(this.flowId, that.flowId)
            && Objects.equals(this.steps, that.steps) && Objects.equals(this.webhook, that.webhook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apigUrl, flowId, steps, webhook);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFlowTemplateFromFlowResponse {\n");
        sb.append("    apigUrl: ").append(toIndentedString(apigUrl)).append("\n");
        sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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
