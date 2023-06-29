package com.huaweicloud.sdk.dlf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExportJobsReq
 */
public class ExportJobsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobList")

    private List<String> jobList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exportDepend")

    private Boolean exportDepend;

    public ExportJobsReq withJobList(List<String> jobList) {
        this.jobList = jobList;
        return this;
    }

    public ExportJobsReq addJobListItem(String jobListItem) {
        if (this.jobList == null) {
            this.jobList = new ArrayList<>();
        }
        this.jobList.add(jobListItem);
        return this;
    }

    public ExportJobsReq withJobList(Consumer<List<String>> jobListSetter) {
        if (this.jobList == null) {
            this.jobList = new ArrayList<>();
        }
        jobListSetter.accept(this.jobList);
        return this;
    }

    /**
     * Get jobList
     * @return jobList
     */
    public List<String> getJobList() {
        return jobList;
    }

    public void setJobList(List<String> jobList) {
        this.jobList = jobList;
    }

    public ExportJobsReq withExportDepend(Boolean exportDepend) {
        this.exportDepend = exportDepend;
        return this;
    }

    /**
     * 是否导出作业依赖的脚本和资源
     * @return exportDepend
     */
    public Boolean getExportDepend() {
        return exportDepend;
    }

    public void setExportDepend(Boolean exportDepend) {
        this.exportDepend = exportDepend;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportJobsReq that = (ExportJobsReq) obj;
        return Objects.equals(this.jobList, that.jobList) && Objects.equals(this.exportDepend, that.exportDepend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobList, exportDepend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportJobsReq {\n");
        sb.append("    jobList: ").append(toIndentedString(jobList)).append("\n");
        sb.append("    exportDepend: ").append(toIndentedString(exportDepend)).append("\n");
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
