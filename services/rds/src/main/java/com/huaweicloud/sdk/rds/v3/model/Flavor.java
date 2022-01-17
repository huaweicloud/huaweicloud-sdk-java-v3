package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 规格信息。 */
public class Flavor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private String vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private Integer ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_mode")

    private String instanceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_status")

    private Map<String, String> azStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_desc")

    private Map<String, String> azDesc = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_name")

    private List<String> versionName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_type")

    private String groupType;

    public Flavor withId(String id) {
        this.id = id;
        return this;
    }

    /** 规格id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Flavor withVcpus(String vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /** CPU个数。
     * 
     * @return vcpus */
    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    public Flavor withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    /** 内存大小，单位为GB。
     * 
     * @return ram */
    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Flavor withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /** 资源规格编码。例如：rds.mysql.m1.xlarge.rr。 其中形如“xxx.xxx.mcs.i3.xxx.xxx.xxx”是超高性能型（尊享版），需要申请一定权限才可使用，更多规格说明请参考数据库实例规格。 -
     * “rds”代表RDS产品。 - “mysql”代表数据库引擎。 - “m1.xlarge”代表性能规格，为高内存类型。
     * 
     * @return specCode */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public Flavor withInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
        return this;
    }

    /** 实例模型，包括如下类型： - ha，主备实例。 - replica，只读实例。 - single，单实例。
     * 
     * @return instanceMode */
    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
    }

    public Flavor withAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
        return this;
    }

    public Flavor putAzStatusItem(String key, String azStatusItem) {
        if (this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        this.azStatus.put(key, azStatusItem);
        return this;
    }

    public Flavor withAzStatus(Consumer<Map<String, String>> azStatusSetter) {
        if (this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        azStatusSetter.accept(this.azStatus);
        return this;
    }

    /** 其中key是可用区编号，value是规格所在az的状态，包含以下状态： - normal，在售。 - unsupported，暂不支持该规格。 - sellout，售罄。
     * 
     * @return azStatus */
    public Map<String, String> getAzStatus() {
        return azStatus;
    }

    public void setAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
    }

    public Flavor withAzDesc(Map<String, String> azDesc) {
        this.azDesc = azDesc;
        return this;
    }

    public Flavor putAzDescItem(String key, String azDescItem) {
        if (this.azDesc == null) {
            this.azDesc = new HashMap<>();
        }
        this.azDesc.put(key, azDescItem);
        return this;
    }

    public Flavor withAzDesc(Consumer<Map<String, String>> azDescSetter) {
        if (this.azDesc == null) {
            this.azDesc = new HashMap<>();
        }
        azDescSetter.accept(this.azDesc);
        return this;
    }

    /** 规格所在az的描述。
     * 
     * @return azDesc */
    public Map<String, String> getAzDesc() {
        return azDesc;
    }

    public void setAzDesc(Map<String, String> azDesc) {
        this.azDesc = azDesc;
    }

    public Flavor withVersionName(List<String> versionName) {
        this.versionName = versionName;
        return this;
    }

    public Flavor addVersionNameItem(String versionNameItem) {
        if (this.versionName == null) {
            this.versionName = new ArrayList<>();
        }
        this.versionName.add(versionNameItem);
        return this;
    }

    public Flavor withVersionName(Consumer<List<String>> versionNameSetter) {
        if (this.versionName == null) {
            this.versionName = new ArrayList<>();
        }
        versionNameSetter.accept(this.versionName);
        return this;
    }

    /** 数组形式版本号
     * 
     * @return versionName */
    public List<String> getVersionName() {
        return versionName;
    }

    public void setVersionName(List<String> versionName) {
        this.versionName = versionName;
    }

    public Flavor withGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    /** 性能规格，包含以下状态： - normal：通用增强型。 - normal2：通用增强Ⅱ型。 - armFlavors：鲲鹏通用增强型。 - dedicicatenormal ：x86独享型。 -
     * armlocalssd：鲲鹏通用型。 - normallocalssd：x86通用型。 - general：通用型。 - dedicated：独享型，仅云盘SSD支持。 - rapid：独享型，仅极速型SSD支持。 -
     * bigmen：超大内存型。
     * 
     * @return groupType */
    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
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
        return Objects.equals(this.id, flavor.id) && Objects.equals(this.vcpus, flavor.vcpus)
            && Objects.equals(this.ram, flavor.ram) && Objects.equals(this.specCode, flavor.specCode)
            && Objects.equals(this.instanceMode, flavor.instanceMode) && Objects.equals(this.azStatus, flavor.azStatus)
            && Objects.equals(this.azDesc, flavor.azDesc) && Objects.equals(this.versionName, flavor.versionName)
            && Objects.equals(this.groupType, flavor.groupType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vcpus, ram, specCode, instanceMode, azStatus, azDesc, versionName, groupType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Flavor {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    instanceMode: ").append(toIndentedString(instanceMode)).append("\n");
        sb.append("    azStatus: ").append(toIndentedString(azStatus)).append("\n");
        sb.append("    azDesc: ").append(toIndentedString(azDesc)).append("\n");
        sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
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
