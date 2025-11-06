package com.huaweicloud.sdk.clouddc.v1.model;

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
public class ShowServerHardwareAttributesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private HardwareSummary summary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memorys")

    private List<Memory> memorys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processors")

    private List<Processors> processors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_adapters")

    private List<NetworkAdapter> networkAdapters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fans")

    private List<Fan> fans = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "powers")

    private List<Power> powers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_controllers")

    private List<StorageController> storageControllers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private List<HardwareMetric> metrics = null;

    public ShowServerHardwareAttributesResponse withSummary(HardwareSummary summary) {
        this.summary = summary;
        return this;
    }

    public ShowServerHardwareAttributesResponse withSummary(Consumer<HardwareSummary> summarySetter) {
        if (this.summary == null) {
            this.summary = new HardwareSummary();
            summarySetter.accept(this.summary);
        }

        return this;
    }

    /**
     * Get summary
     * @return summary
     */
    public HardwareSummary getSummary() {
        return summary;
    }

    public void setSummary(HardwareSummary summary) {
        this.summary = summary;
    }

    public ShowServerHardwareAttributesResponse withMemorys(List<Memory> memorys) {
        this.memorys = memorys;
        return this;
    }

    public ShowServerHardwareAttributesResponse addMemorysItem(Memory memorysItem) {
        if (this.memorys == null) {
            this.memorys = new ArrayList<>();
        }
        this.memorys.add(memorysItem);
        return this;
    }

    public ShowServerHardwareAttributesResponse withMemorys(Consumer<List<Memory>> memorysSetter) {
        if (this.memorys == null) {
            this.memorys = new ArrayList<>();
        }
        memorysSetter.accept(this.memorys);
        return this;
    }

    /**
     * 内存列表
     * @return memorys
     */
    public List<Memory> getMemorys() {
        return memorys;
    }

    public void setMemorys(List<Memory> memorys) {
        this.memorys = memorys;
    }

    public ShowServerHardwareAttributesResponse withProcessors(List<Processors> processors) {
        this.processors = processors;
        return this;
    }

    public ShowServerHardwareAttributesResponse addProcessorsItem(Processors processorsItem) {
        if (this.processors == null) {
            this.processors = new ArrayList<>();
        }
        this.processors.add(processorsItem);
        return this;
    }

    public ShowServerHardwareAttributesResponse withProcessors(Consumer<List<Processors>> processorsSetter) {
        if (this.processors == null) {
            this.processors = new ArrayList<>();
        }
        processorsSetter.accept(this.processors);
        return this;
    }

    /**
     * cpu列表
     * @return processors
     */
    public List<Processors> getProcessors() {
        return processors;
    }

    public void setProcessors(List<Processors> processors) {
        this.processors = processors;
    }

    public ShowServerHardwareAttributesResponse withNetworkAdapters(List<NetworkAdapter> networkAdapters) {
        this.networkAdapters = networkAdapters;
        return this;
    }

    public ShowServerHardwareAttributesResponse addNetworkAdaptersItem(NetworkAdapter networkAdaptersItem) {
        if (this.networkAdapters == null) {
            this.networkAdapters = new ArrayList<>();
        }
        this.networkAdapters.add(networkAdaptersItem);
        return this;
    }

    public ShowServerHardwareAttributesResponse withNetworkAdapters(
        Consumer<List<NetworkAdapter>> networkAdaptersSetter) {
        if (this.networkAdapters == null) {
            this.networkAdapters = new ArrayList<>();
        }
        networkAdaptersSetter.accept(this.networkAdapters);
        return this;
    }

    /**
     * 网络适配器详细信息
     * @return networkAdapters
     */
    public List<NetworkAdapter> getNetworkAdapters() {
        return networkAdapters;
    }

    public void setNetworkAdapters(List<NetworkAdapter> networkAdapters) {
        this.networkAdapters = networkAdapters;
    }

    public ShowServerHardwareAttributesResponse withFans(List<Fan> fans) {
        this.fans = fans;
        return this;
    }

    public ShowServerHardwareAttributesResponse addFansItem(Fan fansItem) {
        if (this.fans == null) {
            this.fans = new ArrayList<>();
        }
        this.fans.add(fansItem);
        return this;
    }

    public ShowServerHardwareAttributesResponse withFans(Consumer<List<Fan>> fansSetter) {
        if (this.fans == null) {
            this.fans = new ArrayList<>();
        }
        fansSetter.accept(this.fans);
        return this;
    }

    /**
     * 风扇列表
     * @return fans
     */
    public List<Fan> getFans() {
        return fans;
    }

    public void setFans(List<Fan> fans) {
        this.fans = fans;
    }

    public ShowServerHardwareAttributesResponse withPowers(List<Power> powers) {
        this.powers = powers;
        return this;
    }

    public ShowServerHardwareAttributesResponse addPowersItem(Power powersItem) {
        if (this.powers == null) {
            this.powers = new ArrayList<>();
        }
        this.powers.add(powersItem);
        return this;
    }

    public ShowServerHardwareAttributesResponse withPowers(Consumer<List<Power>> powersSetter) {
        if (this.powers == null) {
            this.powers = new ArrayList<>();
        }
        powersSetter.accept(this.powers);
        return this;
    }

    /**
     * 电源列表
     * @return powers
     */
    public List<Power> getPowers() {
        return powers;
    }

    public void setPowers(List<Power> powers) {
        this.powers = powers;
    }

    public ShowServerHardwareAttributesResponse withStorageControllers(List<StorageController> storageControllers) {
        this.storageControllers = storageControllers;
        return this;
    }

    public ShowServerHardwareAttributesResponse addStorageControllersItem(StorageController storageControllersItem) {
        if (this.storageControllers == null) {
            this.storageControllers = new ArrayList<>();
        }
        this.storageControllers.add(storageControllersItem);
        return this;
    }

    public ShowServerHardwareAttributesResponse withStorageControllers(
        Consumer<List<StorageController>> storageControllersSetter) {
        if (this.storageControllers == null) {
            this.storageControllers = new ArrayList<>();
        }
        storageControllersSetter.accept(this.storageControllers);
        return this;
    }

    /**
     * 存储控制器列表
     * @return storageControllers
     */
    public List<StorageController> getStorageControllers() {
        return storageControllers;
    }

    public void setStorageControllers(List<StorageController> storageControllers) {
        this.storageControllers = storageControllers;
    }

    public ShowServerHardwareAttributesResponse withMetrics(List<HardwareMetric> metrics) {
        this.metrics = metrics;
        return this;
    }

    public ShowServerHardwareAttributesResponse addMetricsItem(HardwareMetric metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public ShowServerHardwareAttributesResponse withMetrics(Consumer<List<HardwareMetric>> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * **参数解释**： 监控指标信息 **约束限制**： 不涉及 
     * @return metrics
     */
    public List<HardwareMetric> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<HardwareMetric> metrics) {
        this.metrics = metrics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowServerHardwareAttributesResponse that = (ShowServerHardwareAttributesResponse) obj;
        return Objects.equals(this.summary, that.summary) && Objects.equals(this.memorys, that.memorys)
            && Objects.equals(this.processors, that.processors)
            && Objects.equals(this.networkAdapters, that.networkAdapters) && Objects.equals(this.fans, that.fans)
            && Objects.equals(this.powers, that.powers)
            && Objects.equals(this.storageControllers, that.storageControllers)
            && Objects.equals(this.metrics, that.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(summary, memorys, processors, networkAdapters, fans, powers, storageControllers, metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerHardwareAttributesResponse {\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    memorys: ").append(toIndentedString(memorys)).append("\n");
        sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
        sb.append("    networkAdapters: ").append(toIndentedString(networkAdapters)).append("\n");
        sb.append("    fans: ").append(toIndentedString(fans)).append("\n");
        sb.append("    powers: ").append(toIndentedString(powers)).append("\n");
        sb.append("    storageControllers: ").append(toIndentedString(storageControllers)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
