package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VersionModelVersionCheckoutAndUpdateDTOVersionModel
 */
public class VersionModelVersionCheckoutAndUpdateDTOVersionModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customLinkSet")

    private List<String> customLinkSet = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private VersionModel data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "masterId")

    private String masterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workCopyType")

    private String workCopyType;

    public VersionModelVersionCheckoutAndUpdateDTOVersionModel withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * **参数解释：**  创建人。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public VersionModelVersionCheckoutAndUpdateDTOVersionModel withCustomLinkSet(List<String> customLinkSet) {
        this.customLinkSet = customLinkSet;
        return this;
    }

    public VersionModelVersionCheckoutAndUpdateDTOVersionModel addCustomLinkSetItem(String customLinkSetItem) {
        if (this.customLinkSet == null) {
            this.customLinkSet = new ArrayList<>();
        }
        this.customLinkSet.add(customLinkSetItem);
        return this;
    }

    public VersionModelVersionCheckoutAndUpdateDTOVersionModel withCustomLinkSet(
        Consumer<List<String>> customLinkSetSetter) {
        if (this.customLinkSet == null) {
            this.customLinkSet = new ArrayList<>();
        }
        customLinkSetSetter.accept(this.customLinkSet);
        return this;
    }

    /**
     * **参数解释：**  关系实体名称集合，与workCopyType的值CUSTOM配合使用。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return customLinkSet
     */
    public List<String> getCustomLinkSet() {
        return customLinkSet;
    }

    public void setCustomLinkSet(List<String> customLinkSet) {
        this.customLinkSet = customLinkSet;
    }

    public VersionModelVersionCheckoutAndUpdateDTOVersionModel withData(VersionModel data) {
        this.data = data;
        return this;
    }

    public VersionModelVersionCheckoutAndUpdateDTOVersionModel withData(Consumer<VersionModel> dataSetter) {
        if (this.data == null) {
            this.data = new VersionModel();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public VersionModel getData() {
        return data;
    }

    public void setData(VersionModel data) {
        this.data = data;
    }

    public VersionModelVersionCheckoutAndUpdateDTOVersionModel withMasterId(String masterId) {
        this.masterId = masterId;
        return this;
    }

    /**
     * **参数解释：**  主对象ID。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return masterId
     */
    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    public VersionModelVersionCheckoutAndUpdateDTOVersionModel withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * **参数解释：**  更新者。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public VersionModelVersionCheckoutAndUpdateDTOVersionModel withWorkCopyType(String workCopyType) {
        this.workCopyType = workCopyType;
        return this;
    }

    /**
     * **参数解释：**  关系的复制类型。  **取值范围：**  - BOTH：若存在关系实例引用此数据实例作为源端实例或目标端实例，检出并更新后的数据实例将继承这些关系实例。 - SOURCE：若存在关系实例引用此数据实例作为源端实例，检出并更新后的数据实例将继承这些关系实例。 - TARGET：若存在关系实例引用此数据实例作为目标端实例，检出并更新后的数据实例将继承这些关系实例。 - NONE：检出并更新后的数据实例将不继承任何关系实例。 - CUSTOM：若指定的关系实体集合对应的关系实例引用此数据实例作为源端实例或目标端实例，检出并更新后的数据实例将继承这些关系实例。  **默认取值：**  不涉及。 
     * @return workCopyType
     */
    public String getWorkCopyType() {
        return workCopyType;
    }

    public void setWorkCopyType(String workCopyType) {
        this.workCopyType = workCopyType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionModelVersionCheckoutAndUpdateDTOVersionModel that =
            (VersionModelVersionCheckoutAndUpdateDTOVersionModel) obj;
        return Objects.equals(this.creator, that.creator) && Objects.equals(this.customLinkSet, that.customLinkSet)
            && Objects.equals(this.data, that.data) && Objects.equals(this.masterId, that.masterId)
            && Objects.equals(this.modifier, that.modifier) && Objects.equals(this.workCopyType, that.workCopyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creator, customLinkSet, data, masterId, modifier, workCopyType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionModelVersionCheckoutAndUpdateDTOVersionModel {\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    customLinkSet: ").append(toIndentedString(customLinkSet)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    masterId: ").append(toIndentedString(masterId)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
        sb.append("    workCopyType: ").append(toIndentedString(workCopyType)).append("\n");
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
