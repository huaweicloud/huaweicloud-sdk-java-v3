package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 任务详情子项详情。 **取值范围**： 不涉及。
 */
public class ActionSubItemVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private String detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_item_name")

    private String subItemName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimated_time")

    private Integer estimatedTime;

    public ActionSubItemVo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 状态。 **取值范围**： 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ActionSubItemVo withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * **参数解释**： 扩展信息。 **取值范围**： 不涉及。
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public ActionSubItemVo withSubItemName(String subItemName) {
        this.subItemName = subItemName;
        return this;
    }

    /**
     * **参数解释**： 子项名称，根据请求header中的x-language字段返回对应的中/英文名称。 **取值范围**： 不涉及。
     * @return subItemName
     */
    public String getSubItemName() {
        return subItemName;
    }

    public void setSubItemName(String subItemName) {
        this.subItemName = subItemName;
    }

    public ActionSubItemVo withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * **参数解释**： 开始时间。 **取值范围**： 时间格式，或null值。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ActionSubItemVo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 结束时间。 **取值范围**： 时间格式，或null值。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ActionSubItemVo withEstimatedTime(Integer estimatedTime) {
        this.estimatedTime = estimatedTime;
        return this;
    }

    /**
     * **参数解释**： 预估时间。 **取值范围**： 整数。
     * @return estimatedTime
     */
    public Integer getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(Integer estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionSubItemVo that = (ActionSubItemVo) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.detail, that.detail)
            && Objects.equals(this.subItemName, that.subItemName) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.estimatedTime, that.estimatedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, detail, subItemName, beginTime, endTime, estimatedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionSubItemVo {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    subItemName: ").append(toIndentedString(subItemName)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    estimatedTime: ").append(toIndentedString(estimatedTime)).append("\n");
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
