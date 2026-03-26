package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceCreateReq
 */
public class InstanceCreateReq {

    /**
     * 创建实例的镜像规格，当前支持的云手机场景下必填
     */
    public static final class OsEnum {

        /**
         * Enum AOSP9 for value: "AOSP9"
         */
        public static final OsEnum AOSP9 = new OsEnum("AOSP9");

        /**
         * Enum AOSP11 for value: "AOSP11"
         */
        public static final OsEnum AOSP11 = new OsEnum("AOSP11");

        private static final Map<String, OsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsEnum> createStaticFields() {
            Map<String, OsEnum> map = new HashMap<>();
            map.put("AOSP9", AOSP9);
            map.put("AOSP11", AOSP11);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsEnum(String value) {
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
        public static OsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OsEnum(value));
        }

        public static OsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsEnum) {
                return this.value.equals(((OsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    private OsEnum os;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceSkuId")

    private String instanceSkuId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandSkuId")

    private String bandSkuId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regionId")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceNamePrefix")

    private String instanceNamePrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandSize")

    private Double bandSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chargeParam")

    private InstanceCreateReqChargeParam chargeParam;

    /**
     * 网络线路类型。非必填参数，枚举值：EIP和ADN。默认是EIP类型，ADN网络要填。
     */
    public static final class NetworkEnum {

        /**
         * Enum EIP for value: "EIP"
         */
        public static final NetworkEnum EIP = new NetworkEnum("EIP");

        /**
         * Enum ADN for value: "ADN"
         */
        public static final NetworkEnum ADN = new NetworkEnum("ADN");

        private static final Map<String, NetworkEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NetworkEnum> createStaticFields() {
            Map<String, NetworkEnum> map = new HashMap<>();
            map.put("EIP", EIP);
            map.put("ADN", ADN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NetworkEnum(String value) {
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
        public static NetworkEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NetworkEnum(value));
        }

        public static NetworkEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NetworkEnum) {
                return this.value.equals(((NetworkEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network")

    private NetworkEnum network;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customImageType")

    private Integer customImageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customImageId")

    private Integer customImageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specPoolId")

    private String specPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeGroupId")

    private String nodeGroupId;

    public InstanceCreateReq withOs(OsEnum os) {
        this.os = os;
        return this;
    }

    /**
     * 创建实例的镜像规格，当前支持的云手机场景下必填
     * @return os
     */
    public OsEnum getOs() {
        return os;
    }

    public void setOs(OsEnum os) {
        this.os = os;
    }

    public InstanceCreateReq withInstanceSkuId(String instanceSkuId) {
        this.instanceSkuId = instanceSkuId;
        return this;
    }

    /**
     * 创建的实例商品规格id，在CBC定义，Console提供规格与资源池映射
     * @return instanceSkuId
     */
    public String getInstanceSkuId() {
        return instanceSkuId;
    }

    public void setInstanceSkuId(String instanceSkuId) {
        this.instanceSkuId = instanceSkuId;
    }

    public InstanceCreateReq withBandSkuId(String bandSkuId) {
        this.bandSkuId = bandSkuId;
        return this;
    }

    /**
     * 带宽商品规格id，在CBC定义
     * @return bandSkuId
     */
    public String getBandSkuId() {
        return bandSkuId;
    }

    public void setBandSkuId(String bandSkuId) {
        this.bandSkuId = bandSkuId;
    }

    public InstanceCreateReq withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public InstanceCreateReq withInstanceNamePrefix(String instanceNamePrefix) {
        this.instanceNamePrefix = instanceNamePrefix;
        return this;
    }

    /**
     * 云机实例名称前缀
     * @return instanceNamePrefix
     */
    public String getInstanceNamePrefix() {
        return instanceNamePrefix;
    }

    public void setInstanceNamePrefix(String instanceNamePrefix) {
        this.instanceNamePrefix = instanceNamePrefix;
    }

    public InstanceCreateReq withBandSize(Double bandSize) {
        this.bandSize = bandSize;
        return this;
    }

    /**
     * 带宽大小,单位M
     * @return bandSize
     */
    public Double getBandSize() {
        return bandSize;
    }

    public void setBandSize(Double bandSize) {
        this.bandSize = bandSize;
    }

    public InstanceCreateReq withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 购买实例数量，最大2000
     * maximum: 2000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public InstanceCreateReq withChargeParam(InstanceCreateReqChargeParam chargeParam) {
        this.chargeParam = chargeParam;
        return this;
    }

    public InstanceCreateReq withChargeParam(Consumer<InstanceCreateReqChargeParam> chargeParamSetter) {
        if (this.chargeParam == null) {
            this.chargeParam = new InstanceCreateReqChargeParam();
            chargeParamSetter.accept(this.chargeParam);
        }

        return this;
    }

    /**
     * Get chargeParam
     * @return chargeParam
     */
    public InstanceCreateReqChargeParam getChargeParam() {
        return chargeParam;
    }

    public void setChargeParam(InstanceCreateReqChargeParam chargeParam) {
        this.chargeParam = chargeParam;
    }

    public InstanceCreateReq withNetwork(NetworkEnum network) {
        this.network = network;
        return this;
    }

    /**
     * 网络线路类型。非必填参数，枚举值：EIP和ADN。默认是EIP类型，ADN网络要填。
     * @return network
     */
    public NetworkEnum getNetwork() {
        return network;
    }

    public void setNetwork(NetworkEnum network) {
        this.network = network;
    }

    public InstanceCreateReq withCustomImageType(Integer customImageType) {
        this.customImageType = customImageType;
        return this;
    }

    /**
     * 镜像类型 0：系统镜像，1：自定义镜像，2:私有镜像
     * maximum: 2
     * @return customImageType
     */
    public Integer getCustomImageType() {
        return customImageType;
    }

    public void setCustomImageType(Integer customImageType) {
        this.customImageType = customImageType;
    }

    public InstanceCreateReq withCustomImageId(Integer customImageId) {
        this.customImageId = customImageId;
        return this;
    }

    /**
     * 镜像id
     * @return customImageId
     */
    public Integer getCustomImageId() {
        return customImageId;
    }

    public void setCustomImageId(Integer customImageId) {
        this.customImageId = customImageId;
    }

    public InstanceCreateReq withSpecPoolId(String specPoolId) {
        this.specPoolId = specPoolId;
        return this;
    }

    /**
     * 规格池id
     * @return specPoolId
     */
    public String getSpecPoolId() {
        return specPoolId;
    }

    public void setSpecPoolId(String specPoolId) {
        this.specPoolId = specPoolId;
    }

    public InstanceCreateReq withNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }

    /**
     * 节点组id
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return nodeGroupId;
    }

    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceCreateReq that = (InstanceCreateReq) obj;
        return Objects.equals(this.os, that.os) && Objects.equals(this.instanceSkuId, that.instanceSkuId)
            && Objects.equals(this.bandSkuId, that.bandSkuId) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.instanceNamePrefix, that.instanceNamePrefix)
            && Objects.equals(this.bandSize, that.bandSize) && Objects.equals(this.count, that.count)
            && Objects.equals(this.chargeParam, that.chargeParam) && Objects.equals(this.network, that.network)
            && Objects.equals(this.customImageType, that.customImageType)
            && Objects.equals(this.customImageId, that.customImageId)
            && Objects.equals(this.specPoolId, that.specPoolId) && Objects.equals(this.nodeGroupId, that.nodeGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(os,
            instanceSkuId,
            bandSkuId,
            regionId,
            instanceNamePrefix,
            bandSize,
            count,
            chargeParam,
            network,
            customImageType,
            customImageId,
            specPoolId,
            nodeGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceCreateReq {\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    instanceSkuId: ").append(toIndentedString(instanceSkuId)).append("\n");
        sb.append("    bandSkuId: ").append(toIndentedString(bandSkuId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    instanceNamePrefix: ").append(toIndentedString(instanceNamePrefix)).append("\n");
        sb.append("    bandSize: ").append(toIndentedString(bandSize)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    chargeParam: ").append(toIndentedString(chargeParam)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    customImageType: ").append(toIndentedString(customImageType)).append("\n");
        sb.append("    customImageId: ").append(toIndentedString(customImageId)).append("\n");
        sb.append("    specPoolId: ").append(toIndentedString(specPoolId)).append("\n");
        sb.append("    nodeGroupId: ").append(toIndentedString(nodeGroupId)).append("\n");
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
