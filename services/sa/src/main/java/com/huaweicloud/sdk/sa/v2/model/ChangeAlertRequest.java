package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ChangeAlertRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_id")

    private String alertId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ChangeAlertRequestBody body;

    public ChangeAlertRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * ID of workspace
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ChangeAlertRequest withAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }

    /**
     * 告警ID
     * @return alertId
     */
    public String getAlertId() {
        return alertId;
    }

    public void setAlertId(String alertId) {
        this.alertId = alertId;
    }

    public ChangeAlertRequest withBody(ChangeAlertRequestBody body) {
        this.body = body;
        return this;
    }

    public ChangeAlertRequest withBody(Consumer<ChangeAlertRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ChangeAlertRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ChangeAlertRequestBody getBody() {
        return body;
    }

    public void setBody(ChangeAlertRequestBody body) {
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
        ChangeAlertRequest changeAlertRequest = (ChangeAlertRequest) o;
        return Objects.equals(this.workspaceId, changeAlertRequest.workspaceId)
            && Objects.equals(this.alertId, changeAlertRequest.alertId)
            && Objects.equals(this.body, changeAlertRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, alertId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeAlertRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    alertId: ").append(toIndentedString(alertId)).append("\n");
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
