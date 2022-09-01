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
public class RecognizeQuotaInvoiceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    @JacksonXmlProperty(localName = "result")

    private QuotaInvoiceResult result;

    public RecognizeQuotaInvoiceResponse withResult(QuotaInvoiceResult result) {
        this.result = result;
        return this;
    }

    public RecognizeQuotaInvoiceResponse withResult(Consumer<QuotaInvoiceResult> resultSetter) {
        if (this.result == null) {
            this.result = new QuotaInvoiceResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public QuotaInvoiceResult getResult() {
        return result;
    }

    public void setResult(QuotaInvoiceResult result) {
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
        RecognizeQuotaInvoiceResponse recognizeQuotaInvoiceResponse = (RecognizeQuotaInvoiceResponse) o;
        return Objects.equals(this.result, recognizeQuotaInvoiceResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeQuotaInvoiceResponse {\n");
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
