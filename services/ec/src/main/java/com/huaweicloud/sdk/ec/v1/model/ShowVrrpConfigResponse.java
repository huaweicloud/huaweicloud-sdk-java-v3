package com.huaweicloud.sdk.ec.v1.model;

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
public class ShowVrrpConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vrrp_configs")

    private List<VrrpConfigItem> vrrpConfigs = null;

    public ShowVrrpConfigResponse withVrrpConfigs(List<VrrpConfigItem> vrrpConfigs) {
        this.vrrpConfigs = vrrpConfigs;
        return this;
    }

    public ShowVrrpConfigResponse addVrrpConfigsItem(VrrpConfigItem vrrpConfigsItem) {
        if (this.vrrpConfigs == null) {
            this.vrrpConfigs = new ArrayList<>();
        }
        this.vrrpConfigs.add(vrrpConfigsItem);
        return this;
    }

    public ShowVrrpConfigResponse withVrrpConfigs(Consumer<List<VrrpConfigItem>> vrrpConfigsSetter) {
        if (this.vrrpConfigs == null) {
            this.vrrpConfigs = new ArrayList<>();
        }
        vrrpConfigsSetter.accept(this.vrrpConfigs);
        return this;
    }

    /**
     * Get vrrpConfigs
     * @return vrrpConfigs
     */
    public List<VrrpConfigItem> getVrrpConfigs() {
        return vrrpConfigs;
    }

    public void setVrrpConfigs(List<VrrpConfigItem> vrrpConfigs) {
        this.vrrpConfigs = vrrpConfigs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVrrpConfigResponse that = (ShowVrrpConfigResponse) obj;
        return Objects.equals(this.vrrpConfigs, that.vrrpConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vrrpConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVrrpConfigResponse {\n");
        sb.append("    vrrpConfigs: ").append(toIndentedString(vrrpConfigs)).append("\n");
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
