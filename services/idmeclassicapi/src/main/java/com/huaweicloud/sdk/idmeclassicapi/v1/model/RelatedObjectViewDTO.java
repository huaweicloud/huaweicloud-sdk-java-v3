package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RelatedObjectViewDTO
 */
public class RelatedObjectViewDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "objectId")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relatedList")

    private List<BasicObjectQueryViewDTO> relatedList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relatedEntityList")

    private List<BasicObjectQueryViewDTO> relatedEntityList = null;

    public RelatedObjectViewDTO withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * **参数解释：**  数据实例ID。  **取值范围：**  -9223372036854775808到9223372036854775807的整数。  **默认取值：**  不涉及。 
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public RelatedObjectViewDTO withRelatedList(List<BasicObjectQueryViewDTO> relatedList) {
        this.relatedList = relatedList;
        return this;
    }

    public RelatedObjectViewDTO addRelatedListItem(BasicObjectQueryViewDTO relatedListItem) {
        if (this.relatedList == null) {
            this.relatedList = new ArrayList<>();
        }
        this.relatedList.add(relatedListItem);
        return this;
    }

    public RelatedObjectViewDTO withRelatedList(Consumer<List<BasicObjectQueryViewDTO>> relatedListSetter) {
        if (this.relatedList == null) {
            this.relatedList = new ArrayList<>();
        }
        relatedListSetter.accept(this.relatedList);
        return this;
    }

    /**
     * **参数解释：**  关联的数据传输对象列表。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return relatedList
     */
    public List<BasicObjectQueryViewDTO> getRelatedList() {
        return relatedList;
    }

    public void setRelatedList(List<BasicObjectQueryViewDTO> relatedList) {
        this.relatedList = relatedList;
    }

    public RelatedObjectViewDTO withRelatedEntityList(List<BasicObjectQueryViewDTO> relatedEntityList) {
        this.relatedEntityList = relatedEntityList;
        return this;
    }

    public RelatedObjectViewDTO addRelatedEntityListItem(BasicObjectQueryViewDTO relatedEntityListItem) {
        if (this.relatedEntityList == null) {
            this.relatedEntityList = new ArrayList<>();
        }
        this.relatedEntityList.add(relatedEntityListItem);
        return this;
    }

    public RelatedObjectViewDTO withRelatedEntityList(Consumer<List<BasicObjectQueryViewDTO>> relatedEntityListSetter) {
        if (this.relatedEntityList == null) {
            this.relatedEntityList = new ArrayList<>();
        }
        relatedEntityListSetter.accept(this.relatedEntityList);
        return this;
    }

    /**
     * **参数解释：**  关联的数据实体列表。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return relatedEntityList
     */
    public List<BasicObjectQueryViewDTO> getRelatedEntityList() {
        return relatedEntityList;
    }

    public void setRelatedEntityList(List<BasicObjectQueryViewDTO> relatedEntityList) {
        this.relatedEntityList = relatedEntityList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RelatedObjectViewDTO that = (RelatedObjectViewDTO) obj;
        return Objects.equals(this.objectId, that.objectId) && Objects.equals(this.relatedList, that.relatedList)
            && Objects.equals(this.relatedEntityList, that.relatedEntityList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, relatedList, relatedEntityList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelatedObjectViewDTO {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    relatedList: ").append(toIndentedString(relatedList)).append("\n");
        sb.append("    relatedEntityList: ").append(toIndentedString(relatedEntityList)).append("\n");
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
