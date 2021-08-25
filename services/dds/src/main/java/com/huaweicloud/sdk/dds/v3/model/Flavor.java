package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 规格信息。 */
public class Flavor {

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
    @JsonProperty(value = "availability_zone")

    private List<String> availabilityZone = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_status")

    private Object azStatus;

    public Flavor withEngineName(String engineName) {
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

    public Flavor withType(String type) {
        this.type = type;
        return this;
    }

    /** 节点类型。文档数据库包含以下几种节点类型： - mongos - shard - config - replica - single
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Flavor withVcpus(String vcpus) {
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

    public Flavor withRam(String ram) {
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

    public Flavor withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /** 资源规格编码。例如：dds.c3.xlarge.2.shard。 - “dds”表示文档数据库服务产品。 - “c3.xlarge.2”表示节点性能规格，为高内存类型。 - “shard”表示节点类型。
     * 
     * @return specCode */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public Flavor withAvailabilityZone(List<String> availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public Flavor addAvailabilityZoneItem(String availabilityZoneItem) {
        if (this.availabilityZone == null) {
            this.availabilityZone = new ArrayList<>();
        }
        this.availabilityZone.add(availabilityZoneItem);
        return this;
    }

    public Flavor withAvailabilityZone(Consumer<List<String>> availabilityZoneSetter) {
        if (this.availabilityZone == null) {
            this.availabilityZone = new ArrayList<>();
        }
        availabilityZoneSetter.accept(this.availabilityZone);
        return this;
    }

    /** 支持该规格的可用区ID。
     * 
     * @return availabilityZone */
    public List<String> getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(List<String> availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public Flavor withAzStatus(Object azStatus) {
        this.azStatus = azStatus;
        return this;
    }

    /** '支持该规格的可用区ID。' 示例：[\"cn-east-2a\",\"cn-east-2b\",\"cn-east-2c\"]。
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
        Flavor flavor = (Flavor) o;
        return Objects.equals(this.engineName, flavor.engineName) && Objects.equals(this.type, flavor.type)
            && Objects.equals(this.vcpus, flavor.vcpus) && Objects.equals(this.ram, flavor.ram)
            && Objects.equals(this.specCode, flavor.specCode)
            && Objects.equals(this.availabilityZone, flavor.availabilityZone)
            && Objects.equals(this.azStatus, flavor.azStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineName, type, vcpus, ram, specCode, availabilityZone, azStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Flavor {\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
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
