package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RelateAction
 */
public class RelateAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_display_name")

    private String actionDisplayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relate_object_list")

    private List<RelationObject> relateObjectList = null;

    public RelateAction withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**： 关联行为code。 **取值范围**： 不涉及。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public RelateAction withActionDisplayName(String actionDisplayName) {
        this.actionDisplayName = actionDisplayName;
        return this;
    }

    /**
     * **参数解释**： 关联行为名称。 **取值范围**： 不涉及。
     * @return actionDisplayName
     */
    public String getActionDisplayName() {
        return actionDisplayName;
    }

    public void setActionDisplayName(String actionDisplayName) {
        this.actionDisplayName = actionDisplayName;
    }

    public RelateAction withRelateObjectList(List<RelationObject> relateObjectList) {
        this.relateObjectList = relateObjectList;
        return this;
    }

    public RelateAction addRelateObjectListItem(RelationObject relateObjectListItem) {
        if (this.relateObjectList == null) {
            this.relateObjectList = new ArrayList<>();
        }
        this.relateObjectList.add(relateObjectListItem);
        return this;
    }

    public RelateAction withRelateObjectList(Consumer<List<RelationObject>> relateObjectListSetter) {
        if (this.relateObjectList == null) {
            this.relateObjectList = new ArrayList<>();
        }
        relateObjectListSetter.accept(this.relateObjectList);
        return this;
    }

    /**
     * **参数解释**： 关联的对象列表。 **取值范围**： 不涉及。
     * @return relateObjectList
     */
    public List<RelationObject> getRelateObjectList() {
        return relateObjectList;
    }

    public void setRelateObjectList(List<RelationObject> relateObjectList) {
        this.relateObjectList = relateObjectList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RelateAction that = (RelateAction) obj;
        return Objects.equals(this.action, that.action)
            && Objects.equals(this.actionDisplayName, that.actionDisplayName)
            && Objects.equals(this.relateObjectList, that.relateObjectList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, actionDisplayName, relateObjectList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelateAction {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    actionDisplayName: ").append(toIndentedString(actionDisplayName)).append("\n");
        sb.append("    relateObjectList: ").append(toIndentedString(relateObjectList)).append("\n");
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
