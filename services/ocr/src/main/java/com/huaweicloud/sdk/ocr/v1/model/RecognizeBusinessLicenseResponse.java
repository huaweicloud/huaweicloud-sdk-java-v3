package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class RecognizeBusinessLicenseResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    @JacksonXmlProperty(localName = "result")

    private BusinessLicenseResult result;

    public RecognizeBusinessLicenseResponse withResult(BusinessLicenseResult result) {
        this.result = result;
        return this;
    }

    public RecognizeBusinessLicenseResponse withResult(Consumer<BusinessLicenseResult> resultSetter) {
        if (this.result == null) {
            this.result = new BusinessLicenseResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public BusinessLicenseResult getResult() {
        return result;
    }

    public void setResult(BusinessLicenseResult result) {
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
        RecognizeBusinessLicenseResponse recognizeBusinessLicenseResponse = (RecognizeBusinessLicenseResponse) o;
        return Objects.equals(this.result, recognizeBusinessLicenseResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeBusinessLicenseResponse {\n");
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
