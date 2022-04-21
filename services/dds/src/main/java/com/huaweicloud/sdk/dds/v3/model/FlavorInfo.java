package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 规格信息。
 */
public class FlavorInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private String engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_versions")

    private List<String> engineVersions = null;

    public FlavorInfo withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * 引擎名称。
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public FlavorInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 节点类型。文档数据库包含以下几种节点类型： - mongos - shard - config - replica - single
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FlavorInfo withVcpus(String vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * CPU核数。
     * @return vcpus
     */
    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    public FlavorInfo withRam(String ram) {
        this.ram = ram;
        return this;
    }

    /**
     * 内存大小，单位为兆字节。
     * @return ram
     */
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public FlavorInfo withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 资源规格编码。例如：dds.c3.xlarge.2.shard。  - “dds”表示文档数据库服务产品。 - “c3.xlarge.2”表示节点性能规格，为高内存类型。 - “shard”表示节点类型。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public FlavorInfo withAzStatus(Object azStatus) {
        this.azStatus = azStatus;
        return this;
    }

    /**
     * '支持该规格的可用区ID。' 示例：[\"cn-east-2a\",\"cn-east-2b\",\"cn-east-2c\"]。
     * @return azStatus
     */
    public Object getAzStatus() {
        return azStatus;
    }

    public void setAzStatus(Object azStatus) {
        this.azStatus = azStatus;
    }

    public FlavorInfo withEngineVersions(List<String> engineVersions) {
        this.engineVersions = engineVersions;
        return this;
    }

    public FlavorInfo addEngineVersionsItem(String engineVersionsItem) {
        if (this.engineVersions == null) {
            this.engineVersions = new ArrayList<>();
        }
        this.engineVersions.add(engineVersionsItem);
        return this;
    }

    public FlavorInfo withEngineVersions(Consumer<List<String>> engineVersionsSetter) {
        if (this.engineVersions == null) {
            this.engineVersions = new ArrayList<>();
        }
        engineVersionsSetter.accept(this.engineVersions);
        return this;
    }

    /**
     * 数据库版本号列表。针对DDS引擎的mongos节点，例如：{\"3.4\", \"4.0\"}
     * @return engineVersions
     */
    public List<String> getEngineVersions() {
        return engineVersions;
    }

    public void setEngineVersions(List<String> engineVersions) {
        this.engineVersions = engineVersions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlavorInfo flavorInfo = (FlavorInfo) o;
        return Objects.equals(this.engineName, flavorInfo.engineName) && Objects.equals(this.type, flavorInfo.type)
            && Objects.equals(this.vcpus, flavorInfo.vcpus) && Objects.equals(this.ram, flavorInfo.ram)
            && Objects.equals(this.specCode, flavorInfo.specCode) && Objects.equals(this.azStatus, flavorInfo.azStatus)
            && Objects.equals(this.engineVersions, flavorInfo.engineVersions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineName, type, vcpus, ram, specCode, azStatus, engineVersions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorInfo {\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    azStatus: ").append(toIndentedString(azStatus)).append("\n");
        sb.append("    engineVersions: ").append(toIndentedString(engineVersions)).append("\n");
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
