package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UnsubscribeCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unsubscribe_results")

    private String unsubscribeResults;

    public UnsubscribeCertificateResponse withUnsubscribeResults(String unsubscribeResults) {
        this.unsubscribeResults = unsubscribeResults;
        return this;
    }

    /**
     * 退订结果。
     * @return unsubscribeResults
     */
    public String getUnsubscribeResults() {
        return unsubscribeResults;
    }

    public void setUnsubscribeResults(String unsubscribeResults) {
        this.unsubscribeResults = unsubscribeResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnsubscribeCertificateResponse that = (UnsubscribeCertificateResponse) obj;
        return Objects.equals(this.unsubscribeResults, that.unsubscribeResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unsubscribeResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnsubscribeCertificateResponse {\n");
        sb.append("    unsubscribeResults: ").append(toIndentedString(unsubscribeResults)).append("\n");
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
