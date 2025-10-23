package com.huaweicloud.sdk.bcc.v1.model;

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
 * 手动改变资源等级请求体
 */
public class UpdateResourceLevelBody {

    /**
     * change和recover两种枚举
     */
    public static final class ChangeTypeEnum {

        /**
         * Enum CHANGE for value: "change"
         */
        public static final ChangeTypeEnum CHANGE = new ChangeTypeEnum("change");

        /**
         * Enum RECOVER for value: "recover"
         */
        public static final ChangeTypeEnum RECOVER = new ChangeTypeEnum("recover");

        private static final Map<String, ChangeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChangeTypeEnum> createStaticFields() {
            Map<String, ChangeTypeEnum> map = new HashMap<>();
            map.put("change", CHANGE);
            map.put("recover", RECOVER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChangeTypeEnum(String value) {
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
        public static ChangeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChangeTypeEnum(value));
        }

        public static ChangeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChangeTypeEnum) {
                return this.value.equals(((ChangeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_type")

    private ChangeTypeEnum changeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_ids")

    private List<String> resourceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_level_id")

    private String resourceLevelId;

    public UpdateResourceLevelBody withChangeType(ChangeTypeEnum changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * change和recover两种枚举
     * @return changeType
     */
    public ChangeTypeEnum getChangeType() {
        return changeType;
    }

    public void setChangeType(ChangeTypeEnum changeType) {
        this.changeType = changeType;
    }

    public UpdateResourceLevelBody withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    public UpdateResourceLevelBody addResourceIdsItem(String resourceIdsItem) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public UpdateResourceLevelBody withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * resource_id的列表
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public UpdateResourceLevelBody withResourceLevelId(String resourceLevelId) {
        this.resourceLevelId = resourceLevelId;
        return this;
    }

    /**
     * 资源等级ID
     * @return resourceLevelId
     */
    public String getResourceLevelId() {
        return resourceLevelId;
    }

    public void setResourceLevelId(String resourceLevelId) {
        this.resourceLevelId = resourceLevelId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateResourceLevelBody that = (UpdateResourceLevelBody) obj;
        return Objects.equals(this.changeType, that.changeType) && Objects.equals(this.resourceIds, that.resourceIds)
            && Objects.equals(this.resourceLevelId, that.resourceLevelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(changeType, resourceIds, resourceLevelId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResourceLevelBody {\n");
        sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    resourceLevelId: ").append(toIndentedString(resourceLevelId)).append("\n");
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
