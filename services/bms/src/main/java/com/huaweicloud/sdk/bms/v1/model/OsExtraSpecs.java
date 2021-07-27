package com.huaweicloud.sdk.bms.v1.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * os_extra_specs数据结构说明
 */
public class OsExtraSpecs  {

    /**
     * 识该规格对应的资源类型，取值范围为“ironic”。
     */
    public static final class ResourceTypeEnum {

        
        /**
         * Enum IRONIC for value: "ironic"
         */
        public static final ResourceTypeEnum IRONIC = new ResourceTypeEnum("ironic");
        

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("ironic", IRONIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ResourceTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResourceTypeEnum(value);
            }
            return result;
        }

        public static ResourceTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type")
    
    private ResourceTypeEnum resourceType;
    /**
     * 裸金属服务器的CPU架构类型，取值为：x86_64（适用于x86机型）aarch64（适用于ARM机型）
     */
    public static final class CapabilitiesCpuArchEnum {

        
        /**
         * Enum X86_64 for value: "x86_64"
         */
        public static final CapabilitiesCpuArchEnum X86_64 = new CapabilitiesCpuArchEnum("x86_64");
        
        /**
         * Enum AARCH64 for value: "aarch64"
         */
        public static final CapabilitiesCpuArchEnum AARCH64 = new CapabilitiesCpuArchEnum("aarch64");
        

        private static final Map<String, CapabilitiesCpuArchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CapabilitiesCpuArchEnum> createStaticFields() {
            Map<String, CapabilitiesCpuArchEnum> map = new HashMap<>();
            map.put("x86_64", X86_64);
            map.put("aarch64", AARCH64);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CapabilitiesCpuArchEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CapabilitiesCpuArchEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            CapabilitiesCpuArchEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CapabilitiesCpuArchEnum(value);
            }
            return result;
        }

        public static CapabilitiesCpuArchEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            CapabilitiesCpuArchEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CapabilitiesCpuArchEnum) {
                return this.value.equals(((CapabilitiesCpuArchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="capabilities:cpu_arch")
    
    private CapabilitiesCpuArchEnum capabilitiesCpuArch;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="baremetal:disk_detail")
    
    private String baremetalDiskDetail;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="capabilities:hypervisor_type")
    
    private String capabilitiesHypervisorType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="baremetal:__support_evs")
    
    private String baremetalSupportEvs;
    /**
     * 裸金属服务器启动源。LocalDisk：本地盘Volume：云硬盘（快速发放）
     */
    public static final class BaremetalExtBootTypeEnum {

        
        /**
         * Enum LOCALDISK for value: "LocalDisk"
         */
        public static final BaremetalExtBootTypeEnum LOCALDISK = new BaremetalExtBootTypeEnum("LocalDisk");
        
        /**
         * Enum VOLUME for value: "Volume"
         */
        public static final BaremetalExtBootTypeEnum VOLUME = new BaremetalExtBootTypeEnum("Volume");
        

        private static final Map<String, BaremetalExtBootTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BaremetalExtBootTypeEnum> createStaticFields() {
            Map<String, BaremetalExtBootTypeEnum> map = new HashMap<>();
            map.put("LocalDisk", LOCALDISK);
            map.put("Volume", VOLUME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BaremetalExtBootTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BaremetalExtBootTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            BaremetalExtBootTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BaremetalExtBootTypeEnum(value);
            }
            return result;
        }

        public static BaremetalExtBootTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            BaremetalExtBootTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BaremetalExtBootTypeEnum) {
                return this.value.equals(((BaremetalExtBootTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="baremetal:extBootType")
    
    private BaremetalExtBootTypeEnum baremetalExtBootType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="capabilities:board_type")
    
    private String capabilitiesBoardType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="baremetal:net_num")
    
    private String baremetalNetNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="baremetal:netcard_detail")
    
    private String baremetalNetcardDetail;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="baremetal:cpu_detail")
    
    private String baremetalCpuDetail;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="baremetal:memory_detail")
    
    private String baremetalMemoryDetail;
    /**
     * 裸金属服务器规格状态。不配置时等同于normal。normal：正常商用abandon：下线（即不显示）sellout：售罄obt：公测promotion：推荐（等同normal，也是商用）
     */
    public static final class CondOperationStatusEnum {

        
        /**
         * Enum NORMAL for value: "normal"
         */
        public static final CondOperationStatusEnum NORMAL = new CondOperationStatusEnum("normal");
        
        /**
         * Enum ABANDON for value: "abandon"
         */
        public static final CondOperationStatusEnum ABANDON = new CondOperationStatusEnum("abandon");
        
        /**
         * Enum SELLOUT for value: "sellout"
         */
        public static final CondOperationStatusEnum SELLOUT = new CondOperationStatusEnum("sellout");
        
        /**
         * Enum OBT for value: "obt"
         */
        public static final CondOperationStatusEnum OBT = new CondOperationStatusEnum("obt");
        
        /**
         * Enum PROMOTION for value: "promotion"
         */
        public static final CondOperationStatusEnum PROMOTION = new CondOperationStatusEnum("promotion");
        

        private static final Map<String, CondOperationStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CondOperationStatusEnum> createStaticFields() {
            Map<String, CondOperationStatusEnum> map = new HashMap<>();
            map.put("normal", NORMAL);
            map.put("abandon", ABANDON);
            map.put("sellout", SELLOUT);
            map.put("obt", OBT);
            map.put("promotion", PROMOTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CondOperationStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CondOperationStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            CondOperationStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CondOperationStatusEnum(value);
            }
            return result;
        }

        public static CondOperationStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            CondOperationStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CondOperationStatusEnum) {
                return this.value.equals(((CondOperationStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cond:operation:status")
    
    private CondOperationStatusEnum condOperationStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cond:operation:az")
    
    private String condOperationAz;

    public OsExtraSpecs withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * 识该规格对应的资源类型，取值范围为“ironic”。
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    

    public OsExtraSpecs withCapabilitiesCpuArch(CapabilitiesCpuArchEnum capabilitiesCpuArch) {
        this.capabilitiesCpuArch = capabilitiesCpuArch;
        return this;
    }

    


    /**
     * 裸金属服务器的CPU架构类型，取值为：x86_64（适用于x86机型）aarch64（适用于ARM机型）
     * @return capabilitiesCpuArch
     */
    public CapabilitiesCpuArchEnum getCapabilitiesCpuArch() {
        return capabilitiesCpuArch;
    }

    public void setCapabilitiesCpuArch(CapabilitiesCpuArchEnum capabilitiesCpuArch) {
        this.capabilitiesCpuArch = capabilitiesCpuArch;
    }

    

    public OsExtraSpecs withBaremetalDiskDetail(String baremetalDiskDetail) {
        this.baremetalDiskDetail = baremetalDiskDetail;
        return this;
    }

    


    /**
     * 磁盘物理规格描述信息。
     * @return baremetalDiskDetail
     */
    public String getBaremetalDiskDetail() {
        return baremetalDiskDetail;
    }

    public void setBaremetalDiskDetail(String baremetalDiskDetail) {
        this.baremetalDiskDetail = baremetalDiskDetail;
    }

    

    public OsExtraSpecs withCapabilitiesHypervisorType(String capabilitiesHypervisorType) {
        this.capabilitiesHypervisorType = capabilitiesHypervisorType;
        return this;
    }

    


    /**
     * 标示ironic类型的规格。
     * @return capabilitiesHypervisorType
     */
    public String getCapabilitiesHypervisorType() {
        return capabilitiesHypervisorType;
    }

    public void setCapabilitiesHypervisorType(String capabilitiesHypervisorType) {
        this.capabilitiesHypervisorType = capabilitiesHypervisorType;
    }

    

    public OsExtraSpecs withBaremetalSupportEvs(String baremetalSupportEvs) {
        this.baremetalSupportEvs = baremetalSupportEvs;
        return this;
    }

    


    /**
     * 标识当前的规格是否支持挂载EVS卷。truefalse
     * @return baremetalSupportEvs
     */
    public String getBaremetalSupportEvs() {
        return baremetalSupportEvs;
    }

    public void setBaremetalSupportEvs(String baremetalSupportEvs) {
        this.baremetalSupportEvs = baremetalSupportEvs;
    }

    

    public OsExtraSpecs withBaremetalExtBootType(BaremetalExtBootTypeEnum baremetalExtBootType) {
        this.baremetalExtBootType = baremetalExtBootType;
        return this;
    }

    


    /**
     * 裸金属服务器启动源。LocalDisk：本地盘Volume：云硬盘（快速发放）
     * @return baremetalExtBootType
     */
    public BaremetalExtBootTypeEnum getBaremetalExtBootType() {
        return baremetalExtBootType;
    }

    public void setBaremetalExtBootType(BaremetalExtBootTypeEnum baremetalExtBootType) {
        this.baremetalExtBootType = baremetalExtBootType;
    }

    

    public OsExtraSpecs withCapabilitiesBoardType(String capabilitiesBoardType) {
        this.capabilitiesBoardType = capabilitiesBoardType;
        return this;
    }

    


    /**
     * 裸金属服务器的规格类型。格式为规格的缩写，例如规格名称为“physical.o2.medium”，则规格类型为“o2m”。
     * @return capabilitiesBoardType
     */
    public String getCapabilitiesBoardType() {
        return capabilitiesBoardType;
    }

    public void setCapabilitiesBoardType(String capabilitiesBoardType) {
        this.capabilitiesBoardType = capabilitiesBoardType;
    }

    

    public OsExtraSpecs withBaremetalNetNum(String baremetalNetNum) {
        this.baremetalNetNum = baremetalNetNum;
        return this;
    }

    


    /**
     * 实际可挂载网络数量。
     * @return baremetalNetNum
     */
    public String getBaremetalNetNum() {
        return baremetalNetNum;
    }

    public void setBaremetalNetNum(String baremetalNetNum) {
        this.baremetalNetNum = baremetalNetNum;
    }

    

    public OsExtraSpecs withBaremetalNetcardDetail(String baremetalNetcardDetail) {
        this.baremetalNetcardDetail = baremetalNetcardDetail;
        return this;
    }

    


    /**
     * 网卡物理规格描述信息。
     * @return baremetalNetcardDetail
     */
    public String getBaremetalNetcardDetail() {
        return baremetalNetcardDetail;
    }

    public void setBaremetalNetcardDetail(String baremetalNetcardDetail) {
        this.baremetalNetcardDetail = baremetalNetcardDetail;
    }

    

    public OsExtraSpecs withBaremetalCpuDetail(String baremetalCpuDetail) {
        this.baremetalCpuDetail = baremetalCpuDetail;
        return this;
    }

    


    /**
     * CPU物理规格描述信息。
     * @return baremetalCpuDetail
     */
    public String getBaremetalCpuDetail() {
        return baremetalCpuDetail;
    }

    public void setBaremetalCpuDetail(String baremetalCpuDetail) {
        this.baremetalCpuDetail = baremetalCpuDetail;
    }

    

    public OsExtraSpecs withBaremetalMemoryDetail(String baremetalMemoryDetail) {
        this.baremetalMemoryDetail = baremetalMemoryDetail;
        return this;
    }

    


    /**
     * 内存物理规格描述信息
     * @return baremetalMemoryDetail
     */
    public String getBaremetalMemoryDetail() {
        return baremetalMemoryDetail;
    }

    public void setBaremetalMemoryDetail(String baremetalMemoryDetail) {
        this.baremetalMemoryDetail = baremetalMemoryDetail;
    }

    

    public OsExtraSpecs withCondOperationStatus(CondOperationStatusEnum condOperationStatus) {
        this.condOperationStatus = condOperationStatus;
        return this;
    }

    


    /**
     * 裸金属服务器规格状态。不配置时等同于normal。normal：正常商用abandon：下线（即不显示）sellout：售罄obt：公测promotion：推荐（等同normal，也是商用）
     * @return condOperationStatus
     */
    public CondOperationStatusEnum getCondOperationStatus() {
        return condOperationStatus;
    }

    public void setCondOperationStatus(CondOperationStatusEnum condOperationStatus) {
        this.condOperationStatus = condOperationStatus;
    }

    

    public OsExtraSpecs withCondOperationAz(String condOperationAz) {
        this.condOperationAz = condOperationAz;
        return this;
    }

    


    /**
     * 在某个AZ的裸金属服务器规格状态。此参数是AZ级配置，某个AZ没有在此参数中配置时默认使用cond:operation:status参数的取值。格式：az(xx)。()内为某个AZ下的裸金属服务器规格状态，()内必须填写状态，不填为无效配置。例如：规格在某个区域的az0正常商用，az1售罄，az2公测，az3正常商用，其他az显示下线，可配置为：“cond:operation:status”设置为“abandon”“cond:operation:az”设置为“az0(normal), az1(sellout), az2(obt), az3(promotion)” 说明：如果规格在某个AZ下的状态与cond:operation:status配置状态不同，必须配置该参数。
     * @return condOperationAz
     */
    public String getCondOperationAz() {
        return condOperationAz;
    }

    public void setCondOperationAz(String condOperationAz) {
        this.condOperationAz = condOperationAz;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OsExtraSpecs osExtraSpecs = (OsExtraSpecs) o;
        return Objects.equals(this.resourceType, osExtraSpecs.resourceType) &&
            Objects.equals(this.capabilitiesCpuArch, osExtraSpecs.capabilitiesCpuArch) &&
            Objects.equals(this.baremetalDiskDetail, osExtraSpecs.baremetalDiskDetail) &&
            Objects.equals(this.capabilitiesHypervisorType, osExtraSpecs.capabilitiesHypervisorType) &&
            Objects.equals(this.baremetalSupportEvs, osExtraSpecs.baremetalSupportEvs) &&
            Objects.equals(this.baremetalExtBootType, osExtraSpecs.baremetalExtBootType) &&
            Objects.equals(this.capabilitiesBoardType, osExtraSpecs.capabilitiesBoardType) &&
            Objects.equals(this.baremetalNetNum, osExtraSpecs.baremetalNetNum) &&
            Objects.equals(this.baremetalNetcardDetail, osExtraSpecs.baremetalNetcardDetail) &&
            Objects.equals(this.baremetalCpuDetail, osExtraSpecs.baremetalCpuDetail) &&
            Objects.equals(this.baremetalMemoryDetail, osExtraSpecs.baremetalMemoryDetail) &&
            Objects.equals(this.condOperationStatus, osExtraSpecs.condOperationStatus) &&
            Objects.equals(this.condOperationAz, osExtraSpecs.condOperationAz);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceType, capabilitiesCpuArch, baremetalDiskDetail, capabilitiesHypervisorType, baremetalSupportEvs, baremetalExtBootType, capabilitiesBoardType, baremetalNetNum, baremetalNetcardDetail, baremetalCpuDetail, baremetalMemoryDetail, condOperationStatus, condOperationAz);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OsExtraSpecs {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    capabilitiesCpuArch: ").append(toIndentedString(capabilitiesCpuArch)).append("\n");
        sb.append("    baremetalDiskDetail: ").append(toIndentedString(baremetalDiskDetail)).append("\n");
        sb.append("    capabilitiesHypervisorType: ").append(toIndentedString(capabilitiesHypervisorType)).append("\n");
        sb.append("    baremetalSupportEvs: ").append(toIndentedString(baremetalSupportEvs)).append("\n");
        sb.append("    baremetalExtBootType: ").append(toIndentedString(baremetalExtBootType)).append("\n");
        sb.append("    capabilitiesBoardType: ").append(toIndentedString(capabilitiesBoardType)).append("\n");
        sb.append("    baremetalNetNum: ").append(toIndentedString(baremetalNetNum)).append("\n");
        sb.append("    baremetalNetcardDetail: ").append(toIndentedString(baremetalNetcardDetail)).append("\n");
        sb.append("    baremetalCpuDetail: ").append(toIndentedString(baremetalCpuDetail)).append("\n");
        sb.append("    baremetalMemoryDetail: ").append(toIndentedString(baremetalMemoryDetail)).append("\n");
        sb.append("    condOperationStatus: ").append(toIndentedString(condOperationStatus)).append("\n");
        sb.append("    condOperationAz: ").append(toIndentedString(condOperationAz)).append("\n");
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

