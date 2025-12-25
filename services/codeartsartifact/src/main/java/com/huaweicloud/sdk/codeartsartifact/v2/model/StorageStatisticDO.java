package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StorageStatisticDO
 */
public class StorageStatisticDO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filesCount")

    private Long filesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usedSpaceLength")

    private Long usedSpaceLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usedSpace")

    private String usedSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summaryDate")

    private String summaryDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "foldersCount")

    private Long foldersCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "itemsCount")

    private Long itemsCount;

    public StorageStatisticDO withFilesCount(Long filesCount) {
        this.filesCount = filesCount;
        return this;
    }

    /**
     * 参数解释: 文件总数。 取值范围: 不涉及。
     * @return filesCount
     */
    public Long getFilesCount() {
        return filesCount;
    }

    public void setFilesCount(Long filesCount) {
        this.filesCount = filesCount;
    }

    public StorageStatisticDO withUsedSpaceLength(Long usedSpaceLength) {
        this.usedSpaceLength = usedSpaceLength;
        return this;
    }

    /**
     * 参数解释: 占用空间(字节)。 取值范围: 不涉及。
     * @return usedSpaceLength
     */
    public Long getUsedSpaceLength() {
        return usedSpaceLength;
    }

    public void setUsedSpaceLength(Long usedSpaceLength) {
        this.usedSpaceLength = usedSpaceLength;
    }

    public StorageStatisticDO withUsedSpace(String usedSpace) {
        this.usedSpace = usedSpace;
        return this;
    }

    /**
     * 参数解释: 占用空间。 取值范围: 不涉及。
     * @return usedSpace
     */
    public String getUsedSpace() {
        return usedSpace;
    }

    public void setUsedSpace(String usedSpace) {
        this.usedSpace = usedSpace;
    }

    public StorageStatisticDO withSummaryDate(String summaryDate) {
        this.summaryDate = summaryDate;
        return this;
    }

    /**
     * 参数解释: 统计日期。 取值范围: 不涉及。
     * @return summaryDate
     */
    public String getSummaryDate() {
        return summaryDate;
    }

    public void setSummaryDate(String summaryDate) {
        this.summaryDate = summaryDate;
    }

    public StorageStatisticDO withFoldersCount(Long foldersCount) {
        this.foldersCount = foldersCount;
        return this;
    }

    /**
     * 参数解释: 文件夹总数。 取值范围: 不涉及。
     * @return foldersCount
     */
    public Long getFoldersCount() {
        return foldersCount;
    }

    public void setFoldersCount(Long foldersCount) {
        this.foldersCount = foldersCount;
    }

    public StorageStatisticDO withItemsCount(Long itemsCount) {
        this.itemsCount = itemsCount;
        return this;
    }

    /**
     * 参数解释: 文件及文件夹总数。 取值范围: 不涉及。
     * @return itemsCount
     */
    public Long getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(Long itemsCount) {
        this.itemsCount = itemsCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StorageStatisticDO that = (StorageStatisticDO) obj;
        return Objects.equals(this.filesCount, that.filesCount)
            && Objects.equals(this.usedSpaceLength, that.usedSpaceLength)
            && Objects.equals(this.usedSpace, that.usedSpace) && Objects.equals(this.summaryDate, that.summaryDate)
            && Objects.equals(this.foldersCount, that.foldersCount) && Objects.equals(this.itemsCount, that.itemsCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filesCount, usedSpaceLength, usedSpace, summaryDate, foldersCount, itemsCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageStatisticDO {\n");
        sb.append("    filesCount: ").append(toIndentedString(filesCount)).append("\n");
        sb.append("    usedSpaceLength: ").append(toIndentedString(usedSpaceLength)).append("\n");
        sb.append("    usedSpace: ").append(toIndentedString(usedSpace)).append("\n");
        sb.append("    summaryDate: ").append(toIndentedString(summaryDate)).append("\n");
        sb.append("    foldersCount: ").append(toIndentedString(foldersCount)).append("\n");
        sb.append("    itemsCount: ").append(toIndentedString(itemsCount)).append("\n");
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
