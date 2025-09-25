package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OperationSummaryInfo
 */
public class OperationSummaryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hss_visit_days")

    private Integer hssVisitDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_beat_rate")

    private Float workloadBeatRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_month_start")

    private Long currentMonthStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_month_end")

    private Long currentMonthEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handled_security_event_num")

    private Long handledSecurityEventNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_workload_beat_rate")

    private Float totalWorkloadBeatRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private String reportId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_month")

    private Integer currentMonth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work")

    private String work;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    public OperationSummaryInfo withHssVisitDays(Integer hssVisitDays) {
        this.hssVisitDays = hssVisitDays;
        return this;
    }

    /**
     * **参数解释**: 用户访问HSS天数 **取值范围**: 最小值0，最大值365 
     * minimum: 0
     * maximum: 31
     * @return hssVisitDays
     */
    public Integer getHssVisitDays() {
        return hssVisitDays;
    }

    public void setHssVisitDays(Integer hssVisitDays) {
        this.hssVisitDays = hssVisitDays;
    }

    public OperationSummaryInfo withWorkloadBeatRate(Float workloadBeatRate) {
        this.workloadBeatRate = workloadBeatRate;
        return this;
    }

    /**
     * **参数解释**: 某个工作超过的用户百分比（目前只有漏洞或告警，哪个打败的用户占比高，显示哪个） **取值范围**: 最小值0，最大值1 
     * minimum: 0
     * maximum: 1
     * @return workloadBeatRate
     */
    public Float getWorkloadBeatRate() {
        return workloadBeatRate;
    }

    public void setWorkloadBeatRate(Float workloadBeatRate) {
        this.workloadBeatRate = workloadBeatRate;
    }

    public OperationSummaryInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**: 用户名 **取值范围**: 字符长度0-128位 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public OperationSummaryInfo withCurrentMonthStart(Long currentMonthStart) {
        this.currentMonthStart = currentMonthStart;
        return this;
    }

    /**
     * **参数解释**: 当前月初时间戳 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return currentMonthStart
     */
    public Long getCurrentMonthStart() {
        return currentMonthStart;
    }

    public void setCurrentMonthStart(Long currentMonthStart) {
        this.currentMonthStart = currentMonthStart;
    }

    public OperationSummaryInfo withCurrentMonthEnd(Long currentMonthEnd) {
        this.currentMonthEnd = currentMonthEnd;
        return this;
    }

    /**
     * **参数解释**: 当前月末时间戳 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return currentMonthEnd
     */
    public Long getCurrentMonthEnd() {
        return currentMonthEnd;
    }

    public void setCurrentMonthEnd(Long currentMonthEnd) {
        this.currentMonthEnd = currentMonthEnd;
    }

    public OperationSummaryInfo withHandledSecurityEventNum(Long handledSecurityEventNum) {
        this.handledSecurityEventNum = handledSecurityEventNum;
        return this;
    }

    /**
     * **参数解释**: 处置的安全事件条数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return handledSecurityEventNum
     */
    public Long getHandledSecurityEventNum() {
        return handledSecurityEventNum;
    }

    public void setHandledSecurityEventNum(Long handledSecurityEventNum) {
        this.handledSecurityEventNum = handledSecurityEventNum;
    }

    public OperationSummaryInfo withTotalWorkloadBeatRate(Float totalWorkloadBeatRate) {
        this.totalWorkloadBeatRate = totalWorkloadBeatRate;
        return this;
    }

    /**
     * **参数解释**: 工作量打败的用户百分比 **取值范围**: 最小值0，最大值1 
     * minimum: 0
     * maximum: 1
     * @return totalWorkloadBeatRate
     */
    public Float getTotalWorkloadBeatRate() {
        return totalWorkloadBeatRate;
    }

    public void setTotalWorkloadBeatRate(Float totalWorkloadBeatRate) {
        this.totalWorkloadBeatRate = totalWorkloadBeatRate;
    }

    public OperationSummaryInfo withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释**:  称号 **取值范围**: -vul-fix-master: 补洞大师。 -vul-fix-expert: 漏洞修复小能手。 -baseline-handle: 风险配置处置高手。 -malware-file: 防病毒先锋。 -ransomware-event: 防勒索达人。 -web-tamper-event: 网站守卫。 
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public OperationSummaryInfo withReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * **参数解释**: 时间字符串 **取值范围**: 字符长度0-32位 
     * @return reportId
     */
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public OperationSummaryInfo withCurrentMonth(Integer currentMonth) {
        this.currentMonth = currentMonth;
        return this;
    }

    /**
     * **参数解释**: 当前月份 **取值范围**: 最小值1，最大值12 
     * minimum: 1
     * maximum: 12
     * @return currentMonth
     */
    public Integer getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(Integer currentMonth) {
        this.currentMonth = currentMonth;
    }

    public OperationSummaryInfo withWork(String work) {
        this.work = work;
        return this;
    }

    /**
     * **参数解释**: 工作（哪个打败的用户占比高，显示哪个) **取值范围**: -vul-fix: 漏洞修复 -baseline-handle: 基线处置 -event-handle: 处置入侵事件 
     * @return work
     */
    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public OperationSummaryInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**: 报告生成时间戳 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperationSummaryInfo that = (OperationSummaryInfo) obj;
        return Objects.equals(this.hssVisitDays, that.hssVisitDays)
            && Objects.equals(this.workloadBeatRate, that.workloadBeatRate)
            && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.currentMonthStart, that.currentMonthStart)
            && Objects.equals(this.currentMonthEnd, that.currentMonthEnd)
            && Objects.equals(this.handledSecurityEventNum, that.handledSecurityEventNum)
            && Objects.equals(this.totalWorkloadBeatRate, that.totalWorkloadBeatRate)
            && Objects.equals(this.title, that.title) && Objects.equals(this.reportId, that.reportId)
            && Objects.equals(this.currentMonth, that.currentMonth) && Objects.equals(this.work, that.work)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hssVisitDays,
            workloadBeatRate,
            userName,
            currentMonthStart,
            currentMonthEnd,
            handledSecurityEventNum,
            totalWorkloadBeatRate,
            title,
            reportId,
            currentMonth,
            work,
            createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperationSummaryInfo {\n");
        sb.append("    hssVisitDays: ").append(toIndentedString(hssVisitDays)).append("\n");
        sb.append("    workloadBeatRate: ").append(toIndentedString(workloadBeatRate)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    currentMonthStart: ").append(toIndentedString(currentMonthStart)).append("\n");
        sb.append("    currentMonthEnd: ").append(toIndentedString(currentMonthEnd)).append("\n");
        sb.append("    handledSecurityEventNum: ").append(toIndentedString(handledSecurityEventNum)).append("\n");
        sb.append("    totalWorkloadBeatRate: ").append(toIndentedString(totalWorkloadBeatRate)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    currentMonth: ").append(toIndentedString(currentMonth)).append("\n");
        sb.append("    work: ").append(toIndentedString(work)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
