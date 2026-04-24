package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateFullSpeedRecordConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_id")

    private String recordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateScreenRecordsRequestBody body;

    public UpdateFullSpeedRecordConfigRequest withRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * 录屏记录UUID。
     * @return recordId
     */
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public UpdateFullSpeedRecordConfigRequest withBody(UpdateScreenRecordsRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateFullSpeedRecordConfigRequest withBody(Consumer<UpdateScreenRecordsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateScreenRecordsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateScreenRecordsRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateScreenRecordsRequestBody body) {
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
        UpdateFullSpeedRecordConfigRequest that = (UpdateFullSpeedRecordConfigRequest) obj;
        return Objects.equals(this.recordId, that.recordId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFullSpeedRecordConfigRequest {\n");
        sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
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
