package com.huaweicloud.sdk.mrs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SubmitJobReqV11
 */
public class SubmitJobReqV11  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_name")
    
    
    private String jobName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    
    
    private String clusterId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jar_path")
    
    
    private String jarPath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="input")
    
    
    private String input;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output")
    
    
    private String output;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_log")
    
    
    private String jobLog;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_type")
    
    
    private Integer jobType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_action")
    
    
    private String fileAction;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arguments")
    
    
    private String arguments;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hql")
    
    
    private String hql;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hive_script_path")
    
    
    private String hiveScriptPath;

    public SubmitJobReqV11 withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    


    /**
     * 作业名称，只能由字母、数字、中划线和下划线组成，并且长度为1～64个字符。  说明： 不同作业的名称允许相同，但不建议设置相同。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    

    public SubmitJobReqV11 withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * 集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    

    public SubmitJobReqV11 withJarPath(String jarPath) {
        this.jarPath = jarPath;
        return this;
    }

    


    /**
     * 执行程序Jar包或sql文件地址，需要满足如下要求： - 最多为1023字符，不能包含;|&><'$特殊字符，且不可为空或全空格。 - 需要以“/”或“s3a://”开头。OBS路径不支持KMS加密的文件或程序。 - Spark Script需要以“.sql”结尾，MapReduce和Spark Jar需要以“.jar”结尾，sql和jar不区分大小写。 说明： 作业类型为MapReduce或Spark时，jar_path参数为必选。
     * @return jarPath
     */
    public String getJarPath() {
        return jarPath;
    }

    public void setJarPath(String jarPath) {
        this.jarPath = jarPath;
    }

    

    public SubmitJobReqV11 withInput(String input) {
        this.input = input;
        return this;
    }

    


    /**
     * 数据输入地址，必须以“/”或“s3a://”开头。请配置为正确的OBS路径，OBS路径不支持KMS加密的文件或程序。  最多为1023字符，不能包含;|&>'<$特殊字符，可为空。
     * @return input
     */
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    

    public SubmitJobReqV11 withOutput(String output) {
        this.output = output;
        return this;
    }

    


    /**
     * 数据输出地址，必须以“/”或“s3a://”开头。请配置为正确的OBS路径，如果该路径不存在，系统会自动创建。  最多为1023字符，不能包含;|&>'<$特殊字符，可为空。
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    

    public SubmitJobReqV11 withJobLog(String jobLog) {
        this.jobLog = jobLog;
        return this;
    }

    


    /**
     * 作业日志存储地址，该日志信息记录作业运行状态。必须以“/”或“s3a://”开头，请配置为正确的OBS路径。  最多为1023字符，不能包含;|&>'<$特殊字符，可为空。
     * @return jobLog
     */
    public String getJobLog() {
        return jobLog;
    }

    public void setJobLog(String jobLog) {
        this.jobLog = jobLog;
    }

    

    public SubmitJobReqV11 withJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }

    


    /**
     * 作业类型码。  - 1：MapReduce - 2：Spark - 3：Hive Script - 4：HiveSQL（当前不支持） - 5：DistCp，导入、导出数据。 - 6：Spark Script - 7：Spark SQL，提交SQL语句（该接口当前不支持）
     * @return jobType
     */
    public Integer getJobType() {
        return jobType;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    

    public SubmitJobReqV11 withFileAction(String fileAction) {
        this.fileAction = fileAction;
        return this;
    }

    


    /**
     * 文件操作类型，包括： - export：从HDFS导出数据至OBS - import：从OBS导入数据至HDFS
     * @return fileAction
     */
    public String getFileAction() {
        return fileAction;
    }

    public void setFileAction(String fileAction) {
        this.fileAction = fileAction;
    }

    

    public SubmitJobReqV11 withArguments(String arguments) {
        this.arguments = arguments;
        return this;
    }

    


    /**
     * 程序执行的关键参数，该参数由用户程序内的函数指定，MRS只负责参数的传入。 最多为150000字符，不能包含;|&>'<$!\\\"\\特殊字符，可为空。 说明： 用户输入带有敏感信息（如登录密码）的参数时，可通过在参数名前添加“@”的方式，为该参数值加密，以防止敏感信息被明文形式持久化。在查看作业信息时，敏感信息显示为“*”。 例如：username=admin @password=admin_123
     * @return arguments
     */
    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    

    public SubmitJobReqV11 withHql(String hql) {
        this.hql = hql;
        return this;
    }

    


    /**
     * Spark SQL语句，该语句需要进行Base64编码和解码，“ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/”为标准的编码表，MRS使用“ABCDEFGHILKJMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/”进行Base64编码。在编码后所得字符串首位任意加上一个字母，即得到Hql参数的值。后台自动进行解码得到Spark SQL语句。 使用样例： 1) 在Web界面输入Spark SQL语句“show tables;”。 2) 使用“ABCDEFGHILKJMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/”编码后得到字符串“c2hvdyB0YWLsZXM7”。 3) 在“c2hvdyB0YWLsZXM7”首位任意加上一字母，例如“gc2hvdyB0YWLsZXM7”，即Hql参数的值。 4) 后台自动进行解码得到Spark SQL语句“show tables;”。 
     * @return hql
     */
    public String getHql() {
        return hql;
    }

    public void setHql(String hql) {
        this.hql = hql;
    }

    

    public SubmitJobReqV11 withHiveScriptPath(String hiveScriptPath) {
        this.hiveScriptPath = hiveScriptPath;
        return this;
    }

    


    /**
     * sql程序路径，仅Spark Script和Hive Script作业需要使用此参数。需要满足如下要求：  - 最多为1023字符，不能包含;|&><'$特殊字符，且不可为空或全空格。 - 需要以“/”或“s3a://”开头，OBS路径不支持KMS加密的文件或程序。 - 需要以“.sql”结尾，sql不区分大小写。
     * @return hiveScriptPath
     */
    public String getHiveScriptPath() {
        return hiveScriptPath;
    }

    public void setHiveScriptPath(String hiveScriptPath) {
        this.hiveScriptPath = hiveScriptPath;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubmitJobReqV11 submitJobReqV11 = (SubmitJobReqV11) o;
        return Objects.equals(this.jobName, submitJobReqV11.jobName) &&
            Objects.equals(this.clusterId, submitJobReqV11.clusterId) &&
            Objects.equals(this.jarPath, submitJobReqV11.jarPath) &&
            Objects.equals(this.input, submitJobReqV11.input) &&
            Objects.equals(this.output, submitJobReqV11.output) &&
            Objects.equals(this.jobLog, submitJobReqV11.jobLog) &&
            Objects.equals(this.jobType, submitJobReqV11.jobType) &&
            Objects.equals(this.fileAction, submitJobReqV11.fileAction) &&
            Objects.equals(this.arguments, submitJobReqV11.arguments) &&
            Objects.equals(this.hql, submitJobReqV11.hql) &&
            Objects.equals(this.hiveScriptPath, submitJobReqV11.hiveScriptPath);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobName, clusterId, jarPath, input, output, jobLog, jobType, fileAction, arguments, hql, hiveScriptPath);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubmitJobReqV11 {\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    jarPath: ").append(toIndentedString(jarPath)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    jobLog: ").append(toIndentedString(jobLog)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    fileAction: ").append(toIndentedString(fileAction)).append("\n");
        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
        sb.append("    hql: ").append(toIndentedString(hql)).append("\n");
        sb.append("    hiveScriptPath: ").append(toIndentedString(hiveScriptPath)).append("\n");
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

