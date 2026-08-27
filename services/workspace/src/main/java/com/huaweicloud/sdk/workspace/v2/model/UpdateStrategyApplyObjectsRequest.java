package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateStrategyApplyObjectsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_id")

    private String strategyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateStrategyApplyObjectsRequestBody body;

    public UpdateStrategyApplyObjectsRequest withStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }

    /**
     * 策略ID
     * @return strategyId
     */
    public String getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(String strategyId) {
        this.strategyId = strategyId;
    }

    public UpdateStrategyApplyObjectsRequest withBody(UpdateStrategyApplyObjectsRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateStrategyApplyObjectsRequest withBody(Consumer<UpdateStrategyApplyObjectsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateStrategyApplyObjectsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateStrategyApplyObjectsRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateStrategyApplyObjectsRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateStrategyApplyObjectsRequest that = (UpdateStrategyApplyObjectsRequest) obj;
        return Objects.equals(this.strategyId, that.strategyId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strategyId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateStrategyApplyObjectsRequest {\n");
        sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
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
