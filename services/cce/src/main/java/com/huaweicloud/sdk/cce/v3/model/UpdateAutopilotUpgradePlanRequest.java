package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateAutopilotUpgradePlanRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_plan_id")

    private String upgradePlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DelayUpgradePlanRequestBody body;

    public UpdateAutopilotUpgradePlanRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UpdateAutopilotUpgradePlanRequest withUpgradePlanId(String upgradePlanId) {
        this.upgradePlanId = upgradePlanId;
        return this;
    }

    /**
     * 集群自动升级计划ID
     * @return upgradePlanId
     */
    public String getUpgradePlanId() {
        return upgradePlanId;
    }

    public void setUpgradePlanId(String upgradePlanId) {
        this.upgradePlanId = upgradePlanId;
    }

    public UpdateAutopilotUpgradePlanRequest withBody(DelayUpgradePlanRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateAutopilotUpgradePlanRequest withBody(Consumer<DelayUpgradePlanRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new DelayUpgradePlanRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DelayUpgradePlanRequestBody getBody() {
        return body;
    }

    public void setBody(DelayUpgradePlanRequestBody body) {
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
        UpdateAutopilotUpgradePlanRequest that = (UpdateAutopilotUpgradePlanRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.upgradePlanId, that.upgradePlanId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, upgradePlanId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAutopilotUpgradePlanRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    upgradePlanId: ").append(toIndentedString(upgradePlanId)).append("\n");
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
