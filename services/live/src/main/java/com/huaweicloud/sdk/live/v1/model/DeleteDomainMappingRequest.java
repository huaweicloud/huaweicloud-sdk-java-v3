package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class DeleteDomainMappingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specify_project")

    private String specifyProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pull_domain")

    private String pullDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_domain")

    private String pushDomain;

    public DeleteDomainMappingRequest withSpecifyProject(String specifyProject) {
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

    public DeleteDomainMappingRequest withPullDomain(String pullDomain) {
        this.pullDomain = pullDomain;
        return this;
    }

    /** 直播播放域名
     * 
     * @return pullDomain */
    public String getPullDomain() {
        return pullDomain;
    }

    public void setPullDomain(String pullDomain) {
        this.pullDomain = pullDomain;
    }

    public DeleteDomainMappingRequest withPushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
        return this;
    }

    /** 直播推流域名
     * 
     * @return pushDomain */
    public String getPushDomain() {
        return pushDomain;
    }

    public void setPushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteDomainMappingRequest deleteDomainMappingRequest = (DeleteDomainMappingRequest) o;
        return Objects.equals(this.specifyProject, deleteDomainMappingRequest.specifyProject)
            && Objects.equals(this.pullDomain, deleteDomainMappingRequest.pullDomain)
            && Objects.equals(this.pushDomain, deleteDomainMappingRequest.pushDomain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specifyProject, pullDomain, pushDomain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDomainMappingRequest {\n");
        sb.append("    specifyProject: ").append(toIndentedString(specifyProject)).append("\n");
        sb.append("    pullDomain: ").append(toIndentedString(pullDomain)).append("\n");
        sb.append("    pushDomain: ").append(toIndentedString(pushDomain)).append("\n");
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
