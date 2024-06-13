package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CommRequestMindmapPageParamV3
 */
public class CommRequestMindmapPageParamV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private MindmapPageParamV3 params;

    public CommRequestMindmapPageParamV3 withParams(MindmapPageParamV3 params) {
        this.params = params;
        return this;
    }

    public CommRequestMindmapPageParamV3 withParams(Consumer<MindmapPageParamV3> paramsSetter) {
        if (this.params == null) {
            this.params = new MindmapPageParamV3();
            paramsSetter.accept(this.params);
        }

        return this;
    }

    /**
     * Get params
     * @return params
     */
    public MindmapPageParamV3 getParams() {
        return params;
    }

    public void setParams(MindmapPageParamV3 params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommRequestMindmapPageParamV3 that = (CommRequestMindmapPageParamV3) obj;
        return Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommRequestMindmapPageParamV3 {\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
