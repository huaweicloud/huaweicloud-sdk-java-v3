package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<Node> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private Schedule schedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<JobParam> params = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private String directory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "downstreamJobs")

    private List<JobInformation> downstreamJobs = null;

    /**
     * 作业类型，REAL_TIME： 实时处理，BATCH：批处理
     */
    public static final class ProcessTypeEnum {

        /**
         * Enum BATCH for value: "BATCH"
         */
        public static final ProcessTypeEnum BATCH = new ProcessTypeEnum("BATCH");

        /**
         * Enum REAL_TIME for value: "REAL_TIME"
         */
        public static final ProcessTypeEnum REAL_TIME = new ProcessTypeEnum("REAL_TIME");

        private static final Map<String, ProcessTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProcessTypeEnum> createStaticFields() {
            Map<String, ProcessTypeEnum> map = new HashMap<>();
            map.put("BATCH", BATCH);
            map.put("REAL_TIME", REAL_TIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProcessTypeEnum(String value) {
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
        public static ProcessTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProcessTypeEnum(value));
        }

        public static ProcessTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProcessTypeEnum) {
                return this.value.equals(((ProcessTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processType")

    private ProcessTypeEnum processType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "singleNodeJobFlag")

    private Boolean singleNodeJobFlag;

    /**
     * 单任务类型
     */
    public static final class SingleNodeJobTypeEnum {

        /**
         * Enum DLISQL for value: "DliSQL"
         */
        public static final SingleNodeJobTypeEnum DLISQL = new SingleNodeJobTypeEnum("DliSQL");

        /**
         * Enum DWSSQL for value: "DwsSQL"
         */
        public static final SingleNodeJobTypeEnum DWSSQL = new SingleNodeJobTypeEnum("DwsSQL");

        /**
         * Enum HIVESQL for value: "HiveSQL"
         */
        public static final SingleNodeJobTypeEnum HIVESQL = new SingleNodeJobTypeEnum("HiveSQL");

        /**
         * Enum SPARKSQL for value: "SparkSQL"
         */
        public static final SingleNodeJobTypeEnum SPARKSQL = new SingleNodeJobTypeEnum("SparkSQL");

        /**
         * Enum RDSSQL for value: "RdsSQL"
         */
        public static final SingleNodeJobTypeEnum RDSSQL = new SingleNodeJobTypeEnum("RdsSQL");

        /**
         * Enum DORISSQL for value: "DorisSQL"
         */
        public static final SingleNodeJobTypeEnum DORISSQL = new SingleNodeJobTypeEnum("DorisSQL");

        /**
         * Enum ASSIGNMENT for value: "ASSIGNMENT"
         */
        public static final SingleNodeJobTypeEnum ASSIGNMENT = new SingleNodeJobTypeEnum("ASSIGNMENT");

        /**
         * Enum BRANCH for value: "BRANCH"
         */
        public static final SingleNodeJobTypeEnum BRANCH = new SingleNodeJobTypeEnum("BRANCH");

        /**
         * Enum MERGE for value: "MERGE"
         */
        public static final SingleNodeJobTypeEnum MERGE = new SingleNodeJobTypeEnum("MERGE");

        /**
         * Enum DATAMIGRATION for value: "DataMigration"
         */
        public static final SingleNodeJobTypeEnum DATAMIGRATION = new SingleNodeJobTypeEnum("DataMigration");

        /**
         * Enum MRSFLINK for value: "MrsFlink"
         */
        public static final SingleNodeJobTypeEnum MRSFLINK = new SingleNodeJobTypeEnum("MrsFlink");

        /**
         * Enum FLINKSQL for value: "FlinkSQL"
         */
        public static final SingleNodeJobTypeEnum FLINKSQL = new SingleNodeJobTypeEnum("FlinkSQL");

        /**
         * Enum FLINKJAR for value: "FlinkJar"
         */
        public static final SingleNodeJobTypeEnum FLINKJAR = new SingleNodeJobTypeEnum("FlinkJar");

        /**
         * Enum DLISPARK for value: "DLISpark"
         */
        public static final SingleNodeJobTypeEnum DLISPARK = new SingleNodeJobTypeEnum("DLISpark");

        private static final Map<String, SingleNodeJobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SingleNodeJobTypeEnum> createStaticFields() {
            Map<String, SingleNodeJobTypeEnum> map = new HashMap<>();
            map.put("DliSQL", DLISQL);
            map.put("DwsSQL", DWSSQL);
            map.put("HiveSQL", HIVESQL);
            map.put("SparkSQL", SPARKSQL);
            map.put("RdsSQL", RDSSQL);
            map.put("DorisSQL", DORISSQL);
            map.put("ASSIGNMENT", ASSIGNMENT);
            map.put("BRANCH", BRANCH);
            map.put("MERGE", MERGE);
            map.put("DataMigration", DATAMIGRATION);
            map.put("MrsFlink", MRSFLINK);
            map.put("FlinkSQL", FLINKSQL);
            map.put("FlinkJar", FLINKJAR);
            map.put("DLISpark", DLISPARK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SingleNodeJobTypeEnum(String value) {
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
        public static SingleNodeJobTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SingleNodeJobTypeEnum(value));
        }

        public static SingleNodeJobTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SingleNodeJobTypeEnum) {
                return this.value.equals(((SingleNodeJobTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "singleNodeJobType")

    private SingleNodeJobTypeEnum singleNodeJobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdateUser")

    private String lastUpdateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logPath")

    private String logPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basicConfig")

    private BasicConfig basicConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cleanOverdueDays")

    private Integer cleanOverdueDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cleanWaitingJob")

    private String cleanWaitingJob;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "emptyRunningJob")

    private String emptyRunningJob;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public ShowJobResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowJobResponse withNodes(List<Node> nodes) {
        this.nodes = nodes;
        return this;
    }

    public ShowJobResponse addNodesItem(Node nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ShowJobResponse withNodes(Consumer<List<Node>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 节点定义
     * @return nodes
     */
    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public ShowJobResponse withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public ShowJobResponse withSchedule(Consumer<Schedule> scheduleSetter) {
        if (this.schedule == null) {
            this.schedule = new Schedule();
            scheduleSetter.accept(this.schedule);
        }

        return this;
    }

    /**
     * Get schedule
     * @return schedule
     */
    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public ShowJobResponse withParams(List<JobParam> params) {
        this.params = params;
        return this;
    }

    public ShowJobResponse addParamsItem(JobParam paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public ShowJobResponse withParams(Consumer<List<JobParam>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 作业参数定义
     * @return params
     */
    public List<JobParam> getParams() {
        return params;
    }

    public void setParams(List<JobParam> params) {
        this.params = params;
    }

    public ShowJobResponse withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * 作业在目录树上的路径。创建作业时如果路径目录不存在，会自动创建目录，如/dir/a/，默认在根目录/。
     * @return directory
     */
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public ShowJobResponse withDownstreamJobs(List<JobInformation> downstreamJobs) {
        this.downstreamJobs = downstreamJobs;
        return this;
    }

    public ShowJobResponse addDownstreamJobsItem(JobInformation downstreamJobsItem) {
        if (this.downstreamJobs == null) {
            this.downstreamJobs = new ArrayList<>();
        }
        this.downstreamJobs.add(downstreamJobsItem);
        return this;
    }

    public ShowJobResponse withDownstreamJobs(Consumer<List<JobInformation>> downstreamJobsSetter) {
        if (this.downstreamJobs == null) {
            this.downstreamJobs = new ArrayList<>();
        }
        downstreamJobsSetter.accept(this.downstreamJobs);
        return this;
    }

    /**
     * 下游作业信息
     * @return downstreamJobs
     */
    public List<JobInformation> getDownstreamJobs() {
        return downstreamJobs;
    }

    public void setDownstreamJobs(List<JobInformation> downstreamJobs) {
        this.downstreamJobs = downstreamJobs;
    }

    public ShowJobResponse withProcessType(ProcessTypeEnum processType) {
        this.processType = processType;
        return this;
    }

    /**
     * 作业类型，REAL_TIME： 实时处理，BATCH：批处理
     * @return processType
     */
    public ProcessTypeEnum getProcessType() {
        return processType;
    }

    public void setProcessType(ProcessTypeEnum processType) {
        this.processType = processType;
    }

    public ShowJobResponse withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 作业Id, 用户查询作业时使用。
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShowJobResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 作业创建时间.
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowJobResponse withSingleNodeJobFlag(Boolean singleNodeJobFlag) {
        this.singleNodeJobFlag = singleNodeJobFlag;
        return this;
    }

    /**
     * 是否选择单任务，默认为false
     * @return singleNodeJobFlag
     */
    public Boolean getSingleNodeJobFlag() {
        return singleNodeJobFlag;
    }

    public void setSingleNodeJobFlag(Boolean singleNodeJobFlag) {
        this.singleNodeJobFlag = singleNodeJobFlag;
    }

    public ShowJobResponse withSingleNodeJobType(SingleNodeJobTypeEnum singleNodeJobType) {
        this.singleNodeJobType = singleNodeJobType;
        return this;
    }

    /**
     * 单任务类型
     * @return singleNodeJobType
     */
    public SingleNodeJobTypeEnum getSingleNodeJobType() {
        return singleNodeJobType;
    }

    public void setSingleNodeJobType(SingleNodeJobTypeEnum singleNodeJobType) {
        this.singleNodeJobType = singleNodeJobType;
    }

    public ShowJobResponse withLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
        return this;
    }

    /**
     * 作业最后修改人
     * @return lastUpdateUser
     */
    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public ShowJobResponse withLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }

    /**
     * 作业运行日志存放的OBS路径。
     * @return logPath
     */
    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    public ShowJobResponse withBasicConfig(BasicConfig basicConfig) {
        this.basicConfig = basicConfig;
        return this;
    }

    public ShowJobResponse withBasicConfig(Consumer<BasicConfig> basicConfigSetter) {
        if (this.basicConfig == null) {
            this.basicConfig = new BasicConfig();
            basicConfigSetter.accept(this.basicConfig);
        }

        return this;
    }

    /**
     * Get basicConfig
     * @return basicConfig
     */
    public BasicConfig getBasicConfig() {
        return basicConfig;
    }

    public void setBasicConfig(BasicConfig basicConfig) {
        this.basicConfig = basicConfig;
    }

    public ShowJobResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 作业描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowJobResponse withCleanOverdueDays(Integer cleanOverdueDays) {
        this.cleanOverdueDays = cleanOverdueDays;
        return this;
    }

    /**
     * 设置作业的最大超时时间。
     * @return cleanOverdueDays
     */
    public Integer getCleanOverdueDays() {
        return cleanOverdueDays;
    }

    public void setCleanOverdueDays(Integer cleanOverdueDays) {
        this.cleanOverdueDays = cleanOverdueDays;
    }

    public ShowJobResponse withCleanWaitingJob(String cleanWaitingJob) {
        this.cleanWaitingJob = cleanWaitingJob;
        return this;
    }

    /**
     * 清除等待的作业。
     * @return cleanWaitingJob
     */
    public String getCleanWaitingJob() {
        return cleanWaitingJob;
    }

    public void setCleanWaitingJob(String cleanWaitingJob) {
        this.cleanWaitingJob = cleanWaitingJob;
    }

    public ShowJobResponse withEmptyRunningJob(String emptyRunningJob) {
        this.emptyRunningJob = emptyRunningJob;
        return this;
    }

    /**
     * 是否空跑。
     * @return emptyRunningJob
     */
    public String getEmptyRunningJob() {
        return emptyRunningJob;
    }

    public void setEmptyRunningJob(String emptyRunningJob) {
        this.emptyRunningJob = emptyRunningJob;
    }

    public ShowJobResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 作业版本信息。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobResponse that = (ShowJobResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.nodes, that.nodes)
            && Objects.equals(this.schedule, that.schedule) && Objects.equals(this.params, that.params)
            && Objects.equals(this.directory, that.directory)
            && Objects.equals(this.downstreamJobs, that.downstreamJobs)
            && Objects.equals(this.processType, that.processType) && Objects.equals(this.id, that.id)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.singleNodeJobFlag, that.singleNodeJobFlag)
            && Objects.equals(this.singleNodeJobType, that.singleNodeJobType)
            && Objects.equals(this.lastUpdateUser, that.lastUpdateUser) && Objects.equals(this.logPath, that.logPath)
            && Objects.equals(this.basicConfig, that.basicConfig) && Objects.equals(this.description, that.description)
            && Objects.equals(this.cleanOverdueDays, that.cleanOverdueDays)
            && Objects.equals(this.cleanWaitingJob, that.cleanWaitingJob)
            && Objects.equals(this.emptyRunningJob, that.emptyRunningJob) && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            nodes,
            schedule,
            params,
            directory,
            downstreamJobs,
            processType,
            id,
            createTime,
            singleNodeJobFlag,
            singleNodeJobType,
            lastUpdateUser,
            logPath,
            basicConfig,
            description,
            cleanOverdueDays,
            cleanWaitingJob,
            emptyRunningJob,
            version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    downstreamJobs: ").append(toIndentedString(downstreamJobs)).append("\n");
        sb.append("    processType: ").append(toIndentedString(processType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    singleNodeJobFlag: ").append(toIndentedString(singleNodeJobFlag)).append("\n");
        sb.append("    singleNodeJobType: ").append(toIndentedString(singleNodeJobType)).append("\n");
        sb.append("    lastUpdateUser: ").append(toIndentedString(lastUpdateUser)).append("\n");
        sb.append("    logPath: ").append(toIndentedString(logPath)).append("\n");
        sb.append("    basicConfig: ").append(toIndentedString(basicConfig)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    cleanOverdueDays: ").append(toIndentedString(cleanOverdueDays)).append("\n");
        sb.append("    cleanWaitingJob: ").append(toIndentedString(cleanWaitingJob)).append("\n");
        sb.append("    emptyRunningJob: ").append(toIndentedString(emptyRunningJob)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
