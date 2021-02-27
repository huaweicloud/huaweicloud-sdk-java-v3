package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.ServiceResourceInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListServiceResourcesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="infos")
    
    private List<ServiceResourceInfo> infos = null;
    
    public ListServiceResourcesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListServiceResourcesResponse withInfos(List<ServiceResourceInfo> infos) {
        this.infos = infos;
        return this;
    }

    
    public ListServiceResourcesResponse addInfosItem(ServiceResourceInfo infosItem) {
        if (this.infos == null) {
            this.infos = new ArrayList<>();
        }
        this.infos.add(infosItem);
        return this;
    }

    public ListServiceResourcesResponse withInfos(Consumer<List<ServiceResourceInfo>> infosSetter) {
        if(this.infos == null ){
            this.infos = new ArrayList<>();
        }
        infosSetter.accept(this.infos);
        return this;
    }

    /**
     * 资源基本信息列表，具体请参见表3。
     * @return infos
     */
    public List<ServiceResourceInfo> getInfos() {
        return infos;
    }

    public void setInfos(List<ServiceResourceInfo> infos) {
        this.infos = infos;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListServiceResourcesResponse listServiceResourcesResponse = (ListServiceResourcesResponse) o;
        return Objects.equals(this.totalCount, listServiceResourcesResponse.totalCount) &&
            Objects.equals(this.infos, listServiceResourcesResponse.infos);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalCount, infos);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServiceResourcesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    infos: ").append(toIndentedString(infos)).append("\n");
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

