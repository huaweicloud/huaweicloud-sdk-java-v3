package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CommRequestMindmapBackupPageParam
 */
public class CommRequestMindmapBackupPageParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private MindmapBackupPageParam params;

    public CommRequestMindmapBackupPageParam withParams(MindmapBackupPageParam params) {
        this.params = params;
        return this;
    }

    public CommRequestMindmapBackupPageParam withParams(Consumer<MindmapBackupPageParam> paramsSetter) {
        if (this.params == null) {
            this.params = new MindmapBackupPageParam();
            paramsSetter.accept(this.params);
        }

        return this;
    }

    /**
     * Get params
     * @return params
     */
    public MindmapBackupPageParam getParams() {
        return params;
    }

    public void setParams(MindmapBackupPageParam params) {
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
        CommRequestMindmapBackupPageParam that = (CommRequestMindmapBackupPageParam) obj;
        return Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommRequestMindmapBackupPageParam {\n");
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
