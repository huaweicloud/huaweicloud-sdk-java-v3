package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReportbrokensInfo
 */
public class ReportbrokensInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brand_brokens")

    private BrandBrokens brandBrokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commonTimestamps")

    private List<Long> commonTimestamps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "respcode_brokens")

    private RespcodeBrokens respcodeBrokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tps_brokens")

    private TpsBrokens tpsBrokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vusers_brokens")

    private VusersBrokens vusersBrokens;

    public ReportbrokensInfo withBrandBrokens(BrandBrokens brandBrokens) {
        this.brandBrokens = brandBrokens;
        return this;
    }

    public ReportbrokensInfo withBrandBrokens(Consumer<BrandBrokens> brandBrokensSetter) {
        if (this.brandBrokens == null) {
            this.brandBrokens = new BrandBrokens();
            brandBrokensSetter.accept(this.brandBrokens);
        }

        return this;
    }

    /**
     * Get brandBrokens
     * @return brandBrokens
     */
    public BrandBrokens getBrandBrokens() {
        return brandBrokens;
    }

    public void setBrandBrokens(BrandBrokens brandBrokens) {
        this.brandBrokens = brandBrokens;
    }

    public ReportbrokensInfo withCommonTimestamps(List<Long> commonTimestamps) {
        this.commonTimestamps = commonTimestamps;
        return this;
    }

    public ReportbrokensInfo addCommonTimestampsItem(Long commonTimestampsItem) {
        if (this.commonTimestamps == null) {
            this.commonTimestamps = new ArrayList<>();
        }
        this.commonTimestamps.add(commonTimestampsItem);
        return this;
    }

    public ReportbrokensInfo withCommonTimestamps(Consumer<List<Long>> commonTimestampsSetter) {
        if (this.commonTimestamps == null) {
            this.commonTimestamps = new ArrayList<>();
        }
        commonTimestampsSetter.accept(this.commonTimestamps);
        return this;
    }

    /**
     * 时间戳
     * @return commonTimestamps
     */
    public List<Long> getCommonTimestamps() {
        return commonTimestamps;
    }

    public void setCommonTimestamps(List<Long> commonTimestamps) {
        this.commonTimestamps = commonTimestamps;
    }

    public ReportbrokensInfo withRespcodeBrokens(RespcodeBrokens respcodeBrokens) {
        this.respcodeBrokens = respcodeBrokens;
        return this;
    }

    public ReportbrokensInfo withRespcodeBrokens(Consumer<RespcodeBrokens> respcodeBrokensSetter) {
        if (this.respcodeBrokens == null) {
            this.respcodeBrokens = new RespcodeBrokens();
            respcodeBrokensSetter.accept(this.respcodeBrokens);
        }

        return this;
    }

    /**
     * Get respcodeBrokens
     * @return respcodeBrokens
     */
    public RespcodeBrokens getRespcodeBrokens() {
        return respcodeBrokens;
    }

    public void setRespcodeBrokens(RespcodeBrokens respcodeBrokens) {
        this.respcodeBrokens = respcodeBrokens;
    }

    public ReportbrokensInfo withTpsBrokens(TpsBrokens tpsBrokens) {
        this.tpsBrokens = tpsBrokens;
        return this;
    }

    public ReportbrokensInfo withTpsBrokens(Consumer<TpsBrokens> tpsBrokensSetter) {
        if (this.tpsBrokens == null) {
            this.tpsBrokens = new TpsBrokens();
            tpsBrokensSetter.accept(this.tpsBrokens);
        }

        return this;
    }

    /**
     * Get tpsBrokens
     * @return tpsBrokens
     */
    public TpsBrokens getTpsBrokens() {
        return tpsBrokens;
    }

    public void setTpsBrokens(TpsBrokens tpsBrokens) {
        this.tpsBrokens = tpsBrokens;
    }

    public ReportbrokensInfo withVusersBrokens(VusersBrokens vusersBrokens) {
        this.vusersBrokens = vusersBrokens;
        return this;
    }

    public ReportbrokensInfo withVusersBrokens(Consumer<VusersBrokens> vusersBrokensSetter) {
        if (this.vusersBrokens == null) {
            this.vusersBrokens = new VusersBrokens();
            vusersBrokensSetter.accept(this.vusersBrokens);
        }

        return this;
    }

    /**
     * Get vusersBrokens
     * @return vusersBrokens
     */
    public VusersBrokens getVusersBrokens() {
        return vusersBrokens;
    }

    public void setVusersBrokens(VusersBrokens vusersBrokens) {
        this.vusersBrokens = vusersBrokens;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReportbrokensInfo reportbrokensInfo = (ReportbrokensInfo) o;
        return Objects.equals(this.brandBrokens, reportbrokensInfo.brandBrokens)
            && Objects.equals(this.commonTimestamps, reportbrokensInfo.commonTimestamps)
            && Objects.equals(this.respcodeBrokens, reportbrokensInfo.respcodeBrokens)
            && Objects.equals(this.tpsBrokens, reportbrokensInfo.tpsBrokens)
            && Objects.equals(this.vusersBrokens, reportbrokensInfo.vusersBrokens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandBrokens, commonTimestamps, respcodeBrokens, tpsBrokens, vusersBrokens);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportbrokensInfo {\n");
        sb.append("    brandBrokens: ").append(toIndentedString(brandBrokens)).append("\n");
        sb.append("    commonTimestamps: ").append(toIndentedString(commonTimestamps)).append("\n");
        sb.append("    respcodeBrokens: ").append(toIndentedString(respcodeBrokens)).append("\n");
        sb.append("    tpsBrokens: ").append(toIndentedString(tpsBrokens)).append("\n");
        sb.append("    vusersBrokens: ").append(toIndentedString(vusersBrokens)).append("\n");
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
