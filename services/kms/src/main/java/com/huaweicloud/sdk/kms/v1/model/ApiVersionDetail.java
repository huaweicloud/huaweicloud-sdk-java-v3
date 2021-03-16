package com.huaweicloud.sdk.kms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kms.v1.model.ApiLink;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ApiVersionDetail
 */
public class ApiVersionDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private List<ApiLink> links = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    
    private String updated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_version")
    
    private String minVersion;

    public ApiVersionDetail withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 版本ID（版本号），如“v1.0”。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ApiVersionDetail withLinks(List<ApiLink> links) {
        this.links = links;
        return this;
    }

    
    public ApiVersionDetail addLinksItem(ApiLink linksItem) {
        this.links.add(linksItem);
        return this;
    }

    public ApiVersionDetail withLinks(Consumer<List<ApiLink>> linksSetter) {
        if(this.links == null ){
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * JSON对象，详情请参见links字段数据结构说明。
     * @return links
     */
    public List<ApiLink> getLinks() {
        return links;
    }

    public void setLinks(List<ApiLink> links) {
        this.links = links;
    }

    

    public ApiVersionDetail withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 若该版本API支持微版本，则填支持的最大微版本号，如果不支持微版本，则返回空字符串。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public ApiVersionDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 版本状态，包含如下3种：  - CURRENT：表示该版本为主推版本。  - SUPPORTED：表示为老版本，但是现在还继续支持。  - DEPRECATED：表示为废弃版本，存在后续删除的可能。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public ApiVersionDetail withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 版本发布时间，要求用UTC时间表示。如v1.发布的时间2014-06-28T12:20:21Z。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    

    public ApiVersionDetail withMinVersion(String minVersion) {
        this.minVersion = minVersion;
        return this;
    }

    


    /**
     * 若该版本API 支持微版本，则填支持的最小微版本号，如果不支持微版本，则返回空字符串。
     * @return minVersion
     */
    public String getMinVersion() {
        return minVersion;
    }

    public void setMinVersion(String minVersion) {
        this.minVersion = minVersion;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiVersionDetail apiVersionDetail = (ApiVersionDetail) o;
        return Objects.equals(this.id, apiVersionDetail.id) &&
            Objects.equals(this.links, apiVersionDetail.links) &&
            Objects.equals(this.version, apiVersionDetail.version) &&
            Objects.equals(this.status, apiVersionDetail.status) &&
            Objects.equals(this.updated, apiVersionDetail.updated) &&
            Objects.equals(this.minVersion, apiVersionDetail.minVersion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, links, version, status, updated, minVersion);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiVersionDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    minVersion: ").append(toIndentedString(minVersion)).append("\n");
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

