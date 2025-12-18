package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：超时代答超平面信息。
 */
public class ProxyResponseDelimitPlaneList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plane_id")

    private String planeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rate")

    private String rate;

    public ProxyResponseDelimitPlaneList withPlaneId(String planeId) {
        this.planeId = planeId;
        return this;
    }

    /**
     * **参数解释**：超平面。 **取值范围**：不涉及。
     * @return planeId
     */
    public String getPlaneId() {
        return planeId;
    }

    public void setPlaneId(String planeId) {
        this.planeId = planeId;
    }

    public ProxyResponseDelimitPlaneList withRate(String rate) {
        this.rate = rate;
        return this;
    }

    /**
     * **参数解释**：根因概率。 **取值范围**：不涉及。
     * @return rate
     */
    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProxyResponseDelimitPlaneList that = (ProxyResponseDelimitPlaneList) obj;
        return Objects.equals(this.planeId, that.planeId) && Objects.equals(this.rate, that.rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planeId, rate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProxyResponseDelimitPlaneList {\n");
        sb.append("    planeId: ").append(toIndentedString(planeId)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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
