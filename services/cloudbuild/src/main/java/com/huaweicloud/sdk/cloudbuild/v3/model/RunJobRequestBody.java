package com.huaweicloud.sdk.cloudbuild.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudbuild.v3.model.ParameterItem;
import com.huaweicloud.sdk.cloudbuild.v3.model.Scm;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 执行任务接口请求体
 */
public class RunJobRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameter")
    
    private List<ParameterItem> parameter = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scm")
    
    private Scm scm;

    public RunJobRequestBody withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 构建任务ID；编辑构建任务时，浏览器URL末尾的32位数字、字母组合的字符串
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    public RunJobRequestBody withParameter(List<ParameterItem> parameter) {
        this.parameter = parameter;
        return this;
    }

    
    public RunJobRequestBody addParameterItem(ParameterItem parameterItem) {
        if(this.parameter == null) {
            this.parameter = new ArrayList<>();
        }
        this.parameter.add(parameterItem);
        return this;
    }

    public RunJobRequestBody withParameter(Consumer<List<ParameterItem>> parameterSetter) {
        if(this.parameter == null) {
            this.parameter = new ArrayList<>();
        }
        parameterSetter.accept(this.parameter);
        return this;
    }

    /**
     * 自定义参数
     * @return parameter
     */
    public List<ParameterItem> getParameter() {
        return parameter;
    }

    public void setParameter(List<ParameterItem> parameter) {
        this.parameter = parameter;
    }

    

    public RunJobRequestBody withScm(Scm scm) {
        this.scm = scm;
        return this;
    }

    public RunJobRequestBody withScm(Consumer<Scm> scmSetter) {
        if(this.scm == null ){
            this.scm = new Scm();
            scmSetter.accept(this.scm);
        }
        
        return this;
    }


    /**
     * Get scm
     * @return scm
     */
    public Scm getScm() {
        return scm;
    }

    public void setScm(Scm scm) {
        this.scm = scm;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunJobRequestBody runJobRequestBody = (RunJobRequestBody) o;
        return Objects.equals(this.jobId, runJobRequestBody.jobId) &&
            Objects.equals(this.parameter, runJobRequestBody.parameter) &&
            Objects.equals(this.scm, runJobRequestBody.scm);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, parameter, scm);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunJobRequestBody {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
        sb.append("    scm: ").append(toIndentedString(scm)).append("\n");
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

