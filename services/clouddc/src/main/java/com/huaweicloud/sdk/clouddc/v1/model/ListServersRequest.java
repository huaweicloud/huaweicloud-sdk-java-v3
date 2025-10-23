package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListServersRequest {

    /**
     * **参数解释**： 服务器管理状态 **约束限制**： 不涉及 **取值范围**： - onboard：上架中，用户下单，完成LLD设计。 - ready：交付完成，完成硬装、网调、服务器初始化、软调及转维验收。 - in-use：使用中，用户发放裸机。 - frozen：冻结，因欠费导致资源冻结。 - offboarding：下架中。  **默认取值**： 不涉及
     */
    public static final class ManageStateEnum {

        /**
         * Enum ONBOARD for value: "onboard"
         */
        public static final ManageStateEnum ONBOARD = new ManageStateEnum("onboard");

        /**
         * Enum READY for value: "ready"
         */
        public static final ManageStateEnum READY = new ManageStateEnum("ready");

        /**
         * Enum IN_USE for value: "in-use"
         */
        public static final ManageStateEnum IN_USE = new ManageStateEnum("in-use");

        /**
         * Enum FROZEN for value: "frozen"
         */
        public static final ManageStateEnum FROZEN = new ManageStateEnum("frozen");

        /**
         * Enum OFFBOARDING for value: "offboarding"
         */
        public static final ManageStateEnum OFFBOARDING = new ManageStateEnum("offboarding");

        private static final Map<String, ManageStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ManageStateEnum> createStaticFields() {
            Map<String, ManageStateEnum> map = new HashMap<>();
            map.put("onboard", ONBOARD);
            map.put("ready", READY);
            map.put("in-use", IN_USE);
            map.put("frozen", FROZEN);
            map.put("offboarding", OFFBOARDING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ManageStateEnum(String value) {
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
        public static ManageStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ManageStateEnum(value));
        }

        public static ManageStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ManageStateEnum) {
                return this.value.equals(((ManageStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manage_state")

    private ManageStateEnum manageState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListServersRequest withManageState(ManageStateEnum manageState) {
        this.manageState = manageState;
        return this;
    }

    /**
     * **参数解释**： 服务器管理状态 **约束限制**： 不涉及 **取值范围**： - onboard：上架中，用户下单，完成LLD设计。 - ready：交付完成，完成硬装、网调、服务器初始化、软调及转维验收。 - in-use：使用中，用户发放裸机。 - frozen：冻结，因欠费导致资源冻结。 - offboarding：下架中。  **默认取值**： 不涉及
     * @return manageState
     */
    public ManageStateEnum getManageState() {
        return manageState;
    }

    public void setManageState(ManageStateEnum manageState) {
        this.manageState = manageState;
    }

    public ListServersRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 上一页数据的最后一条记录的id
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListServersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页查询时每页行数。最大值为 1000。  默认值： 当不设置值或设置的值小于 10 时，默认值为 10。 当设置的值大于 1000 时，默认值为 1000。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListServersRequest that = (ListServersRequest) obj;
        return Objects.equals(this.manageState, that.manageState) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manageState, marker, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServersRequest {\n");
        sb.append("    manageState: ").append(toIndentedString(manageState)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
