package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class Iops {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozened")

    private Boolean frozened;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_val")

    private Integer totalVal;

    public Iops withFrozened(Boolean frozened) {
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

    public Iops withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 云硬盘iops标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Iops withTotalVal(Integer totalVal) {
        this.totalVal = totalVal;
        return this;
    }

    /**
     * iops大小。
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
        Iops iops = (Iops) o;
        return Objects.equals(this.frozened, iops.frozened) && Objects.equals(this.id, iops.id)
            && Objects.equals(this.totalVal, iops.totalVal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frozened, id, totalVal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Iops {\n");
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
