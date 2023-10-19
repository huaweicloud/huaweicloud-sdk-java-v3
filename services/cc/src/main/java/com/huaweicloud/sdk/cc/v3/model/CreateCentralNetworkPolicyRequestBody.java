package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建中心网络策略的请求体。
 */
public class CreateCentralNetworkPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_policy_document")

    private CentralNetworkPolicyDocument centralNetworkPolicyDocument;

    public CreateCentralNetworkPolicyRequestBody withCentralNetworkPolicyDocument(
        CentralNetworkPolicyDocument centralNetworkPolicyDocument) {
        this.centralNetworkPolicyDocument = centralNetworkPolicyDocument;
        return this;
    }

    public CreateCentralNetworkPolicyRequestBody withCentralNetworkPolicyDocument(
        Consumer<CentralNetworkPolicyDocument> centralNetworkPolicyDocumentSetter) {
        if (this.centralNetworkPolicyDocument == null) {
            this.centralNetworkPolicyDocument = new CentralNetworkPolicyDocument();
            centralNetworkPolicyDocumentSetter.accept(this.centralNetworkPolicyDocument);
        }

        return this;
    }

    /**
     * Get centralNetworkPolicyDocument
     * @return centralNetworkPolicyDocument
     */
    public CentralNetworkPolicyDocument getCentralNetworkPolicyDocument() {
        return centralNetworkPolicyDocument;
    }

    public void setCentralNetworkPolicyDocument(CentralNetworkPolicyDocument centralNetworkPolicyDocument) {
        this.centralNetworkPolicyDocument = centralNetworkPolicyDocument;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCentralNetworkPolicyRequestBody that = (CreateCentralNetworkPolicyRequestBody) obj;
        return Objects.equals(this.centralNetworkPolicyDocument, that.centralNetworkPolicyDocument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(centralNetworkPolicyDocument);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCentralNetworkPolicyRequestBody {\n");
        sb.append("    centralNetworkPolicyDocument: ")
            .append(toIndentedString(centralNetworkPolicyDocument))
            .append("\n");
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
