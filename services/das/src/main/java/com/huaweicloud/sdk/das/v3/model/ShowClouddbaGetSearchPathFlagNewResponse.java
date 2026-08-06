package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowClouddbaGetSearchPathFlagNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_path_flag")

    private Boolean searchPathFlag;

    public ShowClouddbaGetSearchPathFlagNewResponse withSearchPathFlag(Boolean searchPathFlag) {
        this.searchPathFlag = searchPathFlag;
        return this;
    }

    /**
     * 搜索路径标志，true表示开启，false表示关闭
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
        ShowClouddbaGetSearchPathFlagNewResponse that = (ShowClouddbaGetSearchPathFlagNewResponse) obj;
        return Objects.equals(this.searchPathFlag, that.searchPathFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchPathFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClouddbaGetSearchPathFlagNewResponse {\n");
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
