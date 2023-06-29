package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateAccessPolicyObjectsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_policy_id")

    private String accessPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateAccessPolicyObjectsReq body;

    public UpdateAccessPolicyObjectsRequest withAccessPolicyId(String accessPolicyId) {
        this.accessPolicyId = accessPolicyId;
        return this;
    }

    /**
     * 接入策略id。
     * @return accessPolicyId
     */
    public String getAccessPolicyId() {
        return accessPolicyId;
    }

    public void setAccessPolicyId(String accessPolicyId) {
        this.accessPolicyId = accessPolicyId;
    }

    public UpdateAccessPolicyObjectsRequest withBody(UpdateAccessPolicyObjectsReq body) {
        this.body = body;
        return this;
    }

    public UpdateAccessPolicyObjectsRequest withBody(Consumer<UpdateAccessPolicyObjectsReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateAccessPolicyObjectsReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateAccessPolicyObjectsReq getBody() {
        return body;
    }

    public void setBody(UpdateAccessPolicyObjectsReq body) {
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
        UpdateAccessPolicyObjectsRequest that = (UpdateAccessPolicyObjectsRequest) obj;
        return Objects.equals(this.accessPolicyId, that.accessPolicyId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessPolicyId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAccessPolicyObjectsRequest {\n");
        sb.append("    accessPolicyId: ").append(toIndentedString(accessPolicyId)).append("\n");
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
