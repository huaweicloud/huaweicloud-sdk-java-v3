package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新页面请求体
 */
public class WizardUpdateRequestPojos {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_wizard_update_pojo_list")

    private List<WizardUpdateRequestPojo> layoutWizardUpdatePojoList = null;

    public WizardUpdateRequestPojos withLayoutWizardUpdatePojoList(
        List<WizardUpdateRequestPojo> layoutWizardUpdatePojoList) {
        this.layoutWizardUpdatePojoList = layoutWizardUpdatePojoList;
        return this;
    }

    public WizardUpdateRequestPojos addLayoutWizardUpdatePojoListItem(
        WizardUpdateRequestPojo layoutWizardUpdatePojoListItem) {
        if (this.layoutWizardUpdatePojoList == null) {
            this.layoutWizardUpdatePojoList = new ArrayList<>();
        }
        this.layoutWizardUpdatePojoList.add(layoutWizardUpdatePojoListItem);
        return this;
    }

    public WizardUpdateRequestPojos withLayoutWizardUpdatePojoList(
        Consumer<List<WizardUpdateRequestPojo>> layoutWizardUpdatePojoListSetter) {
        if (this.layoutWizardUpdatePojoList == null) {
            this.layoutWizardUpdatePojoList = new ArrayList<>();
        }
        layoutWizardUpdatePojoListSetter.accept(this.layoutWizardUpdatePojoList);
        return this;
    }

    /**
     * 更新页面请求体列表
     * @return layoutWizardUpdatePojoList
     */
    public List<WizardUpdateRequestPojo> getLayoutWizardUpdatePojoList() {
        return layoutWizardUpdatePojoList;
    }

    public void setLayoutWizardUpdatePojoList(List<WizardUpdateRequestPojo> layoutWizardUpdatePojoList) {
        this.layoutWizardUpdatePojoList = layoutWizardUpdatePojoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WizardUpdateRequestPojos that = (WizardUpdateRequestPojos) obj;
        return Objects.equals(this.layoutWizardUpdatePojoList, that.layoutWizardUpdatePojoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(layoutWizardUpdatePojoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WizardUpdateRequestPojos {\n");
        sb.append("    layoutWizardUpdatePojoList: ").append(toIndentedString(layoutWizardUpdatePojoList)).append("\n");
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
