package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListIsolatedFileRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_days")

    private Integer lastDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isolation_status")

    private String isolationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListIsolatedFileRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * region id
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ListIsolatedFileRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 租户企业项目ID，查询所有企业项目时填写：all_granted_eps
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListIsolatedFileRequest withLastDays(Integer lastDays) {
        this.lastDays = lastDays;
        return this;
    }

    /**
     * 查询时间范围天数，与自定义查询时间begin_time，end_time互斥
     * minimum: 1
     * maximum: 30
     * @return lastDays
     */
    public Integer getLastDays() {
        return lastDays;
    }

    public void setLastDays(Integer lastDays) {
        this.lastDays = lastDays;
    }

    public ListIsolatedFileRequest withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 服务器名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ListIsolatedFileRequest withIsolationStatus(String isolationStatus) {
        this.isolationStatus = isolationStatus;
        return this;
    }

    /**
     * 隔离状态，包含如下:   - isolated : 已隔离   - restored : 已恢复   - isolating : 已下发隔离任务   - restoring : 已下发恢复任务
     * @return isolationStatus
     */
    public String getIsolationStatus() {
        return isolationStatus;
    }

    public void setIsolationStatus(String isolationStatus) {
        this.isolationStatus = isolationStatus;
    }

    public ListIsolatedFileRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量：指定返回记录的开始位置，必须为数字，取值范围为大于或等于0，默认0
     * minimum: 0
     * maximum: 2000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListIsolatedFileRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示个数
     * minimum: 10
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListIsolatedFileRequest that = (ListIsolatedFileRequest) obj;
        return Objects.equals(this.region, that.region)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.lastDays, that.lastDays) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.isolationStatus, that.isolationStatus) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, enterpriseProjectId, lastDays, hostName, isolationStatus, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIsolatedFileRequest {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    lastDays: ").append(toIndentedString(lastDays)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    isolationStatus: ").append(toIndentedString(isolationStatus)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
