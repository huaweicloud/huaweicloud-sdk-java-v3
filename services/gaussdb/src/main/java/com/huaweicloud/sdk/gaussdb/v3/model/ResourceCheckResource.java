package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 资源信息。
 */
public class ResourceCheckResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_num")

    private Integer instanceNum;

    /**
     * 实例部署模式。
     */
    public static final class ModeEnum {

        /**
         * Enum CLUSTER for value: "Cluster"
         */
        public static final ModeEnum CLUSTER = new ModeEnum("Cluster");

        /**
         * Enum SINGLE for value: "Single"
         */
        public static final ModeEnum SINGLE = new ModeEnum("Single");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("Cluster", CLUSTER);
            map.put("Single", SINGLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_mode")

    private String availabilityZoneMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fe_node_num")

    private Integer feNodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "be_node_num")

    private Integer beNodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fe_flavor_ref")

    private String feFlavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "be_flavor_ref")

    private String beFlavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    public ResourceCheckResource withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ResourceCheckResource withInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }

    /**
     * 实例数量。
     * @return instanceNum
     */
    public Integer getInstanceNum() {
        return instanceNum;
    }

    public void setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
    }

    public ResourceCheckResource withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 实例部署模式。
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public ResourceCheckResource withAvailabilityZoneMode(String availabilityZoneMode) {
        this.availabilityZoneMode = availabilityZoneMode;
        return this;
    }

    /**
     * 可用区类型，目前仅支持single。
     * @return availabilityZoneMode
     */
    public String getAvailabilityZoneMode() {
        return availabilityZoneMode;
    }

    public void setAvailabilityZoneMode(String availabilityZoneMode) {
        this.availabilityZoneMode = availabilityZoneMode;
    }

    public ResourceCheckResource withFeNodeNum(Integer feNodeNum) {
        this.feNodeNum = feNodeNum;
        return this;
    }

    /**
     * FE节点数量。
     * @return feNodeNum
     */
    public Integer getFeNodeNum() {
        return feNodeNum;
    }

    public void setFeNodeNum(Integer feNodeNum) {
        this.feNodeNum = feNodeNum;
    }

    public ResourceCheckResource withBeNodeNum(Integer beNodeNum) {
        this.beNodeNum = beNodeNum;
        return this;
    }

    /**
     * BE节点数量。
     * @return beNodeNum
     */
    public Integer getBeNodeNum() {
        return beNodeNum;
    }

    public void setBeNodeNum(Integer beNodeNum) {
        this.beNodeNum = beNodeNum;
    }

    public ResourceCheckResource withFeFlavorRef(String feFlavorRef) {
        this.feFlavorRef = feFlavorRef;
        return this;
    }

    /**
     * FE规格码。
     * @return feFlavorRef
     */
    public String getFeFlavorRef() {
        return feFlavorRef;
    }

    public void setFeFlavorRef(String feFlavorRef) {
        this.feFlavorRef = feFlavorRef;
    }

    public ResourceCheckResource withBeFlavorRef(String beFlavorRef) {
        this.beFlavorRef = beFlavorRef;
        return this;
    }

    /**
     * BE规格码。
     * @return beFlavorRef
     */
    public String getBeFlavorRef() {
        return beFlavorRef;
    }

    public void setBeFlavorRef(String beFlavorRef) {
        this.beFlavorRef = beFlavorRef;
    }

    public ResourceCheckResource withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用区码。选填，校验可用区码是否正确。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ResourceCheckResource withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * HTAP实例子网即TaurusDB实例子网。 获取方法请参见[获取子网ID](https://support.huaweicloud.com/api-vpc/vpc_subnet01_0003.html)。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceCheckResource that = (ResourceCheckResource) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.instanceNum, that.instanceNum) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.availabilityZoneMode, that.availabilityZoneMode)
            && Objects.equals(this.feNodeNum, that.feNodeNum) && Objects.equals(this.beNodeNum, that.beNodeNum)
            && Objects.equals(this.feFlavorRef, that.feFlavorRef) && Objects.equals(this.beFlavorRef, that.beFlavorRef)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.subnetId, that.subnetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            instanceNum,
            mode,
            availabilityZoneMode,
            feNodeNum,
            beNodeNum,
            feFlavorRef,
            beFlavorRef,
            availabilityZone,
            subnetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceCheckResource {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    instanceNum: ").append(toIndentedString(instanceNum)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    availabilityZoneMode: ").append(toIndentedString(availabilityZoneMode)).append("\n");
        sb.append("    feNodeNum: ").append(toIndentedString(feNodeNum)).append("\n");
        sb.append("    beNodeNum: ").append(toIndentedString(beNodeNum)).append("\n");
        sb.append("    feFlavorRef: ").append(toIndentedString(feFlavorRef)).append("\n");
        sb.append("    beFlavorRef: ").append(toIndentedString(beFlavorRef)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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
