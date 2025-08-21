package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 查询VPC间防火墙使用的企业路由器信息返回体 **取值范围**： 不涉及
 */
public class ShowEwAssociatedErRespData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_list")

    private List<ErInfo> erList = null;

    public ShowEwAssociatedErRespData withErList(List<ErInfo> erList) {
        this.erList = erList;
        return this;
    }

    public ShowEwAssociatedErRespData addErListItem(ErInfo erListItem) {
        if (this.erList == null) {
            this.erList = new ArrayList<>();
        }
        this.erList.add(erListItem);
        return this;
    }

    public ShowEwAssociatedErRespData withErList(Consumer<List<ErInfo>> erListSetter) {
        if (this.erList == null) {
            this.erList = new ArrayList<>();
        }
        erListSetter.accept(this.erList);
        return this;
    }

    /**
     * **参数解释**： 企业路由器列表 **取值范围**： 不涉及
     * @return erList
     */
    public List<ErInfo> getErList() {
        return erList;
    }

    public void setErList(List<ErInfo> erList) {
        this.erList = erList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEwAssociatedErRespData that = (ShowEwAssociatedErRespData) obj;
        return Objects.equals(this.erList, that.erList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(erList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEwAssociatedErRespData {\n");
        sb.append("    erList: ").append(toIndentedString(erList)).append("\n");
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
