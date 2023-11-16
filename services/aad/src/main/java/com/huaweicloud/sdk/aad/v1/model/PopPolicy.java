package com.huaweicloud.sdk.aad.v1.model;

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
 * 策略阈值详情
 */
public class PopPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_location")

    private List<String> blockLocation = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_protocol")

    private List<String> blockProtocol = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bw_list")

    private Bw bwList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_protection")

    private Boolean connectionProtection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_protection_list")

    private List<String> connectionProtectionList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fingerprint_count")

    private Integer fingerprintCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_block_count")

    private Integer portBlockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermark_count")

    private Integer watermarkCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "if_exist_traffic")

    private Boolean ifExistTraffic;

    /**
     * 固定值ALL
     */
    public static final class PopEnum {

        /**
         * Enum ALL for value: "ALL"
         */
        public static final PopEnum ALL = new PopEnum("ALL");

        private static final Map<String, PopEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PopEnum> createStaticFields() {
            Map<String, PopEnum> map = new HashMap<>();
            map.put("ALL", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PopEnum(String value) {
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
        public static PopEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PopEnum(value));
        }

        public static PopEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PopEnum) {
                return this.value.equals(((PopEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pop")

    private PopEnum pop;

    public PopPolicy withBlockLocation(List<String> blockLocation) {
        this.blockLocation = blockLocation;
        return this;
    }

    public PopPolicy addBlockLocationItem(String blockLocationItem) {
        if (this.blockLocation == null) {
            this.blockLocation = new ArrayList<>();
        }
        this.blockLocation.add(blockLocationItem);
        return this;
    }

    public PopPolicy withBlockLocation(Consumer<List<String>> blockLocationSetter) {
        if (this.blockLocation == null) {
            this.blockLocation = new ArrayList<>();
        }
        blockLocationSetter.accept(this.blockLocation);
        return this;
    }

    /**
     * 位置封禁列表
     * @return blockLocation
     */
    public List<String> getBlockLocation() {
        return blockLocation;
    }

    public void setBlockLocation(List<String> blockLocation) {
        this.blockLocation = blockLocation;
    }

    public PopPolicy withBlockProtocol(List<String> blockProtocol) {
        this.blockProtocol = blockProtocol;
        return this;
    }

    public PopPolicy addBlockProtocolItem(String blockProtocolItem) {
        if (this.blockProtocol == null) {
            this.blockProtocol = new ArrayList<>();
        }
        this.blockProtocol.add(blockProtocolItem);
        return this;
    }

    public PopPolicy withBlockProtocol(Consumer<List<String>> blockProtocolSetter) {
        if (this.blockProtocol == null) {
            this.blockProtocol = new ArrayList<>();
        }
        blockProtocolSetter.accept(this.blockProtocol);
        return this;
    }

    /**
     * 协议封禁列表
     * @return blockProtocol
     */
    public List<String> getBlockProtocol() {
        return blockProtocol;
    }

    public void setBlockProtocol(List<String> blockProtocol) {
        this.blockProtocol = blockProtocol;
    }

    public PopPolicy withBwList(Bw bwList) {
        this.bwList = bwList;
        return this;
    }

    public PopPolicy withBwList(Consumer<Bw> bwListSetter) {
        if (this.bwList == null) {
            this.bwList = new Bw();
            bwListSetter.accept(this.bwList);
        }

        return this;
    }

    /**
     * Get bwList
     * @return bwList
     */
    public Bw getBwList() {
        return bwList;
    }

    public void setBwList(Bw bwList) {
        this.bwList = bwList;
    }

    public PopPolicy withConnectionProtection(Boolean connectionProtection) {
        this.connectionProtection = connectionProtection;
        return this;
    }

    /**
     * 是否开启连接防护
     * @return connectionProtection
     */
    public Boolean getConnectionProtection() {
        return connectionProtection;
    }

    public void setConnectionProtection(Boolean connectionProtection) {
        this.connectionProtection = connectionProtection;
    }

    public PopPolicy withConnectionProtectionList(List<String> connectionProtectionList) {
        this.connectionProtectionList = connectionProtectionList;
        return this;
    }

    public PopPolicy addConnectionProtectionListItem(String connectionProtectionListItem) {
        if (this.connectionProtectionList == null) {
            this.connectionProtectionList = new ArrayList<>();
        }
        this.connectionProtectionList.add(connectionProtectionListItem);
        return this;
    }

    public PopPolicy withConnectionProtectionList(Consumer<List<String>> connectionProtectionListSetter) {
        if (this.connectionProtectionList == null) {
            this.connectionProtectionList = new ArrayList<>();
        }
        connectionProtectionListSetter.accept(this.connectionProtectionList);
        return this;
    }

    /**
     * 连接防护列表
     * @return connectionProtectionList
     */
    public List<String> getConnectionProtectionList() {
        return connectionProtectionList;
    }

    public void setConnectionProtectionList(List<String> connectionProtectionList) {
        this.connectionProtectionList = connectionProtectionList;
    }

    public PopPolicy withFingerprintCount(Integer fingerprintCount) {
        this.fingerprintCount = fingerprintCount;
        return this;
    }

    /**
     * 指纹数
     * minimum: 0
     * maximum: 255
     * @return fingerprintCount
     */
    public Integer getFingerprintCount() {
        return fingerprintCount;
    }

    public void setFingerprintCount(Integer fingerprintCount) {
        this.fingerprintCount = fingerprintCount;
    }

    public PopPolicy withPortBlockCount(Integer portBlockCount) {
        this.portBlockCount = portBlockCount;
        return this;
    }

    /**
     * 端口封禁数
     * minimum: 0
     * maximum: 255
     * @return portBlockCount
     */
    public Integer getPortBlockCount() {
        return portBlockCount;
    }

    public void setPortBlockCount(Integer portBlockCount) {
        this.portBlockCount = portBlockCount;
    }

    public PopPolicy withWatermarkCount(Integer watermarkCount) {
        this.watermarkCount = watermarkCount;
        return this;
    }

    /**
     * 水印数
     * minimum: 0
     * maximum: 255
     * @return watermarkCount
     */
    public Integer getWatermarkCount() {
        return watermarkCount;
    }

    public void setWatermarkCount(Integer watermarkCount) {
        this.watermarkCount = watermarkCount;
    }

    public PopPolicy withIfExistTraffic(Boolean ifExistTraffic) {
        this.ifExistTraffic = ifExistTraffic;
        return this;
    }

    /**
     * 是否存在流量
     * @return ifExistTraffic
     */
    public Boolean getIfExistTraffic() {
        return ifExistTraffic;
    }

    public void setIfExistTraffic(Boolean ifExistTraffic) {
        this.ifExistTraffic = ifExistTraffic;
    }

    public PopPolicy withPop(PopEnum pop) {
        this.pop = pop;
        return this;
    }

    /**
     * 固定值ALL
     * @return pop
     */
    public PopEnum getPop() {
        return pop;
    }

    public void setPop(PopEnum pop) {
        this.pop = pop;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PopPolicy that = (PopPolicy) obj;
        return Objects.equals(this.blockLocation, that.blockLocation)
            && Objects.equals(this.blockProtocol, that.blockProtocol) && Objects.equals(this.bwList, that.bwList)
            && Objects.equals(this.connectionProtection, that.connectionProtection)
            && Objects.equals(this.connectionProtectionList, that.connectionProtectionList)
            && Objects.equals(this.fingerprintCount, that.fingerprintCount)
            && Objects.equals(this.portBlockCount, that.portBlockCount)
            && Objects.equals(this.watermarkCount, that.watermarkCount)
            && Objects.equals(this.ifExistTraffic, that.ifExistTraffic) && Objects.equals(this.pop, that.pop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockLocation,
            blockProtocol,
            bwList,
            connectionProtection,
            connectionProtectionList,
            fingerprintCount,
            portBlockCount,
            watermarkCount,
            ifExistTraffic,
            pop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PopPolicy {\n");
        sb.append("    blockLocation: ").append(toIndentedString(blockLocation)).append("\n");
        sb.append("    blockProtocol: ").append(toIndentedString(blockProtocol)).append("\n");
        sb.append("    bwList: ").append(toIndentedString(bwList)).append("\n");
        sb.append("    connectionProtection: ").append(toIndentedString(connectionProtection)).append("\n");
        sb.append("    connectionProtectionList: ").append(toIndentedString(connectionProtectionList)).append("\n");
        sb.append("    fingerprintCount: ").append(toIndentedString(fingerprintCount)).append("\n");
        sb.append("    portBlockCount: ").append(toIndentedString(portBlockCount)).append("\n");
        sb.append("    watermarkCount: ").append(toIndentedString(watermarkCount)).append("\n");
        sb.append("    ifExistTraffic: ").append(toIndentedString(ifExistTraffic)).append("\n");
        sb.append("    pop: ").append(toIndentedString(pop)).append("\n");
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
