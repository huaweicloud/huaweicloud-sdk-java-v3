package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowMetricTreeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "architecture")

    private List<ArchitectureStatistic> architecture = null;

    public ShowMetricTreeResponse withArchitecture(List<ArchitectureStatistic> architecture) {
        this.architecture = architecture;
        return this;
    }

    public ShowMetricTreeResponse addArchitectureItem(ArchitectureStatistic architectureItem) {
        if (this.architecture == null) {
            this.architecture = new ArrayList<>();
        }
        this.architecture.add(architectureItem);
        return this;
    }

    public ShowMetricTreeResponse withArchitecture(Consumer<List<ArchitectureStatistic>> architectureSetter) {
        if (this.architecture == null) {
            this.architecture = new ArrayList<>();
        }
        architectureSetter.accept(this.architecture);
        return this;
    }

    /**
     * 结构体系
     * @return architecture
     */
    public List<ArchitectureStatistic> getArchitecture() {
        return architecture;
    }

    public void setArchitecture(List<ArchitectureStatistic> architecture) {
        this.architecture = architecture;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMetricTreeResponse showMetricTreeResponse = (ShowMetricTreeResponse) o;
        return Objects.equals(this.architecture, showMetricTreeResponse.architecture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(architecture);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMetricTreeResponse {\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
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
