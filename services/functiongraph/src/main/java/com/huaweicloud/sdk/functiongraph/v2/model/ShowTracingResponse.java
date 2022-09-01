package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowTracingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracing_ak")

    @JacksonXmlProperty(localName = "tracing_ak")

    private String tracingAk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracing_sk")

    @JacksonXmlProperty(localName = "tracing_sk")

    private String tracingSk;

    public ShowTracingResponse withTracingAk(String tracingAk) {
        this.tracingAk = tracingAk;
        return this;
    }

    /**
     * apm的ak
     * @return tracingAk
     */
    public String getTracingAk() {
        return tracingAk;
    }

    public void setTracingAk(String tracingAk) {
        this.tracingAk = tracingAk;
    }

    public ShowTracingResponse withTracingSk(String tracingSk) {
        this.tracingSk = tracingSk;
        return this;
    }

    /**
     * apm的sk
     * @return tracingSk
     */
    public String getTracingSk() {
        return tracingSk;
    }

    public void setTracingSk(String tracingSk) {
        this.tracingSk = tracingSk;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTracingResponse showTracingResponse = (ShowTracingResponse) o;
        return Objects.equals(this.tracingAk, showTracingResponse.tracingAk)
            && Objects.equals(this.tracingSk, showTracingResponse.tracingSk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tracingAk, tracingSk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTracingResponse {\n");
        sb.append("    tracingAk: ").append(toIndentedString(tracingAk)).append("\n");
        sb.append("    tracingSk: ").append(toIndentedString(tracingSk)).append("\n");
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
