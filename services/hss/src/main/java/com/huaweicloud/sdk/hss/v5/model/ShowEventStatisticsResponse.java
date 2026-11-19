package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowEventStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risky_host_num")

    private Long riskyHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risky_container_num")

    private Long riskyContainerNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unhandled_num")

    private Long unhandledNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processed_num")

    private Long processedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_blocked_num")

    private Long autoBlockedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocked_ip_num")

    private Long blockedIpNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isolated_file_num")

    private Long isolatedFileNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_ES")

    private Boolean supportES;

    public ShowEventStatisticsResponse withRiskyHostNum(Long riskyHostNum) {
        this.riskyHostNum = riskyHostNum;
        return this;
    }

    /**
     * **参数解释**: 存在告警的服务器数量 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return riskyHostNum
     */
    public Long getRiskyHostNum() {
        return riskyHostNum;
    }

    public void setRiskyHostNum(Long riskyHostNum) {
        this.riskyHostNum = riskyHostNum;
    }

    public ShowEventStatisticsResponse withRiskyContainerNum(Long riskyContainerNum) {
        this.riskyContainerNum = riskyContainerNum;
        return this;
    }

    /**
     * **参数解释**: 存在告警的容器数量 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return riskyContainerNum
     */
    public Long getRiskyContainerNum() {
        return riskyContainerNum;
    }

    public void setRiskyContainerNum(Long riskyContainerNum) {
        this.riskyContainerNum = riskyContainerNum;
    }

    public ShowEventStatisticsResponse withUnhandledNum(Long unhandledNum) {
        this.unhandledNum = unhandledNum;
        return this;
    }

    /**
     * **参数解释**: 待处理告警事件数量 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return unhandledNum
     */
    public Long getUnhandledNum() {
        return unhandledNum;
    }

    public void setUnhandledNum(Long unhandledNum) {
        this.unhandledNum = unhandledNum;
    }

    public ShowEventStatisticsResponse withProcessedNum(Long processedNum) {
        this.processedNum = processedNum;
        return this;
    }

    /**
     * **参数解释**: 已处理告警事件数量 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return processedNum
     */
    public Long getProcessedNum() {
        return processedNum;
    }

    public void setProcessedNum(Long processedNum) {
        this.processedNum = processedNum;
    }

    public ShowEventStatisticsResponse withAutoBlockedNum(Long autoBlockedNum) {
        this.autoBlockedNum = autoBlockedNum;
        return this;
    }

    /**
     * **参数解释**: 自动处置告警事件数量 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return autoBlockedNum
     */
    public Long getAutoBlockedNum() {
        return autoBlockedNum;
    }

    public void setAutoBlockedNum(Long autoBlockedNum) {
        this.autoBlockedNum = autoBlockedNum;
    }

    public ShowEventStatisticsResponse withBlockedIpNum(Long blockedIpNum) {
        this.blockedIpNum = blockedIpNum;
        return this;
    }

    /**
     * **参数解释**: 已拦截IP数量 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return blockedIpNum
     */
    public Long getBlockedIpNum() {
        return blockedIpNum;
    }

    public void setBlockedIpNum(Long blockedIpNum) {
        this.blockedIpNum = blockedIpNum;
    }

    public ShowEventStatisticsResponse withIsolatedFileNum(Long isolatedFileNum) {
        this.isolatedFileNum = isolatedFileNum;
        return this;
    }

    /**
     * **参数解释**: 已隔离文件数量 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return isolatedFileNum
     */
    public Long getIsolatedFileNum() {
        return isolatedFileNum;
    }

    public void setIsolatedFileNum(Long isolatedFileNum) {
        this.isolatedFileNum = isolatedFileNum;
    }

    public ShowEventStatisticsResponse withSupportES(Boolean supportES) {
        this.supportES = supportES;
        return this;
    }

    /**
     * **参数解释**: 是否支持ES查询 **取值范围**: - true：支持 - false：不支持 
     * @return supportES
     */
    public Boolean getSupportES() {
        return supportES;
    }

    public void setSupportES(Boolean supportES) {
        this.supportES = supportES;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEventStatisticsResponse that = (ShowEventStatisticsResponse) obj;
        return Objects.equals(this.riskyHostNum, that.riskyHostNum)
            && Objects.equals(this.riskyContainerNum, that.riskyContainerNum)
            && Objects.equals(this.unhandledNum, that.unhandledNum)
            && Objects.equals(this.processedNum, that.processedNum)
            && Objects.equals(this.autoBlockedNum, that.autoBlockedNum)
            && Objects.equals(this.blockedIpNum, that.blockedIpNum)
            && Objects.equals(this.isolatedFileNum, that.isolatedFileNum)
            && Objects.equals(this.supportES, that.supportES);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskyHostNum,
            riskyContainerNum,
            unhandledNum,
            processedNum,
            autoBlockedNum,
            blockedIpNum,
            isolatedFileNum,
            supportES);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEventStatisticsResponse {\n");
        sb.append("    riskyHostNum: ").append(toIndentedString(riskyHostNum)).append("\n");
        sb.append("    riskyContainerNum: ").append(toIndentedString(riskyContainerNum)).append("\n");
        sb.append("    unhandledNum: ").append(toIndentedString(unhandledNum)).append("\n");
        sb.append("    processedNum: ").append(toIndentedString(processedNum)).append("\n");
        sb.append("    autoBlockedNum: ").append(toIndentedString(autoBlockedNum)).append("\n");
        sb.append("    blockedIpNum: ").append(toIndentedString(blockedIpNum)).append("\n");
        sb.append("    isolatedFileNum: ").append(toIndentedString(isolatedFileNum)).append("\n");
        sb.append("    supportES: ").append(toIndentedString(supportES)).append("\n");
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
