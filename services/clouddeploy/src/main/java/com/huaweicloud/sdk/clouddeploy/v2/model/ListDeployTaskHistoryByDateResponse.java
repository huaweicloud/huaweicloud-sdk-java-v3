package com.huaweicloud.sdk.clouddeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDeployTaskHistoryByDateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    @JacksonXmlProperty(localName = "result")

    private List<ExecuteRecordV2Body> result = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    @JacksonXmlProperty(localName = "total_num")

    private Integer totalNum;

    public ListDeployTaskHistoryByDateResponse withResult(List<ExecuteRecordV2Body> result) {
        this.result = result;
        return this;
    }

    public ListDeployTaskHistoryByDateResponse addResultItem(ExecuteRecordV2Body resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public ListDeployTaskHistoryByDateResponse withResult(Consumer<List<ExecuteRecordV2Body>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 部署任务历史执行记录列表
     * @return result
     */
    public List<ExecuteRecordV2Body> getResult() {
        return result;
    }

    public void setResult(List<ExecuteRecordV2Body> result) {
        this.result = result;
    }

    public ListDeployTaskHistoryByDateResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 开始时间和结束时间内任务历史执行记录总数
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDeployTaskHistoryByDateResponse listDeployTaskHistoryByDateResponse =
            (ListDeployTaskHistoryByDateResponse) o;
        return Objects.equals(this.result, listDeployTaskHistoryByDateResponse.result)
            && Objects.equals(this.totalNum, listDeployTaskHistoryByDateResponse.totalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, totalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDeployTaskHistoryByDateResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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
