package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VersionModelBranch
 */
public class VersionModelBranch {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdateTime")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "needSetNullAttrs")

    private List<String> needSetNullAttrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdmExtensionType")

    private String rdmExtensionType;

    public VersionModelBranch withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：**  创建时间。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public VersionModelBranch withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * **参数解释：**  创建者。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public VersionModelBranch withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：**  唯一标识。  **约束限制：**  不涉及。  **取值范围：**  -9223372036854775808到9223372036854775807的整数。  **默认取值：**  不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VersionModelBranch withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * **参数解释：**  最后更新时间。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public VersionModelBranch withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * **参数解释：**  更新者。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public VersionModelBranch withNeedSetNullAttrs(List<String> needSetNullAttrs) {
        this.needSetNullAttrs = needSetNullAttrs;
        return this;
    }

    public VersionModelBranch addNeedSetNullAttrsItem(String needSetNullAttrsItem) {
        if (this.needSetNullAttrs == null) {
            this.needSetNullAttrs = new ArrayList<>();
        }
        this.needSetNullAttrs.add(needSetNullAttrsItem);
        return this;
    }

    public VersionModelBranch withNeedSetNullAttrs(Consumer<List<String>> needSetNullAttrsSetter) {
        if (this.needSetNullAttrs == null) {
            this.needSetNullAttrs = new ArrayList<>();
        }
        needSetNullAttrsSetter.accept(this.needSetNullAttrs);
        return this;
    }

    /**
     * **参数解释：**  将自定义属性（包括基本属性、扩展属性和分类属性）设置为空值，其长度不能超过1000个字符。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return needSetNullAttrs
     */
    public List<String> getNeedSetNullAttrs() {
        return needSetNullAttrs;
    }

    public void setNeedSetNullAttrs(List<String> needSetNullAttrs) {
        this.needSetNullAttrs = needSetNullAttrs;
    }

    public VersionModelBranch withRdmExtensionType(String rdmExtensionType) {
        this.rdmExtensionType = rdmExtensionType;
        return this;
    }

    /**
     * **参数解释：**  扩展类型。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return rdmExtensionType
     */
    public String getRdmExtensionType() {
        return rdmExtensionType;
    }

    public void setRdmExtensionType(String rdmExtensionType) {
        this.rdmExtensionType = rdmExtensionType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionModelBranch that = (VersionModelBranch) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.id, that.id) && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.modifier, that.modifier)
            && Objects.equals(this.needSetNullAttrs, that.needSetNullAttrs)
            && Objects.equals(this.rdmExtensionType, that.rdmExtensionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime, creator, id, lastUpdateTime, modifier, needSetNullAttrs, rdmExtensionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionModelBranch {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
        sb.append("    needSetNullAttrs: ").append(toIndentedString(needSetNullAttrs)).append("\n");
        sb.append("    rdmExtensionType: ").append(toIndentedString(rdmExtensionType)).append("\n");
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
