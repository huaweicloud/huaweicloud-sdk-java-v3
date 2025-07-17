package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源池信息，包含sku该条数据主键id，资源池id，资源池对应aosp版本
 */
public class SkuSpecBaseResponsePoolInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aosp")

    private List<SkuSpecBaseResponsePoolInfoAosp> aosp = null;

    public SkuSpecBaseResponsePoolInfo withAosp(List<SkuSpecBaseResponsePoolInfoAosp> aosp) {
        this.aosp = aosp;
        return this;
    }

    public SkuSpecBaseResponsePoolInfo addAospItem(SkuSpecBaseResponsePoolInfoAosp aospItem) {
        if (this.aosp == null) {
            this.aosp = new ArrayList<>();
        }
        this.aosp.add(aospItem);
        return this;
    }

    public SkuSpecBaseResponsePoolInfo withAosp(Consumer<List<SkuSpecBaseResponsePoolInfoAosp>> aospSetter) {
        if (this.aosp == null) {
            this.aosp = new ArrayList<>();
        }
        aospSetter.accept(this.aosp);
        return this;
    }

    /**
     * 资源池规格信息
     * @return aosp
     */
    public List<SkuSpecBaseResponsePoolInfoAosp> getAosp() {
        return aosp;
    }

    public void setAosp(List<SkuSpecBaseResponsePoolInfoAosp> aosp) {
        this.aosp = aosp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SkuSpecBaseResponsePoolInfo that = (SkuSpecBaseResponsePoolInfo) obj;
        return Objects.equals(this.aosp, that.aosp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aosp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkuSpecBaseResponsePoolInfo {\n");
        sb.append("    aosp: ").append(toIndentedString(aosp)).append("\n");
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
