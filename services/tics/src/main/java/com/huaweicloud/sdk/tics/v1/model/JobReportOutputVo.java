package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * JobReportOutputVo
 */
public class JobReportOutputVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext")

    private String ext;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_storage_agent_name")

    private String resultStorageAgentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_storage_domain_alias")

    private String resultStorageDomainAlias;

    public JobReportOutputVo withExt(String ext) {
        this.ext = ext;
        return this;
    }

    /**
     * 参数等额外信息
     * @return ext
     */
    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public JobReportOutputVo withResultStorageAgentName(String resultStorageAgentName) {
        this.resultStorageAgentName = resultStorageAgentName;
        return this;
    }

    /**
     * 结果存储agent名称
     * @return resultStorageAgentName
     */
    public String getResultStorageAgentName() {
        return resultStorageAgentName;
    }

    public void setResultStorageAgentName(String resultStorageAgentName) {
        this.resultStorageAgentName = resultStorageAgentName;
    }

    public JobReportOutputVo withResultStorageDomainAlias(String resultStorageDomainAlias) {
        this.resultStorageDomainAlias = resultStorageDomainAlias;
        return this;
    }

    /**
     * 结果存储方别名
     * @return resultStorageDomainAlias
     */
    public String getResultStorageDomainAlias() {
        return resultStorageDomainAlias;
    }

    public void setResultStorageDomainAlias(String resultStorageDomainAlias) {
        this.resultStorageDomainAlias = resultStorageDomainAlias;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobReportOutputVo that = (JobReportOutputVo) obj;
        return Objects.equals(this.ext, that.ext)
            && Objects.equals(this.resultStorageAgentName, that.resultStorageAgentName)
            && Objects.equals(this.resultStorageDomainAlias, that.resultStorageDomainAlias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ext, resultStorageAgentName, resultStorageDomainAlias);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobReportOutputVo {\n");
        sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
        sb.append("    resultStorageAgentName: ").append(toIndentedString(resultStorageAgentName)).append("\n");
        sb.append("    resultStorageDomainAlias: ").append(toIndentedString(resultStorageDomainAlias)).append("\n");
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
