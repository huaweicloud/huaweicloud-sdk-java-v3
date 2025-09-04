package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 当前租户（计费）类型
 */
public class ShowUserChargeTypeResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_type")

    private String chargeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_resource_list")

    private List<ShowUserChargeTypeResultMainResourceList> mainResourceList = null;

    public ShowUserChargeTypeResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 套餐类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowUserChargeTypeResult withChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }

    /**
     * 计费类型
     * @return chargeType
     */
    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public ShowUserChargeTypeResult withMainResourceList(
        List<ShowUserChargeTypeResultMainResourceList> mainResourceList) {
        this.mainResourceList = mainResourceList;
        return this;
    }

    public ShowUserChargeTypeResult addMainResourceListItem(
        ShowUserChargeTypeResultMainResourceList mainResourceListItem) {
        if (this.mainResourceList == null) {
            this.mainResourceList = new ArrayList<>();
        }
        this.mainResourceList.add(mainResourceListItem);
        return this;
    }

    public ShowUserChargeTypeResult withMainResourceList(
        Consumer<List<ShowUserChargeTypeResultMainResourceList>> mainResourceListSetter) {
        if (this.mainResourceList == null) {
            this.mainResourceList = new ArrayList<>();
        }
        mainResourceListSetter.accept(this.mainResourceList);
        return this;
    }

    /**
     * 计费类型
     * @return mainResourceList
     */
    public List<ShowUserChargeTypeResultMainResourceList> getMainResourceList() {
        return mainResourceList;
    }

    public void setMainResourceList(List<ShowUserChargeTypeResultMainResourceList> mainResourceList) {
        this.mainResourceList = mainResourceList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUserChargeTypeResult that = (ShowUserChargeTypeResult) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.chargeType, that.chargeType)
            && Objects.equals(this.mainResourceList, that.mainResourceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, chargeType, mainResourceList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUserChargeTypeResult {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
        sb.append("    mainResourceList: ").append(toIndentedString(mainResourceList)).append("\n");
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
