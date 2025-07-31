package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAntivirusFreeQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_quota")

    private Integer freeQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occupied_free_quota")

    private Integer occupiedFreeQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "antivirus_already_given")

    private Boolean antivirusAlreadyGiven;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "antivirus_free_quota")

    private Integer antivirusFreeQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_already_given")

    private Boolean reportAlreadyGiven;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_free_quota")

    private Integer reportFreeQuota;

    public ShowAntivirusFreeQuotaResponse withFreeQuota(Integer freeQuota) {
        this.freeQuota = freeQuota;
        return this;
    }

    /**
     * 病毒查杀免费扫描次数
     * @return freeQuota
     */
    public Integer getFreeQuota() {
        return freeQuota;
    }

    public void setFreeQuota(Integer freeQuota) {
        this.freeQuota = freeQuota;
    }

    public ShowAntivirusFreeQuotaResponse withOccupiedFreeQuota(Integer occupiedFreeQuota) {
        this.occupiedFreeQuota = occupiedFreeQuota;
        return this;
    }

    /**
     * 当前扫描任务占用的免费扫描次数
     * @return occupiedFreeQuota
     */
    public Integer getOccupiedFreeQuota() {
        return occupiedFreeQuota;
    }

    public void setOccupiedFreeQuota(Integer occupiedFreeQuota) {
        this.occupiedFreeQuota = occupiedFreeQuota;
    }

    public ShowAntivirusFreeQuotaResponse withAntivirusAlreadyGiven(Boolean antivirusAlreadyGiven) {
        this.antivirusAlreadyGiven = antivirusAlreadyGiven;
        return this;
    }

    /**
     * 病毒查杀界面是否已经赠送过免费次数
     * @return antivirusAlreadyGiven
     */
    public Boolean getAntivirusAlreadyGiven() {
        return antivirusAlreadyGiven;
    }

    public void setAntivirusAlreadyGiven(Boolean antivirusAlreadyGiven) {
        this.antivirusAlreadyGiven = antivirusAlreadyGiven;
    }

    public ShowAntivirusFreeQuotaResponse withAntivirusFreeQuota(Integer antivirusFreeQuota) {
        this.antivirusFreeQuota = antivirusFreeQuota;
        return this;
    }

    /**
     * 病毒查杀界面应该赠送的免费次数
     * @return antivirusFreeQuota
     */
    public Integer getAntivirusFreeQuota() {
        return antivirusFreeQuota;
    }

    public void setAntivirusFreeQuota(Integer antivirusFreeQuota) {
        this.antivirusFreeQuota = antivirusFreeQuota;
    }

    public ShowAntivirusFreeQuotaResponse withReportAlreadyGiven(Boolean reportAlreadyGiven) {
        this.reportAlreadyGiven = reportAlreadyGiven;
        return this;
    }

    /**
     * 月度报告界面是否已经赠送过免费次数
     * @return reportAlreadyGiven
     */
    public Boolean getReportAlreadyGiven() {
        return reportAlreadyGiven;
    }

    public void setReportAlreadyGiven(Boolean reportAlreadyGiven) {
        this.reportAlreadyGiven = reportAlreadyGiven;
    }

    public ShowAntivirusFreeQuotaResponse withReportFreeQuota(Integer reportFreeQuota) {
        this.reportFreeQuota = reportFreeQuota;
        return this;
    }

    /**
     * 月度报告界面应该赠送的免费次数
     * @return reportFreeQuota
     */
    public Integer getReportFreeQuota() {
        return reportFreeQuota;
    }

    public void setReportFreeQuota(Integer reportFreeQuota) {
        this.reportFreeQuota = reportFreeQuota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAntivirusFreeQuotaResponse that = (ShowAntivirusFreeQuotaResponse) obj;
        return Objects.equals(this.freeQuota, that.freeQuota)
            && Objects.equals(this.occupiedFreeQuota, that.occupiedFreeQuota)
            && Objects.equals(this.antivirusAlreadyGiven, that.antivirusAlreadyGiven)
            && Objects.equals(this.antivirusFreeQuota, that.antivirusFreeQuota)
            && Objects.equals(this.reportAlreadyGiven, that.reportAlreadyGiven)
            && Objects.equals(this.reportFreeQuota, that.reportFreeQuota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeQuota,
            occupiedFreeQuota,
            antivirusAlreadyGiven,
            antivirusFreeQuota,
            reportAlreadyGiven,
            reportFreeQuota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAntivirusFreeQuotaResponse {\n");
        sb.append("    freeQuota: ").append(toIndentedString(freeQuota)).append("\n");
        sb.append("    occupiedFreeQuota: ").append(toIndentedString(occupiedFreeQuota)).append("\n");
        sb.append("    antivirusAlreadyGiven: ").append(toIndentedString(antivirusAlreadyGiven)).append("\n");
        sb.append("    antivirusFreeQuota: ").append(toIndentedString(antivirusFreeQuota)).append("\n");
        sb.append("    reportAlreadyGiven: ").append(toIndentedString(reportAlreadyGiven)).append("\n");
        sb.append("    reportFreeQuota: ").append(toIndentedString(reportFreeQuota)).append("\n");
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
