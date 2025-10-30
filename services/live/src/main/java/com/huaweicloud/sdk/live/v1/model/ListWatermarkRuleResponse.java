package com.huaweicloud.sdk.live.v1.model;

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
public class ListWatermarkRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules_infos")

    private List<WatermarkRule> rulesInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListWatermarkRuleResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListWatermarkRuleResponse withRulesInfos(List<WatermarkRule> rulesInfos) {
        this.rulesInfos = rulesInfos;
        return this;
    }

    public ListWatermarkRuleResponse addRulesInfosItem(WatermarkRule rulesInfosItem) {
        if (this.rulesInfos == null) {
            this.rulesInfos = new ArrayList<>();
        }
        this.rulesInfos.add(rulesInfosItem);
        return this;
    }

    public ListWatermarkRuleResponse withRulesInfos(Consumer<List<WatermarkRule>> rulesInfosSetter) {
        if (this.rulesInfos == null) {
            this.rulesInfos = new ArrayList<>();
        }
        rulesInfosSetter.accept(this.rulesInfos);
        return this;
    }

    /**
     * 响应数据
     * @return rulesInfos
     */
    public List<WatermarkRule> getRulesInfos() {
        return rulesInfos;
    }

    public void setRulesInfos(List<WatermarkRule> rulesInfos) {
        this.rulesInfos = rulesInfos;
    }

    public ListWatermarkRuleResponse withXRequestId(String xRequestId) {
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
        ListWatermarkRuleResponse that = (ListWatermarkRuleResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.rulesInfos, that.rulesInfos)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, rulesInfos, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWatermarkRuleResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    rulesInfos: ").append(toIndentedString(rulesInfos)).append("\n");
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
