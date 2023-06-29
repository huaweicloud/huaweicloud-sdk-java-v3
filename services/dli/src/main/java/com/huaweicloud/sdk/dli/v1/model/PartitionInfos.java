package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class PartitionInfos {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_name")

    private String partitionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_access_time")

    private Long lastAccessTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locations")

    private List<String> locations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_ddl_time")

    private Long lastDdlTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_rows")

    private Long numRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_files")

    private Long numFiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_size")

    private Long totalSize;

    public PartitionInfos withPartitionName(String partitionName) {
        this.partitionName = partitionName;
        return this;
    }

    /**
     * 分区名
     * @return partitionName
     */
    public String getPartitionName() {
        return partitionName;
    }

    public void setPartitionName(String partitionName) {
        this.partitionName = partitionName;
    }

    public PartitionInfos withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public PartitionInfos withLastAccessTime(Long lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }

    /**
     * 最后改动时间
     * @return lastAccessTime
     */
    public Long getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(Long lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    public PartitionInfos withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    public PartitionInfos addLocationsItem(String locationsItem) {
        if (this.locations == null) {
            this.locations = new ArrayList<>();
        }
        this.locations.add(locationsItem);
        return this;
    }

    public PartitionInfos withLocations(Consumer<List<String>> locationsSetter) {
        if (this.locations == null) {
            this.locations = new ArrayList<>();
        }
        locationsSetter.accept(this.locations);
        return this;
    }

    /**
     * 路径，外表显示，内表不显示
     * @return locations
     */
    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    public PartitionInfos withLastDdlTime(Long lastDdlTime) {
        this.lastDdlTime = lastDdlTime;
        return this;
    }

    /**
     * 最后一个ddl语句执行时间，时间戳单位：秒
     * @return lastDdlTime
     */
    public Long getLastDdlTime() {
        return lastDdlTime;
    }

    public void setLastDdlTime(Long lastDdlTime) {
        this.lastDdlTime = lastDdlTime;
    }

    public PartitionInfos withNumRows(Long numRows) {
        this.numRows = numRows;
        return this;
    }

    /**
     * 该分区数据总行数
     * @return numRows
     */
    public Long getNumRows() {
        return numRows;
    }

    public void setNumRows(Long numRows) {
        this.numRows = numRows;
    }

    public PartitionInfos withNumFiles(Long numFiles) {
        this.numFiles = numFiles;
        return this;
    }

    /**
     * 分区文件数
     * @return numFiles
     */
    public Long getNumFiles() {
        return numFiles;
    }

    public void setNumFiles(Long numFiles) {
        this.numFiles = numFiles;
    }

    public PartitionInfos withTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * 该分区总的数据大小（单位：字节）
     * @return totalSize
     */
    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PartitionInfos that = (PartitionInfos) obj;
        return Objects.equals(this.partitionName, that.partitionName)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastAccessTime, that.lastAccessTime)
            && Objects.equals(this.locations, that.locations) && Objects.equals(this.lastDdlTime, that.lastDdlTime)
            && Objects.equals(this.numRows, that.numRows) && Objects.equals(this.numFiles, that.numFiles)
            && Objects.equals(this.totalSize, that.totalSize);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(partitionName, createTime, lastAccessTime, locations, lastDdlTime, numRows, numFiles, totalSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartitionInfos {\n");
        sb.append("    partitionName: ").append(toIndentedString(partitionName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastAccessTime: ").append(toIndentedString(lastAccessTime)).append("\n");
        sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
        sb.append("    lastDdlTime: ").append(toIndentedString(lastDdlTime)).append("\n");
        sb.append("    numRows: ").append(toIndentedString(numRows)).append("\n");
        sb.append("    numFiles: ").append(toIndentedString(numFiles)).append("\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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
