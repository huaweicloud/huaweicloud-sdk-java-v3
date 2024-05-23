package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPasswordlessConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_ips")

    private List<String> configIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ShowPasswordlessConfigResponse withConfigIps(List<String> configIps) {
        this.configIps = configIps;
        return this;
    }

    public ShowPasswordlessConfigResponse addConfigIpsItem(String configIpsItem) {
        if (this.configIps == null) {
            this.configIps = new ArrayList<>();
        }
        this.configIps.add(configIpsItem);
        return this;
    }

    public ShowPasswordlessConfigResponse withConfigIps(Consumer<List<String>> configIpsSetter) {
        if (this.configIps == null) {
            this.configIps = new ArrayList<>();
        }
        configIpsSetter.accept(this.configIps);
        return this;
    }

    /**
     * 免密配置,IP与网段的列表,仅支持ipv4的IP或网段。
     * @return configIps
     */
    public List<String> getConfigIps() {
        return configIps;
    }

    public void setConfigIps(List<String> configIps) {
        this.configIps = configIps;
    }

    public ShowPasswordlessConfigResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 免密配置的总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPasswordlessConfigResponse that = (ShowPasswordlessConfigResponse) obj;
        return Objects.equals(this.configIps, that.configIps) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configIps, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPasswordlessConfigResponse {\n");
        sb.append("    configIps: ").append(toIndentedString(configIps)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
