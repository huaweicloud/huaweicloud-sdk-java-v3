package com.huaweicloud.sdk.secmaster.v1.model;

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
public class ImportCollectorParserResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail")

    private Integer fail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<ImportParserVo> result = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Integer success;

    public ImportCollectorParserResponse withFail(Integer fail) {
        this.fail = fail;
        return this;
    }

    /**
     * 失败的数量
     * minimum: 0
     * maximum: 1024
     * @return fail
     */
    public Integer getFail() {
        return fail;
    }

    public void setFail(Integer fail) {
        this.fail = fail;
    }

    public ImportCollectorParserResponse withResult(List<ImportParserVo> result) {
        this.result = result;
        return this;
    }

    public ImportCollectorParserResponse addResultItem(ImportParserVo resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public ImportCollectorParserResponse withResult(Consumer<List<ImportParserVo>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 解析器数组
     * @return result
     */
    public List<ImportParserVo> getResult() {
        return result;
    }

    public void setResult(List<ImportParserVo> result) {
        this.result = result;
    }

    public ImportCollectorParserResponse withSuccess(Integer success) {
        this.success = success;
        return this;
    }

    /**
     * 成功的数量
     * minimum: 0
     * maximum: 1024
     * @return success
     */
    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportCollectorParserResponse that = (ImportCollectorParserResponse) obj;
        return Objects.equals(this.fail, that.fail) && Objects.equals(this.result, that.result)
            && Objects.equals(this.success, that.success);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fail, result, success);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportCollectorParserResponse {\n");
        sb.append("    fail: ").append(toIndentedString(fail)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
