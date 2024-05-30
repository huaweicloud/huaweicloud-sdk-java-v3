package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * TableModelStatisticVO
 */
public class TableModelStatisticVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private StatisticStandardCoverageVO total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "published")

    private StatisticStandardCoverageVO published;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_total")

    private SyncStatusStatisticVO syncTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "physical_table")

    private SyncStatusStatisticVO physicalTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "technical_asset")

    private SyncStatusStatisticVO technicalAsset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_asset")

    private SyncStatusStatisticVO businessAsset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data_link")

    private SyncStatusStatisticVO metaDataLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_quality")

    private SyncStatusStatisticVO dataQuality;

    public TableModelStatisticVO withTotal(StatisticStandardCoverageVO total) {
        this.total = total;
        return this;
    }

    public TableModelStatisticVO withTotal(Consumer<StatisticStandardCoverageVO> totalSetter) {
        if (this.total == null) {
            this.total = new StatisticStandardCoverageVO();
            totalSetter.accept(this.total);
        }

        return this;
    }

    /**
     * Get total
     * @return total
     */
    public StatisticStandardCoverageVO getTotal() {
        return total;
    }

    public void setTotal(StatisticStandardCoverageVO total) {
        this.total = total;
    }

    public TableModelStatisticVO withPublished(StatisticStandardCoverageVO published) {
        this.published = published;
        return this;
    }

    public TableModelStatisticVO withPublished(Consumer<StatisticStandardCoverageVO> publishedSetter) {
        if (this.published == null) {
            this.published = new StatisticStandardCoverageVO();
            publishedSetter.accept(this.published);
        }

        return this;
    }

    /**
     * Get published
     * @return published
     */
    public StatisticStandardCoverageVO getPublished() {
        return published;
    }

    public void setPublished(StatisticStandardCoverageVO published) {
        this.published = published;
    }

    public TableModelStatisticVO withSyncTotal(SyncStatusStatisticVO syncTotal) {
        this.syncTotal = syncTotal;
        return this;
    }

    public TableModelStatisticVO withSyncTotal(Consumer<SyncStatusStatisticVO> syncTotalSetter) {
        if (this.syncTotal == null) {
            this.syncTotal = new SyncStatusStatisticVO();
            syncTotalSetter.accept(this.syncTotal);
        }

        return this;
    }

    /**
     * Get syncTotal
     * @return syncTotal
     */
    public SyncStatusStatisticVO getSyncTotal() {
        return syncTotal;
    }

    public void setSyncTotal(SyncStatusStatisticVO syncTotal) {
        this.syncTotal = syncTotal;
    }

    public TableModelStatisticVO withPhysicalTable(SyncStatusStatisticVO physicalTable) {
        this.physicalTable = physicalTable;
        return this;
    }

    public TableModelStatisticVO withPhysicalTable(Consumer<SyncStatusStatisticVO> physicalTableSetter) {
        if (this.physicalTable == null) {
            this.physicalTable = new SyncStatusStatisticVO();
            physicalTableSetter.accept(this.physicalTable);
        }

        return this;
    }

    /**
     * Get physicalTable
     * @return physicalTable
     */
    public SyncStatusStatisticVO getPhysicalTable() {
        return physicalTable;
    }

    public void setPhysicalTable(SyncStatusStatisticVO physicalTable) {
        this.physicalTable = physicalTable;
    }

    public TableModelStatisticVO withTechnicalAsset(SyncStatusStatisticVO technicalAsset) {
        this.technicalAsset = technicalAsset;
        return this;
    }

    public TableModelStatisticVO withTechnicalAsset(Consumer<SyncStatusStatisticVO> technicalAssetSetter) {
        if (this.technicalAsset == null) {
            this.technicalAsset = new SyncStatusStatisticVO();
            technicalAssetSetter.accept(this.technicalAsset);
        }

        return this;
    }

    /**
     * Get technicalAsset
     * @return technicalAsset
     */
    public SyncStatusStatisticVO getTechnicalAsset() {
        return technicalAsset;
    }

    public void setTechnicalAsset(SyncStatusStatisticVO technicalAsset) {
        this.technicalAsset = technicalAsset;
    }

    public TableModelStatisticVO withBusinessAsset(SyncStatusStatisticVO businessAsset) {
        this.businessAsset = businessAsset;
        return this;
    }

    public TableModelStatisticVO withBusinessAsset(Consumer<SyncStatusStatisticVO> businessAssetSetter) {
        if (this.businessAsset == null) {
            this.businessAsset = new SyncStatusStatisticVO();
            businessAssetSetter.accept(this.businessAsset);
        }

        return this;
    }

    /**
     * Get businessAsset
     * @return businessAsset
     */
    public SyncStatusStatisticVO getBusinessAsset() {
        return businessAsset;
    }

    public void setBusinessAsset(SyncStatusStatisticVO businessAsset) {
        this.businessAsset = businessAsset;
    }

    public TableModelStatisticVO withMetaDataLink(SyncStatusStatisticVO metaDataLink) {
        this.metaDataLink = metaDataLink;
        return this;
    }

    public TableModelStatisticVO withMetaDataLink(Consumer<SyncStatusStatisticVO> metaDataLinkSetter) {
        if (this.metaDataLink == null) {
            this.metaDataLink = new SyncStatusStatisticVO();
            metaDataLinkSetter.accept(this.metaDataLink);
        }

        return this;
    }

    /**
     * Get metaDataLink
     * @return metaDataLink
     */
    public SyncStatusStatisticVO getMetaDataLink() {
        return metaDataLink;
    }

    public void setMetaDataLink(SyncStatusStatisticVO metaDataLink) {
        this.metaDataLink = metaDataLink;
    }

    public TableModelStatisticVO withDataQuality(SyncStatusStatisticVO dataQuality) {
        this.dataQuality = dataQuality;
        return this;
    }

    public TableModelStatisticVO withDataQuality(Consumer<SyncStatusStatisticVO> dataQualitySetter) {
        if (this.dataQuality == null) {
            this.dataQuality = new SyncStatusStatisticVO();
            dataQualitySetter.accept(this.dataQuality);
        }

        return this;
    }

    /**
     * Get dataQuality
     * @return dataQuality
     */
    public SyncStatusStatisticVO getDataQuality() {
        return dataQuality;
    }

    public void setDataQuality(SyncStatusStatisticVO dataQuality) {
        this.dataQuality = dataQuality;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableModelStatisticVO that = (TableModelStatisticVO) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.published, that.published)
            && Objects.equals(this.syncTotal, that.syncTotal) && Objects.equals(this.physicalTable, that.physicalTable)
            && Objects.equals(this.technicalAsset, that.technicalAsset)
            && Objects.equals(this.businessAsset, that.businessAsset)
            && Objects.equals(this.metaDataLink, that.metaDataLink)
            && Objects.equals(this.dataQuality, that.dataQuality);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(total, published, syncTotal, physicalTable, technicalAsset, businessAsset, metaDataLink, dataQuality);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableModelStatisticVO {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    published: ").append(toIndentedString(published)).append("\n");
        sb.append("    syncTotal: ").append(toIndentedString(syncTotal)).append("\n");
        sb.append("    physicalTable: ").append(toIndentedString(physicalTable)).append("\n");
        sb.append("    technicalAsset: ").append(toIndentedString(technicalAsset)).append("\n");
        sb.append("    businessAsset: ").append(toIndentedString(businessAsset)).append("\n");
        sb.append("    metaDataLink: ").append(toIndentedString(metaDataLink)).append("\n");
        sb.append("    dataQuality: ").append(toIndentedString(dataQuality)).append("\n");
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
