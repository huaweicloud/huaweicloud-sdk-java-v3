package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ScaleStoreBody
 */
public class ScaleStoreBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_name")

    private String storeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_num")

    private Integer cuNum;

    public ScaleStoreBody withStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    /**
     * **参数解释：** 知识仓实例名称，region内唯一。 **约束限制：** 长度范围为3到63个字符，支持小写字母、数字、中划线（-），第一个字符只能够是小写字母，中划线(-)不得出现在字符串末尾。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return storeName
     */
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public ScaleStoreBody withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 变更动作。 **约束限制：** 不涉及 **取值范围：** SCALE_OUT：扩容 SCALE_IN：缩容 **默认取值：** SCALE_OUT
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ScaleStoreBody withCuNum(Integer cuNum) {
        this.cuNum = cuNum;
        return this;
    }

    /**
     * **参数解释：** 扩容或缩容后cu规格的最终数量 **约束限制：** \"action\"为\"SCALE_OUT\"时，cu_num值要大于当前已有cu规格的数量；cu_num不能超过CU配额，如有大量需求，请提工单申请。 \"action\"为\"SCALE_IN\"时，cu_num值要小于当前已有cu规格的数量。 **取值范围：** 大于0 **默认取值：** 不涉及
     * @return cuNum
     */
    public Integer getCuNum() {
        return cuNum;
    }

    public void setCuNum(Integer cuNum) {
        this.cuNum = cuNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScaleStoreBody that = (ScaleStoreBody) obj;
        return Objects.equals(this.storeName, that.storeName) && Objects.equals(this.action, that.action)
            && Objects.equals(this.cuNum, that.cuNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeName, action, cuNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScaleStoreBody {\n");
        sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    cuNum: ").append(toIndentedString(cuNum)).append("\n");
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
