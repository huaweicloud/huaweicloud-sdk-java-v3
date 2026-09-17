package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListAnalysisResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk")

    private Boolean risk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private Object data;

    public ListAnalysisResultResponse withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * 是否成功
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ListAnalysisResultResponse withRisk(Boolean risk) {
        this.risk = risk;
        return this;
    }

    /**
     * 是否有风险
     * @return risk
     */
    public Boolean getRisk() {
        return risk;
    }

    public void setRisk(Boolean risk) {
        this.risk = risk;
    }

    public ListAnalysisResultResponse withData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * 分析数据
     * @return data
     */
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAnalysisResultResponse that = (ListAnalysisResultResponse) obj;
        return Objects.equals(this.success, that.success) && Objects.equals(this.risk, that.risk)
            && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, risk, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAnalysisResultResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
