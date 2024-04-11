package com.huaweicloud.sdk.idmeclassicapi.v1.model;

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
 * MultiViewModelVersionViewCreateDTO
 */
public class MultiViewModelVersionViewCreateDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versionId")

    private String versionId;

    /**
     * 关系的复制类型。 BOTH：复制当前M-V模型作为源端与目标端的关系。 CUSTOM：自定义复制当前M-V模型的关系。 NONE：不复制当前M-V模型的关系。 SOURCE：仅复制当前M-V模型作为源端的关系。 TARGET：仅复制当前M-V模型作为目标端的关系。
     */
    public static final class WorkCopyTypeEnum {

        /**
         * Enum BOTH for value: "BOTH"
         */
        public static final WorkCopyTypeEnum BOTH = new WorkCopyTypeEnum("BOTH");

        /**
         * Enum SOURCE for value: "SOURCE"
         */
        public static final WorkCopyTypeEnum SOURCE = new WorkCopyTypeEnum("SOURCE");

        /**
         * Enum TARGET for value: "TARGET"
         */
        public static final WorkCopyTypeEnum TARGET = new WorkCopyTypeEnum("TARGET");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final WorkCopyTypeEnum NONE = new WorkCopyTypeEnum("NONE");

        /**
         * Enum CUSTOM for value: "CUSTOM"
         */
        public static final WorkCopyTypeEnum CUSTOM = new WorkCopyTypeEnum("CUSTOM");

        private static final Map<String, WorkCopyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, WorkCopyTypeEnum> createStaticFields() {
            Map<String, WorkCopyTypeEnum> map = new HashMap<>();
            map.put("BOTH", BOTH);
            map.put("SOURCE", SOURCE);
            map.put("TARGET", TARGET);
            map.put("NONE", NONE);
            map.put("CUSTOM", CUSTOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        WorkCopyTypeEnum(String value) {
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
        public static WorkCopyTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new WorkCopyTypeEnum(value));
        }

        public static WorkCopyTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof WorkCopyTypeEnum) {
                return this.value.equals(((WorkCopyTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workCopyType")

    private WorkCopyTypeEnum workCopyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customLinkSet")

    private List<String> customLinkSet = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "needSetNull")

    private List<String> needSetNull = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item")

    private ObjectReferenceParamDTO item;

    public MultiViewModelVersionViewCreateDTO withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * 修改人。
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public MultiViewModelVersionViewCreateDTO withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * 版本对象ID。
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public MultiViewModelVersionViewCreateDTO withWorkCopyType(WorkCopyTypeEnum workCopyType) {
        this.workCopyType = workCopyType;
        return this;
    }

    /**
     * 关系的复制类型。 BOTH：复制当前M-V模型作为源端与目标端的关系。 CUSTOM：自定义复制当前M-V模型的关系。 NONE：不复制当前M-V模型的关系。 SOURCE：仅复制当前M-V模型作为源端的关系。 TARGET：仅复制当前M-V模型作为目标端的关系。
     * @return workCopyType
     */
    public WorkCopyTypeEnum getWorkCopyType() {
        return workCopyType;
    }

    public void setWorkCopyType(WorkCopyTypeEnum workCopyType) {
        this.workCopyType = workCopyType;
    }

    public MultiViewModelVersionViewCreateDTO withCustomLinkSet(List<String> customLinkSet) {
        this.customLinkSet = customLinkSet;
        return this;
    }

    public MultiViewModelVersionViewCreateDTO addCustomLinkSetItem(String customLinkSetItem) {
        if (this.customLinkSet == null) {
            this.customLinkSet = new ArrayList<>();
        }
        this.customLinkSet.add(customLinkSetItem);
        return this;
    }

    public MultiViewModelVersionViewCreateDTO withCustomLinkSet(Consumer<List<String>> customLinkSetSetter) {
        if (this.customLinkSet == null) {
            this.customLinkSet = new ArrayList<>();
        }
        customLinkSetSetter.accept(this.customLinkSet);
        return this;
    }

    /**
     * 关系实体名称集合，与workCopyType的值CUSTOM配合使用。
     * @return customLinkSet
     */
    public List<String> getCustomLinkSet() {
        return customLinkSet;
    }

    public void setCustomLinkSet(List<String> customLinkSet) {
        this.customLinkSet = customLinkSet;
    }

    public MultiViewModelVersionViewCreateDTO withNeedSetNull(List<String> needSetNull) {
        this.needSetNull = needSetNull;
        return this;
    }

    public MultiViewModelVersionViewCreateDTO addNeedSetNullItem(String needSetNullItem) {
        if (this.needSetNull == null) {
            this.needSetNull = new ArrayList<>();
        }
        this.needSetNull.add(needSetNullItem);
        return this;
    }

    public MultiViewModelVersionViewCreateDTO withNeedSetNull(Consumer<List<String>> needSetNullSetter) {
        if (this.needSetNull == null) {
            this.needSetNull = new ArrayList<>();
        }
        needSetNullSetter.accept(this.needSetNull);
        return this;
    }

    /**
     * 指定不复制的属性，其值将被设置为null。
     * @return needSetNull
     */
    public List<String> getNeedSetNull() {
        return needSetNull;
    }

    public void setNeedSetNull(List<String> needSetNull) {
        this.needSetNull = needSetNull;
    }

    public MultiViewModelVersionViewCreateDTO withItem(ObjectReferenceParamDTO item) {
        this.item = item;
        return this;
    }

    public MultiViewModelVersionViewCreateDTO withItem(Consumer<ObjectReferenceParamDTO> itemSetter) {
        if (this.item == null) {
            this.item = new ObjectReferenceParamDTO();
            itemSetter.accept(this.item);
        }

        return this;
    }

    /**
     * Get item
     * @return item
     */
    public ObjectReferenceParamDTO getItem() {
        return item;
    }

    public void setItem(ObjectReferenceParamDTO item) {
        this.item = item;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MultiViewModelVersionViewCreateDTO that = (MultiViewModelVersionViewCreateDTO) obj;
        return Objects.equals(this.modifier, that.modifier) && Objects.equals(this.versionId, that.versionId)
            && Objects.equals(this.workCopyType, that.workCopyType)
            && Objects.equals(this.customLinkSet, that.customLinkSet)
            && Objects.equals(this.needSetNull, that.needSetNull) && Objects.equals(this.item, that.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modifier, versionId, workCopyType, customLinkSet, needSetNull, item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiViewModelVersionViewCreateDTO {\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    workCopyType: ").append(toIndentedString(workCopyType)).append("\n");
        sb.append("    customLinkSet: ").append(toIndentedString(customLinkSet)).append("\n");
        sb.append("    needSetNull: ").append(toIndentedString(needSetNull)).append("\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
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
