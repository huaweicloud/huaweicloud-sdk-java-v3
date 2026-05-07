package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: 漏洞修复失败原因 **取值范围**: 不涉及 
 */
public class VulRepairFailedDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "software")

    private String software;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason_description")

    private String reasonDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason_describtion")

    private String reasonDescribtion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason_solution")

    private String reasonSolution;

    public VulRepairFailedDetailInfo withSoftware(String software) {
        this.software = software;
        return this;
    }

    /**
     * **参数解释**: 软件名称 **取值范围**: 字符长度1-512位 
     * @return software
     */
    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public VulRepairFailedDetailInfo withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * **参数解释**: 漏洞修复失败原因详情 **取值范围**: 字符长度0-65535位 
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public VulRepairFailedDetailInfo withReasonDescription(String reasonDescription) {
        this.reasonDescription = reasonDescription;
        return this;
    }

    /**
     * **参数解释**: 漏洞修复失败原因解释说明 **取值范围**: 字符长度0-256位 
     * @return reasonDescription
     */
    public String getReasonDescription() {
        return reasonDescription;
    }

    public void setReasonDescription(String reasonDescription) {
        this.reasonDescription = reasonDescription;
    }

    public VulRepairFailedDetailInfo withReasonDescribtion(String reasonDescribtion) {
        this.reasonDescribtion = reasonDescribtion;
        return this;
    }

    /**
     * **参数解释**: 漏洞修复失败原因解释说明，已废弃 **取值范围**: 字符长度0-256位 
     * @return reasonDescribtion
     */
    public String getReasonDescribtion() {
        return reasonDescribtion;
    }

    public void setReasonDescribtion(String reasonDescribtion) {
        this.reasonDescribtion = reasonDescribtion;
    }

    public VulRepairFailedDetailInfo withReasonSolution(String reasonSolution) {
        this.reasonSolution = reasonSolution;
        return this;
    }

    /**
     * **参数解释**: 解决方式说明 **取值范围**: 字符长度0-65535位 
     * @return reasonSolution
     */
    public String getReasonSolution() {
        return reasonSolution;
    }

    public void setReasonSolution(String reasonSolution) {
        this.reasonSolution = reasonSolution;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulRepairFailedDetailInfo that = (VulRepairFailedDetailInfo) obj;
        return Objects.equals(this.software, that.software) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.reasonDescription, that.reasonDescription)
            && Objects.equals(this.reasonDescribtion, that.reasonDescribtion)
            && Objects.equals(this.reasonSolution, that.reasonSolution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(software, reason, reasonDescription, reasonDescribtion, reasonSolution);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulRepairFailedDetailInfo {\n");
        sb.append("    software: ").append(toIndentedString(software)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    reasonDescription: ").append(toIndentedString(reasonDescription)).append("\n");
        sb.append("    reasonDescribtion: ").append(toIndentedString(reasonDescribtion)).append("\n");
        sb.append("    reasonSolution: ").append(toIndentedString(reasonSolution)).append("\n");
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
