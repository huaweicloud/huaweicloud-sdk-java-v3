package com.huaweicloud.sdk.ecs.v2.model;

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
 * 
 */
public class NovaServerSchedulerHints {

    /**
     * 
     */
    public static final class TenancyEnum {

        /** Enum SHARED for value: "shared" */
        public static final TenancyEnum SHARED = new TenancyEnum("shared");

        /** Enum DEDICATED for value: "dedicated" */
        public static final TenancyEnum DEDICATED = new TenancyEnum("dedicated");

        private static final Map<String, TenancyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TenancyEnum> createStaticFields() {
            Map<String, TenancyEnum> map = new HashMap<>();
            map.put("shared", SHARED);
            map.put("dedicated", DEDICATED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TenancyEnum(String value) {
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
        public static TenancyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TenancyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TenancyEnum(value);
            }
            return result;
        }

        public static TenancyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TenancyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TenancyEnum) {
                return this.value.equals(((TenancyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenancy")

    private List<TenancyEnum> tenancy = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_host_id")

    private List<String> dedicatedHostId = null;

    public NovaServerSchedulerHints withTenancy(List<TenancyEnum> tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    public NovaServerSchedulerHints addTenancyItem(TenancyEnum tenancyItem) {
        if (this.tenancy == null) {
            this.tenancy = new ArrayList<>();
        }
        this.tenancy.add(tenancyItem);
        return this;
    }

    public NovaServerSchedulerHints withTenancy(Consumer<List<TenancyEnum>> tenancySetter) {
        if (this.tenancy == null) {
            this.tenancy = new ArrayList<>();
        }
        tenancySetter.accept(this.tenancy);
        return this;
    }

    /** 在指定的专属主机或者共享主机上创建弹性云服务器。 参数值为shared或者dedicated。
     * 
     * @return tenancy */
    public List<TenancyEnum> getTenancy() {
        return tenancy;
    }

    public void setTenancy(List<TenancyEnum> tenancy) {
        this.tenancy = tenancy;
    }

    public NovaServerSchedulerHints withDedicatedHostId(List<String> dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    public NovaServerSchedulerHints addDedicatedHostIdItem(String dedicatedHostIdItem) {
        if (this.dedicatedHostId == null) {
            this.dedicatedHostId = new ArrayList<>();
        }
        this.dedicatedHostId.add(dedicatedHostIdItem);
        return this;
    }

    public NovaServerSchedulerHints withDedicatedHostId(Consumer<List<String>> dedicatedHostIdSetter) {
        if (this.dedicatedHostId == null) {
            this.dedicatedHostId = new ArrayList<>();
        }
        dedicatedHostIdSetter.accept(this.dedicatedHostId);
        return this;
    }

    /** 专属主机ID。 此属性仅在tenancy值为dedicated时有效。
     * 
     * @return dedicatedHostId */
    public List<String> getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(List<String> dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaServerSchedulerHints novaServerSchedulerHints = (NovaServerSchedulerHints) o;
        return Objects.equals(this.tenancy, novaServerSchedulerHints.tenancy)
            && Objects.equals(this.dedicatedHostId, novaServerSchedulerHints.dedicatedHostId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenancy, dedicatedHostId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaServerSchedulerHints {\n");
        sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
        sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
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
