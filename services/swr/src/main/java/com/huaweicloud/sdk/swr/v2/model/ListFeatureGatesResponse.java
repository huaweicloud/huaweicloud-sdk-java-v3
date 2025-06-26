package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListFeatureGatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableDomainName")

    private Boolean enableDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableCombinationRetention")

    private Boolean enableCombinationRetention;

    public ListFeatureGatesResponse withEnableDomainName(Boolean enableDomainName) {
        this.enableDomainName = enableDomainName;
        return this;
    }

    /**
     * 是否开启域名管理
     * @return enableDomainName
     */
    public Boolean getEnableDomainName() {
        return enableDomainName;
    }

    public void setEnableDomainName(Boolean enableDomainName) {
        this.enableDomainName = enableDomainName;
    }

    public ListFeatureGatesResponse withEnableCombinationRetention(Boolean enableCombinationRetention) {
        this.enableCombinationRetention = enableCombinationRetention;
        return this;
    }

    /**
     * 老化策略是否支持多条规则
     * @return enableCombinationRetention
     */
    public Boolean getEnableCombinationRetention() {
        return enableCombinationRetention;
    }

    public void setEnableCombinationRetention(Boolean enableCombinationRetention) {
        this.enableCombinationRetention = enableCombinationRetention;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFeatureGatesResponse that = (ListFeatureGatesResponse) obj;
        return Objects.equals(this.enableDomainName, that.enableDomainName)
            && Objects.equals(this.enableCombinationRetention, that.enableCombinationRetention);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableDomainName, enableCombinationRetention);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFeatureGatesResponse {\n");
        sb.append("    enableDomainName: ").append(toIndentedString(enableDomainName)).append("\n");
        sb.append("    enableCombinationRetention: ").append(toIndentedString(enableCombinationRetention)).append("\n");
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
