package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群扩容状态详情
 */
public class ResizeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_node_num")

    private Integer targetNodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_node_num")

    private Integer originNodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resize_status")

    private String resizeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    public ResizeInfo withTargetNodeNum(Integer targetNodeNum) {
        this.targetNodeNum = targetNodeNum;
        return this;
    }

    /**
     * **参数解释**： 扩容后的节点数量。 **取值范围**： 不涉及。
     * @return targetNodeNum
     */
    public Integer getTargetNodeNum() {
        return targetNodeNum;
    }

    public void setTargetNodeNum(Integer targetNodeNum) {
        this.targetNodeNum = targetNodeNum;
    }

    public ResizeInfo withOriginNodeNum(Integer originNodeNum) {
        this.originNodeNum = originNodeNum;
        return this;
    }

    /**
     * **参数解释**： 扩容前的节点数量。 **取值范围**： 不涉及。
     * @return originNodeNum
     */
    public Integer getOriginNodeNum() {
        return originNodeNum;
    }

    public void setOriginNodeNum(Integer originNodeNum) {
        this.originNodeNum = originNodeNum;
    }

    public ResizeInfo withResizeStatus(String resizeStatus) {
        this.resizeStatus = resizeStatus;
        return this;
    }

    /**
     * **参数解释**： 扩容状态。 **取值范围**： - GROWING：扩容中 - RESIZE_FAILURE：扩容失败。
     * @return resizeStatus
     */
    public String getResizeStatus() {
        return resizeStatus;
    }

    public void setResizeStatus(String resizeStatus) {
        this.resizeStatus = resizeStatus;
    }

    public ResizeInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 扩容开始时间，格式为ISO8601：YYYY-MM-DDThh:mm:ss **取值范围**： 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResizeInfo that = (ResizeInfo) obj;
        return Objects.equals(this.targetNodeNum, that.targetNodeNum)
            && Objects.equals(this.originNodeNum, that.originNodeNum)
            && Objects.equals(this.resizeStatus, that.resizeStatus) && Objects.equals(this.startTime, that.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetNodeNum, originNodeNum, resizeStatus, startTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeInfo {\n");
        sb.append("    targetNodeNum: ").append(toIndentedString(targetNodeNum)).append("\n");
        sb.append("    originNodeNum: ").append(toIndentedString(originNodeNum)).append("\n");
        sb.append("    resizeStatus: ").append(toIndentedString(resizeStatus)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
