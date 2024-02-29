package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VersionModelVersionCheckOutDTO
 */
public class VersionModelVersionCheckOutDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customLinkSet")

    private List<String> customLinkSet = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "masterId")

    private Long masterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workCopyType")

    private String workCopyType;

    public VersionModelVersionCheckOutDTO withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public VersionModelVersionCheckOutDTO withCustomLinkSet(List<String> customLinkSet) {
        this.customLinkSet = customLinkSet;
        return this;
    }

    public VersionModelVersionCheckOutDTO addCustomLinkSetItem(String customLinkSetItem) {
        if (this.customLinkSet == null) {
            this.customLinkSet = new ArrayList<>();
        }
        this.customLinkSet.add(customLinkSetItem);
        return this;
    }

    public VersionModelVersionCheckOutDTO withCustomLinkSet(Consumer<List<String>> customLinkSetSetter) {
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

    public VersionModelVersionCheckOutDTO withMasterId(Long masterId) {
        this.masterId = masterId;
        return this;
    }

    /**
     * 主对象ID。
     * @return masterId
     */
    public Long getMasterId() {
        return masterId;
    }

    public void setMasterId(Long masterId) {
        this.masterId = masterId;
    }

    public VersionModelVersionCheckOutDTO withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * 更新者。
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public VersionModelVersionCheckOutDTO withWorkCopyType(String workCopyType) {
        this.workCopyType = workCopyType;
        return this;
    }

    /**
     * 关系COPY类型。 - BOTH:以其为源或目标的均需要复制。 - CUSTOM:自定义复制。 - NONE:不复制。 - SOURCE:仅复制以此为源的。 - TARGET:仅复制以此为目标的。
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
        VersionModelVersionCheckOutDTO that = (VersionModelVersionCheckOutDTO) obj;
        return Objects.equals(this.creator, that.creator) && Objects.equals(this.customLinkSet, that.customLinkSet)
            && Objects.equals(this.masterId, that.masterId) && Objects.equals(this.modifier, that.modifier)
            && Objects.equals(this.workCopyType, that.workCopyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creator, customLinkSet, masterId, modifier, workCopyType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionModelVersionCheckOutDTO {\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    customLinkSet: ").append(toIndentedString(customLinkSet)).append("\n");
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
