package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExecuteStrategiesVo
 */
public class ExecuteStrategiesVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advancedConfig")

    private AdvancedConfig advancedConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dailyReportEnable")

    private String dailyReportEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executeModel")

    private String executeModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executePeriodBegin")

    private String executePeriodBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executePeriodEnd")

    private String executePeriodEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executeStartTime")

    private Long executeStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executionTime")

    private List<ExecutionTime> executionTime = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executorOption")

    private Map<String, Object> executorOption = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executorParameters")

    private Map<String, Object> executorParameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedRetryTimes")

    private Integer failedRetryTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intervalInSeconds")

    private Integer intervalInSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipKey")

    private String ipKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location_ids")

    private List<String> locationIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operateNotice")

    private OperateNotice operateNotice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pbi")

    private String pbi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_test")

    private ProtocolTestVo protocolTest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repeatTimes")

    private Integer repeatTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceNameCBG")

    private String serviceNameCBG;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceScopeCBG")

    private String serviceScopeCBG;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceVersionCBG")

    private String serviceVersionCBG;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testNodeServer")

    private String testNodeServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeoutMilSec")

    private Integer timeoutMilSec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timerExpression")

    private String timerExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    public ExecuteStrategiesVo withAdvancedConfig(AdvancedConfig advancedConfig) {
        this.advancedConfig = advancedConfig;
        return this;
    }

    public ExecuteStrategiesVo withAdvancedConfig(Consumer<AdvancedConfig> advancedConfigSetter) {
        if (this.advancedConfig == null) {
            this.advancedConfig = new AdvancedConfig();
            advancedConfigSetter.accept(this.advancedConfig);
        }

        return this;
    }

    /**
     * Get advancedConfig
     * @return advancedConfig
     */
    public AdvancedConfig getAdvancedConfig() {
        return advancedConfig;
    }

    public void setAdvancedConfig(AdvancedConfig advancedConfig) {
        this.advancedConfig = advancedConfig;
    }

    public ExecuteStrategiesVo withDailyReportEnable(String dailyReportEnable) {
        this.dailyReportEnable = dailyReportEnable;
        return this;
    }

    /**
     * 日报 0 关闭 1开启
     * @return dailyReportEnable
     */
    public String getDailyReportEnable() {
        return dailyReportEnable;
    }

    public void setDailyReportEnable(String dailyReportEnable) {
        this.dailyReportEnable = dailyReportEnable;
    }

    public ExecuteStrategiesVo withExecuteModel(String executeModel) {
        this.executeModel = executeModel;
        return this;
    }

    /**
     * 执行顺序 串行 1 并行 2 
     * @return executeModel
     */
    public String getExecuteModel() {
        return executeModel;
    }

    public void setExecuteModel(String executeModel) {
        this.executeModel = executeModel;
    }

    public ExecuteStrategiesVo withExecutePeriodBegin(String executePeriodBegin) {
        this.executePeriodBegin = executePeriodBegin;
        return this;
    }

    /**
     * 执行区间，开始时间
     * @return executePeriodBegin
     */
    public String getExecutePeriodBegin() {
        return executePeriodBegin;
    }

    public void setExecutePeriodBegin(String executePeriodBegin) {
        this.executePeriodBegin = executePeriodBegin;
    }

    public ExecuteStrategiesVo withExecutePeriodEnd(String executePeriodEnd) {
        this.executePeriodEnd = executePeriodEnd;
        return this;
    }

    /**
     * 执行区间，开始时间
     * @return executePeriodEnd
     */
    public String getExecutePeriodEnd() {
        return executePeriodEnd;
    }

    public void setExecutePeriodEnd(String executePeriodEnd) {
        this.executePeriodEnd = executePeriodEnd;
    }

    public ExecuteStrategiesVo withExecuteStartTime(Long executeStartTime) {
        this.executeStartTime = executeStartTime;
        return this;
    }

    /**
     * 执行模式 立即执行 0，延后执行: 延后执行时间
     * @return executeStartTime
     */
    public Long getExecuteStartTime() {
        return executeStartTime;
    }

    public void setExecuteStartTime(Long executeStartTime) {
        this.executeStartTime = executeStartTime;
    }

    public ExecuteStrategiesVo withExecutionTime(List<ExecutionTime> executionTime) {
        this.executionTime = executionTime;
        return this;
    }

    public ExecuteStrategiesVo addExecutionTimeItem(ExecutionTime executionTimeItem) {
        if (this.executionTime == null) {
            this.executionTime = new ArrayList<>();
        }
        this.executionTime.add(executionTimeItem);
        return this;
    }

    public ExecuteStrategiesVo withExecutionTime(Consumer<List<ExecutionTime>> executionTimeSetter) {
        if (this.executionTime == null) {
            this.executionTime = new ArrayList<>();
        }
        executionTimeSetter.accept(this.executionTime);
        return this;
    }

    /**
     * 任务执行时间段 -- 重新启用，任务采用多段时间区间执行，quartz需要用这个参数
     * @return executionTime
     */
    public List<ExecutionTime> getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(List<ExecutionTime> executionTime) {
        this.executionTime = executionTime;
    }

    public ExecuteStrategiesVo withExecutorOption(Map<String, Object> executorOption) {
        this.executorOption = executorOption;
        return this;
    }

    public ExecuteStrategiesVo putExecutorOptionItem(String key, Object executorOptionItem) {
        if (this.executorOption == null) {
            this.executorOption = new HashMap<>();
        }
        this.executorOption.put(key, executorOptionItem);
        return this;
    }

    public ExecuteStrategiesVo withExecutorOption(Consumer<Map<String, Object>> executorOptionSetter) {
        if (this.executorOption == null) {
            this.executorOption = new HashMap<>();
        }
        executorOptionSetter.accept(this.executorOption);
        return this;
    }

    /**
     * 目前无用字段
     * @return executorOption
     */
    public Map<String, Object> getExecutorOption() {
        return executorOption;
    }

    public void setExecutorOption(Map<String, Object> executorOption) {
        this.executorOption = executorOption;
    }

    public ExecuteStrategiesVo withExecutorParameters(Map<String, Object> executorParameters) {
        this.executorParameters = executorParameters;
        return this;
    }

    public ExecuteStrategiesVo putExecutorParametersItem(String key, Object executorParametersItem) {
        if (this.executorParameters == null) {
            this.executorParameters = new HashMap<>();
        }
        this.executorParameters.put(key, executorParametersItem);
        return this;
    }

    public ExecuteStrategiesVo withExecutorParameters(Consumer<Map<String, Object>> executorParametersSetter) {
        if (this.executorParameters == null) {
            this.executorParameters = new HashMap<>();
        }
        executorParametersSetter.accept(this.executorParameters);
        return this;
    }

    /**
     * deployTest修改properties使用，字段不固定。小网拨测使用该字段修改properties中的ip
     * @return executorParameters
     */
    public Map<String, Object> getExecutorParameters() {
        return executorParameters;
    }

    public void setExecutorParameters(Map<String, Object> executorParameters) {
        this.executorParameters = executorParameters;
    }

    public ExecuteStrategiesVo withFailedRetryTimes(Integer failedRetryTimes) {
        this.failedRetryTimes = failedRetryTimes;
        return this;
    }

    /**
     * 失败重试次数
     * @return failedRetryTimes
     */
    public Integer getFailedRetryTimes() {
        return failedRetryTimes;
    }

    public void setFailedRetryTimes(Integer failedRetryTimes) {
        this.failedRetryTimes = failedRetryTimes;
    }

    public ExecuteStrategiesVo withIntervalInSeconds(Integer intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
        return this;
    }

    /**
     * 执行间隔
     * @return intervalInSeconds
     */
    public Integer getIntervalInSeconds() {
        return intervalInSeconds;
    }

    public void setIntervalInSeconds(Integer intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
    }

    public ExecuteStrategiesVo withIpKey(String ipKey) {
        this.ipKey = ipKey;
        return this;
    }

    /**
     * deployTest使用
     * @return ipKey
     */
    public String getIpKey() {
        return ipKey;
    }

    public void setIpKey(String ipKey) {
        this.ipKey = ipKey;
    }

    public ExecuteStrategiesVo withLocationIds(List<String> locationIds) {
        this.locationIds = locationIds;
        return this;
    }

    public ExecuteStrategiesVo addLocationIdsItem(String locationIdsItem) {
        if (this.locationIds == null) {
            this.locationIds = new ArrayList<>();
        }
        this.locationIds.add(locationIdsItem);
        return this;
    }

    public ExecuteStrategiesVo withLocationIds(Consumer<List<String>> locationIdsSetter) {
        if (this.locationIds == null) {
            this.locationIds = new ArrayList<>();
        }
        locationIdsSetter.accept(this.locationIds);
        return this;
    }

    /**
     * 执行区域
     * @return locationIds
     */
    public List<String> getLocationIds() {
        return locationIds;
    }

    public void setLocationIds(List<String> locationIds) {
        this.locationIds = locationIds;
    }

    public ExecuteStrategiesVo withOperateNotice(OperateNotice operateNotice) {
        this.operateNotice = operateNotice;
        return this;
    }

    public ExecuteStrategiesVo withOperateNotice(Consumer<OperateNotice> operateNoticeSetter) {
        if (this.operateNotice == null) {
            this.operateNotice = new OperateNotice();
            operateNoticeSetter.accept(this.operateNotice);
        }

        return this;
    }

    /**
     * Get operateNotice
     * @return operateNotice
     */
    public OperateNotice getOperateNotice() {
        return operateNotice;
    }

    public void setOperateNotice(OperateNotice operateNotice) {
        this.operateNotice = operateNotice;
    }

    public ExecuteStrategiesVo withPbi(String pbi) {
        this.pbi = pbi;
        return this;
    }

    /**
     * deployTest使用
     * @return pbi
     */
    public String getPbi() {
        return pbi;
    }

    public void setPbi(String pbi) {
        this.pbi = pbi;
    }

    public ExecuteStrategiesVo withProtocolTest(ProtocolTestVo protocolTest) {
        this.protocolTest = protocolTest;
        return this;
    }

    public ExecuteStrategiesVo withProtocolTest(Consumer<ProtocolTestVo> protocolTestSetter) {
        if (this.protocolTest == null) {
            this.protocolTest = new ProtocolTestVo();
            protocolTestSetter.accept(this.protocolTest);
        }

        return this;
    }

    /**
     * Get protocolTest
     * @return protocolTest
     */
    public ProtocolTestVo getProtocolTest() {
        return protocolTest;
    }

    public void setProtocolTest(ProtocolTestVo protocolTest) {
        this.protocolTest = protocolTest;
    }

    public ExecuteStrategiesVo withRepeatTimes(Integer repeatTimes) {
        this.repeatTimes = repeatTimes;
        return this;
    }

    /**
     * 重试次数，冒烟测试使用
     * @return repeatTimes
     */
    public Integer getRepeatTimes() {
        return repeatTimes;
    }

    public void setRepeatTimes(Integer repeatTimes) {
        this.repeatTimes = repeatTimes;
    }

    public ExecuteStrategiesVo withServiceNameCBG(String serviceNameCBG) {
        this.serviceNameCBG = serviceNameCBG;
        return this;
    }

    /**
     * deployTest使用
     * @return serviceNameCBG
     */
    public String getServiceNameCBG() {
        return serviceNameCBG;
    }

    public void setServiceNameCBG(String serviceNameCBG) {
        this.serviceNameCBG = serviceNameCBG;
    }

    public ExecuteStrategiesVo withServiceScopeCBG(String serviceScopeCBG) {
        this.serviceScopeCBG = serviceScopeCBG;
        return this;
    }

    /**
     * deployTest使用
     * @return serviceScopeCBG
     */
    public String getServiceScopeCBG() {
        return serviceScopeCBG;
    }

    public void setServiceScopeCBG(String serviceScopeCBG) {
        this.serviceScopeCBG = serviceScopeCBG;
    }

    public ExecuteStrategiesVo withServiceVersionCBG(String serviceVersionCBG) {
        this.serviceVersionCBG = serviceVersionCBG;
        return this;
    }

    /**
     * deployTest使用
     * @return serviceVersionCBG
     */
    public String getServiceVersionCBG() {
        return serviceVersionCBG;
    }

    public void setServiceVersionCBG(String serviceVersionCBG) {
        this.serviceVersionCBG = serviceVersionCBG;
    }

    public ExecuteStrategiesVo withTestNodeServer(String testNodeServer) {
        this.testNodeServer = testNodeServer;
        return this;
    }

    /**
     * 不再使用
     * @return testNodeServer
     */
    public String getTestNodeServer() {
        return testNodeServer;
    }

    public void setTestNodeServer(String testNodeServer) {
        this.testNodeServer = testNodeServer;
    }

    public ExecuteStrategiesVo withTimeoutMilSec(Integer timeoutMilSec) {
        this.timeoutMilSec = timeoutMilSec;
        return this;
    }

    /**
     * 超时时间
     * @return timeoutMilSec
     */
    public Integer getTimeoutMilSec() {
        return timeoutMilSec;
    }

    public void setTimeoutMilSec(Integer timeoutMilSec) {
        this.timeoutMilSec = timeoutMilSec;
    }

    public ExecuteStrategiesVo withTimerExpression(String timerExpression) {
        this.timerExpression = timerExpression;
        return this;
    }

    /**
     * 执行时间表达式
     * @return timerExpression
     */
    public String getTimerExpression() {
        return timerExpression;
    }

    public void setTimerExpression(String timerExpression) {
        this.timerExpression = timerExpression;
    }

    public ExecuteStrategiesVo withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * deployTest使用
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteStrategiesVo that = (ExecuteStrategiesVo) obj;
        return Objects.equals(this.advancedConfig, that.advancedConfig)
            && Objects.equals(this.dailyReportEnable, that.dailyReportEnable)
            && Objects.equals(this.executeModel, that.executeModel)
            && Objects.equals(this.executePeriodBegin, that.executePeriodBegin)
            && Objects.equals(this.executePeriodEnd, that.executePeriodEnd)
            && Objects.equals(this.executeStartTime, that.executeStartTime)
            && Objects.equals(this.executionTime, that.executionTime)
            && Objects.equals(this.executorOption, that.executorOption)
            && Objects.equals(this.executorParameters, that.executorParameters)
            && Objects.equals(this.failedRetryTimes, that.failedRetryTimes)
            && Objects.equals(this.intervalInSeconds, that.intervalInSeconds) && Objects.equals(this.ipKey, that.ipKey)
            && Objects.equals(this.locationIds, that.locationIds)
            && Objects.equals(this.operateNotice, that.operateNotice) && Objects.equals(this.pbi, that.pbi)
            && Objects.equals(this.protocolTest, that.protocolTest)
            && Objects.equals(this.repeatTimes, that.repeatTimes)
            && Objects.equals(this.serviceNameCBG, that.serviceNameCBG)
            && Objects.equals(this.serviceScopeCBG, that.serviceScopeCBG)
            && Objects.equals(this.serviceVersionCBG, that.serviceVersionCBG)
            && Objects.equals(this.testNodeServer, that.testNodeServer)
            && Objects.equals(this.timeoutMilSec, that.timeoutMilSec)
            && Objects.equals(this.timerExpression, that.timerExpression) && Objects.equals(this.token, that.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(advancedConfig,
            dailyReportEnable,
            executeModel,
            executePeriodBegin,
            executePeriodEnd,
            executeStartTime,
            executionTime,
            executorOption,
            executorParameters,
            failedRetryTimes,
            intervalInSeconds,
            ipKey,
            locationIds,
            operateNotice,
            pbi,
            protocolTest,
            repeatTimes,
            serviceNameCBG,
            serviceScopeCBG,
            serviceVersionCBG,
            testNodeServer,
            timeoutMilSec,
            timerExpression,
            token);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteStrategiesVo {\n");
        sb.append("    advancedConfig: ").append(toIndentedString(advancedConfig)).append("\n");
        sb.append("    dailyReportEnable: ").append(toIndentedString(dailyReportEnable)).append("\n");
        sb.append("    executeModel: ").append(toIndentedString(executeModel)).append("\n");
        sb.append("    executePeriodBegin: ").append(toIndentedString(executePeriodBegin)).append("\n");
        sb.append("    executePeriodEnd: ").append(toIndentedString(executePeriodEnd)).append("\n");
        sb.append("    executeStartTime: ").append(toIndentedString(executeStartTime)).append("\n");
        sb.append("    executionTime: ").append(toIndentedString(executionTime)).append("\n");
        sb.append("    executorOption: ").append(toIndentedString(executorOption)).append("\n");
        sb.append("    executorParameters: ").append(toIndentedString(executorParameters)).append("\n");
        sb.append("    failedRetryTimes: ").append(toIndentedString(failedRetryTimes)).append("\n");
        sb.append("    intervalInSeconds: ").append(toIndentedString(intervalInSeconds)).append("\n");
        sb.append("    ipKey: ").append(toIndentedString(ipKey)).append("\n");
        sb.append("    locationIds: ").append(toIndentedString(locationIds)).append("\n");
        sb.append("    operateNotice: ").append(toIndentedString(operateNotice)).append("\n");
        sb.append("    pbi: ").append(toIndentedString(pbi)).append("\n");
        sb.append("    protocolTest: ").append(toIndentedString(protocolTest)).append("\n");
        sb.append("    repeatTimes: ").append(toIndentedString(repeatTimes)).append("\n");
        sb.append("    serviceNameCBG: ").append(toIndentedString(serviceNameCBG)).append("\n");
        sb.append("    serviceScopeCBG: ").append(toIndentedString(serviceScopeCBG)).append("\n");
        sb.append("    serviceVersionCBG: ").append(toIndentedString(serviceVersionCBG)).append("\n");
        sb.append("    testNodeServer: ").append(toIndentedString(testNodeServer)).append("\n");
        sb.append("    timeoutMilSec: ").append(toIndentedString(timeoutMilSec)).append("\n");
        sb.append("    timerExpression: ").append(toIndentedString(timerExpression)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
