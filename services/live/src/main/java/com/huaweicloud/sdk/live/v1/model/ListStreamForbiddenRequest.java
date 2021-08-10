package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListStreamForbiddenRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specify_project")

    private String specifyProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    public ListStreamForbiddenRequest withSpecifyProject(String specifyProject) {
        this.specifyProject = specifyProject;
        return this;
    }

    /** op账号需要携带的特定project_id，当使用op账号时该值为所操作租户的project_id
     * 
     * @return specifyProject */
    public String getSpecifyProject() {
        return specifyProject;
    }

    public void setSpecifyProject(String specifyProject) {
        this.specifyProject = specifyProject;
    }

    public ListStreamForbiddenRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /** 播放或推流域名
     * 
     * @return domain */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ListStreamForbiddenRequest withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /** 应用名称，不指定则查询domain下所有应用的禁止直播推流信息
     * 
     * @return appName */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ListStreamForbiddenRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /** 流名称
     * 
     * @return streamName */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public ListStreamForbiddenRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /** 分页编号。 默认为0。 minimum: 0
     * 
     * @return page */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListStreamForbiddenRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    /** 每页记录数。 取值范围：1-100。 默认为10。 minimum: 1 maximum: 100
     * 
     * @return size */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStreamForbiddenRequest listStreamForbiddenRequest = (ListStreamForbiddenRequest) o;
        return Objects.equals(this.specifyProject, listStreamForbiddenRequest.specifyProject)
            && Objects.equals(this.domain, listStreamForbiddenRequest.domain)
            && Objects.equals(this.appName, listStreamForbiddenRequest.appName)
            && Objects.equals(this.streamName, listStreamForbiddenRequest.streamName)
            && Objects.equals(this.page, listStreamForbiddenRequest.page)
            && Objects.equals(this.size, listStreamForbiddenRequest.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specifyProject, domain, appName, streamName, page, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStreamForbiddenRequest {\n");
        sb.append("    specifyProject: ").append(toIndentedString(specifyProject)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
