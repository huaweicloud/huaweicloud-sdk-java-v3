package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SparkJobConfig
 */
public class SparkJobConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_file_path")

    private String mainFilePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_class")

    private String mainClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_arguments")

    private List<String> mainArguments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spark_conf")

    private String sparkConf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_resource_spec")

    private String driverResourceSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_resource_spec")

    private String executorResourceSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_executors")

    private Integer numExecutors;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_dynamic_allocation")

    private Boolean enableDynamicAllocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_num_executors")

    private Integer minNumExecutors;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_num_executors")

    private Integer maxNumExecutors;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_log_path")

    private String userLogPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metastore_id")

    private String metastoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metastore_catalog_id")

    private String metastoreCatalogId;

    public SparkJobConfig withMainFilePath(String mainFilePath) {
        this.mainFilePath = mainFilePath;
        return this;
    }

    /**
     * Job主文件，obs上的python文件或jar包
     * @return mainFilePath
     */
    public String getMainFilePath() {
        return mainFilePath;
    }

    public void setMainFilePath(String mainFilePath) {
        this.mainFilePath = mainFilePath;
    }

    public SparkJobConfig withMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }

    /**
     * Java job需指定主类
     * @return mainClass
     */
    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    public SparkJobConfig withMainArguments(List<String> mainArguments) {
        this.mainArguments = mainArguments;
        return this;
    }

    public SparkJobConfig addMainArgumentsItem(String mainArgumentsItem) {
        if (this.mainArguments == null) {
            this.mainArguments = new ArrayList<>();
        }
        this.mainArguments.add(mainArgumentsItem);
        return this;
    }

    public SparkJobConfig withMainArguments(Consumer<List<String>> mainArgumentsSetter) {
        if (this.mainArguments == null) {
            this.mainArguments = new ArrayList<>();
        }
        mainArgumentsSetter.accept(this.mainArguments);
        return this;
    }

    /**
     * Python主文件的运行参数或Java主类的运行参数
     * @return mainArguments
     */
    public List<String> getMainArguments() {
        return mainArguments;
    }

    public void setMainArguments(List<String> mainArguments) {
        this.mainArguments = mainArguments;
    }

    public SparkJobConfig withSparkConf(String sparkConf) {
        this.sparkConf = sparkConf;
        return this;
    }

    /**
     * 自定义的spark配置值
     * @return sparkConf
     */
    public String getSparkConf() {
        return sparkConf;
    }

    public void setSparkConf(String sparkConf) {
        this.sparkConf = sparkConf;
    }

    public SparkJobConfig withDriverResourceSpec(String driverResourceSpec) {
        this.driverResourceSpec = driverResourceSpec;
        return this;
    }

    /**
     * driver资源规格
     * @return driverResourceSpec
     */
    public String getDriverResourceSpec() {
        return driverResourceSpec;
    }

    public void setDriverResourceSpec(String driverResourceSpec) {
        this.driverResourceSpec = driverResourceSpec;
    }

    public SparkJobConfig withExecutorResourceSpec(String executorResourceSpec) {
        this.executorResourceSpec = executorResourceSpec;
        return this;
    }

    /**
     * executor资源规格
     * @return executorResourceSpec
     */
    public String getExecutorResourceSpec() {
        return executorResourceSpec;
    }

    public void setExecutorResourceSpec(String executorResourceSpec) {
        this.executorResourceSpec = executorResourceSpec;
    }

    public SparkJobConfig withNumExecutors(Integer numExecutors) {
        this.numExecutors = numExecutors;
        return this;
    }

    /**
     * executor数量
     * minimum: 1
     * maximum: 2000
     * @return numExecutors
     */
    public Integer getNumExecutors() {
        return numExecutors;
    }

    public void setNumExecutors(Integer numExecutors) {
        this.numExecutors = numExecutors;
    }

    public SparkJobConfig withEnableDynamicAllocation(Boolean enableDynamicAllocation) {
        this.enableDynamicAllocation = enableDynamicAllocation;
        return this;
    }

    /**
     * 是否开启dynamic alocation
     * @return enableDynamicAllocation
     */
    public Boolean getEnableDynamicAllocation() {
        return enableDynamicAllocation;
    }

    public void setEnableDynamicAllocation(Boolean enableDynamicAllocation) {
        this.enableDynamicAllocation = enableDynamicAllocation;
    }

    public SparkJobConfig withMinNumExecutors(Integer minNumExecutors) {
        this.minNumExecutors = minNumExecutors;
        return this;
    }

    /**
     * executor最少个数
     * minimum: 1
     * maximum: 2000
     * @return minNumExecutors
     */
    public Integer getMinNumExecutors() {
        return minNumExecutors;
    }

    public void setMinNumExecutors(Integer minNumExecutors) {
        this.minNumExecutors = minNumExecutors;
    }

    public SparkJobConfig withMaxNumExecutors(Integer maxNumExecutors) {
        this.maxNumExecutors = maxNumExecutors;
        return this;
    }

    /**
     * executor最多个数
     * minimum: 1
     * maximum: 2000
     * @return maxNumExecutors
     */
    public Integer getMaxNumExecutors() {
        return maxNumExecutors;
    }

    public void setMaxNumExecutors(Integer maxNumExecutors) {
        this.maxNumExecutors = maxNumExecutors;
    }

    public SparkJobConfig withUserLogPath(String userLogPath) {
        this.userLogPath = userLogPath;
        return this;
    }

    /**
     * 用户日志obs存储位置
     * @return userLogPath
     */
    public String getUserLogPath() {
        return userLogPath;
    }

    public void setUserLogPath(String userLogPath) {
        this.userLogPath = userLogPath;
    }

    public SparkJobConfig withMetastoreId(String metastoreId) {
        this.metastoreId = metastoreId;
        return this;
    }

    /**
     * Metastore信息，LakeFormation服务的实例Id，即MetaStoreId。
     * @return metastoreId
     */
    public String getMetastoreId() {
        return metastoreId;
    }

    public void setMetastoreId(String metastoreId) {
        this.metastoreId = metastoreId;
    }

    public SparkJobConfig withMetastoreCatalogId(String metastoreCatalogId) {
        this.metastoreCatalogId = metastoreCatalogId;
        return this;
    }

    /**
     * metastore catalog id，即lakeformation catalog id
     * @return metastoreCatalogId
     */
    public String getMetastoreCatalogId() {
        return metastoreCatalogId;
    }

    public void setMetastoreCatalogId(String metastoreCatalogId) {
        this.metastoreCatalogId = metastoreCatalogId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SparkJobConfig that = (SparkJobConfig) obj;
        return Objects.equals(this.mainFilePath, that.mainFilePath) && Objects.equals(this.mainClass, that.mainClass)
            && Objects.equals(this.mainArguments, that.mainArguments) && Objects.equals(this.sparkConf, that.sparkConf)
            && Objects.equals(this.driverResourceSpec, that.driverResourceSpec)
            && Objects.equals(this.executorResourceSpec, that.executorResourceSpec)
            && Objects.equals(this.numExecutors, that.numExecutors)
            && Objects.equals(this.enableDynamicAllocation, that.enableDynamicAllocation)
            && Objects.equals(this.minNumExecutors, that.minNumExecutors)
            && Objects.equals(this.maxNumExecutors, that.maxNumExecutors)
            && Objects.equals(this.userLogPath, that.userLogPath) && Objects.equals(this.metastoreId, that.metastoreId)
            && Objects.equals(this.metastoreCatalogId, that.metastoreCatalogId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mainFilePath,
            mainClass,
            mainArguments,
            sparkConf,
            driverResourceSpec,
            executorResourceSpec,
            numExecutors,
            enableDynamicAllocation,
            minNumExecutors,
            maxNumExecutors,
            userLogPath,
            metastoreId,
            metastoreCatalogId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkJobConfig {\n");
        sb.append("    mainFilePath: ").append(toIndentedString(mainFilePath)).append("\n");
        sb.append("    mainClass: ").append(toIndentedString(mainClass)).append("\n");
        sb.append("    mainArguments: ").append(toIndentedString(mainArguments)).append("\n");
        sb.append("    sparkConf: ").append(toIndentedString(sparkConf)).append("\n");
        sb.append("    driverResourceSpec: ").append(toIndentedString(driverResourceSpec)).append("\n");
        sb.append("    executorResourceSpec: ").append(toIndentedString(executorResourceSpec)).append("\n");
        sb.append("    numExecutors: ").append(toIndentedString(numExecutors)).append("\n");
        sb.append("    enableDynamicAllocation: ").append(toIndentedString(enableDynamicAllocation)).append("\n");
        sb.append("    minNumExecutors: ").append(toIndentedString(minNumExecutors)).append("\n");
        sb.append("    maxNumExecutors: ").append(toIndentedString(maxNumExecutors)).append("\n");
        sb.append("    userLogPath: ").append(toIndentedString(userLogPath)).append("\n");
        sb.append("    metastoreId: ").append(toIndentedString(metastoreId)).append("\n");
        sb.append("    metastoreCatalogId: ").append(toIndentedString(metastoreCatalogId)).append("\n");
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
