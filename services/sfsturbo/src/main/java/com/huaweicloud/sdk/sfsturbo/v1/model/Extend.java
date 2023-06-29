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
     * 扩容后文件系统的新容量，以GB为单位。扩容步长大于等于100GB。  普通文件系统容量，取值范围500~32768。  带宽型文件系统，容量范围是10240~327680
     * minimum: 500
     * maximum: 327680
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
     * 扩缩带宽后文件系统的新带宽，以 GB 为单位。仅支持 hpc cache 型文件系统
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
