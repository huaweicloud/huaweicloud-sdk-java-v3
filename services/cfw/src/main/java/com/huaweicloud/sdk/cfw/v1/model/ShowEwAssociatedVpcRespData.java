package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 查询VPC间防火墙使用引流VPC返回体 **取值范围**： 不涉及
 */
public class ShowEwAssociatedVpcRespData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inspection_vpc_list")

    private List<InspectionVpcInfo> inspectionVpcList = null;

    public ShowEwAssociatedVpcRespData withInspectionVpcList(List<InspectionVpcInfo> inspectionVpcList) {
        this.inspectionVpcList = inspectionVpcList;
        return this;
    }

    public ShowEwAssociatedVpcRespData addInspectionVpcListItem(InspectionVpcInfo inspectionVpcListItem) {
        if (this.inspectionVpcList == null) {
            this.inspectionVpcList = new ArrayList<>();
        }
        this.inspectionVpcList.add(inspectionVpcListItem);
        return this;
    }

    public ShowEwAssociatedVpcRespData withInspectionVpcList(
        Consumer<List<InspectionVpcInfo>> inspectionVpcListSetter) {
        if (this.inspectionVpcList == null) {
            this.inspectionVpcList = new ArrayList<>();
        }
        inspectionVpcListSetter.accept(this.inspectionVpcList);
        return this;
    }

    /**
     * **参数解释**： 使用引流VPC列表 **取值范围**： 不涉及
     * @return inspectionVpcList
     */
    public List<InspectionVpcInfo> getInspectionVpcList() {
        return inspectionVpcList;
    }

    public void setInspectionVpcList(List<InspectionVpcInfo> inspectionVpcList) {
        this.inspectionVpcList = inspectionVpcList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEwAssociatedVpcRespData that = (ShowEwAssociatedVpcRespData) obj;
        return Objects.equals(this.inspectionVpcList, that.inspectionVpcList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inspectionVpcList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEwAssociatedVpcRespData {\n");
        sb.append("    inspectionVpcList: ").append(toIndentedString(inspectionVpcList)).append("\n");
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
