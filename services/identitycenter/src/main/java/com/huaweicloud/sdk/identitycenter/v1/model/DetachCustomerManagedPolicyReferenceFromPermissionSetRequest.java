package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DetachCustomerManagedPolicyReferenceFromPermissionSetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_set_id")

    private String permissionSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DetachCustomerManagedPolicyReferenceFromPermissionSetReqBody body;

    public DetachCustomerManagedPolicyReferenceFromPermissionSetRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DetachCustomerManagedPolicyReferenceFromPermissionSetRequest withPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
        return this;
    }

    /**
     * Get permissionSetId
     * @return permissionSetId
     */
    public String getPermissionSetId() {
        return permissionSetId;
    }

    public void setPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
    }

    public DetachCustomerManagedPolicyReferenceFromPermissionSetRequest withBody(
        DetachCustomerManagedPolicyReferenceFromPermissionSetReqBody body) {
        this.body = body;
        return this;
    }

    public DetachCustomerManagedPolicyReferenceFromPermissionSetRequest withBody(
        Consumer<DetachCustomerManagedPolicyReferenceFromPermissionSetReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new DetachCustomerManagedPolicyReferenceFromPermissionSetReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DetachCustomerManagedPolicyReferenceFromPermissionSetReqBody getBody() {
        return body;
    }

    public void setBody(DetachCustomerManagedPolicyReferenceFromPermissionSetReqBody body) {
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
        DetachCustomerManagedPolicyReferenceFromPermissionSetRequest that =
            (DetachCustomerManagedPolicyReferenceFromPermissionSetRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.permissionSetId, that.permissionSetId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, permissionSetId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetachCustomerManagedPolicyReferenceFromPermissionSetRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    permissionSetId: ").append(toIndentedString(permissionSetId)).append("\n");
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
