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
 * 扩容磁盘请求。
 */
public class ExpandDesktopsVolumesReq {

    /**
     * 桌面类别  - DESKTOP：普通桌面。 - RENDER-DESKTOP：渲染桌面。
     */
    public static final class DesktopTypeEnum {

        /**
         * Enum DESKTOP for value: "DESKTOP"
         */
        public static final DesktopTypeEnum DESKTOP = new DesktopTypeEnum("DESKTOP");

        /**
         * Enum RENDER_DESKTOP for value: "RENDER-DESKTOP"
         */
        public static final DesktopTypeEnum RENDER_DESKTOP = new DesktopTypeEnum("RENDER-DESKTOP");

        private static final Map<String, DesktopTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DesktopTypeEnum> createStaticFields() {
            Map<String, DesktopTypeEnum> map = new HashMap<>();
            map.put("DESKTOP", DESKTOP);
            map.put("RENDER-DESKTOP", RENDER_DESKTOP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DesktopTypeEnum(String value) {
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
        public static DesktopTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DesktopTypeEnum(value));
        }

        public static DesktopTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DesktopTypeEnum) {
                return this.value.equals(((DesktopTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_type")

    private DesktopTypeEnum desktopType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_volumes_expansion")

    private List<ExpandVolumesReq> desktopVolumesExpansion = null;

    public ExpandDesktopsVolumesReq withDesktopType(DesktopTypeEnum desktopType) {
        this.desktopType = desktopType;
        return this;
    }

    /**
     * 桌面类别  - DESKTOP：普通桌面。 - RENDER-DESKTOP：渲染桌面。
     * @return desktopType
     */
    public DesktopTypeEnum getDesktopType() {
        return desktopType;
    }

    public void setDesktopType(DesktopTypeEnum desktopType) {
        this.desktopType = desktopType;
    }

    public ExpandDesktopsVolumesReq withDesktopVolumesExpansion(List<ExpandVolumesReq> desktopVolumesExpansion) {
        this.desktopVolumesExpansion = desktopVolumesExpansion;
        return this;
    }

    public ExpandDesktopsVolumesReq addDesktopVolumesExpansionItem(ExpandVolumesReq desktopVolumesExpansionItem) {
        if (this.desktopVolumesExpansion == null) {
            this.desktopVolumesExpansion = new ArrayList<>();
        }
        this.desktopVolumesExpansion.add(desktopVolumesExpansionItem);
        return this;
    }

    public ExpandDesktopsVolumesReq withDesktopVolumesExpansion(
        Consumer<List<ExpandVolumesReq>> desktopVolumesExpansionSetter) {
        if (this.desktopVolumesExpansion == null) {
            this.desktopVolumesExpansion = new ArrayList<>();
        }
        desktopVolumesExpansionSetter.accept(this.desktopVolumesExpansion);
        return this;
    }

    /**
     * 扩容磁盘参数。
     * @return desktopVolumesExpansion
     */
    public List<ExpandVolumesReq> getDesktopVolumesExpansion() {
        return desktopVolumesExpansion;
    }

    public void setDesktopVolumesExpansion(List<ExpandVolumesReq> desktopVolumesExpansion) {
        this.desktopVolumesExpansion = desktopVolumesExpansion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExpandDesktopsVolumesReq that = (ExpandDesktopsVolumesReq) obj;
        return Objects.equals(this.desktopType, that.desktopType)
            && Objects.equals(this.desktopVolumesExpansion, that.desktopVolumesExpansion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopType, desktopVolumesExpansion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandDesktopsVolumesReq {\n");
        sb.append("    desktopType: ").append(toIndentedString(desktopType)).append("\n");
        sb.append("    desktopVolumesExpansion: ").append(toIndentedString(desktopVolumesExpansion)).append("\n");
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
