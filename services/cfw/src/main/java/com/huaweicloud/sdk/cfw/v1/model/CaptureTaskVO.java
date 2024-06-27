package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CaptureTaskVO
 */
public class CaptureTaskVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capture_size")

    private String captureSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private String createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_address")

    private String destAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_address_type")

    private Integer destAddressType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_port")

    private String destPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_deleted")

    private Integer isDeleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_packets")

    private Integer maxPackets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_date")

    private String modifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private Integer protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remaining_days")

    private Integer remainingDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_address")

    private String sourceAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_address_type")

    private Integer sourceAddressType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_port")

    private String sourcePort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    public CaptureTaskVO withCaptureSize(String captureSize) {
        this.captureSize = captureSize;
        return this;
    }

    /**
     * 抓包大小
     * @return captureSize
     */
    public String getCaptureSize() {
        return captureSize;
    }

    public void setCaptureSize(String captureSize) {
        this.captureSize = captureSize;
    }

    public CaptureTaskVO withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 抓包创建时间
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public CaptureTaskVO withDestAddress(String destAddress) {
        this.destAddress = destAddress;
        return this;
    }

    /**
     * 目的地址
     * @return destAddress
     */
    public String getDestAddress() {
        return destAddress;
    }

    public void setDestAddress(String destAddress) {
        this.destAddress = destAddress;
    }

    public CaptureTaskVO withDestAddressType(Integer destAddressType) {
        this.destAddressType = destAddressType;
        return this;
    }

    /**
     * 目的地址类型0 ipv4,1 ipv6
     * @return destAddressType
     */
    public Integer getDestAddressType() {
        return destAddressType;
    }

    public void setDestAddressType(Integer destAddressType) {
        this.destAddressType = destAddressType;
    }

    public CaptureTaskVO withDestPort(String destPort) {
        this.destPort = destPort;
        return this;
    }

    /**
     * 目的端口
     * @return destPort
     */
    public String getDestPort() {
        return destPort;
    }

    public void setDestPort(String destPort) {
        this.destPort = destPort;
    }

    public CaptureTaskVO withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 抓包时长
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public CaptureTaskVO withIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    /**
     * 是否被删除，0否 1是
     * @return isDeleted
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public CaptureTaskVO withMaxPackets(Integer maxPackets) {
        this.maxPackets = maxPackets;
        return this;
    }

    /**
     * 最大抓包数
     * @return maxPackets
     */
    public Integer getMaxPackets() {
        return maxPackets;
    }

    public void setMaxPackets(Integer maxPackets) {
        this.maxPackets = maxPackets;
    }

    public CaptureTaskVO withModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * 修改日期
     * @return modifiedDate
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public CaptureTaskVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 抓包任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CaptureTaskVO withProtocol(Integer protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议类型:TCP为6，UDP为17，ICMP为1，ICMPV6为58，ANY为-1，手动类型不为空，自动类型为空
     * @return protocol
     */
    public Integer getProtocol() {
        return protocol;
    }

    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    public CaptureTaskVO withRemainingDays(Integer remainingDays) {
        this.remainingDays = remainingDays;
        return this;
    }

    /**
     * 剩余保留天数
     * @return remainingDays
     */
    public Integer getRemainingDays() {
        return remainingDays;
    }

    public void setRemainingDays(Integer remainingDays) {
        this.remainingDays = remainingDays;
    }

    public CaptureTaskVO withSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
        return this;
    }

    /**
     * 源地址
     * @return sourceAddress
     */
    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public CaptureTaskVO withSourceAddressType(Integer sourceAddressType) {
        this.sourceAddressType = sourceAddressType;
        return this;
    }

    /**
     * 源地址类型0 ipv4,1 ipv6
     * @return sourceAddressType
     */
    public Integer getSourceAddressType() {
        return sourceAddressType;
    }

    public void setSourceAddressType(Integer sourceAddressType) {
        this.sourceAddressType = sourceAddressType;
    }

    public CaptureTaskVO withSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }

    /**
     * 源端口
     * @return sourcePort
     */
    public String getSourcePort() {
        return sourcePort;
    }

    public void setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
    }

    public CaptureTaskVO withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 抓包任务状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public CaptureTaskVO withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 抓包任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CaptureTaskVO that = (CaptureTaskVO) obj;
        return Objects.equals(this.captureSize, that.captureSize) && Objects.equals(this.createdDate, that.createdDate)
            && Objects.equals(this.destAddress, that.destAddress)
            && Objects.equals(this.destAddressType, that.destAddressType)
            && Objects.equals(this.destPort, that.destPort) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.isDeleted, that.isDeleted) && Objects.equals(this.maxPackets, that.maxPackets)
            && Objects.equals(this.modifiedDate, that.modifiedDate) && Objects.equals(this.name, that.name)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.remainingDays, that.remainingDays)
            && Objects.equals(this.sourceAddress, that.sourceAddress)
            && Objects.equals(this.sourceAddressType, that.sourceAddressType)
            && Objects.equals(this.sourcePort, that.sourcePort) && Objects.equals(this.status, that.status)
            && Objects.equals(this.taskId, that.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(captureSize,
            createdDate,
            destAddress,
            destAddressType,
            destPort,
            duration,
            isDeleted,
            maxPackets,
            modifiedDate,
            name,
            protocol,
            remainingDays,
            sourceAddress,
            sourceAddressType,
            sourcePort,
            status,
            taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaptureTaskVO {\n");
        sb.append("    captureSize: ").append(toIndentedString(captureSize)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    destAddress: ").append(toIndentedString(destAddress)).append("\n");
        sb.append("    destAddressType: ").append(toIndentedString(destAddressType)).append("\n");
        sb.append("    destPort: ").append(toIndentedString(destPort)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
        sb.append("    maxPackets: ").append(toIndentedString(maxPackets)).append("\n");
        sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    remainingDays: ").append(toIndentedString(remainingDays)).append("\n");
        sb.append("    sourceAddress: ").append(toIndentedString(sourceAddress)).append("\n");
        sb.append("    sourceAddressType: ").append(toIndentedString(sourceAddressType)).append("\n");
        sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
