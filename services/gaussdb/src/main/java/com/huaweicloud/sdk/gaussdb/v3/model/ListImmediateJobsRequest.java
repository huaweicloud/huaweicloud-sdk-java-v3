package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListImmediateJobsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ListImmediateJobsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListImmediateJobsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务执行状态。 取值： - 值为“Running”，表示任务正在执行。 - 值为“Completed”，表示任务执行成功。 - 值为“Failed”，表示任务执行失败。 - 值为“Pending”，表示任务未执行。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListImmediateJobsRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 任务名称。取值有：  - \"CreateGaussDBforMySQLInstance\"表示创建实例。  - \"RestoreGaussDBforMySQLNewInstance\"表示恢复新实例。  - \"AddGaussDBforMySQLNodes\"表示添加节点。  - \"DeleteGaussDBforMySQLNode\"表示删除节点。  - \"RebootGaussDBforMySQLInstance\"表示重启实例。  - \"ModifyGaussDBforMySQLPort\"表示修改实例端口。  - \"ModifyGaussDBforMySQLSecurityGroup\"表示修改实例安全组。  - \"ResizeGaussDBforMySQLFlavor\"表示实例规格变更。  - \"SwitchoverGaussDBforMySQLMasterNode\"表示只读升主。  - \"GaussDBforMySQLBindEIP\"表示绑定弹性公网IP。  - \"GaussDBforMySQLUnbindEIP\"表示解绑弹性公网IP。  - \"RenameGaussDBforMySQLInstance\"表示修改实例名称。  - \"DeleteGaussDBforMySQLInstance\"表示删除实例集群。  - \"UpgradeGaussDBforMySQLDatabaseVersion\"表示版本升级。  - \"EnlargeGaussDBforMySQLProxy\"表示实例的数据库代理节点扩容。  - \"OpenGaussDBforMySQLProxy\"表示开启实例的数据库代理。  - \"CloseGaussDBforMySQLProxy\"表示关闭实例的数据库代理。  - \"GaussdbforMySQLModifyProxyIp\"表示修改数据库代理ip。  - \"ScaleGaussDBforMySQLProxy\"表示实例的数据库代理节点规格变更。  - \"GaussDBforMySQLModifyInstanceMetricExtend\"表示实例秒级监控。  - \"GaussDBforMySQLModifyInstanceDataVip\"表示修改实例数据Vip。  - \"GaussDBforMySQLSwitchSSL\"表示切换实例SSL开关。  - \"GaussDBforMySQLModifyProxyConsist\"表示修改代理一致性。  - \"GaussDBforMySQLModifyProxyWeight\"表示修改代理权重。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ListImmediateJobsRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ListImmediateJobsRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，偏移量。从第一条数据偏移offset条数据后开始查询，默认为1，必须为数字，不能为负数。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListImmediateJobsRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数。默认为10，取值为10、20、50。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListImmediateJobsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 起始时间，格式为\"yyyy-mm-ddThh:mm:ssZ\"。 其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListImmediateJobsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间，格式为\"yyyy-mm-ddThh:mm:ssZ\"。 其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListImmediateJobsRequest that = (ListImmediateJobsRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.status, that.status)
            && Objects.equals(this.jobName, that.jobName) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, status, jobName, jobId, offset, limit, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImmediateJobsRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
