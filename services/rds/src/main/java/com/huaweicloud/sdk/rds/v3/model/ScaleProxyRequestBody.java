package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ScaleProxyRequestBody */
public class ScaleProxyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private Boolean delay;

    public ScaleProxyRequestBody withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /** 需要变更的新规格ID。
     * 
     * @return flavorRef */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public ScaleProxyRequestBody withDelay(Boolean delay) {
        this.delay = delay;
        return this;
    }

    /** 是否延迟变更。 - true：延迟变更，将在运维时间窗内自动变更。 - false：立即变更。
     * 
     * @return delay */
    public Boolean getDelay() {
        return delay;
    }

    public void setDelay(Boolean delay) {
        this.delay = delay;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScaleProxyRequestBody scaleProxyRequestBody = (ScaleProxyRequestBody) o;
        return Objects.equals(this.flavorRef, scaleProxyRequestBody.flavorRef)
            && Objects.equals(this.delay, scaleProxyRequestBody.delay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorRef, delay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScaleProxyRequestBody {\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
