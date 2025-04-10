package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改自定义扫描策略
 */
public class ChangeAntivirusPolicyRequestInfo {

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
    @JsonProperty(value = "timezone_offset")

    private Integer timezoneOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_types")

    private List<Integer> fileTypes = null;

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
    @JsonProperty(value = "whether_paid_task")

    private Boolean whetherPaidTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ids")

    private List<String> hostIds = null;

    public ChangeAntivirusPolicyRequestInfo withPolicyId(String policyId) {
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

    public ChangeAntivirusPolicyRequestInfo withPolicyName(String policyName) {
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

    public ChangeAntivirusPolicyRequestInfo withStartType(String startType) {
        this.startType = startType;
        return this;
    }

    /**
     * 启动类型，包含如下:   - now : 立即启动   - later : 稍后启动   - period : 周期启动
     * @return startType
     */
    public String getStartType() {
        return startType;
    }

    public void setStartType(String startType) {
        this.startType = startType;
    }

    public ChangeAntivirusPolicyRequestInfo withScanPeriod(String scanPeriod) {
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

    public ChangeAntivirusPolicyRequestInfo withScanPeriodDate(Integer scanPeriodDate) {
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

    public ChangeAntivirusPolicyRequestInfo withScanTime(Long scanTime) {
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

    public ChangeAntivirusPolicyRequestInfo withScanHour(Integer scanHour) {
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

    public ChangeAntivirusPolicyRequestInfo withScanMinute(Integer scanMinute) {
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

    public ChangeAntivirusPolicyRequestInfo withTimezoneOffset(Integer timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
        return this;
    }

    /**
     * 时区偏移量（仅启动类型为period时有值，单位：分钟）
     * minimum: -720
     * maximum: 720
     * @return timezoneOffset
     */
    public Integer getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(Integer timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public ChangeAntivirusPolicyRequestInfo withFileTypes(List<Integer> fileTypes) {
        this.fileTypes = fileTypes;
        return this;
    }

    public ChangeAntivirusPolicyRequestInfo addFileTypesItem(Integer fileTypesItem) {
        if (this.fileTypes == null) {
            this.fileTypes = new ArrayList<>();
        }
        this.fileTypes.add(fileTypesItem);
        return this;
    }

    public ChangeAntivirusPolicyRequestInfo withFileTypes(Consumer<List<Integer>> fileTypesSetter) {
        if (this.fileTypes == null) {
            this.fileTypes = new ArrayList<>();
        }
        fileTypesSetter.accept(this.fileTypes);
        return this;
    }

    /**
     * 文件类型集合型，包含如下:   - 0 ：全部   - 1 : 可执行   - 2 : 压缩   - 3 : 脚本   - 4 : 文档   - 5 : 图片   - 6 : 音视频
     * @return fileTypes
     */
    public List<Integer> getFileTypes() {
        return fileTypes;
    }

    public void setFileTypes(List<Integer> fileTypes) {
        this.fileTypes = fileTypes;
    }

    public ChangeAntivirusPolicyRequestInfo withScanDir(String scanDir) {
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

    public ChangeAntivirusPolicyRequestInfo withIgnoreDir(String ignoreDir) {
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

    public ChangeAntivirusPolicyRequestInfo withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 处置动作，包含如下:   - auto ：自动处置   - manual : 人工处置
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ChangeAntivirusPolicyRequestInfo withWhetherPaidTask(Boolean whetherPaidTask) {
        this.whetherPaidTask = whetherPaidTask;
        return this;
    }

    /**
     * 此次扫描任务是否消耗按次计费配额
     * @return whetherPaidTask
     */
    public Boolean getWhetherPaidTask() {
        return whetherPaidTask;
    }

    public void setWhetherPaidTask(Boolean whetherPaidTask) {
        this.whetherPaidTask = whetherPaidTask;
    }

    public ChangeAntivirusPolicyRequestInfo withHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
        return this;
    }

    public ChangeAntivirusPolicyRequestInfo addHostIdsItem(String hostIdsItem) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        this.hostIds.add(hostIdsItem);
        return this;
    }

    public ChangeAntivirusPolicyRequestInfo withHostIds(Consumer<List<String>> hostIdsSetter) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        hostIdsSetter.accept(this.hostIds);
        return this;
    }

    /**
     * 策略管理主机列表
     * @return hostIds
     */
    public List<String> getHostIds() {
        return hostIds;
    }

    public void setHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeAntivirusPolicyRequestInfo that = (ChangeAntivirusPolicyRequestInfo) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.startType, that.startType) && Objects.equals(this.scanPeriod, that.scanPeriod)
            && Objects.equals(this.scanPeriodDate, that.scanPeriodDate) && Objects.equals(this.scanTime, that.scanTime)
            && Objects.equals(this.scanHour, that.scanHour) && Objects.equals(this.scanMinute, that.scanMinute)
            && Objects.equals(this.timezoneOffset, that.timezoneOffset)
            && Objects.equals(this.fileTypes, that.fileTypes) && Objects.equals(this.scanDir, that.scanDir)
            && Objects.equals(this.ignoreDir, that.ignoreDir) && Objects.equals(this.action, that.action)
            && Objects.equals(this.whetherPaidTask, that.whetherPaidTask) && Objects.equals(this.hostIds, that.hostIds);
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
            timezoneOffset,
            fileTypes,
            scanDir,
            ignoreDir,
            action,
            whetherPaidTask,
            hostIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeAntivirusPolicyRequestInfo {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    startType: ").append(toIndentedString(startType)).append("\n");
        sb.append("    scanPeriod: ").append(toIndentedString(scanPeriod)).append("\n");
        sb.append("    scanPeriodDate: ").append(toIndentedString(scanPeriodDate)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    scanHour: ").append(toIndentedString(scanHour)).append("\n");
        sb.append("    scanMinute: ").append(toIndentedString(scanMinute)).append("\n");
        sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
        sb.append("    fileTypes: ").append(toIndentedString(fileTypes)).append("\n");
        sb.append("    scanDir: ").append(toIndentedString(scanDir)).append("\n");
        sb.append("    ignoreDir: ").append(toIndentedString(ignoreDir)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    whetherPaidTask: ").append(toIndentedString(whetherPaidTask)).append("\n");
        sb.append("    hostIds: ").append(toIndentedString(hostIds)).append("\n");
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
