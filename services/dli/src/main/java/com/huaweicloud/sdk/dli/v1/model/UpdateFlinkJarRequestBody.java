package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新Flink Jar作业的响应参数。
 */
public class UpdateFlinkJarRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_number")

    private Integer cuNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager_cu_number")

    private Integer managerCuNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_number")

    private Integer parallelNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_enabled")

    private Boolean logEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket")

    private String obsBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_topic")

    private String smnTopic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_class")

    private String mainClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entrypoint_args")

    private String entrypointArgs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart_when_exception")

    private Boolean restartWhenException;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entrypoint")

    private String entrypoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_jars")

    private List<String> dependencyJars = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_files")

    private List<String> dependencyFiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tm_cus")

    private Integer tmCus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tm_slot_num")

    private Integer tmSlotNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature")

    private String feature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flink_version")

    private String flinkVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resume_checkpoint")

    private Boolean resumeCheckpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resume_max_num")

    private Integer resumeMaxNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_path")

    private String checkpointPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_config")

    private String runtimeConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    public UpdateFlinkJarRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称。长度限制：0-57个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateFlinkJarRequestBody withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 作业描述。长度限制：0-2048个字符。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public UpdateFlinkJarRequestBody withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 队列名称。长度限制：1-128个字符。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public UpdateFlinkJarRequestBody withCuNumber(Integer cuNumber) {
        this.cuNumber = cuNumber;
        return this;
    }

    /**
     * 用户为作业选择的CU数量。默认值为2。
     * @return cuNumber
     */
    public Integer getCuNumber() {
        return cuNumber;
    }

    public void setCuNumber(Integer cuNumber) {
        this.cuNumber = cuNumber;
    }

    public UpdateFlinkJarRequestBody withManagerCuNumber(Integer managerCuNumber) {
        this.managerCuNumber = managerCuNumber;
        return this;
    }

    /**
     * 用户为作业选择的管理节点CU数量，对应为flink jobmanager数量。默认为1。
     * @return managerCuNumber
     */
    public Integer getManagerCuNumber() {
        return managerCuNumber;
    }

    public void setManagerCuNumber(Integer managerCuNumber) {
        this.managerCuNumber = managerCuNumber;
    }

    public UpdateFlinkJarRequestBody withParallelNumber(Integer parallelNumber) {
        this.parallelNumber = parallelNumber;
        return this;
    }

    /**
     * 用户为作业选择的并发量。默认为1。
     * @return parallelNumber
     */
    public Integer getParallelNumber() {
        return parallelNumber;
    }

    public void setParallelNumber(Integer parallelNumber) {
        this.parallelNumber = parallelNumber;
    }

    public UpdateFlinkJarRequestBody withLogEnabled(Boolean logEnabled) {
        this.logEnabled = logEnabled;
        return this;
    }

    /**
     * 是否开启作业日志。 开启：true； 关闭：false； 默认：false。 
     * @return logEnabled
     */
    public Boolean getLogEnabled() {
        return logEnabled;
    }

    public void setLogEnabled(Boolean logEnabled) {
        this.logEnabled = logEnabled;
    }

    public UpdateFlinkJarRequestBody withObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
        return this;
    }

    /**
     * 当log_enabled==true时，用户授权保存日志的OBS路。
     * @return obsBucket
     */
    public String getObsBucket() {
        return obsBucket;
    }

    public void setObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
    }

    public UpdateFlinkJarRequestBody withSmnTopic(String smnTopic) {
        this.smnTopic = smnTopic;
        return this;
    }

    /**
     * 当作业异常时，向该SMN主题推送告警信息。
     * @return smnTopic
     */
    public String getSmnTopic() {
        return smnTopic;
    }

    public void setSmnTopic(String smnTopic) {
        this.smnTopic = smnTopic;
    }

    public UpdateFlinkJarRequestBody withMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }

    /**
     * 作业入口类。
     * @return mainClass
     */
    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    public UpdateFlinkJarRequestBody withEntrypointArgs(String entrypointArgs) {
        this.entrypointArgs = entrypointArgs;
        return this;
    }

    /**
     * 作业入口类参数，多个参数之间空格分隔。
     * @return entrypointArgs
     */
    public String getEntrypointArgs() {
        return entrypointArgs;
    }

    public void setEntrypointArgs(String entrypointArgs) {
        this.entrypointArgs = entrypointArgs;
    }

    public UpdateFlinkJarRequestBody withRestartWhenException(Boolean restartWhenException) {
        this.restartWhenException = restartWhenException;
        return this;
    }

    /**
     * 是否开启异常重启功能，默认值为“false”。
     * @return restartWhenException
     */
    public Boolean getRestartWhenException() {
        return restartWhenException;
    }

    public void setRestartWhenException(Boolean restartWhenException) {
        this.restartWhenException = restartWhenException;
    }

    public UpdateFlinkJarRequestBody withEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
        return this;
    }

    /**
     * 用户已上传到DLI资源管理系统的资源包名，用户自定义作业主类所在的jar包。
     * @return entrypoint
     */
    public String getEntrypoint() {
        return entrypoint;
    }

    public void setEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
    }

    public UpdateFlinkJarRequestBody withDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
        return this;
    }

    public UpdateFlinkJarRequestBody addDependencyJarsItem(String dependencyJarsItem) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        this.dependencyJars.add(dependencyJarsItem);
        return this;
    }

    public UpdateFlinkJarRequestBody withDependencyJars(Consumer<List<String>> dependencyJarsSetter) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        dependencyJarsSetter.accept(this.dependencyJars);
        return this;
    }

    /**
     * 用户已上传到DLI资源管理系统的资源包名，用户自定义作业的其他依赖包。示例[Group/test.jar,myGroup/test1.jar]
     * @return dependencyJars
     */
    public List<String> getDependencyJars() {
        return dependencyJars;
    }

    public void setDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
    }

    public UpdateFlinkJarRequestBody withDependencyFiles(List<String> dependencyFiles) {
        this.dependencyFiles = dependencyFiles;
        return this;
    }

    public UpdateFlinkJarRequestBody addDependencyFilesItem(String dependencyFilesItem) {
        if (this.dependencyFiles == null) {
            this.dependencyFiles = new ArrayList<>();
        }
        this.dependencyFiles.add(dependencyFilesItem);
        return this;
    }

    public UpdateFlinkJarRequestBody withDependencyFiles(Consumer<List<String>> dependencyFilesSetter) {
        if (this.dependencyFiles == null) {
            this.dependencyFiles = new ArrayList<>();
        }
        dependencyFilesSetter.accept(this.dependencyFiles);
        return this;
    }

    /**
     * 用户已上传到DLI资源管理系统的资源包名，用户自定义作业的依赖文件。
     * @return dependencyFiles
     */
    public List<String> getDependencyFiles() {
        return dependencyFiles;
    }

    public void setDependencyFiles(List<String> dependencyFiles) {
        this.dependencyFiles = dependencyFiles;
    }

    public UpdateFlinkJarRequestBody withTmCus(Integer tmCus) {
        this.tmCus = tmCus;
        return this;
    }

    /**
     * 每个taskmanager的CU数，默认值为“1”。
     * @return tmCus
     */
    public Integer getTmCus() {
        return tmCus;
    }

    public void setTmCus(Integer tmCus) {
        this.tmCus = tmCus;
    }

    public UpdateFlinkJarRequestBody withTmSlotNum(Integer tmSlotNum) {
        this.tmSlotNum = tmSlotNum;
        return this;
    }

    /**
     * 每个taskmanager的slot数，默认值为“(parallel_number*tm_cus)/(cu_number-manager_cu_number)”。
     * @return tmSlotNum
     */
    public Integer getTmSlotNum() {
        return tmSlotNum;
    }

    public void setTmSlotNum(Integer tmSlotNum) {
        this.tmSlotNum = tmSlotNum;
    }

    public UpdateFlinkJarRequestBody withFeature(String feature) {
        this.feature = feature;
        return this;
    }

    /**
     * 作业特性。表示用户作业使用的Flink镜像类型。basic：表示使用DLI提供的基础Flink镜像。custom：表示使用用户自定义的Flink镜像。
     * @return feature
     */
    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public UpdateFlinkJarRequestBody withFlinkVersion(String flinkVersion) {
        this.flinkVersion = flinkVersion;
        return this;
    }

    /**
     * Flink版本。当用户设置“feature”为“basic”时，该参数生效。用户可通过与“feature”参数配合使用，指定作业运行使用的DLI基础Flink镜像的版本。
     * @return flinkVersion
     */
    public String getFlinkVersion() {
        return flinkVersion;
    }

    public void setFlinkVersion(String flinkVersion) {
        this.flinkVersion = flinkVersion;
    }

    public UpdateFlinkJarRequestBody withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 自定义镜像。格式为：组织名/镜像名:镜像版本。当用户设置“feature”为“custom”时，该参数生效。用户可通过与“feature”参数配合使用，指定作业运行使用自定义的Flink镜像。关于如何使用自定义镜像，请参考《数据湖探索用户指南》。
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public UpdateFlinkJarRequestBody withResumeCheckpoint(Boolean resumeCheckpoint) {
        this.resumeCheckpoint = resumeCheckpoint;
        return this;
    }

    /**
     * 异常重启是否从checkpoint恢复。
     * @return resumeCheckpoint
     */
    public Boolean getResumeCheckpoint() {
        return resumeCheckpoint;
    }

    public void setResumeCheckpoint(Boolean resumeCheckpoint) {
        this.resumeCheckpoint = resumeCheckpoint;
    }

    public UpdateFlinkJarRequestBody withResumeMaxNum(Integer resumeMaxNum) {
        this.resumeMaxNum = resumeMaxNum;
        return this;
    }

    /**
     * 异常重试最大次数，单位：次/小时。取值范围：-1或大于0。默认值为“-1”，表示无限次数。
     * @return resumeMaxNum
     */
    public Integer getResumeMaxNum() {
        return resumeMaxNum;
    }

    public void setResumeMaxNum(Integer resumeMaxNum) {
        this.resumeMaxNum = resumeMaxNum;
    }

    public UpdateFlinkJarRequestBody withCheckpointPath(String checkpointPath) {
        this.checkpointPath = checkpointPath;
        return this;
    }

    /**
     * 用户Jar中checkpoint的储存地址，不同作业路径需要保持不同。
     * @return checkpointPath
     */
    public String getCheckpointPath() {
        return checkpointPath;
    }

    public void setCheckpointPath(String checkpointPath) {
        this.checkpointPath = checkpointPath;
    }

    public UpdateFlinkJarRequestBody withRuntimeConfig(String runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }

    /**
     * Flink作业运行时自定义优化参数。
     * @return runtimeConfig
     */
    public String getRuntimeConfig() {
        return runtimeConfig;
    }

    public void setRuntimeConfig(String runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
    }

    public UpdateFlinkJarRequestBody withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型。
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateFlinkJarRequestBody updateFlinkJarRequestBody = (UpdateFlinkJarRequestBody) o;
        return Objects.equals(this.name, updateFlinkJarRequestBody.name)
            && Objects.equals(this.desc, updateFlinkJarRequestBody.desc)
            && Objects.equals(this.queueName, updateFlinkJarRequestBody.queueName)
            && Objects.equals(this.cuNumber, updateFlinkJarRequestBody.cuNumber)
            && Objects.equals(this.managerCuNumber, updateFlinkJarRequestBody.managerCuNumber)
            && Objects.equals(this.parallelNumber, updateFlinkJarRequestBody.parallelNumber)
            && Objects.equals(this.logEnabled, updateFlinkJarRequestBody.logEnabled)
            && Objects.equals(this.obsBucket, updateFlinkJarRequestBody.obsBucket)
            && Objects.equals(this.smnTopic, updateFlinkJarRequestBody.smnTopic)
            && Objects.equals(this.mainClass, updateFlinkJarRequestBody.mainClass)
            && Objects.equals(this.entrypointArgs, updateFlinkJarRequestBody.entrypointArgs)
            && Objects.equals(this.restartWhenException, updateFlinkJarRequestBody.restartWhenException)
            && Objects.equals(this.entrypoint, updateFlinkJarRequestBody.entrypoint)
            && Objects.equals(this.dependencyJars, updateFlinkJarRequestBody.dependencyJars)
            && Objects.equals(this.dependencyFiles, updateFlinkJarRequestBody.dependencyFiles)
            && Objects.equals(this.tmCus, updateFlinkJarRequestBody.tmCus)
            && Objects.equals(this.tmSlotNum, updateFlinkJarRequestBody.tmSlotNum)
            && Objects.equals(this.feature, updateFlinkJarRequestBody.feature)
            && Objects.equals(this.flinkVersion, updateFlinkJarRequestBody.flinkVersion)
            && Objects.equals(this.image, updateFlinkJarRequestBody.image)
            && Objects.equals(this.resumeCheckpoint, updateFlinkJarRequestBody.resumeCheckpoint)
            && Objects.equals(this.resumeMaxNum, updateFlinkJarRequestBody.resumeMaxNum)
            && Objects.equals(this.checkpointPath, updateFlinkJarRequestBody.checkpointPath)
            && Objects.equals(this.runtimeConfig, updateFlinkJarRequestBody.runtimeConfig)
            && Objects.equals(this.jobType, updateFlinkJarRequestBody.jobType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            desc,
            queueName,
            cuNumber,
            managerCuNumber,
            parallelNumber,
            logEnabled,
            obsBucket,
            smnTopic,
            mainClass,
            entrypointArgs,
            restartWhenException,
            entrypoint,
            dependencyJars,
            dependencyFiles,
            tmCus,
            tmSlotNum,
            feature,
            flinkVersion,
            image,
            resumeCheckpoint,
            resumeMaxNum,
            checkpointPath,
            runtimeConfig,
            jobType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFlinkJarRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    cuNumber: ").append(toIndentedString(cuNumber)).append("\n");
        sb.append("    managerCuNumber: ").append(toIndentedString(managerCuNumber)).append("\n");
        sb.append("    parallelNumber: ").append(toIndentedString(parallelNumber)).append("\n");
        sb.append("    logEnabled: ").append(toIndentedString(logEnabled)).append("\n");
        sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
        sb.append("    smnTopic: ").append(toIndentedString(smnTopic)).append("\n");
        sb.append("    mainClass: ").append(toIndentedString(mainClass)).append("\n");
        sb.append("    entrypointArgs: ").append(toIndentedString(entrypointArgs)).append("\n");
        sb.append("    restartWhenException: ").append(toIndentedString(restartWhenException)).append("\n");
        sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
        sb.append("    dependencyJars: ").append(toIndentedString(dependencyJars)).append("\n");
        sb.append("    dependencyFiles: ").append(toIndentedString(dependencyFiles)).append("\n");
        sb.append("    tmCus: ").append(toIndentedString(tmCus)).append("\n");
        sb.append("    tmSlotNum: ").append(toIndentedString(tmSlotNum)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    flinkVersion: ").append(toIndentedString(flinkVersion)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    resumeCheckpoint: ").append(toIndentedString(resumeCheckpoint)).append("\n");
        sb.append("    resumeMaxNum: ").append(toIndentedString(resumeMaxNum)).append("\n");
        sb.append("    checkpointPath: ").append(toIndentedString(checkpointPath)).append("\n");
        sb.append("    runtimeConfig: ").append(toIndentedString(runtimeConfig)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
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
