package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFlavorDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "str_id")

    private String strId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_detail")

    private List<FlavorAttribute> flavorDetail = null;

    public ShowFlavorDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规格名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowFlavorDetailResponse withStrId(String strId) {
        this.strId = strId;
        return this;
    }

    /**
     * 规格ID
     * @return strId
     */
    public String getStrId() {
        return strId;
    }

    public void setStrId(String strId) {
        this.strId = strId;
    }

    public ShowFlavorDetailResponse withFlavorDetail(List<FlavorAttribute> flavorDetail) {
        this.flavorDetail = flavorDetail;
        return this;
    }

    public ShowFlavorDetailResponse addFlavorDetailItem(FlavorAttribute flavorDetailItem) {
        if (this.flavorDetail == null) {
            this.flavorDetail = new ArrayList<>();
        }
        this.flavorDetail.add(flavorDetailItem);
        return this;
    }

    public ShowFlavorDetailResponse withFlavorDetail(Consumer<List<FlavorAttribute>> flavorDetailSetter) {
        if (this.flavorDetail == null) {
            this.flavorDetail = new ArrayList<>();
        }
        flavorDetailSetter.accept(this.flavorDetail);
        return this;
    }

    /**
     * 规格详细列表
     * @return flavorDetail
     */
    public List<FlavorAttribute> getFlavorDetail() {
        return flavorDetail;
    }

    public void setFlavorDetail(List<FlavorAttribute> flavorDetail) {
        this.flavorDetail = flavorDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFlavorDetailResponse that = (ShowFlavorDetailResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.strId, that.strId)
            && Objects.equals(this.flavorDetail, that.flavorDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strId, flavorDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlavorDetailResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    strId: ").append(toIndentedString(strId)).append("\n");
        sb.append("    flavorDetail: ").append(toIndentedString(flavorDetail)).append("\n");
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
