package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建分子或分子复合物批量下载任务请求体
 */
public class CreateMolBatchDownloadTaskReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_result_url")

    private String jobResultUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selected")

    private List<Integer> selected = null;

    public CreateMolBatchDownloadTaskReq withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CreateMolBatchDownloadTaskReq withJobResultUrl(String jobResultUrl) {
        this.jobResultUrl = jobResultUrl;
        return this;
    }

    /**
     * 作业结果文件url
     * @return jobResultUrl
     */
    public String getJobResultUrl() {
        return jobResultUrl;
    }

    public void setJobResultUrl(String jobResultUrl) {
        this.jobResultUrl = jobResultUrl;
    }

    public CreateMolBatchDownloadTaskReq withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 下载类型：MOL（小分子）、COMPLEX（复合物）
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public CreateMolBatchDownloadTaskReq withSelected(List<Integer> selected) {
        this.selected = selected;
        return this;
    }

    public CreateMolBatchDownloadTaskReq addSelectedItem(Integer selectedItem) {
        if (this.selected == null) {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selectedItem);
        return this;
    }

    public CreateMolBatchDownloadTaskReq withSelected(Consumer<List<Integer>> selectedSetter) {
        if (this.selected == null) {
            this.selected = new ArrayList<>();
        }
        selectedSetter.accept(this.selected);
        return this;
    }

    /**
     * 选中下载的分子下标
     * @return selected
     */
    public List<Integer> getSelected() {
        return selected;
    }

    public void setSelected(List<Integer> selected) {
        this.selected = selected;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMolBatchDownloadTaskReq that = (CreateMolBatchDownloadTaskReq) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.jobResultUrl, that.jobResultUrl)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.selected, that.selected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, jobResultUrl, mode, selected);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMolBatchDownloadTaskReq {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobResultUrl: ").append(toIndentedString(jobResultUrl)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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
