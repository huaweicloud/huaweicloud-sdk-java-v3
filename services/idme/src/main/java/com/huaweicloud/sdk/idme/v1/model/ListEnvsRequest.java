package com.huaweicloud.sdk.idme.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListEnvsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_num")

    private Long pageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Long pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_types")

    private String envTypes;

    public ListEnvsRequest withPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * 页码
     * @return pageNum
     */
    public Long getPageNum() {
        return pageNum;
    }

    public void setPageNum(Long pageNum) {
        this.pageNum = pageNum;
    }

    public ListEnvsRequest withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 当前页大小
     * @return pageSize
     */
    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public ListEnvsRequest withEnvTypes(String envTypes) {
        this.envTypes = envTypes;
        return this;
    }

    /**
     * 云服务类型 - STUDIO：设计态服务。 - CLOUD_BASIC：公有云基础版数据建模引擎。 - CLOUD_TRIAL：公有云体验版数据建模引擎。 - EDGE_BASIC：边缘云基础版数据建模引擎。 - CLOUD_LINKX：公有云基础版数字主线引擎。 - EDGE_LINKX：边缘云基础版数字主线引擎。
     * @return envTypes
     */
    public String getEnvTypes() {
        return envTypes;
    }

    public void setEnvTypes(String envTypes) {
        this.envTypes = envTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEnvsRequest that = (ListEnvsRequest) obj;
        return Objects.equals(this.pageNum, that.pageNum) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.envTypes, that.envTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageNum, pageSize, envTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnvsRequest {\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    envTypes: ").append(toIndentedString(envTypes)).append("\n");
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
