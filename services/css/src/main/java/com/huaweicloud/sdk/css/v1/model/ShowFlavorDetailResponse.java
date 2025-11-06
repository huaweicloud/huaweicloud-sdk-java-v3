package com.huaweicloud.sdk.css.v1.model;

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
    @JsonProperty(value = "str_id")

    private String strId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condOperationStatus")

    private String condOperationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condOperationAz")

    private String condOperationAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_detail")

    private List<ShowFlavorDetailRspFlavorDetail> flavorDetail = null;

    public ShowFlavorDetailResponse withStrId(String strId) {
        this.strId = strId;
        return this;
    }

    /**
     * **参数解释**： 规格id。 **取值范围**： 不涉及
     * @return strId
     */
    public String getStrId() {
        return strId;
    }

    public void setStrId(String strId) {
        this.strId = strId;
    }

    public ShowFlavorDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 规格名称。 **取值范围**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowFlavorDetailResponse withCondOperationStatus(String condOperationStatus) {
        this.condOperationStatus = condOperationStatus;
        return this;
    }

    /**
     * **参数解释**： 此参数是Region级配置，某个AZ没有在condOperationAz参数中配置时默认使用此参数的取值。 **取值范围**：   - normal：正常商用。   - sellout：售罄。
     * @return condOperationStatus
     */
    public String getCondOperationStatus() {
        return condOperationStatus;
    }

    public void setCondOperationStatus(String condOperationStatus) {
        this.condOperationStatus = condOperationStatus;
    }

    public ShowFlavorDetailResponse withCondOperationAz(String condOperationAz) {
        this.condOperationAz = condOperationAz;
        return this;
    }

    /**
     * **参数解释**： 此参数是AZ级配置，某个AZ没有在此参数中配置时默认使用condOperationAz参数的取值。此参数的配置格式“az(xx)”。()内为某个AZ的flavor状态，()内必须要填有状态，不填为无效配置。状态的取值范围与condOperationStatus参数相同。 **取值范围**： 不涉及
     * @return condOperationAz
     */
    public String getCondOperationAz() {
        return condOperationAz;
    }

    public void setCondOperationAz(String condOperationAz) {
        this.condOperationAz = condOperationAz;
    }

    public ShowFlavorDetailResponse withFlavorDetail(List<ShowFlavorDetailRspFlavorDetail> flavorDetail) {
        this.flavorDetail = flavorDetail;
        return this;
    }

    public ShowFlavorDetailResponse addFlavorDetailItem(ShowFlavorDetailRspFlavorDetail flavorDetailItem) {
        if (this.flavorDetail == null) {
            this.flavorDetail = new ArrayList<>();
        }
        this.flavorDetail.add(flavorDetailItem);
        return this;
    }

    public ShowFlavorDetailResponse withFlavorDetail(
        Consumer<List<ShowFlavorDetailRspFlavorDetail>> flavorDetailSetter) {
        if (this.flavorDetail == null) {
            this.flavorDetail = new ArrayList<>();
        }
        flavorDetailSetter.accept(this.flavorDetail);
        return this;
    }

    /**
     * **参数解释**： 规格属性信息。 **取值范围**： 不涉及
     * @return flavorDetail
     */
    public List<ShowFlavorDetailRspFlavorDetail> getFlavorDetail() {
        return flavorDetail;
    }

    public void setFlavorDetail(List<ShowFlavorDetailRspFlavorDetail> flavorDetail) {
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
        return Objects.equals(this.strId, that.strId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.condOperationStatus, that.condOperationStatus)
            && Objects.equals(this.condOperationAz, that.condOperationAz)
            && Objects.equals(this.flavorDetail, that.flavorDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strId, name, condOperationStatus, condOperationAz, flavorDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlavorDetailResponse {\n");
        sb.append("    strId: ").append(toIndentedString(strId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    condOperationStatus: ").append(toIndentedString(condOperationStatus)).append("\n");
        sb.append("    condOperationAz: ").append(toIndentedString(condOperationAz)).append("\n");
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
