package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DetailDataInfo
 */
public class DetailDataInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "averageRespTime")

    private Double averageRespTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgRecBytes")

    private Double avgRecBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgSentBytes")

    private Double avgSentBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgTranRespTime")

    private Double avgTranRespTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "caseUri")

    private String caseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currentThreadNum")

    private Double currentThreadNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detailId")

    private String detailId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errorCount")

    private Double errorCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errorEventsCount")

    private Double errorEventsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedAssert")

    private Double failedAssert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedOthers")

    private Double failedOthers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedParsed")

    private Double failedParsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedRefused")

    private Double failedRefused;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedTimeout")

    private Double failedTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAW")

    private Boolean isAW;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Double max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxRecBytes")

    private Double maxRecBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxRespTime")

    private Double maxRespTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxSentBytes")

    private Double maxSentBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTranRespTime")

    private Double maxTranRespTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Double min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minNetworkTraffic")

    private Double minNetworkTraffic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requests")

    private Double requests;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Double result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Double status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "successCount")

    private Double successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "successRate")

    private Double successRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum1xx")

    private Double sum1xx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum2xx")

    private Double sum2xx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum3xx")

    private Double sum3xx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum4xx")

    private Double sum4xx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum5xx")

    private Double sum5xx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskId")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskProjectId")

    private String taskProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskStatus")

    private Double taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testCaseUri")

    private String testCaseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp50")

    private Double tp50;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp75")

    private Double tp75;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp90")

    private Double tp90;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp95")

    private Double tp95;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp99")

    private Double tp99;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tps")

    private Double tps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tranTPS")

    private Double tranTPS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transactionId")

    private String transactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transactionSuccess")

    private Double transactionSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transactionalSuccessRate")

    private Double transactionalSuccessRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transactionalTps")

    private Double transactionalTps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transactionalTpsSuccess")

    private Double transactionalTpsSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transactions")

    private Double transactions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTime")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vum")

    private Double vum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgNetworkTraffic")

    private Double avgNetworkTraffic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxNetworkTraffic")

    private Double maxNetworkTraffic;

    public DetailDataInfo withAverageRespTime(Double averageRespTime) {
        this.averageRespTime = averageRespTime;
        return this;
    }

    /**
     * 平均响应时间
     * @return averageRespTime
     */
    public Double getAverageRespTime() {
        return averageRespTime;
    }

    public void setAverageRespTime(Double averageRespTime) {
        this.averageRespTime = averageRespTime;
    }

    public DetailDataInfo withAvgRecBytes(Double avgRecBytes) {
        this.avgRecBytes = avgRecBytes;
        return this;
    }

    /**
     * 平均接收字节数
     * @return avgRecBytes
     */
    public Double getAvgRecBytes() {
        return avgRecBytes;
    }

    public void setAvgRecBytes(Double avgRecBytes) {
        this.avgRecBytes = avgRecBytes;
    }

    public DetailDataInfo withAvgSentBytes(Double avgSentBytes) {
        this.avgSentBytes = avgSentBytes;
        return this;
    }

    /**
     * 平均发送字节数
     * @return avgSentBytes
     */
    public Double getAvgSentBytes() {
        return avgSentBytes;
    }

    public void setAvgSentBytes(Double avgSentBytes) {
        this.avgSentBytes = avgSentBytes;
    }

    public DetailDataInfo withAvgTranRespTime(Double avgTranRespTime) {
        this.avgTranRespTime = avgTranRespTime;
        return this;
    }

    /**
     * 事务平均响应时间
     * @return avgTranRespTime
     */
    public Double getAvgTranRespTime() {
        return avgTranRespTime;
    }

    public void setAvgTranRespTime(Double avgTranRespTime) {
        this.avgTranRespTime = avgTranRespTime;
    }

    public DetailDataInfo withCaseUri(String caseUri) {
        this.caseUri = caseUri;
        return this;
    }

    /**
     * 用例Uri
     * @return caseUri
     */
    public String getCaseUri() {
        return caseUri;
    }

    public void setCaseUri(String caseUri) {
        this.caseUri = caseUri;
    }

    public DetailDataInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public DetailDataInfo withCurrentThreadNum(Double currentThreadNum) {
        this.currentThreadNum = currentThreadNum;
        return this;
    }

    /**
     * 最大并发数
     * @return currentThreadNum
     */
    public Double getCurrentThreadNum() {
        return currentThreadNum;
    }

    public void setCurrentThreadNum(Double currentThreadNum) {
        this.currentThreadNum = currentThreadNum;
    }

    public DetailDataInfo withDetailId(String detailId) {
        this.detailId = detailId;
        return this;
    }

    /**
     * 详情id
     * @return detailId
     */
    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public DetailDataInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public DetailDataInfo withErrorCount(Double errorCount) {
        this.errorCount = errorCount;
        return this;
    }

    /**
     * 失败请求数
     * @return errorCount
     */
    public Double getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Double errorCount) {
        this.errorCount = errorCount;
    }

    public DetailDataInfo withErrorEventsCount(Double errorEventsCount) {
        this.errorEventsCount = errorEventsCount;
        return this;
    }

    /**
     * ERROR级别的事件个数
     * @return errorEventsCount
     */
    public Double getErrorEventsCount() {
        return errorEventsCount;
    }

    public void setErrorEventsCount(Double errorEventsCount) {
        this.errorEventsCount = errorEventsCount;
    }

    public DetailDataInfo withFailedAssert(Double failedAssert) {
        this.failedAssert = failedAssert;
        return this;
    }

    /**
     * 断言失败
     * @return failedAssert
     */
    public Double getFailedAssert() {
        return failedAssert;
    }

    public void setFailedAssert(Double failedAssert) {
        this.failedAssert = failedAssert;
    }

    public DetailDataInfo withFailedOthers(Double failedOthers) {
        this.failedOthers = failedOthers;
        return this;
    }

    /**
     * 其他失败
     * @return failedOthers
     */
    public Double getFailedOthers() {
        return failedOthers;
    }

    public void setFailedOthers(Double failedOthers) {
        this.failedOthers = failedOthers;
    }

    public DetailDataInfo withFailedParsed(Double failedParsed) {
        this.failedParsed = failedParsed;
        return this;
    }

    /**
     * 解析失败
     * @return failedParsed
     */
    public Double getFailedParsed() {
        return failedParsed;
    }

    public void setFailedParsed(Double failedParsed) {
        this.failedParsed = failedParsed;
    }

    public DetailDataInfo withFailedRefused(Double failedRefused) {
        this.failedRefused = failedRefused;
        return this;
    }

    /**
     * 连接被拒
     * @return failedRefused
     */
    public Double getFailedRefused() {
        return failedRefused;
    }

    public void setFailedRefused(Double failedRefused) {
        this.failedRefused = failedRefused;
    }

    public DetailDataInfo withFailedTimeout(Double failedTimeout) {
        this.failedTimeout = failedTimeout;
        return this;
    }

    /**
     * 超时失败
     * @return failedTimeout
     */
    public Double getFailedTimeout() {
        return failedTimeout;
    }

    public void setFailedTimeout(Double failedTimeout) {
        this.failedTimeout = failedTimeout;
    }

    public DetailDataInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DetailDataInfo withIsAW(Boolean isAW) {
        this.isAW = isAW;
        return this;
    }

    /**
     * 是否aw
     * @return isAW
     */
    public Boolean getIsAW() {
        return isAW;
    }

    public void setIsAW(Boolean isAW) {
        this.isAW = isAW;
    }

    public DetailDataInfo withMax(Double max) {
        this.max = max;
        return this;
    }

    /**
     * 最大响应时间
     * @return max
     */
    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public DetailDataInfo withMaxRecBytes(Double maxRecBytes) {
        this.maxRecBytes = maxRecBytes;
        return this;
    }

    /**
     * 最大接收字节数
     * @return maxRecBytes
     */
    public Double getMaxRecBytes() {
        return maxRecBytes;
    }

    public void setMaxRecBytes(Double maxRecBytes) {
        this.maxRecBytes = maxRecBytes;
    }

    public DetailDataInfo withMaxRespTime(Double maxRespTime) {
        this.maxRespTime = maxRespTime;
        return this;
    }

    /**
     * 探底最大响应时间
     * @return maxRespTime
     */
    public Double getMaxRespTime() {
        return maxRespTime;
    }

    public void setMaxRespTime(Double maxRespTime) {
        this.maxRespTime = maxRespTime;
    }

    public DetailDataInfo withMaxSentBytes(Double maxSentBytes) {
        this.maxSentBytes = maxSentBytes;
        return this;
    }

    /**
     * 最大发送字节数
     * @return maxSentBytes
     */
    public Double getMaxSentBytes() {
        return maxSentBytes;
    }

    public void setMaxSentBytes(Double maxSentBytes) {
        this.maxSentBytes = maxSentBytes;
    }

    public DetailDataInfo withMaxTranRespTime(Double maxTranRespTime) {
        this.maxTranRespTime = maxTranRespTime;
        return this;
    }

    /**
     * 事务最大响应时间
     * @return maxTranRespTime
     */
    public Double getMaxTranRespTime() {
        return maxTranRespTime;
    }

    public void setMaxTranRespTime(Double maxTranRespTime) {
        this.maxTranRespTime = maxTranRespTime;
    }

    public DetailDataInfo withMin(Double min) {
        this.min = min;
        return this;
    }

    /**
     * 最小响应时间
     * @return min
     */
    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public DetailDataInfo withMinNetworkTraffic(Double minNetworkTraffic) {
        this.minNetworkTraffic = minNetworkTraffic;
        return this;
    }

    /**
     * 最小带宽
     * @return minNetworkTraffic
     */
    public Double getMinNetworkTraffic() {
        return minNetworkTraffic;
    }

    public void setMinNetworkTraffic(Double minNetworkTraffic) {
        this.minNetworkTraffic = minNetworkTraffic;
    }

    public DetailDataInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DetailDataInfo withRequests(Double requests) {
        this.requests = requests;
        return this;
    }

    /**
     * 请求数
     * @return requests
     */
    public Double getRequests() {
        return requests;
    }

    public void setRequests(Double requests) {
        this.requests = requests;
    }

    public DetailDataInfo withResult(Double result) {
        this.result = result;
        return this;
    }

    /**
     * aw执行结果
     * @return result
     */
    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public DetailDataInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public DetailDataInfo withStatus(Double status) {
        this.status = status;
        return this;
    }

    /**
     * 用例状态
     * @return status
     */
    public Double getStatus() {
        return status;
    }

    public void setStatus(Double status) {
        this.status = status;
    }

    public DetailDataInfo withSuccessCount(Double successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * 成功请求数
     * @return successCount
     */
    public Double getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Double successCount) {
        this.successCount = successCount;
    }

    public DetailDataInfo withSuccessRate(Double successRate) {
        this.successRate = successRate;
        return this;
    }

    /**
     * 成功率
     * @return successRate
     */
    public Double getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(Double successRate) {
        this.successRate = successRate;
    }

    public DetailDataInfo withSum1xx(Double sum1xx) {
        this.sum1xx = sum1xx;
        return this;
    }

    /**
     * 1xx请求数
     * @return sum1xx
     */
    public Double getSum1xx() {
        return sum1xx;
    }

    public void setSum1xx(Double sum1xx) {
        this.sum1xx = sum1xx;
    }

    public DetailDataInfo withSum2xx(Double sum2xx) {
        this.sum2xx = sum2xx;
        return this;
    }

    /**
     * 2xx请求数
     * @return sum2xx
     */
    public Double getSum2xx() {
        return sum2xx;
    }

    public void setSum2xx(Double sum2xx) {
        this.sum2xx = sum2xx;
    }

    public DetailDataInfo withSum3xx(Double sum3xx) {
        this.sum3xx = sum3xx;
        return this;
    }

    /**
     * 3xx请求数
     * @return sum3xx
     */
    public Double getSum3xx() {
        return sum3xx;
    }

    public void setSum3xx(Double sum3xx) {
        this.sum3xx = sum3xx;
    }

    public DetailDataInfo withSum4xx(Double sum4xx) {
        this.sum4xx = sum4xx;
        return this;
    }

    /**
     * 4xx请求数
     * @return sum4xx
     */
    public Double getSum4xx() {
        return sum4xx;
    }

    public void setSum4xx(Double sum4xx) {
        this.sum4xx = sum4xx;
    }

    public DetailDataInfo withSum5xx(Double sum5xx) {
        this.sum5xx = sum5xx;
        return this;
    }

    /**
     * 5xx请求数
     * @return sum5xx
     */
    public Double getSum5xx() {
        return sum5xx;
    }

    public void setSum5xx(Double sum5xx) {
        this.sum5xx = sum5xx;
    }

    public DetailDataInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id_轮次
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public DetailDataInfo withTaskProjectId(String taskProjectId) {
        this.taskProjectId = taskProjectId;
        return this;
    }

    /**
     * 任务id
     * @return taskProjectId
     */
    public String getTaskProjectId() {
        return taskProjectId;
    }

    public void setTaskProjectId(String taskProjectId) {
        this.taskProjectId = taskProjectId;
    }

    public DetailDataInfo withTaskStatus(Double taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态
     * @return taskStatus
     */
    public Double getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Double taskStatus) {
        this.taskStatus = taskStatus;
    }

    public DetailDataInfo withTestCaseUri(String testCaseUri) {
        this.testCaseUri = testCaseUri;
        return this;
    }

    /**
     * 用例uri
     * @return testCaseUri
     */
    public String getTestCaseUri() {
        return testCaseUri;
    }

    public void setTestCaseUri(String testCaseUri) {
        this.testCaseUri = testCaseUri;
    }

    public DetailDataInfo withTp50(Double tp50) {
        this.tp50 = tp50;
        return this;
    }

    /**
     * tp50
     * @return tp50
     */
    public Double getTp50() {
        return tp50;
    }

    public void setTp50(Double tp50) {
        this.tp50 = tp50;
    }

    public DetailDataInfo withTp75(Double tp75) {
        this.tp75 = tp75;
        return this;
    }

    /**
     * tp75
     * @return tp75
     */
    public Double getTp75() {
        return tp75;
    }

    public void setTp75(Double tp75) {
        this.tp75 = tp75;
    }

    public DetailDataInfo withTp90(Double tp90) {
        this.tp90 = tp90;
        return this;
    }

    /**
     * tp90
     * @return tp90
     */
    public Double getTp90() {
        return tp90;
    }

    public void setTp90(Double tp90) {
        this.tp90 = tp90;
    }

    public DetailDataInfo withTp95(Double tp95) {
        this.tp95 = tp95;
        return this;
    }

    /**
     * tp95
     * @return tp95
     */
    public Double getTp95() {
        return tp95;
    }

    public void setTp95(Double tp95) {
        this.tp95 = tp95;
    }

    public DetailDataInfo withTp99(Double tp99) {
        this.tp99 = tp99;
        return this;
    }

    /**
     * tp99
     * @return tp99
     */
    public Double getTp99() {
        return tp99;
    }

    public void setTp99(Double tp99) {
        this.tp99 = tp99;
    }

    public DetailDataInfo withTps(Double tps) {
        this.tps = tps;
        return this;
    }

    /**
     * tps
     * @return tps
     */
    public Double getTps() {
        return tps;
    }

    public void setTps(Double tps) {
        this.tps = tps;
    }

    public DetailDataInfo withTranTPS(Double tranTPS) {
        this.tranTPS = tranTPS;
        return this;
    }

    /**
     * 事务tps
     * @return tranTPS
     */
    public Double getTranTPS() {
        return tranTPS;
    }

    public void setTranTPS(Double tranTPS) {
        this.tranTPS = tranTPS;
    }

    public DetailDataInfo withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * 事务id
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public DetailDataInfo withTransactionSuccess(Double transactionSuccess) {
        this.transactionSuccess = transactionSuccess;
        return this;
    }

    /**
     * 事务成功率
     * @return transactionSuccess
     */
    public Double getTransactionSuccess() {
        return transactionSuccess;
    }

    public void setTransactionSuccess(Double transactionSuccess) {
        this.transactionSuccess = transactionSuccess;
    }

    public DetailDataInfo withTransactionalSuccessRate(Double transactionalSuccessRate) {
        this.transactionalSuccessRate = transactionalSuccessRate;
        return this;
    }

    /**
     * 事务成功率
     * @return transactionalSuccessRate
     */
    public Double getTransactionalSuccessRate() {
        return transactionalSuccessRate;
    }

    public void setTransactionalSuccessRate(Double transactionalSuccessRate) {
        this.transactionalSuccessRate = transactionalSuccessRate;
    }

    public DetailDataInfo withTransactionalTps(Double transactionalTps) {
        this.transactionalTps = transactionalTps;
        return this;
    }

    /**
     * 自定义事务tps
     * @return transactionalTps
     */
    public Double getTransactionalTps() {
        return transactionalTps;
    }

    public void setTransactionalTps(Double transactionalTps) {
        this.transactionalTps = transactionalTps;
    }

    public DetailDataInfo withTransactionalTpsSuccess(Double transactionalTpsSuccess) {
        this.transactionalTpsSuccess = transactionalTpsSuccess;
        return this;
    }

    /**
     * 自定义事务成功率
     * @return transactionalTpsSuccess
     */
    public Double getTransactionalTpsSuccess() {
        return transactionalTpsSuccess;
    }

    public void setTransactionalTpsSuccess(Double transactionalTpsSuccess) {
        this.transactionalTpsSuccess = transactionalTpsSuccess;
    }

    public DetailDataInfo withTransactions(Double transactions) {
        this.transactions = transactions;
        return this;
    }

    /**
     * 事务数
     * @return transactions
     */
    public Double getTransactions() {
        return transactions;
    }

    public void setTransactions(Double transactions) {
        this.transactions = transactions;
    }

    public DetailDataInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public DetailDataInfo withVum(Double vum) {
        this.vum = vum;
        return this;
    }

    /**
     * 分钟*并发数
     * @return vum
     */
    public Double getVum() {
        return vum;
    }

    public void setVum(Double vum) {
        this.vum = vum;
    }

    public DetailDataInfo withAvgNetworkTraffic(Double avgNetworkTraffic) {
        this.avgNetworkTraffic = avgNetworkTraffic;
        return this;
    }

    /**
     * 平均带宽
     * @return avgNetworkTraffic
     */
    public Double getAvgNetworkTraffic() {
        return avgNetworkTraffic;
    }

    public void setAvgNetworkTraffic(Double avgNetworkTraffic) {
        this.avgNetworkTraffic = avgNetworkTraffic;
    }

    public DetailDataInfo withMaxNetworkTraffic(Double maxNetworkTraffic) {
        this.maxNetworkTraffic = maxNetworkTraffic;
        return this;
    }

    /**
     * 最大带宽
     * @return maxNetworkTraffic
     */
    public Double getMaxNetworkTraffic() {
        return maxNetworkTraffic;
    }

    public void setMaxNetworkTraffic(Double maxNetworkTraffic) {
        this.maxNetworkTraffic = maxNetworkTraffic;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DetailDataInfo detailDataInfo = (DetailDataInfo) o;
        return Objects.equals(this.averageRespTime, detailDataInfo.averageRespTime)
            && Objects.equals(this.avgRecBytes, detailDataInfo.avgRecBytes)
            && Objects.equals(this.avgSentBytes, detailDataInfo.avgSentBytes)
            && Objects.equals(this.avgTranRespTime, detailDataInfo.avgTranRespTime)
            && Objects.equals(this.caseUri, detailDataInfo.caseUri)
            && Objects.equals(this.createTime, detailDataInfo.createTime)
            && Objects.equals(this.currentThreadNum, detailDataInfo.currentThreadNum)
            && Objects.equals(this.detailId, detailDataInfo.detailId)
            && Objects.equals(this.endTime, detailDataInfo.endTime)
            && Objects.equals(this.errorCount, detailDataInfo.errorCount)
            && Objects.equals(this.errorEventsCount, detailDataInfo.errorEventsCount)
            && Objects.equals(this.failedAssert, detailDataInfo.failedAssert)
            && Objects.equals(this.failedOthers, detailDataInfo.failedOthers)
            && Objects.equals(this.failedParsed, detailDataInfo.failedParsed)
            && Objects.equals(this.failedRefused, detailDataInfo.failedRefused)
            && Objects.equals(this.failedTimeout, detailDataInfo.failedTimeout)
            && Objects.equals(this.id, detailDataInfo.id) && Objects.equals(this.isAW, detailDataInfo.isAW)
            && Objects.equals(this.max, detailDataInfo.max)
            && Objects.equals(this.maxRecBytes, detailDataInfo.maxRecBytes)
            && Objects.equals(this.maxRespTime, detailDataInfo.maxRespTime)
            && Objects.equals(this.maxSentBytes, detailDataInfo.maxSentBytes)
            && Objects.equals(this.maxTranRespTime, detailDataInfo.maxTranRespTime)
            && Objects.equals(this.min, detailDataInfo.min)
            && Objects.equals(this.minNetworkTraffic, detailDataInfo.minNetworkTraffic)
            && Objects.equals(this.name, detailDataInfo.name) && Objects.equals(this.requests, detailDataInfo.requests)
            && Objects.equals(this.result, detailDataInfo.result)
            && Objects.equals(this.startTime, detailDataInfo.startTime)
            && Objects.equals(this.status, detailDataInfo.status)
            && Objects.equals(this.successCount, detailDataInfo.successCount)
            && Objects.equals(this.successRate, detailDataInfo.successRate)
            && Objects.equals(this.sum1xx, detailDataInfo.sum1xx) && Objects.equals(this.sum2xx, detailDataInfo.sum2xx)
            && Objects.equals(this.sum3xx, detailDataInfo.sum3xx) && Objects.equals(this.sum4xx, detailDataInfo.sum4xx)
            && Objects.equals(this.sum5xx, detailDataInfo.sum5xx) && Objects.equals(this.taskId, detailDataInfo.taskId)
            && Objects.equals(this.taskProjectId, detailDataInfo.taskProjectId)
            && Objects.equals(this.taskStatus, detailDataInfo.taskStatus)
            && Objects.equals(this.testCaseUri, detailDataInfo.testCaseUri)
            && Objects.equals(this.tp50, detailDataInfo.tp50) && Objects.equals(this.tp75, detailDataInfo.tp75)
            && Objects.equals(this.tp90, detailDataInfo.tp90) && Objects.equals(this.tp95, detailDataInfo.tp95)
            && Objects.equals(this.tp99, detailDataInfo.tp99) && Objects.equals(this.tps, detailDataInfo.tps)
            && Objects.equals(this.tranTPS, detailDataInfo.tranTPS)
            && Objects.equals(this.transactionId, detailDataInfo.transactionId)
            && Objects.equals(this.transactionSuccess, detailDataInfo.transactionSuccess)
            && Objects.equals(this.transactionalSuccessRate, detailDataInfo.transactionalSuccessRate)
            && Objects.equals(this.transactionalTps, detailDataInfo.transactionalTps)
            && Objects.equals(this.transactionalTpsSuccess, detailDataInfo.transactionalTpsSuccess)
            && Objects.equals(this.transactions, detailDataInfo.transactions)
            && Objects.equals(this.updateTime, detailDataInfo.updateTime)
            && Objects.equals(this.vum, detailDataInfo.vum)
            && Objects.equals(this.avgNetworkTraffic, detailDataInfo.avgNetworkTraffic)
            && Objects.equals(this.maxNetworkTraffic, detailDataInfo.maxNetworkTraffic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(averageRespTime,
            avgRecBytes,
            avgSentBytes,
            avgTranRespTime,
            caseUri,
            createTime,
            currentThreadNum,
            detailId,
            endTime,
            errorCount,
            errorEventsCount,
            failedAssert,
            failedOthers,
            failedParsed,
            failedRefused,
            failedTimeout,
            id,
            isAW,
            max,
            maxRecBytes,
            maxRespTime,
            maxSentBytes,
            maxTranRespTime,
            min,
            minNetworkTraffic,
            name,
            requests,
            result,
            startTime,
            status,
            successCount,
            successRate,
            sum1xx,
            sum2xx,
            sum3xx,
            sum4xx,
            sum5xx,
            taskId,
            taskProjectId,
            taskStatus,
            testCaseUri,
            tp50,
            tp75,
            tp90,
            tp95,
            tp99,
            tps,
            tranTPS,
            transactionId,
            transactionSuccess,
            transactionalSuccessRate,
            transactionalTps,
            transactionalTpsSuccess,
            transactions,
            updateTime,
            vum,
            avgNetworkTraffic,
            maxNetworkTraffic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetailDataInfo {\n");
        sb.append("    averageRespTime: ").append(toIndentedString(averageRespTime)).append("\n");
        sb.append("    avgRecBytes: ").append(toIndentedString(avgRecBytes)).append("\n");
        sb.append("    avgSentBytes: ").append(toIndentedString(avgSentBytes)).append("\n");
        sb.append("    avgTranRespTime: ").append(toIndentedString(avgTranRespTime)).append("\n");
        sb.append("    caseUri: ").append(toIndentedString(caseUri)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    currentThreadNum: ").append(toIndentedString(currentThreadNum)).append("\n");
        sb.append("    detailId: ").append(toIndentedString(detailId)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
        sb.append("    errorEventsCount: ").append(toIndentedString(errorEventsCount)).append("\n");
        sb.append("    failedAssert: ").append(toIndentedString(failedAssert)).append("\n");
        sb.append("    failedOthers: ").append(toIndentedString(failedOthers)).append("\n");
        sb.append("    failedParsed: ").append(toIndentedString(failedParsed)).append("\n");
        sb.append("    failedRefused: ").append(toIndentedString(failedRefused)).append("\n");
        sb.append("    failedTimeout: ").append(toIndentedString(failedTimeout)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isAW: ").append(toIndentedString(isAW)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    maxRecBytes: ").append(toIndentedString(maxRecBytes)).append("\n");
        sb.append("    maxRespTime: ").append(toIndentedString(maxRespTime)).append("\n");
        sb.append("    maxSentBytes: ").append(toIndentedString(maxSentBytes)).append("\n");
        sb.append("    maxTranRespTime: ").append(toIndentedString(maxTranRespTime)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    minNetworkTraffic: ").append(toIndentedString(minNetworkTraffic)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
        sb.append("    sum1xx: ").append(toIndentedString(sum1xx)).append("\n");
        sb.append("    sum2xx: ").append(toIndentedString(sum2xx)).append("\n");
        sb.append("    sum3xx: ").append(toIndentedString(sum3xx)).append("\n");
        sb.append("    sum4xx: ").append(toIndentedString(sum4xx)).append("\n");
        sb.append("    sum5xx: ").append(toIndentedString(sum5xx)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskProjectId: ").append(toIndentedString(taskProjectId)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    testCaseUri: ").append(toIndentedString(testCaseUri)).append("\n");
        sb.append("    tp50: ").append(toIndentedString(tp50)).append("\n");
        sb.append("    tp75: ").append(toIndentedString(tp75)).append("\n");
        sb.append("    tp90: ").append(toIndentedString(tp90)).append("\n");
        sb.append("    tp95: ").append(toIndentedString(tp95)).append("\n");
        sb.append("    tp99: ").append(toIndentedString(tp99)).append("\n");
        sb.append("    tps: ").append(toIndentedString(tps)).append("\n");
        sb.append("    tranTPS: ").append(toIndentedString(tranTPS)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    transactionSuccess: ").append(toIndentedString(transactionSuccess)).append("\n");
        sb.append("    transactionalSuccessRate: ").append(toIndentedString(transactionalSuccessRate)).append("\n");
        sb.append("    transactionalTps: ").append(toIndentedString(transactionalTps)).append("\n");
        sb.append("    transactionalTpsSuccess: ").append(toIndentedString(transactionalTpsSuccess)).append("\n");
        sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    vum: ").append(toIndentedString(vum)).append("\n");
        sb.append("    avgNetworkTraffic: ").append(toIndentedString(avgNetworkTraffic)).append("\n");
        sb.append("    maxNetworkTraffic: ").append(toIndentedString(maxNetworkTraffic)).append("\n");
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
