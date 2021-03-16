package com.huaweicloud.sdk.osm.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.AreaCodeSimpleInfoV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAreaCodesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="area_code_list")
    
    private List<AreaCodeSimpleInfoV2> areaCodeList = null;
    
    public ListAreaCodesResponse withAreaCodeList(List<AreaCodeSimpleInfoV2> areaCodeList) {
        this.areaCodeList = areaCodeList;
        return this;
    }

    
    public ListAreaCodesResponse addAreaCodeListItem(AreaCodeSimpleInfoV2 areaCodeListItem) {
        this.areaCodeList.add(areaCodeListItem);
        return this;
    }

    public ListAreaCodesResponse withAreaCodeList(Consumer<List<AreaCodeSimpleInfoV2>> areaCodeListSetter) {
        if(this.areaCodeList == null ){
            this.areaCodeList = new ArrayList<>();
        }
        areaCodeListSetter.accept(this.areaCodeList);
        return this;
    }

    /**
     * 国家码列表
     * @return areaCodeList
     */
    public List<AreaCodeSimpleInfoV2> getAreaCodeList() {
        return areaCodeList;
    }

    public void setAreaCodeList(List<AreaCodeSimpleInfoV2> areaCodeList) {
        this.areaCodeList = areaCodeList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAreaCodesResponse listAreaCodesResponse = (ListAreaCodesResponse) o;
        return Objects.equals(this.areaCodeList, listAreaCodesResponse.areaCodeList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(areaCodeList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAreaCodesResponse {\n");
        sb.append("    areaCodeList: ").append(toIndentedString(areaCodeList)).append("\n");
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

