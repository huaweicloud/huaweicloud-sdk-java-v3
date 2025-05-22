package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释**： 重分布请求。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class RedistributionReq {

    /**
     * **参数解释**： 重分布模式 **约束限制**： 不涉及。 **取值范围**： online：在线重分布； offline：离线重分布； **默认取值**： offline
     */
    public static final class RedisModeEnum {

        /**
         * Enum OFFLINE for value: "offline"
         */
        public static final RedisModeEnum OFFLINE = new RedisModeEnum("offline");

        /**
         * Enum ONLINE for value: "online"
         */
        public static final RedisModeEnum ONLINE = new RedisModeEnum("online");

        private static final Map<String, RedisModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RedisModeEnum> createStaticFields() {
            Map<String, RedisModeEnum> map = new HashMap<>();
            map.put("offline", OFFLINE);
            map.put("online", ONLINE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RedisModeEnum(String value) {
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
        public static RedisModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RedisModeEnum(value));
        }

        public static RedisModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RedisModeEnum) {
                return this.value.equals(((RedisModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_mode")

    private RedisModeEnum redisMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_jobs")

    private Integer parallelJobs;

    public RedistributionReq withRedisMode(RedisModeEnum redisMode) {
        this.redisMode = redisMode;
        return this;
    }

    /**
     * **参数解释**： 重分布模式 **约束限制**： 不涉及。 **取值范围**： online：在线重分布； offline：离线重分布； **默认取值**： offline
     * @return redisMode
     */
    public RedisModeEnum getRedisMode() {
        return redisMode;
    }

    public void setRedisMode(RedisModeEnum redisMode) {
        this.redisMode = redisMode;
    }

    public RedistributionReq withParallelJobs(Integer parallelJobs) {
        this.parallelJobs = parallelJobs;
        return this;
    }

    /**
     * **参数解释**： 重分布并发数。 **约束限制**： 不涉及。 **取值范围**： 4~200 **默认取值**： 4
     * minimum: 4
     * maximum: 200
     * @return parallelJobs
     */
    public Integer getParallelJobs() {
        return parallelJobs;
    }

    public void setParallelJobs(Integer parallelJobs) {
        this.parallelJobs = parallelJobs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RedistributionReq that = (RedistributionReq) obj;
        return Objects.equals(this.redisMode, that.redisMode) && Objects.equals(this.parallelJobs, that.parallelJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(redisMode, parallelJobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedistributionReq {\n");
        sb.append("    redisMode: ").append(toIndentedString(redisMode)).append("\n");
        sb.append("    parallelJobs: ").append(toIndentedString(parallelJobs)).append("\n");
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
