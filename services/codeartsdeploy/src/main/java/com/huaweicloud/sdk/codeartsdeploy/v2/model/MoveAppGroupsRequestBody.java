package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * MoveAppGroupsRequestBody
 */
public class MoveAppGroupsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 移动方向，1为上移，-1为下移
     */
    public static final class MovementEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final MovementEnum NUMBER_1 = new MovementEnum(1);

        /**
         * Enum NUMBER_MINUS_1 for value: -1
         */
        public static final MovementEnum NUMBER_MINUS_1 = new MovementEnum(-1);

        private static final Map<Integer, MovementEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, MovementEnum> createStaticFields() {
            Map<Integer, MovementEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(-1, NUMBER_MINUS_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        MovementEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MovementEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MovementEnum(value));
        }

        public static MovementEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MovementEnum) {
                return this.value.equals(((MovementEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "movement")

    private MovementEnum movement;

    public MoveAppGroupsRequestBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 分组id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MoveAppGroupsRequestBody withMovement(MovementEnum movement) {
        this.movement = movement;
        return this;
    }

    /**
     * 移动方向，1为上移，-1为下移
     * @return movement
     */
    public MovementEnum getMovement() {
        return movement;
    }

    public void setMovement(MovementEnum movement) {
        this.movement = movement;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MoveAppGroupsRequestBody that = (MoveAppGroupsRequestBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.movement, that.movement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, movement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveAppGroupsRequestBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    movement: ").append(toIndentedString(movement)).append("\n");
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
