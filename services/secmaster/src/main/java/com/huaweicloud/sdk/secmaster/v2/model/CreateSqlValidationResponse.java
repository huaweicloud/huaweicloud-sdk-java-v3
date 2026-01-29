package com.huaweicloud.sdk.secmaster.v2.model;

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
public class CreateSqlValidationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    private List<TableItem> sources = null;

    /**
     * **参数解释**: sql模式 - STREAMING 流式处理 - BATCH 批处理  **约束限制** 不涉及 **取值范围**: - STREAMING - BATCH  **默认值** 不涉及
     */
    public static final class ModesEnum {

        /**
         * Enum STREAMING for value: "STREAMING"
         */
        public static final ModesEnum STREAMING = new ModesEnum("STREAMING");

        /**
         * Enum BATCH for value: "BATCH"
         */
        public static final ModesEnum BATCH = new ModesEnum("BATCH");

        private static final Map<String, ModesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModesEnum> createStaticFields() {
            Map<String, ModesEnum> map = new HashMap<>();
            map.put("STREAMING", STREAMING);
            map.put("BATCH", BATCH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModesEnum(String value) {
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
        public static ModesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModesEnum(value));
        }

        public static ModesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModesEnum) {
                return this.value.equals(((ModesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modes")

    private List<ModesEnum> modes = null;

    public CreateSqlValidationResponse withSources(List<TableItem> sources) {
        this.sources = sources;
        return this;
    }

    public CreateSqlValidationResponse addSourcesItem(TableItem sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public CreateSqlValidationResponse withSources(Consumer<List<TableItem>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * 源表
     * @return sources
     */
    public List<TableItem> getSources() {
        return sources;
    }

    public void setSources(List<TableItem> sources) {
        this.sources = sources;
    }

    public CreateSqlValidationResponse withModes(List<ModesEnum> modes) {
        this.modes = modes;
        return this;
    }

    public CreateSqlValidationResponse addModesItem(ModesEnum modesItem) {
        if (this.modes == null) {
            this.modes = new ArrayList<>();
        }
        this.modes.add(modesItem);
        return this;
    }

    public CreateSqlValidationResponse withModes(Consumer<List<ModesEnum>> modesSetter) {
        if (this.modes == null) {
            this.modes = new ArrayList<>();
        }
        modesSetter.accept(this.modes);
        return this;
    }

    /**
     * 模式
     * @return modes
     */
    public List<ModesEnum> getModes() {
        return modes;
    }

    public void setModes(List<ModesEnum> modes) {
        this.modes = modes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSqlValidationResponse that = (CreateSqlValidationResponse) obj;
        return Objects.equals(this.sources, that.sources) && Objects.equals(this.modes, that.modes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sources, modes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSqlValidationResponse {\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    modes: ").append(toIndentedString(modes)).append("\n");
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
