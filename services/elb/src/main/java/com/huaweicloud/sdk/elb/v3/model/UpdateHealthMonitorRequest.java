package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateHealthMonitorRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitor_id")

    private String healthmonitorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateHealthMonitorRequestBody body;

    public UpdateHealthMonitorRequest withHealthmonitorId(String healthmonitorId) {
        this.healthmonitorId = healthmonitorId;
        return this;
    }

    /**
     * **参数解释**：健康检查ID  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return healthmonitorId
     */
    public String getHealthmonitorId() {
        return healthmonitorId;
    }

    public void setHealthmonitorId(String healthmonitorId) {
        this.healthmonitorId = healthmonitorId;
    }

    public UpdateHealthMonitorRequest withBody(UpdateHealthMonitorRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateHealthMonitorRequest withBody(Consumer<UpdateHealthMonitorRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateHealthMonitorRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateHealthMonitorRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateHealthMonitorRequestBody body) {
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
        UpdateHealthMonitorRequest that = (UpdateHealthMonitorRequest) obj;
        return Objects.equals(this.healthmonitorId, that.healthmonitorId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthmonitorId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHealthMonitorRequest {\n");
        sb.append("    healthmonitorId: ").append(toIndentedString(healthmonitorId)).append("\n");
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
