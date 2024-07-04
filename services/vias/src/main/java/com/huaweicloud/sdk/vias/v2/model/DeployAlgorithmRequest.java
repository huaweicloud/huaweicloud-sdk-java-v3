package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeployAlgorithmRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alg_id")

    private String algId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DeployServiceReq body;

    public DeployAlgorithmRequest withAlgId(String algId) {
        this.algId = algId;
        return this;
    }

    /**
     * 算法ID
     * @return algId
     */
    public String getAlgId() {
        return algId;
    }

    public void setAlgId(String algId) {
        this.algId = algId;
    }

    public DeployAlgorithmRequest withBody(DeployServiceReq body) {
        this.body = body;
        return this;
    }

    public DeployAlgorithmRequest withBody(Consumer<DeployServiceReq> bodySetter) {
        if (this.body == null) {
            this.body = new DeployServiceReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DeployServiceReq getBody() {
        return body;
    }

    public void setBody(DeployServiceReq body) {
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
        DeployAlgorithmRequest that = (DeployAlgorithmRequest) obj;
        return Objects.equals(this.algId, that.algId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(algId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployAlgorithmRequest {\n");
        sb.append("    algId: ").append(toIndentedString(algId)).append("\n");
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
