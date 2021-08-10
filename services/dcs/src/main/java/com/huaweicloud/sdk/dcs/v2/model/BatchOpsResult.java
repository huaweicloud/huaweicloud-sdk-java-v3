package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 批量删除实例接口返回结构体 */
public class BatchOpsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private String instance;

    public BatchOpsResult withResult(String result) {
        this.result = result;
        return this;
    }

    /** 操作结果，取值有success或failed。
     * 
     * @return result */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public BatchOpsResult withInstance(String instance) {
        this.instance = instance;
        return this;
    }

    /** 缓存实例ID。
     * 
     * @return instance */
    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchOpsResult batchOpsResult = (BatchOpsResult) o;
        return Objects.equals(this.result, batchOpsResult.result)
            && Objects.equals(this.instance, batchOpsResult.instance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, instance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchOpsResult {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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
