package com.huaweicloud.sdk.iec.v1.model;

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
 * 带宽配置
 */
public class BandwidthConfigInstance {

    /**
     * 带宽类型，现支持WHOLE类型，即共享带宽，其他类型不支持。
     */
    public static final class SharetypeEnum {

        /**
         * Enum WHOLE for value: "WHOLE"
         */
        public static final SharetypeEnum WHOLE = new SharetypeEnum("WHOLE");

        private static final Map<String, SharetypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SharetypeEnum> createStaticFields() {
            Map<String, SharetypeEnum> map = new HashMap<>();
            map.put("WHOLE", WHOLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SharetypeEnum(String value) {
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
        public static SharetypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SharetypeEnum(value));
        }

        public static SharetypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SharetypeEnum) {
                return this.value.equals(((SharetypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sharetype")

    private SharetypeEnum sharetype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_types")

    private List<String> bandwidthTypes = null;

    public BandwidthConfigInstance withSharetype(SharetypeEnum sharetype) {
        this.sharetype = sharetype;
        return this;
    }

    /**
     * 带宽类型，现支持WHOLE类型，即共享带宽，其他类型不支持。
     * @return sharetype
     */
    public SharetypeEnum getSharetype() {
        return sharetype;
    }

    public void setSharetype(SharetypeEnum sharetype) {
        this.sharetype = sharetype;
    }

    public BandwidthConfigInstance withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 带宽（Mbit/s）。 
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public BandwidthConfigInstance withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public BandwidthConfigInstance addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public BandwidthConfigInstance withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * Get ids
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public BandwidthConfigInstance withBandwidthTypes(List<String> bandwidthTypes) {
        this.bandwidthTypes = bandwidthTypes;
        return this;
    }

    public BandwidthConfigInstance addBandwidthTypesItem(String bandwidthTypesItem) {
        if (this.bandwidthTypes == null) {
            this.bandwidthTypes = new ArrayList<>();
        }
        this.bandwidthTypes.add(bandwidthTypesItem);
        return this;
    }

    public BandwidthConfigInstance withBandwidthTypes(Consumer<List<String>> bandwidthTypesSetter) {
        if (this.bandwidthTypes == null) {
            this.bandwidthTypes = new ArrayList<>();
        }
        bandwidthTypesSetter.accept(this.bandwidthTypes);
        return this;
    }

    /**
     * Get bandwidthTypes
     * @return bandwidthTypes
     */
    public List<String> getBandwidthTypes() {
        return bandwidthTypes;
    }

    public void setBandwidthTypes(List<String> bandwidthTypes) {
        this.bandwidthTypes = bandwidthTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BandwidthConfigInstance that = (BandwidthConfigInstance) obj;
        return Objects.equals(this.sharetype, that.sharetype) && Objects.equals(this.size, that.size)
            && Objects.equals(this.ids, that.ids) && Objects.equals(this.bandwidthTypes, that.bandwidthTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sharetype, size, ids, bandwidthTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BandwidthConfigInstance {\n");
        sb.append("    sharetype: ").append(toIndentedString(sharetype)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    bandwidthTypes: ").append(toIndentedString(bandwidthTypes)).append("\n");
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
