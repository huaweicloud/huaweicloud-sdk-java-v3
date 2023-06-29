package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PushCertificateRequestBody
 */
public class PushCertificateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_project")

    private String targetProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_service")

    private String targetService;

    public PushCertificateRequestBody withTargetProject(String targetProject) {
        this.targetProject = targetProject;
        return this;
    }

    /**
     * 推送到的目标服务所在的区域。
     * @return targetProject
     */
    public String getTargetProject() {
        return targetProject;
    }

    public void setTargetProject(String targetProject) {
        this.targetProject = targetProject;
    }

    public PushCertificateRequestBody withTargetService(String targetService) {
        this.targetService = targetService;
        return this;
    }

    /**
     * 证书推送的目标服务，当前仅支持：CDN、WAF、ELB。
     * @return targetService
     */
    public String getTargetService() {
        return targetService;
    }

    public void setTargetService(String targetService) {
        this.targetService = targetService;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PushCertificateRequestBody that = (PushCertificateRequestBody) obj;
        return Objects.equals(this.targetProject, that.targetProject)
            && Objects.equals(this.targetService, that.targetService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetProject, targetService);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PushCertificateRequestBody {\n");
        sb.append("    targetProject: ").append(toIndentedString(targetProject)).append("\n");
        sb.append("    targetService: ").append(toIndentedString(targetService)).append("\n");
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
