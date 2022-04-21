package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDisasterRecoveryDrillNameRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery_drill_id")

    private String disasterRecoveryDrillId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateDisasterRecoveryDrillNameRequestBody body;

    public UpdateDisasterRecoveryDrillNameRequest withDisasterRecoveryDrillId(String disasterRecoveryDrillId) {
        this.disasterRecoveryDrillId = disasterRecoveryDrillId;
        return this;
    }

    /**
     * 容灾演练的ID。
     * @return disasterRecoveryDrillId
     */
    public String getDisasterRecoveryDrillId() {
        return disasterRecoveryDrillId;
    }

    public void setDisasterRecoveryDrillId(String disasterRecoveryDrillId) {
        this.disasterRecoveryDrillId = disasterRecoveryDrillId;
    }

    public UpdateDisasterRecoveryDrillNameRequest withBody(UpdateDisasterRecoveryDrillNameRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateDisasterRecoveryDrillNameRequest withBody(
        Consumer<UpdateDisasterRecoveryDrillNameRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateDisasterRecoveryDrillNameRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateDisasterRecoveryDrillNameRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateDisasterRecoveryDrillNameRequestBody body) {
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
        UpdateDisasterRecoveryDrillNameRequest updateDisasterRecoveryDrillNameRequest =
            (UpdateDisasterRecoveryDrillNameRequest) o;
        return Objects.equals(this.disasterRecoveryDrillId,
            updateDisasterRecoveryDrillNameRequest.disasterRecoveryDrillId)
            && Objects.equals(this.body, updateDisasterRecoveryDrillNameRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disasterRecoveryDrillId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDisasterRecoveryDrillNameRequest {\n");
        sb.append("    disasterRecoveryDrillId: ").append(toIndentedString(disasterRecoveryDrillId)).append("\n");
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
