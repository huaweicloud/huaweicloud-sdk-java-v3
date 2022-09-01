package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 规格信息。
 */
public class Flavor  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vcpus")
    
    @JacksonXmlProperty(localName = "vcpus")
    
    private String vcpus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ram")
    
    @JacksonXmlProperty(localName = "ram")
    
    private String ram;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec_code")
    
    @JacksonXmlProperty(localName = "spec_code")
    
    private String specCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone")
    
    @JacksonXmlProperty(localName = "availability_zone")
    
    private List<String> availabilityZone = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az_status")
    
    @JacksonXmlProperty(localName = "az_status")
    
    private Map<String, String> azStatus = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    @JacksonXmlProperty(localName = "version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    @JacksonXmlProperty(localName = "name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_type")
    
    @JacksonXmlProperty(localName = "group_type")
    
    private String groupType;

    public Flavor withVcpus(String vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    


    /**
     * CPU个数。
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
     * 内存大小，单位为GB。
     * @return ram
     */
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

    


    /**
     * 资源规格编码。例如：gaussdb.opengauss.ee.dn.m6.4xlarge.8.in。
     * @return specCode
     */
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
        if(this.availabilityZone == null) {
            this.availabilityZone = new ArrayList<>();
        }
        this.availabilityZone.add(availabilityZoneItem);
        return this;
    }

    public Flavor withAvailabilityZone(Consumer<List<String>> availabilityZoneSetter) {
        if(this.availabilityZone == null) {
            this.availabilityZone = new ArrayList<>();
        }
        availabilityZoneSetter.accept(this.availabilityZone);
        return this;
    }

    /**
     * 可用az
     * @return availabilityZone
     */
    public List<String> getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(List<String> availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    

    public Flavor withAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
        return this;
    }

    

    public Flavor putAzStatusItem(String key, String azStatusItem) {
        if(this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        this.azStatus.put(key, azStatusItem);
        return this;
    }

    public Flavor withAzStatus(Consumer<Map<String, String>> azStatusSetter) {
        if(this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        azStatusSetter.accept(this.azStatus);
        return this;
    }
    /**
     * 其中key是可用区编号，value是规格所在az的状态，包含以下状态： - normal，在售。 - unsupported，暂不支持该规格。 - sellout，售罄。
     * @return azStatus
     */
    public Map<String, String> getAzStatus() {
        return azStatus;
    }

    public void setAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
    }

    

    public Flavor withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 该规格支持的数据库版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public Flavor withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 数组库引擎名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Flavor withGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    


    /**
     * 性能规格，包含以下状态： - normal：通用增强型。 - normal2：通用增强Ⅱ型。 - armFlavors：鲲鹏通用增强型。 - dedicicatenormal ：x86独享型。 - armlocalssd：鲲鹏通用型。 - normallocalssd：x86通用型。 - general：通用型。 - dedicated：独享型，仅云盘SSD支持。 - rapid：独享型，仅极速型SSD支持。
     * @return groupType
     */
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
        return Objects.equals(this.vcpus, flavor.vcpus) &&
            Objects.equals(this.ram, flavor.ram) &&
            Objects.equals(this.specCode, flavor.specCode) &&
            Objects.equals(this.availabilityZone, flavor.availabilityZone) &&
            Objects.equals(this.azStatus, flavor.azStatus) &&
            Objects.equals(this.version, flavor.version) &&
            Objects.equals(this.name, flavor.name) &&
            Objects.equals(this.groupType, flavor.groupType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(vcpus, ram, specCode, availabilityZone, azStatus, version, name, groupType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Flavor {\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    azStatus: ").append(toIndentedString(azStatus)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
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

