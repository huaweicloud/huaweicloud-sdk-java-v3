package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DisassociateSignatureKeyV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_bindings_id")

    private String signBindingsId;

    public DisassociateSignatureKeyV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，在API网关控制台的“实例信息”中获取。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DisassociateSignatureKeyV2Request withSignBindingsId(String signBindingsId) {
        this.signBindingsId = signBindingsId;
        return this;
    }

    /**
     * API与签名密钥的绑定关系编号
     * @return signBindingsId
     */
    public String getSignBindingsId() {
        return signBindingsId;
    }

    public void setSignBindingsId(String signBindingsId) {
        this.signBindingsId = signBindingsId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisassociateSignatureKeyV2Request that = (DisassociateSignatureKeyV2Request) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.signBindingsId, that.signBindingsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, signBindingsId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateSignatureKeyV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    signBindingsId: ").append(toIndentedString(signBindingsId)).append("\n");
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
