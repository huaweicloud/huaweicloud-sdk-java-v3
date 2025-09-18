package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RuleInstanceContent
 */
public class RuleInstanceContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "editable")

    private Boolean editable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_modify_when_inherit")

    private Boolean canModifyWhenInherit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private List<RuleInstanceProperty> properties = null;

    public RuleInstanceContent withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**： 分组名称。 **取值范围**： 不涉及。 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public RuleInstanceContent withEditable(Boolean editable) {
        this.editable = editable;
        return this;
    }

    /**
     * **参数解释**： 是否可编辑。 **取值范围**： 不涉及。 
     * @return editable
     */
    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public RuleInstanceContent withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 分组类型。 **取值范围**： 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RuleInstanceContent withCanModifyWhenInherit(Boolean canModifyWhenInherit) {
        this.canModifyWhenInherit = canModifyWhenInherit;
        return this;
    }

    /**
     * **参数解释**： 继承后的子策略是否可以修改阈值。 **取值范围**： - true：可以修改阈值。 - false：不可以修改阈值。 
     * @return canModifyWhenInherit
     */
    public Boolean getCanModifyWhenInherit() {
        return canModifyWhenInherit;
    }

    public void setCanModifyWhenInherit(Boolean canModifyWhenInherit) {
        this.canModifyWhenInherit = canModifyWhenInherit;
    }

    public RuleInstanceContent withProperties(List<RuleInstanceProperty> properties) {
        this.properties = properties;
        return this;
    }

    public RuleInstanceContent addPropertiesItem(RuleInstanceProperty propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    public RuleInstanceContent withProperties(Consumer<List<RuleInstanceProperty>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * **参数解释**： 规则属性列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return properties
     */
    public List<RuleInstanceProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<RuleInstanceProperty> properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuleInstanceContent that = (RuleInstanceContent) obj;
        return Objects.equals(this.groupName, that.groupName) && Objects.equals(this.editable, that.editable)
            && Objects.equals(this.type, that.type)
            && Objects.equals(this.canModifyWhenInherit, that.canModifyWhenInherit)
            && Objects.equals(this.properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, editable, type, canModifyWhenInherit, properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleInstanceContent {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    canModifyWhenInherit: ").append(toIndentedString(canModifyWhenInherit)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
