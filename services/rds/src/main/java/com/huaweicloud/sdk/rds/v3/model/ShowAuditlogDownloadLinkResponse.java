package com.huaweicloud.sdk.rds.v3.model;




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
public class ShowAuditlogDownloadLinkResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private List<String> links = null;
    
    public ShowAuditlogDownloadLinkResponse withLinks(List<String> links) {
        this.links = links;
        return this;
    }

    
    public ShowAuditlogDownloadLinkResponse addLinksItem(String linksItem) {
        this.links.add(linksItem);
        return this;
    }

    public ShowAuditlogDownloadLinkResponse withLinks(Consumer<List<String>> linksSetter) {
        if(this.links == null ){
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * 审计日志下载链接列表。
     * @return links
     */
    public List<String> getLinks() {
        return links;
    }

    public void setLinks(List<String> links) {
        this.links = links;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAuditlogDownloadLinkResponse showAuditlogDownloadLinkResponse = (ShowAuditlogDownloadLinkResponse) o;
        return Objects.equals(this.links, showAuditlogDownloadLinkResponse.links);
    }
    @Override
    public int hashCode() {
        return Objects.hash(links);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAuditlogDownloadLinkResponse {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

