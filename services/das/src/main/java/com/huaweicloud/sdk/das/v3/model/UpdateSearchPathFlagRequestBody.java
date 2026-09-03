package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设置searchpath开关请求体
 */
public class UpdateSearchPathFlagRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_path_flag")

    private Boolean searchPathFlag;

    public UpdateSearchPathFlagRequestBody withSearchPathFlag(Boolean searchPathFlag) {
        this.searchPathFlag = searchPathFlag;
        return this;
    }

    /**
     * 开关标志
     * @return searchPathFlag
     */
    public Boolean getSearchPathFlag() {
        return searchPathFlag;
    }

    public void setSearchPathFlag(Boolean searchPathFlag) {
        this.searchPathFlag = searchPathFlag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSearchPathFlagRequestBody that = (UpdateSearchPathFlagRequestBody) obj;
        return Objects.equals(this.searchPathFlag, that.searchPathFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchPathFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSearchPathFlagRequestBody {\n");
        sb.append("    searchPathFlag: ").append(toIndentedString(searchPathFlag)).append("\n");
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
