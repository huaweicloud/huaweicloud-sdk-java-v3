package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * FileOperateLog
 */
public class FileOperateLog  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duration")
    
    private String duration;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operate_time")
    
    private String operateTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operate_type")
    
    private String operateType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_name")
    
    private String fileName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="from_path")
    
    private String fromPath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="to_path")
    
    private String toPath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_size")
    
    private String fileSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="oper_result")
    
    private String operResult;

    public FileOperateLog withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    


    /**
     * 传输时间 格式：hh:ii:ss
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    

    public FileOperateLog withOperateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }

    


    /**
     * 操作时间
     * @return operateTime
     */
    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    

    public FileOperateLog withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    


    /**
     * 操作类型
     * @return operateType
     */
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    

    public FileOperateLog withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    


    /**
     * 文件名
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    

    public FileOperateLog withFromPath(String fromPath) {
        this.fromPath = fromPath;
        return this;
    }

    


    /**
     * 来源路径
     * @return fromPath
     */
    public String getFromPath() {
        return fromPath;
    }

    public void setFromPath(String fromPath) {
        this.fromPath = fromPath;
    }

    

    public FileOperateLog withToPath(String toPath) {
        this.toPath = toPath;
        return this;
    }

    


    /**
     * 目标路径
     * @return toPath
     */
    public String getToPath() {
        return toPath;
    }

    public void setToPath(String toPath) {
        this.toPath = toPath;
    }

    

    public FileOperateLog withFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    


    /**
     * 文件大小，多少k，多少M，多少G。
     * @return fileSize
     */
    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    

    public FileOperateLog withOperResult(String operResult) {
        this.operResult = operResult;
        return this;
    }

    


    /**
     * 操作结果
     * @return operResult
     */
    public String getOperResult() {
        return operResult;
    }

    public void setOperResult(String operResult) {
        this.operResult = operResult;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FileOperateLog fileOperateLog = (FileOperateLog) o;
        return Objects.equals(this.duration, fileOperateLog.duration) &&
            Objects.equals(this.operateTime, fileOperateLog.operateTime) &&
            Objects.equals(this.operateType, fileOperateLog.operateType) &&
            Objects.equals(this.fileName, fileOperateLog.fileName) &&
            Objects.equals(this.fromPath, fileOperateLog.fromPath) &&
            Objects.equals(this.toPath, fileOperateLog.toPath) &&
            Objects.equals(this.fileSize, fileOperateLog.fileSize) &&
            Objects.equals(this.operResult, fileOperateLog.operResult);
    }
    @Override
    public int hashCode() {
        return Objects.hash(duration, operateTime, operateType, fileName, fromPath, toPath, fileSize, operResult);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileOperateLog {\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    operateTime: ").append(toIndentedString(operateTime)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fromPath: ").append(toIndentedString(fromPath)).append("\n");
        sb.append("    toPath: ").append(toIndentedString(toPath)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    operResult: ").append(toIndentedString(operResult)).append("\n");
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

