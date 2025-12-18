package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListTopTableVolumesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_volumes")

    private List<TableVolumeResult> tableVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    /**
     * **参数解释**: 任务状态。 **取值范围**: - RUNNING：运行中。 - ERROR：运行异常。 - FINISHED： 运行结束。 
     */
    public static final class StateEnum {

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StateEnum RUNNING = new StateEnum("RUNNING");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StateEnum ERROR = new StateEnum("ERROR");

        /**
         * Enum FINISHED for value: "FINISHED"
         */
        public static final StateEnum FINISHED = new StateEnum("FINISHED");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("RUNNING", RUNNING);
            map.put("ERROR", ERROR);
            map.put("FINISHED", FINISHED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    public ListTopTableVolumesResponse withTableVolumes(List<TableVolumeResult> tableVolumes) {
        this.tableVolumes = tableVolumes;
        return this;
    }

    public ListTopTableVolumesResponse addTableVolumesItem(TableVolumeResult tableVolumesItem) {
        if (this.tableVolumes == null) {
            this.tableVolumes = new ArrayList<>();
        }
        this.tableVolumes.add(tableVolumesItem);
        return this;
    }

    public ListTopTableVolumesResponse withTableVolumes(Consumer<List<TableVolumeResult>> tableVolumesSetter) {
        if (this.tableVolumes == null) {
            this.tableVolumes = new ArrayList<>();
        }
        tableVolumesSetter.accept(this.tableVolumes);
        return this;
    }

    /**
     * **参数解释**: 数据库表占用空间列表。 
     * @return tableVolumes
     */
    public List<TableVolumeResult> getTableVolumes() {
        return tableVolumes;
    }

    public void setTableVolumes(List<TableVolumeResult> tableVolumes) {
        this.tableVolumes = tableVolumes;
    }

    public ListTopTableVolumesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: 总数。 **取值范围**: 不涉及。 
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListTopTableVolumesResponse withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释**: 任务状态。 **取值范围**: - RUNNING：运行中。 - ERROR：运行异常。 - FINISHED： 运行结束。 
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTopTableVolumesResponse that = (ListTopTableVolumesResponse) obj;
        return Objects.equals(this.tableVolumes, that.tableVolumes) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableVolumes, totalCount, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopTableVolumesResponse {\n");
        sb.append("    tableVolumes: ").append(toIndentedString(tableVolumes)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
