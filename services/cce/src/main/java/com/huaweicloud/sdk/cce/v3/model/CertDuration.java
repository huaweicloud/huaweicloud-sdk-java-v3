package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群证书有效期
 */
public class CertDuration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    public CertDuration withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 集群证书有效时间，单位为天，最小值为1，最大值为1825(5*365，1年固定计365天，忽略闰年影响)；若填-1则为最大值5年。 
     * minimum: 1
     * maximum: 1825
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CertDuration that = (CertDuration) obj;
        return Objects.equals(this.duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertDuration {\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
