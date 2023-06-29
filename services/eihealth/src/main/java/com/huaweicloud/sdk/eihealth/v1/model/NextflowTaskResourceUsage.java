package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NextflowTaskResourceUsage
 */
public class NextflowTaskResourceUsage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_percent")

    private Double cpuPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_percent")

    private Double memPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rchar")

    private Long rchar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wchar")

    private Long wchar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_bytes")

    private Long readBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "write_bytes")

    private Long writeBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmem")

    private Long vmem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rss")

    private Long rss;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peak_vmem")

    private Long peakVmem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peak_rss")

    private Long peakRss;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "syscr")

    private Long syscr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "syscw")

    private Long syscw;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vol_ctxt")

    private Long volCtxt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inv_ctxt")

    private Long invCtxt;

    public NextflowTaskResourceUsage withCpuPercent(Double cpuPercent) {
        this.cpuPercent = cpuPercent;
        return this;
    }

    /**
     * cpu占用率
     * @return cpuPercent
     */
    public Double getCpuPercent() {
        return cpuPercent;
    }

    public void setCpuPercent(Double cpuPercent) {
        this.cpuPercent = cpuPercent;
    }

    public NextflowTaskResourceUsage withMemPercent(Double memPercent) {
        this.memPercent = memPercent;
        return this;
    }

    /**
     * 内存占用率
     * @return memPercent
     */
    public Double getMemPercent() {
        return memPercent;
    }

    public void setMemPercent(Double memPercent) {
        this.memPercent = memPercent;
    }

    public NextflowTaskResourceUsage withRchar(Long rchar) {
        this.rchar = rchar;
        return this;
    }

    /**
     * 读取字符数
     * @return rchar
     */
    public Long getRchar() {
        return rchar;
    }

    public void setRchar(Long rchar) {
        this.rchar = rchar;
    }

    public NextflowTaskResourceUsage withWchar(Long wchar) {
        this.wchar = wchar;
        return this;
    }

    /**
     * 写入字符数
     * @return wchar
     */
    public Long getWchar() {
        return wchar;
    }

    public void setWchar(Long wchar) {
        this.wchar = wchar;
    }

    public NextflowTaskResourceUsage withReadBytes(Long readBytes) {
        this.readBytes = readBytes;
        return this;
    }

    /**
     * 读取字节数
     * @return readBytes
     */
    public Long getReadBytes() {
        return readBytes;
    }

    public void setReadBytes(Long readBytes) {
        this.readBytes = readBytes;
    }

    public NextflowTaskResourceUsage withWriteBytes(Long writeBytes) {
        this.writeBytes = writeBytes;
        return this;
    }

    /**
     * 写入字符数
     * @return writeBytes
     */
    public Long getWriteBytes() {
        return writeBytes;
    }

    public void setWriteBytes(Long writeBytes) {
        this.writeBytes = writeBytes;
    }

    public NextflowTaskResourceUsage withVmem(Long vmem) {
        this.vmem = vmem;
        return this;
    }

    /**
     * process虚拟内存大小
     * @return vmem
     */
    public Long getVmem() {
        return vmem;
    }

    public void setVmem(Long vmem) {
        this.vmem = vmem;
    }

    public NextflowTaskResourceUsage withRss(Long rss) {
        this.rss = rss;
        return this;
    }

    /**
     * process实际内存大小
     * @return rss
     */
    public Long getRss() {
        return rss;
    }

    public void setRss(Long rss) {
        this.rss = rss;
    }

    public NextflowTaskResourceUsage withPeakVmem(Long peakVmem) {
        this.peakVmem = peakVmem;
        return this;
    }

    /**
     * process虚拟内存峰值
     * @return peakVmem
     */
    public Long getPeakVmem() {
        return peakVmem;
    }

    public void setPeakVmem(Long peakVmem) {
        this.peakVmem = peakVmem;
    }

    public NextflowTaskResourceUsage withPeakRss(Long peakRss) {
        this.peakRss = peakRss;
        return this;
    }

    /**
     * process实际内存峰值
     * @return peakRss
     */
    public Long getPeakRss() {
        return peakRss;
    }

    public void setPeakRss(Long peakRss) {
        this.peakRss = peakRss;
    }

    public NextflowTaskResourceUsage withSyscr(Long syscr) {
        this.syscr = syscr;
        return this;
    }

    /**
     * 系统调用次数
     * @return syscr
     */
    public Long getSyscr() {
        return syscr;
    }

    public void setSyscr(Long syscr) {
        this.syscr = syscr;
    }

    public NextflowTaskResourceUsage withSyscw(Long syscw) {
        this.syscw = syscw;
        return this;
    }

    /**
     * 系统调用次数
     * @return syscw
     */
    public Long getSyscw() {
        return syscw;
    }

    public void setSyscw(Long syscw) {
        this.syscw = syscw;
    }

    public NextflowTaskResourceUsage withVolCtxt(Long volCtxt) {
        this.volCtxt = volCtxt;
        return this;
    }

    /**
     * 自愿上下文切换数
     * @return volCtxt
     */
    public Long getVolCtxt() {
        return volCtxt;
    }

    public void setVolCtxt(Long volCtxt) {
        this.volCtxt = volCtxt;
    }

    public NextflowTaskResourceUsage withInvCtxt(Long invCtxt) {
        this.invCtxt = invCtxt;
        return this;
    }

    /**
     * 非自愿上下文切换数
     * @return invCtxt
     */
    public Long getInvCtxt() {
        return invCtxt;
    }

    public void setInvCtxt(Long invCtxt) {
        this.invCtxt = invCtxt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NextflowTaskResourceUsage that = (NextflowTaskResourceUsage) obj;
        return Objects.equals(this.cpuPercent, that.cpuPercent) && Objects.equals(this.memPercent, that.memPercent)
            && Objects.equals(this.rchar, that.rchar) && Objects.equals(this.wchar, that.wchar)
            && Objects.equals(this.readBytes, that.readBytes) && Objects.equals(this.writeBytes, that.writeBytes)
            && Objects.equals(this.vmem, that.vmem) && Objects.equals(this.rss, that.rss)
            && Objects.equals(this.peakVmem, that.peakVmem) && Objects.equals(this.peakRss, that.peakRss)
            && Objects.equals(this.syscr, that.syscr) && Objects.equals(this.syscw, that.syscw)
            && Objects.equals(this.volCtxt, that.volCtxt) && Objects.equals(this.invCtxt, that.invCtxt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuPercent,
            memPercent,
            rchar,
            wchar,
            readBytes,
            writeBytes,
            vmem,
            rss,
            peakVmem,
            peakRss,
            syscr,
            syscw,
            volCtxt,
            invCtxt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NextflowTaskResourceUsage {\n");
        sb.append("    cpuPercent: ").append(toIndentedString(cpuPercent)).append("\n");
        sb.append("    memPercent: ").append(toIndentedString(memPercent)).append("\n");
        sb.append("    rchar: ").append(toIndentedString(rchar)).append("\n");
        sb.append("    wchar: ").append(toIndentedString(wchar)).append("\n");
        sb.append("    readBytes: ").append(toIndentedString(readBytes)).append("\n");
        sb.append("    writeBytes: ").append(toIndentedString(writeBytes)).append("\n");
        sb.append("    vmem: ").append(toIndentedString(vmem)).append("\n");
        sb.append("    rss: ").append(toIndentedString(rss)).append("\n");
        sb.append("    peakVmem: ").append(toIndentedString(peakVmem)).append("\n");
        sb.append("    peakRss: ").append(toIndentedString(peakRss)).append("\n");
        sb.append("    syscr: ").append(toIndentedString(syscr)).append("\n");
        sb.append("    syscw: ").append(toIndentedString(syscw)).append("\n");
        sb.append("    volCtxt: ").append(toIndentedString(volCtxt)).append("\n");
        sb.append("    invCtxt: ").append(toIndentedString(invCtxt)).append("\n");
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
