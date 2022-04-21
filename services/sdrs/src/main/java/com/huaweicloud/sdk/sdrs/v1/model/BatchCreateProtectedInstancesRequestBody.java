package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量创建保护实例请求数据接口
 */
public class BatchCreateProtectedInstancesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_instances")

    private BatchCreateProtectedInstancesRequestParams protectedInstances;

    public BatchCreateProtectedInstancesRequestBody withProtectedInstances(
        BatchCreateProtectedInstancesRequestParams protectedInstances) {
        this.protectedInstances = protectedInstances;
        return this;
    }

    public BatchCreateProtectedInstancesRequestBody withProtectedInstances(
        Consumer<BatchCreateProtectedInstancesRequestParams> protectedInstancesSetter) {
        if (this.protectedInstances == null) {
            this.protectedInstances = new BatchCreateProtectedInstancesRequestParams();
            protectedInstancesSetter.accept(this.protectedInstances);
        }

        return this;
    }

    /**
     * Get protectedInstances
     * @return protectedInstances
     */
    public BatchCreateProtectedInstancesRequestParams getProtectedInstances() {
        return protectedInstances;
    }

    public void setProtectedInstances(BatchCreateProtectedInstancesRequestParams protectedInstances) {
        this.protectedInstances = protectedInstances;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchCreateProtectedInstancesRequestBody batchCreateProtectedInstancesRequestBody =
            (BatchCreateProtectedInstancesRequestBody) o;
        return Objects.equals(this.protectedInstances, batchCreateProtectedInstancesRequestBody.protectedInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectedInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateProtectedInstancesRequestBody {\n");
        sb.append("    protectedInstances: ").append(toIndentedString(protectedInstances)).append("\n");
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
