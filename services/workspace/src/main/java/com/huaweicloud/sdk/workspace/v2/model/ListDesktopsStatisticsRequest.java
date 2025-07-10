package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListDesktopsStatisticsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_type")

    private List<String> desktopType = null;

    /**
     * Gets or Sets statisticsType
     */
    public static final class StatisticsTypeEnum {

        /**
         * Enum ATTACH_STATE for value: "attach-state"
         */
        public static final StatisticsTypeEnum ATTACH_STATE = new StatisticsTypeEnum("attach-state");

        /**
         * Enum LOGIN_STATE for value: "login-state"
         */
        public static final StatisticsTypeEnum LOGIN_STATE = new StatisticsTypeEnum("login-state");

        /**
         * Enum RUN_STATE for value: "run-state"
         */
        public static final StatisticsTypeEnum RUN_STATE = new StatisticsTypeEnum("run-state");

        private static final Map<String, StatisticsTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatisticsTypeEnum> createStaticFields() {
            Map<String, StatisticsTypeEnum> map = new HashMap<>();
            map.put("attach-state", ATTACH_STATE);
            map.put("login-state", LOGIN_STATE);
            map.put("run-state", RUN_STATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatisticsTypeEnum(String value) {
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
        public static StatisticsTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatisticsTypeEnum(value));
        }

        public static StatisticsTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatisticsTypeEnum) {
                return this.value.equals(((StatisticsTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics_type")

    private List<StatisticsTypeEnum> statisticsType = null;

    public ListDesktopsStatisticsRequest withDesktopType(List<String> desktopType) {
        this.desktopType = desktopType;
        return this;
    }

    public ListDesktopsStatisticsRequest addDesktopTypeItem(String desktopTypeItem) {
        if (this.desktopType == null) {
            this.desktopType = new ArrayList<>();
        }
        this.desktopType.add(desktopTypeItem);
        return this;
    }

    public ListDesktopsStatisticsRequest withDesktopType(Consumer<List<String>> desktopTypeSetter) {
        if (this.desktopType == null) {
            this.desktopType = new ArrayList<>();
        }
        desktopTypeSetter.accept(this.desktopType);
        return this;
    }

    /**
     * 桌面类型，为空时查所有桌面。 - DEDICATED：普通桌面，包括专享桌面、专属桌面等 - POOLED：池桌面，即桌面池里的桌面
     * @return desktopType
     */
    public List<String> getDesktopType() {
        return desktopType;
    }

    public void setDesktopType(List<String> desktopType) {
        this.desktopType = desktopType;
    }

    public ListDesktopsStatisticsRequest withStatisticsType(List<StatisticsTypeEnum> statisticsType) {
        this.statisticsType = statisticsType;
        return this;
    }

    public ListDesktopsStatisticsRequest addStatisticsTypeItem(StatisticsTypeEnum statisticsTypeItem) {
        if (this.statisticsType == null) {
            this.statisticsType = new ArrayList<>();
        }
        this.statisticsType.add(statisticsTypeItem);
        return this;
    }

    public ListDesktopsStatisticsRequest withStatisticsType(Consumer<List<StatisticsTypeEnum>> statisticsTypeSetter) {
        if (this.statisticsType == null) {
            this.statisticsType = new ArrayList<>();
        }
        statisticsTypeSetter.accept(this.statisticsType);
        return this;
    }

    /**
     * 统计类型，为空时仅统计桌面总数 |- - attach-state 按照分配状态统计 - login-state 按照登录状态统计 - run-state 按照运行状态统计。
     * @return statisticsType
     */
    public List<StatisticsTypeEnum> getStatisticsType() {
        return statisticsType;
    }

    public void setStatisticsType(List<StatisticsTypeEnum> statisticsType) {
        this.statisticsType = statisticsType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDesktopsStatisticsRequest that = (ListDesktopsStatisticsRequest) obj;
        return Objects.equals(this.desktopType, that.desktopType)
            && Objects.equals(this.statisticsType, that.statisticsType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopType, statisticsType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDesktopsStatisticsRequest {\n");
        sb.append("    desktopType: ").append(toIndentedString(desktopType)).append("\n");
        sb.append("    statisticsType: ").append(toIndentedString(statisticsType)).append("\n");
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
