package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
 * 作业详情请求体
 */
public class JobInfoRequest {

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
    @JsonProperty(value = "log_path")

    private String logPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private String directory;

    /**
     * 作业类型:  - REAL_TIME: 实时处理  - BATCH: 批处理
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
    @JsonProperty(value = "process_type")

    private ProcessTypeEnum processType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single_node_job_flag")

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
         * Enum NORMALJOB for value: "NormalJob"
         */
        public static final SingleNodeJobTypeEnum NORMALJOB = new SingleNodeJobTypeEnum("NormalJob");

        /**
         * Enum ONECLICK for value: "OneClick"
         */
        public static final SingleNodeJobTypeEnum ONECLICK = new SingleNodeJobTypeEnum("OneClick");

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
            map.put("NormalJob", NORMALJOB);
            map.put("OneClick", ONECLICK);
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
    @JsonProperty(value = "single_node_job_type")

    private SingleNodeJobTypeEnum singleNodeJobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private String priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_user")

    private String lastUpdateUser;

    /**
     * 在开启审批开关后，需要填写该字段。表示创建作业的目标状态。  - SAVED: 保存态，表示作业仅保存，无法调度运行，需要提交并审核通过后才能运行。  - SUBMITTED: 提交态，表示作业保存后会自动提交，需要审核通过才能运行。  - PRODUCTION: 生产态，表示作业跳过审批环节，创建后可以直接运行。注意：只有工作空间的管理员用户才能创建生产态的作业。
     */
    public static final class TargetStatusEnum {

        /**
         * Enum SAVED for value: "SAVED"
         */
        public static final TargetStatusEnum SAVED = new TargetStatusEnum("SAVED");

        /**
         * Enum SUBMITTED for value: "SUBMITTED"
         */
        public static final TargetStatusEnum SUBMITTED = new TargetStatusEnum("SUBMITTED");

        /**
         * Enum PRODUCTION for value: "PRODUCTION"
         */
        public static final TargetStatusEnum PRODUCTION = new TargetStatusEnum("PRODUCTION");

        private static final Map<String, TargetStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TargetStatusEnum> createStaticFields() {
            Map<String, TargetStatusEnum> map = new HashMap<>();
            map.put("SAVED", SAVED);
            map.put("SUBMITTED", SUBMITTED);
            map.put("PRODUCTION", PRODUCTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TargetStatusEnum(String value) {
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
        public static TargetStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TargetStatusEnum(value));
        }

        public static TargetStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TargetStatusEnum) {
                return this.value.equals(((TargetStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_status")

    private TargetStatusEnum targetStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approvers")

    private List<Approver> approvers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_config")

    private BasicInfo basicConfig;

    public JobInfoRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称，只能包含六种字符：英文字母、数字、中文、中划线、下划线和点号。作业名称不能重复。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobInfoRequest withNodes(List<Node> nodes) {
        this.nodes = nodes;
        return this;
    }

    public JobInfoRequest addNodesItem(Node nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public JobInfoRequest withNodes(Consumer<List<Node>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 节点清单
     * @return nodes
     */
    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public JobInfoRequest withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public JobInfoRequest withSchedule(Consumer<Schedule> scheduleSetter) {
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

    public JobInfoRequest withParams(List<JobParam> params) {
        this.params = params;
        return this;
    }

    public JobInfoRequest addParamsItem(JobParam paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public JobInfoRequest withParams(Consumer<List<JobParam>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 作业参数清单
     * @return params
     */
    public List<JobParam> getParams() {
        return params;
    }

    public void setParams(List<JobParam> params) {
        this.params = params;
    }

    public JobInfoRequest withLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }

    /**
     * 日志路径
     * @return logPath
     */
    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    public JobInfoRequest withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * 目录路径
     * @return directory
     */
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public JobInfoRequest withProcessType(ProcessTypeEnum processType) {
        this.processType = processType;
        return this;
    }

    /**
     * 作业类型:  - REAL_TIME: 实时处理  - BATCH: 批处理
     * @return processType
     */
    public ProcessTypeEnum getProcessType() {
        return processType;
    }

    public void setProcessType(ProcessTypeEnum processType) {
        this.processType = processType;
    }

    public JobInfoRequest withSingleNodeJobFlag(Boolean singleNodeJobFlag) {
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

    public JobInfoRequest withSingleNodeJobType(SingleNodeJobTypeEnum singleNodeJobType) {
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

    public JobInfoRequest withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建用户
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public JobInfoRequest withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 责任人
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public JobInfoRequest withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级
     * @return priority
     */
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public JobInfoRequest withLastUpdateUser(String lastUpdateUser) {
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

    public JobInfoRequest withTargetStatus(TargetStatusEnum targetStatus) {
        this.targetStatus = targetStatus;
        return this;
    }

    /**
     * 在开启审批开关后，需要填写该字段。表示创建作业的目标状态。  - SAVED: 保存态，表示作业仅保存，无法调度运行，需要提交并审核通过后才能运行。  - SUBMITTED: 提交态，表示作业保存后会自动提交，需要审核通过才能运行。  - PRODUCTION: 生产态，表示作业跳过审批环节，创建后可以直接运行。注意：只有工作空间的管理员用户才能创建生产态的作业。
     * @return targetStatus
     */
    public TargetStatusEnum getTargetStatus() {
        return targetStatus;
    }

    public void setTargetStatus(TargetStatusEnum targetStatus) {
        this.targetStatus = targetStatus;
    }

    public JobInfoRequest withApprovers(List<Approver> approvers) {
        this.approvers = approvers;
        return this;
    }

    public JobInfoRequest addApproversItem(Approver approversItem) {
        if (this.approvers == null) {
            this.approvers = new ArrayList<>();
        }
        this.approvers.add(approversItem);
        return this;
    }

    public JobInfoRequest withApprovers(Consumer<List<Approver>> approversSetter) {
        if (this.approvers == null) {
            this.approvers = new ArrayList<>();
        }
        approversSetter.accept(this.approvers);
        return this;
    }

    /**
     * 作业审批人
     * @return approvers
     */
    public List<Approver> getApprovers() {
        return approvers;
    }

    public void setApprovers(List<Approver> approvers) {
        this.approvers = approvers;
    }

    public JobInfoRequest withBasicConfig(BasicInfo basicConfig) {
        this.basicConfig = basicConfig;
        return this;
    }

    public JobInfoRequest withBasicConfig(Consumer<BasicInfo> basicConfigSetter) {
        if (this.basicConfig == null) {
            this.basicConfig = new BasicInfo();
            basicConfigSetter.accept(this.basicConfig);
        }

        return this;
    }

    /**
     * Get basicConfig
     * @return basicConfig
     */
    public BasicInfo getBasicConfig() {
        return basicConfig;
    }

    public void setBasicConfig(BasicInfo basicConfig) {
        this.basicConfig = basicConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobInfoRequest that = (JobInfoRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.nodes, that.nodes)
            && Objects.equals(this.schedule, that.schedule) && Objects.equals(this.params, that.params)
            && Objects.equals(this.logPath, that.logPath) && Objects.equals(this.directory, that.directory)
            && Objects.equals(this.processType, that.processType)
            && Objects.equals(this.singleNodeJobFlag, that.singleNodeJobFlag)
            && Objects.equals(this.singleNodeJobType, that.singleNodeJobType)
            && Objects.equals(this.createUser, that.createUser) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.lastUpdateUser, that.lastUpdateUser)
            && Objects.equals(this.targetStatus, that.targetStatus) && Objects.equals(this.approvers, that.approvers)
            && Objects.equals(this.basicConfig, that.basicConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            nodes,
            schedule,
            params,
            logPath,
            directory,
            processType,
            singleNodeJobFlag,
            singleNodeJobType,
            createUser,
            owner,
            priority,
            lastUpdateUser,
            targetStatus,
            approvers,
            basicConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobInfoRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    logPath: ").append(toIndentedString(logPath)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    processType: ").append(toIndentedString(processType)).append("\n");
        sb.append("    singleNodeJobFlag: ").append(toIndentedString(singleNodeJobFlag)).append("\n");
        sb.append("    singleNodeJobType: ").append(toIndentedString(singleNodeJobType)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    lastUpdateUser: ").append(toIndentedString(lastUpdateUser)).append("\n");
        sb.append("    targetStatus: ").append(toIndentedString(targetStatus)).append("\n");
        sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
        sb.append("    basicConfig: ").append(toIndentedString(basicConfig)).append("\n");
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
