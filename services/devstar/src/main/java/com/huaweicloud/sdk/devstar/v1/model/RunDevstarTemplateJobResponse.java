package com.huaweicloud.sdk.devstar.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.devstar.v1.model.FileTreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RunDevstarTemplateJobResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_list")
    
    private List<FileTreeNode> fileList = null;
    
    public RunDevstarTemplateJobResponse withJobId(String jobId) {
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

    

    public RunDevstarTemplateJobResponse withFileList(List<FileTreeNode> fileList) {
        this.fileList = fileList;
        return this;
    }

    
    public RunDevstarTemplateJobResponse addFileListItem(FileTreeNode fileListItem) {
        if(this.fileList == null) {
            this.fileList = new ArrayList<>();
        }
        this.fileList.add(fileListItem);
        return this;
    }

    public RunDevstarTemplateJobResponse withFileList(Consumer<List<FileTreeNode>> fileListSetter) {
        if(this.fileList == null) {
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
        RunDevstarTemplateJobResponse runDevstarTemplateJobResponse = (RunDevstarTemplateJobResponse) o;
        return Objects.equals(this.jobId, runDevstarTemplateJobResponse.jobId) &&
            Objects.equals(this.fileList, runDevstarTemplateJobResponse.fileList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, fileList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunDevstarTemplateJobResponse {\n");
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

