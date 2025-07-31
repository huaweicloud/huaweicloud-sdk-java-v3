package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCompareProgressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_info")

    private QueryCompareJobProgressRespFullInfo fullInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incre_info")

    private QueryCompareJobProgressRespIncreInfo increInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_info")

    private QueryCompareJobProgressRespGlobalInfo globalInfo;

    public ShowCompareProgressResponse withFullInfo(QueryCompareJobProgressRespFullInfo fullInfo) {
        this.fullInfo = fullInfo;
        return this;
    }

    public ShowCompareProgressResponse withFullInfo(Consumer<QueryCompareJobProgressRespFullInfo> fullInfoSetter) {
        if (this.fullInfo == null) {
            this.fullInfo = new QueryCompareJobProgressRespFullInfo();
            fullInfoSetter.accept(this.fullInfo);
        }

        return this;
    }

    /**
     * Get fullInfo
     * @return fullInfo
     */
    public QueryCompareJobProgressRespFullInfo getFullInfo() {
        return fullInfo;
    }

    public void setFullInfo(QueryCompareJobProgressRespFullInfo fullInfo) {
        this.fullInfo = fullInfo;
    }

    public ShowCompareProgressResponse withIncreInfo(QueryCompareJobProgressRespIncreInfo increInfo) {
        this.increInfo = increInfo;
        return this;
    }

    public ShowCompareProgressResponse withIncreInfo(Consumer<QueryCompareJobProgressRespIncreInfo> increInfoSetter) {
        if (this.increInfo == null) {
            this.increInfo = new QueryCompareJobProgressRespIncreInfo();
            increInfoSetter.accept(this.increInfo);
        }

        return this;
    }

    /**
     * Get increInfo
     * @return increInfo
     */
    public QueryCompareJobProgressRespIncreInfo getIncreInfo() {
        return increInfo;
    }

    public void setIncreInfo(QueryCompareJobProgressRespIncreInfo increInfo) {
        this.increInfo = increInfo;
    }

    public ShowCompareProgressResponse withGlobalInfo(QueryCompareJobProgressRespGlobalInfo globalInfo) {
        this.globalInfo = globalInfo;
        return this;
    }

    public ShowCompareProgressResponse withGlobalInfo(
        Consumer<QueryCompareJobProgressRespGlobalInfo> globalInfoSetter) {
        if (this.globalInfo == null) {
            this.globalInfo = new QueryCompareJobProgressRespGlobalInfo();
            globalInfoSetter.accept(this.globalInfo);
        }

        return this;
    }

    /**
     * Get globalInfo
     * @return globalInfo
     */
    public QueryCompareJobProgressRespGlobalInfo getGlobalInfo() {
        return globalInfo;
    }

    public void setGlobalInfo(QueryCompareJobProgressRespGlobalInfo globalInfo) {
        this.globalInfo = globalInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCompareProgressResponse that = (ShowCompareProgressResponse) obj;
        return Objects.equals(this.fullInfo, that.fullInfo) && Objects.equals(this.increInfo, that.increInfo)
            && Objects.equals(this.globalInfo, that.globalInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullInfo, increInfo, globalInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCompareProgressResponse {\n");
        sb.append("    fullInfo: ").append(toIndentedString(fullInfo)).append("\n");
        sb.append("    increInfo: ").append(toIndentedString(increInfo)).append("\n");
        sb.append("    globalInfo: ").append(toIndentedString(globalInfo)).append("\n");
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
