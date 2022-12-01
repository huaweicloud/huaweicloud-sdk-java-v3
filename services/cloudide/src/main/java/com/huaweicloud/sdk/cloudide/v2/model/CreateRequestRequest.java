package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateRequestRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topn")

    private Integer topn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scenario")

    private String scenario;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resubmit")

    private Boolean resubmit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private PropertiesSchema body;

    public CreateRequestRequest withTopn(Integer topn) {
        this.topn = topn;
        return this;
    }

    /**
     * the number of samples
     * minimum: 1
     * maximum: 30
     * @return topn
     */
    public Integer getTopn() {
        return topn;
    }

    public void setTopn(Integer topn) {
        this.topn = topn;
    }

    public CreateRequestRequest withScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }

    /**
     * the scenario of code content
     * @return scenario
     */
    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    public CreateRequestRequest withResubmit(Boolean resubmit) {
        this.resubmit = resubmit;
        return this;
    }

    /**
     * if `resubmit` is true, the de-duplication will be ignored
     * @return resubmit
     */
    public Boolean getResubmit() {
        return resubmit;
    }

    public void setResubmit(Boolean resubmit) {
        this.resubmit = resubmit;
    }

    public CreateRequestRequest withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * choose the model
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public CreateRequestRequest withBody(PropertiesSchema body) {
        this.body = body;
        return this;
    }

    public CreateRequestRequest withBody(Consumer<PropertiesSchema> bodySetter) {
        if (this.body == null) {
            this.body = new PropertiesSchema();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public PropertiesSchema getBody() {
        return body;
    }

    public void setBody(PropertiesSchema body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRequestRequest createRequestRequest = (CreateRequestRequest) o;
        return Objects.equals(this.topn, createRequestRequest.topn)
            && Objects.equals(this.scenario, createRequestRequest.scenario)
            && Objects.equals(this.resubmit, createRequestRequest.resubmit)
            && Objects.equals(this.modelId, createRequestRequest.modelId)
            && Objects.equals(this.body, createRequestRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topn, scenario, resubmit, modelId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRequestRequest {\n");
        sb.append("    topn: ").append(toIndentedString(topn)).append("\n");
        sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
        sb.append("    resubmit: ").append(toIndentedString(resubmit)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
