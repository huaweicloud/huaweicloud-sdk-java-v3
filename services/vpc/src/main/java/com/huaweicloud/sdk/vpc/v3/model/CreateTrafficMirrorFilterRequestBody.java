package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class CreateTrafficMirrorFilterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_filter")

    private CreateTrafficMirrorFilterOption trafficMirrorFilter;

    public CreateTrafficMirrorFilterRequestBody withTrafficMirrorFilter(
        CreateTrafficMirrorFilterOption trafficMirrorFilter) {
        this.trafficMirrorFilter = trafficMirrorFilter;
        return this;
    }

    public CreateTrafficMirrorFilterRequestBody withTrafficMirrorFilter(
        Consumer<CreateTrafficMirrorFilterOption> trafficMirrorFilterSetter) {
        if (this.trafficMirrorFilter == null) {
            this.trafficMirrorFilter = new CreateTrafficMirrorFilterOption();
            trafficMirrorFilterSetter.accept(this.trafficMirrorFilter);
        }

        return this;
    }

    /**
     * Get trafficMirrorFilter
     * @return trafficMirrorFilter
     */
    public CreateTrafficMirrorFilterOption getTrafficMirrorFilter() {
        return trafficMirrorFilter;
    }

    public void setTrafficMirrorFilter(CreateTrafficMirrorFilterOption trafficMirrorFilter) {
        this.trafficMirrorFilter = trafficMirrorFilter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTrafficMirrorFilterRequestBody that = (CreateTrafficMirrorFilterRequestBody) obj;
        return Objects.equals(this.trafficMirrorFilter, that.trafficMirrorFilter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficMirrorFilter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTrafficMirrorFilterRequestBody {\n");
        sb.append("    trafficMirrorFilter: ").append(toIndentedString(trafficMirrorFilter)).append("\n");
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
