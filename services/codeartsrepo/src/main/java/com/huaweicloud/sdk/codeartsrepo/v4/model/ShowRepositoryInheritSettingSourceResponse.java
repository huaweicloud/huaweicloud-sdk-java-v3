package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowRepositoryInheritSettingSourceResponse extends SdkResponse {

    /**
     * **参数解释：** 设置源类型。 **取值范围：** - project，项目。 - group，代码组。 - repository，仓库。
     */
    public static final class SourceTypeEnum {

        /**
         * Enum PROJECT for value: "project"
         */
        public static final SourceTypeEnum PROJECT = new SourceTypeEnum("project");

        /**
         * Enum GROUP for value: "group"
         */
        public static final SourceTypeEnum GROUP = new SourceTypeEnum("group");

        /**
         * Enum REPOSITORY for value: "repository"
         */
        public static final SourceTypeEnum REPOSITORY = new SourceTypeEnum("repository");

        private static final Map<String, SourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceTypeEnum> createStaticFields() {
            Map<String, SourceTypeEnum> map = new HashMap<>();
            map.put("project", PROJECT);
            map.put("group", GROUP);
            map.put("repository", REPOSITORY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceTypeEnum(String value) {
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
        public static SourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceTypeEnum(value));
        }

        public static SourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceTypeEnum) {
                return this.value.equals(((SourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private SourceTypeEnum sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upward_inherit_editable")

    private Boolean upwardInheritEditable;

    public ShowRepositoryInheritSettingSourceResponse withSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * **参数解释：** 设置源类型。 **取值范围：** - project，项目。 - group，代码组。 - repository，仓库。
     * @return sourceType
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    public ShowRepositoryInheritSettingSourceResponse withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * **参数解释：** 设置源ID。 **取值范围：** 1-2147483647
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public ShowRepositoryInheritSettingSourceResponse withUpwardInheritEditable(Boolean upwardInheritEditable) {
        this.upwardInheritEditable = upwardInheritEditable;
        return this;
    }

    /**
     * **参数解释：** 继承设置是否可修改。 **取值范围：** - true，可修改。 - false，不可修改。
     * @return upwardInheritEditable
     */
    public Boolean getUpwardInheritEditable() {
        return upwardInheritEditable;
    }

    public void setUpwardInheritEditable(Boolean upwardInheritEditable) {
        this.upwardInheritEditable = upwardInheritEditable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRepositoryInheritSettingSourceResponse that = (ShowRepositoryInheritSettingSourceResponse) obj;
        return Objects.equals(this.sourceType, that.sourceType) && Objects.equals(this.sourceId, that.sourceId)
            && Objects.equals(this.upwardInheritEditable, that.upwardInheritEditable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceType, sourceId, upwardInheritEditable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRepositoryInheritSettingSourceResponse {\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    upwardInheritEditable: ").append(toIndentedString(upwardInheritEditable)).append("\n");
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
