package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateMyActionTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_pkg_path")

    private String funcPkgPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_logo_path")

    private Map<String, String> funcLogoPath = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_help_path")

    private Map<String, String> funcHelpPath = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_test_report_path")

    private Map<String, String> funcTestReportPath = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_opensource_notice_path")

    private Map<String, String> funcOpensourceNoticePath = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_sla_path")

    private Map<String, String> funcSlaPath = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Connection")

    private String connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Length")

    private String contentLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    private String date;

    public CreateMyActionTemplateResponse withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 三方算子ID
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public CreateMyActionTemplateResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 三方算子创建的时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CreateMyActionTemplateResponse withFuncPkgPath(String funcPkgPath) {
        this.funcPkgPath = funcPkgPath;
        return this;
    }

    /**
     * 签名OBS地址，用于上传中英文算子包
     * @return funcPkgPath
     */
    public String getFuncPkgPath() {
        return funcPkgPath;
    }

    public void setFuncPkgPath(String funcPkgPath) {
        this.funcPkgPath = funcPkgPath;
    }

    public CreateMyActionTemplateResponse withFuncLogoPath(Map<String, String> funcLogoPath) {
        this.funcLogoPath = funcLogoPath;
        return this;
    }

    public CreateMyActionTemplateResponse putFuncLogoPathItem(String key, String funcLogoPathItem) {
        if (this.funcLogoPath == null) {
            this.funcLogoPath = new HashMap<>();
        }
        this.funcLogoPath.put(key, funcLogoPathItem);
        return this;
    }

    public CreateMyActionTemplateResponse withFuncLogoPath(Consumer<Map<String, String>> funcLogoPathSetter) {
        if (this.funcLogoPath == null) {
            this.funcLogoPath = new HashMap<>();
        }
        funcLogoPathSetter.accept(this.funcLogoPath);
        return this;
    }

    /**
     * 签名OBS地址，用于上传中英文算子logo
     * @return funcLogoPath
     */
    public Map<String, String> getFuncLogoPath() {
        return funcLogoPath;
    }

    public void setFuncLogoPath(Map<String, String> funcLogoPath) {
        this.funcLogoPath = funcLogoPath;
    }

    public CreateMyActionTemplateResponse withFuncHelpPath(Map<String, String> funcHelpPath) {
        this.funcHelpPath = funcHelpPath;
        return this;
    }

    public CreateMyActionTemplateResponse putFuncHelpPathItem(String key, String funcHelpPathItem) {
        if (this.funcHelpPath == null) {
            this.funcHelpPath = new HashMap<>();
        }
        this.funcHelpPath.put(key, funcHelpPathItem);
        return this;
    }

    public CreateMyActionTemplateResponse withFuncHelpPath(Consumer<Map<String, String>> funcHelpPathSetter) {
        if (this.funcHelpPath == null) {
            this.funcHelpPath = new HashMap<>();
        }
        funcHelpPathSetter.accept(this.funcHelpPath);
        return this;
    }

    /**
     * 签名OBS地址，用于上传中英文算子帮助文档
     * @return funcHelpPath
     */
    public Map<String, String> getFuncHelpPath() {
        return funcHelpPath;
    }

    public void setFuncHelpPath(Map<String, String> funcHelpPath) {
        this.funcHelpPath = funcHelpPath;
    }

    public CreateMyActionTemplateResponse withFuncTestReportPath(Map<String, String> funcTestReportPath) {
        this.funcTestReportPath = funcTestReportPath;
        return this;
    }

    public CreateMyActionTemplateResponse putFuncTestReportPathItem(String key, String funcTestReportPathItem) {
        if (this.funcTestReportPath == null) {
            this.funcTestReportPath = new HashMap<>();
        }
        this.funcTestReportPath.put(key, funcTestReportPathItem);
        return this;
    }

    public CreateMyActionTemplateResponse withFuncTestReportPath(
        Consumer<Map<String, String>> funcTestReportPathSetter) {
        if (this.funcTestReportPath == null) {
            this.funcTestReportPath = new HashMap<>();
        }
        funcTestReportPathSetter.accept(this.funcTestReportPath);
        return this;
    }

    /**
     * 签名OBS地址，用于上传中英文算子测试报告
     * @return funcTestReportPath
     */
    public Map<String, String> getFuncTestReportPath() {
        return funcTestReportPath;
    }

    public void setFuncTestReportPath(Map<String, String> funcTestReportPath) {
        this.funcTestReportPath = funcTestReportPath;
    }

    public CreateMyActionTemplateResponse withFuncOpensourceNoticePath(Map<String, String> funcOpensourceNoticePath) {
        this.funcOpensourceNoticePath = funcOpensourceNoticePath;
        return this;
    }

    public CreateMyActionTemplateResponse putFuncOpensourceNoticePathItem(String key,
        String funcOpensourceNoticePathItem) {
        if (this.funcOpensourceNoticePath == null) {
            this.funcOpensourceNoticePath = new HashMap<>();
        }
        this.funcOpensourceNoticePath.put(key, funcOpensourceNoticePathItem);
        return this;
    }

    public CreateMyActionTemplateResponse withFuncOpensourceNoticePath(
        Consumer<Map<String, String>> funcOpensourceNoticePathSetter) {
        if (this.funcOpensourceNoticePath == null) {
            this.funcOpensourceNoticePath = new HashMap<>();
        }
        funcOpensourceNoticePathSetter.accept(this.funcOpensourceNoticePath);
        return this;
    }

    /**
     * 签名OBS地址，用于上传中英文开源须知
     * @return funcOpensourceNoticePath
     */
    public Map<String, String> getFuncOpensourceNoticePath() {
        return funcOpensourceNoticePath;
    }

    public void setFuncOpensourceNoticePath(Map<String, String> funcOpensourceNoticePath) {
        this.funcOpensourceNoticePath = funcOpensourceNoticePath;
    }

    public CreateMyActionTemplateResponse withFuncSlaPath(Map<String, String> funcSlaPath) {
        this.funcSlaPath = funcSlaPath;
        return this;
    }

    public CreateMyActionTemplateResponse putFuncSlaPathItem(String key, String funcSlaPathItem) {
        if (this.funcSlaPath == null) {
            this.funcSlaPath = new HashMap<>();
        }
        this.funcSlaPath.put(key, funcSlaPathItem);
        return this;
    }

    public CreateMyActionTemplateResponse withFuncSlaPath(Consumer<Map<String, String>> funcSlaPathSetter) {
        if (this.funcSlaPath == null) {
            this.funcSlaPath = new HashMap<>();
        }
        funcSlaPathSetter.accept(this.funcSlaPath);
        return this;
    }

    /**
     * 签名OBS地址，用于上传中英文服务协议材料
     * @return funcSlaPath
     */
    public Map<String, String> getFuncSlaPath() {
        return funcSlaPath;
    }

    public void setFuncSlaPath(Map<String, String> funcSlaPath) {
        this.funcSlaPath = funcSlaPath;
    }

    public CreateMyActionTemplateResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    public CreateMyActionTemplateResponse withConnection(String connection) {
        this.connection = connection;
        return this;
    }

    /**
     * Get connection
     * @return connection
     */
    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public CreateMyActionTemplateResponse withContentLength(String contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get contentLength
     * @return contentLength
     */
    public String getContentLength() {
        return contentLength;
    }

    public void setContentLength(String contentLength) {
        this.contentLength = contentLength;
    }

    public CreateMyActionTemplateResponse withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMyActionTemplateResponse createMyActionTemplateResponse = (CreateMyActionTemplateResponse) o;
        return Objects.equals(this.templateName, createMyActionTemplateResponse.templateName)
            && Objects.equals(this.createdAt, createMyActionTemplateResponse.createdAt)
            && Objects.equals(this.funcPkgPath, createMyActionTemplateResponse.funcPkgPath)
            && Objects.equals(this.funcLogoPath, createMyActionTemplateResponse.funcLogoPath)
            && Objects.equals(this.funcHelpPath, createMyActionTemplateResponse.funcHelpPath)
            && Objects.equals(this.funcTestReportPath, createMyActionTemplateResponse.funcTestReportPath)
            && Objects.equals(this.funcOpensourceNoticePath, createMyActionTemplateResponse.funcOpensourceNoticePath)
            && Objects.equals(this.funcSlaPath, createMyActionTemplateResponse.funcSlaPath)
            && Objects.equals(this.xRequestId, createMyActionTemplateResponse.xRequestId)
            && Objects.equals(this.connection, createMyActionTemplateResponse.connection)
            && Objects.equals(this.contentLength, createMyActionTemplateResponse.contentLength)
            && Objects.equals(this.date, createMyActionTemplateResponse.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateName,
            createdAt,
            funcPkgPath,
            funcLogoPath,
            funcHelpPath,
            funcTestReportPath,
            funcOpensourceNoticePath,
            funcSlaPath,
            xRequestId,
            connection,
            contentLength,
            date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMyActionTemplateResponse {\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    funcPkgPath: ").append(toIndentedString(funcPkgPath)).append("\n");
        sb.append("    funcLogoPath: ").append(toIndentedString(funcLogoPath)).append("\n");
        sb.append("    funcHelpPath: ").append(toIndentedString(funcHelpPath)).append("\n");
        sb.append("    funcTestReportPath: ").append(toIndentedString(funcTestReportPath)).append("\n");
        sb.append("    funcOpensourceNoticePath: ").append(toIndentedString(funcOpensourceNoticePath)).append("\n");
        sb.append("    funcSlaPath: ").append(toIndentedString(funcSlaPath)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
