package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResourceDistribution
 */
public class ResourceDistribution {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms")

    private Integer kms;

    public ResourceDistribution withKms(Integer kms) {
        this.kms = kms;
        return this;
    }

    /**
     * 密钥管理服务密钥数量
     * @return kms
     */
    public Integer getKms() {
        return kms;
    }

    public void setKms(Integer kms) {
        this.kms = kms;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceDistribution that = (ResourceDistribution) obj;
        return Objects.equals(this.kms, that.kms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceDistribution {\n");
        sb.append("    kms: ").append(toIndentedString(kms)).append("\n");
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
