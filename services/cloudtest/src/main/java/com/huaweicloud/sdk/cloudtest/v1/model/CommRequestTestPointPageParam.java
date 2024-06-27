package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CommRequestTestPointPageParam
 */
public class CommRequestTestPointPageParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private TestPointPageParam params;

    public CommRequestTestPointPageParam withParams(TestPointPageParam params) {
        this.params = params;
        return this;
    }

    public CommRequestTestPointPageParam withParams(Consumer<TestPointPageParam> paramsSetter) {
        if (this.params == null) {
            this.params = new TestPointPageParam();
            paramsSetter.accept(this.params);
        }

        return this;
    }

    /**
     * Get params
     * @return params
     */
    public TestPointPageParam getParams() {
        return params;
    }

    public void setParams(TestPointPageParam params) {
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
        CommRequestTestPointPageParam that = (CommRequestTestPointPageParam) obj;
        return Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommRequestTestPointPageParam {\n");
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
