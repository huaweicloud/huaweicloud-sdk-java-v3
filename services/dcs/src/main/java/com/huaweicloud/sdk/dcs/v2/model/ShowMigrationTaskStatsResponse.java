package com.huaweicloud.sdk.dcs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowMigrationTaskStatsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="full_migration_progress")
    
    private String fullMigrationProgress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private String offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_dbsize")
    
    private String sourceDbsize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_dbsize")
    
    private String targetDbsize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_input_kbps")
    
    private String targetInputKbps;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_ops")
    
    private String targetOps;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_migrating")
    
    private Boolean isMigrating;

    public ShowMigrationTaskStatsResponse withFullMigrationProgress(String fullMigrationProgress) {
        this.fullMigrationProgress = fullMigrationProgress;
        return this;
    }

    


    /**
     * 全量迁移进度百分比。
     * @return fullMigrationProgress
     */
    public String getFullMigrationProgress() {
        return fullMigrationProgress;
    }

    public void setFullMigrationProgress(String fullMigrationProgress) {
        this.fullMigrationProgress = fullMigrationProgress;
    }

    public ShowMigrationTaskStatsResponse withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 增量迁移偏移量。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ShowMigrationTaskStatsResponse withSourceDbsize(String sourceDbsize) {
        this.sourceDbsize = sourceDbsize;
        return this;
    }

    


    /**
     * 源redis键数量
     * @return sourceDbsize
     */
    public String getSourceDbsize() {
        return sourceDbsize;
    }

    public void setSourceDbsize(String sourceDbsize) {
        this.sourceDbsize = sourceDbsize;
    }

    public ShowMigrationTaskStatsResponse withTargetDbsize(String targetDbsize) {
        this.targetDbsize = targetDbsize;
        return this;
    }

    


    /**
     * 目标redis键数量
     * @return targetDbsize
     */
    public String getTargetDbsize() {
        return targetDbsize;
    }

    public void setTargetDbsize(String targetDbsize) {
        this.targetDbsize = targetDbsize;
    }

    public ShowMigrationTaskStatsResponse withTargetInputKbps(String targetInputKbps) {
        this.targetInputKbps = targetInputKbps;
        return this;
    }

    


    /**
     * 目标redis键写入流量，单位KB/s
     * @return targetInputKbps
     */
    public String getTargetInputKbps() {
        return targetInputKbps;
    }

    public void setTargetInputKbps(String targetInputKbps) {
        this.targetInputKbps = targetInputKbps;
    }

    public ShowMigrationTaskStatsResponse withTargetOps(String targetOps) {
        this.targetOps = targetOps;
        return this;
    }

    


    /**
     * 目标redis每秒并发操作数
     * @return targetOps
     */
    public String getTargetOps() {
        return targetOps;
    }

    public void setTargetOps(String targetOps) {
        this.targetOps = targetOps;
    }

    public ShowMigrationTaskStatsResponse withIsMigrating(Boolean isMigrating) {
        this.isMigrating = isMigrating;
        return this;
    }

    


    /**
     * 迁移任务是否在进行
     * @return isMigrating
     */
    public Boolean getIsMigrating() {
        return isMigrating;
    }

    public void setIsMigrating(Boolean isMigrating) {
        this.isMigrating = isMigrating;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMigrationTaskStatsResponse showMigrationTaskStatsResponse = (ShowMigrationTaskStatsResponse) o;
        return Objects.equals(this.fullMigrationProgress, showMigrationTaskStatsResponse.fullMigrationProgress) &&
            Objects.equals(this.offset, showMigrationTaskStatsResponse.offset) &&
            Objects.equals(this.sourceDbsize, showMigrationTaskStatsResponse.sourceDbsize) &&
            Objects.equals(this.targetDbsize, showMigrationTaskStatsResponse.targetDbsize) &&
            Objects.equals(this.targetInputKbps, showMigrationTaskStatsResponse.targetInputKbps) &&
            Objects.equals(this.targetOps, showMigrationTaskStatsResponse.targetOps) &&
            Objects.equals(this.isMigrating, showMigrationTaskStatsResponse.isMigrating);
    }
    @Override
    public int hashCode() {
        return Objects.hash(fullMigrationProgress, offset, sourceDbsize, targetDbsize, targetInputKbps, targetOps, isMigrating);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMigrationTaskStatsResponse {\n");
        sb.append("    fullMigrationProgress: ").append(toIndentedString(fullMigrationProgress)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    sourceDbsize: ").append(toIndentedString(sourceDbsize)).append("\n");
        sb.append("    targetDbsize: ").append(toIndentedString(targetDbsize)).append("\n");
        sb.append("    targetInputKbps: ").append(toIndentedString(targetInputKbps)).append("\n");
        sb.append("    targetOps: ").append(toIndentedString(targetOps)).append("\n");
        sb.append("    isMigrating: ").append(toIndentedString(isMigrating)).append("\n");
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

