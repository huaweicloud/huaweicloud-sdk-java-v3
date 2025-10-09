package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MasterFlavorSpec
 */
public class MasterFlavorSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "azs")

    private List<String> azs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "azFaultDomains")

    private Map<String, List<String>> azFaultDomains = null;

    public MasterFlavorSpec withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 控制节点规格 **取值范围**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MasterFlavorSpec withAzs(List<String> azs) {
        this.azs = azs;
        return this;
    }

    public MasterFlavorSpec addAzsItem(String azsItem) {
        if (this.azs == null) {
            this.azs = new ArrayList<>();
        }
        this.azs.add(azsItem);
        return this;
    }

    public MasterFlavorSpec withAzs(Consumer<List<String>> azsSetter) {
        if (this.azs == null) {
            this.azs = new ArrayList<>();
        }
        azsSetter.accept(this.azs);
        return this;
    }

    /**
     * **参数解释**： 控制节点支持的可用区
     * @return azs
     */
    public List<String> getAzs() {
        return azs;
    }

    public void setAzs(List<String> azs) {
        this.azs = azs;
    }

    public MasterFlavorSpec withAzFaultDomains(Map<String, List<String>> azFaultDomains) {
        this.azFaultDomains = azFaultDomains;
        return this;
    }

    public MasterFlavorSpec putAzFaultDomainsItem(String key, List<String> azFaultDomainsItem) {
        if (this.azFaultDomains == null) {
            this.azFaultDomains = new HashMap<>();
        }
        this.azFaultDomains.put(key, azFaultDomainsItem);
        return this;
    }

    public MasterFlavorSpec withAzFaultDomains(Consumer<Map<String, List<String>>> azFaultDomainsSetter) {
        if (this.azFaultDomains == null) {
            this.azFaultDomains = new HashMap<>();
        }
        azFaultDomainsSetter.accept(this.azFaultDomains);
        return this;
    }

    /**
     * **参数解释**： 控制节点所在可用区支持的故障域
     * @return azFaultDomains
     */
    public Map<String, List<String>> getAzFaultDomains() {
        return azFaultDomains;
    }

    public void setAzFaultDomains(Map<String, List<String>> azFaultDomains) {
        this.azFaultDomains = azFaultDomains;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MasterFlavorSpec that = (MasterFlavorSpec) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.azs, that.azs)
            && Objects.equals(this.azFaultDomains, that.azFaultDomains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, azs, azFaultDomains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MasterFlavorSpec {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    azs: ").append(toIndentedString(azs)).append("\n");
        sb.append("    azFaultDomains: ").append(toIndentedString(azFaultDomains)).append("\n");
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
