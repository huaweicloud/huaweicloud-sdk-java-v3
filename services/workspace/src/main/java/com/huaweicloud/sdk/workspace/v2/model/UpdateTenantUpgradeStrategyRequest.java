package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateTenantUpgradeStrategyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_id")

    private String strategyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateTenantUpgradeStrategyRequestBody body;

    public UpdateTenantUpgradeStrategyRequest withStrategyId(String strategyId) {
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

    public UpdateTenantUpgradeStrategyRequest withBody(UpdateTenantUpgradeStrategyRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateTenantUpgradeStrategyRequest withBody(Consumer<UpdateTenantUpgradeStrategyRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateTenantUpgradeStrategyRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateTenantUpgradeStrategyRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateTenantUpgradeStrategyRequestBody body) {
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
        UpdateTenantUpgradeStrategyRequest that = (UpdateTenantUpgradeStrategyRequest) obj;
        return Objects.equals(this.strategyId, that.strategyId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strategyId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTenantUpgradeStrategyRequest {\n");
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
