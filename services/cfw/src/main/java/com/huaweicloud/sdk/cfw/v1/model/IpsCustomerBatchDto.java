package com.huaweicloud.sdk.cfw.v1.model;

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
 * **参数解释：** 批量自定义IPS规则请求体 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class IpsCustomerBatchDto {

    /**
     * **参数解释**： 自定义IPS规则执行动作,仅更新自定义IPS规则场景下需要设置，其他场景无需设置 **约束限制**：   不涉及 **取值范围**： 0：只记录日志 1：重置/拦截 **默认取值**：   不涉及
     */
    public static final class ActionTypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ActionTypeEnum NUMBER_0 = new ActionTypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ActionTypeEnum NUMBER_1 = new ActionTypeEnum(1);

        private static final Map<Integer, ActionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ActionTypeEnum> createStaticFields() {
            Map<Integer, ActionTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ActionTypeEnum(Integer value) {
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
        public static ActionTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionTypeEnum(value));
        }

        public static ActionTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionTypeEnum) {
                return this.value.equals(((ActionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private ActionTypeEnum actionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_ids")

    private List<String> ipsIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    public IpsCustomerBatchDto withActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * **参数解释**： 自定义IPS规则执行动作,仅更新自定义IPS规则场景下需要设置，其他场景无需设置 **约束限制**：   不涉及 **取值范围**： 0：只记录日志 1：重置/拦截 **默认取值**：   不涉及
     * @return actionType
     */
    public ActionTypeEnum getActionType() {
        return actionType;
    }

    public void setActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
    }

    public IpsCustomerBatchDto withIpsIds(List<String> ipsIds) {
        this.ipsIds = ipsIds;
        return this;
    }

    public IpsCustomerBatchDto addIpsIdsItem(String ipsIdsItem) {
        if (this.ipsIds == null) {
            this.ipsIds = new ArrayList<>();
        }
        this.ipsIds.add(ipsIdsItem);
        return this;
    }

    public IpsCustomerBatchDto withIpsIds(Consumer<List<String>> ipsIdsSetter) {
        if (this.ipsIds == null) {
            this.ipsIds = new ArrayList<>();
        }
        ipsIdsSetter.accept(this.ipsIds);
        return this;
    }

    /**
     * **参数解释**： ips规则ID， 可通过调用获取ips规则列表获取，通过data.records.ips_id获取。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return ipsIds
     */
    public List<String> getIpsIds() {
        return ipsIds;
    }

    public void setIpsIds(List<String> ipsIds) {
        this.ipsIds = ipsIds;
    }

    public IpsCustomerBatchDto withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * **参数解释**： 防火墙ID，用户创建防火墙实例后产生的唯一ID，配置后可区分不同防火墙，可通过[防火墙ID获取方式](cfw_02_0028.xml)获取 **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return fwInstanceId
     */
    public String getFwInstanceId() {
        return fwInstanceId;
    }

    public void setFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IpsCustomerBatchDto that = (IpsCustomerBatchDto) obj;
        return Objects.equals(this.actionType, that.actionType) && Objects.equals(this.ipsIds, that.ipsIds)
            && Objects.equals(this.fwInstanceId, that.fwInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionType, ipsIds, fwInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpsCustomerBatchDto {\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    ipsIds: ").append(toIndentedString(ipsIds)).append("\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
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
