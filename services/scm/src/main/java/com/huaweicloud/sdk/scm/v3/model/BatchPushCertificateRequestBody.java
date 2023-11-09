package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchPushCertificateRequestBody
 */
public class BatchPushCertificateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_projects")

    private List<String> targetProjects = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_service")

    private String targetService;

    public BatchPushCertificateRequestBody withTargetProjects(List<String> targetProjects) {
        this.targetProjects = targetProjects;
        return this;
    }

    public BatchPushCertificateRequestBody addTargetProjectsItem(String targetProjectsItem) {
        if (this.targetProjects == null) {
            this.targetProjects = new ArrayList<>();
        }
        this.targetProjects.add(targetProjectsItem);
        return this;
    }

    public BatchPushCertificateRequestBody withTargetProjects(Consumer<List<String>> targetProjectsSetter) {
        if (this.targetProjects == null) {
            this.targetProjects = new ArrayList<>();
        }
        targetProjectsSetter.accept(this.targetProjects);
        return this;
    }

    /**
     * 推送到的目标服务所在的区域，CDN支持区域固定为：Global。
     * @return targetProjects
     */
    public List<String> getTargetProjects() {
        return targetProjects;
    }

    public void setTargetProjects(List<String> targetProjects) {
        this.targetProjects = targetProjects;
    }

    public BatchPushCertificateRequestBody withTargetService(String targetService) {
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
        BatchPushCertificateRequestBody that = (BatchPushCertificateRequestBody) obj;
        return Objects.equals(this.targetProjects, that.targetProjects)
            && Objects.equals(this.targetService, that.targetService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetProjects, targetService);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchPushCertificateRequestBody {\n");
        sb.append("    targetProjects: ").append(toIndentedString(targetProjects)).append("\n");
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
