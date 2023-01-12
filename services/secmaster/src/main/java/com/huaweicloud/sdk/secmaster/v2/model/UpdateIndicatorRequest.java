package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateIndicatorRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indicator_id")

    private String indicatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateIndicatorRequestBody body;

    public UpdateIndicatorRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * workspace id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public UpdateIndicatorRequest withIndicatorId(String indicatorId) {
        this.indicatorId = indicatorId;
        return this;
    }

    /**
     * ID of indicator
     * @return indicatorId
     */
    public String getIndicatorId() {
        return indicatorId;
    }

    public void setIndicatorId(String indicatorId) {
        this.indicatorId = indicatorId;
    }

    public UpdateIndicatorRequest withBody(UpdateIndicatorRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateIndicatorRequest withBody(Consumer<UpdateIndicatorRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateIndicatorRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateIndicatorRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateIndicatorRequestBody body) {
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
        UpdateIndicatorRequest updateIndicatorRequest = (UpdateIndicatorRequest) o;
        return Objects.equals(this.workspaceId, updateIndicatorRequest.workspaceId)
            && Objects.equals(this.indicatorId, updateIndicatorRequest.indicatorId)
            && Objects.equals(this.body, updateIndicatorRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, indicatorId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIndicatorRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    indicatorId: ").append(toIndentedString(indicatorId)).append("\n");
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
