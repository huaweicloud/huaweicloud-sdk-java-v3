package com.huaweicloud.sdk.kms.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kms.v1.model.ApiVersionDetail;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowVersionsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="versions")
    
    private List<ApiVersionDetail> versions = null;
    
    public ShowVersionsResponse withVersions(List<ApiVersionDetail> versions) {
        this.versions = versions;
        return this;
    }

    
    public ShowVersionsResponse addVersionsItem(ApiVersionDetail versionsItem) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public ShowVersionsResponse withVersions(Consumer<List<ApiVersionDetail>> versionsSetter) {
        if(this.versions == null ){
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * 描述version 相关对象的列表，详情请参见 versions字段数据结构说明。
     * @return versions
     */
    public List<ApiVersionDetail> getVersions() {
        return versions;
    }

    public void setVersions(List<ApiVersionDetail> versions) {
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
        ShowVersionsResponse showVersionsResponse = (ShowVersionsResponse) o;
        return Objects.equals(this.versions, showVersionsResponse.versions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(versions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVersionsResponse {\n");
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

