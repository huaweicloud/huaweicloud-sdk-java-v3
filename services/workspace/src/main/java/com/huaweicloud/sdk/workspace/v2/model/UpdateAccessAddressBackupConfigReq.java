package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改云办公服务接入地址备份配置请求体。
 */
public class UpdateAccessAddressBackupConfigReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config")

    private List<AccessConfigInfo> accessConfig = null;

    public UpdateAccessAddressBackupConfigReq withAccessConfig(List<AccessConfigInfo> accessConfig) {
        this.accessConfig = accessConfig;
        return this;
    }

    public UpdateAccessAddressBackupConfigReq addAccessConfigItem(AccessConfigInfo accessConfigItem) {
        if (this.accessConfig == null) {
            this.accessConfig = new ArrayList<>();
        }
        this.accessConfig.add(accessConfigItem);
        return this;
    }

    public UpdateAccessAddressBackupConfigReq withAccessConfig(Consumer<List<AccessConfigInfo>> accessConfigSetter) {
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
        UpdateAccessAddressBackupConfigReq that = (UpdateAccessAddressBackupConfigReq) obj;
        return Objects.equals(this.accessConfig, that.accessConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAccessAddressBackupConfigReq {\n");
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
