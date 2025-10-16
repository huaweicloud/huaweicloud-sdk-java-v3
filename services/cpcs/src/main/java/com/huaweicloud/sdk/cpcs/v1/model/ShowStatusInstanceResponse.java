package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowStatusInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_utils")

    private List<ShowStatusInstanceItem> cpuUtils = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_utils")

    private List<ShowStatusInstanceItem> memUtils = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_utils")

    private List<ShowStatusInstanceItem> diskUtils = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_util_instance_names")

    private List<String> cpuUtilInstanceNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_util_instance_names")

    private List<String> memUtilInstanceNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_util_instance_names")

    private List<String> diskUtilInstanceNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_util_averages")

    private List<Double> cpuUtilAverages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_util_averages")

    private List<Double> memUtilAverages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_util_averages")

    private List<Double> diskUtilAverages = null;

    public ShowStatusInstanceResponse withCpuUtils(List<ShowStatusInstanceItem> cpuUtils) {
        this.cpuUtils = cpuUtils;
        return this;
    }

    public ShowStatusInstanceResponse addCpuUtilsItem(ShowStatusInstanceItem cpuUtilsItem) {
        if (this.cpuUtils == null) {
            this.cpuUtils = new ArrayList<>();
        }
        this.cpuUtils.add(cpuUtilsItem);
        return this;
    }

    public ShowStatusInstanceResponse withCpuUtils(Consumer<List<ShowStatusInstanceItem>> cpuUtilsSetter) {
        if (this.cpuUtils == null) {
            this.cpuUtils = new ArrayList<>();
        }
        cpuUtilsSetter.accept(this.cpuUtils);
        return this;
    }

    /**
     * CPU使用率
     * @return cpuUtils
     */
    public List<ShowStatusInstanceItem> getCpuUtils() {
        return cpuUtils;
    }

    public void setCpuUtils(List<ShowStatusInstanceItem> cpuUtils) {
        this.cpuUtils = cpuUtils;
    }

    public ShowStatusInstanceResponse withMemUtils(List<ShowStatusInstanceItem> memUtils) {
        this.memUtils = memUtils;
        return this;
    }

    public ShowStatusInstanceResponse addMemUtilsItem(ShowStatusInstanceItem memUtilsItem) {
        if (this.memUtils == null) {
            this.memUtils = new ArrayList<>();
        }
        this.memUtils.add(memUtilsItem);
        return this;
    }

    public ShowStatusInstanceResponse withMemUtils(Consumer<List<ShowStatusInstanceItem>> memUtilsSetter) {
        if (this.memUtils == null) {
            this.memUtils = new ArrayList<>();
        }
        memUtilsSetter.accept(this.memUtils);
        return this;
    }

    /**
     * 内存使用率
     * @return memUtils
     */
    public List<ShowStatusInstanceItem> getMemUtils() {
        return memUtils;
    }

    public void setMemUtils(List<ShowStatusInstanceItem> memUtils) {
        this.memUtils = memUtils;
    }

    public ShowStatusInstanceResponse withDiskUtils(List<ShowStatusInstanceItem> diskUtils) {
        this.diskUtils = diskUtils;
        return this;
    }

    public ShowStatusInstanceResponse addDiskUtilsItem(ShowStatusInstanceItem diskUtilsItem) {
        if (this.diskUtils == null) {
            this.diskUtils = new ArrayList<>();
        }
        this.diskUtils.add(diskUtilsItem);
        return this;
    }

    public ShowStatusInstanceResponse withDiskUtils(Consumer<List<ShowStatusInstanceItem>> diskUtilsSetter) {
        if (this.diskUtils == null) {
            this.diskUtils = new ArrayList<>();
        }
        diskUtilsSetter.accept(this.diskUtils);
        return this;
    }

    /**
     * 磁盘使用率
     * @return diskUtils
     */
    public List<ShowStatusInstanceItem> getDiskUtils() {
        return diskUtils;
    }

    public void setDiskUtils(List<ShowStatusInstanceItem> diskUtils) {
        this.diskUtils = diskUtils;
    }

    public ShowStatusInstanceResponse withCpuUtilInstanceNames(List<String> cpuUtilInstanceNames) {
        this.cpuUtilInstanceNames = cpuUtilInstanceNames;
        return this;
    }

    public ShowStatusInstanceResponse addCpuUtilInstanceNamesItem(String cpuUtilInstanceNamesItem) {
        if (this.cpuUtilInstanceNames == null) {
            this.cpuUtilInstanceNames = new ArrayList<>();
        }
        this.cpuUtilInstanceNames.add(cpuUtilInstanceNamesItem);
        return this;
    }

    public ShowStatusInstanceResponse withCpuUtilInstanceNames(Consumer<List<String>> cpuUtilInstanceNamesSetter) {
        if (this.cpuUtilInstanceNames == null) {
            this.cpuUtilInstanceNames = new ArrayList<>();
        }
        cpuUtilInstanceNamesSetter.accept(this.cpuUtilInstanceNames);
        return this;
    }

    /**
     * CPU使用率对应实例名称
     * @return cpuUtilInstanceNames
     */
    public List<String> getCpuUtilInstanceNames() {
        return cpuUtilInstanceNames;
    }

    public void setCpuUtilInstanceNames(List<String> cpuUtilInstanceNames) {
        this.cpuUtilInstanceNames = cpuUtilInstanceNames;
    }

    public ShowStatusInstanceResponse withMemUtilInstanceNames(List<String> memUtilInstanceNames) {
        this.memUtilInstanceNames = memUtilInstanceNames;
        return this;
    }

    public ShowStatusInstanceResponse addMemUtilInstanceNamesItem(String memUtilInstanceNamesItem) {
        if (this.memUtilInstanceNames == null) {
            this.memUtilInstanceNames = new ArrayList<>();
        }
        this.memUtilInstanceNames.add(memUtilInstanceNamesItem);
        return this;
    }

    public ShowStatusInstanceResponse withMemUtilInstanceNames(Consumer<List<String>> memUtilInstanceNamesSetter) {
        if (this.memUtilInstanceNames == null) {
            this.memUtilInstanceNames = new ArrayList<>();
        }
        memUtilInstanceNamesSetter.accept(this.memUtilInstanceNames);
        return this;
    }

    /**
     * 内存使用率对应实例名称
     * @return memUtilInstanceNames
     */
    public List<String> getMemUtilInstanceNames() {
        return memUtilInstanceNames;
    }

    public void setMemUtilInstanceNames(List<String> memUtilInstanceNames) {
        this.memUtilInstanceNames = memUtilInstanceNames;
    }

    public ShowStatusInstanceResponse withDiskUtilInstanceNames(List<String> diskUtilInstanceNames) {
        this.diskUtilInstanceNames = diskUtilInstanceNames;
        return this;
    }

    public ShowStatusInstanceResponse addDiskUtilInstanceNamesItem(String diskUtilInstanceNamesItem) {
        if (this.diskUtilInstanceNames == null) {
            this.diskUtilInstanceNames = new ArrayList<>();
        }
        this.diskUtilInstanceNames.add(diskUtilInstanceNamesItem);
        return this;
    }

    public ShowStatusInstanceResponse withDiskUtilInstanceNames(Consumer<List<String>> diskUtilInstanceNamesSetter) {
        if (this.diskUtilInstanceNames == null) {
            this.diskUtilInstanceNames = new ArrayList<>();
        }
        diskUtilInstanceNamesSetter.accept(this.diskUtilInstanceNames);
        return this;
    }

    /**
     * 磁盘使用率对应实例名称
     * @return diskUtilInstanceNames
     */
    public List<String> getDiskUtilInstanceNames() {
        return diskUtilInstanceNames;
    }

    public void setDiskUtilInstanceNames(List<String> diskUtilInstanceNames) {
        this.diskUtilInstanceNames = diskUtilInstanceNames;
    }

    public ShowStatusInstanceResponse withCpuUtilAverages(List<Double> cpuUtilAverages) {
        this.cpuUtilAverages = cpuUtilAverages;
        return this;
    }

    public ShowStatusInstanceResponse addCpuUtilAveragesItem(Double cpuUtilAveragesItem) {
        if (this.cpuUtilAverages == null) {
            this.cpuUtilAverages = new ArrayList<>();
        }
        this.cpuUtilAverages.add(cpuUtilAveragesItem);
        return this;
    }

    public ShowStatusInstanceResponse withCpuUtilAverages(Consumer<List<Double>> cpuUtilAveragesSetter) {
        if (this.cpuUtilAverages == null) {
            this.cpuUtilAverages = new ArrayList<>();
        }
        cpuUtilAveragesSetter.accept(this.cpuUtilAverages);
        return this;
    }

    /**
     * CPU使用率平均值
     * @return cpuUtilAverages
     */
    public List<Double> getCpuUtilAverages() {
        return cpuUtilAverages;
    }

    public void setCpuUtilAverages(List<Double> cpuUtilAverages) {
        this.cpuUtilAverages = cpuUtilAverages;
    }

    public ShowStatusInstanceResponse withMemUtilAverages(List<Double> memUtilAverages) {
        this.memUtilAverages = memUtilAverages;
        return this;
    }

    public ShowStatusInstanceResponse addMemUtilAveragesItem(Double memUtilAveragesItem) {
        if (this.memUtilAverages == null) {
            this.memUtilAverages = new ArrayList<>();
        }
        this.memUtilAverages.add(memUtilAveragesItem);
        return this;
    }

    public ShowStatusInstanceResponse withMemUtilAverages(Consumer<List<Double>> memUtilAveragesSetter) {
        if (this.memUtilAverages == null) {
            this.memUtilAverages = new ArrayList<>();
        }
        memUtilAveragesSetter.accept(this.memUtilAverages);
        return this;
    }

    /**
     * 内存使用率平均值
     * @return memUtilAverages
     */
    public List<Double> getMemUtilAverages() {
        return memUtilAverages;
    }

    public void setMemUtilAverages(List<Double> memUtilAverages) {
        this.memUtilAverages = memUtilAverages;
    }

    public ShowStatusInstanceResponse withDiskUtilAverages(List<Double> diskUtilAverages) {
        this.diskUtilAverages = diskUtilAverages;
        return this;
    }

    public ShowStatusInstanceResponse addDiskUtilAveragesItem(Double diskUtilAveragesItem) {
        if (this.diskUtilAverages == null) {
            this.diskUtilAverages = new ArrayList<>();
        }
        this.diskUtilAverages.add(diskUtilAveragesItem);
        return this;
    }

    public ShowStatusInstanceResponse withDiskUtilAverages(Consumer<List<Double>> diskUtilAveragesSetter) {
        if (this.diskUtilAverages == null) {
            this.diskUtilAverages = new ArrayList<>();
        }
        diskUtilAveragesSetter.accept(this.diskUtilAverages);
        return this;
    }

    /**
     * 磁盘使用率平均值
     * @return diskUtilAverages
     */
    public List<Double> getDiskUtilAverages() {
        return diskUtilAverages;
    }

    public void setDiskUtilAverages(List<Double> diskUtilAverages) {
        this.diskUtilAverages = diskUtilAverages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStatusInstanceResponse that = (ShowStatusInstanceResponse) obj;
        return Objects.equals(this.cpuUtils, that.cpuUtils) && Objects.equals(this.memUtils, that.memUtils)
            && Objects.equals(this.diskUtils, that.diskUtils)
            && Objects.equals(this.cpuUtilInstanceNames, that.cpuUtilInstanceNames)
            && Objects.equals(this.memUtilInstanceNames, that.memUtilInstanceNames)
            && Objects.equals(this.diskUtilInstanceNames, that.diskUtilInstanceNames)
            && Objects.equals(this.cpuUtilAverages, that.cpuUtilAverages)
            && Objects.equals(this.memUtilAverages, that.memUtilAverages)
            && Objects.equals(this.diskUtilAverages, that.diskUtilAverages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuUtils,
            memUtils,
            diskUtils,
            cpuUtilInstanceNames,
            memUtilInstanceNames,
            diskUtilInstanceNames,
            cpuUtilAverages,
            memUtilAverages,
            diskUtilAverages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatusInstanceResponse {\n");
        sb.append("    cpuUtils: ").append(toIndentedString(cpuUtils)).append("\n");
        sb.append("    memUtils: ").append(toIndentedString(memUtils)).append("\n");
        sb.append("    diskUtils: ").append(toIndentedString(diskUtils)).append("\n");
        sb.append("    cpuUtilInstanceNames: ").append(toIndentedString(cpuUtilInstanceNames)).append("\n");
        sb.append("    memUtilInstanceNames: ").append(toIndentedString(memUtilInstanceNames)).append("\n");
        sb.append("    diskUtilInstanceNames: ").append(toIndentedString(diskUtilInstanceNames)).append("\n");
        sb.append("    cpuUtilAverages: ").append(toIndentedString(cpuUtilAverages)).append("\n");
        sb.append("    memUtilAverages: ").append(toIndentedString(memUtilAverages)).append("\n");
        sb.append("    diskUtilAverages: ").append(toIndentedString(diskUtilAverages)).append("\n");
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
