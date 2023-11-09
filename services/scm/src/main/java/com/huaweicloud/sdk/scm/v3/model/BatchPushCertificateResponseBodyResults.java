package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BatchPushCertificateResponseBodyResults
 */
public class BatchPushCertificateResponseBodyResults {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_id")

    private String certId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public BatchPushCertificateResponseBodyResults withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 推送区域名称，如cn-north-7。
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public BatchPushCertificateResponseBodyResults withCertId(String certId) {
        this.certId = certId;
        return this;
    }

    /**
     * 目标证书ID。
     * @return certId
     */
    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public BatchPushCertificateResponseBodyResults withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 推送结果
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchPushCertificateResponseBodyResults that = (BatchPushCertificateResponseBodyResults) obj;
        return Objects.equals(this.projectName, that.projectName) && Objects.equals(this.certId, that.certId)
            && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectName, certId, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchPushCertificateResponseBodyResults {\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    certId: ").append(toIndentedString(certId)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
