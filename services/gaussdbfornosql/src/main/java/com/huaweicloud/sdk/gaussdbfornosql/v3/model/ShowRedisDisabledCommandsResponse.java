package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

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
public class ShowRedisDisabledCommandsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private String totalCount;

    /**
     * 禁用类型。
     */
    public static final class DisabledTypeEnum {

        /**
         * Enum COMMAND for value: "command"
         */
        public static final DisabledTypeEnum COMMAND = new DisabledTypeEnum("command");

        /**
         * Enum KEY for value: "key"
         */
        public static final DisabledTypeEnum KEY = new DisabledTypeEnum("key");

        private static final Map<String, DisabledTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DisabledTypeEnum> createStaticFields() {
            Map<String, DisabledTypeEnum> map = new HashMap<>();
            map.put("command", COMMAND);
            map.put("key", KEY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DisabledTypeEnum(String value) {
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
        public static DisabledTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DisabledTypeEnum(value));
        }

        public static DisabledTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DisabledTypeEnum) {
                return this.value.equals(((DisabledTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled_type")

    private DisabledTypeEnum disabledType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commands")

    private List<String> commands = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keys")

    private List<RedisDisabledCommandsDetail> keys = null;

    public ShowRedisDisabledCommandsResponse withTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数。
     * @return totalCount
     */
    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public ShowRedisDisabledCommandsResponse withDisabledType(DisabledTypeEnum disabledType) {
        this.disabledType = disabledType;
        return this;
    }

    /**
     * 禁用类型。
     * @return disabledType
     */
    public DisabledTypeEnum getDisabledType() {
        return disabledType;
    }

    public void setDisabledType(DisabledTypeEnum disabledType) {
        this.disabledType = disabledType;
    }

    public ShowRedisDisabledCommandsResponse withCommands(List<String> commands) {
        this.commands = commands;
        return this;
    }

    public ShowRedisDisabledCommandsResponse addCommandsItem(String commandsItem) {
        if (this.commands == null) {
            this.commands = new ArrayList<>();
        }
        this.commands.add(commandsItem);
        return this;
    }

    public ShowRedisDisabledCommandsResponse withCommands(Consumer<List<String>> commandsSetter) {
        if (this.commands == null) {
            this.commands = new ArrayList<>();
        }
        commandsSetter.accept(this.commands);
        return this;
    }

    /**
     * disabled_type为command时展示该参数。
     * @return commands
     */
    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    public ShowRedisDisabledCommandsResponse withKeys(List<RedisDisabledCommandsDetail> keys) {
        this.keys = keys;
        return this;
    }

    public ShowRedisDisabledCommandsResponse addKeysItem(RedisDisabledCommandsDetail keysItem) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        this.keys.add(keysItem);
        return this;
    }

    public ShowRedisDisabledCommandsResponse withKeys(Consumer<List<RedisDisabledCommandsDetail>> keysSetter) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        keysSetter.accept(this.keys);
        return this;
    }

    /**
     * disabled_type为key时展示该参数，最多20个。
     * @return keys
     */
    public List<RedisDisabledCommandsDetail> getKeys() {
        return keys;
    }

    public void setKeys(List<RedisDisabledCommandsDetail> keys) {
        this.keys = keys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRedisDisabledCommandsResponse that = (ShowRedisDisabledCommandsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.disabledType, that.disabledType)
            && Objects.equals(this.commands, that.commands) && Objects.equals(this.keys, that.keys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, disabledType, commands, keys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRedisDisabledCommandsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    disabledType: ").append(toIndentedString(disabledType)).append("\n");
        sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
        sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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
