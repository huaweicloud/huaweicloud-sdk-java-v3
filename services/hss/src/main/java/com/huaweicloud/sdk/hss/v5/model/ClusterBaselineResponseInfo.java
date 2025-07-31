package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 基线检查项信息
 */
public class ClusterBaselineResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_desc")

    private String baselineDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_index")

    private String baselineIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_type")

    private String baselineType;

    public ClusterBaselineResponseInfo withBaselineDesc(String baselineDesc) {
        this.baselineDesc = baselineDesc;
        return this;
    }

    /**
     * 检查项描述
     * @return baselineDesc
     */
    public String getBaselineDesc() {
        return baselineDesc;
    }

    public void setBaselineDesc(String baselineDesc) {
        this.baselineDesc = baselineDesc;
    }

    public ClusterBaselineResponseInfo withBaselineIndex(String baselineIndex) {
        this.baselineIndex = baselineIndex;
        return this;
    }

    /**
     * 检查项ID
     * @return baselineIndex
     */
    public String getBaselineIndex() {
        return baselineIndex;
    }

    public void setBaselineIndex(String baselineIndex) {
        this.baselineIndex = baselineIndex;
    }

    public ClusterBaselineResponseInfo withBaselineType(String baselineType) {
        this.baselineType = baselineType;
        return this;
    }

    /**
     * 检查项类型
     * @return baselineType
     */
    public String getBaselineType() {
        return baselineType;
    }

    public void setBaselineType(String baselineType) {
        this.baselineType = baselineType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterBaselineResponseInfo that = (ClusterBaselineResponseInfo) obj;
        return Objects.equals(this.baselineDesc, that.baselineDesc)
            && Objects.equals(this.baselineIndex, that.baselineIndex)
            && Objects.equals(this.baselineType, that.baselineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baselineDesc, baselineIndex, baselineType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterBaselineResponseInfo {\n");
        sb.append("    baselineDesc: ").append(toIndentedString(baselineDesc)).append("\n");
        sb.append("    baselineIndex: ").append(toIndentedString(baselineIndex)).append("\n");
        sb.append("    baselineType: ").append(toIndentedString(baselineType)).append("\n");
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
