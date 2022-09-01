package com.huaweicloud.sdk.devstar.v1.model;

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
public class RunCodehubTemplateJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    @JacksonXmlProperty(localName = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_list")

    @JacksonXmlProperty(localName = "file_list")

    private List<FileTreeNode> fileList = null;

    public RunCodehubTemplateJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public RunCodehubTemplateJobResponse withFileList(List<FileTreeNode> fileList) {
        this.fileList = fileList;
        return this;
    }

    public RunCodehubTemplateJobResponse addFileListItem(FileTreeNode fileListItem) {
        if (this.fileList == null) {
            this.fileList = new ArrayList<>();
        }
        this.fileList.add(fileListItem);
        return this;
    }

    public RunCodehubTemplateJobResponse withFileList(Consumer<List<FileTreeNode>> fileListSetter) {
        if (this.fileList == null) {
            this.fileList = new ArrayList<>();
        }
        fileListSetter.accept(this.fileList);
        return this;
    }

    /**
     * 文件列表。
     * @return fileList
     */
    public List<FileTreeNode> getFileList() {
        return fileList;
    }

    public void setFileList(List<FileTreeNode> fileList) {
        this.fileList = fileList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunCodehubTemplateJobResponse runCodehubTemplateJobResponse = (RunCodehubTemplateJobResponse) o;
        return Objects.equals(this.jobId, runCodehubTemplateJobResponse.jobId)
            && Objects.equals(this.fileList, runCodehubTemplateJobResponse.fileList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, fileList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunCodehubTemplateJobResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    fileList: ").append(toIndentedString(fileList)).append("\n");
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
