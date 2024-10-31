package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CommRequestUpdateAssetTreeParam
 */
public class CommRequestUpdateAssetTreeParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private UpdateAssetTreeParam params;

    public CommRequestUpdateAssetTreeParam withParams(UpdateAssetTreeParam params) {
        this.params = params;
        return this;
    }

    public CommRequestUpdateAssetTreeParam withParams(Consumer<UpdateAssetTreeParam> paramsSetter) {
        if (this.params == null) {
            this.params = new UpdateAssetTreeParam();
            paramsSetter.accept(this.params);
        }

        return this;
    }

    /**
     * Get params
     * @return params
     */
    public UpdateAssetTreeParam getParams() {
        return params;
    }

    public void setParams(UpdateAssetTreeParam params) {
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
        CommRequestUpdateAssetTreeParam that = (CommRequestUpdateAssetTreeParam) obj;
        return Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommRequestUpdateAssetTreeParam {\n");
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
