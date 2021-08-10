package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** DomainRegionIspDetail */
public class DomainRegionIspDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isp")

    private String isp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flux")

    private List<Long> flux = null;

    public DomainRegionIspDetail withRegion(String region) {
        this.region = region;
        return this;
    }

    /** 区域
     * 
     * @return region */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public DomainRegionIspDetail withIsp(String isp) {
        this.isp = isp;
        return this;
    }

    /** 运营商
     * 
     * @return isp */
    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public DomainRegionIspDetail withFlux(List<Long> flux) {
        this.flux = flux;
        return this;
    }

    public DomainRegionIspDetail addFluxItem(Long fluxItem) {
        if (this.flux == null) {
            this.flux = new ArrayList<>();
        }
        this.flux.add(fluxItem);
        return this;
    }

    public DomainRegionIspDetail withFlux(Consumer<List<Long>> fluxSetter) {
        if (this.flux == null) {
            this.flux = new ArrayList<>();
        }
        fluxSetter.accept(this.flux);
        return this;
    }

    /** 流量
     * 
     * @return flux */
    public List<Long> getFlux() {
        return flux;
    }

    public void setFlux(List<Long> flux) {
        this.flux = flux;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DomainRegionIspDetail domainRegionIspDetail = (DomainRegionIspDetail) o;
        return Objects.equals(this.region, domainRegionIspDetail.region)
            && Objects.equals(this.isp, domainRegionIspDetail.isp)
            && Objects.equals(this.flux, domainRegionIspDetail.flux);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, isp, flux);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainRegionIspDetail {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
        sb.append("    flux: ").append(toIndentedString(flux)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
