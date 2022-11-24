package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListReadWriteRatioRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "curPage")

    private String curPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "perPage")

    private String perPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startDate")

    private String startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endDate")

    private String endDate;

    public ListReadWriteRatioRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * DDM实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListReadWriteRatioRequest withCurPage(String curPage) {
        this.curPage = curPage;
        return this;
    }

    /**
     * 分页参数：起始值 [大于等于0] 。
     * @return curPage
     */
    public String getCurPage() {
        return curPage;
    }

    public void setCurPage(String curPage) {
        this.curPage = curPage;
    }

    public ListReadWriteRatioRequest withPerPage(String perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * 分页参数：每页多少条。
     * @return perPage
     */
    public String getPerPage() {
        return perPage;
    }

    public void setPerPage(String perPage) {
        this.perPage = perPage;
    }

    public ListReadWriteRatioRequest withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 开始时间，UTC time，精确到毫秒。
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public ListReadWriteRatioRequest withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 结束时间，UTC time，精确到毫秒。结束时间与开始时间，间隔不能超过1个月。
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListReadWriteRatioRequest listReadWriteRatioRequest = (ListReadWriteRatioRequest) o;
        return Objects.equals(this.instanceId, listReadWriteRatioRequest.instanceId)
            && Objects.equals(this.curPage, listReadWriteRatioRequest.curPage)
            && Objects.equals(this.perPage, listReadWriteRatioRequest.perPage)
            && Objects.equals(this.startDate, listReadWriteRatioRequest.startDate)
            && Objects.equals(this.endDate, listReadWriteRatioRequest.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, curPage, perPage, startDate, endDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReadWriteRatioRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    curPage: ").append(toIndentedString(curPage)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
