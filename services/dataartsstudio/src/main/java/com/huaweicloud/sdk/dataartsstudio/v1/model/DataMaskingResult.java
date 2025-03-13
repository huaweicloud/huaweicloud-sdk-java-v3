package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据脱敏诊断结果
 */
public class DataMaskingResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private DiagnoseResult result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public DataMaskingResult withResult(DiagnoseResult result) {
        this.result = result;
        return this;
    }

    /**
     * Get result
     * @return result
     */
    public DiagnoseResult getResult() {
        return result;
    }

    public void setResult(DiagnoseResult result) {
        this.result = result;
    }

    public DataMaskingResult withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 没有配置脱敏任务的表数量
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataMaskingResult that = (DataMaskingResult) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataMaskingResult {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
