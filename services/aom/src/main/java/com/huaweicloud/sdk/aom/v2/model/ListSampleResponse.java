package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListSampleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "samples")

    private List<SampleDataValue> samples = null;

    public ListSampleResponse withSamples(List<SampleDataValue> samples) {
        this.samples = samples;
        return this;
    }

    public ListSampleResponse addSamplesItem(SampleDataValue samplesItem) {
        if (this.samples == null) {
            this.samples = new ArrayList<>();
        }
        this.samples.add(samplesItem);
        return this;
    }

    public ListSampleResponse withSamples(Consumer<List<SampleDataValue>> samplesSetter) {
        if (this.samples == null) {
            this.samples = new ArrayList<>();
        }
        samplesSetter.accept(this.samples);
        return this;
    }

    /** 时间序列对象列表。
     * 
     * @return samples */
    public List<SampleDataValue> getSamples() {
        return samples;
    }

    public void setSamples(List<SampleDataValue> samples) {
        this.samples = samples;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSampleResponse listSampleResponse = (ListSampleResponse) o;
        return Objects.equals(this.samples, listSampleResponse.samples);
    }

    @Override
    public int hashCode() {
        return Objects.hash(samples);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSampleResponse {\n");
        sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
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
