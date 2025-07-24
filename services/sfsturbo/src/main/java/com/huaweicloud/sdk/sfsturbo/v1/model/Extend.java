package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * extend对象
 */
public class Extend {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_size")

    private Integer newSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_bandwidth")

    private Long newBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bss_param")

    private BssInfoExtend bssParam;

    public Extend withNewSize(Integer newSize) {
        this.newSize = newSize;
        return this;
    }

    /**
     * 扩容后文件系统的新容量，以GiB为单位。  SFS Turbo上一代文件系统规格类型-标准型和性能型，取值范围500~32768 GiB，扩容步长大于等于100 GiB。  SFS Turbo上一代文件系统规格类型-标准型增强版和性能型增强版。容量范围是10240~327680 GiB。扩容步长大于等于100 GiB。  20MB/s/TiB，容量范围是3686~1048576 GiB。容量必须为1.2TiB的倍数，扩容步长需要大于等于1.2TiB，需要将目标容量换算为GiB后需要向下取整。如4.8TiB->4915GiB，8.4TiB->8601GiB。  40MB/s/TiB，容量范围是1228~1048576 GiB。容量必须为1.2TiB的倍数，扩容步长需要大于等于1.2TiB，需要将目标容量换算为GiB后需要向下取整。如4.8TiB->4915GiB，8.4TiB->8601GiB。  125MB/s/TiB、250MB/s/TiB、500MB/s/TiB、1000MB/s/TiB与40MB/s/TiB的容量范围，扩容步长相同。  HPC缓存型文件系统，容量范围是4096~1048576 GiB。扩容步长均为1TiB。需要将目标容量换算为GiB。 
     * minimum: 500
     * maximum: 1048576
     * @return newSize
     */
    public Integer getNewSize() {
        return newSize;
    }

    public void setNewSize(Integer newSize) {
        this.newSize = newSize;
    }

    public Extend withNewBandwidth(Long newBandwidth) {
        this.newBandwidth = newBandwidth;
        return this;
    }

    /**
     * 带宽的目标值，单位：GB。仅HPC缓存型支持带宽扩缩。 支持的带宽值为：2、4、8、16、24、32、48。 
     * @return newBandwidth
     */
    public Long getNewBandwidth() {
        return newBandwidth;
    }

    public void setNewBandwidth(Long newBandwidth) {
        this.newBandwidth = newBandwidth;
    }

    public Extend withBssParam(BssInfoExtend bssParam) {
        this.bssParam = bssParam;
        return this;
    }

    public Extend withBssParam(Consumer<BssInfoExtend> bssParamSetter) {
        if (this.bssParam == null) {
            this.bssParam = new BssInfoExtend();
            bssParamSetter.accept(this.bssParam);
        }

        return this;
    }

    /**
     * Get bssParam
     * @return bssParam
     */
    public BssInfoExtend getBssParam() {
        return bssParam;
    }

    public void setBssParam(BssInfoExtend bssParam) {
        this.bssParam = bssParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Extend that = (Extend) obj;
        return Objects.equals(this.newSize, that.newSize) && Objects.equals(this.newBandwidth, that.newBandwidth)
            && Objects.equals(this.bssParam, that.bssParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newSize, newBandwidth, bssParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Extend {\n");
        sb.append("    newSize: ").append(toIndentedString(newSize)).append("\n");
        sb.append("    newBandwidth: ").append(toIndentedString(newBandwidth)).append("\n");
        sb.append("    bssParam: ").append(toIndentedString(bssParam)).append("\n");
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
