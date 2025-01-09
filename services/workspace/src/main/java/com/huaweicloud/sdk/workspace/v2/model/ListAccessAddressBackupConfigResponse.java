package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListAccessAddressBackupConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config")

    private List<AccessConfigInfo> accessConfig = null;

    public ListAccessAddressBackupConfigResponse withAccessConfig(List<AccessConfigInfo> accessConfig) {
        this.accessConfig = accessConfig;
        return this;
    }

    public ListAccessAddressBackupConfigResponse addAccessConfigItem(AccessConfigInfo accessConfigItem) {
        if (this.accessConfig == null) {
            this.accessConfig = new ArrayList<>();
        }
        this.accessConfig.add(accessConfigItem);
        return this;
    }

    public ListAccessAddressBackupConfigResponse withAccessConfig(Consumer<List<AccessConfigInfo>> accessConfigSetter) {
        if (this.accessConfig == null) {
            this.accessConfig = new ArrayList<>();
        }
        accessConfigSetter.accept(this.accessConfig);
        return this;
    }

    /**
     * 接入配置列表信息。
     * @return accessConfig
     */
    public List<AccessConfigInfo> getAccessConfig() {
        return accessConfig;
    }

    public void setAccessConfig(List<AccessConfigInfo> accessConfig) {
        this.accessConfig = accessConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAccessAddressBackupConfigResponse that = (ListAccessAddressBackupConfigResponse) obj;
        return Objects.equals(this.accessConfig, that.accessConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccessAddressBackupConfigResponse {\n");
        sb.append("    accessConfig: ").append(toIndentedString(accessConfig)).append("\n");
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
