package com.huaweicloud.sdk.iotda.v5.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.ErrorInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 单个子任务详情结构体
 */
public class TaskDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target")
    
    private String target;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output")
    
    private String output;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error")
    
    private ErrorInfo error = null;

    public TaskDetail withTarget(String target) {
        this.target = target;
        return this;
    }

    


    /**
     * 执行批量任务的目标。
     * @return target
     */
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public TaskDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 子任务的执行状态，结果范围：Processing，Success，Fail，Waitting，FailWaitRetry，Stopped。 - Waitting: 等待执行。 - Processing: 执行中。 - Success: 成功。 - Fail: 失败。 - FailWaitRetry: 失败重试。 - Stopped: 已停止。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TaskDetail withOutput(String output) {
        this.output = output;
        return this;
    }

    


    /**
     * 子任务执行的输出信息。
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public TaskDetail withError(ErrorInfo error) {
        this.error = error;
        return this;
    }

    public TaskDetail withError(Consumer<ErrorInfo> errorSetter) {
        if(this.error == null ){
            this.error = new ErrorInfo();
            errorSetter.accept(this.error);
        }
        
        return this;
    }


    /**
     * Get error
     * @return error
     */
    public ErrorInfo getError() {
        return error;
    }

    public void setError(ErrorInfo error) {
        this.error = error;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskDetail taskDetail = (TaskDetail) o;
        return Objects.equals(this.target, taskDetail.target) &&
            Objects.equals(this.status, taskDetail.status) &&
            Objects.equals(this.output, taskDetail.output) &&
            Objects.equals(this.error, taskDetail.error);
    }
    @Override
    public int hashCode() {
        return Objects.hash(target, status, output, error);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskDetail {\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

