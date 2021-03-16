package com.huaweicloud.sdk.dws.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 集群扩容状态详情
 */
public class ResizeInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resize_status")
    
    private String resizeStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_node_num")
    
    private Integer targetNodeNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="origin_node_num")
    
    private Integer originNodeNum;

    public ResizeInfo withResizeStatus(String resizeStatus) {
        this.resizeStatus = resizeStatus;
        return this;
    }

    


    /**
     * 扩容状态，取值如下：  GROWING：扩容中  RESIZE_FAILURE：扩容失败
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
     * 扩容开始时间，格式为ISO8601：YYYY-MM-DDThh:mm:ss
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public ResizeInfo withTargetNodeNum(Integer targetNodeNum) {
        this.targetNodeNum = targetNodeNum;
        return this;
    }

    


    /**
     * 扩容后的节点数量
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
     * 扩容前的节点数量
     * @return originNodeNum
     */
    public Integer getOriginNodeNum() {
        return originNodeNum;
    }

    public void setOriginNodeNum(Integer originNodeNum) {
        this.originNodeNum = originNodeNum;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResizeInfo resizeInfo = (ResizeInfo) o;
        return Objects.equals(this.resizeStatus, resizeInfo.resizeStatus) &&
            Objects.equals(this.startTime, resizeInfo.startTime) &&
            Objects.equals(this.targetNodeNum, resizeInfo.targetNodeNum) &&
            Objects.equals(this.originNodeNum, resizeInfo.originNodeNum);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resizeStatus, startTime, targetNodeNum, originNodeNum);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeInfo {\n");
        sb.append("    resizeStatus: ").append(toIndentedString(resizeStatus)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    targetNodeNum: ").append(toIndentedString(targetNodeNum)).append("\n");
        sb.append("    originNodeNum: ").append(toIndentedString(originNodeNum)).append("\n");
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

