package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSlowLogDetailSampleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample")

    private SlowLogDetail sample;

    public ShowSlowLogDetailSampleResponse withSample(SlowLogDetail sample) {
        this.sample = sample;
        return this;
    }

    public ShowSlowLogDetailSampleResponse withSample(Consumer<SlowLogDetail> sampleSetter) {
        if (this.sample == null) {
            this.sample = new SlowLogDetail();
            sampleSetter.accept(this.sample);
        }

        return this;
    }

    /**
     * Get sample
     * @return sample
     */
    public SlowLogDetail getSample() {
        return sample;
    }

    public void setSample(SlowLogDetail sample) {
        this.sample = sample;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSlowLogDetailSampleResponse that = (ShowSlowLogDetailSampleResponse) obj;
        return Objects.equals(this.sample, that.sample);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sample);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSlowLogDetailSampleResponse {\n");
        sb.append("    sample: ").append(toIndentedString(sample)).append("\n");
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
