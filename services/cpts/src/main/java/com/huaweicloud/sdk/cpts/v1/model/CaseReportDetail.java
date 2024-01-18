package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CaseReportDetail
 */
public class CaseReportDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "MaxSuccessRateCheckPoint")

    private Double maxSuccessRateCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "averageRespTime")

    private Double averageRespTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "averageRespTimeCheckPoint")

    private Double averageRespTimeCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "averageRespTimeCheckRes")

    private Boolean averageRespTimeCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgNetworkTraffic")

    private Double avgNetworkTraffic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgRecBytes")

    private Integer avgRecBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgRecBytesCheckPoint")

    private Double avgRecBytesCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgRecBytesCheckRes")

    private Boolean avgRecBytesCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgSentBytes")

    private Integer avgSentBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgSentBytesCheckPoint")

    private Double avgSentBytesCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgSentBytesCheckRes")

    private Boolean avgSentBytesCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgTranRespTime")

    private Double avgTranRespTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgTranRespTimeCheckPoint")

    private Double avgTranRespTimeCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgTranRespTimeCheckRes")

    private Boolean avgTranRespTimeCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "awId")

    private String awId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "caseUri")

    private String caseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpointResult")

    private Boolean checkpointResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpuUsage")

    private Double cpuUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpuUsageAvg")

    private Double cpuUsageAvg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpuUsageAvgCheckPoint")

    private Double cpuUsageAvgCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpuUsageAvgCheckRes")

    private Boolean cpuUsageAvgCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpuUsageCheckPoint")

    private Float cpuUsageCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpuUsageCheckRes")

    private Boolean cpuUsageCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currentThreadNum")

    private Integer currentThreadNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datumType")

    private Integer datumType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcsLatencyAvg")

    private Double dcsLatencyAvg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcsLatencyAvgCheckPoint")

    private Double dcsLatencyAvgCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcsLatencyAvgCheckRes")

    private Boolean dcsLatencyAvgCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcsLatencyMax")

    private Double dcsLatencyMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcsLatencyMaxCheckPoint")

    private Double dcsLatencyMaxCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcsLatencyMaxCheckRes")

    private Boolean dcsLatencyMaxCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcsLatencyMin")

    private Double dcsLatencyMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcsLatencyMinCheckPoint")

    private Double dcsLatencyMinCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcsLatencyMinCheckRes")

    private Boolean dcsLatencyMinCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detailId")

    private String detailId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskRead")

    private Double diskRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskReadAvg")

    private Double diskReadAvg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskReadAvgCheckPoint")

    private Double diskReadAvgCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskReadAvgCheckRes")

    private Boolean diskReadAvgCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskReadCheckPoint")

    private Double diskReadCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskReadCheckRes")

    private Boolean diskReadCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskUsage")

    private Double diskUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskUsageAvg")

    private Double diskUsageAvg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskUsageAvgCheckPoint")

    private Double diskUsageAvgCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskUsageAvgCheckRes")

    private Boolean diskUsageAvgCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskUsageCheckPoint")

    private Double diskUsageCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskUsageCheckRes")

    private Boolean diskUsageCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskWrite")

    private Double diskWrite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskWriteAvg")

    private Double diskWriteAvg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskWriteAvgCheckPoint")

    private Double diskWriteAvgCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskWriteAvgCheckRes")

    private Boolean diskWriteAvgCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskWriteCheckPoint")

    private Double diskWriteCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskWriteCheckRes")

    private Boolean diskWriteCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

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
    @JsonProperty(value = "failedReason")

    private String failedReason;

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
    @JsonProperty(value = "iterationUri")

    private String iterationUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kpiMonitor")

    private String kpiMonitor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Integer max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxAvgTime")

    private Double maxAvgTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxAvgTimeCheckPoint")

    private Double maxAvgTimeCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxAvgTimeCheckRes")

    private Boolean maxAvgTimeCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxNetworkTraffic")

    private Integer maxNetworkTraffic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxRecBytes")

    private Integer maxRecBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxRecBytesCheckPoint")

    private Double maxRecBytesCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxRecBytesCheckRes")

    private Boolean maxRecBytesCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxRespTime")

    private Integer maxRespTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxRespTimeCheckPoint")

    private Double maxRespTimeCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxRespTimeCheckRes")

    private Boolean maxRespTimeCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxRps")

    private Integer maxRps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxSentBytes")

    private Integer maxSentBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxSentBytesCheckPoint")

    private Double maxSentBytesCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxSentBytesCheckRes")

    private Boolean maxSentBytesCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxSuccessRate")

    private Double maxSuccessRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxSuccessRateCheckRes")

    private Boolean maxSuccessRateCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxThreadNum")

    private Double maxThreadNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxThreadNumCheckPoint")

    private Double maxThreadNumCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxThreadNumCheckRes")

    private Boolean maxThreadNumCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTps")

    private Double maxTps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTpsCheckPoint")

    private Double maxTpsCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTpsCheckRes")

    private Boolean maxTpsCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTranRespTime")

    private Double maxTranRespTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTranRespTimeCheckPoint")

    private Double maxTranRespTimeCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTranRespTimeCheckRes")

    private Boolean maxTranRespTimeCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memoryUsage")

    private Double memoryUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memoryUsageAvg")

    private Double memoryUsageAvg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memoryUsageAvgCheckPoint")

    private Double memoryUsageAvgCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memoryUsageAvgCheckRes")

    private Boolean memoryUsageAvgCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memoryUsageCheckPoint")

    private Double memoryUsageCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memoryUsageCheckRes")

    private Boolean memoryUsageCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Integer min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minNetworkTraffic")

    private Integer minNetworkTraffic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitorPeakTime")

    private Double monitorPeakTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitorPeakTimeCheckPoint")

    private Double monitorPeakTimeCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitorPeakTimeCheckRes")

    private Boolean monitorPeakTimeCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitorResult")

    private Double monitorResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitorResultCheckPoint")

    private Double monitorResultCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitorResultCheckRes")

    private Boolean monitorResultCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkRead")

    private Double networkRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkReadAvg")

    private Double networkReadAvg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkReadAvgCheckPoint")

    private Double networkReadAvgCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkReadAvgCheckRes")

    private Boolean networkReadAvgCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkReadCheckPoint")

    private Double networkReadCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkReadCheckRes")

    private Boolean networkReadCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkWrite")

    private Double networkWrite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkWriteAvg")

    private Double networkWriteAvg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkWriteAvgCheckPoint")

    private Double networkWriteAvgCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkWriteAvgCheckRes")

    private Boolean networkWriteAvgCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkWriteCheckPoint")

    private Double networkWriteCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkWriteCheckRes")

    private Boolean networkWriteCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peakLoadStatus")

    private Double peakLoadStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peakLoadStatusCheckPoint")

    private Double peakLoadStatusCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peakLoadStatusCheckRes")

    private Boolean peakLoadStatusCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peakMetric")

    private PeakMetric peakMetric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocols")

    private List<String> protocols = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requests")

    private Integer requests;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Integer result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resultLog")

    private String resultLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "round")

    private Integer round;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "saveAllData")

    private Boolean saveAllData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceId")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage")

    private Integer stage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streamingMediaVo")

    private StreamingMediaReport streamingMediaVo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "successCount")

    private Integer successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "successRate")

    private Integer successRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "successRateCheckPoint")

    private Double successRateCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "successRateCheckRes")

    private Boolean successRateCheckRes;

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
    @JsonProperty(value = "taskName")

    private String taskName;

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
    @JsonProperty(value = "tp50CheckPoint")

    private Double tp50CheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp50CheckRes")

    private Boolean tp50CheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp75")

    private Integer tp75;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp75CheckPoint")

    private Double tp75CheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp75CheckRes")

    private Boolean tp75CheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp85")

    private Integer tp85;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp85CheckPoint")

    private Double tp85CheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp85CheckRes")

    private Boolean tp85CheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp90")

    private Integer tp90;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp90CheckPoint")

    private Double tp90CheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp90CheckRes")

    private Boolean tp90CheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp95")

    private Integer tp95;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp95CheckPoint")

    private Double tp95CheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp95CheckRes")

    private Boolean tp95CheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp99")

    private Integer tp99;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp999")

    private Integer tp999;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp9999")

    private Integer tp9999;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp9999CheckPoint")

    private Double tp9999CheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp9999CheckRes")

    private Boolean tp9999CheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp999CheckPoint")

    private Double tp999CheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp999CheckRes")

    private Boolean tp999CheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp99CheckPoint")

    private Double tp99CheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tp99CheckRes")

    private Boolean tp99CheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tps")

    private Double tps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpsCheckPoint")

    private Double tpsCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpsCheckRes")

    private Boolean tpsCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tranTPS")

    private Double tranTPS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tranTPSCheckPoint")

    private Double tranTPSCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tranTPSCheckRes")

    private Boolean tranTPSCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transactionId")

    private String transactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transactionSuccess")

    private Double transactionSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transactions")

    private Double transactions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transactionsCheckPoint")

    private Double transactionsCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transactionsCheckRes")

    private Boolean transactionsCheckRes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTime")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userConcur")

    private Integer userConcur;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versionUri")

    private String versionUri;

    public CaseReportDetail withMaxSuccessRateCheckPoint(Double maxSuccessRateCheckPoint) {
        this.maxSuccessRateCheckPoint = maxSuccessRateCheckPoint;
        return this;
    }

    /**
     * 最大成功率检查点
     * @return maxSuccessRateCheckPoint
     */
    public Double getMaxSuccessRateCheckPoint() {
        return maxSuccessRateCheckPoint;
    }

    public void setMaxSuccessRateCheckPoint(Double maxSuccessRateCheckPoint) {
        this.maxSuccessRateCheckPoint = maxSuccessRateCheckPoint;
    }

    public CaseReportDetail withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 别名
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public CaseReportDetail withAverageRespTime(Double averageRespTime) {
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

    public CaseReportDetail withAverageRespTimeCheckPoint(Double averageRespTimeCheckPoint) {
        this.averageRespTimeCheckPoint = averageRespTimeCheckPoint;
        return this;
    }

    /**
     * 平均响应时间检查点
     * @return averageRespTimeCheckPoint
     */
    public Double getAverageRespTimeCheckPoint() {
        return averageRespTimeCheckPoint;
    }

    public void setAverageRespTimeCheckPoint(Double averageRespTimeCheckPoint) {
        this.averageRespTimeCheckPoint = averageRespTimeCheckPoint;
    }

    public CaseReportDetail withAverageRespTimeCheckRes(Boolean averageRespTimeCheckRes) {
        this.averageRespTimeCheckRes = averageRespTimeCheckRes;
        return this;
    }

    /**
     * 平均响应时间检查结果
     * @return averageRespTimeCheckRes
     */
    public Boolean getAverageRespTimeCheckRes() {
        return averageRespTimeCheckRes;
    }

    public void setAverageRespTimeCheckRes(Boolean averageRespTimeCheckRes) {
        this.averageRespTimeCheckRes = averageRespTimeCheckRes;
    }

    public CaseReportDetail withAvgNetworkTraffic(Double avgNetworkTraffic) {
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

    public CaseReportDetail withAvgRecBytes(Integer avgRecBytes) {
        this.avgRecBytes = avgRecBytes;
        return this;
    }

    /**
     * 平均下行带宽
     * @return avgRecBytes
     */
    public Integer getAvgRecBytes() {
        return avgRecBytes;
    }

    public void setAvgRecBytes(Integer avgRecBytes) {
        this.avgRecBytes = avgRecBytes;
    }

    public CaseReportDetail withAvgRecBytesCheckPoint(Double avgRecBytesCheckPoint) {
        this.avgRecBytesCheckPoint = avgRecBytesCheckPoint;
        return this;
    }

    /**
     * 平均下行带宽检查点
     * @return avgRecBytesCheckPoint
     */
    public Double getAvgRecBytesCheckPoint() {
        return avgRecBytesCheckPoint;
    }

    public void setAvgRecBytesCheckPoint(Double avgRecBytesCheckPoint) {
        this.avgRecBytesCheckPoint = avgRecBytesCheckPoint;
    }

    public CaseReportDetail withAvgRecBytesCheckRes(Boolean avgRecBytesCheckRes) {
        this.avgRecBytesCheckRes = avgRecBytesCheckRes;
        return this;
    }

    /**
     * 平均下行带宽检查结果
     * @return avgRecBytesCheckRes
     */
    public Boolean getAvgRecBytesCheckRes() {
        return avgRecBytesCheckRes;
    }

    public void setAvgRecBytesCheckRes(Boolean avgRecBytesCheckRes) {
        this.avgRecBytesCheckRes = avgRecBytesCheckRes;
    }

    public CaseReportDetail withAvgSentBytes(Integer avgSentBytes) {
        this.avgSentBytes = avgSentBytes;
        return this;
    }

    /**
     * 平均上行带宽
     * @return avgSentBytes
     */
    public Integer getAvgSentBytes() {
        return avgSentBytes;
    }

    public void setAvgSentBytes(Integer avgSentBytes) {
        this.avgSentBytes = avgSentBytes;
    }

    public CaseReportDetail withAvgSentBytesCheckPoint(Double avgSentBytesCheckPoint) {
        this.avgSentBytesCheckPoint = avgSentBytesCheckPoint;
        return this;
    }

    /**
     * 平均上行带宽检查点
     * @return avgSentBytesCheckPoint
     */
    public Double getAvgSentBytesCheckPoint() {
        return avgSentBytesCheckPoint;
    }

    public void setAvgSentBytesCheckPoint(Double avgSentBytesCheckPoint) {
        this.avgSentBytesCheckPoint = avgSentBytesCheckPoint;
    }

    public CaseReportDetail withAvgSentBytesCheckRes(Boolean avgSentBytesCheckRes) {
        this.avgSentBytesCheckRes = avgSentBytesCheckRes;
        return this;
    }

    /**
     * 平均上行带宽检查结果
     * @return avgSentBytesCheckRes
     */
    public Boolean getAvgSentBytesCheckRes() {
        return avgSentBytesCheckRes;
    }

    public void setAvgSentBytesCheckRes(Boolean avgSentBytesCheckRes) {
        this.avgSentBytesCheckRes = avgSentBytesCheckRes;
    }

    public CaseReportDetail withAvgTranRespTime(Double avgTranRespTime) {
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

    public CaseReportDetail withAvgTranRespTimeCheckPoint(Double avgTranRespTimeCheckPoint) {
        this.avgTranRespTimeCheckPoint = avgTranRespTimeCheckPoint;
        return this;
    }

    /**
     * 事务平均响应时间检查点
     * @return avgTranRespTimeCheckPoint
     */
    public Double getAvgTranRespTimeCheckPoint() {
        return avgTranRespTimeCheckPoint;
    }

    public void setAvgTranRespTimeCheckPoint(Double avgTranRespTimeCheckPoint) {
        this.avgTranRespTimeCheckPoint = avgTranRespTimeCheckPoint;
    }

    public CaseReportDetail withAvgTranRespTimeCheckRes(Boolean avgTranRespTimeCheckRes) {
        this.avgTranRespTimeCheckRes = avgTranRespTimeCheckRes;
        return this;
    }

    /**
     * 事务平均响应时间检查结果
     * @return avgTranRespTimeCheckRes
     */
    public Boolean getAvgTranRespTimeCheckRes() {
        return avgTranRespTimeCheckRes;
    }

    public void setAvgTranRespTimeCheckRes(Boolean avgTranRespTimeCheckRes) {
        this.avgTranRespTimeCheckRes = avgTranRespTimeCheckRes;
    }

    public CaseReportDetail withAwId(String awId) {
        this.awId = awId;
        return this;
    }

    /**
     * 请求id
     * @return awId
     */
    public String getAwId() {
        return awId;
    }

    public void setAwId(String awId) {
        this.awId = awId;
    }

    public CaseReportDetail withCaseUri(String caseUri) {
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

    public CaseReportDetail withCheckpointResult(Boolean checkpointResult) {
        this.checkpointResult = checkpointResult;
        return this;
    }

    /**
     * 所有检查点结果的汇总结果
     * @return checkpointResult
     */
    public Boolean getCheckpointResult() {
        return checkpointResult;
    }

    public void setCheckpointResult(Boolean checkpointResult) {
        this.checkpointResult = checkpointResult;
    }

    public CaseReportDetail withCpuUsage(Double cpuUsage) {
        this.cpuUsage = cpuUsage;
        return this;
    }

    /**
     * cpu最大使用率
     * @return cpuUsage
     */
    public Double getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(Double cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public CaseReportDetail withCpuUsageAvg(Double cpuUsageAvg) {
        this.cpuUsageAvg = cpuUsageAvg;
        return this;
    }

    /**
     * cpu平均使用率
     * @return cpuUsageAvg
     */
    public Double getCpuUsageAvg() {
        return cpuUsageAvg;
    }

    public void setCpuUsageAvg(Double cpuUsageAvg) {
        this.cpuUsageAvg = cpuUsageAvg;
    }

    public CaseReportDetail withCpuUsageAvgCheckPoint(Double cpuUsageAvgCheckPoint) {
        this.cpuUsageAvgCheckPoint = cpuUsageAvgCheckPoint;
        return this;
    }

    /**
     * cpu平均使用率检查点
     * @return cpuUsageAvgCheckPoint
     */
    public Double getCpuUsageAvgCheckPoint() {
        return cpuUsageAvgCheckPoint;
    }

    public void setCpuUsageAvgCheckPoint(Double cpuUsageAvgCheckPoint) {
        this.cpuUsageAvgCheckPoint = cpuUsageAvgCheckPoint;
    }

    public CaseReportDetail withCpuUsageAvgCheckRes(Boolean cpuUsageAvgCheckRes) {
        this.cpuUsageAvgCheckRes = cpuUsageAvgCheckRes;
        return this;
    }

    /**
     * cpu平均使用率检查结果
     * @return cpuUsageAvgCheckRes
     */
    public Boolean getCpuUsageAvgCheckRes() {
        return cpuUsageAvgCheckRes;
    }

    public void setCpuUsageAvgCheckRes(Boolean cpuUsageAvgCheckRes) {
        this.cpuUsageAvgCheckRes = cpuUsageAvgCheckRes;
    }

    public CaseReportDetail withCpuUsageCheckPoint(Float cpuUsageCheckPoint) {
        this.cpuUsageCheckPoint = cpuUsageCheckPoint;
        return this;
    }

    /**
     * cpu最大使用率检查点
     * @return cpuUsageCheckPoint
     */
    public Float getCpuUsageCheckPoint() {
        return cpuUsageCheckPoint;
    }

    public void setCpuUsageCheckPoint(Float cpuUsageCheckPoint) {
        this.cpuUsageCheckPoint = cpuUsageCheckPoint;
    }

    public CaseReportDetail withCpuUsageCheckRes(Boolean cpuUsageCheckRes) {
        this.cpuUsageCheckRes = cpuUsageCheckRes;
        return this;
    }

    /**
     * cpu最大使用率检查结果
     * @return cpuUsageCheckRes
     */
    public Boolean getCpuUsageCheckRes() {
        return cpuUsageCheckRes;
    }

    public void setCpuUsageCheckRes(Boolean cpuUsageCheckRes) {
        this.cpuUsageCheckRes = cpuUsageCheckRes;
    }

    public CaseReportDetail withCreateTime(String createTime) {
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

    public CaseReportDetail withCurrentThreadNum(Integer currentThreadNum) {
        this.currentThreadNum = currentThreadNum;
        return this;
    }

    /**
     * 最大并发数
     * @return currentThreadNum
     */
    public Integer getCurrentThreadNum() {
        return currentThreadNum;
    }

    public void setCurrentThreadNum(Integer currentThreadNum) {
        this.currentThreadNum = currentThreadNum;
    }

    public CaseReportDetail withDatumType(Integer datumType) {
        this.datumType = datumType;
        return this;
    }

    /**
     * 数据类型(case/aw/transaction)
     * @return datumType
     */
    public Integer getDatumType() {
        return datumType;
    }

    public void setDatumType(Integer datumType) {
        this.datumType = datumType;
    }

    public CaseReportDetail withDcsLatencyAvg(Double dcsLatencyAvg) {
        this.dcsLatencyAvg = dcsLatencyAvg;
        return this;
    }

    /**
     * dcs平均时延
     * @return dcsLatencyAvg
     */
    public Double getDcsLatencyAvg() {
        return dcsLatencyAvg;
    }

    public void setDcsLatencyAvg(Double dcsLatencyAvg) {
        this.dcsLatencyAvg = dcsLatencyAvg;
    }

    public CaseReportDetail withDcsLatencyAvgCheckPoint(Double dcsLatencyAvgCheckPoint) {
        this.dcsLatencyAvgCheckPoint = dcsLatencyAvgCheckPoint;
        return this;
    }

    /**
     * dcs平均时延检查点
     * @return dcsLatencyAvgCheckPoint
     */
    public Double getDcsLatencyAvgCheckPoint() {
        return dcsLatencyAvgCheckPoint;
    }

    public void setDcsLatencyAvgCheckPoint(Double dcsLatencyAvgCheckPoint) {
        this.dcsLatencyAvgCheckPoint = dcsLatencyAvgCheckPoint;
    }

    public CaseReportDetail withDcsLatencyAvgCheckRes(Boolean dcsLatencyAvgCheckRes) {
        this.dcsLatencyAvgCheckRes = dcsLatencyAvgCheckRes;
        return this;
    }

    /**
     * dcs平均时延检查结果
     * @return dcsLatencyAvgCheckRes
     */
    public Boolean getDcsLatencyAvgCheckRes() {
        return dcsLatencyAvgCheckRes;
    }

    public void setDcsLatencyAvgCheckRes(Boolean dcsLatencyAvgCheckRes) {
        this.dcsLatencyAvgCheckRes = dcsLatencyAvgCheckRes;
    }

    public CaseReportDetail withDcsLatencyMax(Double dcsLatencyMax) {
        this.dcsLatencyMax = dcsLatencyMax;
        return this;
    }

    /**
     * dcs最大时延
     * @return dcsLatencyMax
     */
    public Double getDcsLatencyMax() {
        return dcsLatencyMax;
    }

    public void setDcsLatencyMax(Double dcsLatencyMax) {
        this.dcsLatencyMax = dcsLatencyMax;
    }

    public CaseReportDetail withDcsLatencyMaxCheckPoint(Double dcsLatencyMaxCheckPoint) {
        this.dcsLatencyMaxCheckPoint = dcsLatencyMaxCheckPoint;
        return this;
    }

    /**
     * dcs最大时延检查点·
     * @return dcsLatencyMaxCheckPoint
     */
    public Double getDcsLatencyMaxCheckPoint() {
        return dcsLatencyMaxCheckPoint;
    }

    public void setDcsLatencyMaxCheckPoint(Double dcsLatencyMaxCheckPoint) {
        this.dcsLatencyMaxCheckPoint = dcsLatencyMaxCheckPoint;
    }

    public CaseReportDetail withDcsLatencyMaxCheckRes(Boolean dcsLatencyMaxCheckRes) {
        this.dcsLatencyMaxCheckRes = dcsLatencyMaxCheckRes;
        return this;
    }

    /**
     * dcs最大时延检查结果
     * @return dcsLatencyMaxCheckRes
     */
    public Boolean getDcsLatencyMaxCheckRes() {
        return dcsLatencyMaxCheckRes;
    }

    public void setDcsLatencyMaxCheckRes(Boolean dcsLatencyMaxCheckRes) {
        this.dcsLatencyMaxCheckRes = dcsLatencyMaxCheckRes;
    }

    public CaseReportDetail withDcsLatencyMin(Double dcsLatencyMin) {
        this.dcsLatencyMin = dcsLatencyMin;
        return this;
    }

    /**
     * dcs最小时延
     * @return dcsLatencyMin
     */
    public Double getDcsLatencyMin() {
        return dcsLatencyMin;
    }

    public void setDcsLatencyMin(Double dcsLatencyMin) {
        this.dcsLatencyMin = dcsLatencyMin;
    }

    public CaseReportDetail withDcsLatencyMinCheckPoint(Double dcsLatencyMinCheckPoint) {
        this.dcsLatencyMinCheckPoint = dcsLatencyMinCheckPoint;
        return this;
    }

    /**
     * dcs最小时延检查点
     * @return dcsLatencyMinCheckPoint
     */
    public Double getDcsLatencyMinCheckPoint() {
        return dcsLatencyMinCheckPoint;
    }

    public void setDcsLatencyMinCheckPoint(Double dcsLatencyMinCheckPoint) {
        this.dcsLatencyMinCheckPoint = dcsLatencyMinCheckPoint;
    }

    public CaseReportDetail withDcsLatencyMinCheckRes(Boolean dcsLatencyMinCheckRes) {
        this.dcsLatencyMinCheckRes = dcsLatencyMinCheckRes;
        return this;
    }

    /**
     * dcs最小时延检查结果
     * @return dcsLatencyMinCheckRes
     */
    public Boolean getDcsLatencyMinCheckRes() {
        return dcsLatencyMinCheckRes;
    }

    public void setDcsLatencyMinCheckRes(Boolean dcsLatencyMinCheckRes) {
        this.dcsLatencyMinCheckRes = dcsLatencyMinCheckRes;
    }

    public CaseReportDetail withDetailId(String detailId) {
        this.detailId = detailId;
        return this;
    }

    /**
     * 用例/aw/事务在数据库中dc_case_aw表的主键ID
     * @return detailId
     */
    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public CaseReportDetail withDiskRead(Double diskRead) {
        this.diskRead = diskRead;
        return this;
    }

    /**
     * 磁盘最大读取速度
     * @return diskRead
     */
    public Double getDiskRead() {
        return diskRead;
    }

    public void setDiskRead(Double diskRead) {
        this.diskRead = diskRead;
    }

    public CaseReportDetail withDiskReadAvg(Double diskReadAvg) {
        this.diskReadAvg = diskReadAvg;
        return this;
    }

    /**
     * 磁盘平均读取速度
     * @return diskReadAvg
     */
    public Double getDiskReadAvg() {
        return diskReadAvg;
    }

    public void setDiskReadAvg(Double diskReadAvg) {
        this.diskReadAvg = diskReadAvg;
    }

    public CaseReportDetail withDiskReadAvgCheckPoint(Double diskReadAvgCheckPoint) {
        this.diskReadAvgCheckPoint = diskReadAvgCheckPoint;
        return this;
    }

    /**
     * 磁盘平均读取速度检查点
     * @return diskReadAvgCheckPoint
     */
    public Double getDiskReadAvgCheckPoint() {
        return diskReadAvgCheckPoint;
    }

    public void setDiskReadAvgCheckPoint(Double diskReadAvgCheckPoint) {
        this.diskReadAvgCheckPoint = diskReadAvgCheckPoint;
    }

    public CaseReportDetail withDiskReadAvgCheckRes(Boolean diskReadAvgCheckRes) {
        this.diskReadAvgCheckRes = diskReadAvgCheckRes;
        return this;
    }

    /**
     * 磁盘平均读取速度检查结果
     * @return diskReadAvgCheckRes
     */
    public Boolean getDiskReadAvgCheckRes() {
        return diskReadAvgCheckRes;
    }

    public void setDiskReadAvgCheckRes(Boolean diskReadAvgCheckRes) {
        this.diskReadAvgCheckRes = diskReadAvgCheckRes;
    }

    public CaseReportDetail withDiskReadCheckPoint(Double diskReadCheckPoint) {
        this.diskReadCheckPoint = diskReadCheckPoint;
        return this;
    }

    /**
     * 磁盘最大读取速度检查点
     * @return diskReadCheckPoint
     */
    public Double getDiskReadCheckPoint() {
        return diskReadCheckPoint;
    }

    public void setDiskReadCheckPoint(Double diskReadCheckPoint) {
        this.diskReadCheckPoint = diskReadCheckPoint;
    }

    public CaseReportDetail withDiskReadCheckRes(Boolean diskReadCheckRes) {
        this.diskReadCheckRes = diskReadCheckRes;
        return this;
    }

    /**
     * 磁盘最大读取速度检查结果
     * @return diskReadCheckRes
     */
    public Boolean getDiskReadCheckRes() {
        return diskReadCheckRes;
    }

    public void setDiskReadCheckRes(Boolean diskReadCheckRes) {
        this.diskReadCheckRes = diskReadCheckRes;
    }

    public CaseReportDetail withDiskUsage(Double diskUsage) {
        this.diskUsage = diskUsage;
        return this;
    }

    /**
     * 磁盘最大使用率
     * @return diskUsage
     */
    public Double getDiskUsage() {
        return diskUsage;
    }

    public void setDiskUsage(Double diskUsage) {
        this.diskUsage = diskUsage;
    }

    public CaseReportDetail withDiskUsageAvg(Double diskUsageAvg) {
        this.diskUsageAvg = diskUsageAvg;
        return this;
    }

    /**
     * 磁盘平均使用率
     * @return diskUsageAvg
     */
    public Double getDiskUsageAvg() {
        return diskUsageAvg;
    }

    public void setDiskUsageAvg(Double diskUsageAvg) {
        this.diskUsageAvg = diskUsageAvg;
    }

    public CaseReportDetail withDiskUsageAvgCheckPoint(Double diskUsageAvgCheckPoint) {
        this.diskUsageAvgCheckPoint = diskUsageAvgCheckPoint;
        return this;
    }

    /**
     * 磁盘平均使用率检查点
     * @return diskUsageAvgCheckPoint
     */
    public Double getDiskUsageAvgCheckPoint() {
        return diskUsageAvgCheckPoint;
    }

    public void setDiskUsageAvgCheckPoint(Double diskUsageAvgCheckPoint) {
        this.diskUsageAvgCheckPoint = diskUsageAvgCheckPoint;
    }

    public CaseReportDetail withDiskUsageAvgCheckRes(Boolean diskUsageAvgCheckRes) {
        this.diskUsageAvgCheckRes = diskUsageAvgCheckRes;
        return this;
    }

    /**
     * 磁盘平均使用率检查结果
     * @return diskUsageAvgCheckRes
     */
    public Boolean getDiskUsageAvgCheckRes() {
        return diskUsageAvgCheckRes;
    }

    public void setDiskUsageAvgCheckRes(Boolean diskUsageAvgCheckRes) {
        this.diskUsageAvgCheckRes = diskUsageAvgCheckRes;
    }

    public CaseReportDetail withDiskUsageCheckPoint(Double diskUsageCheckPoint) {
        this.diskUsageCheckPoint = diskUsageCheckPoint;
        return this;
    }

    /**
     * 磁盘最大使用率检查点
     * @return diskUsageCheckPoint
     */
    public Double getDiskUsageCheckPoint() {
        return diskUsageCheckPoint;
    }

    public void setDiskUsageCheckPoint(Double diskUsageCheckPoint) {
        this.diskUsageCheckPoint = diskUsageCheckPoint;
    }

    public CaseReportDetail withDiskUsageCheckRes(Boolean diskUsageCheckRes) {
        this.diskUsageCheckRes = diskUsageCheckRes;
        return this;
    }

    /**
     * 磁盘最大使用率检查结果
     * @return diskUsageCheckRes
     */
    public Boolean getDiskUsageCheckRes() {
        return diskUsageCheckRes;
    }

    public void setDiskUsageCheckRes(Boolean diskUsageCheckRes) {
        this.diskUsageCheckRes = diskUsageCheckRes;
    }

    public CaseReportDetail withDiskWrite(Double diskWrite) {
        this.diskWrite = diskWrite;
        return this;
    }

    /**
     * 磁盘最大写入速度
     * @return diskWrite
     */
    public Double getDiskWrite() {
        return diskWrite;
    }

    public void setDiskWrite(Double diskWrite) {
        this.diskWrite = diskWrite;
    }

    public CaseReportDetail withDiskWriteAvg(Double diskWriteAvg) {
        this.diskWriteAvg = diskWriteAvg;
        return this;
    }

    /**
     * 磁盘平均写入速度
     * @return diskWriteAvg
     */
    public Double getDiskWriteAvg() {
        return diskWriteAvg;
    }

    public void setDiskWriteAvg(Double diskWriteAvg) {
        this.diskWriteAvg = diskWriteAvg;
    }

    public CaseReportDetail withDiskWriteAvgCheckPoint(Double diskWriteAvgCheckPoint) {
        this.diskWriteAvgCheckPoint = diskWriteAvgCheckPoint;
        return this;
    }

    /**
     * 磁盘平均写入速度检查点
     * @return diskWriteAvgCheckPoint
     */
    public Double getDiskWriteAvgCheckPoint() {
        return diskWriteAvgCheckPoint;
    }

    public void setDiskWriteAvgCheckPoint(Double diskWriteAvgCheckPoint) {
        this.diskWriteAvgCheckPoint = diskWriteAvgCheckPoint;
    }

    public CaseReportDetail withDiskWriteAvgCheckRes(Boolean diskWriteAvgCheckRes) {
        this.diskWriteAvgCheckRes = diskWriteAvgCheckRes;
        return this;
    }

    /**
     * 磁盘平均写入速度检查结果
     * @return diskWriteAvgCheckRes
     */
    public Boolean getDiskWriteAvgCheckRes() {
        return diskWriteAvgCheckRes;
    }

    public void setDiskWriteAvgCheckRes(Boolean diskWriteAvgCheckRes) {
        this.diskWriteAvgCheckRes = diskWriteAvgCheckRes;
    }

    public CaseReportDetail withDiskWriteCheckPoint(Double diskWriteCheckPoint) {
        this.diskWriteCheckPoint = diskWriteCheckPoint;
        return this;
    }

    /**
     * 磁盘最大写入速度检查点
     * @return diskWriteCheckPoint
     */
    public Double getDiskWriteCheckPoint() {
        return diskWriteCheckPoint;
    }

    public void setDiskWriteCheckPoint(Double diskWriteCheckPoint) {
        this.diskWriteCheckPoint = diskWriteCheckPoint;
    }

    public CaseReportDetail withDiskWriteCheckRes(Boolean diskWriteCheckRes) {
        this.diskWriteCheckRes = diskWriteCheckRes;
        return this;
    }

    /**
     * 磁盘最大写入速度检查结果
     * @return diskWriteCheckRes
     */
    public Boolean getDiskWriteCheckRes() {
        return diskWriteCheckRes;
    }

    public void setDiskWriteCheckRes(Boolean diskWriteCheckRes) {
        this.diskWriteCheckRes = diskWriteCheckRes;
    }

    public CaseReportDetail withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 运行时长
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public CaseReportDetail withEndTime(String endTime) {
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

    public CaseReportDetail withErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
        return this;
    }

    /**
     * 错误数
     * @return errorCount
     */
    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public CaseReportDetail withErrorEventsCount(Integer errorEventsCount) {
        this.errorEventsCount = errorEventsCount;
        return this;
    }

    /**
     * 错误事件数
     * @return errorEventsCount
     */
    public Integer getErrorEventsCount() {
        return errorEventsCount;
    }

    public void setErrorEventsCount(Integer errorEventsCount) {
        this.errorEventsCount = errorEventsCount;
    }

    public CaseReportDetail withFailedAssert(Integer failedAssert) {
        this.failedAssert = failedAssert;
        return this;
    }

    /**
     * 断言失败数
     * @return failedAssert
     */
    public Integer getFailedAssert() {
        return failedAssert;
    }

    public void setFailedAssert(Integer failedAssert) {
        this.failedAssert = failedAssert;
    }

    public CaseReportDetail withFailedOthers(Integer failedOthers) {
        this.failedOthers = failedOthers;
        return this;
    }

    /**
     * 其他失败数
     * @return failedOthers
     */
    public Integer getFailedOthers() {
        return failedOthers;
    }

    public void setFailedOthers(Integer failedOthers) {
        this.failedOthers = failedOthers;
    }

    public CaseReportDetail withFailedParsed(Integer failedParsed) {
        this.failedParsed = failedParsed;
        return this;
    }

    /**
     * 解析失败数
     * @return failedParsed
     */
    public Integer getFailedParsed() {
        return failedParsed;
    }

    public void setFailedParsed(Integer failedParsed) {
        this.failedParsed = failedParsed;
    }

    public CaseReportDetail withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 失败原因
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public CaseReportDetail withFailedRefused(Integer failedRefused) {
        this.failedRefused = failedRefused;
        return this;
    }

    /**
     * 连接拒绝失败数
     * @return failedRefused
     */
    public Integer getFailedRefused() {
        return failedRefused;
    }

    public void setFailedRefused(Integer failedRefused) {
        this.failedRefused = failedRefused;
    }

    public CaseReportDetail withFailedTimeout(Integer failedTimeout) {
        this.failedTimeout = failedTimeout;
        return this;
    }

    /**
     * 连接超时失败数
     * @return failedTimeout
     */
    public Integer getFailedTimeout() {
        return failedTimeout;
    }

    public void setFailedTimeout(Integer failedTimeout) {
        this.failedTimeout = failedTimeout;
    }

    public CaseReportDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用例在数据库中dc_testcase表的主键id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CaseReportDetail withIsAW(Boolean isAW) {
        this.isAW = isAW;
        return this;
    }

    /**
     * 是否是aw
     * @return isAW
     */
    public Boolean getIsAW() {
        return isAW;
    }

    public void setIsAW(Boolean isAW) {
        this.isAW = isAW;
    }

    public CaseReportDetail withIterationUri(String iterationUri) {
        this.iterationUri = iterationUri;
        return this;
    }

    /**
     * 迭代uri
     * @return iterationUri
     */
    public String getIterationUri() {
        return iterationUri;
    }

    public void setIterationUri(String iterationUri) {
        this.iterationUri = iterationUri;
    }

    public CaseReportDetail withKpiMonitor(String kpiMonitor) {
        this.kpiMonitor = kpiMonitor;
        return this;
    }

    /**
     * 来源于设计服务的监控数据
     * @return kpiMonitor
     */
    public String getKpiMonitor() {
        return kpiMonitor;
    }

    public void setKpiMonitor(String kpiMonitor) {
        this.kpiMonitor = kpiMonitor;
    }

    public CaseReportDetail withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 最大响应时间
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public CaseReportDetail withMaxAvgTime(Double maxAvgTime) {
        this.maxAvgTime = maxAvgTime;
        return this;
    }

    /**
     * 平均响应时间
     * @return maxAvgTime
     */
    public Double getMaxAvgTime() {
        return maxAvgTime;
    }

    public void setMaxAvgTime(Double maxAvgTime) {
        this.maxAvgTime = maxAvgTime;
    }

    public CaseReportDetail withMaxAvgTimeCheckPoint(Double maxAvgTimeCheckPoint) {
        this.maxAvgTimeCheckPoint = maxAvgTimeCheckPoint;
        return this;
    }

    /**
     * 平均响应时间检查点
     * @return maxAvgTimeCheckPoint
     */
    public Double getMaxAvgTimeCheckPoint() {
        return maxAvgTimeCheckPoint;
    }

    public void setMaxAvgTimeCheckPoint(Double maxAvgTimeCheckPoint) {
        this.maxAvgTimeCheckPoint = maxAvgTimeCheckPoint;
    }

    public CaseReportDetail withMaxAvgTimeCheckRes(Boolean maxAvgTimeCheckRes) {
        this.maxAvgTimeCheckRes = maxAvgTimeCheckRes;
        return this;
    }

    /**
     * 平均响应时间检查结果
     * @return maxAvgTimeCheckRes
     */
    public Boolean getMaxAvgTimeCheckRes() {
        return maxAvgTimeCheckRes;
    }

    public void setMaxAvgTimeCheckRes(Boolean maxAvgTimeCheckRes) {
        this.maxAvgTimeCheckRes = maxAvgTimeCheckRes;
    }

    public CaseReportDetail withMaxNetworkTraffic(Integer maxNetworkTraffic) {
        this.maxNetworkTraffic = maxNetworkTraffic;
        return this;
    }

    /**
     * 流量峰值
     * @return maxNetworkTraffic
     */
    public Integer getMaxNetworkTraffic() {
        return maxNetworkTraffic;
    }

    public void setMaxNetworkTraffic(Integer maxNetworkTraffic) {
        this.maxNetworkTraffic = maxNetworkTraffic;
    }

    public CaseReportDetail withMaxRecBytes(Integer maxRecBytes) {
        this.maxRecBytes = maxRecBytes;
        return this;
    }

    /**
     * 最大下行带宽
     * @return maxRecBytes
     */
    public Integer getMaxRecBytes() {
        return maxRecBytes;
    }

    public void setMaxRecBytes(Integer maxRecBytes) {
        this.maxRecBytes = maxRecBytes;
    }

    public CaseReportDetail withMaxRecBytesCheckPoint(Double maxRecBytesCheckPoint) {
        this.maxRecBytesCheckPoint = maxRecBytesCheckPoint;
        return this;
    }

    /**
     * 最大下行带宽检查点
     * @return maxRecBytesCheckPoint
     */
    public Double getMaxRecBytesCheckPoint() {
        return maxRecBytesCheckPoint;
    }

    public void setMaxRecBytesCheckPoint(Double maxRecBytesCheckPoint) {
        this.maxRecBytesCheckPoint = maxRecBytesCheckPoint;
    }

    public CaseReportDetail withMaxRecBytesCheckRes(Boolean maxRecBytesCheckRes) {
        this.maxRecBytesCheckRes = maxRecBytesCheckRes;
        return this;
    }

    /**
     * 最大下行带宽检查结果
     * @return maxRecBytesCheckRes
     */
    public Boolean getMaxRecBytesCheckRes() {
        return maxRecBytesCheckRes;
    }

    public void setMaxRecBytesCheckRes(Boolean maxRecBytesCheckRes) {
        this.maxRecBytesCheckRes = maxRecBytesCheckRes;
    }

    public CaseReportDetail withMaxRespTime(Integer maxRespTime) {
        this.maxRespTime = maxRespTime;
        return this;
    }

    /**
     * 最大响应时间
     * @return maxRespTime
     */
    public Integer getMaxRespTime() {
        return maxRespTime;
    }

    public void setMaxRespTime(Integer maxRespTime) {
        this.maxRespTime = maxRespTime;
    }

    public CaseReportDetail withMaxRespTimeCheckPoint(Double maxRespTimeCheckPoint) {
        this.maxRespTimeCheckPoint = maxRespTimeCheckPoint;
        return this;
    }

    /**
     * 最大响应时间检查点
     * @return maxRespTimeCheckPoint
     */
    public Double getMaxRespTimeCheckPoint() {
        return maxRespTimeCheckPoint;
    }

    public void setMaxRespTimeCheckPoint(Double maxRespTimeCheckPoint) {
        this.maxRespTimeCheckPoint = maxRespTimeCheckPoint;
    }

    public CaseReportDetail withMaxRespTimeCheckRes(Boolean maxRespTimeCheckRes) {
        this.maxRespTimeCheckRes = maxRespTimeCheckRes;
        return this;
    }

    /**
     * 最大响应时间检查结果
     * @return maxRespTimeCheckRes
     */
    public Boolean getMaxRespTimeCheckRes() {
        return maxRespTimeCheckRes;
    }

    public void setMaxRespTimeCheckRes(Boolean maxRespTimeCheckRes) {
        this.maxRespTimeCheckRes = maxRespTimeCheckRes;
    }

    public CaseReportDetail withMaxRps(Integer maxRps) {
        this.maxRps = maxRps;
        return this;
    }

    /**
     * 最大RPS
     * @return maxRps
     */
    public Integer getMaxRps() {
        return maxRps;
    }

    public void setMaxRps(Integer maxRps) {
        this.maxRps = maxRps;
    }

    public CaseReportDetail withMaxSentBytes(Integer maxSentBytes) {
        this.maxSentBytes = maxSentBytes;
        return this;
    }

    /**
     * 最大上行带宽
     * @return maxSentBytes
     */
    public Integer getMaxSentBytes() {
        return maxSentBytes;
    }

    public void setMaxSentBytes(Integer maxSentBytes) {
        this.maxSentBytes = maxSentBytes;
    }

    public CaseReportDetail withMaxSentBytesCheckPoint(Double maxSentBytesCheckPoint) {
        this.maxSentBytesCheckPoint = maxSentBytesCheckPoint;
        return this;
    }

    /**
     * 最大上行带宽检查点
     * @return maxSentBytesCheckPoint
     */
    public Double getMaxSentBytesCheckPoint() {
        return maxSentBytesCheckPoint;
    }

    public void setMaxSentBytesCheckPoint(Double maxSentBytesCheckPoint) {
        this.maxSentBytesCheckPoint = maxSentBytesCheckPoint;
    }

    public CaseReportDetail withMaxSentBytesCheckRes(Boolean maxSentBytesCheckRes) {
        this.maxSentBytesCheckRes = maxSentBytesCheckRes;
        return this;
    }

    /**
     * 最大上行带宽检查结果
     * @return maxSentBytesCheckRes
     */
    public Boolean getMaxSentBytesCheckRes() {
        return maxSentBytesCheckRes;
    }

    public void setMaxSentBytesCheckRes(Boolean maxSentBytesCheckRes) {
        this.maxSentBytesCheckRes = maxSentBytesCheckRes;
    }

    public CaseReportDetail withMaxSuccessRate(Double maxSuccessRate) {
        this.maxSuccessRate = maxSuccessRate;
        return this;
    }

    /**
     * 最大成功率
     * @return maxSuccessRate
     */
    public Double getMaxSuccessRate() {
        return maxSuccessRate;
    }

    public void setMaxSuccessRate(Double maxSuccessRate) {
        this.maxSuccessRate = maxSuccessRate;
    }

    public CaseReportDetail withMaxSuccessRateCheckRes(Boolean maxSuccessRateCheckRes) {
        this.maxSuccessRateCheckRes = maxSuccessRateCheckRes;
        return this;
    }

    /**
     * 最大成功率检查结果
     * @return maxSuccessRateCheckRes
     */
    public Boolean getMaxSuccessRateCheckRes() {
        return maxSuccessRateCheckRes;
    }

    public void setMaxSuccessRateCheckRes(Boolean maxSuccessRateCheckRes) {
        this.maxSuccessRateCheckRes = maxSuccessRateCheckRes;
    }

    public CaseReportDetail withMaxThreadNum(Double maxThreadNum) {
        this.maxThreadNum = maxThreadNum;
        return this;
    }

    /**
     * 最大线程数
     * @return maxThreadNum
     */
    public Double getMaxThreadNum() {
        return maxThreadNum;
    }

    public void setMaxThreadNum(Double maxThreadNum) {
        this.maxThreadNum = maxThreadNum;
    }

    public CaseReportDetail withMaxThreadNumCheckPoint(Double maxThreadNumCheckPoint) {
        this.maxThreadNumCheckPoint = maxThreadNumCheckPoint;
        return this;
    }

    /**
     * 最大线程数检查点
     * @return maxThreadNumCheckPoint
     */
    public Double getMaxThreadNumCheckPoint() {
        return maxThreadNumCheckPoint;
    }

    public void setMaxThreadNumCheckPoint(Double maxThreadNumCheckPoint) {
        this.maxThreadNumCheckPoint = maxThreadNumCheckPoint;
    }

    public CaseReportDetail withMaxThreadNumCheckRes(Boolean maxThreadNumCheckRes) {
        this.maxThreadNumCheckRes = maxThreadNumCheckRes;
        return this;
    }

    /**
     * 最大线程数检查结果
     * @return maxThreadNumCheckRes
     */
    public Boolean getMaxThreadNumCheckRes() {
        return maxThreadNumCheckRes;
    }

    public void setMaxThreadNumCheckRes(Boolean maxThreadNumCheckRes) {
        this.maxThreadNumCheckRes = maxThreadNumCheckRes;
    }

    public CaseReportDetail withMaxTps(Double maxTps) {
        this.maxTps = maxTps;
        return this;
    }

    /**
     * 最大TPS
     * @return maxTps
     */
    public Double getMaxTps() {
        return maxTps;
    }

    public void setMaxTps(Double maxTps) {
        this.maxTps = maxTps;
    }

    public CaseReportDetail withMaxTpsCheckPoint(Double maxTpsCheckPoint) {
        this.maxTpsCheckPoint = maxTpsCheckPoint;
        return this;
    }

    /**
     * 最大TPS检查点
     * @return maxTpsCheckPoint
     */
    public Double getMaxTpsCheckPoint() {
        return maxTpsCheckPoint;
    }

    public void setMaxTpsCheckPoint(Double maxTpsCheckPoint) {
        this.maxTpsCheckPoint = maxTpsCheckPoint;
    }

    public CaseReportDetail withMaxTpsCheckRes(Boolean maxTpsCheckRes) {
        this.maxTpsCheckRes = maxTpsCheckRes;
        return this;
    }

    /**
     * 最大TPS检查结果
     * @return maxTpsCheckRes
     */
    public Boolean getMaxTpsCheckRes() {
        return maxTpsCheckRes;
    }

    public void setMaxTpsCheckRes(Boolean maxTpsCheckRes) {
        this.maxTpsCheckRes = maxTpsCheckRes;
    }

    public CaseReportDetail withMaxTranRespTime(Double maxTranRespTime) {
        this.maxTranRespTime = maxTranRespTime;
        return this;
    }

    /**
     * 最大事务响应时间
     * @return maxTranRespTime
     */
    public Double getMaxTranRespTime() {
        return maxTranRespTime;
    }

    public void setMaxTranRespTime(Double maxTranRespTime) {
        this.maxTranRespTime = maxTranRespTime;
    }

    public CaseReportDetail withMaxTranRespTimeCheckPoint(Double maxTranRespTimeCheckPoint) {
        this.maxTranRespTimeCheckPoint = maxTranRespTimeCheckPoint;
        return this;
    }

    /**
     * 最大事务响应时间检查点
     * @return maxTranRespTimeCheckPoint
     */
    public Double getMaxTranRespTimeCheckPoint() {
        return maxTranRespTimeCheckPoint;
    }

    public void setMaxTranRespTimeCheckPoint(Double maxTranRespTimeCheckPoint) {
        this.maxTranRespTimeCheckPoint = maxTranRespTimeCheckPoint;
    }

    public CaseReportDetail withMaxTranRespTimeCheckRes(Boolean maxTranRespTimeCheckRes) {
        this.maxTranRespTimeCheckRes = maxTranRespTimeCheckRes;
        return this;
    }

    /**
     * 最大事务响应时间检查结果
     * @return maxTranRespTimeCheckRes
     */
    public Boolean getMaxTranRespTimeCheckRes() {
        return maxTranRespTimeCheckRes;
    }

    public void setMaxTranRespTimeCheckRes(Boolean maxTranRespTimeCheckRes) {
        this.maxTranRespTimeCheckRes = maxTranRespTimeCheckRes;
    }

    public CaseReportDetail withMemoryUsage(Double memoryUsage) {
        this.memoryUsage = memoryUsage;
        return this;
    }

    /**
     * 最大内存使用率
     * @return memoryUsage
     */
    public Double getMemoryUsage() {
        return memoryUsage;
    }

    public void setMemoryUsage(Double memoryUsage) {
        this.memoryUsage = memoryUsage;
    }

    public CaseReportDetail withMemoryUsageAvg(Double memoryUsageAvg) {
        this.memoryUsageAvg = memoryUsageAvg;
        return this;
    }

    /**
     * 平均内存使用率
     * @return memoryUsageAvg
     */
    public Double getMemoryUsageAvg() {
        return memoryUsageAvg;
    }

    public void setMemoryUsageAvg(Double memoryUsageAvg) {
        this.memoryUsageAvg = memoryUsageAvg;
    }

    public CaseReportDetail withMemoryUsageAvgCheckPoint(Double memoryUsageAvgCheckPoint) {
        this.memoryUsageAvgCheckPoint = memoryUsageAvgCheckPoint;
        return this;
    }

    /**
     * 平均内存使用率检查点
     * @return memoryUsageAvgCheckPoint
     */
    public Double getMemoryUsageAvgCheckPoint() {
        return memoryUsageAvgCheckPoint;
    }

    public void setMemoryUsageAvgCheckPoint(Double memoryUsageAvgCheckPoint) {
        this.memoryUsageAvgCheckPoint = memoryUsageAvgCheckPoint;
    }

    public CaseReportDetail withMemoryUsageAvgCheckRes(Boolean memoryUsageAvgCheckRes) {
        this.memoryUsageAvgCheckRes = memoryUsageAvgCheckRes;
        return this;
    }

    /**
     * 平均内存使用率检查结果
     * @return memoryUsageAvgCheckRes
     */
    public Boolean getMemoryUsageAvgCheckRes() {
        return memoryUsageAvgCheckRes;
    }

    public void setMemoryUsageAvgCheckRes(Boolean memoryUsageAvgCheckRes) {
        this.memoryUsageAvgCheckRes = memoryUsageAvgCheckRes;
    }

    public CaseReportDetail withMemoryUsageCheckPoint(Double memoryUsageCheckPoint) {
        this.memoryUsageCheckPoint = memoryUsageCheckPoint;
        return this;
    }

    /**
     * 最大内存使用率检查点
     * @return memoryUsageCheckPoint
     */
    public Double getMemoryUsageCheckPoint() {
        return memoryUsageCheckPoint;
    }

    public void setMemoryUsageCheckPoint(Double memoryUsageCheckPoint) {
        this.memoryUsageCheckPoint = memoryUsageCheckPoint;
    }

    public CaseReportDetail withMemoryUsageCheckRes(Boolean memoryUsageCheckRes) {
        this.memoryUsageCheckRes = memoryUsageCheckRes;
        return this;
    }

    /**
     * 最大内存使用率检查结果
     * @return memoryUsageCheckRes
     */
    public Boolean getMemoryUsageCheckRes() {
        return memoryUsageCheckRes;
    }

    public void setMemoryUsageCheckRes(Boolean memoryUsageCheckRes) {
        this.memoryUsageCheckRes = memoryUsageCheckRes;
    }

    public CaseReportDetail withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * 最小响应时间
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public CaseReportDetail withMinNetworkTraffic(Integer minNetworkTraffic) {
        this.minNetworkTraffic = minNetworkTraffic;
        return this;
    }

    /**
     * 流量谷值
     * @return minNetworkTraffic
     */
    public Integer getMinNetworkTraffic() {
        return minNetworkTraffic;
    }

    public void setMinNetworkTraffic(Integer minNetworkTraffic) {
        this.minNetworkTraffic = minNetworkTraffic;
    }

    public CaseReportDetail withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 压力模式
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public CaseReportDetail withMonitorPeakTime(Double monitorPeakTime) {
        this.monitorPeakTime = monitorPeakTime;
        return this;
    }

    /**
     * 监控峰值时间
     * @return monitorPeakTime
     */
    public Double getMonitorPeakTime() {
        return monitorPeakTime;
    }

    public void setMonitorPeakTime(Double monitorPeakTime) {
        this.monitorPeakTime = monitorPeakTime;
    }

    public CaseReportDetail withMonitorPeakTimeCheckPoint(Double monitorPeakTimeCheckPoint) {
        this.monitorPeakTimeCheckPoint = monitorPeakTimeCheckPoint;
        return this;
    }

    /**
     * 监控峰值时间检查点
     * @return monitorPeakTimeCheckPoint
     */
    public Double getMonitorPeakTimeCheckPoint() {
        return monitorPeakTimeCheckPoint;
    }

    public void setMonitorPeakTimeCheckPoint(Double monitorPeakTimeCheckPoint) {
        this.monitorPeakTimeCheckPoint = monitorPeakTimeCheckPoint;
    }

    public CaseReportDetail withMonitorPeakTimeCheckRes(Boolean monitorPeakTimeCheckRes) {
        this.monitorPeakTimeCheckRes = monitorPeakTimeCheckRes;
        return this;
    }

    /**
     * 监控峰值时间检查结果
     * @return monitorPeakTimeCheckRes
     */
    public Boolean getMonitorPeakTimeCheckRes() {
        return monitorPeakTimeCheckRes;
    }

    public void setMonitorPeakTimeCheckRes(Boolean monitorPeakTimeCheckRes) {
        this.monitorPeakTimeCheckRes = monitorPeakTimeCheckRes;
    }

    public CaseReportDetail withMonitorResult(Double monitorResult) {
        this.monitorResult = monitorResult;
        return this;
    }

    /**
     * 监控结果
     * @return monitorResult
     */
    public Double getMonitorResult() {
        return monitorResult;
    }

    public void setMonitorResult(Double monitorResult) {
        this.monitorResult = monitorResult;
    }

    public CaseReportDetail withMonitorResultCheckPoint(Double monitorResultCheckPoint) {
        this.monitorResultCheckPoint = monitorResultCheckPoint;
        return this;
    }

    /**
     * 监控结果检查点
     * @return monitorResultCheckPoint
     */
    public Double getMonitorResultCheckPoint() {
        return monitorResultCheckPoint;
    }

    public void setMonitorResultCheckPoint(Double monitorResultCheckPoint) {
        this.monitorResultCheckPoint = monitorResultCheckPoint;
    }

    public CaseReportDetail withMonitorResultCheckRes(Boolean monitorResultCheckRes) {
        this.monitorResultCheckRes = monitorResultCheckRes;
        return this;
    }

    /**
     * 监控结果检查结果
     * @return monitorResultCheckRes
     */
    public Boolean getMonitorResultCheckRes() {
        return monitorResultCheckRes;
    }

    public void setMonitorResultCheckRes(Boolean monitorResultCheckRes) {
        this.monitorResultCheckRes = monitorResultCheckRes;
    }

    public CaseReportDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用例/aw/事务名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CaseReportDetail withNetworkRead(Double networkRead) {
        this.networkRead = networkRead;
        return this;
    }

    /**
     * 网络最大接收数据速度
     * @return networkRead
     */
    public Double getNetworkRead() {
        return networkRead;
    }

    public void setNetworkRead(Double networkRead) {
        this.networkRead = networkRead;
    }

    public CaseReportDetail withNetworkReadAvg(Double networkReadAvg) {
        this.networkReadAvg = networkReadAvg;
        return this;
    }

    /**
     * 网络平均接收数据速度
     * @return networkReadAvg
     */
    public Double getNetworkReadAvg() {
        return networkReadAvg;
    }

    public void setNetworkReadAvg(Double networkReadAvg) {
        this.networkReadAvg = networkReadAvg;
    }

    public CaseReportDetail withNetworkReadAvgCheckPoint(Double networkReadAvgCheckPoint) {
        this.networkReadAvgCheckPoint = networkReadAvgCheckPoint;
        return this;
    }

    /**
     * 网络平均接收数据速度检查点
     * @return networkReadAvgCheckPoint
     */
    public Double getNetworkReadAvgCheckPoint() {
        return networkReadAvgCheckPoint;
    }

    public void setNetworkReadAvgCheckPoint(Double networkReadAvgCheckPoint) {
        this.networkReadAvgCheckPoint = networkReadAvgCheckPoint;
    }

    public CaseReportDetail withNetworkReadAvgCheckRes(Boolean networkReadAvgCheckRes) {
        this.networkReadAvgCheckRes = networkReadAvgCheckRes;
        return this;
    }

    /**
     * 网络平均接收数据速度检查结果
     * @return networkReadAvgCheckRes
     */
    public Boolean getNetworkReadAvgCheckRes() {
        return networkReadAvgCheckRes;
    }

    public void setNetworkReadAvgCheckRes(Boolean networkReadAvgCheckRes) {
        this.networkReadAvgCheckRes = networkReadAvgCheckRes;
    }

    public CaseReportDetail withNetworkReadCheckPoint(Double networkReadCheckPoint) {
        this.networkReadCheckPoint = networkReadCheckPoint;
        return this;
    }

    /**
     * 网络最大接收数据速度检查点
     * @return networkReadCheckPoint
     */
    public Double getNetworkReadCheckPoint() {
        return networkReadCheckPoint;
    }

    public void setNetworkReadCheckPoint(Double networkReadCheckPoint) {
        this.networkReadCheckPoint = networkReadCheckPoint;
    }

    public CaseReportDetail withNetworkReadCheckRes(Boolean networkReadCheckRes) {
        this.networkReadCheckRes = networkReadCheckRes;
        return this;
    }

    /**
     * 网络最大接收数据速度检查结果
     * @return networkReadCheckRes
     */
    public Boolean getNetworkReadCheckRes() {
        return networkReadCheckRes;
    }

    public void setNetworkReadCheckRes(Boolean networkReadCheckRes) {
        this.networkReadCheckRes = networkReadCheckRes;
    }

    public CaseReportDetail withNetworkWrite(Double networkWrite) {
        this.networkWrite = networkWrite;
        return this;
    }

    /**
     * 网络最大写入数据速度
     * @return networkWrite
     */
    public Double getNetworkWrite() {
        return networkWrite;
    }

    public void setNetworkWrite(Double networkWrite) {
        this.networkWrite = networkWrite;
    }

    public CaseReportDetail withNetworkWriteAvg(Double networkWriteAvg) {
        this.networkWriteAvg = networkWriteAvg;
        return this;
    }

    /**
     * 网络平均写入数据速度
     * @return networkWriteAvg
     */
    public Double getNetworkWriteAvg() {
        return networkWriteAvg;
    }

    public void setNetworkWriteAvg(Double networkWriteAvg) {
        this.networkWriteAvg = networkWriteAvg;
    }

    public CaseReportDetail withNetworkWriteAvgCheckPoint(Double networkWriteAvgCheckPoint) {
        this.networkWriteAvgCheckPoint = networkWriteAvgCheckPoint;
        return this;
    }

    /**
     * 网络平均写入数据速度检查点
     * @return networkWriteAvgCheckPoint
     */
    public Double getNetworkWriteAvgCheckPoint() {
        return networkWriteAvgCheckPoint;
    }

    public void setNetworkWriteAvgCheckPoint(Double networkWriteAvgCheckPoint) {
        this.networkWriteAvgCheckPoint = networkWriteAvgCheckPoint;
    }

    public CaseReportDetail withNetworkWriteAvgCheckRes(Boolean networkWriteAvgCheckRes) {
        this.networkWriteAvgCheckRes = networkWriteAvgCheckRes;
        return this;
    }

    /**
     * 网络平均写入数据速度检查结果
     * @return networkWriteAvgCheckRes
     */
    public Boolean getNetworkWriteAvgCheckRes() {
        return networkWriteAvgCheckRes;
    }

    public void setNetworkWriteAvgCheckRes(Boolean networkWriteAvgCheckRes) {
        this.networkWriteAvgCheckRes = networkWriteAvgCheckRes;
    }

    public CaseReportDetail withNetworkWriteCheckPoint(Double networkWriteCheckPoint) {
        this.networkWriteCheckPoint = networkWriteCheckPoint;
        return this;
    }

    /**
     * 网络最大写入数据速度检查点
     * @return networkWriteCheckPoint
     */
    public Double getNetworkWriteCheckPoint() {
        return networkWriteCheckPoint;
    }

    public void setNetworkWriteCheckPoint(Double networkWriteCheckPoint) {
        this.networkWriteCheckPoint = networkWriteCheckPoint;
    }

    public CaseReportDetail withNetworkWriteCheckRes(Boolean networkWriteCheckRes) {
        this.networkWriteCheckRes = networkWriteCheckRes;
        return this;
    }

    /**
     * 网络最大写入数据速度检查结果
     * @return networkWriteCheckRes
     */
    public Boolean getNetworkWriteCheckRes() {
        return networkWriteCheckRes;
    }

    public void setNetworkWriteCheckRes(Boolean networkWriteCheckRes) {
        this.networkWriteCheckRes = networkWriteCheckRes;
    }

    public CaseReportDetail withPeakLoadStatus(Double peakLoadStatus) {
        this.peakLoadStatus = peakLoadStatus;
        return this;
    }

    /**
     * 峰值负载状态
     * @return peakLoadStatus
     */
    public Double getPeakLoadStatus() {
        return peakLoadStatus;
    }

    public void setPeakLoadStatus(Double peakLoadStatus) {
        this.peakLoadStatus = peakLoadStatus;
    }

    public CaseReportDetail withPeakLoadStatusCheckPoint(Double peakLoadStatusCheckPoint) {
        this.peakLoadStatusCheckPoint = peakLoadStatusCheckPoint;
        return this;
    }

    /**
     * 峰值负载状态检查点
     * @return peakLoadStatusCheckPoint
     */
    public Double getPeakLoadStatusCheckPoint() {
        return peakLoadStatusCheckPoint;
    }

    public void setPeakLoadStatusCheckPoint(Double peakLoadStatusCheckPoint) {
        this.peakLoadStatusCheckPoint = peakLoadStatusCheckPoint;
    }

    public CaseReportDetail withPeakLoadStatusCheckRes(Boolean peakLoadStatusCheckRes) {
        this.peakLoadStatusCheckRes = peakLoadStatusCheckRes;
        return this;
    }

    /**
     * 峰值负载状态检查结果
     * @return peakLoadStatusCheckRes
     */
    public Boolean getPeakLoadStatusCheckRes() {
        return peakLoadStatusCheckRes;
    }

    public void setPeakLoadStatusCheckRes(Boolean peakLoadStatusCheckRes) {
        this.peakLoadStatusCheckRes = peakLoadStatusCheckRes;
    }

    public CaseReportDetail withPeakMetric(PeakMetric peakMetric) {
        this.peakMetric = peakMetric;
        return this;
    }

    public CaseReportDetail withPeakMetric(Consumer<PeakMetric> peakMetricSetter) {
        if (this.peakMetric == null) {
            this.peakMetric = new PeakMetric();
            peakMetricSetter.accept(this.peakMetric);
        }

        return this;
    }

    /**
     * Get peakMetric
     * @return peakMetric
     */
    public PeakMetric getPeakMetric() {
        return peakMetric;
    }

    public void setPeakMetric(PeakMetric peakMetric) {
        this.peakMetric = peakMetric;
    }

    public CaseReportDetail withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 工程ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CaseReportDetail withProtocols(List<String> protocols) {
        this.protocols = protocols;
        return this;
    }

    public CaseReportDetail addProtocolsItem(String protocolsItem) {
        if (this.protocols == null) {
            this.protocols = new ArrayList<>();
        }
        this.protocols.add(protocolsItem);
        return this;
    }

    public CaseReportDetail withProtocols(Consumer<List<String>> protocolsSetter) {
        if (this.protocols == null) {
            this.protocols = new ArrayList<>();
        }
        protocolsSetter.accept(this.protocols);
        return this;
    }

    /**
     * 协议
     * @return protocols
     */
    public List<String> getProtocols() {
        return protocols;
    }

    public void setProtocols(List<String> protocols) {
        this.protocols = protocols;
    }

    public CaseReportDetail withRequests(Integer requests) {
        this.requests = requests;
        return this;
    }

    /**
     * 请求数
     * @return requests
     */
    public Integer getRequests() {
        return requests;
    }

    public void setRequests(Integer requests) {
        this.requests = requests;
    }

    public CaseReportDetail withResult(Integer result) {
        this.result = result;
        return this;
    }

    /**
     * 用例结果
     * @return result
     */
    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public CaseReportDetail withResultLog(String resultLog) {
        this.resultLog = resultLog;
        return this;
    }

    /**
     * 用例结果日志
     * @return resultLog
     */
    public String getResultLog() {
        return resultLog;
    }

    public void setResultLog(String resultLog) {
        this.resultLog = resultLog;
    }

    public CaseReportDetail withRound(Integer round) {
        this.round = round;
        return this;
    }

    /**
     * 执行轮次
     * @return round
     */
    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public CaseReportDetail withSaveAllData(Boolean saveAllData) {
        this.saveAllData = saveAllData;
        return this;
    }

    /**
     * 是否存储全量数据到CSS
     * @return saveAllData
     */
    public Boolean getSaveAllData() {
        return saveAllData;
    }

    public void setSaveAllData(Boolean saveAllData) {
        this.saveAllData = saveAllData;
    }

    public CaseReportDetail withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 服务ID
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public CaseReportDetail withStage(Integer stage) {
        this.stage = stage;
        return this;
    }

    /**
     * 阶段
     * @return stage
     */
    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    public CaseReportDetail withStartTime(String startTime) {
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

    public CaseReportDetail withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public CaseReportDetail withStreamingMediaVo(StreamingMediaReport streamingMediaVo) {
        this.streamingMediaVo = streamingMediaVo;
        return this;
    }

    public CaseReportDetail withStreamingMediaVo(Consumer<StreamingMediaReport> streamingMediaVoSetter) {
        if (this.streamingMediaVo == null) {
            this.streamingMediaVo = new StreamingMediaReport();
            streamingMediaVoSetter.accept(this.streamingMediaVo);
        }

        return this;
    }

    /**
     * Get streamingMediaVo
     * @return streamingMediaVo
     */
    public StreamingMediaReport getStreamingMediaVo() {
        return streamingMediaVo;
    }

    public void setStreamingMediaVo(StreamingMediaReport streamingMediaVo) {
        this.streamingMediaVo = streamingMediaVo;
    }

    public CaseReportDetail withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * 成功数
     * @return successCount
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public CaseReportDetail withSuccessRate(Integer successRate) {
        this.successRate = successRate;
        return this;
    }

    /**
     * 成功率
     * @return successRate
     */
    public Integer getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(Integer successRate) {
        this.successRate = successRate;
    }

    public CaseReportDetail withSuccessRateCheckPoint(Double successRateCheckPoint) {
        this.successRateCheckPoint = successRateCheckPoint;
        return this;
    }

    /**
     * 成功率检查点
     * @return successRateCheckPoint
     */
    public Double getSuccessRateCheckPoint() {
        return successRateCheckPoint;
    }

    public void setSuccessRateCheckPoint(Double successRateCheckPoint) {
        this.successRateCheckPoint = successRateCheckPoint;
    }

    public CaseReportDetail withSuccessRateCheckRes(Boolean successRateCheckRes) {
        this.successRateCheckRes = successRateCheckRes;
        return this;
    }

    /**
     * 成功率检查结果
     * @return successRateCheckRes
     */
    public Boolean getSuccessRateCheckRes() {
        return successRateCheckRes;
    }

    public void setSuccessRateCheckRes(Boolean successRateCheckRes) {
        this.successRateCheckRes = successRateCheckRes;
    }

    public CaseReportDetail withSum1xx(Integer sum1xx) {
        this.sum1xx = sum1xx;
        return this;
    }

    /**
     * 1XX响应码数量
     * @return sum1xx
     */
    public Integer getSum1xx() {
        return sum1xx;
    }

    public void setSum1xx(Integer sum1xx) {
        this.sum1xx = sum1xx;
    }

    public CaseReportDetail withSum2xx(Integer sum2xx) {
        this.sum2xx = sum2xx;
        return this;
    }

    /**
     * 2XX响应码数量
     * @return sum2xx
     */
    public Integer getSum2xx() {
        return sum2xx;
    }

    public void setSum2xx(Integer sum2xx) {
        this.sum2xx = sum2xx;
    }

    public CaseReportDetail withSum3xx(Integer sum3xx) {
        this.sum3xx = sum3xx;
        return this;
    }

    /**
     * 3XX响应码数量
     * @return sum3xx
     */
    public Integer getSum3xx() {
        return sum3xx;
    }

    public void setSum3xx(Integer sum3xx) {
        this.sum3xx = sum3xx;
    }

    public CaseReportDetail withSum4xx(Integer sum4xx) {
        this.sum4xx = sum4xx;
        return this;
    }

    /**
     * 4XX响应码数量
     * @return sum4xx
     */
    public Integer getSum4xx() {
        return sum4xx;
    }

    public void setSum4xx(Integer sum4xx) {
        this.sum4xx = sum4xx;
    }

    public CaseReportDetail withSum5xx(Integer sum5xx) {
        this.sum5xx = sum5xx;
        return this;
    }

    /**
     * 5XX响应码数量
     * @return sum5xx
     */
    public Integer getSum5xx() {
        return sum5xx;
    }

    public void setSum5xx(Integer sum5xx) {
        this.sum5xx = sum5xx;
    }

    public CaseReportDetail withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public CaseReportDetail withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public CaseReportDetail withTaskProjectId(String taskProjectId) {
        this.taskProjectId = taskProjectId;
        return this;
    }

    /**
     * 任务项目ID
     * @return taskProjectId
     */
    public String getTaskProjectId() {
        return taskProjectId;
    }

    public void setTaskProjectId(String taskProjectId) {
        this.taskProjectId = taskProjectId;
    }

    public CaseReportDetail withTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态
     * @return taskStatus
     */
    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public CaseReportDetail withTestCaseUri(String testCaseUri) {
        this.testCaseUri = testCaseUri;
        return this;
    }

    /**
     * 用例基线uri
     * @return testCaseUri
     */
    public String getTestCaseUri() {
        return testCaseUri;
    }

    public void setTestCaseUri(String testCaseUri) {
        this.testCaseUri = testCaseUri;
    }

    public CaseReportDetail withTp50(Integer tp50) {
        this.tp50 = tp50;
        return this;
    }

    /**
     * TP50
     * @return tp50
     */
    public Integer getTp50() {
        return tp50;
    }

    public void setTp50(Integer tp50) {
        this.tp50 = tp50;
    }

    public CaseReportDetail withTp50CheckPoint(Double tp50CheckPoint) {
        this.tp50CheckPoint = tp50CheckPoint;
        return this;
    }

    /**
     * TP50检查点
     * @return tp50CheckPoint
     */
    public Double getTp50CheckPoint() {
        return tp50CheckPoint;
    }

    public void setTp50CheckPoint(Double tp50CheckPoint) {
        this.tp50CheckPoint = tp50CheckPoint;
    }

    public CaseReportDetail withTp50CheckRes(Boolean tp50CheckRes) {
        this.tp50CheckRes = tp50CheckRes;
        return this;
    }

    /**
     * TP50检查结果
     * @return tp50CheckRes
     */
    public Boolean getTp50CheckRes() {
        return tp50CheckRes;
    }

    public void setTp50CheckRes(Boolean tp50CheckRes) {
        this.tp50CheckRes = tp50CheckRes;
    }

    public CaseReportDetail withTp75(Integer tp75) {
        this.tp75 = tp75;
        return this;
    }

    /**
     * TP75
     * @return tp75
     */
    public Integer getTp75() {
        return tp75;
    }

    public void setTp75(Integer tp75) {
        this.tp75 = tp75;
    }

    public CaseReportDetail withTp75CheckPoint(Double tp75CheckPoint) {
        this.tp75CheckPoint = tp75CheckPoint;
        return this;
    }

    /**
     * TP75检查点
     * @return tp75CheckPoint
     */
    public Double getTp75CheckPoint() {
        return tp75CheckPoint;
    }

    public void setTp75CheckPoint(Double tp75CheckPoint) {
        this.tp75CheckPoint = tp75CheckPoint;
    }

    public CaseReportDetail withTp75CheckRes(Boolean tp75CheckRes) {
        this.tp75CheckRes = tp75CheckRes;
        return this;
    }

    /**
     * TP75检查结果
     * @return tp75CheckRes
     */
    public Boolean getTp75CheckRes() {
        return tp75CheckRes;
    }

    public void setTp75CheckRes(Boolean tp75CheckRes) {
        this.tp75CheckRes = tp75CheckRes;
    }

    public CaseReportDetail withTp85(Integer tp85) {
        this.tp85 = tp85;
        return this;
    }

    /**
     * TP85
     * @return tp85
     */
    public Integer getTp85() {
        return tp85;
    }

    public void setTp85(Integer tp85) {
        this.tp85 = tp85;
    }

    public CaseReportDetail withTp85CheckPoint(Double tp85CheckPoint) {
        this.tp85CheckPoint = tp85CheckPoint;
        return this;
    }

    /**
     * TP85检查点
     * @return tp85CheckPoint
     */
    public Double getTp85CheckPoint() {
        return tp85CheckPoint;
    }

    public void setTp85CheckPoint(Double tp85CheckPoint) {
        this.tp85CheckPoint = tp85CheckPoint;
    }

    public CaseReportDetail withTp85CheckRes(Boolean tp85CheckRes) {
        this.tp85CheckRes = tp85CheckRes;
        return this;
    }

    /**
     * TP85检查结果
     * @return tp85CheckRes
     */
    public Boolean getTp85CheckRes() {
        return tp85CheckRes;
    }

    public void setTp85CheckRes(Boolean tp85CheckRes) {
        this.tp85CheckRes = tp85CheckRes;
    }

    public CaseReportDetail withTp90(Integer tp90) {
        this.tp90 = tp90;
        return this;
    }

    /**
     * TP90
     * @return tp90
     */
    public Integer getTp90() {
        return tp90;
    }

    public void setTp90(Integer tp90) {
        this.tp90 = tp90;
    }

    public CaseReportDetail withTp90CheckPoint(Double tp90CheckPoint) {
        this.tp90CheckPoint = tp90CheckPoint;
        return this;
    }

    /**
     * TP90检查点
     * @return tp90CheckPoint
     */
    public Double getTp90CheckPoint() {
        return tp90CheckPoint;
    }

    public void setTp90CheckPoint(Double tp90CheckPoint) {
        this.tp90CheckPoint = tp90CheckPoint;
    }

    public CaseReportDetail withTp90CheckRes(Boolean tp90CheckRes) {
        this.tp90CheckRes = tp90CheckRes;
        return this;
    }

    /**
     * TP90检查结果
     * @return tp90CheckRes
     */
    public Boolean getTp90CheckRes() {
        return tp90CheckRes;
    }

    public void setTp90CheckRes(Boolean tp90CheckRes) {
        this.tp90CheckRes = tp90CheckRes;
    }

    public CaseReportDetail withTp95(Integer tp95) {
        this.tp95 = tp95;
        return this;
    }

    /**
     * TP95
     * @return tp95
     */
    public Integer getTp95() {
        return tp95;
    }

    public void setTp95(Integer tp95) {
        this.tp95 = tp95;
    }

    public CaseReportDetail withTp95CheckPoint(Double tp95CheckPoint) {
        this.tp95CheckPoint = tp95CheckPoint;
        return this;
    }

    /**
     * TP95检查点
     * @return tp95CheckPoint
     */
    public Double getTp95CheckPoint() {
        return tp95CheckPoint;
    }

    public void setTp95CheckPoint(Double tp95CheckPoint) {
        this.tp95CheckPoint = tp95CheckPoint;
    }

    public CaseReportDetail withTp95CheckRes(Boolean tp95CheckRes) {
        this.tp95CheckRes = tp95CheckRes;
        return this;
    }

    /**
     * TP95检查结果
     * @return tp95CheckRes
     */
    public Boolean getTp95CheckRes() {
        return tp95CheckRes;
    }

    public void setTp95CheckRes(Boolean tp95CheckRes) {
        this.tp95CheckRes = tp95CheckRes;
    }

    public CaseReportDetail withTp99(Integer tp99) {
        this.tp99 = tp99;
        return this;
    }

    /**
     * TP99
     * @return tp99
     */
    public Integer getTp99() {
        return tp99;
    }

    public void setTp99(Integer tp99) {
        this.tp99 = tp99;
    }

    public CaseReportDetail withTp999(Integer tp999) {
        this.tp999 = tp999;
        return this;
    }

    /**
     * TP99.9
     * @return tp999
     */
    public Integer getTp999() {
        return tp999;
    }

    public void setTp999(Integer tp999) {
        this.tp999 = tp999;
    }

    public CaseReportDetail withTp9999(Integer tp9999) {
        this.tp9999 = tp9999;
        return this;
    }

    /**
     * TP99.99
     * @return tp9999
     */
    public Integer getTp9999() {
        return tp9999;
    }

    public void setTp9999(Integer tp9999) {
        this.tp9999 = tp9999;
    }

    public CaseReportDetail withTp9999CheckPoint(Double tp9999CheckPoint) {
        this.tp9999CheckPoint = tp9999CheckPoint;
        return this;
    }

    /**
     * TP99.99检查点
     * @return tp9999CheckPoint
     */
    public Double getTp9999CheckPoint() {
        return tp9999CheckPoint;
    }

    public void setTp9999CheckPoint(Double tp9999CheckPoint) {
        this.tp9999CheckPoint = tp9999CheckPoint;
    }

    public CaseReportDetail withTp9999CheckRes(Boolean tp9999CheckRes) {
        this.tp9999CheckRes = tp9999CheckRes;
        return this;
    }

    /**
     * TP99.99检查结果
     * @return tp9999CheckRes
     */
    public Boolean getTp9999CheckRes() {
        return tp9999CheckRes;
    }

    public void setTp9999CheckRes(Boolean tp9999CheckRes) {
        this.tp9999CheckRes = tp9999CheckRes;
    }

    public CaseReportDetail withTp999CheckPoint(Double tp999CheckPoint) {
        this.tp999CheckPoint = tp999CheckPoint;
        return this;
    }

    /**
     * TP99.9检查点
     * @return tp999CheckPoint
     */
    public Double getTp999CheckPoint() {
        return tp999CheckPoint;
    }

    public void setTp999CheckPoint(Double tp999CheckPoint) {
        this.tp999CheckPoint = tp999CheckPoint;
    }

    public CaseReportDetail withTp999CheckRes(Boolean tp999CheckRes) {
        this.tp999CheckRes = tp999CheckRes;
        return this;
    }

    /**
     * TP99.9检查结果
     * @return tp999CheckRes
     */
    public Boolean getTp999CheckRes() {
        return tp999CheckRes;
    }

    public void setTp999CheckRes(Boolean tp999CheckRes) {
        this.tp999CheckRes = tp999CheckRes;
    }

    public CaseReportDetail withTp99CheckPoint(Double tp99CheckPoint) {
        this.tp99CheckPoint = tp99CheckPoint;
        return this;
    }

    /**
     * TP99检查点
     * @return tp99CheckPoint
     */
    public Double getTp99CheckPoint() {
        return tp99CheckPoint;
    }

    public void setTp99CheckPoint(Double tp99CheckPoint) {
        this.tp99CheckPoint = tp99CheckPoint;
    }

    public CaseReportDetail withTp99CheckRes(Boolean tp99CheckRes) {
        this.tp99CheckRes = tp99CheckRes;
        return this;
    }

    /**
     * TP99检查结果
     * @return tp99CheckRes
     */
    public Boolean getTp99CheckRes() {
        return tp99CheckRes;
    }

    public void setTp99CheckRes(Boolean tp99CheckRes) {
        this.tp99CheckRes = tp99CheckRes;
    }

    public CaseReportDetail withTps(Double tps) {
        this.tps = tps;
        return this;
    }

    /**
     * TPS
     * @return tps
     */
    public Double getTps() {
        return tps;
    }

    public void setTps(Double tps) {
        this.tps = tps;
    }

    public CaseReportDetail withTpsCheckPoint(Double tpsCheckPoint) {
        this.tpsCheckPoint = tpsCheckPoint;
        return this;
    }

    /**
     * TPS检查点
     * @return tpsCheckPoint
     */
    public Double getTpsCheckPoint() {
        return tpsCheckPoint;
    }

    public void setTpsCheckPoint(Double tpsCheckPoint) {
        this.tpsCheckPoint = tpsCheckPoint;
    }

    public CaseReportDetail withTpsCheckRes(Boolean tpsCheckRes) {
        this.tpsCheckRes = tpsCheckRes;
        return this;
    }

    /**
     * TPS检查结果
     * @return tpsCheckRes
     */
    public Boolean getTpsCheckRes() {
        return tpsCheckRes;
    }

    public void setTpsCheckRes(Boolean tpsCheckRes) {
        this.tpsCheckRes = tpsCheckRes;
    }

    public CaseReportDetail withTranTPS(Double tranTPS) {
        this.tranTPS = tranTPS;
        return this;
    }

    /**
     * 平均TPS
     * @return tranTPS
     */
    public Double getTranTPS() {
        return tranTPS;
    }

    public void setTranTPS(Double tranTPS) {
        this.tranTPS = tranTPS;
    }

    public CaseReportDetail withTranTPSCheckPoint(Double tranTPSCheckPoint) {
        this.tranTPSCheckPoint = tranTPSCheckPoint;
        return this;
    }

    /**
     * 平均TPS检查点
     * @return tranTPSCheckPoint
     */
    public Double getTranTPSCheckPoint() {
        return tranTPSCheckPoint;
    }

    public void setTranTPSCheckPoint(Double tranTPSCheckPoint) {
        this.tranTPSCheckPoint = tranTPSCheckPoint;
    }

    public CaseReportDetail withTranTPSCheckRes(Boolean tranTPSCheckRes) {
        this.tranTPSCheckRes = tranTPSCheckRes;
        return this;
    }

    /**
     * 平均TPS检查结果
     * @return tranTPSCheckRes
     */
    public Boolean getTranTPSCheckRes() {
        return tranTPSCheckRes;
    }

    public void setTranTPSCheckRes(Boolean tranTPSCheckRes) {
        this.tranTPSCheckRes = tranTPSCheckRes;
    }

    public CaseReportDetail withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * 事务ID
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public CaseReportDetail withTransactionSuccess(Double transactionSuccess) {
        this.transactionSuccess = transactionSuccess;
        return this;
    }

    /**
     * 事务成功数
     * @return transactionSuccess
     */
    public Double getTransactionSuccess() {
        return transactionSuccess;
    }

    public void setTransactionSuccess(Double transactionSuccess) {
        this.transactionSuccess = transactionSuccess;
    }

    public CaseReportDetail withTransactions(Double transactions) {
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

    public CaseReportDetail withTransactionsCheckPoint(Double transactionsCheckPoint) {
        this.transactionsCheckPoint = transactionsCheckPoint;
        return this;
    }

    /**
     * 事务数检查点
     * @return transactionsCheckPoint
     */
    public Double getTransactionsCheckPoint() {
        return transactionsCheckPoint;
    }

    public void setTransactionsCheckPoint(Double transactionsCheckPoint) {
        this.transactionsCheckPoint = transactionsCheckPoint;
    }

    public CaseReportDetail withTransactionsCheckRes(Boolean transactionsCheckRes) {
        this.transactionsCheckRes = transactionsCheckRes;
        return this;
    }

    /**
     * 事务数检查结果
     * @return transactionsCheckRes
     */
    public Boolean getTransactionsCheckRes() {
        return transactionsCheckRes;
    }

    public void setTransactionsCheckRes(Boolean transactionsCheckRes) {
        this.transactionsCheckRes = transactionsCheckRes;
    }

    public CaseReportDetail withUpdateTime(String updateTime) {
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

    public CaseReportDetail withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * aw的http url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CaseReportDetail withUserConcur(Integer userConcur) {
        this.userConcur = userConcur;
        return this;
    }

    /**
     * 反应实时vuser数据
     * @return userConcur
     */
    public Integer getUserConcur() {
        return userConcur;
    }

    public void setUserConcur(Integer userConcur) {
        this.userConcur = userConcur;
    }

    public CaseReportDetail withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * 分支uri
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CaseReportDetail that = (CaseReportDetail) obj;
        return Objects.equals(this.maxSuccessRateCheckPoint, that.maxSuccessRateCheckPoint)
            && Objects.equals(this.alias, that.alias) && Objects.equals(this.averageRespTime, that.averageRespTime)
            && Objects.equals(this.averageRespTimeCheckPoint, that.averageRespTimeCheckPoint)
            && Objects.equals(this.averageRespTimeCheckRes, that.averageRespTimeCheckRes)
            && Objects.equals(this.avgNetworkTraffic, that.avgNetworkTraffic)
            && Objects.equals(this.avgRecBytes, that.avgRecBytes)
            && Objects.equals(this.avgRecBytesCheckPoint, that.avgRecBytesCheckPoint)
            && Objects.equals(this.avgRecBytesCheckRes, that.avgRecBytesCheckRes)
            && Objects.equals(this.avgSentBytes, that.avgSentBytes)
            && Objects.equals(this.avgSentBytesCheckPoint, that.avgSentBytesCheckPoint)
            && Objects.equals(this.avgSentBytesCheckRes, that.avgSentBytesCheckRes)
            && Objects.equals(this.avgTranRespTime, that.avgTranRespTime)
            && Objects.equals(this.avgTranRespTimeCheckPoint, that.avgTranRespTimeCheckPoint)
            && Objects.equals(this.avgTranRespTimeCheckRes, that.avgTranRespTimeCheckRes)
            && Objects.equals(this.awId, that.awId) && Objects.equals(this.caseUri, that.caseUri)
            && Objects.equals(this.checkpointResult, that.checkpointResult)
            && Objects.equals(this.cpuUsage, that.cpuUsage) && Objects.equals(this.cpuUsageAvg, that.cpuUsageAvg)
            && Objects.equals(this.cpuUsageAvgCheckPoint, that.cpuUsageAvgCheckPoint)
            && Objects.equals(this.cpuUsageAvgCheckRes, that.cpuUsageAvgCheckRes)
            && Objects.equals(this.cpuUsageCheckPoint, that.cpuUsageCheckPoint)
            && Objects.equals(this.cpuUsageCheckRes, that.cpuUsageCheckRes)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.currentThreadNum, that.currentThreadNum)
            && Objects.equals(this.datumType, that.datumType) && Objects.equals(this.dcsLatencyAvg, that.dcsLatencyAvg)
            && Objects.equals(this.dcsLatencyAvgCheckPoint, that.dcsLatencyAvgCheckPoint)
            && Objects.equals(this.dcsLatencyAvgCheckRes, that.dcsLatencyAvgCheckRes)
            && Objects.equals(this.dcsLatencyMax, that.dcsLatencyMax)
            && Objects.equals(this.dcsLatencyMaxCheckPoint, that.dcsLatencyMaxCheckPoint)
            && Objects.equals(this.dcsLatencyMaxCheckRes, that.dcsLatencyMaxCheckRes)
            && Objects.equals(this.dcsLatencyMin, that.dcsLatencyMin)
            && Objects.equals(this.dcsLatencyMinCheckPoint, that.dcsLatencyMinCheckPoint)
            && Objects.equals(this.dcsLatencyMinCheckRes, that.dcsLatencyMinCheckRes)
            && Objects.equals(this.detailId, that.detailId) && Objects.equals(this.diskRead, that.diskRead)
            && Objects.equals(this.diskReadAvg, that.diskReadAvg)
            && Objects.equals(this.diskReadAvgCheckPoint, that.diskReadAvgCheckPoint)
            && Objects.equals(this.diskReadAvgCheckRes, that.diskReadAvgCheckRes)
            && Objects.equals(this.diskReadCheckPoint, that.diskReadCheckPoint)
            && Objects.equals(this.diskReadCheckRes, that.diskReadCheckRes)
            && Objects.equals(this.diskUsage, that.diskUsage) && Objects.equals(this.diskUsageAvg, that.diskUsageAvg)
            && Objects.equals(this.diskUsageAvgCheckPoint, that.diskUsageAvgCheckPoint)
            && Objects.equals(this.diskUsageAvgCheckRes, that.diskUsageAvgCheckRes)
            && Objects.equals(this.diskUsageCheckPoint, that.diskUsageCheckPoint)
            && Objects.equals(this.diskUsageCheckRes, that.diskUsageCheckRes)
            && Objects.equals(this.diskWrite, that.diskWrite) && Objects.equals(this.diskWriteAvg, that.diskWriteAvg)
            && Objects.equals(this.diskWriteAvgCheckPoint, that.diskWriteAvgCheckPoint)
            && Objects.equals(this.diskWriteAvgCheckRes, that.diskWriteAvgCheckRes)
            && Objects.equals(this.diskWriteCheckPoint, that.diskWriteCheckPoint)
            && Objects.equals(this.diskWriteCheckRes, that.diskWriteCheckRes)
            && Objects.equals(this.duration, that.duration) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.errorCount, that.errorCount)
            && Objects.equals(this.errorEventsCount, that.errorEventsCount)
            && Objects.equals(this.failedAssert, that.failedAssert)
            && Objects.equals(this.failedOthers, that.failedOthers)
            && Objects.equals(this.failedParsed, that.failedParsed)
            && Objects.equals(this.failedReason, that.failedReason)
            && Objects.equals(this.failedRefused, that.failedRefused)
            && Objects.equals(this.failedTimeout, that.failedTimeout) && Objects.equals(this.id, that.id)
            && Objects.equals(this.isAW, that.isAW) && Objects.equals(this.iterationUri, that.iterationUri)
            && Objects.equals(this.kpiMonitor, that.kpiMonitor) && Objects.equals(this.max, that.max)
            && Objects.equals(this.maxAvgTime, that.maxAvgTime)
            && Objects.equals(this.maxAvgTimeCheckPoint, that.maxAvgTimeCheckPoint)
            && Objects.equals(this.maxAvgTimeCheckRes, that.maxAvgTimeCheckRes)
            && Objects.equals(this.maxNetworkTraffic, that.maxNetworkTraffic)
            && Objects.equals(this.maxRecBytes, that.maxRecBytes)
            && Objects.equals(this.maxRecBytesCheckPoint, that.maxRecBytesCheckPoint)
            && Objects.equals(this.maxRecBytesCheckRes, that.maxRecBytesCheckRes)
            && Objects.equals(this.maxRespTime, that.maxRespTime)
            && Objects.equals(this.maxRespTimeCheckPoint, that.maxRespTimeCheckPoint)
            && Objects.equals(this.maxRespTimeCheckRes, that.maxRespTimeCheckRes)
            && Objects.equals(this.maxRps, that.maxRps) && Objects.equals(this.maxSentBytes, that.maxSentBytes)
            && Objects.equals(this.maxSentBytesCheckPoint, that.maxSentBytesCheckPoint)
            && Objects.equals(this.maxSentBytesCheckRes, that.maxSentBytesCheckRes)
            && Objects.equals(this.maxSuccessRate, that.maxSuccessRate)
            && Objects.equals(this.maxSuccessRateCheckRes, that.maxSuccessRateCheckRes)
            && Objects.equals(this.maxThreadNum, that.maxThreadNum)
            && Objects.equals(this.maxThreadNumCheckPoint, that.maxThreadNumCheckPoint)
            && Objects.equals(this.maxThreadNumCheckRes, that.maxThreadNumCheckRes)
            && Objects.equals(this.maxTps, that.maxTps) && Objects.equals(this.maxTpsCheckPoint, that.maxTpsCheckPoint)
            && Objects.equals(this.maxTpsCheckRes, that.maxTpsCheckRes)
            && Objects.equals(this.maxTranRespTime, that.maxTranRespTime)
            && Objects.equals(this.maxTranRespTimeCheckPoint, that.maxTranRespTimeCheckPoint)
            && Objects.equals(this.maxTranRespTimeCheckRes, that.maxTranRespTimeCheckRes)
            && Objects.equals(this.memoryUsage, that.memoryUsage)
            && Objects.equals(this.memoryUsageAvg, that.memoryUsageAvg)
            && Objects.equals(this.memoryUsageAvgCheckPoint, that.memoryUsageAvgCheckPoint)
            && Objects.equals(this.memoryUsageAvgCheckRes, that.memoryUsageAvgCheckRes)
            && Objects.equals(this.memoryUsageCheckPoint, that.memoryUsageCheckPoint)
            && Objects.equals(this.memoryUsageCheckRes, that.memoryUsageCheckRes) && Objects.equals(this.min, that.min)
            && Objects.equals(this.minNetworkTraffic, that.minNetworkTraffic) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.monitorPeakTime, that.monitorPeakTime)
            && Objects.equals(this.monitorPeakTimeCheckPoint, that.monitorPeakTimeCheckPoint)
            && Objects.equals(this.monitorPeakTimeCheckRes, that.monitorPeakTimeCheckRes)
            && Objects.equals(this.monitorResult, that.monitorResult)
            && Objects.equals(this.monitorResultCheckPoint, that.monitorResultCheckPoint)
            && Objects.equals(this.monitorResultCheckRes, that.monitorResultCheckRes)
            && Objects.equals(this.name, that.name) && Objects.equals(this.networkRead, that.networkRead)
            && Objects.equals(this.networkReadAvg, that.networkReadAvg)
            && Objects.equals(this.networkReadAvgCheckPoint, that.networkReadAvgCheckPoint)
            && Objects.equals(this.networkReadAvgCheckRes, that.networkReadAvgCheckRes)
            && Objects.equals(this.networkReadCheckPoint, that.networkReadCheckPoint)
            && Objects.equals(this.networkReadCheckRes, that.networkReadCheckRes)
            && Objects.equals(this.networkWrite, that.networkWrite)
            && Objects.equals(this.networkWriteAvg, that.networkWriteAvg)
            && Objects.equals(this.networkWriteAvgCheckPoint, that.networkWriteAvgCheckPoint)
            && Objects.equals(this.networkWriteAvgCheckRes, that.networkWriteAvgCheckRes)
            && Objects.equals(this.networkWriteCheckPoint, that.networkWriteCheckPoint)
            && Objects.equals(this.networkWriteCheckRes, that.networkWriteCheckRes)
            && Objects.equals(this.peakLoadStatus, that.peakLoadStatus)
            && Objects.equals(this.peakLoadStatusCheckPoint, that.peakLoadStatusCheckPoint)
            && Objects.equals(this.peakLoadStatusCheckRes, that.peakLoadStatusCheckRes)
            && Objects.equals(this.peakMetric, that.peakMetric) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.protocols, that.protocols) && Objects.equals(this.requests, that.requests)
            && Objects.equals(this.result, that.result) && Objects.equals(this.resultLog, that.resultLog)
            && Objects.equals(this.round, that.round) && Objects.equals(this.saveAllData, that.saveAllData)
            && Objects.equals(this.serviceId, that.serviceId) && Objects.equals(this.stage, that.stage)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.streamingMediaVo, that.streamingMediaVo)
            && Objects.equals(this.successCount, that.successCount)
            && Objects.equals(this.successRate, that.successRate)
            && Objects.equals(this.successRateCheckPoint, that.successRateCheckPoint)
            && Objects.equals(this.successRateCheckRes, that.successRateCheckRes)
            && Objects.equals(this.sum1xx, that.sum1xx) && Objects.equals(this.sum2xx, that.sum2xx)
            && Objects.equals(this.sum3xx, that.sum3xx) && Objects.equals(this.sum4xx, that.sum4xx)
            && Objects.equals(this.sum5xx, that.sum5xx) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.taskProjectId, that.taskProjectId)
            && Objects.equals(this.taskStatus, that.taskStatus) && Objects.equals(this.testCaseUri, that.testCaseUri)
            && Objects.equals(this.tp50, that.tp50) && Objects.equals(this.tp50CheckPoint, that.tp50CheckPoint)
            && Objects.equals(this.tp50CheckRes, that.tp50CheckRes) && Objects.equals(this.tp75, that.tp75)
            && Objects.equals(this.tp75CheckPoint, that.tp75CheckPoint)
            && Objects.equals(this.tp75CheckRes, that.tp75CheckRes) && Objects.equals(this.tp85, that.tp85)
            && Objects.equals(this.tp85CheckPoint, that.tp85CheckPoint)
            && Objects.equals(this.tp85CheckRes, that.tp85CheckRes) && Objects.equals(this.tp90, that.tp90)
            && Objects.equals(this.tp90CheckPoint, that.tp90CheckPoint)
            && Objects.equals(this.tp90CheckRes, that.tp90CheckRes) && Objects.equals(this.tp95, that.tp95)
            && Objects.equals(this.tp95CheckPoint, that.tp95CheckPoint)
            && Objects.equals(this.tp95CheckRes, that.tp95CheckRes) && Objects.equals(this.tp99, that.tp99)
            && Objects.equals(this.tp999, that.tp999) && Objects.equals(this.tp9999, that.tp9999)
            && Objects.equals(this.tp9999CheckPoint, that.tp9999CheckPoint)
            && Objects.equals(this.tp9999CheckRes, that.tp9999CheckRes)
            && Objects.equals(this.tp999CheckPoint, that.tp999CheckPoint)
            && Objects.equals(this.tp999CheckRes, that.tp999CheckRes)
            && Objects.equals(this.tp99CheckPoint, that.tp99CheckPoint)
            && Objects.equals(this.tp99CheckRes, that.tp99CheckRes) && Objects.equals(this.tps, that.tps)
            && Objects.equals(this.tpsCheckPoint, that.tpsCheckPoint)
            && Objects.equals(this.tpsCheckRes, that.tpsCheckRes) && Objects.equals(this.tranTPS, that.tranTPS)
            && Objects.equals(this.tranTPSCheckPoint, that.tranTPSCheckPoint)
            && Objects.equals(this.tranTPSCheckRes, that.tranTPSCheckRes)
            && Objects.equals(this.transactionId, that.transactionId)
            && Objects.equals(this.transactionSuccess, that.transactionSuccess)
            && Objects.equals(this.transactions, that.transactions)
            && Objects.equals(this.transactionsCheckPoint, that.transactionsCheckPoint)
            && Objects.equals(this.transactionsCheckRes, that.transactionsCheckRes)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.url, that.url)
            && Objects.equals(this.userConcur, that.userConcur) && Objects.equals(this.versionUri, that.versionUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSuccessRateCheckPoint,
            alias,
            averageRespTime,
            averageRespTimeCheckPoint,
            averageRespTimeCheckRes,
            avgNetworkTraffic,
            avgRecBytes,
            avgRecBytesCheckPoint,
            avgRecBytesCheckRes,
            avgSentBytes,
            avgSentBytesCheckPoint,
            avgSentBytesCheckRes,
            avgTranRespTime,
            avgTranRespTimeCheckPoint,
            avgTranRespTimeCheckRes,
            awId,
            caseUri,
            checkpointResult,
            cpuUsage,
            cpuUsageAvg,
            cpuUsageAvgCheckPoint,
            cpuUsageAvgCheckRes,
            cpuUsageCheckPoint,
            cpuUsageCheckRes,
            createTime,
            currentThreadNum,
            datumType,
            dcsLatencyAvg,
            dcsLatencyAvgCheckPoint,
            dcsLatencyAvgCheckRes,
            dcsLatencyMax,
            dcsLatencyMaxCheckPoint,
            dcsLatencyMaxCheckRes,
            dcsLatencyMin,
            dcsLatencyMinCheckPoint,
            dcsLatencyMinCheckRes,
            detailId,
            diskRead,
            diskReadAvg,
            diskReadAvgCheckPoint,
            diskReadAvgCheckRes,
            diskReadCheckPoint,
            diskReadCheckRes,
            diskUsage,
            diskUsageAvg,
            diskUsageAvgCheckPoint,
            diskUsageAvgCheckRes,
            diskUsageCheckPoint,
            diskUsageCheckRes,
            diskWrite,
            diskWriteAvg,
            diskWriteAvgCheckPoint,
            diskWriteAvgCheckRes,
            diskWriteCheckPoint,
            diskWriteCheckRes,
            duration,
            endTime,
            errorCount,
            errorEventsCount,
            failedAssert,
            failedOthers,
            failedParsed,
            failedReason,
            failedRefused,
            failedTimeout,
            id,
            isAW,
            iterationUri,
            kpiMonitor,
            max,
            maxAvgTime,
            maxAvgTimeCheckPoint,
            maxAvgTimeCheckRes,
            maxNetworkTraffic,
            maxRecBytes,
            maxRecBytesCheckPoint,
            maxRecBytesCheckRes,
            maxRespTime,
            maxRespTimeCheckPoint,
            maxRespTimeCheckRes,
            maxRps,
            maxSentBytes,
            maxSentBytesCheckPoint,
            maxSentBytesCheckRes,
            maxSuccessRate,
            maxSuccessRateCheckRes,
            maxThreadNum,
            maxThreadNumCheckPoint,
            maxThreadNumCheckRes,
            maxTps,
            maxTpsCheckPoint,
            maxTpsCheckRes,
            maxTranRespTime,
            maxTranRespTimeCheckPoint,
            maxTranRespTimeCheckRes,
            memoryUsage,
            memoryUsageAvg,
            memoryUsageAvgCheckPoint,
            memoryUsageAvgCheckRes,
            memoryUsageCheckPoint,
            memoryUsageCheckRes,
            min,
            minNetworkTraffic,
            mode,
            monitorPeakTime,
            monitorPeakTimeCheckPoint,
            monitorPeakTimeCheckRes,
            monitorResult,
            monitorResultCheckPoint,
            monitorResultCheckRes,
            name,
            networkRead,
            networkReadAvg,
            networkReadAvgCheckPoint,
            networkReadAvgCheckRes,
            networkReadCheckPoint,
            networkReadCheckRes,
            networkWrite,
            networkWriteAvg,
            networkWriteAvgCheckPoint,
            networkWriteAvgCheckRes,
            networkWriteCheckPoint,
            networkWriteCheckRes,
            peakLoadStatus,
            peakLoadStatusCheckPoint,
            peakLoadStatusCheckRes,
            peakMetric,
            projectId,
            protocols,
            requests,
            result,
            resultLog,
            round,
            saveAllData,
            serviceId,
            stage,
            startTime,
            status,
            streamingMediaVo,
            successCount,
            successRate,
            successRateCheckPoint,
            successRateCheckRes,
            sum1xx,
            sum2xx,
            sum3xx,
            sum4xx,
            sum5xx,
            taskId,
            taskName,
            taskProjectId,
            taskStatus,
            testCaseUri,
            tp50,
            tp50CheckPoint,
            tp50CheckRes,
            tp75,
            tp75CheckPoint,
            tp75CheckRes,
            tp85,
            tp85CheckPoint,
            tp85CheckRes,
            tp90,
            tp90CheckPoint,
            tp90CheckRes,
            tp95,
            tp95CheckPoint,
            tp95CheckRes,
            tp99,
            tp999,
            tp9999,
            tp9999CheckPoint,
            tp9999CheckRes,
            tp999CheckPoint,
            tp999CheckRes,
            tp99CheckPoint,
            tp99CheckRes,
            tps,
            tpsCheckPoint,
            tpsCheckRes,
            tranTPS,
            tranTPSCheckPoint,
            tranTPSCheckRes,
            transactionId,
            transactionSuccess,
            transactions,
            transactionsCheckPoint,
            transactionsCheckRes,
            updateTime,
            url,
            userConcur,
            versionUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaseReportDetail {\n");
        sb.append("    maxSuccessRateCheckPoint: ").append(toIndentedString(maxSuccessRateCheckPoint)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    averageRespTime: ").append(toIndentedString(averageRespTime)).append("\n");
        sb.append("    averageRespTimeCheckPoint: ").append(toIndentedString(averageRespTimeCheckPoint)).append("\n");
        sb.append("    averageRespTimeCheckRes: ").append(toIndentedString(averageRespTimeCheckRes)).append("\n");
        sb.append("    avgNetworkTraffic: ").append(toIndentedString(avgNetworkTraffic)).append("\n");
        sb.append("    avgRecBytes: ").append(toIndentedString(avgRecBytes)).append("\n");
        sb.append("    avgRecBytesCheckPoint: ").append(toIndentedString(avgRecBytesCheckPoint)).append("\n");
        sb.append("    avgRecBytesCheckRes: ").append(toIndentedString(avgRecBytesCheckRes)).append("\n");
        sb.append("    avgSentBytes: ").append(toIndentedString(avgSentBytes)).append("\n");
        sb.append("    avgSentBytesCheckPoint: ").append(toIndentedString(avgSentBytesCheckPoint)).append("\n");
        sb.append("    avgSentBytesCheckRes: ").append(toIndentedString(avgSentBytesCheckRes)).append("\n");
        sb.append("    avgTranRespTime: ").append(toIndentedString(avgTranRespTime)).append("\n");
        sb.append("    avgTranRespTimeCheckPoint: ").append(toIndentedString(avgTranRespTimeCheckPoint)).append("\n");
        sb.append("    avgTranRespTimeCheckRes: ").append(toIndentedString(avgTranRespTimeCheckRes)).append("\n");
        sb.append("    awId: ").append(toIndentedString(awId)).append("\n");
        sb.append("    caseUri: ").append(toIndentedString(caseUri)).append("\n");
        sb.append("    checkpointResult: ").append(toIndentedString(checkpointResult)).append("\n");
        sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
        sb.append("    cpuUsageAvg: ").append(toIndentedString(cpuUsageAvg)).append("\n");
        sb.append("    cpuUsageAvgCheckPoint: ").append(toIndentedString(cpuUsageAvgCheckPoint)).append("\n");
        sb.append("    cpuUsageAvgCheckRes: ").append(toIndentedString(cpuUsageAvgCheckRes)).append("\n");
        sb.append("    cpuUsageCheckPoint: ").append(toIndentedString(cpuUsageCheckPoint)).append("\n");
        sb.append("    cpuUsageCheckRes: ").append(toIndentedString(cpuUsageCheckRes)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    currentThreadNum: ").append(toIndentedString(currentThreadNum)).append("\n");
        sb.append("    datumType: ").append(toIndentedString(datumType)).append("\n");
        sb.append("    dcsLatencyAvg: ").append(toIndentedString(dcsLatencyAvg)).append("\n");
        sb.append("    dcsLatencyAvgCheckPoint: ").append(toIndentedString(dcsLatencyAvgCheckPoint)).append("\n");
        sb.append("    dcsLatencyAvgCheckRes: ").append(toIndentedString(dcsLatencyAvgCheckRes)).append("\n");
        sb.append("    dcsLatencyMax: ").append(toIndentedString(dcsLatencyMax)).append("\n");
        sb.append("    dcsLatencyMaxCheckPoint: ").append(toIndentedString(dcsLatencyMaxCheckPoint)).append("\n");
        sb.append("    dcsLatencyMaxCheckRes: ").append(toIndentedString(dcsLatencyMaxCheckRes)).append("\n");
        sb.append("    dcsLatencyMin: ").append(toIndentedString(dcsLatencyMin)).append("\n");
        sb.append("    dcsLatencyMinCheckPoint: ").append(toIndentedString(dcsLatencyMinCheckPoint)).append("\n");
        sb.append("    dcsLatencyMinCheckRes: ").append(toIndentedString(dcsLatencyMinCheckRes)).append("\n");
        sb.append("    detailId: ").append(toIndentedString(detailId)).append("\n");
        sb.append("    diskRead: ").append(toIndentedString(diskRead)).append("\n");
        sb.append("    diskReadAvg: ").append(toIndentedString(diskReadAvg)).append("\n");
        sb.append("    diskReadAvgCheckPoint: ").append(toIndentedString(diskReadAvgCheckPoint)).append("\n");
        sb.append("    diskReadAvgCheckRes: ").append(toIndentedString(diskReadAvgCheckRes)).append("\n");
        sb.append("    diskReadCheckPoint: ").append(toIndentedString(diskReadCheckPoint)).append("\n");
        sb.append("    diskReadCheckRes: ").append(toIndentedString(diskReadCheckRes)).append("\n");
        sb.append("    diskUsage: ").append(toIndentedString(diskUsage)).append("\n");
        sb.append("    diskUsageAvg: ").append(toIndentedString(diskUsageAvg)).append("\n");
        sb.append("    diskUsageAvgCheckPoint: ").append(toIndentedString(diskUsageAvgCheckPoint)).append("\n");
        sb.append("    diskUsageAvgCheckRes: ").append(toIndentedString(diskUsageAvgCheckRes)).append("\n");
        sb.append("    diskUsageCheckPoint: ").append(toIndentedString(diskUsageCheckPoint)).append("\n");
        sb.append("    diskUsageCheckRes: ").append(toIndentedString(diskUsageCheckRes)).append("\n");
        sb.append("    diskWrite: ").append(toIndentedString(diskWrite)).append("\n");
        sb.append("    diskWriteAvg: ").append(toIndentedString(diskWriteAvg)).append("\n");
        sb.append("    diskWriteAvgCheckPoint: ").append(toIndentedString(diskWriteAvgCheckPoint)).append("\n");
        sb.append("    diskWriteAvgCheckRes: ").append(toIndentedString(diskWriteAvgCheckRes)).append("\n");
        sb.append("    diskWriteCheckPoint: ").append(toIndentedString(diskWriteCheckPoint)).append("\n");
        sb.append("    diskWriteCheckRes: ").append(toIndentedString(diskWriteCheckRes)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
        sb.append("    errorEventsCount: ").append(toIndentedString(errorEventsCount)).append("\n");
        sb.append("    failedAssert: ").append(toIndentedString(failedAssert)).append("\n");
        sb.append("    failedOthers: ").append(toIndentedString(failedOthers)).append("\n");
        sb.append("    failedParsed: ").append(toIndentedString(failedParsed)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    failedRefused: ").append(toIndentedString(failedRefused)).append("\n");
        sb.append("    failedTimeout: ").append(toIndentedString(failedTimeout)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isAW: ").append(toIndentedString(isAW)).append("\n");
        sb.append("    iterationUri: ").append(toIndentedString(iterationUri)).append("\n");
        sb.append("    kpiMonitor: ").append(toIndentedString(kpiMonitor)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    maxAvgTime: ").append(toIndentedString(maxAvgTime)).append("\n");
        sb.append("    maxAvgTimeCheckPoint: ").append(toIndentedString(maxAvgTimeCheckPoint)).append("\n");
        sb.append("    maxAvgTimeCheckRes: ").append(toIndentedString(maxAvgTimeCheckRes)).append("\n");
        sb.append("    maxNetworkTraffic: ").append(toIndentedString(maxNetworkTraffic)).append("\n");
        sb.append("    maxRecBytes: ").append(toIndentedString(maxRecBytes)).append("\n");
        sb.append("    maxRecBytesCheckPoint: ").append(toIndentedString(maxRecBytesCheckPoint)).append("\n");
        sb.append("    maxRecBytesCheckRes: ").append(toIndentedString(maxRecBytesCheckRes)).append("\n");
        sb.append("    maxRespTime: ").append(toIndentedString(maxRespTime)).append("\n");
        sb.append("    maxRespTimeCheckPoint: ").append(toIndentedString(maxRespTimeCheckPoint)).append("\n");
        sb.append("    maxRespTimeCheckRes: ").append(toIndentedString(maxRespTimeCheckRes)).append("\n");
        sb.append("    maxRps: ").append(toIndentedString(maxRps)).append("\n");
        sb.append("    maxSentBytes: ").append(toIndentedString(maxSentBytes)).append("\n");
        sb.append("    maxSentBytesCheckPoint: ").append(toIndentedString(maxSentBytesCheckPoint)).append("\n");
        sb.append("    maxSentBytesCheckRes: ").append(toIndentedString(maxSentBytesCheckRes)).append("\n");
        sb.append("    maxSuccessRate: ").append(toIndentedString(maxSuccessRate)).append("\n");
        sb.append("    maxSuccessRateCheckRes: ").append(toIndentedString(maxSuccessRateCheckRes)).append("\n");
        sb.append("    maxThreadNum: ").append(toIndentedString(maxThreadNum)).append("\n");
        sb.append("    maxThreadNumCheckPoint: ").append(toIndentedString(maxThreadNumCheckPoint)).append("\n");
        sb.append("    maxThreadNumCheckRes: ").append(toIndentedString(maxThreadNumCheckRes)).append("\n");
        sb.append("    maxTps: ").append(toIndentedString(maxTps)).append("\n");
        sb.append("    maxTpsCheckPoint: ").append(toIndentedString(maxTpsCheckPoint)).append("\n");
        sb.append("    maxTpsCheckRes: ").append(toIndentedString(maxTpsCheckRes)).append("\n");
        sb.append("    maxTranRespTime: ").append(toIndentedString(maxTranRespTime)).append("\n");
        sb.append("    maxTranRespTimeCheckPoint: ").append(toIndentedString(maxTranRespTimeCheckPoint)).append("\n");
        sb.append("    maxTranRespTimeCheckRes: ").append(toIndentedString(maxTranRespTimeCheckRes)).append("\n");
        sb.append("    memoryUsage: ").append(toIndentedString(memoryUsage)).append("\n");
        sb.append("    memoryUsageAvg: ").append(toIndentedString(memoryUsageAvg)).append("\n");
        sb.append("    memoryUsageAvgCheckPoint: ").append(toIndentedString(memoryUsageAvgCheckPoint)).append("\n");
        sb.append("    memoryUsageAvgCheckRes: ").append(toIndentedString(memoryUsageAvgCheckRes)).append("\n");
        sb.append("    memoryUsageCheckPoint: ").append(toIndentedString(memoryUsageCheckPoint)).append("\n");
        sb.append("    memoryUsageCheckRes: ").append(toIndentedString(memoryUsageCheckRes)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    minNetworkTraffic: ").append(toIndentedString(minNetworkTraffic)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    monitorPeakTime: ").append(toIndentedString(monitorPeakTime)).append("\n");
        sb.append("    monitorPeakTimeCheckPoint: ").append(toIndentedString(monitorPeakTimeCheckPoint)).append("\n");
        sb.append("    monitorPeakTimeCheckRes: ").append(toIndentedString(monitorPeakTimeCheckRes)).append("\n");
        sb.append("    monitorResult: ").append(toIndentedString(monitorResult)).append("\n");
        sb.append("    monitorResultCheckPoint: ").append(toIndentedString(monitorResultCheckPoint)).append("\n");
        sb.append("    monitorResultCheckRes: ").append(toIndentedString(monitorResultCheckRes)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    networkRead: ").append(toIndentedString(networkRead)).append("\n");
        sb.append("    networkReadAvg: ").append(toIndentedString(networkReadAvg)).append("\n");
        sb.append("    networkReadAvgCheckPoint: ").append(toIndentedString(networkReadAvgCheckPoint)).append("\n");
        sb.append("    networkReadAvgCheckRes: ").append(toIndentedString(networkReadAvgCheckRes)).append("\n");
        sb.append("    networkReadCheckPoint: ").append(toIndentedString(networkReadCheckPoint)).append("\n");
        sb.append("    networkReadCheckRes: ").append(toIndentedString(networkReadCheckRes)).append("\n");
        sb.append("    networkWrite: ").append(toIndentedString(networkWrite)).append("\n");
        sb.append("    networkWriteAvg: ").append(toIndentedString(networkWriteAvg)).append("\n");
        sb.append("    networkWriteAvgCheckPoint: ").append(toIndentedString(networkWriteAvgCheckPoint)).append("\n");
        sb.append("    networkWriteAvgCheckRes: ").append(toIndentedString(networkWriteAvgCheckRes)).append("\n");
        sb.append("    networkWriteCheckPoint: ").append(toIndentedString(networkWriteCheckPoint)).append("\n");
        sb.append("    networkWriteCheckRes: ").append(toIndentedString(networkWriteCheckRes)).append("\n");
        sb.append("    peakLoadStatus: ").append(toIndentedString(peakLoadStatus)).append("\n");
        sb.append("    peakLoadStatusCheckPoint: ").append(toIndentedString(peakLoadStatusCheckPoint)).append("\n");
        sb.append("    peakLoadStatusCheckRes: ").append(toIndentedString(peakLoadStatusCheckRes)).append("\n");
        sb.append("    peakMetric: ").append(toIndentedString(peakMetric)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
        sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    resultLog: ").append(toIndentedString(resultLog)).append("\n");
        sb.append("    round: ").append(toIndentedString(round)).append("\n");
        sb.append("    saveAllData: ").append(toIndentedString(saveAllData)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    streamingMediaVo: ").append(toIndentedString(streamingMediaVo)).append("\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
        sb.append("    successRateCheckPoint: ").append(toIndentedString(successRateCheckPoint)).append("\n");
        sb.append("    successRateCheckRes: ").append(toIndentedString(successRateCheckRes)).append("\n");
        sb.append("    sum1xx: ").append(toIndentedString(sum1xx)).append("\n");
        sb.append("    sum2xx: ").append(toIndentedString(sum2xx)).append("\n");
        sb.append("    sum3xx: ").append(toIndentedString(sum3xx)).append("\n");
        sb.append("    sum4xx: ").append(toIndentedString(sum4xx)).append("\n");
        sb.append("    sum5xx: ").append(toIndentedString(sum5xx)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskProjectId: ").append(toIndentedString(taskProjectId)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    testCaseUri: ").append(toIndentedString(testCaseUri)).append("\n");
        sb.append("    tp50: ").append(toIndentedString(tp50)).append("\n");
        sb.append("    tp50CheckPoint: ").append(toIndentedString(tp50CheckPoint)).append("\n");
        sb.append("    tp50CheckRes: ").append(toIndentedString(tp50CheckRes)).append("\n");
        sb.append("    tp75: ").append(toIndentedString(tp75)).append("\n");
        sb.append("    tp75CheckPoint: ").append(toIndentedString(tp75CheckPoint)).append("\n");
        sb.append("    tp75CheckRes: ").append(toIndentedString(tp75CheckRes)).append("\n");
        sb.append("    tp85: ").append(toIndentedString(tp85)).append("\n");
        sb.append("    tp85CheckPoint: ").append(toIndentedString(tp85CheckPoint)).append("\n");
        sb.append("    tp85CheckRes: ").append(toIndentedString(tp85CheckRes)).append("\n");
        sb.append("    tp90: ").append(toIndentedString(tp90)).append("\n");
        sb.append("    tp90CheckPoint: ").append(toIndentedString(tp90CheckPoint)).append("\n");
        sb.append("    tp90CheckRes: ").append(toIndentedString(tp90CheckRes)).append("\n");
        sb.append("    tp95: ").append(toIndentedString(tp95)).append("\n");
        sb.append("    tp95CheckPoint: ").append(toIndentedString(tp95CheckPoint)).append("\n");
        sb.append("    tp95CheckRes: ").append(toIndentedString(tp95CheckRes)).append("\n");
        sb.append("    tp99: ").append(toIndentedString(tp99)).append("\n");
        sb.append("    tp999: ").append(toIndentedString(tp999)).append("\n");
        sb.append("    tp9999: ").append(toIndentedString(tp9999)).append("\n");
        sb.append("    tp9999CheckPoint: ").append(toIndentedString(tp9999CheckPoint)).append("\n");
        sb.append("    tp9999CheckRes: ").append(toIndentedString(tp9999CheckRes)).append("\n");
        sb.append("    tp999CheckPoint: ").append(toIndentedString(tp999CheckPoint)).append("\n");
        sb.append("    tp999CheckRes: ").append(toIndentedString(tp999CheckRes)).append("\n");
        sb.append("    tp99CheckPoint: ").append(toIndentedString(tp99CheckPoint)).append("\n");
        sb.append("    tp99CheckRes: ").append(toIndentedString(tp99CheckRes)).append("\n");
        sb.append("    tps: ").append(toIndentedString(tps)).append("\n");
        sb.append("    tpsCheckPoint: ").append(toIndentedString(tpsCheckPoint)).append("\n");
        sb.append("    tpsCheckRes: ").append(toIndentedString(tpsCheckRes)).append("\n");
        sb.append("    tranTPS: ").append(toIndentedString(tranTPS)).append("\n");
        sb.append("    tranTPSCheckPoint: ").append(toIndentedString(tranTPSCheckPoint)).append("\n");
        sb.append("    tranTPSCheckRes: ").append(toIndentedString(tranTPSCheckRes)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    transactionSuccess: ").append(toIndentedString(transactionSuccess)).append("\n");
        sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
        sb.append("    transactionsCheckPoint: ").append(toIndentedString(transactionsCheckPoint)).append("\n");
        sb.append("    transactionsCheckRes: ").append(toIndentedString(transactionsCheckRes)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    userConcur: ").append(toIndentedString(userConcur)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
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
