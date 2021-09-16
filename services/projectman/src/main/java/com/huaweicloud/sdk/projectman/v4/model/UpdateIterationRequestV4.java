package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** UpdateIterationRequestV4 */
public class UpdateIterationRequestV4 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "over_type")

    private String overType;

    public UpdateIterationRequestV4 withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /** 开始时间，年-月-日
     * 
     * @return beginTime */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public UpdateIterationRequestV4 withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateIterationRequestV4 withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 结束时间，年-月-日
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public UpdateIterationRequestV4 withName(String name) {
        this.name = name;
        return this;
    }

    /** 标题
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateIterationRequestV4 withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 迭代的状态，0 未开始 <--> 1 进行中<--> 2 结束 <--> 1<-->0, 状态不能跨状态更改
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateIterationRequestV4 withOverType(String overType) {
        this.overType = overType;
        return this;
    }

    /** 迭代结束时，工作项的处理（close 所有的工作项关闭，empty 没有关闭的工作项 放在block里面），status更新为2时需要填写over_type
     * 
     * @return overType */
    public String getOverType() {
        return overType;
    }

    public void setOverType(String overType) {
        this.overType = overType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateIterationRequestV4 updateIterationRequestV4 = (UpdateIterationRequestV4) o;
        return Objects.equals(this.beginTime, updateIterationRequestV4.beginTime)
            && Objects.equals(this.description, updateIterationRequestV4.description)
            && Objects.equals(this.endTime, updateIterationRequestV4.endTime)
            && Objects.equals(this.name, updateIterationRequestV4.name)
            && Objects.equals(this.status, updateIterationRequestV4.status)
            && Objects.equals(this.overType, updateIterationRequestV4.overType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beginTime, description, endTime, name, status, overType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIterationRequestV4 {\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    overType: ").append(toIndentedString(overType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
