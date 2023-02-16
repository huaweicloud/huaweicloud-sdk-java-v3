package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListDatastoresResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="versions")
    
    
    private List<String> versions = null;
    
    public ListDatastoresResponse withVersions(List<String> versions) {
        this.versions = versions;
        return this;
    }

    
    public ListDatastoresResponse addVersionsItem(String versionsItem) {
        if(this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public ListDatastoresResponse withVersions(Consumer<List<String>> versionsSetter) {
        if(this.versions == null) {
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * 数据库版本号。
     * @return versions
     */
    public List<String> getVersions() {
        return versions;
    }

    public void setVersions(List<String> versions) {
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
        ListDatastoresResponse listDatastoresResponse = (ListDatastoresResponse) o;
        return Objects.equals(this.versions, listDatastoresResponse.versions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(versions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatastoresResponse {\n");
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

