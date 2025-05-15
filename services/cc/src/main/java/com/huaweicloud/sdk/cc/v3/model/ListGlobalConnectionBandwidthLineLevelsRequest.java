package com.huaweicloud.sdk.cc.v3.model;

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
public class ListGlobalConnectionBandwidthLineLevelsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_area")

    private String localArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_area")

    private String remoteArea;

    /**
     * Gets or Sets levels
     */
    public static final class LevelsEnum {

        /**
         * Enum PT for value: "Pt"
         */
        public static final LevelsEnum PT = new LevelsEnum("Pt");

        /**
         * Enum AG for value: "Ag"
         */
        public static final LevelsEnum AG = new LevelsEnum("Ag");

        private static final Map<String, LevelsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LevelsEnum> createStaticFields() {
            Map<String, LevelsEnum> map = new HashMap<>();
            map.put("Pt", PT);
            map.put("Ag", AG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LevelsEnum(String value) {
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
        public static LevelsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LevelsEnum(value));
        }

        public static LevelsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LevelsEnum) {
                return this.value.equals(((LevelsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "levels")

    private List<LevelsEnum> levels = null;

    public ListGlobalConnectionBandwidthLineLevelsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的个数。 取值范围：1~1000。
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListGlobalConnectionBandwidthLineLevelsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 翻页信息，从上次API调用返回的翻页数据中获取，可填写前一页marker或者后一页marker，填入前一页previous_marker就向前翻页，后一页next_marker就向后翻页。 翻页过程中，查询条件不能修改，包括过滤条件、排序条件、limit。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListGlobalConnectionBandwidthLineLevelsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListGlobalConnectionBandwidthLineLevelsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListGlobalConnectionBandwidthLineLevelsRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 根据ID查询，可查询多个ID。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListGlobalConnectionBandwidthLineLevelsRequest withLocalArea(String localArea) {
        this.localArea = localArea;
        return this;
    }

    /**
     * 线路规格本端接入点编码信息。
     * @return localArea
     */
    public String getLocalArea() {
        return localArea;
    }

    public void setLocalArea(String localArea) {
        this.localArea = localArea;
    }

    public ListGlobalConnectionBandwidthLineLevelsRequest withRemoteArea(String remoteArea) {
        this.remoteArea = remoteArea;
        return this;
    }

    /**
     * 线路规格远端接入点编码信息。
     * @return remoteArea
     */
    public String getRemoteArea() {
        return remoteArea;
    }

    public void setRemoteArea(String remoteArea) {
        this.remoteArea = remoteArea;
    }

    public ListGlobalConnectionBandwidthLineLevelsRequest withLevels(List<LevelsEnum> levels) {
        this.levels = levels;
        return this;
    }

    public ListGlobalConnectionBandwidthLineLevelsRequest addLevelsItem(LevelsEnum levelsItem) {
        if (this.levels == null) {
            this.levels = new ArrayList<>();
        }
        this.levels.add(levelsItem);
        return this;
    }

    public ListGlobalConnectionBandwidthLineLevelsRequest withLevels(Consumer<List<LevelsEnum>> levelsSetter) {
        if (this.levels == null) {
            this.levels = new ArrayList<>();
        }
        levelsSetter.accept(this.levels);
        return this;
    }

    /**
     * 带宽等级信息： - Pt: 铂金 - Ag: 银
     * @return levels
     */
    public List<LevelsEnum> getLevels() {
        return levels;
    }

    public void setLevels(List<LevelsEnum> levels) {
        this.levels = levels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGlobalConnectionBandwidthLineLevelsRequest that = (ListGlobalConnectionBandwidthLineLevelsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.id, that.id) && Objects.equals(this.localArea, that.localArea)
            && Objects.equals(this.remoteArea, that.remoteArea) && Objects.equals(this.levels, that.levels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, id, localArea, remoteArea, levels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGlobalConnectionBandwidthLineLevelsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localArea: ").append(toIndentedString(localArea)).append("\n");
        sb.append("    remoteArea: ").append(toIndentedString(remoteArea)).append("\n");
        sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
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
