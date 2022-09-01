package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFileInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    @JacksonXmlProperty(localName = "jobs")

    private List<Job> jobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scripts")

    @JacksonXmlProperty(localName = "scripts")

    private List<Script> scripts = null;

    public ShowFileInfoResponse withJobs(List<Job> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ShowFileInfoResponse addJobsItem(Job jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ShowFileInfoResponse withJobs(Consumer<List<Job>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * Get jobs
     * @return jobs
     */
    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public ShowFileInfoResponse withScripts(List<Script> scripts) {
        this.scripts = scripts;
        return this;
    }

    public ShowFileInfoResponse addScriptsItem(Script scriptsItem) {
        if (this.scripts == null) {
            this.scripts = new ArrayList<>();
        }
        this.scripts.add(scriptsItem);
        return this;
    }

    public ShowFileInfoResponse withScripts(Consumer<List<Script>> scriptsSetter) {
        if (this.scripts == null) {
            this.scripts = new ArrayList<>();
        }
        scriptsSetter.accept(this.scripts);
        return this;
    }

    /**
     * Get scripts
     * @return scripts
     */
    public List<Script> getScripts() {
        return scripts;
    }

    public void setScripts(List<Script> scripts) {
        this.scripts = scripts;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowFileInfoResponse showFileInfoResponse = (ShowFileInfoResponse) o;
        return Objects.equals(this.jobs, showFileInfoResponse.jobs)
            && Objects.equals(this.scripts, showFileInfoResponse.scripts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs, scripts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFileInfoResponse {\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("    scripts: ").append(toIndentedString(scripts)).append("\n");
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
