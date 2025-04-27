package com.huaweicloud.sdk.deh.v1.model;

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
 * 创建专属主机消息体。
 */
public class ReqAllocateDeh {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 在创建云服务器时（未指定专属主机ID），是否允许云服务器自动分配在一台可用的专属主机上。 取值范围：“on”或“off”。 默认值：“on”。
     */
    public static final class AutoPlacementEnum {

        /**
         * Enum OFF for value: "off"
         */
        public static final AutoPlacementEnum OFF = new AutoPlacementEnum("off");

        /**
         * Enum ON for value: "on"
         */
        public static final AutoPlacementEnum ON = new AutoPlacementEnum("on");

        private static final Map<String, AutoPlacementEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AutoPlacementEnum> createStaticFields() {
            Map<String, AutoPlacementEnum> map = new HashMap<>();
            map.put("off", OFF);
            map.put("on", ON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AutoPlacementEnum(String value) {
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
        public static AutoPlacementEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AutoPlacementEnum(value));
        }

        public static AutoPlacementEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AutoPlacementEnum) {
                return this.value.equals(((AutoPlacementEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_placement")

    private AutoPlacementEnum autoPlacement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type")

    private String hostType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quantity")

    private Integer quantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_param")

    private ReqAllocateDehExtendParam extendParam;

    public ReqAllocateDeh withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 专属主机名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReqAllocateDeh withAutoPlacement(AutoPlacementEnum autoPlacement) {
        this.autoPlacement = autoPlacement;
        return this;
    }

    /**
     * 在创建云服务器时（未指定专属主机ID），是否允许云服务器自动分配在一台可用的专属主机上。 取值范围：“on”或“off”。 默认值：“on”。
     * @return autoPlacement
     */
    public AutoPlacementEnum getAutoPlacement() {
        return autoPlacement;
    }

    public void setAutoPlacement(AutoPlacementEnum autoPlacement) {
        this.autoPlacement = autoPlacement;
    }

    public ReqAllocateDeh withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 专属主机所属AZ。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ReqAllocateDeh withHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }

    /**
     * 专属主机类型。
     * @return hostType
     */
    public String getHostType() {
        return hostType;
    }

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    public ReqAllocateDeh withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * 待分配的专属主机数量。
     * @return quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public ReqAllocateDeh withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public ReqAllocateDeh addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ReqAllocateDeh withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 专属主机标签列表。
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public ReqAllocateDeh withExtendParam(ReqAllocateDehExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public ReqAllocateDeh withExtendParam(Consumer<ReqAllocateDehExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new ReqAllocateDehExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public ReqAllocateDehExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(ReqAllocateDehExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReqAllocateDeh that = (ReqAllocateDeh) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.autoPlacement, that.autoPlacement)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.hostType, that.hostType) && Objects.equals(this.quantity, that.quantity)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.extendParam, that.extendParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, autoPlacement, availabilityZone, hostType, quantity, tags, extendParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReqAllocateDeh {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    autoPlacement: ").append(toIndentedString(autoPlacement)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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
