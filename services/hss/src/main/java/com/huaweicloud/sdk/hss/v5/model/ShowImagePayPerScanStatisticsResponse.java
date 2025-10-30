package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowImagePayPerScanStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_scan_num")

    private Integer repositoryScanNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cicd_scan_num")

    private Integer cicdScanNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_quota_num")

    private Integer freeQuotaNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "already_given")

    private Boolean alreadyGiven;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_free_quota")

    private Integer imageFreeQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_risk")

    private ImageTypeRiskInfo highRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_risk")

    private ImageTypeRiskInfo hasRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private ImageTypeRiskInfo total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unscan")

    private ImageTypeRiskInfo unscan;

    public ShowImagePayPerScanStatisticsResponse withRepositoryScanNum(Integer repositoryScanNum) {
        this.repositoryScanNum = repositoryScanNum;
        return this;
    }

    /**
     * 仓库镜像扫描成功次数
     * minimum: 0
     * maximum: 2147483547
     * @return repositoryScanNum
     */
    public Integer getRepositoryScanNum() {
        return repositoryScanNum;
    }

    public void setRepositoryScanNum(Integer repositoryScanNum) {
        this.repositoryScanNum = repositoryScanNum;
    }

    public ShowImagePayPerScanStatisticsResponse withCicdScanNum(Integer cicdScanNum) {
        this.cicdScanNum = cicdScanNum;
        return this;
    }

    /**
     * CICD镜像扫描成功次数
     * minimum: 0
     * maximum: 2147483547
     * @return cicdScanNum
     */
    public Integer getCicdScanNum() {
        return cicdScanNum;
    }

    public void setCicdScanNum(Integer cicdScanNum) {
        this.cicdScanNum = cicdScanNum;
    }

    public ShowImagePayPerScanStatisticsResponse withFreeQuotaNum(Integer freeQuotaNum) {
        this.freeQuotaNum = freeQuotaNum;
        return this;
    }

    /**
     * 免费扫描次数
     * minimum: 0
     * maximum: 2147483547
     * @return freeQuotaNum
     */
    public Integer getFreeQuotaNum() {
        return freeQuotaNum;
    }

    public void setFreeQuotaNum(Integer freeQuotaNum) {
        this.freeQuotaNum = freeQuotaNum;
    }

    public ShowImagePayPerScanStatisticsResponse withAlreadyGiven(Boolean alreadyGiven) {
        this.alreadyGiven = alreadyGiven;
        return this;
    }

    /**
     * 是否赠送过免费次数
     * @return alreadyGiven
     */
    public Boolean getAlreadyGiven() {
        return alreadyGiven;
    }

    public void setAlreadyGiven(Boolean alreadyGiven) {
        this.alreadyGiven = alreadyGiven;
    }

    public ShowImagePayPerScanStatisticsResponse withImageFreeQuota(Integer imageFreeQuota) {
        this.imageFreeQuota = imageFreeQuota;
        return this;
    }

    /**
     * 登录容器镜像界面赠送的次数
     * minimum: 0
     * maximum: 2147483547
     * @return imageFreeQuota
     */
    public Integer getImageFreeQuota() {
        return imageFreeQuota;
    }

    public void setImageFreeQuota(Integer imageFreeQuota) {
        this.imageFreeQuota = imageFreeQuota;
    }

    public ShowImagePayPerScanStatisticsResponse withHighRisk(ImageTypeRiskInfo highRisk) {
        this.highRisk = highRisk;
        return this;
    }

    public ShowImagePayPerScanStatisticsResponse withHighRisk(Consumer<ImageTypeRiskInfo> highRiskSetter) {
        if (this.highRisk == null) {
            this.highRisk = new ImageTypeRiskInfo();
            highRiskSetter.accept(this.highRisk);
        }

        return this;
    }

    /**
     * Get highRisk
     * @return highRisk
     */
    public ImageTypeRiskInfo getHighRisk() {
        return highRisk;
    }

    public void setHighRisk(ImageTypeRiskInfo highRisk) {
        this.highRisk = highRisk;
    }

    public ShowImagePayPerScanStatisticsResponse withHasRisk(ImageTypeRiskInfo hasRisk) {
        this.hasRisk = hasRisk;
        return this;
    }

    public ShowImagePayPerScanStatisticsResponse withHasRisk(Consumer<ImageTypeRiskInfo> hasRiskSetter) {
        if (this.hasRisk == null) {
            this.hasRisk = new ImageTypeRiskInfo();
            hasRiskSetter.accept(this.hasRisk);
        }

        return this;
    }

    /**
     * Get hasRisk
     * @return hasRisk
     */
    public ImageTypeRiskInfo getHasRisk() {
        return hasRisk;
    }

    public void setHasRisk(ImageTypeRiskInfo hasRisk) {
        this.hasRisk = hasRisk;
    }

    public ShowImagePayPerScanStatisticsResponse withTotal(ImageTypeRiskInfo total) {
        this.total = total;
        return this;
    }

    public ShowImagePayPerScanStatisticsResponse withTotal(Consumer<ImageTypeRiskInfo> totalSetter) {
        if (this.total == null) {
            this.total = new ImageTypeRiskInfo();
            totalSetter.accept(this.total);
        }

        return this;
    }

    /**
     * Get total
     * @return total
     */
    public ImageTypeRiskInfo getTotal() {
        return total;
    }

    public void setTotal(ImageTypeRiskInfo total) {
        this.total = total;
    }

    public ShowImagePayPerScanStatisticsResponse withUnscan(ImageTypeRiskInfo unscan) {
        this.unscan = unscan;
        return this;
    }

    public ShowImagePayPerScanStatisticsResponse withUnscan(Consumer<ImageTypeRiskInfo> unscanSetter) {
        if (this.unscan == null) {
            this.unscan = new ImageTypeRiskInfo();
            unscanSetter.accept(this.unscan);
        }

        return this;
    }

    /**
     * Get unscan
     * @return unscan
     */
    public ImageTypeRiskInfo getUnscan() {
        return unscan;
    }

    public void setUnscan(ImageTypeRiskInfo unscan) {
        this.unscan = unscan;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowImagePayPerScanStatisticsResponse that = (ShowImagePayPerScanStatisticsResponse) obj;
        return Objects.equals(this.repositoryScanNum, that.repositoryScanNum)
            && Objects.equals(this.cicdScanNum, that.cicdScanNum)
            && Objects.equals(this.freeQuotaNum, that.freeQuotaNum)
            && Objects.equals(this.alreadyGiven, that.alreadyGiven)
            && Objects.equals(this.imageFreeQuota, that.imageFreeQuota) && Objects.equals(this.highRisk, that.highRisk)
            && Objects.equals(this.hasRisk, that.hasRisk) && Objects.equals(this.total, that.total)
            && Objects.equals(this.unscan, that.unscan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryScanNum,
            cicdScanNum,
            freeQuotaNum,
            alreadyGiven,
            imageFreeQuota,
            highRisk,
            hasRisk,
            total,
            unscan);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImagePayPerScanStatisticsResponse {\n");
        sb.append("    repositoryScanNum: ").append(toIndentedString(repositoryScanNum)).append("\n");
        sb.append("    cicdScanNum: ").append(toIndentedString(cicdScanNum)).append("\n");
        sb.append("    freeQuotaNum: ").append(toIndentedString(freeQuotaNum)).append("\n");
        sb.append("    alreadyGiven: ").append(toIndentedString(alreadyGiven)).append("\n");
        sb.append("    imageFreeQuota: ").append(toIndentedString(imageFreeQuota)).append("\n");
        sb.append("    highRisk: ").append(toIndentedString(highRisk)).append("\n");
        sb.append("    hasRisk: ").append(toIndentedString(hasRisk)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    unscan: ").append(toIndentedString(unscan)).append("\n");
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
