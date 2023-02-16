package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * EdgesetPath1
 */
public class EdgesetPath1  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobId")
    
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private String status;

    public EdgesetPath1 withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 导入OBS文件对应的jobId。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    public EdgesetPath1 withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * OBS存储路径，不包含OBS Endpoint。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    

    public EdgesetPath1 withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * OBS文件导入状态。  - success：完全导入成功 - partiallyFailed：部分失败 - failed：完全导入失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EdgesetPath1 edgesetPath1 = (EdgesetPath1) o;
        return Objects.equals(this.jobId, edgesetPath1.jobId) &&
            Objects.equals(this.path, edgesetPath1.path) &&
            Objects.equals(this.status, edgesetPath1.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, path, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgesetPath1 {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

