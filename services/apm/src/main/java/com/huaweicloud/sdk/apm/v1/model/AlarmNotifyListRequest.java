package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询告警消息列表请求参数模型。
 */
public class AlarmNotifyListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_data_id")

    private Integer alarmDataId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    public AlarmNotifyListRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 页码。
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public AlarmNotifyListRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页数量。
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public AlarmNotifyListRequest withAlarmDataId(Integer alarmDataId) {
        this.alarmDataId = alarmDataId;
        return this;
    }

    /**
     * 告警事件id。
     * @return alarmDataId
     */
    public Integer getAlarmDataId() {
        return alarmDataId;
    }

    public void setAlarmDataId(Integer alarmDataId) {
        this.alarmDataId = alarmDataId;
    }

    public AlarmNotifyListRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * region英文名称。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmNotifyListRequest that = (AlarmNotifyListRequest) obj;
        return Objects.equals(this.page, that.page) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.alarmDataId, that.alarmDataId) && Objects.equals(this.region, that.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, pageSize, alarmDataId, region);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmNotifyListRequest {\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    alarmDataId: ").append(toIndentedString(alarmDataId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
