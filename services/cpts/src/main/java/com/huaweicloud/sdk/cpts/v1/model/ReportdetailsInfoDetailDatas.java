package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ReportdetailsInfoDetailDatas */
public class ReportdetailsInfoDetailDatas {

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

    public ReportdetailsInfoDetailDatas withAverageRespTime(Float averageRespTime) {
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

    public ReportdetailsInfoDetailDatas withAvgRecBytes(Float avgRecBytes) {
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

    public ReportdetailsInfoDetailDatas withAvgSentBytes(Integer avgSentBytes) {
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

    public ReportdetailsInfoDetailDatas withAvgTranRespTime(String avgTranRespTime) {
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

    public ReportdetailsInfoDetailDatas withCaseUri(String caseUri) {
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

    public ReportdetailsInfoDetailDatas withCreateTime(String createTime) {
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

    public ReportdetailsInfoDetailDatas withCurrentThreadNum(Integer currentThreadNum) {
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

    public ReportdetailsInfoDetailDatas withDetailId(String detailId) {
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

    public ReportdetailsInfoDetailDatas withEndTime(String endTime) {
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

    public ReportdetailsInfoDetailDatas withErrorCount(Integer errorCount) {
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

    public ReportdetailsInfoDetailDatas withErrorEventsCount(Integer errorEventsCount) {
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

    public ReportdetailsInfoDetailDatas withFailedAssert(Integer failedAssert) {
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

    public ReportdetailsInfoDetailDatas withFailedOthers(Integer failedOthers) {
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

    public ReportdetailsInfoDetailDatas withFailedParsed(Integer failedParsed) {
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

    public ReportdetailsInfoDetailDatas withFailedRefused(Integer failedRefused) {
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

    public ReportdetailsInfoDetailDatas withFailedTimeout(Integer failedTimeout) {
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

    public ReportdetailsInfoDetailDatas withId(String id) {
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

    public ReportdetailsInfoDetailDatas withIsAW(Boolean isAW) {
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

    public ReportdetailsInfoDetailDatas withMax(Integer max) {
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

    public ReportdetailsInfoDetailDatas withMaxRecBytes(Integer maxRecBytes) {
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

    public ReportdetailsInfoDetailDatas withMaxRespTime(Integer maxRespTime) {
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

    public ReportdetailsInfoDetailDatas withMaxSentBytes(Integer maxSentBytes) {
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

    public ReportdetailsInfoDetailDatas withMaxTranRespTime(Integer maxTranRespTime) {
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

    public ReportdetailsInfoDetailDatas withMin(Integer min) {
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

    public ReportdetailsInfoDetailDatas withName(String name) {
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

    public ReportdetailsInfoDetailDatas withRequests(Integer requests) {
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

    public ReportdetailsInfoDetailDatas withResult(Integer result) {
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

    public ReportdetailsInfoDetailDatas withStartTime(String startTime) {
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

    public ReportdetailsInfoDetailDatas withStatus(Integer status) {
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

    public ReportdetailsInfoDetailDatas withSuccessCount(Integer successCount) {
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

    public ReportdetailsInfoDetailDatas withSuccessRate(Integer successRate) {
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

    public ReportdetailsInfoDetailDatas withSum1xx(Integer sum1xx) {
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

    public ReportdetailsInfoDetailDatas withSum2xx(Integer sum2xx) {
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

    public ReportdetailsInfoDetailDatas withSum3xx(Integer sum3xx) {
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

    public ReportdetailsInfoDetailDatas withSum4xx(Integer sum4xx) {
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

    public ReportdetailsInfoDetailDatas withSum5xx(Integer sum5xx) {
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

    public ReportdetailsInfoDetailDatas withTaskId(String taskId) {
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

    public ReportdetailsInfoDetailDatas withTaskProjectId(String taskProjectId) {
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

    public ReportdetailsInfoDetailDatas withTaskStatus(Integer taskStatus) {
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

    public ReportdetailsInfoDetailDatas withTestCaseUri(String testCaseUri) {
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

    public ReportdetailsInfoDetailDatas withTp50(Integer tp50) {
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

    public ReportdetailsInfoDetailDatas withTp75(Integer tp75) {
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

    public ReportdetailsInfoDetailDatas withTp90(Integer tp90) {
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

    public ReportdetailsInfoDetailDatas withTp95(Integer tp95) {
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

    public ReportdetailsInfoDetailDatas withTp99(Integer tp99) {
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

    public ReportdetailsInfoDetailDatas withTps(Float tps) {
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

    public ReportdetailsInfoDetailDatas withTranTPS(String tranTPS) {
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

    public ReportdetailsInfoDetailDatas withTransactionId(String transactionId) {
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

    public ReportdetailsInfoDetailDatas withTransactionSuccess(String transactionSuccess) {
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

    public ReportdetailsInfoDetailDatas withTransactionalSuccessRate(Integer transactionalSuccessRate) {
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

    public ReportdetailsInfoDetailDatas withTransactionalTps(Integer transactionalTps) {
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

    public ReportdetailsInfoDetailDatas withTransactionalTpsSuccess(Integer transactionalTpsSuccess) {
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

    public ReportdetailsInfoDetailDatas withTransactions(String transactions) {
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

    public ReportdetailsInfoDetailDatas withUpdateTime(String updateTime) {
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

    public ReportdetailsInfoDetailDatas withVum(Integer vum) {
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
        ReportdetailsInfoDetailDatas reportdetailsInfoDetailDatas = (ReportdetailsInfoDetailDatas) o;
        return Objects.equals(this.averageRespTime, reportdetailsInfoDetailDatas.averageRespTime)
            && Objects.equals(this.avgRecBytes, reportdetailsInfoDetailDatas.avgRecBytes)
            && Objects.equals(this.avgSentBytes, reportdetailsInfoDetailDatas.avgSentBytes)
            && Objects.equals(this.avgTranRespTime, reportdetailsInfoDetailDatas.avgTranRespTime)
            && Objects.equals(this.caseUri, reportdetailsInfoDetailDatas.caseUri)
            && Objects.equals(this.createTime, reportdetailsInfoDetailDatas.createTime)
            && Objects.equals(this.currentThreadNum, reportdetailsInfoDetailDatas.currentThreadNum)
            && Objects.equals(this.detailId, reportdetailsInfoDetailDatas.detailId)
            && Objects.equals(this.endTime, reportdetailsInfoDetailDatas.endTime)
            && Objects.equals(this.errorCount, reportdetailsInfoDetailDatas.errorCount)
            && Objects.equals(this.errorEventsCount, reportdetailsInfoDetailDatas.errorEventsCount)
            && Objects.equals(this.failedAssert, reportdetailsInfoDetailDatas.failedAssert)
            && Objects.equals(this.failedOthers, reportdetailsInfoDetailDatas.failedOthers)
            && Objects.equals(this.failedParsed, reportdetailsInfoDetailDatas.failedParsed)
            && Objects.equals(this.failedRefused, reportdetailsInfoDetailDatas.failedRefused)
            && Objects.equals(this.failedTimeout, reportdetailsInfoDetailDatas.failedTimeout)
            && Objects.equals(this.id, reportdetailsInfoDetailDatas.id)
            && Objects.equals(this.isAW, reportdetailsInfoDetailDatas.isAW)
            && Objects.equals(this.max, reportdetailsInfoDetailDatas.max)
            && Objects.equals(this.maxRecBytes, reportdetailsInfoDetailDatas.maxRecBytes)
            && Objects.equals(this.maxRespTime, reportdetailsInfoDetailDatas.maxRespTime)
            && Objects.equals(this.maxSentBytes, reportdetailsInfoDetailDatas.maxSentBytes)
            && Objects.equals(this.maxTranRespTime, reportdetailsInfoDetailDatas.maxTranRespTime)
            && Objects.equals(this.min, reportdetailsInfoDetailDatas.min)
            && Objects.equals(this.name, reportdetailsInfoDetailDatas.name)
            && Objects.equals(this.requests, reportdetailsInfoDetailDatas.requests)
            && Objects.equals(this.result, reportdetailsInfoDetailDatas.result)
            && Objects.equals(this.startTime, reportdetailsInfoDetailDatas.startTime)
            && Objects.equals(this.status, reportdetailsInfoDetailDatas.status)
            && Objects.equals(this.successCount, reportdetailsInfoDetailDatas.successCount)
            && Objects.equals(this.successRate, reportdetailsInfoDetailDatas.successRate)
            && Objects.equals(this.sum1xx, reportdetailsInfoDetailDatas.sum1xx)
            && Objects.equals(this.sum2xx, reportdetailsInfoDetailDatas.sum2xx)
            && Objects.equals(this.sum3xx, reportdetailsInfoDetailDatas.sum3xx)
            && Objects.equals(this.sum4xx, reportdetailsInfoDetailDatas.sum4xx)
            && Objects.equals(this.sum5xx, reportdetailsInfoDetailDatas.sum5xx)
            && Objects.equals(this.taskId, reportdetailsInfoDetailDatas.taskId)
            && Objects.equals(this.taskProjectId, reportdetailsInfoDetailDatas.taskProjectId)
            && Objects.equals(this.taskStatus, reportdetailsInfoDetailDatas.taskStatus)
            && Objects.equals(this.testCaseUri, reportdetailsInfoDetailDatas.testCaseUri)
            && Objects.equals(this.tp50, reportdetailsInfoDetailDatas.tp50)
            && Objects.equals(this.tp75, reportdetailsInfoDetailDatas.tp75)
            && Objects.equals(this.tp90, reportdetailsInfoDetailDatas.tp90)
            && Objects.equals(this.tp95, reportdetailsInfoDetailDatas.tp95)
            && Objects.equals(this.tp99, reportdetailsInfoDetailDatas.tp99)
            && Objects.equals(this.tps, reportdetailsInfoDetailDatas.tps)
            && Objects.equals(this.tranTPS, reportdetailsInfoDetailDatas.tranTPS)
            && Objects.equals(this.transactionId, reportdetailsInfoDetailDatas.transactionId)
            && Objects.equals(this.transactionSuccess, reportdetailsInfoDetailDatas.transactionSuccess)
            && Objects.equals(this.transactionalSuccessRate, reportdetailsInfoDetailDatas.transactionalSuccessRate)
            && Objects.equals(this.transactionalTps, reportdetailsInfoDetailDatas.transactionalTps)
            && Objects.equals(this.transactionalTpsSuccess, reportdetailsInfoDetailDatas.transactionalTpsSuccess)
            && Objects.equals(this.transactions, reportdetailsInfoDetailDatas.transactions)
            && Objects.equals(this.updateTime, reportdetailsInfoDetailDatas.updateTime)
            && Objects.equals(this.vum, reportdetailsInfoDetailDatas.vum);
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
        sb.append("class ReportdetailsInfoDetailDatas {\n");
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
