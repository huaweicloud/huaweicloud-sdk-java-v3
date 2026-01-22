package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteBlackWhiteDto
 */
public class DeleteBlackWhiteDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list_ids")

    private List<String> listIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list_type")

    private Integer listType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    public DeleteBlackWhiteDto withListIds(List<String> listIds) {
        this.listIds = listIds;
        return this;
    }

    public DeleteBlackWhiteDto addListIdsItem(String listIdsItem) {
        if (this.listIds == null) {
            this.listIds = new ArrayList<>();
        }
        this.listIds.add(listIdsItem);
        return this;
    }

    public DeleteBlackWhiteDto withListIds(Consumer<List<String>> listIdsSetter) {
        if (this.listIds == null) {
            this.listIds = new ArrayList<>();
        }
        listIdsSetter.accept(this.listIds);
        return this;
    }

    /**
     * **参数解释**： 黑白名单列表ID **约束限制**： 不涉及  **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return listIds
     */
    public List<String> getListIds() {
        return listIds;
    }

    public void setListIds(List<String> listIds) {
        this.listIds = listIds;
    }

    public DeleteBlackWhiteDto withListType(Integer listType) {
        this.listType = listType;
        return this;
    }

    /**
     * **参数解释**： 黑白名单列表类型 **约束限制**： 不涉及 **取值范围**： 4：黑名单 5：白名单 **默认取值**： 不涉及
     * minimum: 4
     * maximum: 5
     * @return listType
     */
    public Integer getListType() {
        return listType;
    }

    public void setListType(Integer listType) {
        this.listType = listType;
    }

    public DeleteBlackWhiteDto withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * **参数解释**： 防护对象id，是创建云防火墙后用于区分互联网边界防护和VPC边界防护的标志id，可通过调用查询防火墙实例接口获得，通过返回值中的data.records.protect_objects.object_id（.表示各对象之间层级的区分）获得，type为0时，object_id为互联网边界防护对象ID，type为1时，object_id为VPC边界防护对象ID，type可通过data.records.protect_objects.type（.表示各对象之间层级的区分）获得 **约束限制**： 不涉及  **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteBlackWhiteDto that = (DeleteBlackWhiteDto) obj;
        return Objects.equals(this.listIds, that.listIds) && Objects.equals(this.listType, that.listType)
            && Objects.equals(this.objectId, that.objectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listIds, listType, objectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteBlackWhiteDto {\n");
        sb.append("    listIds: ").append(toIndentedString(listIds)).append("\n");
        sb.append("    listType: ").append(toIndentedString(listType)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
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
