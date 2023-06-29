package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 告警消息请求参数。
 */
public class AlarmDataListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_id")

    private Long businessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_item_id")

    private Long monitorItemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_level")

    private String alarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_start_time")

    private String alarmStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_end_time")

    private String alarmEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collector_id")

    private Integer collectorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_list")

    private List<Long> envList = null;

    public AlarmDataListRequest withPage(Integer page) {
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

    public AlarmDataListRequest withPageSize(Integer pageSize) {
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

    public AlarmDataListRequest withRegion(String region) {
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

    public AlarmDataListRequest withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 组件环境名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public AlarmDataListRequest withBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }

    /**
     * 应用id。
     * @return businessId
     */
    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public AlarmDataListRequest withMonitorItemId(Long monitorItemId) {
        this.monitorItemId = monitorItemId;
        return this;
    }

    /**
     * 监控项id。
     * @return monitorItemId
     */
    public Long getMonitorItemId() {
        return monitorItemId;
    }

    public void setMonitorItemId(Long monitorItemId) {
        this.monitorItemId = monitorItemId;
    }

    public AlarmDataListRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 告警状态  RECOVER：已恢复 ABNORMAL：异常 ALERT：告警中。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AlarmDataListRequest withAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    /**
     * 告警级别  COMMON：轻微  CRITICAL：严重。
     * @return alarmLevel
     */
    public String getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public AlarmDataListRequest withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 关键字。
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public AlarmDataListRequest withAlarmStartTime(String alarmStartTime) {
        this.alarmStartTime = alarmStartTime;
        return this;
    }

    /**
     * 告警开始时间。
     * @return alarmStartTime
     */
    public String getAlarmStartTime() {
        return alarmStartTime;
    }

    public void setAlarmStartTime(String alarmStartTime) {
        this.alarmStartTime = alarmStartTime;
    }

    public AlarmDataListRequest withAlarmEndTime(String alarmEndTime) {
        this.alarmEndTime = alarmEndTime;
        return this;
    }

    /**
     * 告警结束时间。
     * @return alarmEndTime
     */
    public String getAlarmEndTime() {
        return alarmEndTime;
    }

    public void setAlarmEndTime(String alarmEndTime) {
        this.alarmEndTime = alarmEndTime;
    }

    public AlarmDataListRequest withCollectorId(Integer collectorId) {
        this.collectorId = collectorId;
        return this;
    }

    /**
     * 采集器id。
     * @return collectorId
     */
    public Integer getCollectorId() {
        return collectorId;
    }

    public void setCollectorId(Integer collectorId) {
        this.collectorId = collectorId;
    }

    public AlarmDataListRequest withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * 实例ip地址。
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public AlarmDataListRequest withEnvList(List<Long> envList) {
        this.envList = envList;
        return this;
    }

    public AlarmDataListRequest addEnvListItem(Long envListItem) {
        if (this.envList == null) {
            this.envList = new ArrayList<>();
        }
        this.envList.add(envListItem);
        return this;
    }

    public AlarmDataListRequest withEnvList(Consumer<List<Long>> envListSetter) {
        if (this.envList == null) {
            this.envList = new ArrayList<>();
        }
        envListSetter.accept(this.envList);
        return this;
    }

    /**
     * 环境集合。
     * @return envList
     */
    public List<Long> getEnvList() {
        return envList;
    }

    public void setEnvList(List<Long> envList) {
        this.envList = envList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmDataListRequest that = (AlarmDataListRequest) obj;
        return Objects.equals(this.page, that.page) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.region, that.region) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.businessId, that.businessId)
            && Objects.equals(this.monitorItemId, that.monitorItemId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.alarmLevel, that.alarmLevel) && Objects.equals(this.keyword, that.keyword)
            && Objects.equals(this.alarmStartTime, that.alarmStartTime)
            && Objects.equals(this.alarmEndTime, that.alarmEndTime)
            && Objects.equals(this.collectorId, that.collectorId) && Objects.equals(this.ipAddress, that.ipAddress)
            && Objects.equals(this.envList, that.envList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page,
            pageSize,
            region,
            appName,
            businessId,
            monitorItemId,
            status,
            alarmLevel,
            keyword,
            alarmStartTime,
            alarmEndTime,
            collectorId,
            ipAddress,
            envList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmDataListRequest {\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    monitorItemId: ").append(toIndentedString(monitorItemId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    alarmStartTime: ").append(toIndentedString(alarmStartTime)).append("\n");
        sb.append("    alarmEndTime: ").append(toIndentedString(alarmEndTime)).append("\n");
        sb.append("    collectorId: ").append(toIndentedString(collectorId)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    envList: ").append(toIndentedString(envList)).append("\n");
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
