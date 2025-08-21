package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class LockRepositoryResponse extends SdkResponse {

    /**
     * 锁定状态 - true 已锁定 - false 未锁定 
     */
    public static final class LockedEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final LockedEnum TRUE = new LockedEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final LockedEnum FALSE = new LockedEnum("false");

        private static final Map<String, LockedEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LockedEnum> createStaticFields() {
            Map<String, LockedEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LockedEnum(String value) {
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
        public static LockedEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LockedEnum(value));
        }

        public static LockedEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LockedEnum) {
                return this.value.equals(((LockedEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    private LockedEnum locked;

    public LockRepositoryResponse withLocked(LockedEnum locked) {
        this.locked = locked;
        return this;
    }

    /**
     * 锁定状态 - true 已锁定 - false 未锁定 
     * @return locked
     */
    public LockedEnum getLocked() {
        return locked;
    }

    public void setLocked(LockedEnum locked) {
        this.locked = locked;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LockRepositoryResponse that = (LockRepositoryResponse) obj;
        return Objects.equals(this.locked, that.locked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locked);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LockRepositoryResponse {\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
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
