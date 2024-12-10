package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDomainOverviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namspace_num")

    private Long namspaceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_num")

    private Long repoNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_num")

    private Long imageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_space")

    private Double storeSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "downflow_size")

    private Double downflowSize;

    public ShowDomainOverviewResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowDomainOverviewResponse withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 租户名称
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ShowDomainOverviewResponse withNamspaceNum(Long namspaceNum) {
        this.namspaceNum = namspaceNum;
        return this;
    }

    /**
     * 当前租户的命名空间个数
     * @return namspaceNum
     */
    public Long getNamspaceNum() {
        return namspaceNum;
    }

    public void setNamspaceNum(Long namspaceNum) {
        this.namspaceNum = namspaceNum;
    }

    public ShowDomainOverviewResponse withRepoNum(Long repoNum) {
        this.repoNum = repoNum;
        return this;
    }

    /**
     * 当前租户的仓库个数
     * @return repoNum
     */
    public Long getRepoNum() {
        return repoNum;
    }

    public void setRepoNum(Long repoNum) {
        this.repoNum = repoNum;
    }

    public ShowDomainOverviewResponse withImageNum(Long imageNum) {
        this.imageNum = imageNum;
        return this;
    }

    /**
     * 当前租户的镜像个数
     * @return imageNum
     */
    public Long getImageNum() {
        return imageNum;
    }

    public void setImageNum(Long imageNum) {
        this.imageNum = imageNum;
    }

    public ShowDomainOverviewResponse withStoreSpace(Double storeSpace) {
        this.storeSpace = storeSpace;
        return this;
    }

    /**
     * 当前租户存储大小
     * @return storeSpace
     */
    public Double getStoreSpace() {
        return storeSpace;
    }

    public void setStoreSpace(Double storeSpace) {
        this.storeSpace = storeSpace;
    }

    public ShowDomainOverviewResponse withDownflowSize(Double downflowSize) {
        this.downflowSize = downflowSize;
        return this;
    }

    /**
     * 当前租户下载流量大小
     * @return downflowSize
     */
    public Double getDownflowSize() {
        return downflowSize;
    }

    public void setDownflowSize(Double downflowSize) {
        this.downflowSize = downflowSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDomainOverviewResponse that = (ShowDomainOverviewResponse) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.namspaceNum, that.namspaceNum) && Objects.equals(this.repoNum, that.repoNum)
            && Objects.equals(this.imageNum, that.imageNum) && Objects.equals(this.storeSpace, that.storeSpace)
            && Objects.equals(this.downflowSize, that.downflowSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, domainName, namspaceNum, repoNum, imageNum, storeSpace, downflowSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainOverviewResponse {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    namspaceNum: ").append(toIndentedString(namspaceNum)).append("\n");
        sb.append("    repoNum: ").append(toIndentedString(repoNum)).append("\n");
        sb.append("    imageNum: ").append(toIndentedString(imageNum)).append("\n");
        sb.append("    storeSpace: ").append(toIndentedString(storeSpace)).append("\n");
        sb.append("    downflowSize: ").append(toIndentedString(downflowSize)).append("\n");
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
