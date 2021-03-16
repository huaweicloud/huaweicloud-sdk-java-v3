package com.huaweicloud.sdk.iotda.v5.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.BatchTaskFile;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListBatchTaskFilesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="files")
    
    private List<BatchTaskFile> files = null;
    
    public ListBatchTaskFilesResponse withFiles(List<BatchTaskFile> files) {
        this.files = files;
        return this;
    }

    
    public ListBatchTaskFilesResponse addFilesItem(BatchTaskFile filesItem) {
        this.files.add(filesItem);
        return this;
    }

    public ListBatchTaskFilesResponse withFiles(Consumer<List<BatchTaskFile>> filesSetter) {
        if(this.files == null ){
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 批量任务文件列表。
     * @return files
     */
    public List<BatchTaskFile> getFiles() {
        return files;
    }

    public void setFiles(List<BatchTaskFile> files) {
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
        ListBatchTaskFilesResponse listBatchTaskFilesResponse = (ListBatchTaskFilesResponse) o;
        return Objects.equals(this.files, listBatchTaskFilesResponse.files);
    }
    @Override
    public int hashCode() {
        return Objects.hash(files);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBatchTaskFilesResponse {\n");
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

