package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Flavor
 */
public class Flavor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private String vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private String ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_infos")

    private List<AvailableZone> azInfos = null;

    public Flavor withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规格id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Flavor withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 资源规格编码。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public Flavor withVcpus(String vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * CPU大小。例如：1表示1U。
     * @return vcpus
     */
    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    public Flavor withRam(String ram) {
        this.ram = ram;
        return this;
    }

    /**
     * 内存大小，单位:GB。
     * @return ram
     */
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public Flavor withAzInfos(List<AvailableZone> azInfos) {
        this.azInfos = azInfos;
        return this;
    }

    public Flavor addAzInfosItem(AvailableZone azInfosItem) {
        if (this.azInfos == null) {
            this.azInfos = new ArrayList<>();
        }
        this.azInfos.add(azInfosItem);
        return this;
    }

    public Flavor withAzInfos(Consumer<List<AvailableZone>> azInfosSetter) {
        if (this.azInfos == null) {
            this.azInfos = new ArrayList<>();
        }
        azInfosSetter.accept(this.azInfos);
        return this;
    }

    /**
     * 可用区信息  normal：在售。 unsupported：暂不支持该规格。 sellout：售罄。
     * @return azInfos
     */
    public List<AvailableZone> getAzInfos() {
        return azInfos;
    }

    public void setAzInfos(List<AvailableZone> azInfos) {
        this.azInfos = azInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Flavor that = (Flavor) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.specCode, that.specCode)
            && Objects.equals(this.vcpus, that.vcpus) && Objects.equals(this.ram, that.ram)
            && Objects.equals(this.azInfos, that.azInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, specCode, vcpus, ram, azInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Flavor {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    azInfos: ").append(toIndentedString(azInfos)).append("\n");
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
