package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListWebTamperProtectStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_failed_nums")

    private Integer protectFailedNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redundant_nums")

    private Integer redundantNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unprotect_nums")

    private Integer unprotectNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_nums")

    private Integer protectedNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_total_nums")

    private Integer protectTotalNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_event_nums")

    private Integer protectedEventNums;

    public ListWebTamperProtectStatisticsResponse withProtectFailedNums(Integer protectFailedNums) {
        this.protectFailedNums = protectFailedNums;
        return this;
    }

    /**
     * 防护失败的数量
     * minimum: 0
     * maximum: 2147483647
     * @return protectFailedNums
     */
    public Integer getProtectFailedNums() {
        return protectFailedNums;
    }

    public void setProtectFailedNums(Integer protectFailedNums) {
        this.protectFailedNums = protectFailedNums;
    }

    public ListWebTamperProtectStatisticsResponse withRedundantNums(Integer redundantNums) {
        this.redundantNums = redundantNums;
        return this;
    }

    /**
     * 防护冗余数量
     * minimum: 0
     * maximum: 2147483647
     * @return redundantNums
     */
    public Integer getRedundantNums() {
        return redundantNums;
    }

    public void setRedundantNums(Integer redundantNums) {
        this.redundantNums = redundantNums;
    }

    public ListWebTamperProtectStatisticsResponse withUnprotectNums(Integer unprotectNums) {
        this.unprotectNums = unprotectNums;
        return this;
    }

    /**
     * 未防护数量
     * minimum: 0
     * maximum: 2147483647
     * @return unprotectNums
     */
    public Integer getUnprotectNums() {
        return unprotectNums;
    }

    public void setUnprotectNums(Integer unprotectNums) {
        this.unprotectNums = unprotectNums;
    }

    public ListWebTamperProtectStatisticsResponse withProtectedNums(Integer protectedNums) {
        this.protectedNums = protectedNums;
        return this;
    }

    /**
     * 已防护数量
     * minimum: 0
     * maximum: 2147483647
     * @return protectedNums
     */
    public Integer getProtectedNums() {
        return protectedNums;
    }

    public void setProtectedNums(Integer protectedNums) {
        this.protectedNums = protectedNums;
    }

    public ListWebTamperProtectStatisticsResponse withProtectTotalNums(Integer protectTotalNums) {
        this.protectTotalNums = protectTotalNums;
        return this;
    }

    /**
     * 防护资产总数
     * minimum: 0
     * maximum: 2147483647
     * @return protectTotalNums
     */
    public Integer getProtectTotalNums() {
        return protectTotalNums;
    }

    public void setProtectTotalNums(Integer protectTotalNums) {
        this.protectTotalNums = protectTotalNums;
    }

    public ListWebTamperProtectStatisticsResponse withProtectedEventNums(Integer protectedEventNums) {
        this.protectedEventNums = protectedEventNums;
        return this;
    }

    /**
     * 防护事件数量
     * minimum: 0
     * maximum: 2147483647
     * @return protectedEventNums
     */
    public Integer getProtectedEventNums() {
        return protectedEventNums;
    }

    public void setProtectedEventNums(Integer protectedEventNums) {
        this.protectedEventNums = protectedEventNums;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWebTamperProtectStatisticsResponse that = (ListWebTamperProtectStatisticsResponse) obj;
        return Objects.equals(this.protectFailedNums, that.protectFailedNums)
            && Objects.equals(this.redundantNums, that.redundantNums)
            && Objects.equals(this.unprotectNums, that.unprotectNums)
            && Objects.equals(this.protectedNums, that.protectedNums)
            && Objects.equals(this.protectTotalNums, that.protectTotalNums)
            && Objects.equals(this.protectedEventNums, that.protectedEventNums);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(protectFailedNums, redundantNums, unprotectNums, protectedNums, protectTotalNums, protectedEventNums);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWebTamperProtectStatisticsResponse {\n");
        sb.append("    protectFailedNums: ").append(toIndentedString(protectFailedNums)).append("\n");
        sb.append("    redundantNums: ").append(toIndentedString(redundantNums)).append("\n");
        sb.append("    unprotectNums: ").append(toIndentedString(unprotectNums)).append("\n");
        sb.append("    protectedNums: ").append(toIndentedString(protectedNums)).append("\n");
        sb.append("    protectTotalNums: ").append(toIndentedString(protectTotalNums)).append("\n");
        sb.append("    protectedEventNums: ").append(toIndentedString(protectedEventNums)).append("\n");
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
