package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 敏感识别规则诊断结果
 */
public class IdentificationRuleResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private DiagnoseResult result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_info")

    private List<SecurityLevelInfo> abnormalInfo = null;

    public IdentificationRuleResult withResult(DiagnoseResult result) {
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

    public IdentificationRuleResult withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 有风险的问题数量
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

    public IdentificationRuleResult withAbnormalInfo(List<SecurityLevelInfo> abnormalInfo) {
        this.abnormalInfo = abnormalInfo;
        return this;
    }

    public IdentificationRuleResult addAbnormalInfoItem(SecurityLevelInfo abnormalInfoItem) {
        if (this.abnormalInfo == null) {
            this.abnormalInfo = new ArrayList<>();
        }
        this.abnormalInfo.add(abnormalInfoItem);
        return this;
    }

    public IdentificationRuleResult withAbnormalInfo(Consumer<List<SecurityLevelInfo>> abnormalInfoSetter) {
        if (this.abnormalInfo == null) {
            this.abnormalInfo = new ArrayList<>();
        }
        abnormalInfoSetter.accept(this.abnormalInfo);
        return this;
    }

    /**
     * 没有配置识别规则的密级列表
     * @return abnormalInfo
     */
    public List<SecurityLevelInfo> getAbnormalInfo() {
        return abnormalInfo;
    }

    public void setAbnormalInfo(List<SecurityLevelInfo> abnormalInfo) {
        this.abnormalInfo = abnormalInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdentificationRuleResult that = (IdentificationRuleResult) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.count, that.count)
            && Objects.equals(this.abnormalInfo, that.abnormalInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, count, abnormalInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdentificationRuleResult {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    abnormalInfo: ").append(toIndentedString(abnormalInfo)).append("\n");
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
