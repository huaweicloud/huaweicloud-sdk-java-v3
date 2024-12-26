package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AntiVirusRuleDto
 */
public class AntiVirusRuleDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_protocol_configs")

    private List<ScanProtocolConfig> scanProtocolConfigs = null;

    public AntiVirusRuleDto withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 防护对象ID
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public AntiVirusRuleDto withScanProtocolConfigs(List<ScanProtocolConfig> scanProtocolConfigs) {
        this.scanProtocolConfigs = scanProtocolConfigs;
        return this;
    }

    public AntiVirusRuleDto addScanProtocolConfigsItem(ScanProtocolConfig scanProtocolConfigsItem) {
        if (this.scanProtocolConfigs == null) {
            this.scanProtocolConfigs = new ArrayList<>();
        }
        this.scanProtocolConfigs.add(scanProtocolConfigsItem);
        return this;
    }

    public AntiVirusRuleDto withScanProtocolConfigs(Consumer<List<ScanProtocolConfig>> scanProtocolConfigsSetter) {
        if (this.scanProtocolConfigs == null) {
            this.scanProtocolConfigs = new ArrayList<>();
        }
        scanProtocolConfigsSetter.accept(this.scanProtocolConfigs);
        return this;
    }

    /**
     * 扫描协议配置
     * @return scanProtocolConfigs
     */
    public List<ScanProtocolConfig> getScanProtocolConfigs() {
        return scanProtocolConfigs;
    }

    public void setScanProtocolConfigs(List<ScanProtocolConfig> scanProtocolConfigs) {
        this.scanProtocolConfigs = scanProtocolConfigs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AntiVirusRuleDto that = (AntiVirusRuleDto) obj;
        return Objects.equals(this.objectId, that.objectId)
            && Objects.equals(this.scanProtocolConfigs, that.scanProtocolConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, scanProtocolConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AntiVirusRuleDto {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    scanProtocolConfigs: ").append(toIndentedString(scanProtocolConfigs)).append("\n");
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
