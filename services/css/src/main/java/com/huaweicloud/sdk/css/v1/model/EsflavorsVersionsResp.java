package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 引擎列表。
 */
public class EsflavorsVersionsResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavors")

    private List<EsflavorsVersionsFlavorsResp> flavors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public EsflavorsVersionsResp withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Esasticsearch引擎版本号。详细请参考CSS[支持的集群版本](css_03_0056.xml)。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public EsflavorsVersionsResp withFlavors(List<EsflavorsVersionsFlavorsResp> flavors) {
        this.flavors = flavors;
        return this;
    }

    public EsflavorsVersionsResp addFlavorsItem(EsflavorsVersionsFlavorsResp flavorsItem) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavorsItem);
        return this;
    }

    public EsflavorsVersionsResp withFlavors(Consumer<List<EsflavorsVersionsFlavorsResp>> flavorsSetter) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        flavorsSetter.accept(this.flavors);
        return this;
    }

    /**
     * 规格列表。
     * @return flavors
     */
    public List<EsflavorsVersionsFlavorsResp> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<EsflavorsVersionsFlavorsResp> flavors) {
        this.flavors = flavors;
    }

    public EsflavorsVersionsResp withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 实例类型，包括为ess、ess-cold、ess-master和ess-client。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EsflavorsVersionsResp esflavorsVersionsResp = (EsflavorsVersionsResp) o;
        return Objects.equals(this.version, esflavorsVersionsResp.version)
            && Objects.equals(this.flavors, esflavorsVersionsResp.flavors)
            && Objects.equals(this.type, esflavorsVersionsResp.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, flavors, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EsflavorsVersionsResp {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
