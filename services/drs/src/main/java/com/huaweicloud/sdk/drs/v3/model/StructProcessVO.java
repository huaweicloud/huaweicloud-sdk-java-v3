package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 灾备初始化进度信息体
 */
public class StructProcessVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_count")

    private Integer srcCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_count")

    private Integer dstCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    public StructProcessVO withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 对象类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StructProcessVO withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public StructProcessVO withSrcCount(Integer srcCount) {
        this.srcCount = srcCount;
        return this;
    }

    /**
     * 源对象数量
     * @return srcCount
     */
    public Integer getSrcCount() {
        return srcCount;
    }

    public void setSrcCount(Integer srcCount) {
        this.srcCount = srcCount;
    }

    public StructProcessVO withDstCount(Integer dstCount) {
        this.dstCount = dstCount;
        return this;
    }

    /**
     * 目标对象数量
     * @return dstCount
     */
    public Integer getDstCount() {
        return dstCount;
    }

    public void setDstCount(Integer dstCount) {
        this.dstCount = dstCount;
    }

    public StructProcessVO withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public StructProcessVO withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StructProcessVO structProcessVO = (StructProcessVO) o;
        return Objects.equals(this.type, structProcessVO.type) && Objects.equals(this.status, structProcessVO.status)
            && Objects.equals(this.srcCount, structProcessVO.srcCount)
            && Objects.equals(this.dstCount, structProcessVO.dstCount)
            && Objects.equals(this.startTime, structProcessVO.startTime)
            && Objects.equals(this.endTime, structProcessVO.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, status, srcCount, dstCount, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StructProcessVO {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    srcCount: ").append(toIndentedString(srcCount)).append("\n");
        sb.append("    dstCount: ").append(toIndentedString(dstCount)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
