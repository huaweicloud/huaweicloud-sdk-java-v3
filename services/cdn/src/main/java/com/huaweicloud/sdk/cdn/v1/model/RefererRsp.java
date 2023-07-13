package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RefererRsp
 */
public class RefererRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referer_type")

    private Integer refererType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referer_list")

    private String refererList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_empty")

    private Boolean includeEmpty;

    public RefererRsp withRefererType(Integer refererType) {
        this.refererType = refererType;
        return this;
    }

    /**
     * Referer类型。取值：0代表不设置Referer过滤；1代表黑名单；2代表白名单。默认取值为0。
     * @return refererType
     */
    public Integer getRefererType() {
        return refererType;
    }

    public void setRefererType(Integer refererType) {
        this.refererType = refererType;
    }

    public RefererRsp withRefererList(String refererList) {
        this.refererList = refererList;
        return this;
    }

    /**
     * ：配置的referer地址。
     * @return refererList
     */
    public String getRefererList() {
        return refererList;
    }

    public void setRefererList(String refererList) {
        this.refererList = refererList;
    }

    public RefererRsp withIncludeEmpty(Boolean includeEmpty) {
        this.includeEmpty = includeEmpty;
        return this;
    }

    /**
     * 是否包含空Referer。如果是黑名单并开启该选项，则表示无referer不允许访问。如果是白名单并开启该选项，则表示无referer允许访问。默认不包含,true：包含，false：不包含。
     * @return includeEmpty
     */
    public Boolean getIncludeEmpty() {
        return includeEmpty;
    }

    public void setIncludeEmpty(Boolean includeEmpty) {
        this.includeEmpty = includeEmpty;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RefererRsp that = (RefererRsp) obj;
        return Objects.equals(this.refererType, that.refererType) && Objects.equals(this.refererList, that.refererList)
            && Objects.equals(this.includeEmpty, that.includeEmpty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refererType, refererList, includeEmpty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RefererRsp {\n");
        sb.append("    refererType: ").append(toIndentedString(refererType)).append("\n");
        sb.append("    refererList: ").append(toIndentedString(refererList)).append("\n");
        sb.append("    includeEmpty: ").append(toIndentedString(includeEmpty)).append("\n");
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
