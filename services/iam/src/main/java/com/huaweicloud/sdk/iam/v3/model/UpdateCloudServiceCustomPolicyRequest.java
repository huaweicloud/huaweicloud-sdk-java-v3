package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateCloudServiceCustomPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateCloudServiceCustomPolicyRequestBody body;

    public UpdateCloudServiceCustomPolicyRequest withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * 待修改的自定义策略ID，获取方式请参见：[自定义策略ID](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=IAM&api=ListCustomPolicies)。
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public UpdateCloudServiceCustomPolicyRequest withBody(UpdateCloudServiceCustomPolicyRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateCloudServiceCustomPolicyRequest withBody(
        Consumer<UpdateCloudServiceCustomPolicyRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateCloudServiceCustomPolicyRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateCloudServiceCustomPolicyRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateCloudServiceCustomPolicyRequestBody body) {
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
        UpdateCloudServiceCustomPolicyRequest updateCloudServiceCustomPolicyRequest =
            (UpdateCloudServiceCustomPolicyRequest) o;
        return Objects.equals(this.roleId, updateCloudServiceCustomPolicyRequest.roleId)
            && Objects.equals(this.body, updateCloudServiceCustomPolicyRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCloudServiceCustomPolicyRequest {\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
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
