package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListQueriesDto
 */
public class ListQueriesDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_cluster_id")

    private Integer virtualClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ctime")

    private Long ctime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pid")

    private String pid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inst_name")

    private String instName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting")

    private Boolean waiting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enqueue")

    private String enqueue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warning")

    private String warning;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lane")

    private String lane;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private String priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_id")

    private String queryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_band")

    private String queryBand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_inst")

    private String jobInst;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_name")

    private String applicationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_address")

    private String clientAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_hostname")

    private String clientHostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_port")

    private String clientPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_time")

    private Long blockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimate_total_time")

    private Long estimateTotalTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimate_left_time")

    private Long estimateLeftTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_pool")

    private String resourcePool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_group")

    private String controlGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_peak_memory")

    private Integer minPeakMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_peak_memory")

    private Integer maxPeakMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_peak_memory")

    private Integer averagePeakMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_skew_percent")

    private Integer memorySkewPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimate_memory")

    private Integer estimateMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spill_info")

    private String spillInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_spill_size")

    private Integer minSpillSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_spill_size")

    private Integer maxSpillSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_spill_size")

    private Integer averageSpillSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spill_skew_percent")

    private Integer spillSkewPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_dn_time")

    private Long minDnTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_dn_time")

    private Long maxDnTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_dn_time")

    private Long averageDnTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dntime_skew_percent")

    private Integer dntimeSkewPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_cpu_time")

    private Long minCpuTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_cpu_time")

    private Long maxCpuTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_cpu_time")

    private Long totalCpuTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_skew_percent")

    private Integer cpuSkewPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_peak_iops")

    private Integer averagePeakIops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iops_skew_percent")

    private Integer iopsSkewPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_peak_iops")

    private Integer maxPeakIops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_peak_iops")

    private Integer minPeakIops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_plan")

    private String queryPlan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_status")

    private String queryStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wlm_status")

    private String wlmStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wlm_attrib")

    private String wlmAttrib;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_query")

    private Boolean systemQuery;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend_start")

    private Long backendStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elapsed_time")

    private Long elapsedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "curr_xact_start")

    private Long currXactStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state_change")

    private Long stateChange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_start")

    private Long queryStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_elapsed_time")

    private Long queryElapsedTime;

    public ListQueriesDto withVirtualClusterId(Integer virtualClusterId) {
        this.virtualClusterId = virtualClusterId;
        return this;
    }

    /**
     * 虚拟集群ID
     * @return virtualClusterId
     */
    public Integer getVirtualClusterId() {
        return virtualClusterId;
    }

    public void setVirtualClusterId(Integer virtualClusterId) {
        this.virtualClusterId = virtualClusterId;
    }

    public ListQueriesDto withCtime(Long ctime) {
        this.ctime = ctime;
        return this;
    }

    /**
     * 采集时间
     * @return ctime
     */
    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    public ListQueriesDto withPid(String pid) {
        this.pid = pid;
        return this;
    }

    /**
     * 会话id。
     * @return pid
     */
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public ListQueriesDto withInstName(String instName) {
        this.instName = instName;
        return this;
    }

    /**
     * 实例名称。
     * @return instName
     */
    public String getInstName() {
        return instName;
    }

    public void setInstName(String instName) {
        this.instName = instName;
    }

    public ListQueriesDto withWaiting(Boolean waiting) {
        this.waiting = waiting;
        return this;
    }

    /**
     * 如果后台当前正等待锁则为true。
     * @return waiting
     */
    public Boolean getWaiting() {
        return waiting;
    }

    public void setWaiting(Boolean waiting) {
        this.waiting = waiting;
    }

    public ListQueriesDto withEnqueue(String enqueue) {
        this.enqueue = enqueue;
        return this;
    }

    /**
     * 工作负载管理资源状态。
     * @return enqueue
     */
    public String getEnqueue() {
        return enqueue;
    }

    public void setEnqueue(String enqueue) {
        this.enqueue = enqueue;
    }

    public ListQueriesDto withWarning(String warning) {
        this.warning = warning;
        return this;
    }

    /**
     * 主要显示如下几类告警信息以及sql自诊断调优相关告警。
     * @return warning
     */
    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public ListQueriesDto withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * 查询语句。
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public ListQueriesDto withLane(String lane) {
        this.lane = lane;
        return this;
    }

    /**
     * 快慢车道 (fast or slow)。
     * @return lane
     */
    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public ListQueriesDto withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名称。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public ListQueriesDto withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * job在资源池中的优先级，取值：1,2,4,8（rush、high、medium、low）。
     * @return priority
     */
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public ListQueriesDto withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * 语句执行使用的内部query_id。
     * @return queryId
     */
    public String getQueryId() {
        return queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public ListQueriesDto withQueryBand(String queryBand) {
        this.queryBand = queryBand;
        return this;
    }

    /**
     * 用于标示作业类型，可通过guc参数query_band进行设置，默认为空字符串。
     * @return queryBand
     */
    public String getQueryBand() {
        return queryBand;
    }

    public void setQueryBand(String queryBand) {
        this.queryBand = queryBand;
    }

    public ListQueriesDto withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 这个值是从query_band的字段中取出来的，位置0。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ListQueriesDto withJobInst(String jobInst) {
        this.jobInst = jobInst;
        return this;
    }

    /**
     * 这个值是从query_band的字段中取出来的，位置1。
     * @return jobInst
     */
    public String getJobInst() {
        return jobInst;
    }

    public void setJobInst(String jobInst) {
        this.jobInst = jobInst;
    }

    public ListQueriesDto withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 连接到后端的用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListQueriesDto withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * 连接到后端的应用名。
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public ListQueriesDto withClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
        return this;
    }

    /**
     * 连接到后端的客户端的ip地址。
     * @return clientAddress
     */
    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public ListQueriesDto withClientHostname(String clientHostname) {
        this.clientHostname = clientHostname;
        return this;
    }

    /**
     * 客户端的主机名。
     * @return clientHostname
     */
    public String getClientHostname() {
        return clientHostname;
    }

    public void setClientHostname(String clientHostname) {
        this.clientHostname = clientHostname;
    }

    public ListQueriesDto withClientPort(String clientPort) {
        this.clientPort = clientPort;
        return this;
    }

    /**
     * 客户端用于与后端通讯的tcp端口号。
     * @return clientPort
     */
    public String getClientPort() {
        return clientPort;
    }

    public void setClientPort(String clientPort) {
        this.clientPort = clientPort;
    }

    public ListQueriesDto withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 语句执行的开始时间。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListQueriesDto withBlockTime(Long blockTime) {
        this.blockTime = blockTime;
        return this;
    }

    /**
     * 语句执行前的阻塞时间 （单位ms）。
     * @return blockTime
     */
    public Long getBlockTime() {
        return blockTime;
    }

    public void setBlockTime(Long blockTime) {
        this.blockTime = blockTime;
    }

    public ListQueriesDto withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 语句已经执行的时间 （单位ms）。
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public ListQueriesDto withEstimateTotalTime(Long estimateTotalTime) {
        this.estimateTotalTime = estimateTotalTime;
        return this;
    }

    /**
     * 语句执行预估总时间 （单位ms）。
     * @return estimateTotalTime
     */
    public Long getEstimateTotalTime() {
        return estimateTotalTime;
    }

    public void setEstimateTotalTime(Long estimateTotalTime) {
        this.estimateTotalTime = estimateTotalTime;
    }

    public ListQueriesDto withEstimateLeftTime(Long estimateLeftTime) {
        this.estimateLeftTime = estimateLeftTime;
        return this;
    }

    /**
     * 语句执行预估剩余时间 （单位ms）。
     * @return estimateLeftTime
     */
    public Long getEstimateLeftTime() {
        return estimateLeftTime;
    }

    public void setEstimateLeftTime(Long estimateLeftTime) {
        this.estimateLeftTime = estimateLeftTime;
    }

    public ListQueriesDto withResourcePool(String resourcePool) {
        this.resourcePool = resourcePool;
        return this;
    }

    /**
     * 用户使用的资源池。
     * @return resourcePool
     */
    public String getResourcePool() {
        return resourcePool;
    }

    public void setResourcePool(String resourcePool) {
        this.resourcePool = resourcePool;
    }

    public ListQueriesDto withControlGroup(String controlGroup) {
        this.controlGroup = controlGroup;
        return this;
    }

    /**
     * 语句所使用的cgroup。
     * @return controlGroup
     */
    public String getControlGroup() {
        return controlGroup;
    }

    public void setControlGroup(String controlGroup) {
        this.controlGroup = controlGroup;
    }

    public ListQueriesDto withMinPeakMemory(Integer minPeakMemory) {
        this.minPeakMemory = minPeakMemory;
        return this;
    }

    /**
     * 语句在所有dn上的最小内存峰值 （单位mb）。
     * @return minPeakMemory
     */
    public Integer getMinPeakMemory() {
        return minPeakMemory;
    }

    public void setMinPeakMemory(Integer minPeakMemory) {
        this.minPeakMemory = minPeakMemory;
    }

    public ListQueriesDto withMaxPeakMemory(Integer maxPeakMemory) {
        this.maxPeakMemory = maxPeakMemory;
        return this;
    }

    /**
     * 语句在所有dn上的最大内存峰值 （单位mb）。
     * @return maxPeakMemory
     */
    public Integer getMaxPeakMemory() {
        return maxPeakMemory;
    }

    public void setMaxPeakMemory(Integer maxPeakMemory) {
        this.maxPeakMemory = maxPeakMemory;
    }

    public ListQueriesDto withAveragePeakMemory(Integer averagePeakMemory) {
        this.averagePeakMemory = averagePeakMemory;
        return this;
    }

    /**
     * 语句执行过程中的内存使用平均值 （单位mb）。
     * @return averagePeakMemory
     */
    public Integer getAveragePeakMemory() {
        return averagePeakMemory;
    }

    public void setAveragePeakMemory(Integer averagePeakMemory) {
        this.averagePeakMemory = averagePeakMemory;
    }

    public ListQueriesDto withMemorySkewPercent(Integer memorySkewPercent) {
        this.memorySkewPercent = memorySkewPercent;
        return this;
    }

    /**
     * 语句在各dn间的内存使用倾斜率。
     * @return memorySkewPercent
     */
    public Integer getMemorySkewPercent() {
        return memorySkewPercent;
    }

    public void setMemorySkewPercent(Integer memorySkewPercent) {
        this.memorySkewPercent = memorySkewPercent;
    }

    public ListQueriesDto withEstimateMemory(Integer estimateMemory) {
        this.estimateMemory = estimateMemory;
        return this;
    }

    /**
     * 语句预估使用内存 （单位mb）。
     * @return estimateMemory
     */
    public Integer getEstimateMemory() {
        return estimateMemory;
    }

    public void setEstimateMemory(Integer estimateMemory) {
        this.estimateMemory = estimateMemory;
    }

    public ListQueriesDto withSpillInfo(String spillInfo) {
        this.spillInfo = spillInfo;
        return this;
    }

    /**
     * 语句在所有dn上的下盘信息。
     * @return spillInfo
     */
    public String getSpillInfo() {
        return spillInfo;
    }

    public void setSpillInfo(String spillInfo) {
        this.spillInfo = spillInfo;
    }

    public ListQueriesDto withMinSpillSize(Integer minSpillSize) {
        this.minSpillSize = minSpillSize;
        return this;
    }

    /**
     * 若发生下盘，所有dn上下盘的最小数据量 (单位mb) 默认为0。
     * @return minSpillSize
     */
    public Integer getMinSpillSize() {
        return minSpillSize;
    }

    public void setMinSpillSize(Integer minSpillSize) {
        this.minSpillSize = minSpillSize;
    }

    public ListQueriesDto withMaxSpillSize(Integer maxSpillSize) {
        this.maxSpillSize = maxSpillSize;
        return this;
    }

    /**
     * 若发生下盘，所有dn上下盘的最大数据量 (单位mb) 默认为0。
     * @return maxSpillSize
     */
    public Integer getMaxSpillSize() {
        return maxSpillSize;
    }

    public void setMaxSpillSize(Integer maxSpillSize) {
        this.maxSpillSize = maxSpillSize;
    }

    public ListQueriesDto withAverageSpillSize(Integer averageSpillSize) {
        this.averageSpillSize = averageSpillSize;
        return this;
    }

    /**
     * 若发生下盘，所有dn上下盘的平均数据量 (单位mb) 默认为0。
     * @return averageSpillSize
     */
    public Integer getAverageSpillSize() {
        return averageSpillSize;
    }

    public void setAverageSpillSize(Integer averageSpillSize) {
        this.averageSpillSize = averageSpillSize;
    }

    public ListQueriesDto withSpillSkewPercent(Integer spillSkewPercent) {
        this.spillSkewPercent = spillSkewPercent;
        return this;
    }

    /**
     * 若发生下盘，dn间下盘倾斜率。
     * @return spillSkewPercent
     */
    public Integer getSpillSkewPercent() {
        return spillSkewPercent;
    }

    public void setSpillSkewPercent(Integer spillSkewPercent) {
        this.spillSkewPercent = spillSkewPercent;
    }

    public ListQueriesDto withMinDnTime(Long minDnTime) {
        this.minDnTime = minDnTime;
        return this;
    }

    /**
     * 语句在所有dn上的最小执行时间 (单位ms)。
     * @return minDnTime
     */
    public Long getMinDnTime() {
        return minDnTime;
    }

    public void setMinDnTime(Long minDnTime) {
        this.minDnTime = minDnTime;
    }

    public ListQueriesDto withMaxDnTime(Long maxDnTime) {
        this.maxDnTime = maxDnTime;
        return this;
    }

    /**
     * 语句在所有dn上的最大执行时间 (单位ms)。
     * @return maxDnTime
     */
    public Long getMaxDnTime() {
        return maxDnTime;
    }

    public void setMaxDnTime(Long maxDnTime) {
        this.maxDnTime = maxDnTime;
    }

    public ListQueriesDto withAverageDnTime(Long averageDnTime) {
        this.averageDnTime = averageDnTime;
        return this;
    }

    /**
     * 语句在所有dn上的平均执行时间 (单位ms)。
     * @return averageDnTime
     */
    public Long getAverageDnTime() {
        return averageDnTime;
    }

    public void setAverageDnTime(Long averageDnTime) {
        this.averageDnTime = averageDnTime;
    }

    public ListQueriesDto withDntimeSkewPercent(Integer dntimeSkewPercent) {
        this.dntimeSkewPercent = dntimeSkewPercent;
        return this;
    }

    /**
     * 语句在各dn间的执行时间倾斜率。
     * @return dntimeSkewPercent
     */
    public Integer getDntimeSkewPercent() {
        return dntimeSkewPercent;
    }

    public void setDntimeSkewPercent(Integer dntimeSkewPercent) {
        this.dntimeSkewPercent = dntimeSkewPercent;
    }

    public ListQueriesDto withMinCpuTime(Long minCpuTime) {
        this.minCpuTime = minCpuTime;
        return this;
    }

    /**
     * 语句在所有dn上的最小cpu时间 (单位ms)。
     * @return minCpuTime
     */
    public Long getMinCpuTime() {
        return minCpuTime;
    }

    public void setMinCpuTime(Long minCpuTime) {
        this.minCpuTime = minCpuTime;
    }

    public ListQueriesDto withMaxCpuTime(Long maxCpuTime) {
        this.maxCpuTime = maxCpuTime;
        return this;
    }

    /**
     * 语句在所有dn上的最大cpu时间 (单位ms)。
     * @return maxCpuTime
     */
    public Long getMaxCpuTime() {
        return maxCpuTime;
    }

    public void setMaxCpuTime(Long maxCpuTime) {
        this.maxCpuTime = maxCpuTime;
    }

    public ListQueriesDto withTotalCpuTime(Long totalCpuTime) {
        this.totalCpuTime = totalCpuTime;
        return this;
    }

    /**
     * 语句在所有dn上的cpu总时间 (单位ms)。
     * @return totalCpuTime
     */
    public Long getTotalCpuTime() {
        return totalCpuTime;
    }

    public void setTotalCpuTime(Long totalCpuTime) {
        this.totalCpuTime = totalCpuTime;
    }

    public ListQueriesDto withCpuSkewPercent(Integer cpuSkewPercent) {
        this.cpuSkewPercent = cpuSkewPercent;
        return this;
    }

    /**
     * 语句在各dn间的cpu时间倾斜率。
     * @return cpuSkewPercent
     */
    public Integer getCpuSkewPercent() {
        return cpuSkewPercent;
    }

    public void setCpuSkewPercent(Integer cpuSkewPercent) {
        this.cpuSkewPercent = cpuSkewPercent;
    }

    public ListQueriesDto withAveragePeakIops(Integer averagePeakIops) {
        this.averagePeakIops = averagePeakIops;
        return this;
    }

    /**
     * 语句在所有dn上的每秒平均io峰值（列存单位是次/s，行存单位是万次/s）。
     * @return averagePeakIops
     */
    public Integer getAveragePeakIops() {
        return averagePeakIops;
    }

    public void setAveragePeakIops(Integer averagePeakIops) {
        this.averagePeakIops = averagePeakIops;
    }

    public ListQueriesDto withIopsSkewPercent(Integer iopsSkewPercent) {
        this.iopsSkewPercent = iopsSkewPercent;
        return this;
    }

    /**
     * 语句在dn间的io倾斜率。
     * @return iopsSkewPercent
     */
    public Integer getIopsSkewPercent() {
        return iopsSkewPercent;
    }

    public void setIopsSkewPercent(Integer iopsSkewPercent) {
        this.iopsSkewPercent = iopsSkewPercent;
    }

    public ListQueriesDto withMaxPeakIops(Integer maxPeakIops) {
        this.maxPeakIops = maxPeakIops;
        return this;
    }

    /**
     * 语句在所有dn上的每秒最大io峰值（列存单位是次/s，行存单位是万次/s）。
     * @return maxPeakIops
     */
    public Integer getMaxPeakIops() {
        return maxPeakIops;
    }

    public void setMaxPeakIops(Integer maxPeakIops) {
        this.maxPeakIops = maxPeakIops;
    }

    public ListQueriesDto withMinPeakIops(Integer minPeakIops) {
        this.minPeakIops = minPeakIops;
        return this;
    }

    /**
     * 语句在所有dn上的每秒最小io峰值（列存单位是次/s，行存单位是万次/s）。
     * @return minPeakIops
     */
    public Integer getMinPeakIops() {
        return minPeakIops;
    }

    public void setMinPeakIops(Integer minPeakIops) {
        this.minPeakIops = minPeakIops;
    }

    public ListQueriesDto withQueryPlan(String queryPlan) {
        this.queryPlan = queryPlan;
        return this;
    }

    /**
     * 查询计划。
     * @return queryPlan
     */
    public String getQueryPlan() {
        return queryPlan;
    }

    public void setQueryPlan(String queryPlan) {
        this.queryPlan = queryPlan;
    }

    public ListQueriesDto withQueryStatus(String queryStatus) {
        this.queryStatus = queryStatus;
        return this;
    }

    /**
     * 当前查询语句的实时运行状态 (active, idle, idle in transaction, idle in transaction(aborted), fastpath function call, disabled)。
     * @return queryStatus
     */
    public String getQueryStatus() {
        return queryStatus;
    }

    public void setQueryStatus(String queryStatus) {
        this.queryStatus = queryStatus;
    }

    public ListQueriesDto withWlmStatus(String wlmStatus) {
        this.wlmStatus = wlmStatus;
        return this;
    }

    /**
     * 当前查询语句在资源池上的运行状态 (pending, running, finished, aborted, active, unknown)。
     * @return wlmStatus
     */
    public String getWlmStatus() {
        return wlmStatus;
    }

    public void setWlmStatus(String wlmStatus) {
        this.wlmStatus = wlmStatus;
    }

    public ListQueriesDto withWlmAttrib(String wlmAttrib) {
        this.wlmAttrib = wlmAttrib;
        return this;
    }

    /**
     * 语句的属性 (ordinary, simple, complicated, internal)
     * @return wlmAttrib
     */
    public String getWlmAttrib() {
        return wlmAttrib;
    }

    public void setWlmAttrib(String wlmAttrib) {
        this.wlmAttrib = wlmAttrib;
    }

    public ListQueriesDto withSystemQuery(Boolean systemQuery) {
        this.systemQuery = systemQuery;
        return this;
    }

    /**
     * 是否系统查询。
     * @return systemQuery
     */
    public Boolean getSystemQuery() {
        return systemQuery;
    }

    public void setSystemQuery(Boolean systemQuery) {
        this.systemQuery = systemQuery;
    }

    public ListQueriesDto withBackendStart(Long backendStart) {
        this.backendStart = backendStart;
        return this;
    }

    /**
     * 该过程开始的时间，即当客户端连接服务器时。
     * @return backendStart
     */
    public Long getBackendStart() {
        return backendStart;
    }

    public void setBackendStart(Long backendStart) {
        this.backendStart = backendStart;
    }

    public ListQueriesDto withElapsedTime(Long elapsedTime) {
        this.elapsedTime = elapsedTime;
        return this;
    }

    /**
     * 到目前为止的执行时间。
     * @return elapsedTime
     */
    public Long getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public ListQueriesDto withCurrXactStart(Long currXactStart) {
        this.currXactStart = currXactStart;
        return this;
    }

    /**
     * 启动当前事务的时间，如果没有事务是活跃的，则为null。如果当前查询是首个事务，则这列等同于query_start列。
     * @return currXactStart
     */
    public Long getCurrXactStart() {
        return currXactStart;
    }

    public void setCurrXactStart(Long currXactStart) {
        this.currXactStart = currXactStart;
    }

    public ListQueriesDto withStateChange(Long stateChange) {
        this.stateChange = stateChange;
        return this;
    }

    /**
     * 上次状态改变的时间。
     * @return stateChange
     */
    public Long getStateChange() {
        return stateChange;
    }

    public void setStateChange(Long stateChange) {
        this.stateChange = stateChange;
    }

    public ListQueriesDto withQueryStart(Long queryStart) {
        this.queryStart = queryStart;
        return this;
    }

    /**
     * 语句执行的开始时间。
     * @return queryStart
     */
    public Long getQueryStart() {
        return queryStart;
    }

    public void setQueryStart(Long queryStart) {
        this.queryStart = queryStart;
    }

    public ListQueriesDto withQueryElapsedTime(Long queryElapsedTime) {
        this.queryElapsedTime = queryElapsedTime;
        return this;
    }

    /**
     * 语句当前为止的实际执行时间，(单位：s)。
     * @return queryElapsedTime
     */
    public Long getQueryElapsedTime() {
        return queryElapsedTime;
    }

    public void setQueryElapsedTime(Long queryElapsedTime) {
        this.queryElapsedTime = queryElapsedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListQueriesDto that = (ListQueriesDto) obj;
        return Objects.equals(this.virtualClusterId, that.virtualClusterId) && Objects.equals(this.ctime, that.ctime)
            && Objects.equals(this.pid, that.pid) && Objects.equals(this.instName, that.instName)
            && Objects.equals(this.waiting, that.waiting) && Objects.equals(this.enqueue, that.enqueue)
            && Objects.equals(this.warning, that.warning) && Objects.equals(this.query, that.query)
            && Objects.equals(this.lane, that.lane) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.queryId, that.queryId)
            && Objects.equals(this.queryBand, that.queryBand) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.jobInst, that.jobInst) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.applicationName, that.applicationName)
            && Objects.equals(this.clientAddress, that.clientAddress)
            && Objects.equals(this.clientHostname, that.clientHostname)
            && Objects.equals(this.clientPort, that.clientPort) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.blockTime, that.blockTime) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.estimateTotalTime, that.estimateTotalTime)
            && Objects.equals(this.estimateLeftTime, that.estimateLeftTime)
            && Objects.equals(this.resourcePool, that.resourcePool)
            && Objects.equals(this.controlGroup, that.controlGroup)
            && Objects.equals(this.minPeakMemory, that.minPeakMemory)
            && Objects.equals(this.maxPeakMemory, that.maxPeakMemory)
            && Objects.equals(this.averagePeakMemory, that.averagePeakMemory)
            && Objects.equals(this.memorySkewPercent, that.memorySkewPercent)
            && Objects.equals(this.estimateMemory, that.estimateMemory)
            && Objects.equals(this.spillInfo, that.spillInfo) && Objects.equals(this.minSpillSize, that.minSpillSize)
            && Objects.equals(this.maxSpillSize, that.maxSpillSize)
            && Objects.equals(this.averageSpillSize, that.averageSpillSize)
            && Objects.equals(this.spillSkewPercent, that.spillSkewPercent)
            && Objects.equals(this.minDnTime, that.minDnTime) && Objects.equals(this.maxDnTime, that.maxDnTime)
            && Objects.equals(this.averageDnTime, that.averageDnTime)
            && Objects.equals(this.dntimeSkewPercent, that.dntimeSkewPercent)
            && Objects.equals(this.minCpuTime, that.minCpuTime) && Objects.equals(this.maxCpuTime, that.maxCpuTime)
            && Objects.equals(this.totalCpuTime, that.totalCpuTime)
            && Objects.equals(this.cpuSkewPercent, that.cpuSkewPercent)
            && Objects.equals(this.averagePeakIops, that.averagePeakIops)
            && Objects.equals(this.iopsSkewPercent, that.iopsSkewPercent)
            && Objects.equals(this.maxPeakIops, that.maxPeakIops) && Objects.equals(this.minPeakIops, that.minPeakIops)
            && Objects.equals(this.queryPlan, that.queryPlan) && Objects.equals(this.queryStatus, that.queryStatus)
            && Objects.equals(this.wlmStatus, that.wlmStatus) && Objects.equals(this.wlmAttrib, that.wlmAttrib)
            && Objects.equals(this.systemQuery, that.systemQuery)
            && Objects.equals(this.backendStart, that.backendStart)
            && Objects.equals(this.elapsedTime, that.elapsedTime)
            && Objects.equals(this.currXactStart, that.currXactStart)
            && Objects.equals(this.stateChange, that.stateChange) && Objects.equals(this.queryStart, that.queryStart)
            && Objects.equals(this.queryElapsedTime, that.queryElapsedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virtualClusterId,
            ctime,
            pid,
            instName,
            waiting,
            enqueue,
            warning,
            query,
            lane,
            dbName,
            priority,
            queryId,
            queryBand,
            jobName,
            jobInst,
            userName,
            applicationName,
            clientAddress,
            clientHostname,
            clientPort,
            startTime,
            blockTime,
            duration,
            estimateTotalTime,
            estimateLeftTime,
            resourcePool,
            controlGroup,
            minPeakMemory,
            maxPeakMemory,
            averagePeakMemory,
            memorySkewPercent,
            estimateMemory,
            spillInfo,
            minSpillSize,
            maxSpillSize,
            averageSpillSize,
            spillSkewPercent,
            minDnTime,
            maxDnTime,
            averageDnTime,
            dntimeSkewPercent,
            minCpuTime,
            maxCpuTime,
            totalCpuTime,
            cpuSkewPercent,
            averagePeakIops,
            iopsSkewPercent,
            maxPeakIops,
            minPeakIops,
            queryPlan,
            queryStatus,
            wlmStatus,
            wlmAttrib,
            systemQuery,
            backendStart,
            elapsedTime,
            currXactStart,
            stateChange,
            queryStart,
            queryElapsedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQueriesDto {\n");
        sb.append("    virtualClusterId: ").append(toIndentedString(virtualClusterId)).append("\n");
        sb.append("    ctime: ").append(toIndentedString(ctime)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    instName: ").append(toIndentedString(instName)).append("\n");
        sb.append("    waiting: ").append(toIndentedString(waiting)).append("\n");
        sb.append("    enqueue: ").append(toIndentedString(enqueue)).append("\n");
        sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    lane: ").append(toIndentedString(lane)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
        sb.append("    queryBand: ").append(toIndentedString(queryBand)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobInst: ").append(toIndentedString(jobInst)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    clientAddress: ").append(toIndentedString(clientAddress)).append("\n");
        sb.append("    clientHostname: ").append(toIndentedString(clientHostname)).append("\n");
        sb.append("    clientPort: ").append(toIndentedString(clientPort)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    blockTime: ").append(toIndentedString(blockTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    estimateTotalTime: ").append(toIndentedString(estimateTotalTime)).append("\n");
        sb.append("    estimateLeftTime: ").append(toIndentedString(estimateLeftTime)).append("\n");
        sb.append("    resourcePool: ").append(toIndentedString(resourcePool)).append("\n");
        sb.append("    controlGroup: ").append(toIndentedString(controlGroup)).append("\n");
        sb.append("    minPeakMemory: ").append(toIndentedString(minPeakMemory)).append("\n");
        sb.append("    maxPeakMemory: ").append(toIndentedString(maxPeakMemory)).append("\n");
        sb.append("    averagePeakMemory: ").append(toIndentedString(averagePeakMemory)).append("\n");
        sb.append("    memorySkewPercent: ").append(toIndentedString(memorySkewPercent)).append("\n");
        sb.append("    estimateMemory: ").append(toIndentedString(estimateMemory)).append("\n");
        sb.append("    spillInfo: ").append(toIndentedString(spillInfo)).append("\n");
        sb.append("    minSpillSize: ").append(toIndentedString(minSpillSize)).append("\n");
        sb.append("    maxSpillSize: ").append(toIndentedString(maxSpillSize)).append("\n");
        sb.append("    averageSpillSize: ").append(toIndentedString(averageSpillSize)).append("\n");
        sb.append("    spillSkewPercent: ").append(toIndentedString(spillSkewPercent)).append("\n");
        sb.append("    minDnTime: ").append(toIndentedString(minDnTime)).append("\n");
        sb.append("    maxDnTime: ").append(toIndentedString(maxDnTime)).append("\n");
        sb.append("    averageDnTime: ").append(toIndentedString(averageDnTime)).append("\n");
        sb.append("    dntimeSkewPercent: ").append(toIndentedString(dntimeSkewPercent)).append("\n");
        sb.append("    minCpuTime: ").append(toIndentedString(minCpuTime)).append("\n");
        sb.append("    maxCpuTime: ").append(toIndentedString(maxCpuTime)).append("\n");
        sb.append("    totalCpuTime: ").append(toIndentedString(totalCpuTime)).append("\n");
        sb.append("    cpuSkewPercent: ").append(toIndentedString(cpuSkewPercent)).append("\n");
        sb.append("    averagePeakIops: ").append(toIndentedString(averagePeakIops)).append("\n");
        sb.append("    iopsSkewPercent: ").append(toIndentedString(iopsSkewPercent)).append("\n");
        sb.append("    maxPeakIops: ").append(toIndentedString(maxPeakIops)).append("\n");
        sb.append("    minPeakIops: ").append(toIndentedString(minPeakIops)).append("\n");
        sb.append("    queryPlan: ").append(toIndentedString(queryPlan)).append("\n");
        sb.append("    queryStatus: ").append(toIndentedString(queryStatus)).append("\n");
        sb.append("    wlmStatus: ").append(toIndentedString(wlmStatus)).append("\n");
        sb.append("    wlmAttrib: ").append(toIndentedString(wlmAttrib)).append("\n");
        sb.append("    systemQuery: ").append(toIndentedString(systemQuery)).append("\n");
        sb.append("    backendStart: ").append(toIndentedString(backendStart)).append("\n");
        sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
        sb.append("    currXactStart: ").append(toIndentedString(currXactStart)).append("\n");
        sb.append("    stateChange: ").append(toIndentedString(stateChange)).append("\n");
        sb.append("    queryStart: ").append(toIndentedString(queryStart)).append("\n");
        sb.append("    queryElapsedTime: ").append(toIndentedString(queryElapsedTime)).append("\n");
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
