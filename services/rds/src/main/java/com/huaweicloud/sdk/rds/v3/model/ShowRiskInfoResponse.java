package com.huaweicloud.sdk.rds.v3.model;

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
public class ShowRiskInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risks")

    private List<EngineRiskDesc> risks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ShowRiskInfoResponse withRisks(List<EngineRiskDesc> risks) {
        this.risks = risks;
        return this;
    }

    public ShowRiskInfoResponse addRisksItem(EngineRiskDesc risksItem) {
        if (this.risks == null) {
            this.risks = new ArrayList<>();
        }
        this.risks.add(risksItem);
        return this;
    }

    public ShowRiskInfoResponse withRisks(Consumer<List<EngineRiskDesc>> risksSetter) {
        if (this.risks == null) {
            this.risks = new ArrayList<>();
        }
        risksSetter.accept(this.risks);
        return this;
    }

    /**
     * 风险版本信息
     * @return risks
     */
    public List<EngineRiskDesc> getRisks() {
        return risks;
    }

    public void setRisks(List<EngineRiskDesc> risks) {
        this.risks = risks;
    }

    public ShowRiskInfoResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRiskInfoResponse that = (ShowRiskInfoResponse) obj;
        return Objects.equals(this.risks, that.risks) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(risks, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRiskInfoResponse {\n");
        sb.append("    risks: ").append(toIndentedString(risks)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
