package com.huaweicloud.sdk.mrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点限制
 */
public class NodeConstraint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other")

    private Map<String, Object> other = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_node_num")

    private Integer minNodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_node_num")

    private Integer maxNodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_core_num")

    private Map<String, Integer> minCoreNum = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_mem_size")

    private Map<String, Integer> minMemSize = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_disk_size")

    private Integer minDiskSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_node_group_num")

    private Integer maxNodeGroupNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_data_volume_total_size")

    private Map<String, Integer> minDataVolumeTotalSize = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_type_constraint")

    private Map<String, String> diskTypeConstraint = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_root_disk_size")

    private Integer minRootDiskSize;

    public NodeConstraint withOther(Map<String, Object> other) {
        this.other = other;
        return this;
    }

    public NodeConstraint putOtherItem(String key, Object otherItem) {
        if (this.other == null) {
            this.other = new HashMap<>();
        }
        this.other.put(key, otherItem);
        return this;
    }

    public NodeConstraint withOther(Consumer<Map<String, Object>> otherSetter) {
        if (this.other == null) {
            this.other = new HashMap<>();
        }
        otherSetter.accept(this.other);
        return this;
    }

    /**
     * 其他限制
     * @return other
     */
    public Map<String, Object> getOther() {
        return other;
    }

    public void setOther(Map<String, Object> other) {
        this.other = other;
    }

    public NodeConstraint withMinNodeNum(Integer minNodeNum) {
        this.minNodeNum = minNodeNum;
        return this;
    }

    /**
     * 最少节点数
     * @return minNodeNum
     */
    public Integer getMinNodeNum() {
        return minNodeNum;
    }

    public void setMinNodeNum(Integer minNodeNum) {
        this.minNodeNum = minNodeNum;
    }

    public NodeConstraint withMaxNodeNum(Integer maxNodeNum) {
        this.maxNodeNum = maxNodeNum;
        return this;
    }

    /**
     * 最多节点数
     * @return maxNodeNum
     */
    public Integer getMaxNodeNum() {
        return maxNodeNum;
    }

    public void setMaxNodeNum(Integer maxNodeNum) {
        this.maxNodeNum = maxNodeNum;
    }

    public NodeConstraint withMinCoreNum(Map<String, Integer> minCoreNum) {
        this.minCoreNum = minCoreNum;
        return this;
    }

    public NodeConstraint putMinCoreNumItem(String key, Integer minCoreNumItem) {
        if (this.minCoreNum == null) {
            this.minCoreNum = new HashMap<>();
        }
        this.minCoreNum.put(key, minCoreNumItem);
        return this;
    }

    public NodeConstraint withMinCoreNum(Consumer<Map<String, Integer>> minCoreNumSetter) {
        if (this.minCoreNum == null) {
            this.minCoreNum = new HashMap<>();
        }
        minCoreNumSetter.accept(this.minCoreNum);
        return this;
    }

    /**
     * 最少核心数
     * @return minCoreNum
     */
    public Map<String, Integer> getMinCoreNum() {
        return minCoreNum;
    }

    public void setMinCoreNum(Map<String, Integer> minCoreNum) {
        this.minCoreNum = minCoreNum;
    }

    public NodeConstraint withMinMemSize(Map<String, Integer> minMemSize) {
        this.minMemSize = minMemSize;
        return this;
    }

    public NodeConstraint putMinMemSizeItem(String key, Integer minMemSizeItem) {
        if (this.minMemSize == null) {
            this.minMemSize = new HashMap<>();
        }
        this.minMemSize.put(key, minMemSizeItem);
        return this;
    }

    public NodeConstraint withMinMemSize(Consumer<Map<String, Integer>> minMemSizeSetter) {
        if (this.minMemSize == null) {
            this.minMemSize = new HashMap<>();
        }
        minMemSizeSetter.accept(this.minMemSize);
        return this;
    }

    /**
     * 最小内存容量
     * @return minMemSize
     */
    public Map<String, Integer> getMinMemSize() {
        return minMemSize;
    }

    public void setMinMemSize(Map<String, Integer> minMemSize) {
        this.minMemSize = minMemSize;
    }

    public NodeConstraint withMinDiskSize(Integer minDiskSize) {
        this.minDiskSize = minDiskSize;
        return this;
    }

    /**
     * 最小磁盘容量
     * @return minDiskSize
     */
    public Integer getMinDiskSize() {
        return minDiskSize;
    }

    public void setMinDiskSize(Integer minDiskSize) {
        this.minDiskSize = minDiskSize;
    }

    public NodeConstraint withMaxNodeGroupNum(Integer maxNodeGroupNum) {
        this.maxNodeGroupNum = maxNodeGroupNum;
        return this;
    }

    /**
     * 最大节点组数
     * @return maxNodeGroupNum
     */
    public Integer getMaxNodeGroupNum() {
        return maxNodeGroupNum;
    }

    public void setMaxNodeGroupNum(Integer maxNodeGroupNum) {
        this.maxNodeGroupNum = maxNodeGroupNum;
    }

    public NodeConstraint withMinDataVolumeTotalSize(Map<String, Integer> minDataVolumeTotalSize) {
        this.minDataVolumeTotalSize = minDataVolumeTotalSize;
        return this;
    }

    public NodeConstraint putMinDataVolumeTotalSizeItem(String key, Integer minDataVolumeTotalSizeItem) {
        if (this.minDataVolumeTotalSize == null) {
            this.minDataVolumeTotalSize = new HashMap<>();
        }
        this.minDataVolumeTotalSize.put(key, minDataVolumeTotalSizeItem);
        return this;
    }

    public NodeConstraint withMinDataVolumeTotalSize(Consumer<Map<String, Integer>> minDataVolumeTotalSizeSetter) {
        if (this.minDataVolumeTotalSize == null) {
            this.minDataVolumeTotalSize = new HashMap<>();
        }
        minDataVolumeTotalSizeSetter.accept(this.minDataVolumeTotalSize);
        return this;
    }

    /**
     * 最小数据卷容量
     * @return minDataVolumeTotalSize
     */
    public Map<String, Integer> getMinDataVolumeTotalSize() {
        return minDataVolumeTotalSize;
    }

    public void setMinDataVolumeTotalSize(Map<String, Integer> minDataVolumeTotalSize) {
        this.minDataVolumeTotalSize = minDataVolumeTotalSize;
    }

    public NodeConstraint withDiskTypeConstraint(Map<String, String> diskTypeConstraint) {
        this.diskTypeConstraint = diskTypeConstraint;
        return this;
    }

    public NodeConstraint putDiskTypeConstraintItem(String key, String diskTypeConstraintItem) {
        if (this.diskTypeConstraint == null) {
            this.diskTypeConstraint = new HashMap<>();
        }
        this.diskTypeConstraint.put(key, diskTypeConstraintItem);
        return this;
    }

    public NodeConstraint withDiskTypeConstraint(Consumer<Map<String, String>> diskTypeConstraintSetter) {
        if (this.diskTypeConstraint == null) {
            this.diskTypeConstraint = new HashMap<>();
        }
        diskTypeConstraintSetter.accept(this.diskTypeConstraint);
        return this;
    }

    /**
     * 磁盘类型限制，包含当前节点组所支持的磁盘类型
     * @return diskTypeConstraint
     */
    public Map<String, String> getDiskTypeConstraint() {
        return diskTypeConstraint;
    }

    public void setDiskTypeConstraint(Map<String, String> diskTypeConstraint) {
        this.diskTypeConstraint = diskTypeConstraint;
    }

    public NodeConstraint withMinRootDiskSize(Integer minRootDiskSize) {
        this.minRootDiskSize = minRootDiskSize;
        return this;
    }

    /**
     * 最小系统磁盘大小
     * @return minRootDiskSize
     */
    public Integer getMinRootDiskSize() {
        return minRootDiskSize;
    }

    public void setMinRootDiskSize(Integer minRootDiskSize) {
        this.minRootDiskSize = minRootDiskSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeConstraint that = (NodeConstraint) obj;
        return Objects.equals(this.other, that.other) && Objects.equals(this.minNodeNum, that.minNodeNum)
            && Objects.equals(this.maxNodeNum, that.maxNodeNum) && Objects.equals(this.minCoreNum, that.minCoreNum)
            && Objects.equals(this.minMemSize, that.minMemSize) && Objects.equals(this.minDiskSize, that.minDiskSize)
            && Objects.equals(this.maxNodeGroupNum, that.maxNodeGroupNum)
            && Objects.equals(this.minDataVolumeTotalSize, that.minDataVolumeTotalSize)
            && Objects.equals(this.diskTypeConstraint, that.diskTypeConstraint)
            && Objects.equals(this.minRootDiskSize, that.minRootDiskSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(other,
            minNodeNum,
            maxNodeNum,
            minCoreNum,
            minMemSize,
            minDiskSize,
            maxNodeGroupNum,
            minDataVolumeTotalSize,
            diskTypeConstraint,
            minRootDiskSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeConstraint {\n");
        sb.append("    other: ").append(toIndentedString(other)).append("\n");
        sb.append("    minNodeNum: ").append(toIndentedString(minNodeNum)).append("\n");
        sb.append("    maxNodeNum: ").append(toIndentedString(maxNodeNum)).append("\n");
        sb.append("    minCoreNum: ").append(toIndentedString(minCoreNum)).append("\n");
        sb.append("    minMemSize: ").append(toIndentedString(minMemSize)).append("\n");
        sb.append("    minDiskSize: ").append(toIndentedString(minDiskSize)).append("\n");
        sb.append("    maxNodeGroupNum: ").append(toIndentedString(maxNodeGroupNum)).append("\n");
        sb.append("    minDataVolumeTotalSize: ").append(toIndentedString(minDataVolumeTotalSize)).append("\n");
        sb.append("    diskTypeConstraint: ").append(toIndentedString(diskTypeConstraint)).append("\n");
        sb.append("    minRootDiskSize: ").append(toIndentedString(minRootDiskSize)).append("\n");
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
