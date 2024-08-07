package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workCopyType")

    private String workCopyType;

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
     * **参数解释：**  修改人。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
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
     * **参数解释：**  版本对象ID。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public MultiViewModelVersionViewCreateDTO withWorkCopyType(String workCopyType) {
        this.workCopyType = workCopyType;
        return this;
    }

    /**
     * **参数解释：**  关系的复制类型。  **约束限制：**  不涉及。  **取值范围：**  - BOTH：若存在关系实例引用此数据实例作为源端实例或目标端实例，创建多维版本后的数据实例将继承这些关系实例。 - SOURCE：若存在关系实例引用此数据实例作为源端实例，创建多维版本后的数据实例将继承这些关系实例。 - TARGET：若存在关系实例引用此数据实例作为目标端实例，创建多维版本后的数据实例将继承这些关系实例。 - NONE：创建多维版本后的数据实例将不继承任何关系实例。 - CUSTOM：若指定的关系实体集合对应的关系实例引用此数据实例作为源端实例或目标端实例，创建多维版本后的数据实例将继承这些关系实例。  **默认取值：**  不涉及。 
     * @return workCopyType
     */
    public String getWorkCopyType() {
        return workCopyType;
    }

    public void setWorkCopyType(String workCopyType) {
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
     * **参数解释：**  关系实体名称集合，与workCopyType的值CUSTOM配合使用。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
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
     * **参数解释：**  指定不复制的属性，其值将被设置为null。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
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
