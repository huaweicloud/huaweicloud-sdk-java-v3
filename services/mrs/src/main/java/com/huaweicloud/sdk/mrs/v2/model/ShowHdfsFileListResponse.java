package com.huaweicloud.sdk.mrs.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v2.model.FileStatusV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowHdfsFileListResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    
    private Long totalCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="files")
    
    
    private List<FileStatusV2> files = null;
    
    public ShowHdfsFileListResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 文件总数，与分页无关。
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    

    public ShowHdfsFileListResponse withFiles(List<FileStatusV2> files) {
        this.files = files;
        return this;
    }

    
    public ShowHdfsFileListResponse addFilesItem(FileStatusV2 filesItem) {
        if(this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public ShowHdfsFileListResponse withFiles(Consumer<List<FileStatusV2>> filesSetter) {
        if(this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 文件列表。
     * @return files
     */
    public List<FileStatusV2> getFiles() {
        return files;
    }

    public void setFiles(List<FileStatusV2> files) {
        this.files = files;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowHdfsFileListResponse showHdfsFileListResponse = (ShowHdfsFileListResponse) o;
        return Objects.equals(this.totalCount, showHdfsFileListResponse.totalCount) &&
            Objects.equals(this.files, showHdfsFileListResponse.files);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalCount, files);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHdfsFileListResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

