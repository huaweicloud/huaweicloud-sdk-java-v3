package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateTestReportCustomDetailByUriRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_uri")

    private String reportUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_info_uri")

    private String customInfoUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private TestReportCustomDetailInfo body;

    public UpdateTestReportCustomDetailByUriRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID，固定长度32位字符（字母和数字）。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateTestReportCustomDetailByUriRequest withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * 计划uri
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    public UpdateTestReportCustomDetailByUriRequest withReportUri(String reportUri) {
        this.reportUri = reportUri;
        return this;
    }

    /**
     * 测试报告Uri
     * @return reportUri
     */
    public String getReportUri() {
        return reportUri;
    }

    public void setReportUri(String reportUri) {
        this.reportUri = reportUri;
    }

    public UpdateTestReportCustomDetailByUriRequest withCustomInfoUri(String customInfoUri) {
        this.customInfoUri = customInfoUri;
        return this;
    }

    /**
     * 测试报告自定义模块Uri
     * @return customInfoUri
     */
    public String getCustomInfoUri() {
        return customInfoUri;
    }

    public void setCustomInfoUri(String customInfoUri) {
        this.customInfoUri = customInfoUri;
    }

    public UpdateTestReportCustomDetailByUriRequest withBody(TestReportCustomDetailInfo body) {
        this.body = body;
        return this;
    }

    public UpdateTestReportCustomDetailByUriRequest withBody(Consumer<TestReportCustomDetailInfo> bodySetter) {
        if (this.body == null) {
            this.body = new TestReportCustomDetailInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public TestReportCustomDetailInfo getBody() {
        return body;
    }

    public void setBody(TestReportCustomDetailInfo body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTestReportCustomDetailByUriRequest that = (UpdateTestReportCustomDetailByUriRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.versionUri, that.versionUri)
            && Objects.equals(this.reportUri, that.reportUri) && Objects.equals(this.customInfoUri, that.customInfoUri)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, versionUri, reportUri, customInfoUri, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTestReportCustomDetailByUriRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
        sb.append("    reportUri: ").append(toIndentedString(reportUri)).append("\n");
        sb.append("    customInfoUri: ").append(toIndentedString(customInfoUri)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
