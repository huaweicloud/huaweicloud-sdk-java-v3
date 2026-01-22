package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class CreateSecretRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectname")

    private String projectname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration_seconds")

    private Integer durationSeconds;

    public CreateSecretRequest withProjectname(String projectname) {
        this.projectname = projectname;
        return this;
    }

    /**
     * 项目名称，缺省值默认为区域名称，例如：cn-north-1。 
     * @return projectname
     */
    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public CreateSecretRequest withDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    /**
     * 自定义临时凭证有效期，单位秒，取值范围15min-24h
     * minimum: 900
     * maximum: 86400
     * @return durationSeconds
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSecretRequest that = (CreateSecretRequest) obj;
        return Objects.equals(this.projectname, that.projectname)
            && Objects.equals(this.durationSeconds, that.durationSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectname, durationSeconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecretRequest {\n");
        sb.append("    projectname: ").append(toIndentedString(projectname)).append("\n");
        sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
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
