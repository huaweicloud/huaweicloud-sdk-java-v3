package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CountPublicIpResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elasticip_size")

    private Integer elasticipSize;

    public CountPublicIpResponse withElasticipSize(Integer elasticipSize) {
        this.elasticipSize = elasticipSize;
        return this;
    }

    /**
     * 弹性公网数量
     * @return elasticipSize
     */
    public Integer getElasticipSize() {
        return elasticipSize;
    }

    public void setElasticipSize(Integer elasticipSize) {
        this.elasticipSize = elasticipSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CountPublicIpResponse countPublicIpResponse = (CountPublicIpResponse) o;
        return Objects.equals(this.elasticipSize, countPublicIpResponse.elasticipSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elasticipSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountPublicIpResponse {\n");
        sb.append("    elasticipSize: ").append(toIndentedString(elasticipSize)).append("\n");
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
