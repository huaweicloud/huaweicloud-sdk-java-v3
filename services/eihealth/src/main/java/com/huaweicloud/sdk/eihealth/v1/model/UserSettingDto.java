package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新用户请求体
 */
public class UserSettingDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_quota")

    private Integer jobQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_timeout")

    private Integer jobTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_quota")

    private Integer cpuQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_quota")

    private Integer memQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projects_per_user")

    private Integer projectsPerUser;

    public UserSettingDto withJobQuota(Integer jobQuota) {
        this.jobQuota = jobQuota;
        return this;
    }

    /**
     * 允许同时运行的作业数
     * minimum: 1
     * maximum: 100
     * @return jobQuota
     */
    public Integer getJobQuota() {
        return jobQuota;
    }

    public void setJobQuota(Integer jobQuota) {
        this.jobQuota = jobQuota;
    }

    public UserSettingDto withJobTimeout(Integer jobTimeout) {
        this.jobTimeout = jobTimeout;
        return this;
    }

    /**
     * 作业执行超时时长，单位天
     * minimum: 1
     * maximum: 60
     * @return jobTimeout
     */
    public Integer getJobTimeout() {
        return jobTimeout;
    }

    public void setJobTimeout(Integer jobTimeout) {
        this.jobTimeout = jobTimeout;
    }

    public UserSettingDto withCpuQuota(Integer cpuQuota) {
        this.cpuQuota = cpuQuota;
        return this;
    }

    /**
     * 作业的CPU资源配额，单位核
     * minimum: 1
     * maximum: 1024
     * @return cpuQuota
     */
    public Integer getCpuQuota() {
        return cpuQuota;
    }

    public void setCpuQuota(Integer cpuQuota) {
        this.cpuQuota = cpuQuota;
    }

    public UserSettingDto withMemQuota(Integer memQuota) {
        this.memQuota = memQuota;
        return this;
    }

    /**
     * 作业的内存资源配额，单位GB
     * minimum: 1
     * maximum: 1024
     * @return memQuota
     */
    public Integer getMemQuota() {
        return memQuota;
    }

    public void setMemQuota(Integer memQuota) {
        this.memQuota = memQuota;
    }

    public UserSettingDto withProjectsPerUser(Integer projectsPerUser) {
        this.projectsPerUser = projectsPerUser;
        return this;
    }

    /**
     * 用户可创建项目数配额
     * minimum: 0
     * maximum: 20
     * @return projectsPerUser
     */
    public Integer getProjectsPerUser() {
        return projectsPerUser;
    }

    public void setProjectsPerUser(Integer projectsPerUser) {
        this.projectsPerUser = projectsPerUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserSettingDto that = (UserSettingDto) obj;
        return Objects.equals(this.jobQuota, that.jobQuota) && Objects.equals(this.jobTimeout, that.jobTimeout)
            && Objects.equals(this.cpuQuota, that.cpuQuota) && Objects.equals(this.memQuota, that.memQuota)
            && Objects.equals(this.projectsPerUser, that.projectsPerUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobQuota, jobTimeout, cpuQuota, memQuota, projectsPerUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserSettingDto {\n");
        sb.append("    jobQuota: ").append(toIndentedString(jobQuota)).append("\n");
        sb.append("    jobTimeout: ").append(toIndentedString(jobTimeout)).append("\n");
        sb.append("    cpuQuota: ").append(toIndentedString(cpuQuota)).append("\n");
        sb.append("    memQuota: ").append(toIndentedString(memQuota)).append("\n");
        sb.append("    projectsPerUser: ").append(toIndentedString(projectsPerUser)).append("\n");
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
