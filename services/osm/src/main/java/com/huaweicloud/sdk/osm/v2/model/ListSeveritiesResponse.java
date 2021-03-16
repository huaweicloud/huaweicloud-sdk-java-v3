package com.huaweicloud.sdk.osm.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.SeverityV2Do;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSeveritiesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="show")
    
    private Boolean show;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="severity_list")
    
    private List<SeverityV2Do> severityList = null;
    
    public ListSeveritiesResponse withShow(Boolean show) {
        this.show = show;
        return this;
    }

    


    /**
     * 是否展示
     * @return show
     */
    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    

    public ListSeveritiesResponse withSeverityList(List<SeverityV2Do> severityList) {
        this.severityList = severityList;
        return this;
    }

    
    public ListSeveritiesResponse addSeverityListItem(SeverityV2Do severityListItem) {
        this.severityList.add(severityListItem);
        return this;
    }

    public ListSeveritiesResponse withSeverityList(Consumer<List<SeverityV2Do>> severityListSetter) {
        if(this.severityList == null ){
            this.severityList = new ArrayList<>();
        }
        severityListSetter.accept(this.severityList);
        return this;
    }

    /**
     * 严重性列表
     * @return severityList
     */
    public List<SeverityV2Do> getSeverityList() {
        return severityList;
    }

    public void setSeverityList(List<SeverityV2Do> severityList) {
        this.severityList = severityList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSeveritiesResponse listSeveritiesResponse = (ListSeveritiesResponse) o;
        return Objects.equals(this.show, listSeveritiesResponse.show) &&
            Objects.equals(this.severityList, listSeveritiesResponse.severityList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(show, severityList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSeveritiesResponse {\n");
        sb.append("    show: ").append(toIndentedString(show)).append("\n");
        sb.append("    severityList: ").append(toIndentedString(severityList)).append("\n");
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

