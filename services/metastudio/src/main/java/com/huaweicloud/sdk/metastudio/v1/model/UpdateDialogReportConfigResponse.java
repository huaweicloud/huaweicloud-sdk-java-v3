package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateDialogReportConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_name")

    private String obsBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_endpoint")

    private String obsEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_dialog_report")

    private Boolean enableDialogReport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public UpdateDialogReportConfigResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateDialogReportConfigResponse withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * **参数解释**： 接收对话结果上报的obs桶名。 **约束限制**： 不涉及 **取值范围**： 字符长度1-64 **默认取值**： 不涉及
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public UpdateDialogReportConfigResponse withObsEndpoint(String obsEndpoint) {
        this.obsEndpoint = obsEndpoint;
        return this;
    }

    /**
     * **参数解释**： 接收对话结果上报的obs终端节点。 **约束限制**： 需要为obs合法终端节点。 **取值范围**： 字符长度1-64 **默认取值**： 不涉及
     * @return obsEndpoint
     */
    public String getObsEndpoint() {
        return obsEndpoint;
    }

    public void setObsEndpoint(String obsEndpoint) {
        this.obsEndpoint = obsEndpoint;
    }

    public UpdateDialogReportConfigResponse withEnableDialogReport(Boolean enableDialogReport) {
        this.enableDialogReport = enableDialogReport;
        return this;
    }

    /**
     * 对话结果上报开关
     * @return enableDialogReport
     */
    public Boolean getEnableDialogReport() {
        return enableDialogReport;
    }

    public void setEnableDialogReport(Boolean enableDialogReport) {
        this.enableDialogReport = enableDialogReport;
    }

    public UpdateDialogReportConfigResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public UpdateDialogReportConfigResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateDialogReportConfigResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDialogReportConfigResponse that = (UpdateDialogReportConfigResponse) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.obsBucketName, that.obsBucketName)
            && Objects.equals(this.obsEndpoint, that.obsEndpoint)
            && Objects.equals(this.enableDialogReport, that.enableDialogReport)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(projectId, obsBucketName, obsEndpoint, enableDialogReport, createTime, updateTime, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDialogReportConfigResponse {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    obsEndpoint: ").append(toIndentedString(obsEndpoint)).append("\n");
        sb.append("    enableDialogReport: ").append(toIndentedString(enableDialogReport)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
