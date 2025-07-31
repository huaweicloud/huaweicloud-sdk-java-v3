package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AccessTopMemberVO
 */
public class AccessTopMemberVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private String count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item")

    private String item;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public AccessTopMemberVO withCount(String count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 次数 **取值范围**： 不涉及
     * @return count
     */
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public AccessTopMemberVO withItem(String item) {
        this.item = item;
        return this;
    }

    /**
     * **参数解释**： 项 **取值范围**： 不涉及
     * @return item
     */
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public AccessTopMemberVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 项名称 **取值范围**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessTopMemberVO that = (AccessTopMemberVO) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.item, that.item)
            && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, item, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessTopMemberVO {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
