package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 批量基线/取消基线请求体，包含需要操作的计划ID列表和基线属性信息。 **约束限制**： 不涉及。
 */
public class OperateSprintReqVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attribute")

    private BaseLineVO attribute;

    public OperateSprintReqVO withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public OperateSprintReqVO addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public OperateSprintReqVO withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * **参数解释**： 发布/迭代计划ID列表，通过[发布/迭代计划列表查询](ListPlan.xml)接口获取，响应消息体中的**id**字段的值就是发布/迭代ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public OperateSprintReqVO withAttribute(BaseLineVO attribute) {
        this.attribute = attribute;
        return this;
    }

    public OperateSprintReqVO withAttribute(Consumer<BaseLineVO> attributeSetter) {
        if (this.attribute == null) {
            this.attribute = new BaseLineVO();
            attributeSetter.accept(this.attribute);
        }

        return this;
    }

    /**
     * Get attribute
     * @return attribute
     */
    public BaseLineVO getAttribute() {
        return attribute;
    }

    public void setAttribute(BaseLineVO attribute) {
        this.attribute = attribute;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperateSprintReqVO that = (OperateSprintReqVO) obj;
        return Objects.equals(this.ids, that.ids) && Objects.equals(this.attribute, that.attribute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, attribute);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateSprintReqVO {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
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
