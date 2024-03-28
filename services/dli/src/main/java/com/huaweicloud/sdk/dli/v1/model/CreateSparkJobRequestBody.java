package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建批处理作业请求body体。
 */
public class CreateSparkJobRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file")

    private String file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "className")

    private String className;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "args")

    private List<String> args = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sc_type")

    private String scType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jars")

    private List<String> jars = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pyFiles")

    private List<String> pyFiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<String> files = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modules")

    private List<String> modules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<SparkJobResource> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<SparkJobGroup> groups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conf")

    private Map<String, Object> conf = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driverMemory")

    private String driverMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driverCores")

    private Integer driverCores;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executorMemory")

    private String executorMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executorCores")

    private Integer executorCores;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "numExecutors")

    private Integer numExecutors;

    /**
     * 作业特性，作业运行在vm队列上支持basic，在container队列上支持basic、ai、custom，其中填写custom时需要同时填写image参数。
     */
    public static final class FeatureEnum {

        /**
         * Enum BASIC for value: "basic"
         */
        public static final FeatureEnum BASIC = new FeatureEnum("basic");

        /**
         * Enum AI for value: "ai"
         */
        public static final FeatureEnum AI = new FeatureEnum("ai");

        /**
         * Enum CUSTOM for value: "custom"
         */
        public static final FeatureEnum CUSTOM = new FeatureEnum("custom");

        private static final Map<String, FeatureEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FeatureEnum> createStaticFields() {
            Map<String, FeatureEnum> map = new HashMap<>();
            map.put("basic", BASIC);
            map.put("ai", AI);
            map.put("custom", CUSTOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FeatureEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FeatureEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FeatureEnum(value));
        }

        public static FeatureEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FeatureEnum) {
                return this.value.equals(((FeatureEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature")

    private FeatureEnum feature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spark_version")

    private String sparkVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue")

    private String queue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_recovery")

    private Boolean autoRecovery;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_retry_times")

    private Integer maxRetryTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket")

    private String obsBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_name")

    private String catalogName;

    public CreateSparkJobRequestBody withFile(String file) {
        this.file = file;
        return this;
    }

    /**
     * 用户已上传到DLI资源管理系统的类型为jar的资源包名。
     * @return file
     */
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public CreateSparkJobRequestBody withClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * 批处理作业的Java/Spark主类。
     * @return className
     */
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public CreateSparkJobRequestBody withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 用于指定队列，填写已创建DLI的队列名。
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public CreateSparkJobRequestBody withArgs(List<String> args) {
        this.args = args;
        return this;
    }

    public CreateSparkJobRequestBody addArgsItem(String argsItem) {
        if (this.args == null) {
            this.args = new ArrayList<>();
        }
        this.args.add(argsItem);
        return this;
    }

    public CreateSparkJobRequestBody withArgs(Consumer<List<String>> argsSetter) {
        if (this.args == null) {
            this.args = new ArrayList<>();
        }
        argsSetter.accept(this.args);
        return this;
    }

    /**
     * 传入主类的参数。
     * @return args
     */
    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    public CreateSparkJobRequestBody withScType(String scType) {
        this.scType = scType;
        return this;
    }

    /**
     * 计算资源类型，目前可接受参数A, B, C。如果不指定，则按最小类型创建。 资源类型： A：物理资源：8核32G内存，driverCores：2；executorCores：1；driverMemory：7G；executorMemory：4G；numExecutor：6。 B：16核64G内存,2,2,7G,8G,7。 C：32核128G内存,4,2,15G,8G,14。
     * @return scType
     */
    public String getScType() {
        return scType;
    }

    public void setScType(String scType) {
        this.scType = scType;
    }

    public CreateSparkJobRequestBody withJars(List<String> jars) {
        this.jars = jars;
        return this;
    }

    public CreateSparkJobRequestBody addJarsItem(String jarsItem) {
        if (this.jars == null) {
            this.jars = new ArrayList<>();
        }
        this.jars.add(jarsItem);
        return this;
    }

    public CreateSparkJobRequestBody withJars(Consumer<List<String>> jarsSetter) {
        if (this.jars == null) {
            this.jars = new ArrayList<>();
        }
        jarsSetter.accept(this.jars);
        return this;
    }

    /**
     * 用户已上传到DLI资源管理系统的类型为jar的资源包名。
     * @return jars
     */
    public List<String> getJars() {
        return jars;
    }

    public void setJars(List<String> jars) {
        this.jars = jars;
    }

    public CreateSparkJobRequestBody withPyFiles(List<String> pyFiles) {
        this.pyFiles = pyFiles;
        return this;
    }

    public CreateSparkJobRequestBody addPyFilesItem(String pyFilesItem) {
        if (this.pyFiles == null) {
            this.pyFiles = new ArrayList<>();
        }
        this.pyFiles.add(pyFilesItem);
        return this;
    }

    public CreateSparkJobRequestBody withPyFiles(Consumer<List<String>> pyFilesSetter) {
        if (this.pyFiles == null) {
            this.pyFiles = new ArrayList<>();
        }
        pyFilesSetter.accept(this.pyFiles);
        return this;
    }

    /**
     * 用户已上传到DLI资源管理系统的类型为pyFile的资源包名。
     * @return pyFiles
     */
    public List<String> getPyFiles() {
        return pyFiles;
    }

    public void setPyFiles(List<String> pyFiles) {
        this.pyFiles = pyFiles;
    }

    public CreateSparkJobRequestBody withFiles(List<String> files) {
        this.files = files;
        return this;
    }

    public CreateSparkJobRequestBody addFilesItem(String filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public CreateSparkJobRequestBody withFiles(Consumer<List<String>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 用户已上传到DLI资源管理系统的类型为file的资源包名。
     * @return files
     */
    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    public CreateSparkJobRequestBody withModules(List<String> modules) {
        this.modules = modules;
        return this;
    }

    public CreateSparkJobRequestBody addModulesItem(String modulesItem) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        this.modules.add(modulesItem);
        return this;
    }

    public CreateSparkJobRequestBody withModules(Consumer<List<String>> modulesSetter) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        modulesSetter.accept(this.modules);
        return this;
    }

    /**
     * 依赖的系统资源模块名，具体模块名可通过查询所有资源包接口查看。 DLI系统提供了用于执行跨源作业的依赖模块，各个不同的服务对应的模块列表如下： CloudTable/MRS HBase: sys.datasource.hbase CloudTable/MRS OpenTSDB: sys.datasource.opentsdb RDS MySQL: sys.datasource.rds RDS PostGre: 不需要选 DWS: 不需要选 CSS: sys.datasource.css
     * @return modules
     */
    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }

    public CreateSparkJobRequestBody withResources(List<SparkJobResource> resources) {
        this.resources = resources;
        return this;
    }

    public CreateSparkJobRequestBody addResourcesItem(SparkJobResource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public CreateSparkJobRequestBody withResources(Consumer<List<SparkJobResource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * JSON对象列表，填写用户已上传到队列的类型为JSON的资源包名和类型。
     * @return resources
     */
    public List<SparkJobResource> getResources() {
        return resources;
    }

    public void setResources(List<SparkJobResource> resources) {
        this.resources = resources;
    }

    public CreateSparkJobRequestBody withGroups(List<SparkJobGroup> groups) {
        this.groups = groups;
        return this;
    }

    public CreateSparkJobRequestBody addGroupsItem(SparkJobGroup groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public CreateSparkJobRequestBody withGroups(Consumer<List<SparkJobGroup>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * JSON对象列表，填写用户组类型资源，格式详见请求示例。resources中的name未进行type校验，只要此分组中存在这个名字的包即可。
     * @return groups
     */
    public List<SparkJobGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<SparkJobGroup> groups) {
        this.groups = groups;
    }

    public CreateSparkJobRequestBody withConf(Map<String, Object> conf) {
        this.conf = conf;
        return this;
    }

    public CreateSparkJobRequestBody putConfItem(String key, Object confItem) {
        if (this.conf == null) {
            this.conf = new HashMap<>();
        }
        this.conf.put(key, confItem);
        return this;
    }

    public CreateSparkJobRequestBody withConf(Consumer<Map<String, Object>> confSetter) {
        if (this.conf == null) {
            this.conf = new HashMap<>();
        }
        confSetter.accept(this.conf);
        return this;
    }

    /**
     * batch配置项。
     * @return conf
     */
    public Map<String, Object> getConf() {
        return conf;
    }

    public void setConf(Map<String, Object> conf) {
        this.conf = conf;
    }

    public CreateSparkJobRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 创建时用户指定的批处理名称，不能超过128个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateSparkJobRequestBody withDriverMemory(String driverMemory) {
        this.driverMemory = driverMemory;
        return this;
    }

    /**
     * Spark应用的Driver内存, 参数配置例如2G, 2048M。该配置项会替换“sc_type”中对应的默认参数，使用时必需带单位，否则会启动失败。
     * @return driverMemory
     */
    public String getDriverMemory() {
        return driverMemory;
    }

    public void setDriverMemory(String driverMemory) {
        this.driverMemory = driverMemory;
    }

    public CreateSparkJobRequestBody withDriverCores(Integer driverCores) {
        this.driverCores = driverCores;
        return this;
    }

    /**
     * Spark应用Driver的CPU核数。该配置项会替换sc_type中对应的默认参数。
     * @return driverCores
     */
    public Integer getDriverCores() {
        return driverCores;
    }

    public void setDriverCores(Integer driverCores) {
        this.driverCores = driverCores;
    }

    public CreateSparkJobRequestBody withExecutorMemory(String executorMemory) {
        this.executorMemory = executorMemory;
        return this;
    }

    /**
     * Spark应用的Executor内存, 参数配置例如2G, 2048M。该配置项会替换“sc_type”中对应的默认参数，使用时必需带单位，否则会启动失败。
     * @return executorMemory
     */
    public String getExecutorMemory() {
        return executorMemory;
    }

    public void setExecutorMemory(String executorMemory) {
        this.executorMemory = executorMemory;
    }

    public CreateSparkJobRequestBody withExecutorCores(Integer executorCores) {
        this.executorCores = executorCores;
        return this;
    }

    /**
     * Spark应用每个Executor的CPU核数。该配置项会替换sc_type中对应的默认参数。
     * @return executorCores
     */
    public Integer getExecutorCores() {
        return executorCores;
    }

    public void setExecutorCores(Integer executorCores) {
        this.executorCores = executorCores;
    }

    public CreateSparkJobRequestBody withNumExecutors(Integer numExecutors) {
        this.numExecutors = numExecutors;
        return this;
    }

    /**
     * Spark应用Executor的个数。该配置项会替换sc_type中对应的默认参数。
     * @return numExecutors
     */
    public Integer getNumExecutors() {
        return numExecutors;
    }

    public void setNumExecutors(Integer numExecutors) {
        this.numExecutors = numExecutors;
    }

    public CreateSparkJobRequestBody withFeature(FeatureEnum feature) {
        this.feature = feature;
        return this;
    }

    /**
     * 作业特性，作业运行在vm队列上支持basic，在container队列上支持basic、ai、custom，其中填写custom时需要同时填写image参数。
     * @return feature
     */
    public FeatureEnum getFeature() {
        return feature;
    }

    public void setFeature(FeatureEnum feature) {
        this.feature = feature;
    }

    public CreateSparkJobRequestBody withSparkVersion(String sparkVersion) {
        this.sparkVersion = sparkVersion;
        return this;
    }

    /**
     * 作业使用spark组件的版本号，在feature为“basic”或“ai”时填写，若不填写，则使用默认的spark组件版本号2.3.2。
     * @return sparkVersion
     */
    public String getSparkVersion() {
        return sparkVersion;
    }

    public void setSparkVersion(String sparkVersion) {
        this.sparkVersion = sparkVersion;
    }

    public CreateSparkJobRequestBody withQueue(String queue) {
        this.queue = queue;
        return this;
    }

    /**
     * 用于指定队列，填写已创建DLI的队列名
     * @return queue
     */
    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public CreateSparkJobRequestBody withAutoRecovery(Boolean autoRecovery) {
        this.autoRecovery = autoRecovery;
        return this;
    }

    /**
     * 是否开启重试功能，如果开启，可在Spark作业异常失败后自动重试。默认值为“false”。
     * @return autoRecovery
     */
    public Boolean getAutoRecovery() {
        return autoRecovery;
    }

    public void setAutoRecovery(Boolean autoRecovery) {
        this.autoRecovery = autoRecovery;
    }

    public CreateSparkJobRequestBody withMaxRetryTimes(Integer maxRetryTimes) {
        this.maxRetryTimes = maxRetryTimes;
        return this;
    }

    /**
     * 最大重试次数。最大值为“100”，默认值为“20”。
     * @return maxRetryTimes
     */
    public Integer getMaxRetryTimes() {
        return maxRetryTimes;
    }

    public void setMaxRetryTimes(Integer maxRetryTimes) {
        this.maxRetryTimes = maxRetryTimes;
    }

    public CreateSparkJobRequestBody withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 自定义镜像。格式为：组织名/镜像名:镜像版本。当用户设置“feature”为“custom”时，该参数生效。用户可通过与“feature”参数配合使用，指定作业运行使用自定义的Spark镜像。关于如何使用自定义镜像，请参考《数据湖探索用户指南》。
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public CreateSparkJobRequestBody withObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
        return this;
    }

    /**
     * 保存Spark作业的obs桶，需要保存作业时配置该参数
     * @return obsBucket
     */
    public String getObsBucket() {
        return obsBucket;
    }

    public void setObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
    }

    public CreateSparkJobRequestBody withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * 访问元数据时，需要将该参数配置为dli。
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSparkJobRequestBody that = (CreateSparkJobRequestBody) obj;
        return Objects.equals(this.file, that.file) && Objects.equals(this.className, that.className)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.args, that.args)
            && Objects.equals(this.scType, that.scType) && Objects.equals(this.jars, that.jars)
            && Objects.equals(this.pyFiles, that.pyFiles) && Objects.equals(this.files, that.files)
            && Objects.equals(this.modules, that.modules) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.groups, that.groups) && Objects.equals(this.conf, that.conf)
            && Objects.equals(this.name, that.name) && Objects.equals(this.driverMemory, that.driverMemory)
            && Objects.equals(this.driverCores, that.driverCores)
            && Objects.equals(this.executorMemory, that.executorMemory)
            && Objects.equals(this.executorCores, that.executorCores)
            && Objects.equals(this.numExecutors, that.numExecutors) && Objects.equals(this.feature, that.feature)
            && Objects.equals(this.sparkVersion, that.sparkVersion) && Objects.equals(this.queue, that.queue)
            && Objects.equals(this.autoRecovery, that.autoRecovery)
            && Objects.equals(this.maxRetryTimes, that.maxRetryTimes) && Objects.equals(this.image, that.image)
            && Objects.equals(this.obsBucket, that.obsBucket) && Objects.equals(this.catalogName, that.catalogName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file,
            className,
            clusterName,
            args,
            scType,
            jars,
            pyFiles,
            files,
            modules,
            resources,
            groups,
            conf,
            name,
            driverMemory,
            driverCores,
            executorMemory,
            executorCores,
            numExecutors,
            feature,
            sparkVersion,
            queue,
            autoRecovery,
            maxRetryTimes,
            image,
            obsBucket,
            catalogName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSparkJobRequestBody {\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    className: ").append(toIndentedString(className)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    scType: ").append(toIndentedString(scType)).append("\n");
        sb.append("    jars: ").append(toIndentedString(jars)).append("\n");
        sb.append("    pyFiles: ").append(toIndentedString(pyFiles)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
        sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    conf: ").append(toIndentedString(conf)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    driverMemory: ").append(toIndentedString(driverMemory)).append("\n");
        sb.append("    driverCores: ").append(toIndentedString(driverCores)).append("\n");
        sb.append("    executorMemory: ").append(toIndentedString(executorMemory)).append("\n");
        sb.append("    executorCores: ").append(toIndentedString(executorCores)).append("\n");
        sb.append("    numExecutors: ").append(toIndentedString(numExecutors)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    sparkVersion: ").append(toIndentedString(sparkVersion)).append("\n");
        sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
        sb.append("    autoRecovery: ").append(toIndentedString(autoRecovery)).append("\n");
        sb.append("    maxRetryTimes: ").append(toIndentedString(maxRetryTimes)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
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
