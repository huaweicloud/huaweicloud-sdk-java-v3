package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 镜像构建指令风险详情信息
 */
public class BuildCommandRiskDetailResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remediation")

    private String remediation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_instruction")

    private String buildInstruction;

    public BuildCommandRiskDetailResponseInfo withRemediation(String remediation) {
        this.remediation = remediation;
        return this;
    }

    /**
     * **参数解释** 风险的处置建议 **取值范围** 字符长度0-65534位
     * @return remediation
     */
    public String getRemediation() {
        return remediation;
    }

    public void setRemediation(String remediation) {
        this.remediation = remediation;
    }

    public BuildCommandRiskDetailResponseInfo withBuildInstruction(String buildInstruction) {
        this.buildInstruction = buildInstruction;
        return this;
    }

    /**
     * **参数解释** 存在风险的构建指令 **取值范围** 字符长度0-256位
     * @return buildInstruction
     */
    public String getBuildInstruction() {
        return buildInstruction;
    }

    public void setBuildInstruction(String buildInstruction) {
        this.buildInstruction = buildInstruction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BuildCommandRiskDetailResponseInfo that = (BuildCommandRiskDetailResponseInfo) obj;
        return Objects.equals(this.remediation, that.remediation)
            && Objects.equals(this.buildInstruction, that.buildInstruction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remediation, buildInstruction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuildCommandRiskDetailResponseInfo {\n");
        sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
        sb.append("    buildInstruction: ").append(toIndentedString(buildInstruction)).append("\n");
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
