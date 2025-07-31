package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateNetworkPolicyRequestInfo
 */
public class CreateNetworkPolicyRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_content")

    private NetworkPolicyBody policyContent;

    public CreateNetworkPolicyRequestInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateNetworkPolicyRequestInfo withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public CreateNetworkPolicyRequestInfo withPolicyContent(NetworkPolicyBody policyContent) {
        this.policyContent = policyContent;
        return this;
    }

    public CreateNetworkPolicyRequestInfo withPolicyContent(Consumer<NetworkPolicyBody> policyContentSetter) {
        if (this.policyContent == null) {
            this.policyContent = new NetworkPolicyBody();
            policyContentSetter.accept(this.policyContent);
        }

        return this;
    }

    /**
     * Get policyContent
     * @return policyContent
     */
    public NetworkPolicyBody getPolicyContent() {
        return policyContent;
    }

    public void setPolicyContent(NetworkPolicyBody policyContent) {
        this.policyContent = policyContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateNetworkPolicyRequestInfo that = (CreateNetworkPolicyRequestInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.policyContent, that.policyContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, namespace, policyContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNetworkPolicyRequestInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    policyContent: ").append(toIndentedString(policyContent)).append("\n");
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
