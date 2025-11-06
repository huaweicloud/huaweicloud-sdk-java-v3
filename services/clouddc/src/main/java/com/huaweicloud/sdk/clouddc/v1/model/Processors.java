package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 处理器的信息，包含处理器的型号、核心数、线程数等。
 */
public class Processors {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manufacturer")

    private String manufacturer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_cores")

    private Integer totalCores;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_enabled_cores")

    private Integer totalEnabledCores;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_threads")

    private Integer totalThreads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_enabled_threads")

    private Integer totalEnabledThreads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "socket")

    private Integer socket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_speed_mhz")

    private Integer maxSpeedMhz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temperature")

    private Integer temperature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l1_cache_kib")

    private Integer l1CacheKib;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l2_cache_kib")

    private Integer l2CacheKib;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l3_cache_kib")

    private Integer l3CacheKib;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency_mhz")

    private Integer frequencyMhz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_parameters")

    private String otherParameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    private String serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "part_number")

    private String partNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health")

    private String health;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    public Processors withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 处理器名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Processors withManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    /**
     * 制造商
     * @return manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Processors withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * 处理器型号
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Processors withTotalCores(Integer totalCores) {
        this.totalCores = totalCores;
        return this;
    }

    /**
     * 处理器的总核数
     * @return totalCores
     */
    public Integer getTotalCores() {
        return totalCores;
    }

    public void setTotalCores(Integer totalCores) {
        this.totalCores = totalCores;
    }

    public Processors withTotalEnabledCores(Integer totalEnabledCores) {
        this.totalEnabledCores = totalEnabledCores;
        return this;
    }

    /**
     * 启用的核心数
     * @return totalEnabledCores
     */
    public Integer getTotalEnabledCores() {
        return totalEnabledCores;
    }

    public void setTotalEnabledCores(Integer totalEnabledCores) {
        this.totalEnabledCores = totalEnabledCores;
    }

    public Processors withTotalThreads(Integer totalThreads) {
        this.totalThreads = totalThreads;
        return this;
    }

    /**
     * 处理器的总线程数
     * @return totalThreads
     */
    public Integer getTotalThreads() {
        return totalThreads;
    }

    public void setTotalThreads(Integer totalThreads) {
        this.totalThreads = totalThreads;
    }

    public Processors withTotalEnabledThreads(Integer totalEnabledThreads) {
        this.totalEnabledThreads = totalEnabledThreads;
        return this;
    }

    /**
     * 启用的总线程
     * @return totalEnabledThreads
     */
    public Integer getTotalEnabledThreads() {
        return totalEnabledThreads;
    }

    public void setTotalEnabledThreads(Integer totalEnabledThreads) {
        this.totalEnabledThreads = totalEnabledThreads;
    }

    public Processors withSocket(Integer socket) {
        this.socket = socket;
        return this;
    }

    /**
     * 处理器的插槽号
     * @return socket
     */
    public Integer getSocket() {
        return socket;
    }

    public void setSocket(Integer socket) {
        this.socket = socket;
    }

    public Processors withMaxSpeedMhz(Integer maxSpeedMhz) {
        this.maxSpeedMhz = maxSpeedMhz;
        return this;
    }

    /**
     * 处理器的最大主频（单位：MHz）
     * @return maxSpeedMhz
     */
    public Integer getMaxSpeedMhz() {
        return maxSpeedMhz;
    }

    public void setMaxSpeedMhz(Integer maxSpeedMhz) {
        this.maxSpeedMhz = maxSpeedMhz;
    }

    public Processors withTemperature(Integer temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * 处理器的温度
     * @return temperature
     */
    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Processors withL1CacheKib(Integer l1CacheKib) {
        this.l1CacheKib = l1CacheKib;
        return this;
    }

    /**
     * 一级缓存（单位：KiB）
     * @return l1CacheKib
     */
    public Integer getL1CacheKib() {
        return l1CacheKib;
    }

    public void setL1CacheKib(Integer l1CacheKib) {
        this.l1CacheKib = l1CacheKib;
    }

    public Processors withL2CacheKib(Integer l2CacheKib) {
        this.l2CacheKib = l2CacheKib;
        return this;
    }

    /**
     * 二级缓存（单位：KiB）
     * @return l2CacheKib
     */
    public Integer getL2CacheKib() {
        return l2CacheKib;
    }

    public void setL2CacheKib(Integer l2CacheKib) {
        this.l2CacheKib = l2CacheKib;
    }

    public Processors withL3CacheKib(Integer l3CacheKib) {
        this.l3CacheKib = l3CacheKib;
        return this;
    }

    /**
     * 三级缓存（单位：KiB）
     * @return l3CacheKib
     */
    public Integer getL3CacheKib() {
        return l3CacheKib;
    }

    public void setL3CacheKib(Integer l3CacheKib) {
        this.l3CacheKib = l3CacheKib;
    }

    public Processors withFrequencyMhz(Integer frequencyMhz) {
        this.frequencyMhz = frequencyMhz;
        return this;
    }

    /**
     * 处理器的主频
     * @return frequencyMhz
     */
    public Integer getFrequencyMhz() {
        return frequencyMhz;
    }

    public void setFrequencyMhz(Integer frequencyMhz) {
        this.frequencyMhz = frequencyMhz;
    }

    public Processors withOtherParameters(String otherParameters) {
        this.otherParameters = otherParameters;
        return this;
    }

    /**
     * 其他参数
     * @return otherParameters
     */
    public String getOtherParameters() {
        return otherParameters;
    }

    public void setOtherParameters(String otherParameters) {
        this.otherParameters = otherParameters;
    }

    public Processors withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * 序列号
     * @return serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Processors withPartNumber(String partNumber) {
        this.partNumber = partNumber;
        return this;
    }

    /**
     * 指定CPU资源的部件号
     * @return partNumber
     */
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public Processors withHealth(String health) {
        this.health = health;
        return this;
    }

    /**
     * 健康状态
     * @return health
     */
    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public Processors withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Processors that = (Processors) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.manufacturer, that.manufacturer)
            && Objects.equals(this.model, that.model) && Objects.equals(this.totalCores, that.totalCores)
            && Objects.equals(this.totalEnabledCores, that.totalEnabledCores)
            && Objects.equals(this.totalThreads, that.totalThreads)
            && Objects.equals(this.totalEnabledThreads, that.totalEnabledThreads)
            && Objects.equals(this.socket, that.socket) && Objects.equals(this.maxSpeedMhz, that.maxSpeedMhz)
            && Objects.equals(this.temperature, that.temperature) && Objects.equals(this.l1CacheKib, that.l1CacheKib)
            && Objects.equals(this.l2CacheKib, that.l2CacheKib) && Objects.equals(this.l3CacheKib, that.l3CacheKib)
            && Objects.equals(this.frequencyMhz, that.frequencyMhz)
            && Objects.equals(this.otherParameters, that.otherParameters)
            && Objects.equals(this.serialNumber, that.serialNumber) && Objects.equals(this.partNumber, that.partNumber)
            && Objects.equals(this.health, that.health) && Objects.equals(this.state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            manufacturer,
            model,
            totalCores,
            totalEnabledCores,
            totalThreads,
            totalEnabledThreads,
            socket,
            maxSpeedMhz,
            temperature,
            l1CacheKib,
            l2CacheKib,
            l3CacheKib,
            frequencyMhz,
            otherParameters,
            serialNumber,
            partNumber,
            health,
            state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Processors {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    totalCores: ").append(toIndentedString(totalCores)).append("\n");
        sb.append("    totalEnabledCores: ").append(toIndentedString(totalEnabledCores)).append("\n");
        sb.append("    totalThreads: ").append(toIndentedString(totalThreads)).append("\n");
        sb.append("    totalEnabledThreads: ").append(toIndentedString(totalEnabledThreads)).append("\n");
        sb.append("    socket: ").append(toIndentedString(socket)).append("\n");
        sb.append("    maxSpeedMhz: ").append(toIndentedString(maxSpeedMhz)).append("\n");
        sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
        sb.append("    l1CacheKib: ").append(toIndentedString(l1CacheKib)).append("\n");
        sb.append("    l2CacheKib: ").append(toIndentedString(l2CacheKib)).append("\n");
        sb.append("    l3CacheKib: ").append(toIndentedString(l3CacheKib)).append("\n");
        sb.append("    frequencyMhz: ").append(toIndentedString(frequencyMhz)).append("\n");
        sb.append("    otherParameters: ").append(toIndentedString(otherParameters)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
        sb.append("    health: ").append(toIndentedString(health)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
