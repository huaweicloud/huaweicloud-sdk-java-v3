package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListInternetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_infos")

    private List<InternetInfo> internetInfos = null;

    public ListInternetResponse withInternetInfos(List<InternetInfo> internetInfos) {
        this.internetInfos = internetInfos;
        return this;
    }

    public ListInternetResponse addInternetInfosItem(InternetInfo internetInfosItem) {
        if (this.internetInfos == null) {
            this.internetInfos = new ArrayList<>();
        }
        this.internetInfos.add(internetInfosItem);
        return this;
    }

    public ListInternetResponse withInternetInfos(Consumer<List<InternetInfo>> internetInfosSetter) {
        if (this.internetInfos == null) {
            this.internetInfos = new ArrayList<>();
        }
        internetInfosSetter.accept(this.internetInfos);
        return this;
    }

    /**
     * 上网信息。
     * @return internetInfos
     */
    public List<InternetInfo> getInternetInfos() {
        return internetInfos;
    }

    public void setInternetInfos(List<InternetInfo> internetInfos) {
        this.internetInfos = internetInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInternetResponse that = (ListInternetResponse) obj;
        return Objects.equals(this.internetInfos, that.internetInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(internetInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInternetResponse {\n");
        sb.append("    internetInfos: ").append(toIndentedString(internetInfos)).append("\n");
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
