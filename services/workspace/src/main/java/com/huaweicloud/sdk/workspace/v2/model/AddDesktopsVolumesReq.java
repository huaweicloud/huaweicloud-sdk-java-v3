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
 * 增加磁盘请求。
 */
public class AddDesktopsVolumesReq {

    /**
     * 桌面类别  - DESKTOP：普通桌面。 - RENDER_DESKTOP：渲染桌面。
     */
    public static final class DesktopTypeEnum {

        /**
         * Enum DESKTOP for value: "DESKTOP"
         */
        public static final DesktopTypeEnum DESKTOP = new DesktopTypeEnum("DESKTOP");

        /**
         * Enum RENDER_DESKTOP for value: "RENDER_DESKTOP"
         */
        public static final DesktopTypeEnum RENDER_DESKTOP = new DesktopTypeEnum("RENDER_DESKTOP");

        private static final Map<String, DesktopTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DesktopTypeEnum> createStaticFields() {
            Map<String, DesktopTypeEnum> map = new HashMap<>();
            map.put("DESKTOP", DESKTOP);
            map.put("RENDER_DESKTOP", RENDER_DESKTOP);
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
    @JsonProperty(value = "desktop_volumes")

    private List<AddDesktopVolumesReq> desktopVolumes = null;

    public AddDesktopsVolumesReq withDesktopType(DesktopTypeEnum desktopType) {
        this.desktopType = desktopType;
        return this;
    }

    /**
     * 桌面类别  - DESKTOP：普通桌面。 - RENDER_DESKTOP：渲染桌面。
     * @return desktopType
     */
    public DesktopTypeEnum getDesktopType() {
        return desktopType;
    }

    public void setDesktopType(DesktopTypeEnum desktopType) {
        this.desktopType = desktopType;
    }

    public AddDesktopsVolumesReq withDesktopVolumes(List<AddDesktopVolumesReq> desktopVolumes) {
        this.desktopVolumes = desktopVolumes;
        return this;
    }

    public AddDesktopsVolumesReq addDesktopVolumesItem(AddDesktopVolumesReq desktopVolumesItem) {
        if (this.desktopVolumes == null) {
            this.desktopVolumes = new ArrayList<>();
        }
        this.desktopVolumes.add(desktopVolumesItem);
        return this;
    }

    public AddDesktopsVolumesReq withDesktopVolumes(Consumer<List<AddDesktopVolumesReq>> desktopVolumesSetter) {
        if (this.desktopVolumes == null) {
            this.desktopVolumes = new ArrayList<>();
        }
        desktopVolumesSetter.accept(this.desktopVolumes);
        return this;
    }

    /**
     * 新增磁盘参数。
     * @return desktopVolumes
     */
    public List<AddDesktopVolumesReq> getDesktopVolumes() {
        return desktopVolumes;
    }

    public void setDesktopVolumes(List<AddDesktopVolumesReq> desktopVolumes) {
        this.desktopVolumes = desktopVolumes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddDesktopsVolumesReq that = (AddDesktopsVolumesReq) obj;
        return Objects.equals(this.desktopType, that.desktopType)
            && Objects.equals(this.desktopVolumes, that.desktopVolumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopType, desktopVolumes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDesktopsVolumesReq {\n");
        sb.append("    desktopType: ").append(toIndentedString(desktopType)).append("\n");
        sb.append("    desktopVolumes: ").append(toIndentedString(desktopVolumes)).append("\n");
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
