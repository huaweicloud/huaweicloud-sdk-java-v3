package com.huaweicloud.sdk.das.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.das.v3.model.ApiVersion;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListApiVersionsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="versions")
    
    private List<ApiVersion> versions = null;
    
    public ListApiVersionsResponse withVersions(List<ApiVersion> versions) {
        this.versions = versions;
        return this;
    }

    
    public ListApiVersionsResponse addVersionsItem(ApiVersion versionsItem) {
        this.versions.add(versionsItem);
        return this;
    }

    public ListApiVersionsResponse withVersions(Consumer<List<ApiVersion>> versionsSetter) {
        if(this.versions == null ){
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * API版本详细信息列表。
     * @return versions
     */
    public List<ApiVersion> getVersions() {
        return versions;
    }

    public void setVersions(List<ApiVersion> versions) {
        this.versions = versions;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApiVersionsResponse listApiVersionsResponse = (ListApiVersionsResponse) o;
        return Objects.equals(this.versions, listApiVersionsResponse.versions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(versions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApiVersionsResponse {\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

