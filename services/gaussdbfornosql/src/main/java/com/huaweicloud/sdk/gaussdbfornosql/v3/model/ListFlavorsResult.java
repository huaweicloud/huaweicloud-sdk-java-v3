package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 实例规格信息列表。 */
public class ListFlavorsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private String engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private String vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private String ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_status")

    private Object azStatus;

    public ListFlavorsResult withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /** 引擎名称。
     * 
     * @return engineName */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public ListFlavorsResult withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /** 引擎版本。
     * 
     * @return engineVersion */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public ListFlavorsResult withVcpus(String vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /** CPU核数。
     * 
     * @return vcpus */
    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    public ListFlavorsResult withRam(String ram) {
        this.ram = ram;
        return this;
    }

    /** 内存大小，单位为兆字节。
     * 
     * @return ram */
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public ListFlavorsResult withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /** 资源规格编码。例如：geminidb.cassandra.8xlarge.4 - “geminidb.cassandra”表示云数据库GaussDB NoSQL的Cassandra数据库产品。 -
     * “8xlarge.4”表示节点性能规格。
     * 
     * @return specCode */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public ListFlavorsResult withAzStatus(Object azStatus) {
        this.azStatus = azStatus;
        return this;
    }

    /** 规格在可用区内的状态，包含以下状态： - normal，在售。 - unsupported，暂不支持该规格。 - sellout，售罄。
     * 
     * @return azStatus */
    public Object getAzStatus() {
        return azStatus;
    }

    public void setAzStatus(Object azStatus) {
        this.azStatus = azStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFlavorsResult listFlavorsResult = (ListFlavorsResult) o;
        return Objects.equals(this.engineName, listFlavorsResult.engineName)
            && Objects.equals(this.engineVersion, listFlavorsResult.engineVersion)
            && Objects.equals(this.vcpus, listFlavorsResult.vcpus) && Objects.equals(this.ram, listFlavorsResult.ram)
            && Objects.equals(this.specCode, listFlavorsResult.specCode)
            && Objects.equals(this.azStatus, listFlavorsResult.azStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineName, engineVersion, vcpus, ram, specCode, azStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlavorsResult {\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    azStatus: ").append(toIndentedString(azStatus)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
