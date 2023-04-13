package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class Throughput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozened")

    private Boolean frozened;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_val")

    private Integer totalVal;

    public Throughput withFrozened(Boolean frozened) {
        this.frozened = frozened;
        return this;
    }

    /**
     * 冻结标签。
     * @return frozened
     */
    public Boolean getFrozened() {
        return frozened;
    }

    public void setFrozened(Boolean frozened) {
        this.frozened = frozened;
    }

    public Throughput withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 云硬盘吞吐量标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Throughput withTotalVal(Integer totalVal) {
        this.totalVal = totalVal;
        return this;
    }

    /**
     * 吞吐量大小。
     * @return totalVal
     */
    public Integer getTotalVal() {
        return totalVal;
    }

    public void setTotalVal(Integer totalVal) {
        this.totalVal = totalVal;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Throughput throughput = (Throughput) o;
        return Objects.equals(this.frozened, throughput.frozened) && Objects.equals(this.id, throughput.id)
            && Objects.equals(this.totalVal, throughput.totalVal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frozened, id, totalVal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Throughput {\n");
        sb.append("    frozened: ").append(toIndentedString(frozened)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    totalVal: ").append(toIndentedString(totalVal)).append("\n");
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
