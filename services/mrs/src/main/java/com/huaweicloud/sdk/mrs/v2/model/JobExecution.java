package com.huaweicloud.sdk.mrs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * JobExecution
 */
public class JobExecution  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_type")
    
    
    private String jobType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_name")
    
    
    private String jobName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arguments")
    
    
    private List<String> arguments = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="properties")
    
    
    private Map<String, String> properties = null;
    
    public JobExecution withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    


    /**
     * 作业类型: - MapReduce - SparkSubmit - SparkPython：该类型作业将转换为SparkSubmit类型提交，MRS控制台界面的作业类型展示为SparkSubmit，通过接口查询作业列表信息时作业类型请选择SparkSubmit。 - HiveScript - HiveSql - DistCp，导入、导出数据。 - SparkScript - SparkSql - Flink
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    

    public JobExecution withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    


    /**
     * 作业名称，只能由字母、数字、中划线和下划线组成，并且长度为1～64个字符。 说明： 不同作业的名称允许相同，但不建议设置相同。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    

    public JobExecution withArguments(List<String> arguments) {
        this.arguments = arguments;
        return this;
    }

    
    public JobExecution addArgumentsItem(String argumentsItem) {
        if(this.arguments == null) {
            this.arguments = new ArrayList<>();
        }
        this.arguments.add(argumentsItem);
        return this;
    }

    public JobExecution withArguments(Consumer<List<String>> argumentsSetter) {
        if(this.arguments == null) {
            this.arguments = new ArrayList<>();
        }
        argumentsSetter.accept(this.arguments);
        return this;
    }

    /**
     * 程序执行的关键参数，该参数由用户程序内的函数指定，MRS只负责参数的传入。 最多为150000字符，不能包含;|&>'<$!\\\"\\特殊字符，可为空。 说明： - 若输入带有敏感信息（如登录密码）的参数可能在作业详情展示和日志打印中存在暴露的风险，请谨慎操作。 - 提交HiveScript或HiveSql类型的作业时如需以“obs://”开头格式访问存储在OBS上的文件，请在Hive服务配置页面搜索参数“core.site.customized.configs”，新增OBS的endpoint配置项，参数为“fs.obs.endpoint”，值请输入OBS对应的endpoint，具体请参考[终端节点](https://support.huaweicloud.com/api-mrs/mrs_02_0003.html)。
     * @return arguments
     */
    public List<String> getArguments() {
        return arguments;
    }

    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
    }

    

    public JobExecution withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    

    public JobExecution putPropertiesItem(String key, String propertiesItem) {
        if(this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public JobExecution withProperties(Consumer<Map<String, String>> propertiesSetter) {
        if(this.properties == null) {
            this.properties = new HashMap<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }
    /**
     * 程序系统参数。 最多为2048字符，不能包含><|'`&!\\特殊字符，可为空。
     * @return properties
     */
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobExecution jobExecution = (JobExecution) o;
        return Objects.equals(this.jobType, jobExecution.jobType) &&
            Objects.equals(this.jobName, jobExecution.jobName) &&
            Objects.equals(this.arguments, jobExecution.arguments) &&
            Objects.equals(this.properties, jobExecution.properties);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobType, jobName, arguments, properties);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobExecution {\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

