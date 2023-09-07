package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowMonitorDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private String bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_src_normal")

    private Boolean isSrcNormal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_dst_normal")

    private Boolean isDstNormal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_offset")

    private String srcOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_offset")

    private String nodeOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_offset")

    private String dstOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_delay")

    private Integer srcDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_delay")

    private Integer dstDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_rps")

    private String srcRps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_io")

    private String srcIo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_rps")

    private String dstRps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_io")

    private String dstIo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trans_data")

    private String transData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trans_lines")

    private String transLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_volumes")

    private String usedVolumes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_memory")

    private String usedMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_cpu_percent")

    private String usedCpuPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_volume_size")

    private Integer nodeVolumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_memory_size")

    private Integer nodeMemorySize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_rate")

    private Integer applyRate;

    public ShowMonitorDataResponse withBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * EIP带宽，单位：MB/S
     * @return bandwidth
     */
    public String getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    public ShowMonitorDataResponse withIsSrcNormal(Boolean isSrcNormal) {
        this.isSrcNormal = isSrcNormal;
        return this;
    }

    /**
     * 源库连接状态是否正常。
     * @return isSrcNormal
     */
    public Boolean getIsSrcNormal() {
        return isSrcNormal;
    }

    public void setIsSrcNormal(Boolean isSrcNormal) {
        this.isSrcNormal = isSrcNormal;
    }

    public ShowMonitorDataResponse withIsDstNormal(Boolean isDstNormal) {
        this.isDstNormal = isDstNormal;
        return this;
    }

    /**
     * 目标库连接状态是否正常。
     * @return isDstNormal
     */
    public Boolean getIsDstNormal() {
        return isDstNormal;
    }

    public void setIsDstNormal(Boolean isDstNormal) {
        this.isDstNormal = isDstNormal;
    }

    public ShowMonitorDataResponse withSrcOffset(String srcOffset) {
        this.srcOffset = srcOffset;
        return this;
    }

    /**
     * 源库offSet位点。
     * @return srcOffset
     */
    public String getSrcOffset() {
        return srcOffset;
    }

    public void setSrcOffset(String srcOffset) {
        this.srcOffset = srcOffset;
    }

    public ShowMonitorDataResponse withNodeOffset(String nodeOffset) {
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

    public ShowMonitorDataResponse withDstOffset(String dstOffset) {
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

    public ShowMonitorDataResponse withSrcDelay(Integer srcDelay) {
        this.srcDelay = srcDelay;
        return this;
    }

    /**
     * 源库时延。
     * @return srcDelay
     */
    public Integer getSrcDelay() {
        return srcDelay;
    }

    public void setSrcDelay(Integer srcDelay) {
        this.srcDelay = srcDelay;
    }

    public ShowMonitorDataResponse withDstDelay(Integer dstDelay) {
        this.dstDelay = dstDelay;
        return this;
    }

    /**
     * 目标库时延。
     * @return dstDelay
     */
    public Integer getDstDelay() {
        return dstDelay;
    }

    public void setDstDelay(Integer dstDelay) {
        this.dstDelay = dstDelay;
    }

    public ShowMonitorDataResponse withSrcRps(String srcRps) {
        this.srcRps = srcRps;
        return this;
    }

    /**
     * 源库RPS。
     * @return srcRps
     */
    public String getSrcRps() {
        return srcRps;
    }

    public void setSrcRps(String srcRps) {
        this.srcRps = srcRps;
    }

    public ShowMonitorDataResponse withSrcIo(String srcIo) {
        this.srcIo = srcIo;
        return this;
    }

    /**
     * 源库IO。
     * @return srcIo
     */
    public String getSrcIo() {
        return srcIo;
    }

    public void setSrcIo(String srcIo) {
        this.srcIo = srcIo;
    }

    public ShowMonitorDataResponse withDstRps(String dstRps) {
        this.dstRps = dstRps;
        return this;
    }

    /**
     * 目标库RPS。
     * @return dstRps
     */
    public String getDstRps() {
        return dstRps;
    }

    public void setDstRps(String dstRps) {
        this.dstRps = dstRps;
    }

    public ShowMonitorDataResponse withDstIo(String dstIo) {
        this.dstIo = dstIo;
        return this;
    }

    /**
     * 目标库IO。
     * @return dstIo
     */
    public String getDstIo() {
        return dstIo;
    }

    public void setDstIo(String dstIo) {
        this.dstIo = dstIo;
    }

    public ShowMonitorDataResponse withTransData(String transData) {
        this.transData = transData;
        return this;
    }

    /**
     * 迁移数据量。单位：MB
     * @return transData
     */
    public String getTransData() {
        return transData;
    }

    public void setTransData(String transData) {
        this.transData = transData;
    }

    public ShowMonitorDataResponse withTransLines(String transLines) {
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

    public ShowMonitorDataResponse withUsedVolumes(String usedVolumes) {
        this.usedVolumes = usedVolumes;
        return this;
    }

    /**
     * 磁盘使用量。单位：GB
     * @return usedVolumes
     */
    public String getUsedVolumes() {
        return usedVolumes;
    }

    public void setUsedVolumes(String usedVolumes) {
        this.usedVolumes = usedVolumes;
    }

    public ShowMonitorDataResponse withUsedMemory(String usedMemory) {
        this.usedMemory = usedMemory;
        return this;
    }

    /**
     * 内存使用量。单位：MB
     * @return usedMemory
     */
    public String getUsedMemory() {
        return usedMemory;
    }

    public void setUsedMemory(String usedMemory) {
        this.usedMemory = usedMemory;
    }

    public ShowMonitorDataResponse withUsedCpuPercent(String usedCpuPercent) {
        this.usedCpuPercent = usedCpuPercent;
        return this;
    }

    /**
     * CPU使用百分比。
     * @return usedCpuPercent
     */
    public String getUsedCpuPercent() {
        return usedCpuPercent;
    }

    public void setUsedCpuPercent(String usedCpuPercent) {
        this.usedCpuPercent = usedCpuPercent;
    }

    public ShowMonitorDataResponse withNodeVolumeSize(Integer nodeVolumeSize) {
        this.nodeVolumeSize = nodeVolumeSize;
        return this;
    }

    /**
     * node磁盘总大小。单位：GB
     * @return nodeVolumeSize
     */
    public Integer getNodeVolumeSize() {
        return nodeVolumeSize;
    }

    public void setNodeVolumeSize(Integer nodeVolumeSize) {
        this.nodeVolumeSize = nodeVolumeSize;
    }

    public ShowMonitorDataResponse withNodeMemorySize(Integer nodeMemorySize) {
        this.nodeMemorySize = nodeMemorySize;
        return this;
    }

    /**
     * node内存总大小。单位：MB
     * @return nodeMemorySize
     */
    public Integer getNodeMemorySize() {
        return nodeMemorySize;
    }

    public void setNodeMemorySize(Integer nodeMemorySize) {
        this.nodeMemorySize = nodeMemorySize;
    }

    public ShowMonitorDataResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowMonitorDataResponse withApplyRate(Integer applyRate) {
        this.applyRate = applyRate;
        return this;
    }

    /**
     * 同步速度。单位：byte/s
     * @return applyRate
     */
    public Integer getApplyRate() {
        return applyRate;
    }

    public void setApplyRate(Integer applyRate) {
        this.applyRate = applyRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMonitorDataResponse that = (ShowMonitorDataResponse) obj;
        return Objects.equals(this.bandwidth, that.bandwidth) && Objects.equals(this.isSrcNormal, that.isSrcNormal)
            && Objects.equals(this.isDstNormal, that.isDstNormal) && Objects.equals(this.srcOffset, that.srcOffset)
            && Objects.equals(this.nodeOffset, that.nodeOffset) && Objects.equals(this.dstOffset, that.dstOffset)
            && Objects.equals(this.srcDelay, that.srcDelay) && Objects.equals(this.dstDelay, that.dstDelay)
            && Objects.equals(this.srcRps, that.srcRps) && Objects.equals(this.srcIo, that.srcIo)
            && Objects.equals(this.dstRps, that.dstRps) && Objects.equals(this.dstIo, that.dstIo)
            && Objects.equals(this.transData, that.transData) && Objects.equals(this.transLines, that.transLines)
            && Objects.equals(this.usedVolumes, that.usedVolumes) && Objects.equals(this.usedMemory, that.usedMemory)
            && Objects.equals(this.usedCpuPercent, that.usedCpuPercent)
            && Objects.equals(this.nodeVolumeSize, that.nodeVolumeSize)
            && Objects.equals(this.nodeMemorySize, that.nodeMemorySize)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.applyRate, that.applyRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidth,
            isSrcNormal,
            isDstNormal,
            srcOffset,
            nodeOffset,
            dstOffset,
            srcDelay,
            dstDelay,
            srcRps,
            srcIo,
            dstRps,
            dstIo,
            transData,
            transLines,
            usedVolumes,
            usedMemory,
            usedCpuPercent,
            nodeVolumeSize,
            nodeMemorySize,
            updateTime,
            applyRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMonitorDataResponse {\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    isSrcNormal: ").append(toIndentedString(isSrcNormal)).append("\n");
        sb.append("    isDstNormal: ").append(toIndentedString(isDstNormal)).append("\n");
        sb.append("    srcOffset: ").append(toIndentedString(srcOffset)).append("\n");
        sb.append("    nodeOffset: ").append(toIndentedString(nodeOffset)).append("\n");
        sb.append("    dstOffset: ").append(toIndentedString(dstOffset)).append("\n");
        sb.append("    srcDelay: ").append(toIndentedString(srcDelay)).append("\n");
        sb.append("    dstDelay: ").append(toIndentedString(dstDelay)).append("\n");
        sb.append("    srcRps: ").append(toIndentedString(srcRps)).append("\n");
        sb.append("    srcIo: ").append(toIndentedString(srcIo)).append("\n");
        sb.append("    dstRps: ").append(toIndentedString(dstRps)).append("\n");
        sb.append("    dstIo: ").append(toIndentedString(dstIo)).append("\n");
        sb.append("    transData: ").append(toIndentedString(transData)).append("\n");
        sb.append("    transLines: ").append(toIndentedString(transLines)).append("\n");
        sb.append("    usedVolumes: ").append(toIndentedString(usedVolumes)).append("\n");
        sb.append("    usedMemory: ").append(toIndentedString(usedMemory)).append("\n");
        sb.append("    usedCpuPercent: ").append(toIndentedString(usedCpuPercent)).append("\n");
        sb.append("    nodeVolumeSize: ").append(toIndentedString(nodeVolumeSize)).append("\n");
        sb.append("    nodeMemorySize: ").append(toIndentedString(nodeMemorySize)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    applyRate: ").append(toIndentedString(applyRate)).append("\n");
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
