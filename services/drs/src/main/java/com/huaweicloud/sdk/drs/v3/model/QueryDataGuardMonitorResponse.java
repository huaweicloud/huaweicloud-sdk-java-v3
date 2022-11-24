package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 容灾监控数据响应体
 */
public class QueryDataGuardMonitorResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private String bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpuUsed_percent")

    private String cpuUsedPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_delay")

    private Long dstDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_io")

    private String dstIo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_normal")

    private Boolean dstNormal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_offset")

    private String dstOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_rps")

    private String dstRps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_used_inMB")

    private String memUsedInMB;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_mem_inMB")

    private Long nodeMemInMB;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_offset")

    private String nodeOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_volume_inGB")

    private Long nodeVolumeInGB;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sr_delay")

    private Long srDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sr_offset")

    private String srOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_io")

    private String srcIo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_normal")

    private Boolean srcNormal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_rps")

    private String srcRps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trans_inMB")

    private String transInMB;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trans_lines")

    private String transLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_used_inGB")

    private String volumeUsedInGB;

    public QueryDataGuardMonitorResponse withBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * 带宽。
     * @return bandwidth
     */
    public String getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    public QueryDataGuardMonitorResponse withCpuUsedPercent(String cpuUsedPercent) {
        this.cpuUsedPercent = cpuUsedPercent;
        return this;
    }

    /**
     * cpu百分比。
     * @return cpuUsedPercent
     */
    public String getCpuUsedPercent() {
        return cpuUsedPercent;
    }

    public void setCpuUsedPercent(String cpuUsedPercent) {
        this.cpuUsedPercent = cpuUsedPercent;
    }

    public QueryDataGuardMonitorResponse withDstDelay(Long dstDelay) {
        this.dstDelay = dstDelay;
        return this;
    }

    /**
     * 目标库时延。
     * @return dstDelay
     */
    public Long getDstDelay() {
        return dstDelay;
    }

    public void setDstDelay(Long dstDelay) {
        this.dstDelay = dstDelay;
    }

    public QueryDataGuardMonitorResponse withDstIo(String dstIo) {
        this.dstIo = dstIo;
        return this;
    }

    /**
     * 目标io。
     * @return dstIo
     */
    public String getDstIo() {
        return dstIo;
    }

    public void setDstIo(String dstIo) {
        this.dstIo = dstIo;
    }

    public QueryDataGuardMonitorResponse withDstNormal(Boolean dstNormal) {
        this.dstNormal = dstNormal;
        return this;
    }

    /**
     * 目标库连接状态。
     * @return dstNormal
     */
    public Boolean getDstNormal() {
        return dstNormal;
    }

    public void setDstNormal(Boolean dstNormal) {
        this.dstNormal = dstNormal;
    }

    public QueryDataGuardMonitorResponse withDstOffset(String dstOffset) {
        this.dstOffset = dstOffset;
        return this;
    }

    /**
     * 目标库offSet位点。
     * @return dstOffset
     */
    public String getDstOffset() {
        return dstOffset;
    }

    public void setDstOffset(String dstOffset) {
        this.dstOffset = dstOffset;
    }

    public QueryDataGuardMonitorResponse withDstRps(String dstRps) {
        this.dstRps = dstRps;
        return this;
    }

    /**
     * 目标rps。
     * @return dstRps
     */
    public String getDstRps() {
        return dstRps;
    }

    public void setDstRps(String dstRps) {
        this.dstRps = dstRps;
    }

    public QueryDataGuardMonitorResponse withMemUsedInMB(String memUsedInMB) {
        this.memUsedInMB = memUsedInMB;
        return this;
    }

    /**
     * 内存使用。
     * @return memUsedInMB
     */
    public String getMemUsedInMB() {
        return memUsedInMB;
    }

    public void setMemUsedInMB(String memUsedInMB) {
        this.memUsedInMB = memUsedInMB;
    }

    public QueryDataGuardMonitorResponse withNodeMemInMB(Long nodeMemInMB) {
        this.nodeMemInMB = nodeMemInMB;
        return this;
    }

    /**
     * node内存总大小。
     * @return nodeMemInMB
     */
    public Long getNodeMemInMB() {
        return nodeMemInMB;
    }

    public void setNodeMemInMB(Long nodeMemInMB) {
        this.nodeMemInMB = nodeMemInMB;
    }

    public QueryDataGuardMonitorResponse withNodeOffset(String nodeOffset) {
        this.nodeOffset = nodeOffset;
        return this;
    }

    /**
     * 迁移实例offSet位点。
     * @return nodeOffset
     */
    public String getNodeOffset() {
        return nodeOffset;
    }

    public void setNodeOffset(String nodeOffset) {
        this.nodeOffset = nodeOffset;
    }

    public QueryDataGuardMonitorResponse withNodeVolumeInGB(Long nodeVolumeInGB) {
        this.nodeVolumeInGB = nodeVolumeInGB;
        return this;
    }

    /**
     * node磁盘总大小。
     * @return nodeVolumeInGB
     */
    public Long getNodeVolumeInGB() {
        return nodeVolumeInGB;
    }

    public void setNodeVolumeInGB(Long nodeVolumeInGB) {
        this.nodeVolumeInGB = nodeVolumeInGB;
    }

    public QueryDataGuardMonitorResponse withSrDelay(Long srDelay) {
        this.srDelay = srDelay;
        return this;
    }

    /**
     * 源库时延。
     * @return srDelay
     */
    public Long getSrDelay() {
        return srDelay;
    }

    public void setSrDelay(Long srDelay) {
        this.srDelay = srDelay;
    }

    public QueryDataGuardMonitorResponse withSrOffset(String srOffset) {
        this.srOffset = srOffset;
        return this;
    }

    /**
     * 源库offSet位点。
     * @return srOffset
     */
    public String getSrOffset() {
        return srOffset;
    }

    public void setSrOffset(String srOffset) {
        this.srOffset = srOffset;
    }

    public QueryDataGuardMonitorResponse withSrcIo(String srcIo) {
        this.srcIo = srcIo;
        return this;
    }

    /**
     * 源io。
     * @return srcIo
     */
    public String getSrcIo() {
        return srcIo;
    }

    public void setSrcIo(String srcIo) {
        this.srcIo = srcIo;
    }

    public QueryDataGuardMonitorResponse withSrcNormal(Boolean srcNormal) {
        this.srcNormal = srcNormal;
        return this;
    }

    /**
     * 源库连接状态。
     * @return srcNormal
     */
    public Boolean getSrcNormal() {
        return srcNormal;
    }

    public void setSrcNormal(Boolean srcNormal) {
        this.srcNormal = srcNormal;
    }

    public QueryDataGuardMonitorResponse withSrcRps(String srcRps) {
        this.srcRps = srcRps;
        return this;
    }

    /**
     * 源rps。
     * @return srcRps
     */
    public String getSrcRps() {
        return srcRps;
    }

    public void setSrcRps(String srcRps) {
        this.srcRps = srcRps;
    }

    public QueryDataGuardMonitorResponse withTransInMB(String transInMB) {
        this.transInMB = transInMB;
        return this;
    }

    /**
     * 迁移数据量。
     * @return transInMB
     */
    public String getTransInMB() {
        return transInMB;
    }

    public void setTransInMB(String transInMB) {
        this.transInMB = transInMB;
    }

    public QueryDataGuardMonitorResponse withTransLines(String transLines) {
        this.transLines = transLines;
        return this;
    }

    /**
     * 迁移数据行数。
     * @return transLines
     */
    public String getTransLines() {
        return transLines;
    }

    public void setTransLines(String transLines) {
        this.transLines = transLines;
    }

    public QueryDataGuardMonitorResponse withVolumeUsedInGB(String volumeUsedInGB) {
        this.volumeUsedInGB = volumeUsedInGB;
        return this;
    }

    /**
     * 磁盘使用。
     * @return volumeUsedInGB
     */
    public String getVolumeUsedInGB() {
        return volumeUsedInGB;
    }

    public void setVolumeUsedInGB(String volumeUsedInGB) {
        this.volumeUsedInGB = volumeUsedInGB;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryDataGuardMonitorResponse queryDataGuardMonitorResponse = (QueryDataGuardMonitorResponse) o;
        return Objects.equals(this.bandwidth, queryDataGuardMonitorResponse.bandwidth)
            && Objects.equals(this.cpuUsedPercent, queryDataGuardMonitorResponse.cpuUsedPercent)
            && Objects.equals(this.dstDelay, queryDataGuardMonitorResponse.dstDelay)
            && Objects.equals(this.dstIo, queryDataGuardMonitorResponse.dstIo)
            && Objects.equals(this.dstNormal, queryDataGuardMonitorResponse.dstNormal)
            && Objects.equals(this.dstOffset, queryDataGuardMonitorResponse.dstOffset)
            && Objects.equals(this.dstRps, queryDataGuardMonitorResponse.dstRps)
            && Objects.equals(this.memUsedInMB, queryDataGuardMonitorResponse.memUsedInMB)
            && Objects.equals(this.nodeMemInMB, queryDataGuardMonitorResponse.nodeMemInMB)
            && Objects.equals(this.nodeOffset, queryDataGuardMonitorResponse.nodeOffset)
            && Objects.equals(this.nodeVolumeInGB, queryDataGuardMonitorResponse.nodeVolumeInGB)
            && Objects.equals(this.srDelay, queryDataGuardMonitorResponse.srDelay)
            && Objects.equals(this.srOffset, queryDataGuardMonitorResponse.srOffset)
            && Objects.equals(this.srcIo, queryDataGuardMonitorResponse.srcIo)
            && Objects.equals(this.srcNormal, queryDataGuardMonitorResponse.srcNormal)
            && Objects.equals(this.srcRps, queryDataGuardMonitorResponse.srcRps)
            && Objects.equals(this.transInMB, queryDataGuardMonitorResponse.transInMB)
            && Objects.equals(this.transLines, queryDataGuardMonitorResponse.transLines)
            && Objects.equals(this.volumeUsedInGB, queryDataGuardMonitorResponse.volumeUsedInGB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidth,
            cpuUsedPercent,
            dstDelay,
            dstIo,
            dstNormal,
            dstOffset,
            dstRps,
            memUsedInMB,
            nodeMemInMB,
            nodeOffset,
            nodeVolumeInGB,
            srDelay,
            srOffset,
            srcIo,
            srcNormal,
            srcRps,
            transInMB,
            transLines,
            volumeUsedInGB);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDataGuardMonitorResponse {\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    cpuUsedPercent: ").append(toIndentedString(cpuUsedPercent)).append("\n");
        sb.append("    dstDelay: ").append(toIndentedString(dstDelay)).append("\n");
        sb.append("    dstIo: ").append(toIndentedString(dstIo)).append("\n");
        sb.append("    dstNormal: ").append(toIndentedString(dstNormal)).append("\n");
        sb.append("    dstOffset: ").append(toIndentedString(dstOffset)).append("\n");
        sb.append("    dstRps: ").append(toIndentedString(dstRps)).append("\n");
        sb.append("    memUsedInMB: ").append(toIndentedString(memUsedInMB)).append("\n");
        sb.append("    nodeMemInMB: ").append(toIndentedString(nodeMemInMB)).append("\n");
        sb.append("    nodeOffset: ").append(toIndentedString(nodeOffset)).append("\n");
        sb.append("    nodeVolumeInGB: ").append(toIndentedString(nodeVolumeInGB)).append("\n");
        sb.append("    srDelay: ").append(toIndentedString(srDelay)).append("\n");
        sb.append("    srOffset: ").append(toIndentedString(srOffset)).append("\n");
        sb.append("    srcIo: ").append(toIndentedString(srcIo)).append("\n");
        sb.append("    srcNormal: ").append(toIndentedString(srcNormal)).append("\n");
        sb.append("    srcRps: ").append(toIndentedString(srcRps)).append("\n");
        sb.append("    transInMB: ").append(toIndentedString(transInMB)).append("\n");
        sb.append("    transLines: ").append(toIndentedString(transLines)).append("\n");
        sb.append("    volumeUsedInGB: ").append(toIndentedString(volumeUsedInGB)).append("\n");
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
