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
 * 变更桌面池请求。
 */
public class ResizeDesktopPoolReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    /**
     * 处理类型 - ONLY_FOR_EXPAND：仅对新扩容桌面生效 - FOR_EXPAND_AND_IDLE：对新扩容桌面与空闲桌面生效 - FOR_EXPAND_AND_ALL：对新扩容桌面与已有全部桌面生效
     */
    public static final class HandleTypeEnum {

        /**
         * Enum ONLY_FOR_EXPAND for value: "ONLY_FOR_EXPAND"
         */
        public static final HandleTypeEnum ONLY_FOR_EXPAND = new HandleTypeEnum("ONLY_FOR_EXPAND");

        /**
         * Enum FOR_EXPAND_AND_IDLE for value: "FOR_EXPAND_AND_IDLE"
         */
        public static final HandleTypeEnum FOR_EXPAND_AND_IDLE = new HandleTypeEnum("FOR_EXPAND_AND_IDLE");

        /**
         * Enum FOR_EXPAND_AND_ALL for value: "FOR_EXPAND_AND_ALL"
         */
        public static final HandleTypeEnum FOR_EXPAND_AND_ALL = new HandleTypeEnum("FOR_EXPAND_AND_ALL");

        private static final Map<String, HandleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HandleTypeEnum> createStaticFields() {
            Map<String, HandleTypeEnum> map = new HashMap<>();
            map.put("ONLY_FOR_EXPAND", ONLY_FOR_EXPAND);
            map.put("FOR_EXPAND_AND_IDLE", FOR_EXPAND_AND_IDLE);
            map.put("FOR_EXPAND_AND_ALL", FOR_EXPAND_AND_ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HandleTypeEnum(String value) {
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
        public static HandleTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HandleTypeEnum(value));
        }

        public static HandleTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HandleTypeEnum) {
                return this.value.equals(((HandleTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_type")

    private HandleTypeEnum handleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_ids")

    private List<String> desktopIds = null;

    public ResizeDesktopPoolReq withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 目标规格产品ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ResizeDesktopPoolReq withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 产品规格ID。
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public ResizeDesktopPoolReq withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 是否支持开机状态下执行变更规格操作。固定传值STOP_DESKTOP，如果桌面处于开机状态，会先关机再变更规格。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public ResizeDesktopPoolReq withHandleType(HandleTypeEnum handleType) {
        this.handleType = handleType;
        return this;
    }

    /**
     * 处理类型 - ONLY_FOR_EXPAND：仅对新扩容桌面生效 - FOR_EXPAND_AND_IDLE：对新扩容桌面与空闲桌面生效 - FOR_EXPAND_AND_ALL：对新扩容桌面与已有全部桌面生效
     * @return handleType
     */
    public HandleTypeEnum getHandleType() {
        return handleType;
    }

    public void setHandleType(HandleTypeEnum handleType) {
        this.handleType = handleType;
    }

    public ResizeDesktopPoolReq withDesktopIds(List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }

    public ResizeDesktopPoolReq addDesktopIdsItem(String desktopIdsItem) {
        if (this.desktopIds == null) {
            this.desktopIds = new ArrayList<>();
        }
        this.desktopIds.add(desktopIdsItem);
        return this;
    }

    public ResizeDesktopPoolReq withDesktopIds(Consumer<List<String>> desktopIdsSetter) {
        if (this.desktopIds == null) {
            this.desktopIds = new ArrayList<>();
        }
        desktopIdsSetter.accept(this.desktopIds);
        return this;
    }

    /**
     * 桌面id
     * @return desktopIds
     */
    public List<String> getDesktopIds() {
        return desktopIds;
    }

    public void setDesktopIds(List<String> desktopIds) {
        this.desktopIds = desktopIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResizeDesktopPoolReq that = (ResizeDesktopPoolReq) obj;
        return Objects.equals(this.productId, that.productId) && Objects.equals(this.flavorId, that.flavorId)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.handleType, that.handleType)
            && Objects.equals(this.desktopIds, that.desktopIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, flavorId, mode, handleType, desktopIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeDesktopPoolReq {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    handleType: ").append(toIndentedString(handleType)).append("\n");
        sb.append("    desktopIds: ").append(toIndentedString(desktopIds)).append("\n");
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
