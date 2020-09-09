package com.huaweicloud.sdk.codehub.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codehub.v3.model.Commit;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * LogsTree
 */
public class LogsTree  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="blob_id")
    
    private String blobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="commit")
    
    private Commit commit = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_name")
    
    private String fileName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_path")
    
    private String filePath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="md5")
    
    private String md5;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;

    public LogsTree withBlobId(String blobId) {
        this.blobId = blobId;
        return this;
    }

    


    /**
     * 存储块id
     * @return blobId
     */
    public String getBlobId() {
        return blobId;
    }

    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    public LogsTree withCommit(Commit commit) {
        this.commit = commit;
        return this;
    }

    public LogsTree withCommit(Consumer<Commit> commitSetter) {
        if(this.commit == null ){
            this.commit = new Commit();
            commitSetter.accept(this.commit);
        }
        
        return this;
    }


    /**
     * Get commit
     * @return commit
     */
    public Commit getCommit() {
        return commit;
    }

    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public LogsTree withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    


    /**
     * 文件名称
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public LogsTree withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    


    /**
     * 文件路径
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public LogsTree withMd5(String md5) {
        this.md5 = md5;
        return this;
    }

    


    /**
     * MD5
     * @return md5
     */
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public LogsTree withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 存储类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogsTree logsTree = (LogsTree) o;
        return Objects.equals(this.blobId, logsTree.blobId) &&
            Objects.equals(this.commit, logsTree.commit) &&
            Objects.equals(this.fileName, logsTree.fileName) &&
            Objects.equals(this.filePath, logsTree.filePath) &&
            Objects.equals(this.md5, logsTree.md5) &&
            Objects.equals(this.type, logsTree.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(blobId, commit, fileName, filePath, md5, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogsTree {\n");
        sb.append("    blobId: ").append(toIndentedString(blobId)).append("\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

