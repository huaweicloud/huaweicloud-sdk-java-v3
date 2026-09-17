package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IndexUsageDetail
 */
public class IndexUsageDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_name")

    private String indexName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ix_type_desc")

    private String ixTypeDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fragmentation_percentage")

    private Double fragmentationPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_size_mb")

    private Double indexSizeMb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintenance_operation")

    private String maintenanceOperation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_count")

    private Long pageCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ix_seek_count")

    private Long ixSeekCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ix_scan_count")

    private Long ixScanCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ix_key_lookup_count")

    private Long ixKeyLookupCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ix_update_count")

    private Long ixUpdateCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seek_percentage")

    private Double seekPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_percentage")

    private Double scanPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_lookup_percentage")

    private Double keyLookupPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_percentage")

    private Double updatePercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_primary_key")

    private Boolean isPrimaryKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_disabled")

    private Boolean isDisabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_list")

    private String columnList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fill_factor")

    private String fillFactor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_date")

    private Long createDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stats_last_updated")

    private Long statsLastUpdated;

    public IndexUsageDetail withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名称
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public IndexUsageDetail withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * 索引名称
     * @return indexName
     */
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public IndexUsageDetail withIxTypeDesc(String ixTypeDesc) {
        this.ixTypeDesc = ixTypeDesc;
        return this;
    }

    /**
     * 索引类型描述
     * @return ixTypeDesc
     */
    public String getIxTypeDesc() {
        return ixTypeDesc;
    }

    public void setIxTypeDesc(String ixTypeDesc) {
        this.ixTypeDesc = ixTypeDesc;
    }

    public IndexUsageDetail withFragmentationPercentage(Double fragmentationPercentage) {
        this.fragmentationPercentage = fragmentationPercentage;
        return this;
    }

    /**
     * 碎片率
     * @return fragmentationPercentage
     */
    public Double getFragmentationPercentage() {
        return fragmentationPercentage;
    }

    public void setFragmentationPercentage(Double fragmentationPercentage) {
        this.fragmentationPercentage = fragmentationPercentage;
    }

    public IndexUsageDetail withIndexSizeMb(Double indexSizeMb) {
        this.indexSizeMb = indexSizeMb;
        return this;
    }

    /**
     * 索引占用的空间大小(MB)
     * @return indexSizeMb
     */
    public Double getIndexSizeMb() {
        return indexSizeMb;
    }

    public void setIndexSizeMb(Double indexSizeMb) {
        this.indexSizeMb = indexSizeMb;
    }

    public IndexUsageDetail withMaintenanceOperation(String maintenanceOperation) {
        this.maintenanceOperation = maintenanceOperation;
        return this;
    }

    /**
     * 维护操作
     * @return maintenanceOperation
     */
    public String getMaintenanceOperation() {
        return maintenanceOperation;
    }

    public void setMaintenanceOperation(String maintenanceOperation) {
        this.maintenanceOperation = maintenanceOperation;
    }

    public IndexUsageDetail withPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    /**
     * 索引占用的空间页数
     * @return pageCount
     */
    public Long getPageCount() {
        return pageCount;
    }

    public void setPageCount(Long pageCount) {
        this.pageCount = pageCount;
    }

    public IndexUsageDetail withIxSeekCount(Long ixSeekCount) {
        this.ixSeekCount = ixSeekCount;
        return this;
    }

    /**
     * 通过用户查询执行的搜索次数
     * @return ixSeekCount
     */
    public Long getIxSeekCount() {
        return ixSeekCount;
    }

    public void setIxSeekCount(Long ixSeekCount) {
        this.ixSeekCount = ixSeekCount;
    }

    public IndexUsageDetail withIxScanCount(Long ixScanCount) {
        this.ixScanCount = ixScanCount;
        return this;
    }

    /**
     * 未使用索引的用户查询的扫描数
     * @return ixScanCount
     */
    public Long getIxScanCount() {
        return ixScanCount;
    }

    public void setIxScanCount(Long ixScanCount) {
        this.ixScanCount = ixScanCount;
    }

    public IndexUsageDetail withIxKeyLookupCount(Long ixKeyLookupCount) {
        this.ixKeyLookupCount = ixKeyLookupCount;
        return this;
    }

    /**
     * 由用户查询执行的书签查找次数
     * @return ixKeyLookupCount
     */
    public Long getIxKeyLookupCount() {
        return ixKeyLookupCount;
    }

    public void setIxKeyLookupCount(Long ixKeyLookupCount) {
        this.ixKeyLookupCount = ixKeyLookupCount;
    }

    public IndexUsageDetail withIxUpdateCount(Long ixUpdateCount) {
        this.ixUpdateCount = ixUpdateCount;
        return this;
    }

    /**
     * 通过用户查询执行的更新次数
     * @return ixUpdateCount
     */
    public Long getIxUpdateCount() {
        return ixUpdateCount;
    }

    public void setIxUpdateCount(Long ixUpdateCount) {
        this.ixUpdateCount = ixUpdateCount;
    }

    public IndexUsageDetail withSeekPercentage(Double seekPercentage) {
        this.seekPercentage = seekPercentage;
        return this;
    }

    /**
     * 查找百分比
     * @return seekPercentage
     */
    public Double getSeekPercentage() {
        return seekPercentage;
    }

    public void setSeekPercentage(Double seekPercentage) {
        this.seekPercentage = seekPercentage;
    }

    public IndexUsageDetail withScanPercentage(Double scanPercentage) {
        this.scanPercentage = scanPercentage;
        return this;
    }

    /**
     * 扫描百分比
     * @return scanPercentage
     */
    public Double getScanPercentage() {
        return scanPercentage;
    }

    public void setScanPercentage(Double scanPercentage) {
        this.scanPercentage = scanPercentage;
    }

    public IndexUsageDetail withKeyLookupPercentage(Double keyLookupPercentage) {
        this.keyLookupPercentage = keyLookupPercentage;
        return this;
    }

    /**
     * 书签查找百分比
     * @return keyLookupPercentage
     */
    public Double getKeyLookupPercentage() {
        return keyLookupPercentage;
    }

    public void setKeyLookupPercentage(Double keyLookupPercentage) {
        this.keyLookupPercentage = keyLookupPercentage;
    }

    public IndexUsageDetail withUpdatePercentage(Double updatePercentage) {
        this.updatePercentage = updatePercentage;
        return this;
    }

    /**
     * 更新百分比
     * @return updatePercentage
     */
    public Double getUpdatePercentage() {
        return updatePercentage;
    }

    public void setUpdatePercentage(Double updatePercentage) {
        this.updatePercentage = updatePercentage;
    }

    public IndexUsageDetail withIsPrimaryKey(Boolean isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
        return this;
    }

    /**
     * 索引是否是主键
     * @return isPrimaryKey
     */
    public Boolean getIsPrimaryKey() {
        return isPrimaryKey;
    }

    public void setIsPrimaryKey(Boolean isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
    }

    public IndexUsageDetail withIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
        return this;
    }

    /**
     * 索引是否被禁用
     * @return isDisabled
     */
    public Boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public IndexUsageDetail withColumnList(String columnList) {
        this.columnList = columnList;
        return this;
    }

    /**
     * 列
     * @return columnList
     */
    public String getColumnList() {
        return columnList;
    }

    public void setColumnList(String columnList) {
        this.columnList = columnList;
    }

    public IndexUsageDetail withFillFactor(String fillFactor) {
        this.fillFactor = fillFactor;
        return this;
    }

    /**
     * 填充因子
     * @return fillFactor
     */
    public String getFillFactor() {
        return fillFactor;
    }

    public void setFillFactor(String fillFactor) {
        this.fillFactor = fillFactor;
    }

    public IndexUsageDetail withCreateDate(Long createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * 创建时间
     * @return createDate
     */
    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public IndexUsageDetail withStatsLastUpdated(Long statsLastUpdated) {
        this.statsLastUpdated = statsLastUpdated;
        return this;
    }

    /**
     * 统计信息更新时间
     * @return statsLastUpdated
     */
    public Long getStatsLastUpdated() {
        return statsLastUpdated;
    }

    public void setStatsLastUpdated(Long statsLastUpdated) {
        this.statsLastUpdated = statsLastUpdated;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IndexUsageDetail that = (IndexUsageDetail) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.indexName, that.indexName)
            && Objects.equals(this.ixTypeDesc, that.ixTypeDesc)
            && Objects.equals(this.fragmentationPercentage, that.fragmentationPercentage)
            && Objects.equals(this.indexSizeMb, that.indexSizeMb)
            && Objects.equals(this.maintenanceOperation, that.maintenanceOperation)
            && Objects.equals(this.pageCount, that.pageCount) && Objects.equals(this.ixSeekCount, that.ixSeekCount)
            && Objects.equals(this.ixScanCount, that.ixScanCount)
            && Objects.equals(this.ixKeyLookupCount, that.ixKeyLookupCount)
            && Objects.equals(this.ixUpdateCount, that.ixUpdateCount)
            && Objects.equals(this.seekPercentage, that.seekPercentage)
            && Objects.equals(this.scanPercentage, that.scanPercentage)
            && Objects.equals(this.keyLookupPercentage, that.keyLookupPercentage)
            && Objects.equals(this.updatePercentage, that.updatePercentage)
            && Objects.equals(this.isPrimaryKey, that.isPrimaryKey) && Objects.equals(this.isDisabled, that.isDisabled)
            && Objects.equals(this.columnList, that.columnList) && Objects.equals(this.fillFactor, that.fillFactor)
            && Objects.equals(this.createDate, that.createDate)
            && Objects.equals(this.statsLastUpdated, that.statsLastUpdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName,
            indexName,
            ixTypeDesc,
            fragmentationPercentage,
            indexSizeMb,
            maintenanceOperation,
            pageCount,
            ixSeekCount,
            ixScanCount,
            ixKeyLookupCount,
            ixUpdateCount,
            seekPercentage,
            scanPercentage,
            keyLookupPercentage,
            updatePercentage,
            isPrimaryKey,
            isDisabled,
            columnList,
            fillFactor,
            createDate,
            statsLastUpdated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndexUsageDetail {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
        sb.append("    ixTypeDesc: ").append(toIndentedString(ixTypeDesc)).append("\n");
        sb.append("    fragmentationPercentage: ").append(toIndentedString(fragmentationPercentage)).append("\n");
        sb.append("    indexSizeMb: ").append(toIndentedString(indexSizeMb)).append("\n");
        sb.append("    maintenanceOperation: ").append(toIndentedString(maintenanceOperation)).append("\n");
        sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
        sb.append("    ixSeekCount: ").append(toIndentedString(ixSeekCount)).append("\n");
        sb.append("    ixScanCount: ").append(toIndentedString(ixScanCount)).append("\n");
        sb.append("    ixKeyLookupCount: ").append(toIndentedString(ixKeyLookupCount)).append("\n");
        sb.append("    ixUpdateCount: ").append(toIndentedString(ixUpdateCount)).append("\n");
        sb.append("    seekPercentage: ").append(toIndentedString(seekPercentage)).append("\n");
        sb.append("    scanPercentage: ").append(toIndentedString(scanPercentage)).append("\n");
        sb.append("    keyLookupPercentage: ").append(toIndentedString(keyLookupPercentage)).append("\n");
        sb.append("    updatePercentage: ").append(toIndentedString(updatePercentage)).append("\n");
        sb.append("    isPrimaryKey: ").append(toIndentedString(isPrimaryKey)).append("\n");
        sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
        sb.append("    columnList: ").append(toIndentedString(columnList)).append("\n");
        sb.append("    fillFactor: ").append(toIndentedString(fillFactor)).append("\n");
        sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
        sb.append("    statsLastUpdated: ").append(toIndentedString(statsLastUpdated)).append("\n");
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
