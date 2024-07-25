package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VersionUpdateViewDTOMultiViewModelViewUpdateAttrDTO
 */
public class VersionUpdateViewDTOMultiViewModelViewUpdateAttrDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versionId")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "newViewAttrs")

    private MultiViewModelViewUpdateAttrDTO newViewAttrs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "needSetNull")

    private List<String> needSetNull = null;

    public VersionUpdateViewDTOMultiViewModelViewUpdateAttrDTO withVersionId(String versionId) {
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

    public VersionUpdateViewDTOMultiViewModelViewUpdateAttrDTO withNewViewAttrs(
        MultiViewModelViewUpdateAttrDTO newViewAttrs) {
        this.newViewAttrs = newViewAttrs;
        return this;
    }

    public VersionUpdateViewDTOMultiViewModelViewUpdateAttrDTO withNewViewAttrs(
        Consumer<MultiViewModelViewUpdateAttrDTO> newViewAttrsSetter) {
        if (this.newViewAttrs == null) {
            this.newViewAttrs = new MultiViewModelViewUpdateAttrDTO();
            newViewAttrsSetter.accept(this.newViewAttrs);
        }

        return this;
    }

    /**
     * Get newViewAttrs
     * @return newViewAttrs
     */
    public MultiViewModelViewUpdateAttrDTO getNewViewAttrs() {
        return newViewAttrs;
    }

    public void setNewViewAttrs(MultiViewModelViewUpdateAttrDTO newViewAttrs) {
        this.newViewAttrs = newViewAttrs;
    }

    public VersionUpdateViewDTOMultiViewModelViewUpdateAttrDTO withNeedSetNull(List<String> needSetNull) {
        this.needSetNull = needSetNull;
        return this;
    }

    public VersionUpdateViewDTOMultiViewModelViewUpdateAttrDTO addNeedSetNullItem(String needSetNullItem) {
        if (this.needSetNull == null) {
            this.needSetNull = new ArrayList<>();
        }
        this.needSetNull.add(needSetNullItem);
        return this;
    }

    public VersionUpdateViewDTOMultiViewModelViewUpdateAttrDTO withNeedSetNull(
        Consumer<List<String>> needSetNullSetter) {
        if (this.needSetNull == null) {
            this.needSetNull = new ArrayList<>();
        }
        needSetNullSetter.accept(this.needSetNull);
        return this;
    }

    /**
     * **参数解释：**  指定不复制的视图属性，其值将被设置为null。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return needSetNull
     */
    public List<String> getNeedSetNull() {
        return needSetNull;
    }

    public void setNeedSetNull(List<String> needSetNull) {
        this.needSetNull = needSetNull;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionUpdateViewDTOMultiViewModelViewUpdateAttrDTO that =
            (VersionUpdateViewDTOMultiViewModelViewUpdateAttrDTO) obj;
        return Objects.equals(this.versionId, that.versionId) && Objects.equals(this.newViewAttrs, that.newViewAttrs)
            && Objects.equals(this.needSetNull, that.needSetNull);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionId, newViewAttrs, needSetNull);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionUpdateViewDTOMultiViewModelViewUpdateAttrDTO {\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    newViewAttrs: ").append(toIndentedString(newViewAttrs)).append("\n");
        sb.append("    needSetNull: ").append(toIndentedString(needSetNull)).append("\n");
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
