package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
 * BindServerRouteRequestBody
 */
public class BindServerRouteRequestBody {

    /**
     * **参数解释**: 操作类型。 **约束限制**: 不涉及。 **取值范围**: - add：绑定服务端IP路由 - delete：解绑服务端IP路由  **默认取值**: 不涉及。
     */
    public static final class OperateEnum {

        /**
         * Enum ADD for value: "add"
         */
        public static final OperateEnum ADD = new OperateEnum("add");

        /**
         * Enum DELETE for value: "delete"
         */
        public static final OperateEnum DELETE = new OperateEnum("delete");

        private static final Map<String, OperateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperateEnum> createStaticFields() {
            Map<String, OperateEnum> map = new HashMap<>();
            map.put("add", ADD);
            map.put("delete", DELETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperateEnum(String value) {
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
        public static OperateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperateEnum(value));
        }

        public static OperateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperateEnum) {
                return this.value.equals(((OperateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate")

    private OperateEnum operate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_server_ips")

    private List<String> targetServerIps = null;

    public BindServerRouteRequestBody withOperate(OperateEnum operate) {
        this.operate = operate;
        return this;
    }

    /**
     * **参数解释**: 操作类型。 **约束限制**: 不涉及。 **取值范围**: - add：绑定服务端IP路由 - delete：解绑服务端IP路由  **默认取值**: 不涉及。
     * @return operate
     */
    public OperateEnum getOperate() {
        return operate;
    }

    public void setOperate(OperateEnum operate) {
        this.operate = operate;
    }

    public BindServerRouteRequestBody withTargetServerIps(List<String> targetServerIps) {
        this.targetServerIps = targetServerIps;
        return this;
    }

    public BindServerRouteRequestBody addTargetServerIpsItem(String targetServerIpsItem) {
        if (this.targetServerIps == null) {
            this.targetServerIps = new ArrayList<>();
        }
        this.targetServerIps.add(targetServerIpsItem);
        return this;
    }

    public BindServerRouteRequestBody withTargetServerIps(Consumer<List<String>> targetServerIpsSetter) {
        if (this.targetServerIps == null) {
            this.targetServerIps = new ArrayList<>();
        }
        targetServerIpsSetter.accept(this.targetServerIps);
        return this;
    }

    /**
     * **参数解释**: 服务端IP列表。 **约束限制**: 列表元素需要满足IPv4格式要求。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return targetServerIps
     */
    public List<String> getTargetServerIps() {
        return targetServerIps;
    }

    public void setTargetServerIps(List<String> targetServerIps) {
        this.targetServerIps = targetServerIps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BindServerRouteRequestBody that = (BindServerRouteRequestBody) obj;
        return Objects.equals(this.operate, that.operate) && Objects.equals(this.targetServerIps, that.targetServerIps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operate, targetServerIps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindServerRouteRequestBody {\n");
        sb.append("    operate: ").append(toIndentedString(operate)).append("\n");
        sb.append("    targetServerIps: ").append(toIndentedString(targetServerIps)).append("\n");
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
