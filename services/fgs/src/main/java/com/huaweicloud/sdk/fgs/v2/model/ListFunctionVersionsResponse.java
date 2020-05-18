package com.huaweicloud.sdk.fgs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.fgs.v2.model.ListFunctionVersionResult;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListFunctionVersionsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="versions")
    
    private List<ListFunctionVersionResult> versions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="next_marker")
    
    private String nextMarker;

    public ListFunctionVersionsResponse withVersions(List<ListFunctionVersionResult> versions) {
        this.versions = versions;
        return this;
    }

    
    public ListFunctionVersionsResponse addVersionsItem(ListFunctionVersionResult versionsItem) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public ListFunctionVersionsResponse withVersions(Consumer<List<ListFunctionVersionResult>> versionsSetter) {
        if(this.versions == null ){
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * 版本列表
     * @return versions
     */
    public List<ListFunctionVersionResult> getVersions() {
        return versions;
    }

    public void setVersions(List<ListFunctionVersionResult> versions) {
        this.versions = versions;
    }

    public ListFunctionVersionsResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    


    /**
     * 下一次记录位置
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFunctionVersionsResponse listFunctionVersionsResponse = (ListFunctionVersionsResponse) o;
        return Objects.equals(this.versions, listFunctionVersionsResponse.versions) &&
            Objects.equals(this.nextMarker, listFunctionVersionsResponse.nextMarker);
    }
    @Override
    public int hashCode() {
        return Objects.hash(versions, nextMarker);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionVersionsResponse {\n");
            sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
            sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
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

