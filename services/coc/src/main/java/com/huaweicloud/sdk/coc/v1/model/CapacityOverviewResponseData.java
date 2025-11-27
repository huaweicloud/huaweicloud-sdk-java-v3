package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CapacityOverviewResponseData
 */
public class CapacityOverviewResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum_size")

    private String sumSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum_cpu")

    private String sumCpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum_mem")

    private String sumMem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public CapacityOverviewResponseData withSumSize(String sumSize) {
        this.sumSize = sumSize;
        return this;
    }

    /**
     * **参数解释：** 硬盘大小总量。 **取值范围：** 云服务对应的总内存。
     * @return sumSize
     */
    public String getSumSize() {
        return sumSize;
    }

    public void setSumSize(String sumSize) {
        this.sumSize = sumSize;
    }

    public CapacityOverviewResponseData withSumCpu(String sumCpu) {
        this.sumCpu = sumCpu;
        return this;
    }

    /**
     * **参数解释：** CPU分配量总量。 **取值范围：** 不涉及。
     * @return sumCpu
     */
    public String getSumCpu() {
        return sumCpu;
    }

    public void setSumCpu(String sumCpu) {
        this.sumCpu = sumCpu;
    }

    public CapacityOverviewResponseData withSumMem(String sumMem) {
        this.sumMem = sumMem;
        return this;
    }

    /**
     * **参数解释：** 内存分配量总量。 **取值范围：** 不涉及。
     * @return sumMem
     */
    public String getSumMem() {
        return sumMem;
    }

    public void setSumMem(String sumMem) {
        this.sumMem = sumMem;
    }

    public CapacityOverviewResponseData withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * **参数解释：** 云服务类型。 **取值范围：** 不涉及。
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public CapacityOverviewResponseData withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 云服务资源类型。。 **取值范围：** 资源类型较多，根据实际业务选择资源类型、常用资源类型如下： - cloudservers：弹性云服务器。 - servers：裸金属服务器。 - clusters：云容器引擎。 - instances：云数据库。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CapacityOverviewResponseData that = (CapacityOverviewResponseData) obj;
        return Objects.equals(this.sumSize, that.sumSize) && Objects.equals(this.sumCpu, that.sumCpu)
            && Objects.equals(this.sumMem, that.sumMem) && Objects.equals(this.provider, that.provider)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sumSize, sumCpu, sumMem, provider, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CapacityOverviewResponseData {\n");
        sb.append("    sumSize: ").append(toIndentedString(sumSize)).append("\n");
        sb.append("    sumCpu: ").append(toIndentedString(sumCpu)).append("\n");
        sb.append("    sumMem: ").append(toIndentedString(sumMem)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
