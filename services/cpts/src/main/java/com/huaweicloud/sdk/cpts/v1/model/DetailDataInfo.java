package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** DetailDataInfo */
public class DetailDataInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "averageRespTime")

    private Float averageRespTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgRecBytes")

    private Float avgRecBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgSentBytes")

    private Integer avgSentBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgTranRespTime")

    private String avgTranRespTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "caseUri")

    private String caseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currentThreadNum")

    private Integer currentThreadNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detailId")

    private String detailId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errorCount")

    private Integer errorCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errorEventsCount")

    private Integer errorEventsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedAssert")

    private Integer failedAssert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedOthers")

    private Integer failedOthers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedParsed")

    private Integer failedParsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedRefused")

    private Integer failedRefused;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedTimeout")

    private Integer failedTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAW")

    private Boolean isAW;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Integer max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxRecBytes")

    private Integer maxRecBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxRespTime")

    private Integer maxRespTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxSentBytes")

    private Integer maxSentBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTranRespTime")

    private Integer maxTranRespTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Integer min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requests")

    private Integer requests;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Integer result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "successCount")

    private Integer successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "successRate")

    private Integer successRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum1xx")

    private Integer sum1xx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum2xx")

    private Integer sum2xx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum3xx")

    private Integer sum3xx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum4xx")

    private Integer sum4xx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum5xx")

    private Integer sum5xx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskId")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskProjectId")

    private String taskProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskStatus")

    private Integer taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testCaseUri")

    private String testCaseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp50")

    private Integer tp50;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp75")

    private Integer tp75;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp90")

    private Integer tp90;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp95")

    private Integer tp95;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp99")

    private Integer tp99;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tps")

    private Float tps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tranTPS")

    private String tranTPS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transactionId")

    private String transactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transactionSuccess")

    private String transactionSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transactionalSuccessRate")

    private Integer transactionalSuccessRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transactionalTps")

    private Integer transactionalTps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transactionalTpsSuccess")

    private Integer transactionalTpsSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transactions")

    private String transactions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTime")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vum")

    private Integer vum;

    public DetailDataInfo withAverageRespTime(Float averageRespTime) {
        this.averageRespTime = averageRespTime;
        return this;
    }

    /** averageRespTime
     * 
     * @return averageRespTime */
    public Float getAverageRespTime() {
        return averageRespTime;
    }

    public void setAverageRespTime(Float averageRespTime) {
        this.averageRespTime = averageRespTime;
    }

    public DetailDataInfo withAvgRecBytes(Float avgRecBytes) {
        this.avgRecBytes = avgRecBytes;
        return this;
    }

    /** avgRecBytes
     * 
     * @return avgRecBytes */
    public Float getAvgRecBytes() {
        return avgRecBytes;
    }

    public void setAvgRecBytes(Float avgRecBytes) {
        this.avgRecBytes = avgRecBytes;
    }

    public DetailDataInfo withAvgSentBytes(Integer avgSentBytes) {
        this.avgSentBytes = avgSentBytes;
        return this;
    }

    /** avgSentBytes
     * 
     * @return avgSentBytes */
    public Integer getAvgSentBytes() {
        return avgSentBytes;
    }

    public void setAvgSentBytes(Integer avgSentBytes) {
        this.avgSentBytes = avgSentBytes;
    }

    public DetailDataInfo withAvgTranRespTime(String avgTranRespTime) {
        this.avgTranRespTime = avgTranRespTime;
        return this;
    }

    /** avgTranRespTime
     * 
     * @return avgTranRespTime */
    public String getAvgTranRespTime() {
        return avgTranRespTime;
    }

    public void setAvgTranRespTime(String avgTranRespTime) {
        this.avgTranRespTime = avgTranRespTime;
    }

    public DetailDataInfo withCaseUri(String caseUri) {
        this.caseUri = caseUri;
        return this;
    }

    /** caseUri
     * 
     * @return caseUri */
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

    /** createTime
     * 
     * @return createTime */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public DetailDataInfo withCurrentThreadNum(Integer currentThreadNum) {
        this.currentThreadNum = currentThreadNum;
        return this;
    }

    /** currentThreadNum
     * 
     * @return currentThreadNum */
    public Integer getCurrentThreadNum() {
        return currentThreadNum;
    }

    public void setCurrentThreadNum(Integer currentThreadNum) {
        this.currentThreadNum = currentThreadNum;
    }

    public DetailDataInfo withDetailId(String detailId) {
        this.detailId = detailId;
        return this;
    }

    /** detailId
     * 
     * @return detailId */
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

    /** endTime
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public DetailDataInfo withErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
        return this;
    }

    /** errorCount
     * 
     * @return errorCount */
    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public DetailDataInfo withErrorEventsCount(Integer errorEventsCount) {
        this.errorEventsCount = errorEventsCount;
        return this;
    }

    /** errorEventsCount
     * 
     * @return errorEventsCount */
    public Integer getErrorEventsCount() {
        return errorEventsCount;
    }

    public void setErrorEventsCount(Integer errorEventsCount) {
        this.errorEventsCount = errorEventsCount;
    }

    public DetailDataInfo withFailedAssert(Integer failedAssert) {
        this.failedAssert = failedAssert;
        return this;
    }

    /** failedAssert
     * 
     * @return failedAssert */
    public Integer getFailedAssert() {
        return failedAssert;
    }

    public void setFailedAssert(Integer failedAssert) {
        this.failedAssert = failedAssert;
    }

    public DetailDataInfo withFailedOthers(Integer failedOthers) {
        this.failedOthers = failedOthers;
        return this;
    }

    /** failedOthers
     * 
     * @return failedOthers */
    public Integer getFailedOthers() {
        return failedOthers;
    }

    public void setFailedOthers(Integer failedOthers) {
        this.failedOthers = failedOthers;
    }

    public DetailDataInfo withFailedParsed(Integer failedParsed) {
        this.failedParsed = failedParsed;
        return this;
    }

    /** failedParsed
     * 
     * @return failedParsed */
    public Integer getFailedParsed() {
        return failedParsed;
    }

    public void setFailedParsed(Integer failedParsed) {
        this.failedParsed = failedParsed;
    }

    public DetailDataInfo withFailedRefused(Integer failedRefused) {
        this.failedRefused = failedRefused;
        return this;
    }

    /** failedRefused
     * 
     * @return failedRefused */
    public Integer getFailedRefused() {
        return failedRefused;
    }

    public void setFailedRefused(Integer failedRefused) {
        this.failedRefused = failedRefused;
    }

    public DetailDataInfo withFailedTimeout(Integer failedTimeout) {
        this.failedTimeout = failedTimeout;
        return this;
    }

    /** failedTimeout
     * 
     * @return failedTimeout */
    public Integer getFailedTimeout() {
        return failedTimeout;
    }

    public void setFailedTimeout(Integer failedTimeout) {
        this.failedTimeout = failedTimeout;
    }

    public DetailDataInfo withId(String id) {
        this.id = id;
        return this;
    }

    /** id
     * 
     * @return id */
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

    /** isAW
     * 
     * @return isAW */
    public Boolean getIsAW() {
        return isAW;
    }

    public void setIsAW(Boolean isAW) {
        this.isAW = isAW;
    }

    public DetailDataInfo withMax(Integer max) {
        this.max = max;
        return this;
    }

    /** max
     * 
     * @return max */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public DetailDataInfo withMaxRecBytes(Integer maxRecBytes) {
        this.maxRecBytes = maxRecBytes;
        return this;
    }

    /** maxRecBytes
     * 
     * @return maxRecBytes */
    public Integer getMaxRecBytes() {
        return maxRecBytes;
    }

    public void setMaxRecBytes(Integer maxRecBytes) {
        this.maxRecBytes = maxRecBytes;
    }

    public DetailDataInfo withMaxRespTime(Integer maxRespTime) {
        this.maxRespTime = maxRespTime;
        return this;
    }

    /** maxRespTime
     * 
     * @return maxRespTime */
    public Integer getMaxRespTime() {
        return maxRespTime;
    }

    public void setMaxRespTime(Integer maxRespTime) {
        this.maxRespTime = maxRespTime;
    }

    public DetailDataInfo withMaxSentBytes(Integer maxSentBytes) {
        this.maxSentBytes = maxSentBytes;
        return this;
    }

    /** maxSentBytes
     * 
     * @return maxSentBytes */
    public Integer getMaxSentBytes() {
        return maxSentBytes;
    }

    public void setMaxSentBytes(Integer maxSentBytes) {
        this.maxSentBytes = maxSentBytes;
    }

    public DetailDataInfo withMaxTranRespTime(Integer maxTranRespTime) {
        this.maxTranRespTime = maxTranRespTime;
        return this;
    }

    /** maxTranRespTime
     * 
     * @return maxTranRespTime */
    public Integer getMaxTranRespTime() {
        return maxTranRespTime;
    }

    public void setMaxTranRespTime(Integer maxTranRespTime) {
        this.maxTranRespTime = maxTranRespTime;
    }

    public DetailDataInfo withMin(Integer min) {
        this.min = min;
        return this;
    }

    /** min
     * 
     * @return min */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public DetailDataInfo withName(String name) {
        this.name = name;
        return this;
    }

    /** name
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DetailDataInfo withRequests(Integer requests) {
        this.requests = requests;
        return this;
    }

    /** requests
     * 
     * @return requests */
    public Integer getRequests() {
        return requests;
    }

    public void setRequests(Integer requests) {
        this.requests = requests;
    }

    public DetailDataInfo withResult(Integer result) {
        this.result = result;
        return this;
    }

    /** result
     * 
     * @return result */
    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public DetailDataInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** startTime
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public DetailDataInfo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** status
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public DetailDataInfo withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /** successCount
     * 
     * @return successCount */
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public DetailDataInfo withSuccessRate(Integer successRate) {
        this.successRate = successRate;
        return this;
    }

    /** successRate
     * 
     * @return successRate */
    public Integer getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(Integer successRate) {
        this.successRate = successRate;
    }

    public DetailDataInfo withSum1xx(Integer sum1xx) {
        this.sum1xx = sum1xx;
        return this;
    }

    /** sum1xx
     * 
     * @return sum1xx */
    public Integer getSum1xx() {
        return sum1xx;
    }

    public void setSum1xx(Integer sum1xx) {
        this.sum1xx = sum1xx;
    }

    public DetailDataInfo withSum2xx(Integer sum2xx) {
        this.sum2xx = sum2xx;
        return this;
    }

    /** sum2xx
     * 
     * @return sum2xx */
    public Integer getSum2xx() {
        return sum2xx;
    }

    public void setSum2xx(Integer sum2xx) {
        this.sum2xx = sum2xx;
    }

    public DetailDataInfo withSum3xx(Integer sum3xx) {
        this.sum3xx = sum3xx;
        return this;
    }

    /** sum3xx
     * 
     * @return sum3xx */
    public Integer getSum3xx() {
        return sum3xx;
    }

    public void setSum3xx(Integer sum3xx) {
        this.sum3xx = sum3xx;
    }

    public DetailDataInfo withSum4xx(Integer sum4xx) {
        this.sum4xx = sum4xx;
        return this;
    }

    /** sum4xx
     * 
     * @return sum4xx */
    public Integer getSum4xx() {
        return sum4xx;
    }

    public void setSum4xx(Integer sum4xx) {
        this.sum4xx = sum4xx;
    }

    public DetailDataInfo withSum5xx(Integer sum5xx) {
        this.sum5xx = sum5xx;
        return this;
    }

    /** sum5xx
     * 
     * @return sum5xx */
    public Integer getSum5xx() {
        return sum5xx;
    }

    public void setSum5xx(Integer sum5xx) {
        this.sum5xx = sum5xx;
    }

    public DetailDataInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /** taskId
     * 
     * @return taskId */
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

    /** taskProjectId
     * 
     * @return taskProjectId */
    public String getTaskProjectId() {
        return taskProjectId;
    }

    public void setTaskProjectId(String taskProjectId) {
        this.taskProjectId = taskProjectId;
    }

    public DetailDataInfo withTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /** taskStatus
     * 
     * @return taskStatus */
    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public DetailDataInfo withTestCaseUri(String testCaseUri) {
        this.testCaseUri = testCaseUri;
        return this;
    }

    /** testCaseUri
     * 
     * @return testCaseUri */
    public String getTestCaseUri() {
        return testCaseUri;
    }

    public void setTestCaseUri(String testCaseUri) {
        this.testCaseUri = testCaseUri;
    }

    public DetailDataInfo withTp50(Integer tp50) {
        this.tp50 = tp50;
        return this;
    }

    /** tp50
     * 
     * @return tp50 */
    public Integer getTp50() {
        return tp50;
    }

    public void setTp50(Integer tp50) {
        this.tp50 = tp50;
    }

    public DetailDataInfo withTp75(Integer tp75) {
        this.tp75 = tp75;
        return this;
    }

    /** tp75
     * 
     * @return tp75 */
    public Integer getTp75() {
        return tp75;
    }

    public void setTp75(Integer tp75) {
        this.tp75 = tp75;
    }

    public DetailDataInfo withTp90(Integer tp90) {
        this.tp90 = tp90;
        return this;
    }

    /** tp90
     * 
     * @return tp90 */
    public Integer getTp90() {
        return tp90;
    }

    public void setTp90(Integer tp90) {
        this.tp90 = tp90;
    }

    public DetailDataInfo withTp95(Integer tp95) {
        this.tp95 = tp95;
        return this;
    }

    /** tp95
     * 
     * @return tp95 */
    public Integer getTp95() {
        return tp95;
    }

    public void setTp95(Integer tp95) {
        this.tp95 = tp95;
    }

    public DetailDataInfo withTp99(Integer tp99) {
        this.tp99 = tp99;
        return this;
    }

    /** tp99
     * 
     * @return tp99 */
    public Integer getTp99() {
        return tp99;
    }

    public void setTp99(Integer tp99) {
        this.tp99 = tp99;
    }

    public DetailDataInfo withTps(Float tps) {
        this.tps = tps;
        return this;
    }

    /** tps
     * 
     * @return tps */
    public Float getTps() {
        return tps;
    }

    public void setTps(Float tps) {
        this.tps = tps;
    }

    public DetailDataInfo withTranTPS(String tranTPS) {
        this.tranTPS = tranTPS;
        return this;
    }

    /** tranTPS
     * 
     * @return tranTPS */
    public String getTranTPS() {
        return tranTPS;
    }

    public void setTranTPS(String tranTPS) {
        this.tranTPS = tranTPS;
    }

    public DetailDataInfo withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /** transactionId
     * 
     * @return transactionId */
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public DetailDataInfo withTransactionSuccess(String transactionSuccess) {
        this.transactionSuccess = transactionSuccess;
        return this;
    }

    /** transactionSuccess
     * 
     * @return transactionSuccess */
    public String getTransactionSuccess() {
        return transactionSuccess;
    }

    public void setTransactionSuccess(String transactionSuccess) {
        this.transactionSuccess = transactionSuccess;
    }

    public DetailDataInfo withTransactionalSuccessRate(Integer transactionalSuccessRate) {
        this.transactionalSuccessRate = transactionalSuccessRate;
        return this;
    }

    /** transactionalSuccessRate
     * 
     * @return transactionalSuccessRate */
    public Integer getTransactionalSuccessRate() {
        return transactionalSuccessRate;
    }

    public void setTransactionalSuccessRate(Integer transactionalSuccessRate) {
        this.transactionalSuccessRate = transactionalSuccessRate;
    }

    public DetailDataInfo withTransactionalTps(Integer transactionalTps) {
        this.transactionalTps = transactionalTps;
        return this;
    }

    /** transactionalTps
     * 
     * @return transactionalTps */
    public Integer getTransactionalTps() {
        return transactionalTps;
    }

    public void setTransactionalTps(Integer transactionalTps) {
        this.transactionalTps = transactionalTps;
    }

    public DetailDataInfo withTransactionalTpsSuccess(Integer transactionalTpsSuccess) {
        this.transactionalTpsSuccess = transactionalTpsSuccess;
        return this;
    }

    /** transactionalTpsSuccess
     * 
     * @return transactionalTpsSuccess */
    public Integer getTransactionalTpsSuccess() {
        return transactionalTpsSuccess;
    }

    public void setTransactionalTpsSuccess(Integer transactionalTpsSuccess) {
        this.transactionalTpsSuccess = transactionalTpsSuccess;
    }

    public DetailDataInfo withTransactions(String transactions) {
        this.transactions = transactions;
        return this;
    }

    /** transactions
     * 
     * @return transactions */
    public String getTransactions() {
        return transactions;
    }

    public void setTransactions(String transactions) {
        this.transactions = transactions;
    }

    public DetailDataInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /** updateTime
     * 
     * @return updateTime */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public DetailDataInfo withVum(Integer vum) {
        this.vum = vum;
        return this;
    }

    /** vum
     * 
     * @return vum */
    public Integer getVum() {
        return vum;
    }

    public void setVum(Integer vum) {
        this.vum = vum;
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
            && Objects.equals(this.min, detailDataInfo.min) && Objects.equals(this.name, detailDataInfo.name)
            && Objects.equals(this.requests, detailDataInfo.requests)
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
            && Objects.equals(this.vum, detailDataInfo.vum);
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
            vum);
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
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
