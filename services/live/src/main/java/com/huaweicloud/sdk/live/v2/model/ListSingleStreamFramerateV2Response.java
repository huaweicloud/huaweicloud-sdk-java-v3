package com.huaweicloud.sdk.live.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.live.v2.model.V2FramerateInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSingleStreamFramerateV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="framerate_info_list")
    
    private List<V2FramerateInfo> framerateInfoList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-request-id")
    
    private String xRequestId;

    public ListSingleStreamFramerateV2Response withFramerateInfoList(List<V2FramerateInfo> framerateInfoList) {
        this.framerateInfoList = framerateInfoList;
        return this;
    }

    
    public ListSingleStreamFramerateV2Response addFramerateInfoListItem(V2FramerateInfo framerateInfoListItem) {
        if (this.framerateInfoList == null) {
            this.framerateInfoList = new ArrayList<>();
        }
        this.framerateInfoList.add(framerateInfoListItem);
        return this;
    }

    public ListSingleStreamFramerateV2Response withFramerateInfoList(Consumer<List<V2FramerateInfo>> framerateInfoListSetter) {
        if(this.framerateInfoList == null ){
            this.framerateInfoList = new ArrayList<>();
        }
        framerateInfoListSetter.accept(this.framerateInfoList);
        return this;
    }

    /**
     * 用量详情。 
     * @return framerateInfoList
     */
    public List<V2FramerateInfo> getFramerateInfoList() {
        return framerateInfoList;
    }

    public void setFramerateInfoList(List<V2FramerateInfo> framerateInfoList) {
        this.framerateInfoList = framerateInfoList;
    }

    public ListSingleStreamFramerateV2Response withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    


    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSingleStreamFramerateV2Response listSingleStreamFramerateV2Response = (ListSingleStreamFramerateV2Response) o;
        return Objects.equals(this.framerateInfoList, listSingleStreamFramerateV2Response.framerateInfoList) &&
            Objects.equals(this.xRequestId, listSingleStreamFramerateV2Response.xRequestId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(framerateInfoList, xRequestId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSingleStreamFramerateV2Response {\n");
        sb.append("    framerateInfoList: ").append(toIndentedString(framerateInfoList)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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

