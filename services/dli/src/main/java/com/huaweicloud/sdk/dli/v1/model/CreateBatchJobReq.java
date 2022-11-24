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
public class CreateBatchJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file")

    private String file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "class_name")

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
    @JsonProperty(value = "python_files")

    private List<String> pythonFiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<String> files = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modules")

    private List<String> modules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<CreateSessionReqResource> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<CreateSessionReqGroup> groups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conf")

    private List<Object> conf = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_memory")

    private String driverMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_cores")

    private Integer driverCores;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_memory")

    private String executorMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_cores")

    private Integer executorCores;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_executors")

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
         * Enum _AI for value: " ai"
         */
        public static final FeatureEnum _AI = new FeatureEnum(" ai");

        /**
         * Enum _CUSTOM for value: " custom"
         */
        public static final FeatureEnum _CUSTOM = new FeatureEnum(" custom");

        private static final Map<String, FeatureEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FeatureEnum> createStaticFields() {
            Map<String, FeatureEnum> map = new HashMap<>();
            map.put("basic", BASIC);
            map.put(" ai", _AI);
            map.put(" custom", _CUSTOM);
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
            FeatureEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FeatureEnum(value);
            }
            return result;
        }

        public static FeatureEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FeatureEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "catalog_name")

    private String catalogName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket")

    private String obsBucket;

    public CreateBatchJobReq withFile(String file) {
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

    public CreateBatchJobReq withClassName(String className) {
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

    public CreateBatchJobReq withClusterName(String clusterName) {
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

    public CreateBatchJobReq withArgs(List<String> args) {
        this.args = args;
        return this;
    }

    public CreateBatchJobReq addArgsItem(String argsItem) {
        if (this.args == null) {
            this.args = new ArrayList<>();
        }
        this.args.add(argsItem);
        return this;
    }

    public CreateBatchJobReq withArgs(Consumer<List<String>> argsSetter) {
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

    public CreateBatchJobReq withScType(String scType) {
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

    public CreateBatchJobReq withJars(List<String> jars) {
        this.jars = jars;
        return this;
    }

    public CreateBatchJobReq addJarsItem(String jarsItem) {
        if (this.jars == null) {
            this.jars = new ArrayList<>();
        }
        this.jars.add(jarsItem);
        return this;
    }

    public CreateBatchJobReq withJars(Consumer<List<String>> jarsSetter) {
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

    public CreateBatchJobReq withPythonFiles(List<String> pythonFiles) {
        this.pythonFiles = pythonFiles;
        return this;
    }

    public CreateBatchJobReq addPythonFilesItem(String pythonFilesItem) {
        if (this.pythonFiles == null) {
            this.pythonFiles = new ArrayList<>();
        }
        this.pythonFiles.add(pythonFilesItem);
        return this;
    }

    public CreateBatchJobReq withPythonFiles(Consumer<List<String>> pythonFilesSetter) {
        if (this.pythonFiles == null) {
            this.pythonFiles = new ArrayList<>();
        }
        pythonFilesSetter.accept(this.pythonFiles);
        return this;
    }

    /**
     * 用户已上传到DLI资源管理系统的类型为pyFile的资源包名。
     * @return pythonFiles
     */
    public List<String> getPythonFiles() {
        return pythonFiles;
    }

    public void setPythonFiles(List<String> pythonFiles) {
        this.pythonFiles = pythonFiles;
    }

    public CreateBatchJobReq withFiles(List<String> files) {
        this.files = files;
        return this;
    }

    public CreateBatchJobReq addFilesItem(String filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public CreateBatchJobReq withFiles(Consumer<List<String>> filesSetter) {
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

    public CreateBatchJobReq withModules(List<String> modules) {
        this.modules = modules;
        return this;
    }

    public CreateBatchJobReq addModulesItem(String modulesItem) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        this.modules.add(modulesItem);
        return this;
    }

    public CreateBatchJobReq withModules(Consumer<List<String>> modulesSetter) {
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

    public CreateBatchJobReq withResources(List<CreateSessionReqResource> resources) {
        this.resources = resources;
        return this;
    }

    public CreateBatchJobReq addResourcesItem(CreateSessionReqResource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public CreateBatchJobReq withResources(Consumer<List<CreateSessionReqResource>> resourcesSetter) {
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
    public List<CreateSessionReqResource> getResources() {
        return resources;
    }

    public void setResources(List<CreateSessionReqResource> resources) {
        this.resources = resources;
    }

    public CreateBatchJobReq withGroups(List<CreateSessionReqGroup> groups) {
        this.groups = groups;
        return this;
    }

    public CreateBatchJobReq addGroupsItem(CreateSessionReqGroup groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public CreateBatchJobReq withGroups(Consumer<List<CreateSessionReqGroup>> groupsSetter) {
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
    public List<CreateSessionReqGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<CreateSessionReqGroup> groups) {
        this.groups = groups;
    }

    public CreateBatchJobReq withConf(List<Object> conf) {
        this.conf = conf;
        return this;
    }

    public CreateBatchJobReq addConfItem(Object confItem) {
        if (this.conf == null) {
            this.conf = new ArrayList<>();
        }
        this.conf.add(confItem);
        return this;
    }

    public CreateBatchJobReq withConf(Consumer<List<Object>> confSetter) {
        if (this.conf == null) {
            this.conf = new ArrayList<>();
        }
        confSetter.accept(this.conf);
        return this;
    }

    /**
     * batch配置项。
     * @return conf
     */
    public List<Object> getConf() {
        return conf;
    }

    public void setConf(List<Object> conf) {
        this.conf = conf;
    }

    public CreateBatchJobReq withName(String name) {
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

    public CreateBatchJobReq withDriverMemory(String driverMemory) {
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

    public CreateBatchJobReq withDriverCores(Integer driverCores) {
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

    public CreateBatchJobReq withExecutorMemory(String executorMemory) {
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

    public CreateBatchJobReq withExecutorCores(Integer executorCores) {
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

    public CreateBatchJobReq withNumExecutors(Integer numExecutors) {
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

    public CreateBatchJobReq withFeature(FeatureEnum feature) {
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

    public CreateBatchJobReq withSparkVersion(String sparkVersion) {
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

    public CreateBatchJobReq withQueue(String queue) {
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

    public CreateBatchJobReq withAutoRecovery(Boolean autoRecovery) {
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

    public CreateBatchJobReq withMaxRetryTimes(Integer maxRetryTimes) {
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

    public CreateBatchJobReq withImage(String image) {
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

    public CreateBatchJobReq withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * 访问元数据时，需要设置为dli
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public CreateBatchJobReq withObsBucket(String obsBucket) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateBatchJobReq createBatchJobReq = (CreateBatchJobReq) o;
        return Objects.equals(this.file, createBatchJobReq.file)
            && Objects.equals(this.className, createBatchJobReq.className)
            && Objects.equals(this.clusterName, createBatchJobReq.clusterName)
            && Objects.equals(this.args, createBatchJobReq.args)
            && Objects.equals(this.scType, createBatchJobReq.scType)
            && Objects.equals(this.jars, createBatchJobReq.jars)
            && Objects.equals(this.pythonFiles, createBatchJobReq.pythonFiles)
            && Objects.equals(this.files, createBatchJobReq.files)
            && Objects.equals(this.modules, createBatchJobReq.modules)
            && Objects.equals(this.resources, createBatchJobReq.resources)
            && Objects.equals(this.groups, createBatchJobReq.groups)
            && Objects.equals(this.conf, createBatchJobReq.conf) && Objects.equals(this.name, createBatchJobReq.name)
            && Objects.equals(this.driverMemory, createBatchJobReq.driverMemory)
            && Objects.equals(this.driverCores, createBatchJobReq.driverCores)
            && Objects.equals(this.executorMemory, createBatchJobReq.executorMemory)
            && Objects.equals(this.executorCores, createBatchJobReq.executorCores)
            && Objects.equals(this.numExecutors, createBatchJobReq.numExecutors)
            && Objects.equals(this.feature, createBatchJobReq.feature)
            && Objects.equals(this.sparkVersion, createBatchJobReq.sparkVersion)
            && Objects.equals(this.queue, createBatchJobReq.queue)
            && Objects.equals(this.autoRecovery, createBatchJobReq.autoRecovery)
            && Objects.equals(this.maxRetryTimes, createBatchJobReq.maxRetryTimes)
            && Objects.equals(this.image, createBatchJobReq.image)
            && Objects.equals(this.catalogName, createBatchJobReq.catalogName)
            && Objects.equals(this.obsBucket, createBatchJobReq.obsBucket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file,
            className,
            clusterName,
            args,
            scType,
            jars,
            pythonFiles,
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
            catalogName,
            obsBucket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBatchJobReq {\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    className: ").append(toIndentedString(className)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    scType: ").append(toIndentedString(scType)).append("\n");
        sb.append("    jars: ").append(toIndentedString(jars)).append("\n");
        sb.append("    pythonFiles: ").append(toIndentedString(pythonFiles)).append("\n");
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
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
        sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
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
