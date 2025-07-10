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
 * UpdateAccessPolicyReq
 */
public class UpdateAccessPolicyReq {

    /**
     * 操作类别。 * ADD_IP： 添加IP * DELETE_IP： 删除IP
     */
    public static final class OperationTypeEnum {

        /**
         * Enum ADD_IP for value: "ADD_IP"
         */
        public static final OperationTypeEnum ADD_IP = new OperationTypeEnum("ADD_IP");

        /**
         * Enum DELETE_IP for value: "DELETE_IP"
         */
        public static final OperationTypeEnum DELETE_IP = new OperationTypeEnum("DELETE_IP");

        private static final Map<String, OperationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationTypeEnum> createStaticFields() {
            Map<String, OperationTypeEnum> map = new HashMap<>();
            map.put("ADD_IP", ADD_IP);
            map.put("DELETE_IP", DELETE_IP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationTypeEnum(String value) {
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
        public static OperationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperationTypeEnum(value));
        }

        public static OperationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationTypeEnum) {
                return this.value.equals(((OperationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private OperationTypeEnum operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_white_list")

    private List<IpInfo> ipWhiteList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_enable")

    private Boolean isEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_block_all")

    private Boolean isBlockAll;

    public UpdateAccessPolicyReq withOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 操作类别。 * ADD_IP： 添加IP * DELETE_IP： 删除IP
     * @return operationType
     */
    public OperationTypeEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
    }

    public UpdateAccessPolicyReq withIpWhiteList(List<IpInfo> ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
        return this;
    }

    public UpdateAccessPolicyReq addIpWhiteListItem(IpInfo ipWhiteListItem) {
        if (this.ipWhiteList == null) {
            this.ipWhiteList = new ArrayList<>();
        }
        this.ipWhiteList.add(ipWhiteListItem);
        return this;
    }

    public UpdateAccessPolicyReq withIpWhiteList(Consumer<List<IpInfo>> ipWhiteListSetter) {
        if (this.ipWhiteList == null) {
            this.ipWhiteList = new ArrayList<>();
        }
        ipWhiteListSetter.accept(this.ipWhiteList);
        return this;
    }

    /**
     * 策略的ip列表。
     * @return ipWhiteList
     */
    public List<IpInfo> getIpWhiteList() {
        return ipWhiteList;
    }

    public void setIpWhiteList(List<IpInfo> ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
    }

    public UpdateAccessPolicyReq withIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
        return this;
    }

    /**
     * IP白名单是否生效。
     * @return isEnable
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    public UpdateAccessPolicyReq withIsBlockAll(Boolean isBlockAll) {
        this.isBlockAll = isBlockAll;
        return this;
    }

    /**
     * IP白名单是否禁止所有Ip接入。
     * @return isBlockAll
     */
    public Boolean getIsBlockAll() {
        return isBlockAll;
    }

    public void setIsBlockAll(Boolean isBlockAll) {
        this.isBlockAll = isBlockAll;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAccessPolicyReq that = (UpdateAccessPolicyReq) obj;
        return Objects.equals(this.operationType, that.operationType)
            && Objects.equals(this.ipWhiteList, that.ipWhiteList) && Objects.equals(this.isEnable, that.isEnable)
            && Objects.equals(this.isBlockAll, that.isBlockAll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationType, ipWhiteList, isEnable, isBlockAll);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAccessPolicyReq {\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    ipWhiteList: ").append(toIndentedString(ipWhiteList)).append("\n");
        sb.append("    isEnable: ").append(toIndentedString(isEnable)).append("\n");
        sb.append("    isBlockAll: ").append(toIndentedString(isBlockAll)).append("\n");
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
