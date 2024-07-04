package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class StopDeployAlgorithmResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alg_id")

    private String algId;

    public StopDeployAlgorithmResponse withAlgId(String algId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StopDeployAlgorithmResponse that = (StopDeployAlgorithmResponse) obj;
        return Objects.equals(this.algId, that.algId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(algId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopDeployAlgorithmResponse {\n");
        sb.append("    algId: ").append(toIndentedString(algId)).append("\n");
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
