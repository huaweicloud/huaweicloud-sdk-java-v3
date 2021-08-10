package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class RecognizeTransportationLicenseResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private TransportationLicenseResult result;

    public RecognizeTransportationLicenseResponse withResult(TransportationLicenseResult result) {
        this.result = result;
        return this;
    }

    public RecognizeTransportationLicenseResponse withResult(Consumer<TransportationLicenseResult> resultSetter) {
        if (this.result == null) {
            this.result = new TransportationLicenseResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /** Get result
     * 
     * @return result */
    public TransportationLicenseResult getResult() {
        return result;
    }

    public void setResult(TransportationLicenseResult result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecognizeTransportationLicenseResponse recognizeTransportationLicenseResponse =
            (RecognizeTransportationLicenseResponse) o;
        return Objects.equals(this.result, recognizeTransportationLicenseResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeTransportationLicenseResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
