package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rate_limit")

    private Integer rateLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefetch_block")

    private Integer prefetchBlock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_split_size")

    private Integer fileSplitSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_standby_backup")

    private Boolean enableStandbyBackup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_compression")

    private Boolean closeCompression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_backup_media_type")

    private String defaultBackupMediaType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_backup_method")

    private String defaultBackupMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_parallel_degree")

    private Integer backupParallelDegree;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_node_info")

    private BackupNodeInfoResult backupNodeInfo;

    public ShowConfigurationResponse withRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

    /**
     * **参数解释**: 备份限速。 **取值范围**: 0-1024
     * minimum: 0
     * maximum: 1024
     * @return rateLimit
     */
    public Integer getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
    }

    public ShowConfigurationResponse withPrefetchBlock(Integer prefetchBlock) {
        this.prefetchBlock = prefetchBlock;
        return this;
    }

    /**
     * **参数解释**: 增备预取页面个数。 **取值范围**: 1-8192
     * minimum: 1
     * maximum: 8192
     * @return prefetchBlock
     */
    public Integer getPrefetchBlock() {
        return prefetchBlock;
    }

    public void setPrefetchBlock(Integer prefetchBlock) {
        this.prefetchBlock = prefetchBlock;
    }

    public ShowConfigurationResponse withFileSplitSize(Integer fileSplitSize) {
        this.fileSplitSize = fileSplitSize;
        return this;
    }

    /**
     * **参数解释**: 分片大小。 **取值范围**: 0-1024
     * minimum: 0
     * maximum: 1024
     * @return fileSplitSize
     */
    public Integer getFileSplitSize() {
        return fileSplitSize;
    }

    public void setFileSplitSize(Integer fileSplitSize) {
        this.fileSplitSize = fileSplitSize;
    }

    public ShowConfigurationResponse withEnableStandbyBackup(Boolean enableStandbyBackup) {
        this.enableStandbyBackup = enableStandbyBackup;
        return this;
    }

    /**
     * **参数解释**: 启用备机备份标识。 **取值范围**: 不涉及。
     * @return enableStandbyBackup
     */
    public Boolean getEnableStandbyBackup() {
        return enableStandbyBackup;
    }

    public void setEnableStandbyBackup(Boolean enableStandbyBackup) {
        this.enableStandbyBackup = enableStandbyBackup;
    }

    public ShowConfigurationResponse withCloseCompression(Boolean closeCompression) {
        this.closeCompression = closeCompression;
        return this;
    }

    /**
     * **参数解释**: 是否关闭压缩。 **取值范围**: true,false
     * @return closeCompression
     */
    public Boolean getCloseCompression() {
        return closeCompression;
    }

    public void setCloseCompression(Boolean closeCompression) {
        this.closeCompression = closeCompression;
    }

    public ShowConfigurationResponse withDefaultBackupMediaType(String defaultBackupMediaType) {
        this.defaultBackupMediaType = defaultBackupMediaType;
        return this;
    }

    /**
     * **参数解释**: 默认备份介质。 **取值范围**: - OBS 对象存储
     * @return defaultBackupMediaType
     */
    public String getDefaultBackupMediaType() {
        return defaultBackupMediaType;
    }

    public void setDefaultBackupMediaType(String defaultBackupMediaType) {
        this.defaultBackupMediaType = defaultBackupMediaType;
    }

    public ShowConfigurationResponse withDefaultBackupMethod(String defaultBackupMethod) {
        this.defaultBackupMethod = defaultBackupMethod;
        return this;
    }

    /**
     * **参数解释**: 默认备份方式。 **取值范围**: - EBACKUP 快照备份 - PHYSICAL_BACKUP 物理备份
     * @return defaultBackupMethod
     */
    public String getDefaultBackupMethod() {
        return defaultBackupMethod;
    }

    public void setDefaultBackupMethod(String defaultBackupMethod) {
        this.defaultBackupMethod = defaultBackupMethod;
    }

    public ShowConfigurationResponse withBackupParallelDegree(Integer backupParallelDegree) {
        this.backupParallelDegree = backupParallelDegree;
        return this;
    }

    /**
     * **参数解释**: 备份并行参数。 **取值范围**: 1, 2, 4, 8
     * @return backupParallelDegree
     */
    public Integer getBackupParallelDegree() {
        return backupParallelDegree;
    }

    public void setBackupParallelDegree(Integer backupParallelDegree) {
        this.backupParallelDegree = backupParallelDegree;
    }

    public ShowConfigurationResponse withBackupNodeInfo(BackupNodeInfoResult backupNodeInfo) {
        this.backupNodeInfo = backupNodeInfo;
        return this;
    }

    public ShowConfigurationResponse withBackupNodeInfo(Consumer<BackupNodeInfoResult> backupNodeInfoSetter) {
        if (this.backupNodeInfo == null) {
            this.backupNodeInfo = new BackupNodeInfoResult();
            backupNodeInfoSetter.accept(this.backupNodeInfo);
        }

        return this;
    }

    /**
     * Get backupNodeInfo
     * @return backupNodeInfo
     */
    public BackupNodeInfoResult getBackupNodeInfo() {
        return backupNodeInfo;
    }

    public void setBackupNodeInfo(BackupNodeInfoResult backupNodeInfo) {
        this.backupNodeInfo = backupNodeInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowConfigurationResponse that = (ShowConfigurationResponse) obj;
        return Objects.equals(this.rateLimit, that.rateLimit) && Objects.equals(this.prefetchBlock, that.prefetchBlock)
            && Objects.equals(this.fileSplitSize, that.fileSplitSize)
            && Objects.equals(this.enableStandbyBackup, that.enableStandbyBackup)
            && Objects.equals(this.closeCompression, that.closeCompression)
            && Objects.equals(this.defaultBackupMediaType, that.defaultBackupMediaType)
            && Objects.equals(this.defaultBackupMethod, that.defaultBackupMethod)
            && Objects.equals(this.backupParallelDegree, that.backupParallelDegree)
            && Objects.equals(this.backupNodeInfo, that.backupNodeInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rateLimit,
            prefetchBlock,
            fileSplitSize,
            enableStandbyBackup,
            closeCompression,
            defaultBackupMediaType,
            defaultBackupMethod,
            backupParallelDegree,
            backupNodeInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConfigurationResponse {\n");
        sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
        sb.append("    prefetchBlock: ").append(toIndentedString(prefetchBlock)).append("\n");
        sb.append("    fileSplitSize: ").append(toIndentedString(fileSplitSize)).append("\n");
        sb.append("    enableStandbyBackup: ").append(toIndentedString(enableStandbyBackup)).append("\n");
        sb.append("    closeCompression: ").append(toIndentedString(closeCompression)).append("\n");
        sb.append("    defaultBackupMediaType: ").append(toIndentedString(defaultBackupMediaType)).append("\n");
        sb.append("    defaultBackupMethod: ").append(toIndentedString(defaultBackupMethod)).append("\n");
        sb.append("    backupParallelDegree: ").append(toIndentedString(backupParallelDegree)).append("\n");
        sb.append("    backupNodeInfo: ").append(toIndentedString(backupNodeInfo)).append("\n");
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
