package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 策略信息
 */
public class AntiVirusPolicyResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_type")

    private String startType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_period")

    private String scanPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_period_date")

    private Integer scanPeriodDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_hour")

    private Integer scanHour;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_minute")

    private Integer scanMinute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_start_time")

    private Long nextStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_dir")

    private String scanDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_dir")

    private String ignoreDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invalidate")

    private Boolean invalidate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_info_list")

    private List<AntiVirusPolicyHostResponseInfo> hostInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whether_paid_task")

    private Boolean whetherPaidTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type_list")

    private List<Integer> fileTypeList = null;

    public AntiVirusPolicyResponseInfo withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 策略ID
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public AntiVirusPolicyResponseInfo withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 策略名称
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public AntiVirusPolicyResponseInfo withStartType(String startType) {
        this.startType = startType;
        return this;
    }

    /**
     * **参数解释**： 启动类型 **取值范围**： 包含如下   - now：立即启动   - later：稍后启动   - period：周期启动 
     * @return startType
     */
    public String getStartType() {
        return startType;
    }

    public void setStartType(String startType) {
        this.startType = startType;
    }

    public AntiVirusPolicyResponseInfo withScanPeriod(String scanPeriod) {
        this.scanPeriod = scanPeriod;
        return this;
    }

    /**
     * 启动类型，包含如下:   - day ：每天   - week : 每周   - month : 每月
     * @return scanPeriod
     */
    public String getScanPeriod() {
        return scanPeriod;
    }

    public void setScanPeriod(String scanPeriod) {
        this.scanPeriod = scanPeriod;
    }

    public AntiVirusPolicyResponseInfo withScanPeriodDate(Integer scanPeriodDate) {
        this.scanPeriodDate = scanPeriodDate;
        return this;
    }

    /**
     * 扫描周期日期（1-28；扫描周期为week时，1-7代表周日至周六；扫描周期为month时，1-28代表每月1日到28日）
     * minimum: 1
     * maximum: 31
     * @return scanPeriodDate
     */
    public Integer getScanPeriodDate() {
        return scanPeriodDate;
    }

    public void setScanPeriodDate(Integer scanPeriodDate) {
        this.scanPeriodDate = scanPeriodDate;
    }

    public AntiVirusPolicyResponseInfo withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * 扫描时间戳，毫秒（仅启动类型为later时有值）
     * minimum: 0
     * maximum: 9223372036854775807
     * @return scanTime
     */
    public Long getScanTime() {
        return scanTime;
    }

    public void setScanTime(Long scanTime) {
        this.scanTime = scanTime;
    }

    public AntiVirusPolicyResponseInfo withScanHour(Integer scanHour) {
        this.scanHour = scanHour;
        return this;
    }

    /**
     * 扫描小时数（仅启动类型为period时有值）
     * minimum: 1
     * maximum: 24
     * @return scanHour
     */
    public Integer getScanHour() {
        return scanHour;
    }

    public void setScanHour(Integer scanHour) {
        this.scanHour = scanHour;
    }

    public AntiVirusPolicyResponseInfo withScanMinute(Integer scanMinute) {
        this.scanMinute = scanMinute;
        return this;
    }

    /**
     * 扫描分钟数（仅启动类型为period时有值）
     * minimum: 1
     * maximum: 31
     * @return scanMinute
     */
    public Integer getScanMinute() {
        return scanMinute;
    }

    public void setScanMinute(Integer scanMinute) {
        this.scanMinute = scanMinute;
    }

    public AntiVirusPolicyResponseInfo withNextStartTime(Long nextStartTime) {
        this.nextStartTime = nextStartTime;
        return this;
    }

    /**
     * 下次启动时间，毫秒
     * minimum: 0
     * maximum: 9223372036854775807
     * @return nextStartTime
     */
    public Long getNextStartTime() {
        return nextStartTime;
    }

    public void setNextStartTime(Long nextStartTime) {
        this.nextStartTime = nextStartTime;
    }

    public AntiVirusPolicyResponseInfo withScanDir(String scanDir) {
        this.scanDir = scanDir;
        return this;
    }

    /**
     * 扫描目录，多个用;分隔
     * @return scanDir
     */
    public String getScanDir() {
        return scanDir;
    }

    public void setScanDir(String scanDir) {
        this.scanDir = scanDir;
    }

    public AntiVirusPolicyResponseInfo withIgnoreDir(String ignoreDir) {
        this.ignoreDir = ignoreDir;
        return this;
    }

    /**
     * 排除目录，多个用;分隔
     * @return ignoreDir
     */
    public String getIgnoreDir() {
        return ignoreDir;
    }

    public void setIgnoreDir(String ignoreDir) {
        this.ignoreDir = ignoreDir;
    }

    public AntiVirusPolicyResponseInfo withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**: 处置动作 **取值范围**: - auto：自动处置 - manual：人工处置 
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public AntiVirusPolicyResponseInfo withInvalidate(Boolean invalidate) {
        this.invalidate = invalidate;
        return this;
    }

    /**
     * 失效，包含如下:   - true ：是   - fasle ：否
     * @return invalidate
     */
    public Boolean getInvalidate() {
        return invalidate;
    }

    public void setInvalidate(Boolean invalidate) {
        this.invalidate = invalidate;
    }

    public AntiVirusPolicyResponseInfo withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * **参数解释**: 影响主机数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return hostNum
     */
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    public AntiVirusPolicyResponseInfo withHostInfoList(List<AntiVirusPolicyHostResponseInfo> hostInfoList) {
        this.hostInfoList = hostInfoList;
        return this;
    }

    public AntiVirusPolicyResponseInfo addHostInfoListItem(AntiVirusPolicyHostResponseInfo hostInfoListItem) {
        if (this.hostInfoList == null) {
            this.hostInfoList = new ArrayList<>();
        }
        this.hostInfoList.add(hostInfoListItem);
        return this;
    }

    public AntiVirusPolicyResponseInfo withHostInfoList(
        Consumer<List<AntiVirusPolicyHostResponseInfo>> hostInfoListSetter) {
        if (this.hostInfoList == null) {
            this.hostInfoList = new ArrayList<>();
        }
        hostInfoListSetter.accept(this.hostInfoList);
        return this;
    }

    /**
     * 主机信息
     * @return hostInfoList
     */
    public List<AntiVirusPolicyHostResponseInfo> getHostInfoList() {
        return hostInfoList;
    }

    public void setHostInfoList(List<AntiVirusPolicyHostResponseInfo> hostInfoList) {
        this.hostInfoList = hostInfoList;
    }

    public AntiVirusPolicyResponseInfo withWhetherPaidTask(Boolean whetherPaidTask) {
        this.whetherPaidTask = whetherPaidTask;
        return this;
    }

    /**
     * 此次扫描任务是否付费
     * @return whetherPaidTask
     */
    public Boolean getWhetherPaidTask() {
        return whetherPaidTask;
    }

    public void setWhetherPaidTask(Boolean whetherPaidTask) {
        this.whetherPaidTask = whetherPaidTask;
    }

    public AntiVirusPolicyResponseInfo withFileTypeList(List<Integer> fileTypeList) {
        this.fileTypeList = fileTypeList;
        return this;
    }

    public AntiVirusPolicyResponseInfo addFileTypeListItem(Integer fileTypeListItem) {
        if (this.fileTypeList == null) {
            this.fileTypeList = new ArrayList<>();
        }
        this.fileTypeList.add(fileTypeListItem);
        return this;
    }

    public AntiVirusPolicyResponseInfo withFileTypeList(Consumer<List<Integer>> fileTypeListSetter) {
        if (this.fileTypeList == null) {
            this.fileTypeList = new ArrayList<>();
        }
        fileTypeListSetter.accept(this.fileTypeList);
        return this;
    }

    /**
     * 文件类型集合型
     * @return fileTypeList
     */
    public List<Integer> getFileTypeList() {
        return fileTypeList;
    }

    public void setFileTypeList(List<Integer> fileTypeList) {
        this.fileTypeList = fileTypeList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AntiVirusPolicyResponseInfo that = (AntiVirusPolicyResponseInfo) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.startType, that.startType) && Objects.equals(this.scanPeriod, that.scanPeriod)
            && Objects.equals(this.scanPeriodDate, that.scanPeriodDate) && Objects.equals(this.scanTime, that.scanTime)
            && Objects.equals(this.scanHour, that.scanHour) && Objects.equals(this.scanMinute, that.scanMinute)
            && Objects.equals(this.nextStartTime, that.nextStartTime) && Objects.equals(this.scanDir, that.scanDir)
            && Objects.equals(this.ignoreDir, that.ignoreDir) && Objects.equals(this.action, that.action)
            && Objects.equals(this.invalidate, that.invalidate) && Objects.equals(this.hostNum, that.hostNum)
            && Objects.equals(this.hostInfoList, that.hostInfoList)
            && Objects.equals(this.whetherPaidTask, that.whetherPaidTask)
            && Objects.equals(this.fileTypeList, that.fileTypeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId,
            policyName,
            startType,
            scanPeriod,
            scanPeriodDate,
            scanTime,
            scanHour,
            scanMinute,
            nextStartTime,
            scanDir,
            ignoreDir,
            action,
            invalidate,
            hostNum,
            hostInfoList,
            whetherPaidTask,
            fileTypeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AntiVirusPolicyResponseInfo {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    startType: ").append(toIndentedString(startType)).append("\n");
        sb.append("    scanPeriod: ").append(toIndentedString(scanPeriod)).append("\n");
        sb.append("    scanPeriodDate: ").append(toIndentedString(scanPeriodDate)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    scanHour: ").append(toIndentedString(scanHour)).append("\n");
        sb.append("    scanMinute: ").append(toIndentedString(scanMinute)).append("\n");
        sb.append("    nextStartTime: ").append(toIndentedString(nextStartTime)).append("\n");
        sb.append("    scanDir: ").append(toIndentedString(scanDir)).append("\n");
        sb.append("    ignoreDir: ").append(toIndentedString(ignoreDir)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    invalidate: ").append(toIndentedString(invalidate)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    hostInfoList: ").append(toIndentedString(hostInfoList)).append("\n");
        sb.append("    whetherPaidTask: ").append(toIndentedString(whetherPaidTask)).append("\n");
        sb.append("    fileTypeList: ").append(toIndentedString(fileTypeList)).append("\n");
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
