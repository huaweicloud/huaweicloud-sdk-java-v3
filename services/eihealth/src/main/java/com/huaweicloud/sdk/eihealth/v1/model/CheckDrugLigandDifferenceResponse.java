package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CheckDrugLigandDifferenceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Float result;

    public CheckDrugLigandDifferenceResponse withResult(Float result) {
        this.result = result;
        return this;
    }

    /**
     * 差异值
     * @return result
     */
    public Float getResult() {
        return result;
    }

    public void setResult(Float result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckDrugLigandDifferenceResponse that = (CheckDrugLigandDifferenceResponse) obj;
        return Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckDrugLigandDifferenceResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
