package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Follow302StatusBody
 */
public class Follow302StatusBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    /**
     * follow302状态，off：关闭，on：开启。
     */
    public static final class FollowStatusEnum {

        /**
         * Enum OFF for value: "off"
         */
        public static final FollowStatusEnum OFF = new FollowStatusEnum("off");

        /**
         * Enum ON for value: "on"
         */
        public static final FollowStatusEnum ON = new FollowStatusEnum("on");

        private static final Map<String, FollowStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FollowStatusEnum> createStaticFields() {
            Map<String, FollowStatusEnum> map = new HashMap<>();
            map.put("off", OFF);
            map.put("on", ON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FollowStatusEnum(String value) {
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
        public static FollowStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FollowStatusEnum(value));
        }

        public static FollowStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FollowStatusEnum) {
                return this.value.equals(((FollowStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "follow_status")

    private FollowStatusEnum followStatus;

    public Follow302StatusBody withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 加速域名id。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public Follow302StatusBody withFollowStatus(FollowStatusEnum followStatus) {
        this.followStatus = followStatus;
        return this;
    }

    /**
     * follow302状态，off：关闭，on：开启。
     * @return followStatus
     */
    public FollowStatusEnum getFollowStatus() {
        return followStatus;
    }

    public void setFollowStatus(FollowStatusEnum followStatus) {
        this.followStatus = followStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Follow302StatusBody that = (Follow302StatusBody) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.followStatus, that.followStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, followStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Follow302StatusBody {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    followStatus: ").append(toIndentedString(followStatus)).append("\n");
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
