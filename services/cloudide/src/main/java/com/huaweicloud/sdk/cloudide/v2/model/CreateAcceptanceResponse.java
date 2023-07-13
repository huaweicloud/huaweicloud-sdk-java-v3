package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateAcceptanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acceptance_id")

    private Integer acceptanceId;

    public CreateAcceptanceResponse withAcceptanceId(Integer acceptanceId) {
        this.acceptanceId = acceptanceId;
        return this;
    }

    /**
     * acceptance_id
     * minimum: 0
     * maximum: 2147483647
     * @return acceptanceId
     */
    public Integer getAcceptanceId() {
        return acceptanceId;
    }

    public void setAcceptanceId(Integer acceptanceId) {
        this.acceptanceId = acceptanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAcceptanceResponse that = (CreateAcceptanceResponse) obj;
        return Objects.equals(this.acceptanceId, that.acceptanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acceptanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAcceptanceResponse {\n");
        sb.append("    acceptanceId: ").append(toIndentedString(acceptanceId)).append("\n");
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
