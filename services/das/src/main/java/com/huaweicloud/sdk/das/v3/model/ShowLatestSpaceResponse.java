package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowLatestSpaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buy_storage_bytes")

    private Long buyStorageBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_storage_bytes")

    private Long usedStorageBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_storage_bytes")

    private Long lastStorageBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buy_storage_percent")

    private Double buyStoragePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_usage_bytes")

    private Long dataUsageBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_usage_percent")

    private Double dataUsagePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binlog_usage_bytes")

    private Long binlogUsageBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binlog_usage_percent")

    private Double binlogUsagePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relay_log_usage_bytes")

    private Long relayLogUsageBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relay_log_usage_percent")

    private Double relayLogUsagePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_log_usage_bytes")

    private Long auditLogUsageBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_log_usage_percent")

    private Double auditLogUsagePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_log_usage_bytes")

    private Long slowLogUsageBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_log_usage_percent")

    private Double slowLogUsagePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_usage_bytes")

    private Long tempUsageBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_usage_percent")

    private Double tempUsagePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "undo_log_usage_bytes")

    private Long undoLogUsageBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "undo_log_usage_percent")

    private Double undoLogUsagePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_usage_bytes")

    private Long otherUsageBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_usage_percent")

    private Double otherUsagePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "too_many_files")

    private Boolean tooManyFiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_usage_bytes")

    private Double pageUsageBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_space")

    private Long totalSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_usage")

    private Long totalUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avail_size")

    private Long availSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private Double data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log")

    private Double log;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime")

    private Double runtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_log")

    private Double slowLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_log")

    private Double auditLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tempdb")

    private Double tempdb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msdb")

    private Double msdb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_size_bytes")

    private Long usedSizeBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_size_bytes")

    private Long totalSizeBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_daily_growth_bytes")

    private Double avgDailyGrowthBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimated_available_days")

    private Long estimatedAvailableDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_size_bytes")

    private Long dataSizeBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oplog_size_bytes")

    private Long oplogSizeBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_size_bytes")

    private Long otherSizeBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wal_size")

    private Double walSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_size")

    private Double dataSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pgaudit_log_size")

    private Double pgauditLogSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pgsql_tmp_size")

    private Double pgsqlTmpSize;

    public ShowLatestSpaceResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ShowLatestSpaceResponse withBuyStorageBytes(Long buyStorageBytes) {
        this.buyStorageBytes = buyStorageBytes;
        return this;
    }

    /**
     * MySQL购买空间
     * @return buyStorageBytes
     */
    public Long getBuyStorageBytes() {
        return buyStorageBytes;
    }

    public void setBuyStorageBytes(Long buyStorageBytes) {
        this.buyStorageBytes = buyStorageBytes;
    }

    public ShowLatestSpaceResponse withUsedStorageBytes(Long usedStorageBytes) {
        this.usedStorageBytes = usedStorageBytes;
        return this;
    }

    /**
     * MySQL已使用空间
     * @return usedStorageBytes
     */
    public Long getUsedStorageBytes() {
        return usedStorageBytes;
    }

    public void setUsedStorageBytes(Long usedStorageBytes) {
        this.usedStorageBytes = usedStorageBytes;
    }

    public ShowLatestSpaceResponse withLastStorageBytes(Long lastStorageBytes) {
        this.lastStorageBytes = lastStorageBytes;
        return this;
    }

    /**
     * MySQL剩余空间
     * @return lastStorageBytes
     */
    public Long getLastStorageBytes() {
        return lastStorageBytes;
    }

    public void setLastStorageBytes(Long lastStorageBytes) {
        this.lastStorageBytes = lastStorageBytes;
    }

    public ShowLatestSpaceResponse withBuyStoragePercent(Double buyStoragePercent) {
        this.buyStoragePercent = buyStoragePercent;
        return this;
    }

    /**
     * MySQL使用空间占比
     * @return buyStoragePercent
     */
    public Double getBuyStoragePercent() {
        return buyStoragePercent;
    }

    public void setBuyStoragePercent(Double buyStoragePercent) {
        this.buyStoragePercent = buyStoragePercent;
    }

    public ShowLatestSpaceResponse withDataUsageBytes(Long dataUsageBytes) {
        this.dataUsageBytes = dataUsageBytes;
        return this;
    }

    /**
     * 数据空间
     * @return dataUsageBytes
     */
    public Long getDataUsageBytes() {
        return dataUsageBytes;
    }

    public void setDataUsageBytes(Long dataUsageBytes) {
        this.dataUsageBytes = dataUsageBytes;
    }

    public ShowLatestSpaceResponse withDataUsagePercent(Double dataUsagePercent) {
        this.dataUsagePercent = dataUsagePercent;
        return this;
    }

    /**
     * 数据空间占比
     * @return dataUsagePercent
     */
    public Double getDataUsagePercent() {
        return dataUsagePercent;
    }

    public void setDataUsagePercent(Double dataUsagePercent) {
        this.dataUsagePercent = dataUsagePercent;
    }

    public ShowLatestSpaceResponse withBinlogUsageBytes(Long binlogUsageBytes) {
        this.binlogUsageBytes = binlogUsageBytes;
        return this;
    }

    /**
     * binlog空间
     * @return binlogUsageBytes
     */
    public Long getBinlogUsageBytes() {
        return binlogUsageBytes;
    }

    public void setBinlogUsageBytes(Long binlogUsageBytes) {
        this.binlogUsageBytes = binlogUsageBytes;
    }

    public ShowLatestSpaceResponse withBinlogUsagePercent(Double binlogUsagePercent) {
        this.binlogUsagePercent = binlogUsagePercent;
        return this;
    }

    /**
     * binlog空间占比
     * @return binlogUsagePercent
     */
    public Double getBinlogUsagePercent() {
        return binlogUsagePercent;
    }

    public void setBinlogUsagePercent(Double binlogUsagePercent) {
        this.binlogUsagePercent = binlogUsagePercent;
    }

    public ShowLatestSpaceResponse withRelayLogUsageBytes(Long relayLogUsageBytes) {
        this.relayLogUsageBytes = relayLogUsageBytes;
        return this;
    }

    /**
     * relayLog空间
     * @return relayLogUsageBytes
     */
    public Long getRelayLogUsageBytes() {
        return relayLogUsageBytes;
    }

    public void setRelayLogUsageBytes(Long relayLogUsageBytes) {
        this.relayLogUsageBytes = relayLogUsageBytes;
    }

    public ShowLatestSpaceResponse withRelayLogUsagePercent(Double relayLogUsagePercent) {
        this.relayLogUsagePercent = relayLogUsagePercent;
        return this;
    }

    /**
     * relayLog空间占比
     * @return relayLogUsagePercent
     */
    public Double getRelayLogUsagePercent() {
        return relayLogUsagePercent;
    }

    public void setRelayLogUsagePercent(Double relayLogUsagePercent) {
        this.relayLogUsagePercent = relayLogUsagePercent;
    }

    public ShowLatestSpaceResponse withAuditLogUsageBytes(Long auditLogUsageBytes) {
        this.auditLogUsageBytes = auditLogUsageBytes;
        return this;
    }

    /**
     * auditLog空间
     * @return auditLogUsageBytes
     */
    public Long getAuditLogUsageBytes() {
        return auditLogUsageBytes;
    }

    public void setAuditLogUsageBytes(Long auditLogUsageBytes) {
        this.auditLogUsageBytes = auditLogUsageBytes;
    }

    public ShowLatestSpaceResponse withAuditLogUsagePercent(Double auditLogUsagePercent) {
        this.auditLogUsagePercent = auditLogUsagePercent;
        return this;
    }

    /**
     * auditLog空间占比
     * @return auditLogUsagePercent
     */
    public Double getAuditLogUsagePercent() {
        return auditLogUsagePercent;
    }

    public void setAuditLogUsagePercent(Double auditLogUsagePercent) {
        this.auditLogUsagePercent = auditLogUsagePercent;
    }

    public ShowLatestSpaceResponse withSlowLogUsageBytes(Long slowLogUsageBytes) {
        this.slowLogUsageBytes = slowLogUsageBytes;
        return this;
    }

    /**
     * slowLog空间
     * @return slowLogUsageBytes
     */
    public Long getSlowLogUsageBytes() {
        return slowLogUsageBytes;
    }

    public void setSlowLogUsageBytes(Long slowLogUsageBytes) {
        this.slowLogUsageBytes = slowLogUsageBytes;
    }

    public ShowLatestSpaceResponse withSlowLogUsagePercent(Double slowLogUsagePercent) {
        this.slowLogUsagePercent = slowLogUsagePercent;
        return this;
    }

    /**
     * slowLog空间占比
     * @return slowLogUsagePercent
     */
    public Double getSlowLogUsagePercent() {
        return slowLogUsagePercent;
    }

    public void setSlowLogUsagePercent(Double slowLogUsagePercent) {
        this.slowLogUsagePercent = slowLogUsagePercent;
    }

    public ShowLatestSpaceResponse withTempUsageBytes(Long tempUsageBytes) {
        this.tempUsageBytes = tempUsageBytes;
        return this;
    }

    /**
     * 临时空间
     * @return tempUsageBytes
     */
    public Long getTempUsageBytes() {
        return tempUsageBytes;
    }

    public void setTempUsageBytes(Long tempUsageBytes) {
        this.tempUsageBytes = tempUsageBytes;
    }

    public ShowLatestSpaceResponse withTempUsagePercent(Double tempUsagePercent) {
        this.tempUsagePercent = tempUsagePercent;
        return this;
    }

    /**
     * 临时空间占比
     * @return tempUsagePercent
     */
    public Double getTempUsagePercent() {
        return tempUsagePercent;
    }

    public void setTempUsagePercent(Double tempUsagePercent) {
        this.tempUsagePercent = tempUsagePercent;
    }

    public ShowLatestSpaceResponse withUndoLogUsageBytes(Long undoLogUsageBytes) {
        this.undoLogUsageBytes = undoLogUsageBytes;
        return this;
    }

    /**
     * undoLog空间
     * @return undoLogUsageBytes
     */
    public Long getUndoLogUsageBytes() {
        return undoLogUsageBytes;
    }

    public void setUndoLogUsageBytes(Long undoLogUsageBytes) {
        this.undoLogUsageBytes = undoLogUsageBytes;
    }

    public ShowLatestSpaceResponse withUndoLogUsagePercent(Double undoLogUsagePercent) {
        this.undoLogUsagePercent = undoLogUsagePercent;
        return this;
    }

    /**
     * undoLog空间占比
     * @return undoLogUsagePercent
     */
    public Double getUndoLogUsagePercent() {
        return undoLogUsagePercent;
    }

    public void setUndoLogUsagePercent(Double undoLogUsagePercent) {
        this.undoLogUsagePercent = undoLogUsagePercent;
    }

    public ShowLatestSpaceResponse withOtherUsageBytes(Long otherUsageBytes) {
        this.otherUsageBytes = otherUsageBytes;
        return this;
    }

    /**
     * 其他空间
     * @return otherUsageBytes
     */
    public Long getOtherUsageBytes() {
        return otherUsageBytes;
    }

    public void setOtherUsageBytes(Long otherUsageBytes) {
        this.otherUsageBytes = otherUsageBytes;
    }

    public ShowLatestSpaceResponse withOtherUsagePercent(Double otherUsagePercent) {
        this.otherUsagePercent = otherUsagePercent;
        return this;
    }

    /**
     * 其他空间占比
     * @return otherUsagePercent
     */
    public Double getOtherUsagePercent() {
        return otherUsagePercent;
    }

    public void setOtherUsagePercent(Double otherUsagePercent) {
        this.otherUsagePercent = otherUsagePercent;
    }

    public ShowLatestSpaceResponse withTooManyFiles(Boolean tooManyFiles) {
        this.tooManyFiles = tooManyFiles;
        return this;
    }

    /**
     * 是否文件过多
     * @return tooManyFiles
     */
    public Boolean getTooManyFiles() {
        return tooManyFiles;
    }

    public void setTooManyFiles(Boolean tooManyFiles) {
        this.tooManyFiles = tooManyFiles;
    }

    public ShowLatestSpaceResponse withPageUsageBytes(Double pageUsageBytes) {
        this.pageUsageBytes = pageUsageBytes;
        return this;
    }

    /**
     * TaurusDB数据空间
     * @return pageUsageBytes
     */
    public Double getPageUsageBytes() {
        return pageUsageBytes;
    }

    public void setPageUsageBytes(Double pageUsageBytes) {
        this.pageUsageBytes = pageUsageBytes;
    }

    public ShowLatestSpaceResponse withTotalSpace(Long totalSpace) {
        this.totalSpace = totalSpace;
        return this;
    }

    /**
     * SQLServer总空间
     * @return totalSpace
     */
    public Long getTotalSpace() {
        return totalSpace;
    }

    public void setTotalSpace(Long totalSpace) {
        this.totalSpace = totalSpace;
    }

    public ShowLatestSpaceResponse withTotalUsage(Long totalUsage) {
        this.totalUsage = totalUsage;
        return this;
    }

    /**
     * SQLServer已使用空间
     * @return totalUsage
     */
    public Long getTotalUsage() {
        return totalUsage;
    }

    public void setTotalUsage(Long totalUsage) {
        this.totalUsage = totalUsage;
    }

    public ShowLatestSpaceResponse withAvailSize(Long availSize) {
        this.availSize = availSize;
        return this;
    }

    /**
     * SQLServer可用空间
     * @return availSize
     */
    public Long getAvailSize() {
        return availSize;
    }

    public void setAvailSize(Long availSize) {
        this.availSize = availSize;
    }

    public ShowLatestSpaceResponse withData(Double data) {
        this.data = data;
        return this;
    }

    /**
     * SQLServer数据空间
     * @return data
     */
    public Double getData() {
        return data;
    }

    public void setData(Double data) {
        this.data = data;
    }

    public ShowLatestSpaceResponse withLog(Double log) {
        this.log = log;
        return this;
    }

    /**
     * SQLServer log空间
     * @return log
     */
    public Double getLog() {
        return log;
    }

    public void setLog(Double log) {
        this.log = log;
    }

    public ShowLatestSpaceResponse withRuntime(Double runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * SQLServer runtime
     * @return runtime
     */
    public Double getRuntime() {
        return runtime;
    }

    public void setRuntime(Double runtime) {
        this.runtime = runtime;
    }

    public ShowLatestSpaceResponse withSlowLog(Double slowLog) {
        this.slowLog = slowLog;
        return this;
    }

    /**
     * SQLServer slow_log空间
     * @return slowLog
     */
    public Double getSlowLog() {
        return slowLog;
    }

    public void setSlowLog(Double slowLog) {
        this.slowLog = slowLog;
    }

    public ShowLatestSpaceResponse withAuditLog(Double auditLog) {
        this.auditLog = auditLog;
        return this;
    }

    /**
     * SQLServer audit_log空间
     * @return auditLog
     */
    public Double getAuditLog() {
        return auditLog;
    }

    public void setAuditLog(Double auditLog) {
        this.auditLog = auditLog;
    }

    public ShowLatestSpaceResponse withTempdb(Double tempdb) {
        this.tempdb = tempdb;
        return this;
    }

    /**
     * SQLServer tempdb空间
     * @return tempdb
     */
    public Double getTempdb() {
        return tempdb;
    }

    public void setTempdb(Double tempdb) {
        this.tempdb = tempdb;
    }

    public ShowLatestSpaceResponse withMsdb(Double msdb) {
        this.msdb = msdb;
        return this;
    }

    /**
     * SQLServer msdb空间
     * @return msdb
     */
    public Double getMsdb() {
        return msdb;
    }

    public void setMsdb(Double msdb) {
        this.msdb = msdb;
    }

    public ShowLatestSpaceResponse withUsedSizeBytes(Long usedSizeBytes) {
        this.usedSizeBytes = usedSizeBytes;
        return this;
    }

    /**
     * DDS磁盘使用量
     * @return usedSizeBytes
     */
    public Long getUsedSizeBytes() {
        return usedSizeBytes;
    }

    public void setUsedSizeBytes(Long usedSizeBytes) {
        this.usedSizeBytes = usedSizeBytes;
    }

    public ShowLatestSpaceResponse withTotalSizeBytes(Long totalSizeBytes) {
        this.totalSizeBytes = totalSizeBytes;
        return this;
    }

    /**
     * DDS磁盘总量
     * @return totalSizeBytes
     */
    public Long getTotalSizeBytes() {
        return totalSizeBytes;
    }

    public void setTotalSizeBytes(Long totalSizeBytes) {
        this.totalSizeBytes = totalSizeBytes;
    }

    public ShowLatestSpaceResponse withAvgDailyGrowthBytes(Double avgDailyGrowthBytes) {
        this.avgDailyGrowthBytes = avgDailyGrowthBytes;
        return this;
    }

    /**
     * DDS近一周日均增长
     * @return avgDailyGrowthBytes
     */
    public Double getAvgDailyGrowthBytes() {
        return avgDailyGrowthBytes;
    }

    public void setAvgDailyGrowthBytes(Double avgDailyGrowthBytes) {
        this.avgDailyGrowthBytes = avgDailyGrowthBytes;
    }

    public ShowLatestSpaceResponse withEstimatedAvailableDays(Long estimatedAvailableDays) {
        this.estimatedAvailableDays = estimatedAvailableDays;
        return this;
    }

    /**
     * DDS预计可用天数
     * @return estimatedAvailableDays
     */
    public Long getEstimatedAvailableDays() {
        return estimatedAvailableDays;
    }

    public void setEstimatedAvailableDays(Long estimatedAvailableDays) {
        this.estimatedAvailableDays = estimatedAvailableDays;
    }

    public ShowLatestSpaceResponse withDataSizeBytes(Long dataSizeBytes) {
        this.dataSizeBytes = dataSizeBytes;
        return this;
    }

    /**
     * DDS数据空间
     * @return dataSizeBytes
     */
    public Long getDataSizeBytes() {
        return dataSizeBytes;
    }

    public void setDataSizeBytes(Long dataSizeBytes) {
        this.dataSizeBytes = dataSizeBytes;
    }

    public ShowLatestSpaceResponse withOplogSizeBytes(Long oplogSizeBytes) {
        this.oplogSizeBytes = oplogSizeBytes;
        return this;
    }

    /**
     * DDS oplog空间
     * @return oplogSizeBytes
     */
    public Long getOplogSizeBytes() {
        return oplogSizeBytes;
    }

    public void setOplogSizeBytes(Long oplogSizeBytes) {
        this.oplogSizeBytes = oplogSizeBytes;
    }

    public ShowLatestSpaceResponse withOtherSizeBytes(Long otherSizeBytes) {
        this.otherSizeBytes = otherSizeBytes;
        return this;
    }

    /**
     * DDS其他空间
     * @return otherSizeBytes
     */
    public Long getOtherSizeBytes() {
        return otherSizeBytes;
    }

    public void setOtherSizeBytes(Long otherSizeBytes) {
        this.otherSizeBytes = otherSizeBytes;
    }

    public ShowLatestSpaceResponse withWalSize(Double walSize) {
        this.walSize = walSize;
        return this;
    }

    /**
     * PostgreSQL wallog空间
     * @return walSize
     */
    public Double getWalSize() {
        return walSize;
    }

    public void setWalSize(Double walSize) {
        this.walSize = walSize;
    }

    public ShowLatestSpaceResponse withDataSize(Double dataSize) {
        this.dataSize = dataSize;
        return this;
    }

    /**
     * PostgreSQL数据空间
     * @return dataSize
     */
    public Double getDataSize() {
        return dataSize;
    }

    public void setDataSize(Double dataSize) {
        this.dataSize = dataSize;
    }

    public ShowLatestSpaceResponse withPgauditLogSize(Double pgauditLogSize) {
        this.pgauditLogSize = pgauditLogSize;
        return this;
    }

    /**
     * PostgreSQL auditlog空间
     * @return pgauditLogSize
     */
    public Double getPgauditLogSize() {
        return pgauditLogSize;
    }

    public void setPgauditLogSize(Double pgauditLogSize) {
        this.pgauditLogSize = pgauditLogSize;
    }

    public ShowLatestSpaceResponse withPgsqlTmpSize(Double pgsqlTmpSize) {
        this.pgsqlTmpSize = pgsqlTmpSize;
        return this;
    }

    /**
     * PostgreSQL临时空间
     * @return pgsqlTmpSize
     */
    public Double getPgsqlTmpSize() {
        return pgsqlTmpSize;
    }

    public void setPgsqlTmpSize(Double pgsqlTmpSize) {
        this.pgsqlTmpSize = pgsqlTmpSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLatestSpaceResponse that = (ShowLatestSpaceResponse) obj;
        return Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.buyStorageBytes, that.buyStorageBytes)
            && Objects.equals(this.usedStorageBytes, that.usedStorageBytes)
            && Objects.equals(this.lastStorageBytes, that.lastStorageBytes)
            && Objects.equals(this.buyStoragePercent, that.buyStoragePercent)
            && Objects.equals(this.dataUsageBytes, that.dataUsageBytes)
            && Objects.equals(this.dataUsagePercent, that.dataUsagePercent)
            && Objects.equals(this.binlogUsageBytes, that.binlogUsageBytes)
            && Objects.equals(this.binlogUsagePercent, that.binlogUsagePercent)
            && Objects.equals(this.relayLogUsageBytes, that.relayLogUsageBytes)
            && Objects.equals(this.relayLogUsagePercent, that.relayLogUsagePercent)
            && Objects.equals(this.auditLogUsageBytes, that.auditLogUsageBytes)
            && Objects.equals(this.auditLogUsagePercent, that.auditLogUsagePercent)
            && Objects.equals(this.slowLogUsageBytes, that.slowLogUsageBytes)
            && Objects.equals(this.slowLogUsagePercent, that.slowLogUsagePercent)
            && Objects.equals(this.tempUsageBytes, that.tempUsageBytes)
            && Objects.equals(this.tempUsagePercent, that.tempUsagePercent)
            && Objects.equals(this.undoLogUsageBytes, that.undoLogUsageBytes)
            && Objects.equals(this.undoLogUsagePercent, that.undoLogUsagePercent)
            && Objects.equals(this.otherUsageBytes, that.otherUsageBytes)
            && Objects.equals(this.otherUsagePercent, that.otherUsagePercent)
            && Objects.equals(this.tooManyFiles, that.tooManyFiles)
            && Objects.equals(this.pageUsageBytes, that.pageUsageBytes)
            && Objects.equals(this.totalSpace, that.totalSpace) && Objects.equals(this.totalUsage, that.totalUsage)
            && Objects.equals(this.availSize, that.availSize) && Objects.equals(this.data, that.data)
            && Objects.equals(this.log, that.log) && Objects.equals(this.runtime, that.runtime)
            && Objects.equals(this.slowLog, that.slowLog) && Objects.equals(this.auditLog, that.auditLog)
            && Objects.equals(this.tempdb, that.tempdb) && Objects.equals(this.msdb, that.msdb)
            && Objects.equals(this.usedSizeBytes, that.usedSizeBytes)
            && Objects.equals(this.totalSizeBytes, that.totalSizeBytes)
            && Objects.equals(this.avgDailyGrowthBytes, that.avgDailyGrowthBytes)
            && Objects.equals(this.estimatedAvailableDays, that.estimatedAvailableDays)
            && Objects.equals(this.dataSizeBytes, that.dataSizeBytes)
            && Objects.equals(this.oplogSizeBytes, that.oplogSizeBytes)
            && Objects.equals(this.otherSizeBytes, that.otherSizeBytes) && Objects.equals(this.walSize, that.walSize)
            && Objects.equals(this.dataSize, that.dataSize) && Objects.equals(this.pgauditLogSize, that.pgauditLogSize)
            && Objects.equals(this.pgsqlTmpSize, that.pgsqlTmpSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateTime,
            buyStorageBytes,
            usedStorageBytes,
            lastStorageBytes,
            buyStoragePercent,
            dataUsageBytes,
            dataUsagePercent,
            binlogUsageBytes,
            binlogUsagePercent,
            relayLogUsageBytes,
            relayLogUsagePercent,
            auditLogUsageBytes,
            auditLogUsagePercent,
            slowLogUsageBytes,
            slowLogUsagePercent,
            tempUsageBytes,
            tempUsagePercent,
            undoLogUsageBytes,
            undoLogUsagePercent,
            otherUsageBytes,
            otherUsagePercent,
            tooManyFiles,
            pageUsageBytes,
            totalSpace,
            totalUsage,
            availSize,
            data,
            log,
            runtime,
            slowLog,
            auditLog,
            tempdb,
            msdb,
            usedSizeBytes,
            totalSizeBytes,
            avgDailyGrowthBytes,
            estimatedAvailableDays,
            dataSizeBytes,
            oplogSizeBytes,
            otherSizeBytes,
            walSize,
            dataSize,
            pgauditLogSize,
            pgsqlTmpSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLatestSpaceResponse {\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    buyStorageBytes: ").append(toIndentedString(buyStorageBytes)).append("\n");
        sb.append("    usedStorageBytes: ").append(toIndentedString(usedStorageBytes)).append("\n");
        sb.append("    lastStorageBytes: ").append(toIndentedString(lastStorageBytes)).append("\n");
        sb.append("    buyStoragePercent: ").append(toIndentedString(buyStoragePercent)).append("\n");
        sb.append("    dataUsageBytes: ").append(toIndentedString(dataUsageBytes)).append("\n");
        sb.append("    dataUsagePercent: ").append(toIndentedString(dataUsagePercent)).append("\n");
        sb.append("    binlogUsageBytes: ").append(toIndentedString(binlogUsageBytes)).append("\n");
        sb.append("    binlogUsagePercent: ").append(toIndentedString(binlogUsagePercent)).append("\n");
        sb.append("    relayLogUsageBytes: ").append(toIndentedString(relayLogUsageBytes)).append("\n");
        sb.append("    relayLogUsagePercent: ").append(toIndentedString(relayLogUsagePercent)).append("\n");
        sb.append("    auditLogUsageBytes: ").append(toIndentedString(auditLogUsageBytes)).append("\n");
        sb.append("    auditLogUsagePercent: ").append(toIndentedString(auditLogUsagePercent)).append("\n");
        sb.append("    slowLogUsageBytes: ").append(toIndentedString(slowLogUsageBytes)).append("\n");
        sb.append("    slowLogUsagePercent: ").append(toIndentedString(slowLogUsagePercent)).append("\n");
        sb.append("    tempUsageBytes: ").append(toIndentedString(tempUsageBytes)).append("\n");
        sb.append("    tempUsagePercent: ").append(toIndentedString(tempUsagePercent)).append("\n");
        sb.append("    undoLogUsageBytes: ").append(toIndentedString(undoLogUsageBytes)).append("\n");
        sb.append("    undoLogUsagePercent: ").append(toIndentedString(undoLogUsagePercent)).append("\n");
        sb.append("    otherUsageBytes: ").append(toIndentedString(otherUsageBytes)).append("\n");
        sb.append("    otherUsagePercent: ").append(toIndentedString(otherUsagePercent)).append("\n");
        sb.append("    tooManyFiles: ").append(toIndentedString(tooManyFiles)).append("\n");
        sb.append("    pageUsageBytes: ").append(toIndentedString(pageUsageBytes)).append("\n");
        sb.append("    totalSpace: ").append(toIndentedString(totalSpace)).append("\n");
        sb.append("    totalUsage: ").append(toIndentedString(totalUsage)).append("\n");
        sb.append("    availSize: ").append(toIndentedString(availSize)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    log: ").append(toIndentedString(log)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    slowLog: ").append(toIndentedString(slowLog)).append("\n");
        sb.append("    auditLog: ").append(toIndentedString(auditLog)).append("\n");
        sb.append("    tempdb: ").append(toIndentedString(tempdb)).append("\n");
        sb.append("    msdb: ").append(toIndentedString(msdb)).append("\n");
        sb.append("    usedSizeBytes: ").append(toIndentedString(usedSizeBytes)).append("\n");
        sb.append("    totalSizeBytes: ").append(toIndentedString(totalSizeBytes)).append("\n");
        sb.append("    avgDailyGrowthBytes: ").append(toIndentedString(avgDailyGrowthBytes)).append("\n");
        sb.append("    estimatedAvailableDays: ").append(toIndentedString(estimatedAvailableDays)).append("\n");
        sb.append("    dataSizeBytes: ").append(toIndentedString(dataSizeBytes)).append("\n");
        sb.append("    oplogSizeBytes: ").append(toIndentedString(oplogSizeBytes)).append("\n");
        sb.append("    otherSizeBytes: ").append(toIndentedString(otherSizeBytes)).append("\n");
        sb.append("    walSize: ").append(toIndentedString(walSize)).append("\n");
        sb.append("    dataSize: ").append(toIndentedString(dataSize)).append("\n");
        sb.append("    pgauditLogSize: ").append(toIndentedString(pgauditLogSize)).append("\n");
        sb.append("    pgsqlTmpSize: ").append(toIndentedString(pgsqlTmpSize)).append("\n");
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
