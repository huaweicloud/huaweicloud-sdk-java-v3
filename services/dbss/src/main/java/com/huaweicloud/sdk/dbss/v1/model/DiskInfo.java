package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 磁盘使用情况
 */
public class DiskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_available")

    private Double dataAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_total")

    private Double dataTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_use_percent")

    private Integer dataUsePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swap_available")

    private Double swapAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swap_total")

    private Double swapTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swap_use_percent")

    private Integer swapUsePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_available")

    private Double systemAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_total")

    private Double systemTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_use_percent")

    private Integer systemUsePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    public DiskInfo withDataAvailable(Double dataAvailable) {
        this.dataAvailable = dataAvailable;
        return this;
    }

    /**
     * 数据盘可用量
     * @return dataAvailable
     */
    public Double getDataAvailable() {
        return dataAvailable;
    }

    public void setDataAvailable(Double dataAvailable) {
        this.dataAvailable = dataAvailable;
    }

    public DiskInfo withDataTotal(Double dataTotal) {
        this.dataTotal = dataTotal;
        return this;
    }

    /**
     * 数据盘总容量
     * @return dataTotal
     */
    public Double getDataTotal() {
        return dataTotal;
    }

    public void setDataTotal(Double dataTotal) {
        this.dataTotal = dataTotal;
    }

    public DiskInfo withDataUsePercent(Integer dataUsePercent) {
        this.dataUsePercent = dataUsePercent;
        return this;
    }

    /**
     * 数据盘使用百分比
     * @return dataUsePercent
     */
    public Integer getDataUsePercent() {
        return dataUsePercent;
    }

    public void setDataUsePercent(Integer dataUsePercent) {
        this.dataUsePercent = dataUsePercent;
    }

    public DiskInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 记录ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DiskInfo withSwapAvailable(Double swapAvailable) {
        this.swapAvailable = swapAvailable;
        return this;
    }

    /**
     * 临时目录可用量
     * @return swapAvailable
     */
    public Double getSwapAvailable() {
        return swapAvailable;
    }

    public void setSwapAvailable(Double swapAvailable) {
        this.swapAvailable = swapAvailable;
    }

    public DiskInfo withSwapTotal(Double swapTotal) {
        this.swapTotal = swapTotal;
        return this;
    }

    /**
     * 临时目录总容量
     * @return swapTotal
     */
    public Double getSwapTotal() {
        return swapTotal;
    }

    public void setSwapTotal(Double swapTotal) {
        this.swapTotal = swapTotal;
    }

    public DiskInfo withSwapUsePercent(Integer swapUsePercent) {
        this.swapUsePercent = swapUsePercent;
        return this;
    }

    /**
     * 临时目录使用百分比
     * @return swapUsePercent
     */
    public Integer getSwapUsePercent() {
        return swapUsePercent;
    }

    public void setSwapUsePercent(Integer swapUsePercent) {
        this.swapUsePercent = swapUsePercent;
    }

    public DiskInfo withSystemAvailable(Double systemAvailable) {
        this.systemAvailable = systemAvailable;
        return this;
    }

    /**
     * 系统盘可用量
     * @return systemAvailable
     */
    public Double getSystemAvailable() {
        return systemAvailable;
    }

    public void setSystemAvailable(Double systemAvailable) {
        this.systemAvailable = systemAvailable;
    }

    public DiskInfo withSystemTotal(Double systemTotal) {
        this.systemTotal = systemTotal;
        return this;
    }

    /**
     * 系统盘容量
     * @return systemTotal
     */
    public Double getSystemTotal() {
        return systemTotal;
    }

    public void setSystemTotal(Double systemTotal) {
        this.systemTotal = systemTotal;
    }

    public DiskInfo withSystemUsePercent(Integer systemUsePercent) {
        this.systemUsePercent = systemUsePercent;
        return this;
    }

    /**
     * 系统盘使用百分比
     * @return systemUsePercent
     */
    public Integer getSystemUsePercent() {
        return systemUsePercent;
    }

    public void setSystemUsePercent(Integer systemUsePercent) {
        this.systemUsePercent = systemUsePercent;
    }

    public DiskInfo withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 记录时间
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiskInfo that = (DiskInfo) obj;
        return Objects.equals(this.dataAvailable, that.dataAvailable) && Objects.equals(this.dataTotal, that.dataTotal)
            && Objects.equals(this.dataUsePercent, that.dataUsePercent) && Objects.equals(this.id, that.id)
            && Objects.equals(this.swapAvailable, that.swapAvailable) && Objects.equals(this.swapTotal, that.swapTotal)
            && Objects.equals(this.swapUsePercent, that.swapUsePercent)
            && Objects.equals(this.systemAvailable, that.systemAvailable)
            && Objects.equals(this.systemTotal, that.systemTotal)
            && Objects.equals(this.systemUsePercent, that.systemUsePercent) && Objects.equals(this.time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataAvailable,
            dataTotal,
            dataUsePercent,
            id,
            swapAvailable,
            swapTotal,
            swapUsePercent,
            systemAvailable,
            systemTotal,
            systemUsePercent,
            time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiskInfo {\n");
        sb.append("    dataAvailable: ").append(toIndentedString(dataAvailable)).append("\n");
        sb.append("    dataTotal: ").append(toIndentedString(dataTotal)).append("\n");
        sb.append("    dataUsePercent: ").append(toIndentedString(dataUsePercent)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    swapAvailable: ").append(toIndentedString(swapAvailable)).append("\n");
        sb.append("    swapTotal: ").append(toIndentedString(swapTotal)).append("\n");
        sb.append("    swapUsePercent: ").append(toIndentedString(swapUsePercent)).append("\n");
        sb.append("    systemAvailable: ").append(toIndentedString(systemAvailable)).append("\n");
        sb.append("    systemTotal: ").append(toIndentedString(systemTotal)).append("\n");
        sb.append("    systemUsePercent: ").append(toIndentedString(systemUsePercent)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
