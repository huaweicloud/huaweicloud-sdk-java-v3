package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HtapFlavorInfoFlavors
 */
public class HtapFlavorInfoFlavors {

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
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_name")

    private String versionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_mode")

    private String instanceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_status")

    private Map<String, String> azStatus = null;

    public HtapFlavorInfoFlavors withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 规格类型，取值为arm、x86和generalX86。  arm：独享型arm规格。  x86：独享型x86规格。  generalX86：通用型X86规格。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HtapFlavorInfoFlavors withVcpus(String vcpus) {
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

    public HtapFlavorInfoFlavors withRam(String ram) {
        this.ram = ram;
        return this;
    }

    /**
     * 内存大小，单位为GB。
     * @return ram
     */
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public HtapFlavorInfoFlavors withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规格ID，该字段唯一。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HtapFlavorInfoFlavors withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 资源规格编码，.同创建指定的flavor_ref。例如：gaussdb.sr-be.xlarge.x86.4。  “gaussdb.sr”代表产品。  “xlarge” 代表计算规格为4U。  “x86” 代表CPU架构为x86。  “4” 表示vCPU和内存为1:4。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public HtapFlavorInfoFlavors withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * 数据库版本号。
     * @return versionName
     */
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public HtapFlavorInfoFlavors withInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
        return this;
    }

    /**
     * 实例类型。目前仅支持Cluster、Single。
     * @return instanceMode
     */
    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
    }

    public HtapFlavorInfoFlavors withAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
        return this;
    }

    public HtapFlavorInfoFlavors putAzStatusItem(String key, String azStatusItem) {
        if (this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        this.azStatus.put(key, azStatusItem);
        return this;
    }

    public HtapFlavorInfoFlavors withAzStatus(Consumer<Map<String, String>> azStatusSetter) {
        if (this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        azStatusSetter.accept(this.azStatus);
        return this;
    }

    /**
     * 规格所在AZ的状态，包含以下状态：  normal：在售。  unsupported：暂不支持该规格。  sellout：售罄。
     * @return azStatus
     */
    public Map<String, String> getAzStatus() {
        return azStatus;
    }

    public void setAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HtapFlavorInfoFlavors that = (HtapFlavorInfoFlavors) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.vcpus, that.vcpus)
            && Objects.equals(this.ram, that.ram) && Objects.equals(this.id, that.id)
            && Objects.equals(this.specCode, that.specCode) && Objects.equals(this.versionName, that.versionName)
            && Objects.equals(this.instanceMode, that.instanceMode) && Objects.equals(this.azStatus, that.azStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, vcpus, ram, id, specCode, versionName, instanceMode, azStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HtapFlavorInfoFlavors {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
        sb.append("    instanceMode: ").append(toIndentedString(instanceMode)).append("\n");
        sb.append("    azStatus: ").append(toIndentedString(azStatus)).append("\n");
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
