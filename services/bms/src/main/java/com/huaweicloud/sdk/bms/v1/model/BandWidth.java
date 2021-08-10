package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** bandwidth字段数据结构说明 */
public class BandWidth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /** 带宽的共享类型。共享类型枚举：PER，表示独享；WHOLE，表示共享 */
    public static final class SharetypeEnum {

        /** Enum PER for value: "PER" */
        public static final SharetypeEnum PER = new SharetypeEnum("PER");

        /** Enum WHOLE for value: "WHOLE" */
        public static final SharetypeEnum WHOLE = new SharetypeEnum("WHOLE");

        private static final Map<String, SharetypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SharetypeEnum> createStaticFields() {
            Map<String, SharetypeEnum> map = new HashMap<>();
            map.put("PER", PER);
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
            SharetypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SharetypeEnum(value);
            }
            return result;
        }

        public static SharetypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SharetypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "id")

    private UUID id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    /** 带宽的计费类型。取值为：traffic（按流量计费）、bandwidth（按带宽计费）未传该字段，表示按带宽计费。字段值为空，表示按带宽计费。
     * 说明：如果sharetype是WHOLE并且id有值，仅支持按带宽计费，该参数会忽略。 */
    public static final class ChargemodeEnum {

        /** Enum TRAFFIC for value: "traffic" */
        public static final ChargemodeEnum TRAFFIC = new ChargemodeEnum("traffic");

        /** Enum BANDWIDTH for value: "bandwidth" */
        public static final ChargemodeEnum BANDWIDTH = new ChargemodeEnum("bandwidth");

        private static final Map<String, ChargemodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargemodeEnum> createStaticFields() {
            Map<String, ChargemodeEnum> map = new HashMap<>();
            map.put("traffic", TRAFFIC);
            map.put("bandwidth", BANDWIDTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargemodeEnum(String value) {
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
        public static ChargemodeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ChargemodeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ChargemodeEnum(value);
            }
            return result;
        }

        public static ChargemodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ChargemodeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargemodeEnum) {
                return this.value.equals(((ChargemodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chargemode")

    private ChargemodeEnum chargemode;

    public BandWidth withName(String name) {
        this.name = name;
        return this;
    }

    /** 带宽名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BandWidth withSharetype(SharetypeEnum sharetype) {
        this.sharetype = sharetype;
        return this;
    }

    /** 带宽的共享类型。共享类型枚举：PER，表示独享；WHOLE，表示共享
     * 
     * @return sharetype */
    public SharetypeEnum getSharetype() {
        return sharetype;
    }

    public void setSharetype(SharetypeEnum sharetype) {
        this.sharetype = sharetype;
    }

    public BandWidth withId(UUID id) {
        this.id = id;
        return this;
    }

    /** 共享带宽ID。创建WHOLE类型带宽的弹性公网IP时可以指定之前的共享带宽创建。共享带宽的使用限制请参见“共享带宽简介”。 说明：当创建WHOLE类型的带宽时，该字段必选。
     * 
     * @return id */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BandWidth withSize(Integer size) {
        this.size = size;
        return this;
    }

    /** 取值范围：默认5Mbit/s~2000Mbit/s（具体范围以各Region配置为准，请参见管理控制台对应页面显示）。功能说明：带宽大小。共享带宽的大小有最小值限制，默认为5M。
     * 说明：如果传入的参数为小数（如10.2）或者字符类型（如10），会自动强制转换为整数。带宽小于300Mbit/s时，步长支持1Mbit/s；带宽为300Mbit/s~1000Mbit/s时，步长支持50Mbit/s；带宽为1000Mbit/s~2000Mbit/s时，步长支持1000Mbit/s。如果sharetype是PER，该参数必选；如果sharetype是WHOLE并且id有值，该参数会忽略。
     * 
     * @return size */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public BandWidth withChargemode(ChargemodeEnum chargemode) {
        this.chargemode = chargemode;
        return this;
    }

    /** 带宽的计费类型。取值为：traffic（按流量计费）、bandwidth（按带宽计费）未传该字段，表示按带宽计费。字段值为空，表示按带宽计费。
     * 说明：如果sharetype是WHOLE并且id有值，仅支持按带宽计费，该参数会忽略。
     * 
     * @return chargemode */
    public ChargemodeEnum getChargemode() {
        return chargemode;
    }

    public void setChargemode(ChargemodeEnum chargemode) {
        this.chargemode = chargemode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BandWidth bandWidth = (BandWidth) o;
        return Objects.equals(this.name, bandWidth.name) && Objects.equals(this.sharetype, bandWidth.sharetype)
            && Objects.equals(this.id, bandWidth.id) && Objects.equals(this.size, bandWidth.size)
            && Objects.equals(this.chargemode, bandWidth.chargemode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sharetype, id, size, chargemode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BandWidth {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sharetype: ").append(toIndentedString(sharetype)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    chargemode: ").append(toIndentedString(chargemode)).append("\n");
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
