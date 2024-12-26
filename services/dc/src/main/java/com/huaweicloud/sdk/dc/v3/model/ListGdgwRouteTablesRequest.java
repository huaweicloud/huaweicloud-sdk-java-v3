package com.huaweicloud.sdk.dc.v3.model;

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
 * Request Object
 */
public class ListGdgwRouteTablesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<String> fields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_fields")

    private List<String> extFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gdgw_id")

    private String gdgwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nexthop")

    private List<String> nexthop = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private List<String> destination = null;

    /**
     * Gets or Sets addressFamily
     */
    public static final class AddressFamilyEnum {

        /**
         * Enum IPV4 for value: "ipv4"
         */
        public static final AddressFamilyEnum IPV4 = new AddressFamilyEnum("ipv4");

        /**
         * Enum IPV6 for value: "ipv6"
         */
        public static final AddressFamilyEnum IPV6 = new AddressFamilyEnum("ipv6");

        private static final Map<String, AddressFamilyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AddressFamilyEnum> createStaticFields() {
            Map<String, AddressFamilyEnum> map = new HashMap<>();
            map.put("ipv4", IPV4);
            map.put("ipv6", IPV6);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AddressFamilyEnum(String value) {
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
        public static AddressFamilyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AddressFamilyEnum(value));
        }

        public static AddressFamilyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AddressFamilyEnum) {
                return this.value.equals(((AddressFamilyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_family")

    private List<AddressFamilyEnum> addressFamily = null;

    public ListGdgwRouteTablesRequest withFields(List<String> fields) {
        this.fields = fields;
        return this;
    }

    public ListGdgwRouteTablesRequest addFieldsItem(String fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ListGdgwRouteTablesRequest withFields(Consumer<List<String>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * 显示字段列表
     * @return fields
     */
    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public ListGdgwRouteTablesRequest withExtFields(List<String> extFields) {
        this.extFields = extFields;
        return this;
    }

    public ListGdgwRouteTablesRequest addExtFieldsItem(String extFieldsItem) {
        if (this.extFields == null) {
            this.extFields = new ArrayList<>();
        }
        this.extFields.add(extFieldsItem);
        return this;
    }

    public ListGdgwRouteTablesRequest withExtFields(Consumer<List<String>> extFieldsSetter) {
        if (this.extFields == null) {
            this.extFields = new ArrayList<>();
        }
        extFieldsSetter.accept(this.extFields);
        return this;
    }

    /**
     * show response ext-fields
     * @return extFields
     */
    public List<String> getExtFields() {
        return extFields;
    }

    public void setExtFields(List<String> extFields) {
        this.extFields = extFields;
    }

    public ListGdgwRouteTablesRequest withGdgwId(String gdgwId) {
        this.gdgwId = gdgwId;
        return this;
    }

    /**
     * 全域接入网关ID
     * @return gdgwId
     */
    public String getGdgwId() {
        return gdgwId;
    }

    public void setGdgwId(String gdgwId) {
        this.gdgwId = gdgwId;
    }

    public ListGdgwRouteTablesRequest withNexthop(List<String> nexthop) {
        this.nexthop = nexthop;
        return this;
    }

    public ListGdgwRouteTablesRequest addNexthopItem(String nexthopItem) {
        if (this.nexthop == null) {
            this.nexthop = new ArrayList<>();
        }
        this.nexthop.add(nexthopItem);
        return this;
    }

    public ListGdgwRouteTablesRequest withNexthop(Consumer<List<String>> nexthopSetter) {
        if (this.nexthop == null) {
            this.nexthop = new ArrayList<>();
        }
        nexthopSetter.accept(this.nexthop);
        return this;
    }

    /**
     * 下一条ID
     * @return nexthop
     */
    public List<String> getNexthop() {
        return nexthop;
    }

    public void setNexthop(List<String> nexthop) {
        this.nexthop = nexthop;
    }

    public ListGdgwRouteTablesRequest withDestination(List<String> destination) {
        this.destination = destination;
        return this;
    }

    public ListGdgwRouteTablesRequest addDestinationItem(String destinationItem) {
        if (this.destination == null) {
            this.destination = new ArrayList<>();
        }
        this.destination.add(destinationItem);
        return this;
    }

    public ListGdgwRouteTablesRequest withDestination(Consumer<List<String>> destinationSetter) {
        if (this.destination == null) {
            this.destination = new ArrayList<>();
        }
        destinationSetter.accept(this.destination);
        return this;
    }

    /**
     * 目的地址
     * @return destination
     */
    public List<String> getDestination() {
        return destination;
    }

    public void setDestination(List<String> destination) {
        this.destination = destination;
    }

    public ListGdgwRouteTablesRequest withAddressFamily(List<AddressFamilyEnum> addressFamily) {
        this.addressFamily = addressFamily;
        return this;
    }

    public ListGdgwRouteTablesRequest addAddressFamilyItem(AddressFamilyEnum addressFamilyItem) {
        if (this.addressFamily == null) {
            this.addressFamily = new ArrayList<>();
        }
        this.addressFamily.add(addressFamilyItem);
        return this;
    }

    public ListGdgwRouteTablesRequest withAddressFamily(Consumer<List<AddressFamilyEnum>> addressFamilySetter) {
        if (this.addressFamily == null) {
            this.addressFamily = new ArrayList<>();
        }
        addressFamilySetter.accept(this.addressFamily);
        return this;
    }

    /**
     * 地址簇
     * @return addressFamily
     */
    public List<AddressFamilyEnum> getAddressFamily() {
        return addressFamily;
    }

    public void setAddressFamily(List<AddressFamilyEnum> addressFamily) {
        this.addressFamily = addressFamily;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGdgwRouteTablesRequest that = (ListGdgwRouteTablesRequest) obj;
        return Objects.equals(this.fields, that.fields) && Objects.equals(this.extFields, that.extFields)
            && Objects.equals(this.gdgwId, that.gdgwId) && Objects.equals(this.nexthop, that.nexthop)
            && Objects.equals(this.destination, that.destination)
            && Objects.equals(this.addressFamily, that.addressFamily);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, extFields, gdgwId, nexthop, destination, addressFamily);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGdgwRouteTablesRequest {\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    extFields: ").append(toIndentedString(extFields)).append("\n");
        sb.append("    gdgwId: ").append(toIndentedString(gdgwId)).append("\n");
        sb.append("    nexthop: ").append(toIndentedString(nexthop)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
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
