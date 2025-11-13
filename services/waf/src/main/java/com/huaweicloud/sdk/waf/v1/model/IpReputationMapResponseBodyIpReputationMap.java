package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 威胁情报控制防护选项的内容类型 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class IpReputationMapResponseBodyIpReputationMap {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idc")

    private List<String> idc = null;

    public IpReputationMapResponseBodyIpReputationMap withIdc(List<String> idc) {
        this.idc = idc;
        return this;
    }

    public IpReputationMapResponseBodyIpReputationMap addIdcItem(String idcItem) {
        if (this.idc == null) {
            this.idc = new ArrayList<>();
        }
        this.idc.add(idcItem);
        return this;
    }

    public IpReputationMapResponseBodyIpReputationMap withIdc(Consumer<List<String>> idcSetter) {
        if (this.idc == null) {
            this.idc = new ArrayList<>();
        }
        idcSetter.accept(this.idc);
        return this;
    }

    /**
     * **参数解释：** 威胁情报控制的内容类型 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return idc
     */
    public List<String> getIdc() {
        return idc;
    }

    public void setIdc(List<String> idc) {
        this.idc = idc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IpReputationMapResponseBodyIpReputationMap that = (IpReputationMapResponseBodyIpReputationMap) obj;
        return Objects.equals(this.idc, that.idc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpReputationMapResponseBodyIpReputationMap {\n");
        sb.append("    idc: ").append(toIndentedString(idc)).append("\n");
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
