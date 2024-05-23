package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdatePasswordlessConfigRequestBody
 */
public class UpdatePasswordlessConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_ips")

    private List<String> configIps = null;

    public UpdatePasswordlessConfigRequestBody withConfigIps(List<String> configIps) {
        this.configIps = configIps;
        return this;
    }

    public UpdatePasswordlessConfigRequestBody addConfigIpsItem(String configIpsItem) {
        if (this.configIps == null) {
            this.configIps = new ArrayList<>();
        }
        this.configIps.add(configIpsItem);
        return this;
    }

    public UpdatePasswordlessConfigRequestBody withConfigIps(Consumer<List<String>> configIpsSetter) {
        if (this.configIps == null) {
            this.configIps = new ArrayList<>();
        }
        configIpsSetter.accept(this.configIps);
        return this;
    }

    /**
     * 要设置的免密配置,ip与网段的列表,空列表表示清空免密配置。
     * @return configIps
     */
    public List<String> getConfigIps() {
        return configIps;
    }

    public void setConfigIps(List<String> configIps) {
        this.configIps = configIps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePasswordlessConfigRequestBody that = (UpdatePasswordlessConfigRequestBody) obj;
        return Objects.equals(this.configIps, that.configIps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configIps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePasswordlessConfigRequestBody {\n");
        sb.append("    configIps: ").append(toIndentedString(configIps)).append("\n");
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
