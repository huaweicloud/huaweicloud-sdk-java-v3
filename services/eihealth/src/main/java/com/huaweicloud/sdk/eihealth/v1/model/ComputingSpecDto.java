package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ComputingSpecDto
 */
public class ComputingSpecDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private Long ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private String vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_rate")

    private String maxRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_rate")

    private String minRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_pps")

    private String maxPps;

    public ComputingSpecDto withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 规格编号
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ComputingSpecDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规格名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComputingSpecDto withRam(Long ram) {
        this.ram = ram;
        return this;
    }

    /**
     * 内存
     * @return ram
     */
    public Long getRam() {
        return ram;
    }

    public void setRam(Long ram) {
        this.ram = ram;
    }

    public ComputingSpecDto withVcpus(String vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * vcpus
     * @return vcpus
     */
    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    public ComputingSpecDto withMaxRate(String maxRate) {
        this.maxRate = maxRate;
        return this;
    }

    /**
     * 最大带宽
     * @return maxRate
     */
    public String getMaxRate() {
        return maxRate;
    }

    public void setMaxRate(String maxRate) {
        this.maxRate = maxRate;
    }

    public ComputingSpecDto withMinRate(String minRate) {
        this.minRate = minRate;
        return this;
    }

    /**
     * 基准带宽
     * @return minRate
     */
    public String getMinRate() {
        return minRate;
    }

    public void setMinRate(String minRate) {
        this.minRate = minRate;
    }

    public ComputingSpecDto withMaxPps(String maxPps) {
        this.maxPps = maxPps;
        return this;
    }

    /**
     * 最大收发包能力
     * @return maxPps
     */
    public String getMaxPps() {
        return maxPps;
    }

    public void setMaxPps(String maxPps) {
        this.maxPps = maxPps;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComputingSpecDto computingSpecDto = (ComputingSpecDto) o;
        return Objects.equals(this.code, computingSpecDto.code) && Objects.equals(this.name, computingSpecDto.name)
            && Objects.equals(this.ram, computingSpecDto.ram) && Objects.equals(this.vcpus, computingSpecDto.vcpus)
            && Objects.equals(this.maxRate, computingSpecDto.maxRate)
            && Objects.equals(this.minRate, computingSpecDto.minRate)
            && Objects.equals(this.maxPps, computingSpecDto.maxPps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, ram, vcpus, maxRate, minRate, maxPps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComputingSpecDto {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    maxRate: ").append(toIndentedString(maxRate)).append("\n");
        sb.append("    minRate: ").append(toIndentedString(minRate)).append("\n");
        sb.append("    maxPps: ").append(toIndentedString(maxPps)).append("\n");
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
