package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 是否支持云连接能力。
 */
public class CloudConnectionIsSupportCapabilityValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support")

    private Boolean isSupport;

    public CloudConnectionIsSupportCapabilityValue withIsSupport(Boolean isSupport) {
        this.isSupport = isSupport;
        return this;
    }

    /**
     * 是否支持云连接能力。
     * @return isSupport
     */
    public Boolean getIsSupport() {
        return isSupport;
    }

    public void setIsSupport(Boolean isSupport) {
        this.isSupport = isSupport;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudConnectionIsSupportCapabilityValue that = (CloudConnectionIsSupportCapabilityValue) obj;
        return Objects.equals(this.isSupport, that.isSupport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSupport);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudConnectionIsSupportCapabilityValue {\n");
        sb.append("    isSupport: ").append(toIndentedString(isSupport)).append("\n");
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
