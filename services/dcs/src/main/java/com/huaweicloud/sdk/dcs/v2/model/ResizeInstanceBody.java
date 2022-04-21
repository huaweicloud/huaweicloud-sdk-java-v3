package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResizeInstanceBody
 */
public class ResizeInstanceBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_capacity")

    private Integer newCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bss_param")

    private BssParamEntity bssParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserved_ip")

    private List<String> reservedIp = null;

    /**
    * 变更类型，Redis 4.0或者5.0主备实例进行副本数变更时必选。 - createReplication: 添加副本 - deleteReplication: 删除副本 
    */
    public static final class ChangeTypeEnum {

        /**
         * Enum CREATEREPLICATION for value: "createReplication"
         */
        public static final ChangeTypeEnum CREATEREPLICATION = new ChangeTypeEnum("createReplication");

        /**
         * Enum DELETEREPLICATION for value: "deleteReplication"
         */
        public static final ChangeTypeEnum DELETEREPLICATION = new ChangeTypeEnum("deleteReplication");

        private static final Map<String, ChangeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChangeTypeEnum> createStaticFields() {
            Map<String, ChangeTypeEnum> map = new HashMap<>();
            map.put("createReplication", CREATEREPLICATION);
            map.put("deleteReplication", DELETEREPLICATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChangeTypeEnum(String value) {
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
        public static ChangeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ChangeTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ChangeTypeEnum(value);
            }
            return result;
        }

        public static ChangeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ChangeTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChangeTypeEnum) {
                return this.value.equals(((ChangeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_type")

    private ChangeTypeEnum changeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<String> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_list")

    private List<String> nodeList = null;

    public ResizeInstanceBody withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 产品规格编码。具体查询方法如下：  - 方法一：查询产品介绍中的[实例规格](https://support.huaweicloud.com/productdesc-dcs/dcs-pd-0522002.html) - 方法二：登录分布式缓存的控制台界面，点击购买缓存实例，查找对应的实例规格名称 - 方法三：调用[查询产品规格](https://support.huaweicloud.com/api-dcs/ListFlavors.html)接口查询。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public ResizeInstanceBody withNewCapacity(Integer newCapacity) {
        this.newCapacity = newCapacity;
        return this;
    }

    /**
     * 新的缓存实例规格，新的规格必须大于扩容前的规格，单位：GB。 取值包括：4，8，16，32，64 取值必须是当前产品支持的实例规格，请以实际为准。 
     * @return newCapacity
     */
    public Integer getNewCapacity() {
        return newCapacity;
    }

    public void setNewCapacity(Integer newCapacity) {
        this.newCapacity = newCapacity;
    }

    public ResizeInstanceBody withBssParam(BssParamEntity bssParam) {
        this.bssParam = bssParam;
        return this;
    }

    public ResizeInstanceBody withBssParam(Consumer<BssParamEntity> bssParamSetter) {
        if (this.bssParam == null) {
            this.bssParam = new BssParamEntity();
            bssParamSetter.accept(this.bssParam);
        }

        return this;
    }

    /**
     * Get bssParam
     * @return bssParam
     */
    public BssParamEntity getBssParam() {
        return bssParam;
    }

    public void setBssParam(BssParamEntity bssParam) {
        this.bssParam = bssParam;
    }

    public ResizeInstanceBody withReservedIp(List<String> reservedIp) {
        this.reservedIp = reservedIp;
        return this;
    }

    public ResizeInstanceBody addReservedIpItem(String reservedIpItem) {
        if (this.reservedIp == null) {
            this.reservedIp = new ArrayList<>();
        }
        this.reservedIp.add(reservedIpItem);
        return this;
    }

    public ResizeInstanceBody withReservedIp(Consumer<List<String>> reservedIpSetter) {
        if (this.reservedIp == null) {
            this.reservedIp = new ArrayList<>();
        }
        reservedIpSetter.accept(this.reservedIp);
        return this;
    }

    /**
     * 需要保留的节点ip。cluster集群缩容时需要填写，不填写时系统将随机删除多余的分片
     * @return reservedIp
     */
    public List<String> getReservedIp() {
        return reservedIp;
    }

    public void setReservedIp(List<String> reservedIp) {
        this.reservedIp = reservedIp;
    }

    public ResizeInstanceBody withChangeType(ChangeTypeEnum changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * 变更类型，Redis 4.0或者5.0主备实例进行副本数变更时必选。 - createReplication: 添加副本 - deleteReplication: 删除副本 
     * @return changeType
     */
    public ChangeTypeEnum getChangeType() {
        return changeType;
    }

    public void setChangeType(ChangeTypeEnum changeType) {
        this.changeType = changeType;
    }

    public ResizeInstanceBody withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public ResizeInstanceBody addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public ResizeInstanceBody withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * Redis 4.0或者5.0主备实例进行添加副本时必选，指定每个副本所在的可用区Code，使用前需要先确认该可用区资源是否售罄。  具体查询方法，请参考[查询可用区信息](https://support.huaweicloud.com/api-dcs/ListAvailableZones.html) 
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public ResizeInstanceBody withNodeList(List<String> nodeList) {
        this.nodeList = nodeList;
        return this;
    }

    public ResizeInstanceBody addNodeListItem(String nodeListItem) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        this.nodeList.add(nodeListItem);
        return this;
    }

    public ResizeInstanceBody withNodeList(Consumer<List<String>> nodeListSetter) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        nodeListSetter.accept(this.nodeList);
        return this;
    }

    /**
     * Redis 4.0或者5.0主备实例进行删除副本时必选，指定需要删除的节点ID，目前仅支持一次删除一个副本。  节点ID查询方法，请参考[查询分片信息](https://support.huaweicloud.com/api-dcs/ListGroupReplicationInfo.html) 
     * @return nodeList
     */
    public List<String> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<String> nodeList) {
        this.nodeList = nodeList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResizeInstanceBody resizeInstanceBody = (ResizeInstanceBody) o;
        return Objects.equals(this.specCode, resizeInstanceBody.specCode)
            && Objects.equals(this.newCapacity, resizeInstanceBody.newCapacity)
            && Objects.equals(this.bssParam, resizeInstanceBody.bssParam)
            && Objects.equals(this.reservedIp, resizeInstanceBody.reservedIp)
            && Objects.equals(this.changeType, resizeInstanceBody.changeType)
            && Objects.equals(this.availableZones, resizeInstanceBody.availableZones)
            && Objects.equals(this.nodeList, resizeInstanceBody.nodeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specCode, newCapacity, bssParam, reservedIp, changeType, availableZones, nodeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeInstanceBody {\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    newCapacity: ").append(toIndentedString(newCapacity)).append("\n");
        sb.append("    bssParam: ").append(toIndentedString(bssParam)).append("\n");
        sb.append("    reservedIp: ").append(toIndentedString(reservedIp)).append("\n");
        sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    nodeList: ").append(toIndentedString(nodeList)).append("\n");
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
