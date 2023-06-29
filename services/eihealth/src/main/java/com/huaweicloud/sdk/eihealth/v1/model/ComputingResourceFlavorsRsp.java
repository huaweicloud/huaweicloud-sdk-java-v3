package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ComputingResourceFlavorsRsp
 */
public class ComputingResourceFlavorsRsp {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sold_out")

    private Boolean soldOut;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_detail")

    private String cpuDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_detail")

    private String diskDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_detail")

    private String memoryDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "netcard_detail")

    private String netcardDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_arch")

    private String cpuArch;

    public ComputingResourceFlavorsRsp withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 规格编码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ComputingResourceFlavorsRsp withName(String name) {
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

    public ComputingResourceFlavorsRsp withRam(Long ram) {
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

    public ComputingResourceFlavorsRsp withVcpus(String vcpus) {
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

    public ComputingResourceFlavorsRsp withMaxRate(String maxRate) {
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

    public ComputingResourceFlavorsRsp withMinRate(String minRate) {
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

    public ComputingResourceFlavorsRsp withMaxPps(String maxPps) {
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

    public ComputingResourceFlavorsRsp withSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
        return this;
    }

    /**
     * 是否售罄
     * @return soldOut
     */
    public Boolean getSoldOut() {
        return soldOut;
    }

    public void setSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
    }

    public ComputingResourceFlavorsRsp withCpuDetail(String cpuDetail) {
        this.cpuDetail = cpuDetail;
        return this;
    }

    /**
     * CPU物理规格描述信息
     * @return cpuDetail
     */
    public String getCpuDetail() {
        return cpuDetail;
    }

    public void setCpuDetail(String cpuDetail) {
        this.cpuDetail = cpuDetail;
    }

    public ComputingResourceFlavorsRsp withDiskDetail(String diskDetail) {
        this.diskDetail = diskDetail;
        return this;
    }

    /**
     * 磁盘物理规格描述信息
     * @return diskDetail
     */
    public String getDiskDetail() {
        return diskDetail;
    }

    public void setDiskDetail(String diskDetail) {
        this.diskDetail = diskDetail;
    }

    public ComputingResourceFlavorsRsp withMemoryDetail(String memoryDetail) {
        this.memoryDetail = memoryDetail;
        return this;
    }

    /**
     * 内存物理规格描述信息
     * @return memoryDetail
     */
    public String getMemoryDetail() {
        return memoryDetail;
    }

    public void setMemoryDetail(String memoryDetail) {
        this.memoryDetail = memoryDetail;
    }

    public ComputingResourceFlavorsRsp withNetcardDetail(String netcardDetail) {
        this.netcardDetail = netcardDetail;
        return this;
    }

    /**
     * 网卡物理规格描述信息
     * @return netcardDetail
     */
    public String getNetcardDetail() {
        return netcardDetail;
    }

    public void setNetcardDetail(String netcardDetail) {
        this.netcardDetail = netcardDetail;
    }

    public ComputingResourceFlavorsRsp withCpuArch(String cpuArch) {
        this.cpuArch = cpuArch;
        return this;
    }

    /**
     * 裸金属服务器的CPU架构类型
     * @return cpuArch
     */
    public String getCpuArch() {
        return cpuArch;
    }

    public void setCpuArch(String cpuArch) {
        this.cpuArch = cpuArch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComputingResourceFlavorsRsp that = (ComputingResourceFlavorsRsp) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.name, that.name)
            && Objects.equals(this.ram, that.ram) && Objects.equals(this.vcpus, that.vcpus)
            && Objects.equals(this.maxRate, that.maxRate) && Objects.equals(this.minRate, that.minRate)
            && Objects.equals(this.maxPps, that.maxPps) && Objects.equals(this.soldOut, that.soldOut)
            && Objects.equals(this.cpuDetail, that.cpuDetail) && Objects.equals(this.diskDetail, that.diskDetail)
            && Objects.equals(this.memoryDetail, that.memoryDetail)
            && Objects.equals(this.netcardDetail, that.netcardDetail) && Objects.equals(this.cpuArch, that.cpuArch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code,
            name,
            ram,
            vcpus,
            maxRate,
            minRate,
            maxPps,
            soldOut,
            cpuDetail,
            diskDetail,
            memoryDetail,
            netcardDetail,
            cpuArch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComputingResourceFlavorsRsp {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    maxRate: ").append(toIndentedString(maxRate)).append("\n");
        sb.append("    minRate: ").append(toIndentedString(minRate)).append("\n");
        sb.append("    maxPps: ").append(toIndentedString(maxPps)).append("\n");
        sb.append("    soldOut: ").append(toIndentedString(soldOut)).append("\n");
        sb.append("    cpuDetail: ").append(toIndentedString(cpuDetail)).append("\n");
        sb.append("    diskDetail: ").append(toIndentedString(diskDetail)).append("\n");
        sb.append("    memoryDetail: ").append(toIndentedString(memoryDetail)).append("\n");
        sb.append("    netcardDetail: ").append(toIndentedString(netcardDetail)).append("\n");
        sb.append("    cpuArch: ").append(toIndentedString(cpuArch)).append("\n");
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
