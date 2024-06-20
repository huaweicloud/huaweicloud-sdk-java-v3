package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 流水线并发管理
 */
public class PipelineConcurrencyMgmt {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_id")

    private String pipelineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrency_number")

    private Integer concurrencyNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exceed_action")

    private String exceedAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    public PipelineConcurrencyMgmt withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * 流水线id
     * @return pipelineId
     */
    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public PipelineConcurrencyMgmt withConcurrencyNumber(Integer concurrencyNumber) {
        this.concurrencyNumber = concurrencyNumber;
        return this;
    }

    /**
     * 并行数量
     * @return concurrencyNumber
     */
    public Integer getConcurrencyNumber() {
        return concurrencyNumber;
    }

    public void setConcurrencyNumber(Integer concurrencyNumber) {
        this.concurrencyNumber = concurrencyNumber;
    }

    public PipelineConcurrencyMgmt withExceedAction(String exceedAction) {
        this.exceedAction = exceedAction;
        return this;
    }

    /**
     * 超出情况下策略
     * @return exceedAction
     */
    public String getExceedAction() {
        return exceedAction;
    }

    public void setExceedAction(String exceedAction) {
        this.exceedAction = exceedAction;
    }

    public PipelineConcurrencyMgmt withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public PipelineConcurrencyMgmt withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public PipelineConcurrencyMgmt withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否有效
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipelineConcurrencyMgmt that = (PipelineConcurrencyMgmt) obj;
        return Objects.equals(this.pipelineId, that.pipelineId)
            && Objects.equals(this.concurrencyNumber, that.concurrencyNumber)
            && Objects.equals(this.exceedAction, that.exceedAction) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.enable, that.enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipelineId, concurrencyNumber, exceedAction, createTime, updateTime, enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineConcurrencyMgmt {\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    concurrencyNumber: ").append(toIndentedString(concurrencyNumber)).append("\n");
        sb.append("    exceedAction: ").append(toIndentedString(exceedAction)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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
