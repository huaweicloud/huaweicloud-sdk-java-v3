package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ExecuteJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_platform_flavor")

    private TaskResourceDto maxPlatformFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_infos")

    private List<AppFilterDto> appInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_info")

    private JobFilterDto jobInfo;

    public ExecuteJobResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 作业id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExecuteJobResponse withMaxPlatformFlavor(TaskResourceDto maxPlatformFlavor) {
        this.maxPlatformFlavor = maxPlatformFlavor;
        return this;
    }

    public ExecuteJobResponse withMaxPlatformFlavor(Consumer<TaskResourceDto> maxPlatformFlavorSetter) {
        if (this.maxPlatformFlavor == null) {
            this.maxPlatformFlavor = new TaskResourceDto();
            maxPlatformFlavorSetter.accept(this.maxPlatformFlavor);
        }

        return this;
    }

    /**
     * Get maxPlatformFlavor
     * @return maxPlatformFlavor
     */
    public TaskResourceDto getMaxPlatformFlavor() {
        return maxPlatformFlavor;
    }

    public void setMaxPlatformFlavor(TaskResourceDto maxPlatformFlavor) {
        this.maxPlatformFlavor = maxPlatformFlavor;
    }

    public ExecuteJobResponse withAppInfos(List<AppFilterDto> appInfos) {
        this.appInfos = appInfos;
        return this;
    }

    public ExecuteJobResponse addAppInfosItem(AppFilterDto appInfosItem) {
        if (this.appInfos == null) {
            this.appInfos = new ArrayList<>();
        }
        this.appInfos.add(appInfosItem);
        return this;
    }

    public ExecuteJobResponse withAppInfos(Consumer<List<AppFilterDto>> appInfosSetter) {
        if (this.appInfos == null) {
            this.appInfos = new ArrayList<>();
        }
        appInfosSetter.accept(this.appInfos);
        return this;
    }

    /**
     * 筛选后的app集合
     * @return appInfos
     */
    public List<AppFilterDto> getAppInfos() {
        return appInfos;
    }

    public void setAppInfos(List<AppFilterDto> appInfos) {
        this.appInfos = appInfos;
    }

    public ExecuteJobResponse withJobInfo(JobFilterDto jobInfo) {
        this.jobInfo = jobInfo;
        return this;
    }

    public ExecuteJobResponse withJobInfo(Consumer<JobFilterDto> jobInfoSetter) {
        if (this.jobInfo == null) {
            this.jobInfo = new JobFilterDto();
            jobInfoSetter.accept(this.jobInfo);
        }

        return this;
    }

    /**
     * Get jobInfo
     * @return jobInfo
     */
    public JobFilterDto getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(JobFilterDto jobInfo) {
        this.jobInfo = jobInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteJobResponse that = (ExecuteJobResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.maxPlatformFlavor, that.maxPlatformFlavor)
            && Objects.equals(this.appInfos, that.appInfos) && Objects.equals(this.jobInfo, that.jobInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maxPlatformFlavor, appInfos, jobInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteJobResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    maxPlatformFlavor: ").append(toIndentedString(maxPlatformFlavor)).append("\n");
        sb.append("    appInfos: ").append(toIndentedString(appInfos)).append("\n");
        sb.append("    jobInfo: ").append(toIndentedString(jobInfo)).append("\n");
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
