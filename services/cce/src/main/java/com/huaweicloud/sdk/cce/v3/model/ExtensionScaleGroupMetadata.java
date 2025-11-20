package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 扩容伸缩组的基本信息
 */
public class ExtensionScaleGroupMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public ExtensionScaleGroupMetadata withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * **参数解释**： 扩展伸缩组的uuid **约束限制**： - 创建节点池时自动生成，填写无效。 - 更新节点池时，如果填写则更新指定伸缩组。 - 更新节点池时，如果不填写则删除当前绑定的伸缩组，并创建新的伸缩组。  **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public ExtensionScaleGroupMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 扩展伸缩组的名称。 **约束限制**： 不能为 **default**。 **取值范围**： 长度不能超过56个字符，只能包含数字和小写字母以及连字符（-），必须以小写字母开头以小写字母或者数字结尾。 **默认取值**： 不涉及
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
        ExtensionScaleGroupMetadata that = (ExtensionScaleGroupMetadata) obj;
        return Objects.equals(this.uid, that.uid) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionScaleGroupMetadata {\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
