package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AntiVirusRuleVO
 */
public class AntiVirusRuleVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_protocol_configs")

    private List<ScanProtocolConfig> scanProtocolConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public AntiVirusRuleVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AntiVirusRuleVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AntiVirusRuleVO withScanProtocolConfigs(List<ScanProtocolConfig> scanProtocolConfigs) {
        this.scanProtocolConfigs = scanProtocolConfigs;
        return this;
    }

    public AntiVirusRuleVO addScanProtocolConfigsItem(ScanProtocolConfig scanProtocolConfigsItem) {
        if (this.scanProtocolConfigs == null) {
            this.scanProtocolConfigs = new ArrayList<>();
        }
        this.scanProtocolConfigs.add(scanProtocolConfigsItem);
        return this;
    }

    public AntiVirusRuleVO withScanProtocolConfigs(Consumer<List<ScanProtocolConfig>> scanProtocolConfigsSetter) {
        if (this.scanProtocolConfigs == null) {
            this.scanProtocolConfigs = new ArrayList<>();
        }
        scanProtocolConfigsSetter.accept(this.scanProtocolConfigs);
        return this;
    }

    /**
     * Get scanProtocolConfigs
     * @return scanProtocolConfigs
     */
    public List<ScanProtocolConfig> getScanProtocolConfigs() {
        return scanProtocolConfigs;
    }

    public void setScanProtocolConfigs(List<ScanProtocolConfig> scanProtocolConfigs) {
        this.scanProtocolConfigs = scanProtocolConfigs;
    }

    public AntiVirusRuleVO withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AntiVirusRuleVO that = (AntiVirusRuleVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.scanProtocolConfigs, that.scanProtocolConfigs)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, scanProtocolConfigs, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AntiVirusRuleVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    scanProtocolConfigs: ").append(toIndentedString(scanProtocolConfigs)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
