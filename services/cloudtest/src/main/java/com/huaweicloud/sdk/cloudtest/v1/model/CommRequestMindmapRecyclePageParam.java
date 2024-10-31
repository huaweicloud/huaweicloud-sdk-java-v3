package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CommRequestMindmapRecyclePageParam
 */
public class CommRequestMindmapRecyclePageParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private MindmapRecyclePageParam params;

    public CommRequestMindmapRecyclePageParam withParams(MindmapRecyclePageParam params) {
        this.params = params;
        return this;
    }

    public CommRequestMindmapRecyclePageParam withParams(Consumer<MindmapRecyclePageParam> paramsSetter) {
        if (this.params == null) {
            this.params = new MindmapRecyclePageParam();
            paramsSetter.accept(this.params);
        }

        return this;
    }

    /**
     * Get params
     * @return params
     */
    public MindmapRecyclePageParam getParams() {
        return params;
    }

    public void setParams(MindmapRecyclePageParam params) {
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
        CommRequestMindmapRecyclePageParam that = (CommRequestMindmapRecyclePageParam) obj;
        return Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommRequestMindmapRecyclePageParam {\n");
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
