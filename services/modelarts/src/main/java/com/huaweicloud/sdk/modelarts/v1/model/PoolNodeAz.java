package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源池中节点的AZ信息。
 */
public class PoolNodeAz {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az")

    private String az;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public PoolNodeAz withAz(String az) {
        this.az = az;
        return this;
    }

    /**
     * **参数解释**：可用区名称。 **取值范围**：不涉及。
     * @return az
     */
    public String getAz() {
        return az;
    }

    public void setAz(String az) {
        this.az = az;
    }

    public PoolNodeAz withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**：可用区资源实例的数量。 **取值范围**：不涉及。
     * minimum: 1
     * maximum: 2000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolNodeAz that = (PoolNodeAz) obj;
        return Objects.equals(this.az, that.az) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(az, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolNodeAz {\n");
        sb.append("    az: ").append(toIndentedString(az)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
