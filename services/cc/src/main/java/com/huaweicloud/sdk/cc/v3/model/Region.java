package com.huaweicloud.sdk.cc.v3.model;

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
 * 支持的Region。
 */
public class Region {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_id")

    private AreaIdDef areaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_name")

    private String areaName;

    /**
     * Gets or Sets usedScenes
     */
    public static final class UsedScenesEnum {

        /**
         * Enum ER for value: "er"
         */
        public static final UsedScenesEnum ER = new UsedScenesEnum("er");

        /**
         * Enum VPC for value: "vpc"
         */
        public static final UsedScenesEnum VPC = new UsedScenesEnum("vpc");

        /**
         * Enum VGW for value: "vgw"
         */
        public static final UsedScenesEnum VGW = new UsedScenesEnum("vgw");

        private static final Map<String, UsedScenesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UsedScenesEnum> createStaticFields() {
            Map<String, UsedScenesEnum> map = new HashMap<>();
            map.put("er", ER);
            map.put("vpc", VPC);
            map.put("vgw", VGW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UsedScenesEnum(String value) {
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
        public static UsedScenesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UsedScenesEnum(value));
        }

        public static UsedScenesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UsedScenesEnum) {
                return this.value.equals(((UsedScenesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_scenes")

    private List<UsedScenesEnum> usedScenes = null;

    public Region withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region withAreaId(AreaIdDef areaId) {
        this.areaId = areaId;
        return this;
    }

    /**
     * Get areaId
     * @return areaId
     */
    public AreaIdDef getAreaId() {
        return areaId;
    }

    public void setAreaId(AreaIdDef areaId) {
        this.areaId = areaId;
    }

    public Region withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Region ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Region withAreaName(String areaName) {
        this.areaName = areaName;
        return this;
    }

    /**
     * 大区名。
     * @return areaName
     */
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Region withUsedScenes(List<UsedScenesEnum> usedScenes) {
        this.usedScenes = usedScenes;
        return this;
    }

    public Region addUsedScenesItem(UsedScenesEnum usedScenesItem) {
        if (this.usedScenes == null) {
            this.usedScenes = new ArrayList<>();
        }
        this.usedScenes.add(usedScenesItem);
        return this;
    }

    public Region withUsedScenes(Consumer<List<UsedScenesEnum>> usedScenesSetter) {
        if (this.usedScenes == null) {
            this.usedScenes = new ArrayList<>();
        }
        usedScenesSetter.accept(this.usedScenes);
        return this;
    }

    /**
     * 云连接使用场景 er vpc vgw。
     * @return usedScenes
     */
    public List<UsedScenesEnum> getUsedScenes() {
        return usedScenes;
    }

    public void setUsedScenes(List<UsedScenesEnum> usedScenes) {
        this.usedScenes = usedScenes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Region that = (Region) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.areaId, that.areaId)
            && Objects.equals(this.id, that.id) && Objects.equals(this.areaName, that.areaName)
            && Objects.equals(this.usedScenes, that.usedScenes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, areaId, id, areaName, usedScenes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Region {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    areaId: ").append(toIndentedString(areaId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    areaName: ").append(toIndentedString(areaName)).append("\n");
        sb.append("    usedScenes: ").append(toIndentedString(usedScenes)).append("\n");
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
