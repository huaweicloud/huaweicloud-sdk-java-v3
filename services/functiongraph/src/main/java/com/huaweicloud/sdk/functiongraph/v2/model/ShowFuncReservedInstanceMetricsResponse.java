package com.huaweicloud.sdk.functiongraph.v2.model;

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
public class ShowFuncReservedInstanceMetricsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceNum")

    private List<SlaReportsValue> instanceNum = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reservedInstanceNum")

    private List<SlaReportsValue> reservedInstanceNum = null;

    public ShowFuncReservedInstanceMetricsResponse withInstanceNum(List<SlaReportsValue> instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }

    public ShowFuncReservedInstanceMetricsResponse addInstanceNumItem(SlaReportsValue instanceNumItem) {
        if (this.instanceNum == null) {
            this.instanceNum = new ArrayList<>();
        }
        this.instanceNum.add(instanceNumItem);
        return this;
    }

    public ShowFuncReservedInstanceMetricsResponse withInstanceNum(Consumer<List<SlaReportsValue>> instanceNumSetter) {
        if (this.instanceNum == null) {
            this.instanceNum = new ArrayList<>();
        }
        instanceNumSetter.accept(this.instanceNum);
        return this;
    }

    /**
     * 弹性实例指标
     * @return instanceNum
     */
    public List<SlaReportsValue> getInstanceNum() {
        return instanceNum;
    }

    public void setInstanceNum(List<SlaReportsValue> instanceNum) {
        this.instanceNum = instanceNum;
    }

    public ShowFuncReservedInstanceMetricsResponse withReservedInstanceNum(List<SlaReportsValue> reservedInstanceNum) {
        this.reservedInstanceNum = reservedInstanceNum;
        return this;
    }

    public ShowFuncReservedInstanceMetricsResponse addReservedInstanceNumItem(SlaReportsValue reservedInstanceNumItem) {
        if (this.reservedInstanceNum == null) {
            this.reservedInstanceNum = new ArrayList<>();
        }
        this.reservedInstanceNum.add(reservedInstanceNumItem);
        return this;
    }

    public ShowFuncReservedInstanceMetricsResponse withReservedInstanceNum(
        Consumer<List<SlaReportsValue>> reservedInstanceNumSetter) {
        if (this.reservedInstanceNum == null) {
            this.reservedInstanceNum = new ArrayList<>();
        }
        reservedInstanceNumSetter.accept(this.reservedInstanceNum);
        return this;
    }

    /**
     * 预留实例指标
     * @return reservedInstanceNum
     */
    public List<SlaReportsValue> getReservedInstanceNum() {
        return reservedInstanceNum;
    }

    public void setReservedInstanceNum(List<SlaReportsValue> reservedInstanceNum) {
        this.reservedInstanceNum = reservedInstanceNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFuncReservedInstanceMetricsResponse that = (ShowFuncReservedInstanceMetricsResponse) obj;
        return Objects.equals(this.instanceNum, that.instanceNum)
            && Objects.equals(this.reservedInstanceNum, that.reservedInstanceNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceNum, reservedInstanceNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFuncReservedInstanceMetricsResponse {\n");
        sb.append("    instanceNum: ").append(toIndentedString(instanceNum)).append("\n");
        sb.append("    reservedInstanceNum: ").append(toIndentedString(reservedInstanceNum)).append("\n");
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
