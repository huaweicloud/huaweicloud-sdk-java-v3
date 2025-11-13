package com.huaweicloud.sdk.ccm.v1.model;

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
public class ShowConsoleConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_eps")

    private Boolean isSupportEps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_sm2")

    private Boolean isSupportSm2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_dhsm")

    private Boolean isSupportDhsm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dhsm_regions")

    private List<String> dhsmRegions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_yearly_monthly_ca")

    private Boolean isSupportYearlyMonthlyCa;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_iam5")

    private Boolean isSupportIam5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_ocsp")

    private Boolean isSupportOcsp;

    public ShowConsoleConfigResponse withIsSupportEps(Boolean isSupportEps) {
        this.isSupportEps = isSupportEps;
        return this;
    }

    /**
     * 是否支持企业项目。
     * @return isSupportEps
     */
    public Boolean getIsSupportEps() {
        return isSupportEps;
    }

    public void setIsSupportEps(Boolean isSupportEps) {
        this.isSupportEps = isSupportEps;
    }

    public ShowConsoleConfigResponse withIsSupportSm2(Boolean isSupportSm2) {
        this.isSupportSm2 = isSupportSm2;
        return this;
    }

    /**
     * 是否支持SM2算法。
     * @return isSupportSm2
     */
    public Boolean getIsSupportSm2() {
        return isSupportSm2;
    }

    public void setIsSupportSm2(Boolean isSupportSm2) {
        this.isSupportSm2 = isSupportSm2;
    }

    public ShowConsoleConfigResponse withIsSupportDhsm(Boolean isSupportDhsm) {
        this.isSupportDhsm = isSupportDhsm;
        return this;
    }

    /**
     * 是否支持专属加密集群。
     * @return isSupportDhsm
     */
    public Boolean getIsSupportDhsm() {
        return isSupportDhsm;
    }

    public void setIsSupportDhsm(Boolean isSupportDhsm) {
        this.isSupportDhsm = isSupportDhsm;
    }

    public ShowConsoleConfigResponse withDhsmRegions(List<String> dhsmRegions) {
        this.dhsmRegions = dhsmRegions;
        return this;
    }

    public ShowConsoleConfigResponse addDhsmRegionsItem(String dhsmRegionsItem) {
        if (this.dhsmRegions == null) {
            this.dhsmRegions = new ArrayList<>();
        }
        this.dhsmRegions.add(dhsmRegionsItem);
        return this;
    }

    public ShowConsoleConfigResponse withDhsmRegions(Consumer<List<String>> dhsmRegionsSetter) {
        if (this.dhsmRegions == null) {
            this.dhsmRegions = new ArrayList<>();
        }
        dhsmRegionsSetter.accept(this.dhsmRegions);
        return this;
    }

    /**
     * 专属加密集群支持的region列表。
     * @return dhsmRegions
     */
    public List<String> getDhsmRegions() {
        return dhsmRegions;
    }

    public void setDhsmRegions(List<String> dhsmRegions) {
        this.dhsmRegions = dhsmRegions;
    }

    public ShowConsoleConfigResponse withIsSupportYearlyMonthlyCa(Boolean isSupportYearlyMonthlyCa) {
        this.isSupportYearlyMonthlyCa = isSupportYearlyMonthlyCa;
        return this;
    }

    /**
     * 是否支持包年包月CA。
     * @return isSupportYearlyMonthlyCa
     */
    public Boolean getIsSupportYearlyMonthlyCa() {
        return isSupportYearlyMonthlyCa;
    }

    public void setIsSupportYearlyMonthlyCa(Boolean isSupportYearlyMonthlyCa) {
        this.isSupportYearlyMonthlyCa = isSupportYearlyMonthlyCa;
    }

    public ShowConsoleConfigResponse withIsSupportIam5(Boolean isSupportIam5) {
        this.isSupportIam5 = isSupportIam5;
        return this;
    }

    /**
     * 是否支持IAM5鉴权。
     * @return isSupportIam5
     */
    public Boolean getIsSupportIam5() {
        return isSupportIam5;
    }

    public void setIsSupportIam5(Boolean isSupportIam5) {
        this.isSupportIam5 = isSupportIam5;
    }

    public ShowConsoleConfigResponse withIsSupportOcsp(Boolean isSupportOcsp) {
        this.isSupportOcsp = isSupportOcsp;
        return this;
    }

    /**
     * 是否支持OCSP查询。
     * @return isSupportOcsp
     */
    public Boolean getIsSupportOcsp() {
        return isSupportOcsp;
    }

    public void setIsSupportOcsp(Boolean isSupportOcsp) {
        this.isSupportOcsp = isSupportOcsp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowConsoleConfigResponse that = (ShowConsoleConfigResponse) obj;
        return Objects.equals(this.isSupportEps, that.isSupportEps)
            && Objects.equals(this.isSupportSm2, that.isSupportSm2)
            && Objects.equals(this.isSupportDhsm, that.isSupportDhsm)
            && Objects.equals(this.dhsmRegions, that.dhsmRegions)
            && Objects.equals(this.isSupportYearlyMonthlyCa, that.isSupportYearlyMonthlyCa)
            && Objects.equals(this.isSupportIam5, that.isSupportIam5)
            && Objects.equals(this.isSupportOcsp, that.isSupportOcsp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSupportEps,
            isSupportSm2,
            isSupportDhsm,
            dhsmRegions,
            isSupportYearlyMonthlyCa,
            isSupportIam5,
            isSupportOcsp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConsoleConfigResponse {\n");
        sb.append("    isSupportEps: ").append(toIndentedString(isSupportEps)).append("\n");
        sb.append("    isSupportSm2: ").append(toIndentedString(isSupportSm2)).append("\n");
        sb.append("    isSupportDhsm: ").append(toIndentedString(isSupportDhsm)).append("\n");
        sb.append("    dhsmRegions: ").append(toIndentedString(dhsmRegions)).append("\n");
        sb.append("    isSupportYearlyMonthlyCa: ").append(toIndentedString(isSupportYearlyMonthlyCa)).append("\n");
        sb.append("    isSupportIam5: ").append(toIndentedString(isSupportIam5)).append("\n");
        sb.append("    isSupportOcsp: ").append(toIndentedString(isSupportOcsp)).append("\n");
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
